package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest;
import org.opendatakit.httpclientandroidlib.HttpHeaders;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.ClientProtocolException;
import org.opendatakit.httpclientandroidlib.impl.client.RequestWrapper;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateParseException;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
import org.opendatakit.httpclientandroidlib.message.BasicHeader;
import org.opendatakit.httpclientandroidlib.protocol.HTTP;
import org.opendatakit.httpclientandroidlib.util.EntityUtils;
@Immutable
/* loaded from: classes.dex */
class ResponseProtocolCompliance {
    private static final String UNEXPECTED_100_CONTINUE = "The incoming request did not contain a 100-continue header, but the response was a Status 100, continue.";
    private static final String UNEXPECTED_PARTIAL_CONTENT = "partial content was returned for a request that did not ask for it";

    public void ensureProtocolCompliance(HttpRequest request, HttpResponse response) throws IOException {
        if (backendResponseMustNotHaveBody(request, response)) {
            consumeBody(response);
            response.setEntity(null);
        }
        requestDidNotExpect100ContinueButResponseIsOne(request, response);
        transferEncodingIsNotReturnedTo1_0Client(request, response);
        ensurePartialContentIsNotSentToAClientThatDidNotRequestIt(request, response);
        ensure200ForOPTIONSRequestWithNoBodyHasContentLengthZero(request, response);
        ensure206ContainsDateHeader(response);
        ensure304DoesNotContainExtraEntityHeaders(response);
        identityIsNotUsedInContentEncoding(response);
        warningsWithNonMatchingWarnDatesAreRemoved(response);
    }

    private void consumeBody(HttpResponse response) throws IOException {
        HttpEntity body = response.getEntity();
        if (body != null) {
            EntityUtils.consume(body);
        }
    }

    private void warningsWithNonMatchingWarnDatesAreRemoved(HttpResponse response) {
        Header[] warningHeaders;
        Date responseDate = null;
        try {
            responseDate = DateUtils.parseDate(response.getFirstHeader("Date").getValue());
        } catch (DateParseException e) {
        }
        if (responseDate != null && (warningHeaders = response.getHeaders("Warning")) != null && warningHeaders.length != 0) {
            List<Header> newWarningHeaders = new ArrayList<>();
            boolean modified = false;
            for (Header h : warningHeaders) {
                WarningValue[] arr$ = WarningValue.getWarningValues(h);
                for (WarningValue wv : arr$) {
                    Date warnDate = wv.getWarnDate();
                    if (warnDate == null || warnDate.equals(responseDate)) {
                        newWarningHeaders.add(new BasicHeader("Warning", wv.toString()));
                    } else {
                        modified = true;
                    }
                }
            }
            if (modified) {
                response.removeHeaders("Warning");
                for (Header h2 : newWarningHeaders) {
                    response.addHeader(h2);
                }
            }
        }
    }

    private void identityIsNotUsedInContentEncoding(HttpResponse response) {
        Header[] hdrs = response.getHeaders("Content-Encoding");
        if (hdrs != null && hdrs.length != 0) {
            List<Header> newHeaders = new ArrayList<>();
            boolean modified = false;
            for (Header h : hdrs) {
                StringBuilder buf = new StringBuilder();
                boolean first = true;
                HeaderElement[] arr$ = h.getElements();
                for (HeaderElement elt : arr$) {
                    if (HTTP.IDENTITY_CODING.equalsIgnoreCase(elt.getName())) {
                        modified = true;
                    } else {
                        if (!first) {
                            buf.append(",");
                        }
                        buf.append(elt.toString());
                        first = false;
                    }
                }
                String newHeaderValue = buf.toString();
                if (!"".equals(newHeaderValue)) {
                    newHeaders.add(new BasicHeader("Content-Encoding", newHeaderValue));
                }
            }
            if (modified) {
                response.removeHeaders("Content-Encoding");
                for (Header h2 : newHeaders) {
                    response.addHeader(h2);
                }
            }
        }
    }

    private void ensure206ContainsDateHeader(HttpResponse response) {
        if (response.getFirstHeader("Date") == null) {
            response.addHeader("Date", DateUtils.formatDate(new Date()));
        }
    }

    private void ensurePartialContentIsNotSentToAClientThatDidNotRequestIt(HttpRequest request, HttpResponse response) throws IOException {
        if (request.getFirstHeader("Range") != null || response.getStatusLine().getStatusCode() != 206) {
            return;
        }
        consumeBody(response);
        throw new ClientProtocolException(UNEXPECTED_PARTIAL_CONTENT);
    }

    private void ensure200ForOPTIONSRequestWithNoBodyHasContentLengthZero(HttpRequest request, HttpResponse response) {
        if (request.getRequestLine().getMethod().equalsIgnoreCase("OPTIONS") && response.getStatusLine().getStatusCode() == 200 && response.getFirstHeader("Content-Length") == null) {
            response.addHeader("Content-Length", "0");
        }
    }

    private void ensure304DoesNotContainExtraEntityHeaders(HttpResponse response) {
        String[] disallowedEntityHeaders = {"Allow", "Content-Encoding", HttpHeaders.CONTENT_LANGUAGE, "Content-Length", HttpHeaders.CONTENT_MD5, "Content-Range", "Content-Type", "Last-Modified"};
        if (response.getStatusLine().getStatusCode() == 304) {
            for (String hdr : disallowedEntityHeaders) {
                response.removeHeaders(hdr);
            }
        }
    }

    private boolean backendResponseMustNotHaveBody(HttpRequest request, HttpResponse backendResponse) {
        return "HEAD".equals(request.getRequestLine().getMethod()) || backendResponse.getStatusLine().getStatusCode() == 204 || backendResponse.getStatusLine().getStatusCode() == 205 || backendResponse.getStatusLine().getStatusCode() == 304;
    }

    private void requestDidNotExpect100ContinueButResponseIsOne(HttpRequest request, HttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() == 100) {
            HttpRequest originalRequest = requestWasWrapped(request) ? ((RequestWrapper) request).getOriginal() : request;
            if ((originalRequest instanceof HttpEntityEnclosingRequest) && ((HttpEntityEnclosingRequest) originalRequest).expectContinue()) {
                return;
            }
            consumeBody(response);
            throw new ClientProtocolException(UNEXPECTED_100_CONTINUE);
        }
    }

    private void transferEncodingIsNotReturnedTo1_0Client(HttpRequest request, HttpResponse response) {
        if (requestWasWrapped(request)) {
            ProtocolVersion originalProtocol = getOriginalRequestProtocol((RequestWrapper) request);
            if (originalProtocol.compareToVersion(HttpVersion.HTTP_1_1) < 0) {
                removeResponseTransferEncoding(response);
            }
        }
    }

    private void removeResponseTransferEncoding(HttpResponse response) {
        response.removeHeaders(HttpHeaders.TE);
        response.removeHeaders("Transfer-Encoding");
    }

    private ProtocolVersion getOriginalRequestProtocol(RequestWrapper request) {
        return request.getOriginal().getProtocolVersion();
    }

    private boolean requestWasWrapped(HttpRequest request) {
        return request instanceof RequestWrapper;
    }
}
