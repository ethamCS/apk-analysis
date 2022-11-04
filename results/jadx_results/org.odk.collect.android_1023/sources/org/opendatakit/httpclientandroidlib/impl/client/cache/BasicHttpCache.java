package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheUpdateCallback;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheUpdateException;
import org.opendatakit.httpclientandroidlib.client.cache.Resource;
import org.opendatakit.httpclientandroidlib.client.cache.ResourceFactory;
import org.opendatakit.httpclientandroidlib.entity.ByteArrayEntity;
import org.opendatakit.httpclientandroidlib.message.BasicHttpResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BasicHttpCache implements HttpCache {
    private final CacheEntryUpdater cacheEntryUpdater;
    private final CacheInvalidator cacheInvalidator;
    private final Log log;
    private final long maxObjectSizeBytes;
    private final ResourceFactory resourceFactory;
    private final CachedHttpResponseGenerator responseGenerator;
    private final HttpCacheStorage storage;
    private final CacheKeyGenerator uriExtractor;

    public BasicHttpCache(ResourceFactory resourceFactory, HttpCacheStorage storage, CacheConfig config) {
        this.log = LogFactory.getLog(getClass());
        this.resourceFactory = resourceFactory;
        this.uriExtractor = new CacheKeyGenerator();
        this.cacheEntryUpdater = new CacheEntryUpdater(resourceFactory);
        this.maxObjectSizeBytes = config.getMaxObjectSize();
        this.responseGenerator = new CachedHttpResponseGenerator();
        this.storage = storage;
        this.cacheInvalidator = new CacheInvalidator(this.uriExtractor, this.storage);
    }

    public BasicHttpCache(CacheConfig config) {
        this(new HeapResourceFactory(), new BasicHttpCacheStorage(config), config);
    }

    public BasicHttpCache() {
        this(new CacheConfig());
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public void flushCacheEntriesFor(HttpHost host, HttpRequest request) throws IOException {
        String uri = this.uriExtractor.getURI(host, request);
        this.storage.removeEntry(uri);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public void flushInvalidatedCacheEntriesFor(HttpHost host, HttpRequest request, HttpResponse response) {
        this.cacheInvalidator.flushInvalidatedCacheEntries(host, request, response);
    }

    void storeInCache(HttpHost target, HttpRequest request, HttpCacheEntry entry) throws IOException {
        if (entry.hasVariants()) {
            storeVariantEntry(target, request, entry);
        } else {
            storeNonVariantEntry(target, request, entry);
        }
    }

    void storeNonVariantEntry(HttpHost target, HttpRequest req, HttpCacheEntry entry) throws IOException {
        String uri = this.uriExtractor.getURI(target, req);
        this.storage.putEntry(uri, entry);
    }

    void storeVariantEntry(HttpHost target, final HttpRequest req, final HttpCacheEntry entry) throws IOException {
        String parentURI = this.uriExtractor.getURI(target, req);
        final String variantURI = this.uriExtractor.getVariantURI(target, req, entry);
        this.storage.putEntry(variantURI, entry);
        HttpCacheUpdateCallback callback = new HttpCacheUpdateCallback() { // from class: org.opendatakit.httpclientandroidlib.impl.client.cache.BasicHttpCache.1
            @Override // org.opendatakit.httpclientandroidlib.client.cache.HttpCacheUpdateCallback
            public HttpCacheEntry update(HttpCacheEntry existing) throws IOException {
                return BasicHttpCache.this.doGetUpdatedParentEntry(req.getRequestLine().getUri(), existing, entry, BasicHttpCache.this.uriExtractor.getVariantKey(req, entry), variantURI);
            }
        };
        try {
            this.storage.updateEntry(parentURI, callback);
        } catch (HttpCacheUpdateException e) {
            this.log.warn("Could not update key [" + parentURI + "]", e);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public void reuseVariantEntryFor(HttpHost target, final HttpRequest req, Variant variant) throws IOException {
        String parentCacheKey = this.uriExtractor.getURI(target, req);
        final HttpCacheEntry entry = variant.getEntry();
        final String variantKey = this.uriExtractor.getVariantKey(req, entry);
        final String variantCacheKey = variant.getCacheKey();
        HttpCacheUpdateCallback callback = new HttpCacheUpdateCallback() { // from class: org.opendatakit.httpclientandroidlib.impl.client.cache.BasicHttpCache.2
            @Override // org.opendatakit.httpclientandroidlib.client.cache.HttpCacheUpdateCallback
            public HttpCacheEntry update(HttpCacheEntry existing) throws IOException {
                return BasicHttpCache.this.doGetUpdatedParentEntry(req.getRequestLine().getUri(), existing, entry, variantKey, variantCacheKey);
            }
        };
        try {
            this.storage.updateEntry(parentCacheKey, callback);
        } catch (HttpCacheUpdateException e) {
            this.log.warn("Could not update key [" + parentCacheKey + "]", e);
        }
    }

    boolean isIncompleteResponse(HttpResponse resp, Resource resource) {
        Header hdr;
        int status = resp.getStatusLine().getStatusCode();
        if ((status == 200 || status == 206) && (hdr = resp.getFirstHeader("Content-Length")) != null) {
            try {
                int contentLength = Integer.parseInt(hdr.getValue());
                return resource.length() < ((long) contentLength);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    HttpResponse generateIncompleteResponseError(HttpResponse response, Resource resource) {
        int contentLength = Integer.parseInt(response.getFirstHeader("Content-Length").getValue());
        HttpResponse error = new BasicHttpResponse(HttpVersion.HTTP_1_1, 502, "Bad Gateway");
        error.setHeader("Content-Type", "text/plain;charset=UTF-8");
        String msg = String.format("Received incomplete response with Content-Length %d but actual body length %d", Integer.valueOf(contentLength), Long.valueOf(resource.length()));
        byte[] msgBytes = msg.getBytes();
        error.setHeader("Content-Length", Integer.toString(msgBytes.length));
        error.setEntity(new ByteArrayEntity(msgBytes));
        return error;
    }

    HttpCacheEntry doGetUpdatedParentEntry(String requestId, HttpCacheEntry existing, HttpCacheEntry entry, String variantKey, String variantCacheKey) throws IOException {
        HttpCacheEntry src = existing;
        if (src == null) {
            src = entry;
        }
        Resource resource = this.resourceFactory.copy(requestId, src.getResource());
        Map<String, String> variantMap = new HashMap<>(src.getVariantMap());
        variantMap.put(variantKey, variantCacheKey);
        return new HttpCacheEntry(src.getRequestDate(), src.getResponseDate(), src.getStatusLine(), src.getAllHeaders(), resource, variantMap);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public HttpCacheEntry updateCacheEntry(HttpHost target, HttpRequest request, HttpCacheEntry stale, HttpResponse originResponse, Date requestSent, Date responseReceived) throws IOException {
        HttpCacheEntry updatedEntry = this.cacheEntryUpdater.updateCacheEntry(request.getRequestLine().getUri(), stale, requestSent, responseReceived, originResponse);
        storeInCache(target, request, updatedEntry);
        return updatedEntry;
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public HttpCacheEntry updateVariantCacheEntry(HttpHost target, HttpRequest request, HttpCacheEntry stale, HttpResponse originResponse, Date requestSent, Date responseReceived, String cacheKey) throws IOException {
        HttpCacheEntry updatedEntry = this.cacheEntryUpdater.updateCacheEntry(request.getRequestLine().getUri(), stale, requestSent, responseReceived, originResponse);
        this.storage.putEntry(cacheKey, updatedEntry);
        return updatedEntry;
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public HttpResponse cacheAndReturnResponse(HttpHost host, HttpRequest request, HttpResponse originResponse, Date requestSent, Date responseReceived) throws IOException {
        SizeLimitedResponseReader responseReader = getResponseReader(request, originResponse);
        responseReader.readResponse();
        if (responseReader.isLimitReached()) {
            return responseReader.getReconstructedResponse();
        }
        Resource resource = responseReader.getResource();
        if (isIncompleteResponse(originResponse, resource)) {
            return generateIncompleteResponseError(originResponse, resource);
        }
        HttpCacheEntry entry = new HttpCacheEntry(requestSent, responseReceived, originResponse.getStatusLine(), originResponse.getAllHeaders(), resource);
        storeInCache(host, request, entry);
        return this.responseGenerator.generateResponse(entry);
    }

    SizeLimitedResponseReader getResponseReader(HttpRequest request, HttpResponse backEndResponse) {
        return new SizeLimitedResponseReader(this.resourceFactory, this.maxObjectSizeBytes, request, backEndResponse);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public HttpCacheEntry getCacheEntry(HttpHost host, HttpRequest request) throws IOException {
        HttpCacheEntry root = this.storage.getEntry(this.uriExtractor.getURI(host, request));
        if (root == null) {
            return null;
        }
        if (root.hasVariants()) {
            String variantCacheKey = root.getVariantMap().get(this.uriExtractor.getVariantKey(request, root));
            if (variantCacheKey != null) {
                return this.storage.getEntry(variantCacheKey);
            }
            return null;
        }
        return root;
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public void flushInvalidatedCacheEntriesFor(HttpHost host, HttpRequest request) throws IOException {
        this.cacheInvalidator.flushInvalidatedCacheEntries(host, request);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.client.cache.HttpCache
    public Map<String, Variant> getVariantCacheEntriesWithEtags(HttpHost host, HttpRequest request) throws IOException {
        Map<String, Variant> variants = new HashMap<>();
        HttpCacheEntry root = this.storage.getEntry(this.uriExtractor.getURI(host, request));
        if (root != null && root.hasVariants()) {
            for (Map.Entry<String, String> variant : root.getVariantMap().entrySet()) {
                String variantKey = variant.getKey();
                String variantCacheKey = variant.getValue();
                addVariantWithEtag(variantKey, variantCacheKey, variants);
            }
        }
        return variants;
    }

    private void addVariantWithEtag(String variantKey, String variantCacheKey, Map<String, Variant> variants) throws IOException {
        Header etagHeader;
        HttpCacheEntry entry = this.storage.getEntry(variantCacheKey);
        if (entry != null && (etagHeader = entry.getFirstHeader("ETag")) != null) {
            variants.put(etagHeader.getValue(), new Variant(variantKey, variantCacheKey, entry));
        }
    }
}
