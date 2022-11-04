package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.util.Date;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpHeaders;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpStatus;
import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
import org.opendatakit.httpclientandroidlib.message.BasicHeader;
import org.opendatakit.httpclientandroidlib.message.BasicHttpResponse;
@Immutable
/* loaded from: classes.dex */
class CachedHttpResponseGenerator {
    private final CacheValidityPolicy validityStrategy;

    public CachedHttpResponseGenerator(CacheValidityPolicy validityStrategy) {
        this.validityStrategy = validityStrategy;
    }

    public CachedHttpResponseGenerator() {
        this(new CacheValidityPolicy());
    }

    public HttpResponse generateResponse(HttpCacheEntry entry) {
        Date now = new Date();
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, entry.getStatusCode(), entry.getReasonPhrase());
        HttpEntity entity = new CacheEntity(entry);
        response.setHeaders(entry.getAllHeaders());
        addMissingContentLengthHeader(response, entity);
        response.setEntity(entity);
        long age = this.validityStrategy.getCurrentAgeSecs(entry, now);
        if (age > 0) {
            if (age >= 2147483647L) {
                response.setHeader("Age", "2147483648");
            } else {
                response.setHeader("Age", "" + ((int) age));
            }
        }
        return response;
    }

    public HttpResponse generateNotModifiedResponse(HttpCacheEntry entry) {
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, (int) HttpStatus.SC_NOT_MODIFIED, "Not Modified");
        Header dateHeader = entry.getFirstHeader("Date");
        if (dateHeader == null) {
            dateHeader = new BasicHeader("Date", DateUtils.formatDate(new Date()));
        }
        response.addHeader(dateHeader);
        Header etagHeader = entry.getFirstHeader("ETag");
        if (etagHeader != null) {
            response.addHeader(etagHeader);
        }
        Header contentLocationHeader = entry.getFirstHeader(HttpHeaders.CONTENT_LOCATION);
        if (contentLocationHeader != null) {
            response.addHeader(contentLocationHeader);
        }
        Header expiresHeader = entry.getFirstHeader("Expires");
        if (expiresHeader != null) {
            response.addHeader(expiresHeader);
        }
        Header cacheControlHeader = entry.getFirstHeader("Cache-Control");
        if (cacheControlHeader != null) {
            response.addHeader(cacheControlHeader);
        }
        Header varyHeader = entry.getFirstHeader("Vary");
        if (varyHeader != null) {
            response.addHeader(varyHeader);
        }
        return response;
    }

    private void addMissingContentLengthHeader(HttpResponse response, HttpEntity entity) {
        if (!transferEncodingIsPresent(response)) {
            Header contentLength = response.getFirstHeader("Content-Length");
            if (contentLength == null) {
                Header contentLength2 = new BasicHeader("Content-Length", Long.toString(entity.getContentLength()));
                response.setHeader(contentLength2);
            }
        }
    }

    private boolean transferEncodingIsPresent(HttpResponse response) {
        Header hdr = response.getFirstHeader("Transfer-Encoding");
        return hdr != null;
    }
}
