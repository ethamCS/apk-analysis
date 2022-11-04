package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpHeaders;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateParseException;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
@ThreadSafe
/* loaded from: classes.dex */
class CacheInvalidator {
    private final CacheKeyGenerator cacheKeyGenerator;
    private final Log log = LogFactory.getLog(getClass());
    private final HttpCacheStorage storage;

    public CacheInvalidator(CacheKeyGenerator uriExtractor, HttpCacheStorage storage) {
        this.cacheKeyGenerator = uriExtractor;
        this.storage = storage;
    }

    public void flushInvalidatedCacheEntries(HttpHost host, HttpRequest req) {
        if (requestShouldNotBeCached(req)) {
            this.log.debug("Request should not be cached");
            String theUri = this.cacheKeyGenerator.getURI(host, req);
            HttpCacheEntry parent = getEntry(theUri);
            this.log.debug("parent entry: " + parent);
            if (parent != null) {
                for (String variantURI : parent.getVariantMap().values()) {
                    flushEntry(variantURI);
                }
                flushEntry(theUri);
            }
            URL reqURL = getAbsoluteURL(theUri);
            if (reqURL == null) {
                this.log.error("Couldn't transform request into valid URL");
                return;
            }
            Header clHdr = req.getFirstHeader(HttpHeaders.CONTENT_LOCATION);
            if (clHdr != null) {
                String contentLocation = clHdr.getValue();
                if (!flushAbsoluteUriFromSameHost(reqURL, contentLocation)) {
                    flushRelativeUriFromSameHost(reqURL, contentLocation);
                }
            }
            Header lHdr = req.getFirstHeader(HttpHeaders.LOCATION);
            if (lHdr != null) {
                flushAbsoluteUriFromSameHost(reqURL, lHdr.getValue());
            }
        }
    }

    private void flushEntry(String uri) {
        try {
            this.storage.removeEntry(uri);
        } catch (IOException ioe) {
            this.log.warn("unable to flush cache entry", ioe);
        }
    }

    private HttpCacheEntry getEntry(String theUri) {
        try {
            return this.storage.getEntry(theUri);
        } catch (IOException ioe) {
            this.log.warn("could not retrieve entry from storage", ioe);
            return null;
        }
    }

    protected void flushUriIfSameHost(URL requestURL, URL targetURL) {
        URL canonicalTarget = getAbsoluteURL(this.cacheKeyGenerator.canonicalizeUri(targetURL.toString()));
        if (canonicalTarget != null && canonicalTarget.getAuthority().equalsIgnoreCase(requestURL.getAuthority())) {
            flushEntry(canonicalTarget.toString());
        }
    }

    protected void flushRelativeUriFromSameHost(URL reqURL, String relUri) {
        URL relURL = getRelativeURL(reqURL, relUri);
        if (relURL != null) {
            flushUriIfSameHost(reqURL, relURL);
        }
    }

    protected boolean flushAbsoluteUriFromSameHost(URL reqURL, String uri) {
        URL absURL = getAbsoluteURL(uri);
        if (absURL == null) {
            return false;
        }
        flushUriIfSameHost(reqURL, absURL);
        return true;
    }

    private URL getAbsoluteURL(String uri) {
        try {
            URL absURL = new URL(uri);
            return absURL;
        } catch (MalformedURLException e) {
            return null;
        }
    }

    private URL getRelativeURL(URL reqURL, String relUri) {
        try {
            URL relURL = new URL(reqURL, relUri);
            return relURL;
        } catch (MalformedURLException e) {
            return null;
        }
    }

    protected boolean requestShouldNotBeCached(HttpRequest req) {
        String method = req.getRequestLine().getMethod();
        return notGetOrHeadRequest(method);
    }

    private boolean notGetOrHeadRequest(String method) {
        return !"GET".equals(method) && !"HEAD".equals(method);
    }

    public void flushInvalidatedCacheEntries(HttpHost host, HttpRequest request, HttpResponse response) {
        URL reqURL;
        URL canonURL;
        int status = response.getStatusLine().getStatusCode();
        if (status >= 200 && status <= 299 && (reqURL = getAbsoluteURL(this.cacheKeyGenerator.getURI(host, request))) != null && (canonURL = getContentLocationURL(reqURL, response)) != null) {
            String cacheKey = this.cacheKeyGenerator.canonicalizeUri(canonURL.toString());
            HttpCacheEntry entry = getEntry(cacheKey);
            if (entry != null && responseDateNewerThanEntryDate(response, entry) && responseAndEntryEtagsDiffer(response, entry)) {
                flushUriIfSameHost(reqURL, canonURL);
            }
        }
    }

    private URL getContentLocationURL(URL reqURL, HttpResponse response) {
        Header clHeader = response.getFirstHeader(HttpHeaders.CONTENT_LOCATION);
        if (clHeader == null) {
            return null;
        }
        String contentLocation = clHeader.getValue();
        URL canonURL = getAbsoluteURL(contentLocation);
        return canonURL == null ? getRelativeURL(reqURL, contentLocation) : canonURL;
    }

    private boolean responseAndEntryEtagsDiffer(HttpResponse response, HttpCacheEntry entry) {
        Header entryEtag = entry.getFirstHeader("ETag");
        Header responseEtag = response.getFirstHeader("ETag");
        return (entryEtag == null || responseEtag == null || entryEtag.getValue().equals(responseEtag.getValue())) ? false : true;
    }

    private boolean responseDateNewerThanEntryDate(HttpResponse response, HttpCacheEntry entry) {
        Header entryDateHeader = entry.getFirstHeader("Date");
        Header responseDateHeader = response.getFirstHeader("Date");
        if (entryDateHeader == null || responseDateHeader == null) {
            return false;
        }
        try {
            Date entryDate = DateUtils.parseDate(entryDateHeader.getValue());
            Date responseDate = DateUtils.parseDate(responseDateHeader.getValue());
            return responseDate.after(entryDate);
        } catch (DateParseException e) {
            return false;
        }
    }
}
