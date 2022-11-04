package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.javarosa.core.model.instance.TreeReference;
import org.odk.collect.android.utilities.WebUtils;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpStatus;
import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.HeaderConstants;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateParseException;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
@Immutable
/* loaded from: classes.dex */
class ResponseCachingPolicy {
    private static final Set<Integer> cacheableStatuses = new HashSet(Arrays.asList(Integer.valueOf((int) HttpStatus.SC_OK), Integer.valueOf((int) HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION), Integer.valueOf((int) HttpStatus.SC_MULTIPLE_CHOICES), Integer.valueOf((int) HttpStatus.SC_MOVED_PERMANENTLY), Integer.valueOf((int) HttpStatus.SC_GONE)));
    private static final Set<Integer> uncacheableStatuses = new HashSet(Arrays.asList(Integer.valueOf((int) HttpStatus.SC_PARTIAL_CONTENT), Integer.valueOf((int) HttpStatus.SC_SEE_OTHER)));
    private final Log log = LogFactory.getLog(getClass());
    private final long maxObjectSizeBytes;
    private final boolean sharedCache;

    public ResponseCachingPolicy(long maxObjectSizeBytes, boolean sharedCache) {
        this.maxObjectSizeBytes = maxObjectSizeBytes;
        this.sharedCache = sharedCache;
    }

    public boolean isResponseCacheable(String httpMethod, HttpResponse response) {
        boolean cacheable = false;
        if (!"GET".equals(httpMethod)) {
            this.log.debug("Response was not cacheable.");
            return false;
        }
        int status = response.getStatusLine().getStatusCode();
        if (cacheableStatuses.contains(Integer.valueOf(status))) {
            cacheable = true;
        } else if (uncacheableStatuses.contains(Integer.valueOf(status)) || unknownStatusCode(status)) {
            return false;
        }
        Header contentLength = response.getFirstHeader("Content-Length");
        if (contentLength != null) {
            int contentLengthValue = Integer.parseInt(contentLength.getValue());
            if (contentLengthValue > this.maxObjectSizeBytes) {
                return false;
            }
        }
        Header[] ageHeaders = response.getHeaders("Age");
        if (ageHeaders.length > 1) {
            return false;
        }
        Header[] expiresHeaders = response.getHeaders("Expires");
        if (expiresHeaders.length > 1) {
            return false;
        }
        Header[] dateHeaders = response.getHeaders("Date");
        if (dateHeaders.length != 1) {
            return false;
        }
        try {
            DateUtils.parseDate(dateHeaders[0].getValue());
            Header[] arr$ = response.getHeaders("Vary");
            for (Header varyHdr : arr$) {
                HeaderElement[] arr$2 = varyHdr.getElements();
                for (HeaderElement elem : arr$2) {
                    if (TreeReference.NAME_WILDCARD.equals(elem.getName())) {
                        return false;
                    }
                }
            }
            if (isExplicitlyNonCacheable(response)) {
                return false;
            }
            return cacheable || isExplicitlyCacheable(response);
        } catch (DateParseException e) {
            return false;
        }
    }

    private boolean unknownStatusCode(int status) {
        if (status < 100 || status > 101) {
            if (status >= 200 && status <= 206) {
                return false;
            }
            if (status >= 300 && status <= 307) {
                return false;
            }
            if (status >= 400 && status <= 417) {
                return false;
            }
            return status < 500 || status > 505;
        }
        return false;
    }

    protected boolean isExplicitlyNonCacheable(HttpResponse response) {
        Header[] cacheControlHeaders = response.getHeaders("Cache-Control");
        for (Header header : cacheControlHeaders) {
            HeaderElement[] arr$ = header.getElements();
            for (HeaderElement elem : arr$) {
                if (HeaderConstants.CACHE_CONTROL_NO_STORE.equals(elem.getName()) || HeaderConstants.CACHE_CONTROL_NO_CACHE.equals(elem.getName()) || (this.sharedCache && HeaderConstants.PRIVATE.equals(elem.getName()))) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean hasCacheControlParameterFrom(HttpMessage msg, String[] params) {
        Header[] cacheControlHeaders = msg.getHeaders("Cache-Control");
        for (Header header : cacheControlHeaders) {
            HeaderElement[] arr$ = header.getElements();
            for (HeaderElement elem : arr$) {
                for (String param : params) {
                    if (param.equalsIgnoreCase(elem.getName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    protected boolean isExplicitlyCacheable(HttpResponse response) {
        if (response.getFirstHeader("Expires") != null) {
            return true;
        }
        String[] cacheableParams = {"max-age", "s-maxage", HeaderConstants.CACHE_CONTROL_MUST_REVALIDATE, HeaderConstants.CACHE_CONTROL_PROXY_REVALIDATE, HeaderConstants.PUBLIC};
        return hasCacheControlParameterFrom(response, cacheableParams);
    }

    public boolean isResponseCacheable(HttpRequest request, HttpResponse response) {
        Header[] authNHeaders;
        if (requestProtocolGreaterThanAccepted(request)) {
            this.log.debug("Response was not cacheable.");
            return false;
        }
        String[] uncacheableRequestDirectives = {HeaderConstants.CACHE_CONTROL_NO_STORE};
        if (hasCacheControlParameterFrom(request, uncacheableRequestDirectives)) {
            return false;
        }
        if (request.getRequestLine().getUri().contains("?") && (!isExplicitlyCacheable(response) || from1_0Origin(response))) {
            this.log.debug("Response was not cacheable.");
            return false;
        } else if (expiresHeaderLessOrEqualToDateHeaderAndNoCacheControl(response)) {
            return false;
        } else {
            if (this.sharedCache && (authNHeaders = request.getHeaders("Authorization")) != null && authNHeaders.length > 0) {
                String[] authCacheableParams = {"s-maxage", HeaderConstants.CACHE_CONTROL_MUST_REVALIDATE, HeaderConstants.PUBLIC};
                return hasCacheControlParameterFrom(response, authCacheableParams);
            }
            String method = request.getRequestLine().getMethod();
            return isResponseCacheable(method, response);
        }
    }

    private boolean expiresHeaderLessOrEqualToDateHeaderAndNoCacheControl(HttpResponse response) {
        if (response.getFirstHeader("Cache-Control") != null) {
            return false;
        }
        Header expiresHdr = response.getFirstHeader("Expires");
        Header dateHdr = response.getFirstHeader("Date");
        if (expiresHdr == null || dateHdr == null) {
            return false;
        }
        try {
            Date expires = DateUtils.parseDate(expiresHdr.getValue());
            Date date = DateUtils.parseDate(dateHdr.getValue());
            if (!expires.equals(date)) {
                if (!expires.before(date)) {
                    return false;
                }
            }
            return true;
        } catch (DateParseException e) {
            return false;
        }
    }

    private boolean from1_0Origin(HttpResponse response) {
        Header via = response.getFirstHeader("Via");
        if (via != null) {
            HeaderElement[] arr$ = via.getElements();
            int len$ = arr$.length;
            if (0 < len$) {
                HeaderElement elt = arr$[0];
                String proto = elt.toString().split("\\s")[0];
                if (proto.contains("/")) {
                    return proto.equals("HTTP/1.0");
                }
                return proto.equals(WebUtils.OPEN_ROSA_VERSION);
            }
        }
        return HttpVersion.HTTP_1_0.equals(response.getProtocolVersion());
    }

    private boolean requestProtocolGreaterThanAccepted(HttpRequest req) {
        return req.getProtocolVersion().compareToVersion(HttpVersion.HTTP_1_1) > 0;
    }
}
