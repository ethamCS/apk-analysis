package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.javarosa.core.model.instance.TreeReference;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpMessage;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.HttpVersion;
import org.opendatakit.httpclientandroidlib.ProtocolException;
import org.opendatakit.httpclientandroidlib.ProtocolVersion;
import org.opendatakit.httpclientandroidlib.RequestLine;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.ClientProtocolException;
import org.opendatakit.httpclientandroidlib.client.HttpClient;
import org.opendatakit.httpclientandroidlib.client.ResponseHandler;
import org.opendatakit.httpclientandroidlib.client.cache.CacheResponseStatus;
import org.opendatakit.httpclientandroidlib.client.cache.HeaderConstants;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage;
import org.opendatakit.httpclientandroidlib.client.cache.ResourceFactory;
import org.opendatakit.httpclientandroidlib.client.methods.HttpUriRequest;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.impl.client.DefaultHttpClient;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateParseException;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
import org.opendatakit.httpclientandroidlib.message.BasicHttpResponse;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.protocol.ExecutionContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
import org.opendatakit.httpclientandroidlib.util.EntityUtils;
import org.opendatakit.httpclientandroidlib.util.VersionInfo;
@ThreadSafe
/* loaded from: classes.dex */
public class CachingHttpClient implements HttpClient {
    public static final String CACHE_RESPONSE_STATUS = "http.cache.response.status";
    private static final boolean SUPPORTS_RANGE_AND_CONTENT_RANGE_HEADERS = false;
    private final AsynchronousValidator asynchRevalidator;
    private final HttpClient backend;
    private final AtomicLong cacheHits;
    private final AtomicLong cacheMisses;
    private final AtomicLong cacheUpdates;
    private final CacheableRequestPolicy cacheableRequestPolicy;
    private final ConditionalRequestBuilder conditionalRequestBuilder;
    private final Log log;
    private final long maxObjectSizeBytes;
    private final RequestProtocolCompliance requestCompliance;
    private final HttpCache responseCache;
    private final ResponseCachingPolicy responseCachingPolicy;
    private final ResponseProtocolCompliance responseCompliance;
    private final CachedHttpResponseGenerator responseGenerator;
    private final boolean sharedCache;
    private final CachedResponseSuitabilityChecker suitabilityChecker;
    private final CacheValidityPolicy validityPolicy;
    private final Map<ProtocolVersion, String> viaHeaders;

    CachingHttpClient(HttpClient client, HttpCache cache, CacheConfig config) {
        this.cacheHits = new AtomicLong();
        this.cacheMisses = new AtomicLong();
        this.cacheUpdates = new AtomicLong();
        this.viaHeaders = new HashMap(4);
        this.log = LogFactory.getLog(getClass());
        if (client == null) {
            throw new IllegalArgumentException("HttpClient may not be null");
        }
        if (cache == null) {
            throw new IllegalArgumentException("HttpCache may not be null");
        }
        if (config == null) {
            throw new IllegalArgumentException("CacheConfig may not be null");
        }
        this.maxObjectSizeBytes = config.getMaxObjectSize();
        this.sharedCache = config.isSharedCache();
        this.backend = client;
        this.responseCache = cache;
        this.validityPolicy = new CacheValidityPolicy();
        this.responseCachingPolicy = new ResponseCachingPolicy(this.maxObjectSizeBytes, this.sharedCache);
        this.responseGenerator = new CachedHttpResponseGenerator(this.validityPolicy);
        this.cacheableRequestPolicy = new CacheableRequestPolicy();
        this.suitabilityChecker = new CachedResponseSuitabilityChecker(this.validityPolicy, config);
        this.conditionalRequestBuilder = new ConditionalRequestBuilder();
        this.responseCompliance = new ResponseProtocolCompliance();
        this.requestCompliance = new RequestProtocolCompliance();
        this.asynchRevalidator = makeAsynchronousValidator(config);
    }

    public CachingHttpClient() {
        this(new DefaultHttpClient(), new BasicHttpCache(), new CacheConfig());
    }

    public CachingHttpClient(CacheConfig config) {
        this(new DefaultHttpClient(), new BasicHttpCache(config), config);
    }

    public CachingHttpClient(HttpClient client) {
        this(client, new BasicHttpCache(), new CacheConfig());
    }

    public CachingHttpClient(HttpClient client, CacheConfig config) {
        this(client, new BasicHttpCache(config), config);
    }

    public CachingHttpClient(HttpClient client, ResourceFactory resourceFactory, HttpCacheStorage storage, CacheConfig config) {
        this(client, new BasicHttpCache(resourceFactory, storage, config), config);
    }

    public CachingHttpClient(HttpClient client, HttpCacheStorage storage, CacheConfig config) {
        this(client, new BasicHttpCache(new HeapResourceFactory(), storage, config), config);
    }

    CachingHttpClient(HttpClient backend, CacheValidityPolicy validityPolicy, ResponseCachingPolicy responseCachingPolicy, HttpCache responseCache, CachedHttpResponseGenerator responseGenerator, CacheableRequestPolicy cacheableRequestPolicy, CachedResponseSuitabilityChecker suitabilityChecker, ConditionalRequestBuilder conditionalRequestBuilder, ResponseProtocolCompliance responseCompliance, RequestProtocolCompliance requestCompliance) {
        this.cacheHits = new AtomicLong();
        this.cacheMisses = new AtomicLong();
        this.cacheUpdates = new AtomicLong();
        this.viaHeaders = new HashMap(4);
        this.log = LogFactory.getLog(getClass());
        CacheConfig config = new CacheConfig();
        this.maxObjectSizeBytes = config.getMaxObjectSize();
        this.sharedCache = config.isSharedCache();
        this.backend = backend;
        this.validityPolicy = validityPolicy;
        this.responseCachingPolicy = responseCachingPolicy;
        this.responseCache = responseCache;
        this.responseGenerator = responseGenerator;
        this.cacheableRequestPolicy = cacheableRequestPolicy;
        this.suitabilityChecker = suitabilityChecker;
        this.conditionalRequestBuilder = conditionalRequestBuilder;
        this.responseCompliance = responseCompliance;
        this.requestCompliance = requestCompliance;
        this.asynchRevalidator = makeAsynchronousValidator(config);
    }

    private AsynchronousValidator makeAsynchronousValidator(CacheConfig config) {
        if (config.getAsynchronousWorkersMax() > 0) {
            return new AsynchronousValidator(this, config);
        }
        return null;
    }

    public long getCacheHits() {
        return this.cacheHits.get();
    }

    public long getCacheMisses() {
        return this.cacheMisses.get();
    }

    public long getCacheUpdates() {
        return this.cacheUpdates.get();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpHost target, HttpRequest request) throws IOException {
        return execute(target, request, (HttpContext) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) execute(target, request, responseHandler, null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException {
        HttpResponse resp = execute(target, request, context);
        return (T) handleAndConsume(responseHandler, resp);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpUriRequest request) throws IOException {
        return execute(request, (HttpContext) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpUriRequest request, HttpContext context) throws IOException {
        URI uri = request.getURI();
        HttpHost httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        return execute(httpHost, request, context);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) execute(request, responseHandler, (HttpContext) null);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler, HttpContext context) throws IOException {
        HttpResponse resp = execute(request, context);
        return (T) handleAndConsume(responseHandler, resp);
    }

    private <T> T handleAndConsume(ResponseHandler<? extends T> responseHandler, HttpResponse response) throws Error, IOException {
        try {
            T result = responseHandler.handleResponse(response);
            HttpEntity entity = response.getEntity();
            EntityUtils.consume(entity);
            return result;
        } catch (Exception t) {
            HttpEntity entity2 = response.getEntity();
            try {
                EntityUtils.consume(entity2);
            } catch (Exception t2) {
                this.log.warn("Error consuming content after an exception.", t2);
            }
            if (t instanceof RuntimeException) {
                throw ((RuntimeException) t);
            }
            if (t instanceof IOException) {
                throw ((IOException) t);
            }
            throw new UndeclaredThrowableException(t);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.backend.getConnectionManager();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpParams getParams() {
        return this.backend.getParams();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.HttpClient
    public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException {
        setResponseStatus(context, CacheResponseStatus.CACHE_MISS);
        String via = generateViaHeader(request);
        if (clientRequestsOurOptions(request)) {
            setResponseStatus(context, CacheResponseStatus.CACHE_MODULE_RESPONSE);
            return new OptionsHttp11Response();
        }
        HttpResponse fatalErrorResponse = getFatallyNoncompliantResponse(request, context);
        if (fatalErrorResponse == null) {
            HttpRequest request2 = this.requestCompliance.makeRequestCompliant(request);
            request2.addHeader("Via", via);
            flushEntriesInvalidatedByRequest(target, request2);
            if (!this.cacheableRequestPolicy.isServableFromCache(request2)) {
                return callBackend(target, request2, context);
            }
            HttpCacheEntry entry = satisfyFromCache(target, request2);
            if (entry == null) {
                return handleCacheMiss(target, request2, context);
            }
            return handleCacheHit(target, request2, context, entry);
        }
        return fatalErrorResponse;
    }

    private HttpResponse handleCacheHit(HttpHost target, HttpRequest request, HttpContext context, HttpCacheEntry entry) throws ClientProtocolException, IOException {
        HttpResponse out;
        recordCacheHit(target, request);
        Date now = getCurrentDate();
        if (this.suitabilityChecker.canCachedResponseBeUsed(target, request, entry, now)) {
            out = generateCachedResponse(request, context, entry, now);
        } else if (!mayCallBackend(request)) {
            out = generateGatewayTimeout(context);
        } else if (this.validityPolicy.isRevalidatable(entry)) {
            return revalidateCacheEntry(target, request, context, entry, now);
        } else {
            return callBackend(target, request, context);
        }
        if (context != null) {
            context.setAttribute(ExecutionContext.HTTP_TARGET_HOST, target);
            context.setAttribute(ExecutionContext.HTTP_REQUEST, request);
            context.setAttribute(ExecutionContext.HTTP_RESPONSE, out);
            context.setAttribute(ExecutionContext.HTTP_REQ_SENT, true);
        }
        return out;
    }

    private HttpResponse revalidateCacheEntry(HttpHost target, HttpRequest request, HttpContext context, HttpCacheEntry entry, Date now) throws ClientProtocolException {
        HttpResponse resp;
        this.log.trace("Revalidating the cache entry");
        try {
            if (this.asynchRevalidator != null && !staleResponseNotAllowed(request, entry, now) && this.validityPolicy.mayReturnStaleWhileRevalidating(entry, now)) {
                resp = generateCachedResponse(request, context, entry, now);
                this.asynchRevalidator.revalidateCacheEntry(target, request, context, entry);
            } else {
                resp = revalidateCacheEntry(target, request, context, entry);
            }
            return resp;
        } catch (IOException e) {
            HttpResponse resp2 = handleRevalidationFailure(request, context, entry, now);
            return resp2;
        } catch (ProtocolException e2) {
            throw new ClientProtocolException(e2);
        }
    }

    private HttpResponse handleCacheMiss(HttpHost target, HttpRequest request, HttpContext context) throws IOException {
        recordCacheMiss(target, request);
        if (!mayCallBackend(request)) {
            return new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout");
        }
        Map<String, Variant> variants = getExistingCacheVariants(target, request);
        if (variants != null && variants.size() > 0) {
            return negotiateResponseFromVariants(target, request, context, variants);
        }
        return callBackend(target, request, context);
    }

    private HttpCacheEntry satisfyFromCache(HttpHost target, HttpRequest request) {
        try {
            HttpCacheEntry entry = this.responseCache.getCacheEntry(target, request);
            return entry;
        } catch (IOException ioe) {
            this.log.warn("Unable to retrieve entries from cache", ioe);
            return null;
        }
    }

    private HttpResponse getFatallyNoncompliantResponse(HttpRequest request, HttpContext context) {
        HttpResponse fatalErrorResponse = null;
        List<RequestProtocolError> fatalError = this.requestCompliance.requestIsFatallyNonCompliant(request);
        for (RequestProtocolError error : fatalError) {
            setResponseStatus(context, CacheResponseStatus.CACHE_MODULE_RESPONSE);
            fatalErrorResponse = this.requestCompliance.getErrorForRequest(error);
        }
        return fatalErrorResponse;
    }

    private Map<String, Variant> getExistingCacheVariants(HttpHost target, HttpRequest request) {
        try {
            Map<String, Variant> variants = this.responseCache.getVariantCacheEntriesWithEtags(target, request);
            return variants;
        } catch (IOException ioe) {
            this.log.warn("Unable to retrieve variant entries from cache", ioe);
            return null;
        }
    }

    private void recordCacheMiss(HttpHost target, HttpRequest request) {
        this.cacheMisses.getAndIncrement();
        if (this.log.isTraceEnabled()) {
            RequestLine rl = request.getRequestLine();
            this.log.trace("Cache miss [host: " + target + "; uri: " + rl.getUri() + "]");
        }
    }

    private void recordCacheHit(HttpHost target, HttpRequest request) {
        this.cacheHits.getAndIncrement();
        if (this.log.isTraceEnabled()) {
            RequestLine rl = request.getRequestLine();
            this.log.trace("Cache hit [host: " + target + "; uri: " + rl.getUri() + "]");
        }
    }

    private void recordCacheUpdate(HttpContext context) {
        this.cacheUpdates.getAndIncrement();
        setResponseStatus(context, CacheResponseStatus.VALIDATED);
    }

    private void flushEntriesInvalidatedByRequest(HttpHost target, HttpRequest request) {
        try {
            this.responseCache.flushInvalidatedCacheEntriesFor(target, request);
        } catch (IOException ioe) {
            this.log.warn("Unable to flush invalidated entries from cache", ioe);
        }
    }

    private HttpResponse generateCachedResponse(HttpRequest request, HttpContext context, HttpCacheEntry entry, Date now) {
        HttpResponse cachedResponse;
        if (request.containsHeader("If-None-Match") || request.containsHeader("If-Modified-Since")) {
            cachedResponse = this.responseGenerator.generateNotModifiedResponse(entry);
        } else {
            cachedResponse = this.responseGenerator.generateResponse(entry);
        }
        setResponseStatus(context, CacheResponseStatus.CACHE_HIT);
        if (this.validityPolicy.getStalenessSecs(entry, now) > 0) {
            cachedResponse.addHeader("Warning", "110 localhost \"Response is stale\"");
        }
        return cachedResponse;
    }

    private HttpResponse handleRevalidationFailure(HttpRequest request, HttpContext context, HttpCacheEntry entry, Date now) {
        return staleResponseNotAllowed(request, entry, now) ? generateGatewayTimeout(context) : unvalidatedCacheHit(context, entry);
    }

    private HttpResponse generateGatewayTimeout(HttpContext context) {
        setResponseStatus(context, CacheResponseStatus.CACHE_MODULE_RESPONSE);
        return new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout");
    }

    private HttpResponse unvalidatedCacheHit(HttpContext context, HttpCacheEntry entry) {
        HttpResponse cachedResponse = this.responseGenerator.generateResponse(entry);
        setResponseStatus(context, CacheResponseStatus.CACHE_HIT);
        cachedResponse.addHeader("Warning", "111 localhost \"Revalidation failed\"");
        return cachedResponse;
    }

    private boolean staleResponseNotAllowed(HttpRequest request, HttpCacheEntry entry, Date now) {
        return this.validityPolicy.mustRevalidate(entry) || (isSharedCache() && this.validityPolicy.proxyRevalidate(entry)) || explicitFreshnessRequest(request, entry, now);
    }

    private boolean mayCallBackend(HttpRequest request) {
        Header[] arr$ = request.getHeaders("Cache-Control");
        for (Header h : arr$) {
            HeaderElement[] arr$2 = h.getElements();
            for (HeaderElement elt : arr$2) {
                if ("only-if-cached".equals(elt.getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean explicitFreshnessRequest(HttpRequest request, HttpCacheEntry entry, Date now) {
        Header[] arr$ = request.getHeaders("Cache-Control");
        for (Header h : arr$) {
            HeaderElement[] arr$2 = h.getElements();
            for (HeaderElement elt : arr$2) {
                if (HeaderConstants.CACHE_CONTROL_MAX_STALE.equals(elt.getName())) {
                    try {
                        int maxstale = Integer.parseInt(elt.getValue());
                        long age = this.validityPolicy.getCurrentAgeSecs(entry, now);
                        long lifetime = this.validityPolicy.getFreshnessLifetimeSecs(entry);
                        if (age - lifetime > maxstale) {
                            return true;
                        }
                    } catch (NumberFormatException e) {
                        return true;
                    }
                } else if (HeaderConstants.CACHE_CONTROL_MIN_FRESH.equals(elt.getName()) || "max-age".equals(elt.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private String generateViaHeader(HttpMessage msg) {
        String value;
        ProtocolVersion pv = msg.getProtocolVersion();
        String existingEntry = this.viaHeaders.get(pv);
        if (existingEntry == null) {
            VersionInfo vi = VersionInfo.loadVersionInfo("org.opendatakit.httpclientandroidlib.client", getClass().getClassLoader());
            String release = vi != null ? vi.getRelease() : VersionInfo.UNAVAILABLE;
            if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(pv.getProtocol())) {
                value = String.format("%d.%d localhost (Apache-HttpClient/%s (cache))", Integer.valueOf(pv.getMajor()), Integer.valueOf(pv.getMinor()), release);
            } else {
                value = String.format("%s/%d.%d localhost (Apache-HttpClient/%s (cache))", pv.getProtocol(), Integer.valueOf(pv.getMajor()), Integer.valueOf(pv.getMinor()), release);
            }
            this.viaHeaders.put(pv, value);
            return value;
        }
        return existingEntry;
    }

    private void setResponseStatus(HttpContext context, CacheResponseStatus value) {
        if (context != null) {
            context.setAttribute(CACHE_RESPONSE_STATUS, value);
        }
    }

    public boolean supportsRangeAndContentRangeHeaders() {
        return false;
    }

    public boolean isSharedCache() {
        return this.sharedCache;
    }

    Date getCurrentDate() {
        return new Date();
    }

    boolean clientRequestsOurOptions(HttpRequest request) {
        RequestLine line = request.getRequestLine();
        return "OPTIONS".equals(line.getMethod()) && TreeReference.NAME_WILDCARD.equals(line.getUri()) && "0".equals(request.getFirstHeader("Max-Forwards").getValue());
    }

    HttpResponse callBackend(HttpHost target, HttpRequest request, HttpContext context) throws IOException {
        Date requestDate = getCurrentDate();
        this.log.trace("Calling the backend");
        HttpResponse backendResponse = this.backend.execute(target, request, context);
        backendResponse.addHeader("Via", generateViaHeader(backendResponse));
        return handleBackendResponse(target, request, requestDate, getCurrentDate(), backendResponse);
    }

    private boolean revalidationResponseIsTooOld(HttpResponse backendResponse, HttpCacheEntry cacheEntry) {
        Header entryDateHeader = cacheEntry.getFirstHeader("Date");
        Header responseDateHeader = backendResponse.getFirstHeader("Date");
        if (entryDateHeader != null && responseDateHeader != null) {
            try {
                Date entryDate = DateUtils.parseDate(entryDateHeader.getValue());
                Date respDate = DateUtils.parseDate(responseDateHeader.getValue());
                if (respDate.before(entryDate)) {
                    return true;
                }
            } catch (DateParseException e) {
            }
        }
        return false;
    }

    HttpResponse negotiateResponseFromVariants(HttpHost target, HttpRequest request, HttpContext context, Map<String, Variant> variants) throws IOException {
        HttpRequest conditionalRequest = this.conditionalRequestBuilder.buildConditionalRequestFromVariants(request, variants);
        Date requestDate = getCurrentDate();
        HttpResponse backendResponse = this.backend.execute(target, conditionalRequest, context);
        Date responseDate = getCurrentDate();
        backendResponse.addHeader("Via", generateViaHeader(backendResponse));
        if (backendResponse.getStatusLine().getStatusCode() != 304) {
            return handleBackendResponse(target, request, requestDate, responseDate, backendResponse);
        }
        Header resultEtagHeader = backendResponse.getFirstHeader("ETag");
        if (resultEtagHeader == null) {
            this.log.warn("304 response did not contain ETag");
            return callBackend(target, request, context);
        }
        String resultEtag = resultEtagHeader.getValue();
        Variant matchingVariant = variants.get(resultEtag);
        if (matchingVariant == null) {
            this.log.debug("304 response did not contain ETag matching one sent in If-None-Match");
            return callBackend(target, request, context);
        }
        HttpCacheEntry matchedEntry = matchingVariant.getEntry();
        if (revalidationResponseIsTooOld(backendResponse, matchedEntry)) {
            EntityUtils.consume(backendResponse.getEntity());
            return retryRequestUnconditionally(target, request, context, matchedEntry);
        }
        recordCacheUpdate(context);
        HttpCacheEntry responseEntry = getUpdatedVariantEntry(target, conditionalRequest, requestDate, responseDate, backendResponse, matchingVariant, matchedEntry);
        HttpResponse generateResponse = this.responseGenerator.generateResponse(responseEntry);
        tryToUpdateVariantMap(target, request, matchingVariant);
        if (shouldSendNotModifiedResponse(request, responseEntry)) {
            HttpResponse resp = this.responseGenerator.generateNotModifiedResponse(responseEntry);
            return resp;
        }
        return generateResponse;
    }

    private HttpResponse retryRequestUnconditionally(HttpHost target, HttpRequest request, HttpContext context, HttpCacheEntry matchedEntry) throws IOException {
        HttpRequest unconditional = this.conditionalRequestBuilder.buildUnconditionalRequest(request, matchedEntry);
        return callBackend(target, unconditional, context);
    }

    private HttpCacheEntry getUpdatedVariantEntry(HttpHost target, HttpRequest conditionalRequest, Date requestDate, Date responseDate, HttpResponse backendResponse, Variant matchingVariant, HttpCacheEntry matchedEntry) {
        try {
            HttpCacheEntry responseEntry = this.responseCache.updateVariantCacheEntry(target, conditionalRequest, matchedEntry, backendResponse, requestDate, responseDate, matchingVariant.getCacheKey());
            return responseEntry;
        } catch (IOException ioe) {
            this.log.warn("Could not update cache entry", ioe);
            return matchedEntry;
        }
    }

    private void tryToUpdateVariantMap(HttpHost target, HttpRequest request, Variant matchingVariant) {
        try {
            this.responseCache.reuseVariantEntryFor(target, request, matchingVariant);
        } catch (IOException ioe) {
            this.log.warn("Could not update cache entry to reuse variant", ioe);
        }
    }

    private boolean shouldSendNotModifiedResponse(HttpRequest request, HttpCacheEntry responseEntry) {
        return this.suitabilityChecker.isConditional(request) && this.suitabilityChecker.allConditionalsMatch(request, responseEntry, new Date());
    }

    public HttpResponse revalidateCacheEntry(HttpHost target, HttpRequest request, HttpContext context, HttpCacheEntry cacheEntry) throws IOException, ProtocolException {
        HttpRequest conditionalRequest = this.conditionalRequestBuilder.buildConditionalRequest(request, cacheEntry);
        Date requestDate = getCurrentDate();
        HttpResponse backendResponse = this.backend.execute(target, conditionalRequest, context);
        Date responseDate = getCurrentDate();
        if (revalidationResponseIsTooOld(backendResponse, cacheEntry)) {
            EntityUtils.consume(backendResponse.getEntity());
            HttpRequest unconditional = this.conditionalRequestBuilder.buildUnconditionalRequest(request, cacheEntry);
            requestDate = getCurrentDate();
            backendResponse = this.backend.execute(target, unconditional, context);
            responseDate = getCurrentDate();
        }
        backendResponse.addHeader("Via", generateViaHeader(backendResponse));
        int statusCode = backendResponse.getStatusLine().getStatusCode();
        if (statusCode == 304 || statusCode == 200) {
            recordCacheUpdate(context);
        }
        if (statusCode == 304) {
            HttpCacheEntry updatedEntry = this.responseCache.updateCacheEntry(target, request, cacheEntry, backendResponse, requestDate, responseDate);
            if (this.suitabilityChecker.isConditional(request) && this.suitabilityChecker.allConditionalsMatch(request, updatedEntry, new Date())) {
                return this.responseGenerator.generateNotModifiedResponse(updatedEntry);
            }
            return this.responseGenerator.generateResponse(updatedEntry);
        } else if (staleIfErrorAppliesTo(statusCode) && !staleResponseNotAllowed(request, cacheEntry, getCurrentDate()) && this.validityPolicy.mayReturnStaleIfError(request, cacheEntry, responseDate)) {
            HttpResponse cachedResponse = this.responseGenerator.generateResponse(cacheEntry);
            cachedResponse.addHeader("Warning", "110 localhost \"Response is stale\"");
            HttpEntity errorBody = backendResponse.getEntity();
            if (errorBody != null) {
                EntityUtils.consume(errorBody);
                return cachedResponse;
            }
            return cachedResponse;
        } else {
            return handleBackendResponse(target, conditionalRequest, requestDate, responseDate, backendResponse);
        }
    }

    private boolean staleIfErrorAppliesTo(int statusCode) {
        return statusCode == 500 || statusCode == 502 || statusCode == 503 || statusCode == 504;
    }

    HttpResponse handleBackendResponse(HttpHost target, HttpRequest request, Date requestDate, Date responseDate, HttpResponse backendResponse) throws IOException {
        this.log.trace("Handling Backend response");
        this.responseCompliance.ensureProtocolCompliance(request, backendResponse);
        boolean cacheable = this.responseCachingPolicy.isResponseCacheable(request, backendResponse);
        this.responseCache.flushInvalidatedCacheEntriesFor(target, request, backendResponse);
        if (cacheable && !alreadyHaveNewerCacheEntry(target, request, backendResponse)) {
            try {
                return this.responseCache.cacheAndReturnResponse(target, request, backendResponse, requestDate, responseDate);
            } catch (IOException ioe) {
                this.log.warn("Unable to store entries in cache", ioe);
            }
        }
        if (!cacheable) {
            try {
                this.responseCache.flushCacheEntriesFor(target, request);
                return backendResponse;
            } catch (IOException ioe2) {
                this.log.warn("Unable to flush invalid cache entries", ioe2);
                return backendResponse;
            }
        }
        return backendResponse;
    }

    private boolean alreadyHaveNewerCacheEntry(HttpHost target, HttpRequest request, HttpResponse backendResponse) {
        Header entryDateHeader;
        Header responseDateHeader;
        HttpCacheEntry existing = null;
        try {
            existing = this.responseCache.getCacheEntry(target, request);
        } catch (IOException e) {
        }
        if (existing == null || (entryDateHeader = existing.getFirstHeader("Date")) == null || (responseDateHeader = backendResponse.getFirstHeader("Date")) == null) {
            return false;
        }
        try {
            Date entryDate = DateUtils.parseDate(entryDateHeader.getValue());
            Date responseDate = DateUtils.parseDate(responseDateHeader.getValue());
            return responseDate.before(entryDate);
        } catch (DateParseException e2) {
            return false;
        }
    }
}
