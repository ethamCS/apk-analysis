package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.util.Date;
import org.javarosa.core.model.instance.TreeReference;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.HeaderConstants;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateParseException;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
@Immutable
/* loaded from: classes.dex */
class CachedResponseSuitabilityChecker {
    private final float heuristicCoefficient;
    private final long heuristicDefaultLifetime;
    private final Log log;
    private final boolean sharedCache;
    private final boolean useHeuristicCaching;
    private final CacheValidityPolicy validityStrategy;

    public CachedResponseSuitabilityChecker(CacheValidityPolicy validityStrategy, CacheConfig config) {
        this.log = LogFactory.getLog(getClass());
        this.validityStrategy = validityStrategy;
        this.sharedCache = config.isSharedCache();
        this.useHeuristicCaching = config.isHeuristicCachingEnabled();
        this.heuristicCoefficient = config.getHeuristicCoefficient();
        this.heuristicDefaultLifetime = config.getHeuristicDefaultLifetime();
    }

    CachedResponseSuitabilityChecker(CacheConfig config) {
        this(new CacheValidityPolicy(), config);
    }

    private boolean isFreshEnough(HttpCacheEntry entry, HttpRequest request, Date now) {
        if (this.validityStrategy.isResponseFresh(entry, now)) {
            return true;
        }
        if (this.useHeuristicCaching && this.validityStrategy.isResponseHeuristicallyFresh(entry, now, this.heuristicCoefficient, this.heuristicDefaultLifetime)) {
            return true;
        }
        if (originInsistsOnFreshness(entry)) {
            return false;
        }
        long maxstale = getMaxStale(request);
        if (maxstale == -1) {
            return false;
        }
        return maxstale > this.validityStrategy.getStalenessSecs(entry, now);
    }

    private boolean originInsistsOnFreshness(HttpCacheEntry entry) {
        if (this.validityStrategy.mustRevalidate(entry)) {
            return true;
        }
        if (!this.sharedCache) {
            return false;
        }
        return this.validityStrategy.proxyRevalidate(entry) || this.validityStrategy.hasCacheControlDirective(entry, "s-maxage");
    }

    private long getMaxStale(HttpRequest request) {
        long maxstale = -1;
        Header[] arr$ = request.getHeaders("Cache-Control");
        for (Header h : arr$) {
            HeaderElement[] arr$2 = h.getElements();
            for (HeaderElement elt : arr$2) {
                if (HeaderConstants.CACHE_CONTROL_MAX_STALE.equals(elt.getName())) {
                    if ((elt.getValue() == null || "".equals(elt.getValue().trim())) && maxstale == -1) {
                        maxstale = Long.MAX_VALUE;
                    } else {
                        try {
                            long val = Long.parseLong(elt.getValue());
                            if (val < 0) {
                                val = 0;
                            }
                            if (maxstale == -1 || val < maxstale) {
                                maxstale = val;
                            }
                        } catch (NumberFormatException e) {
                            maxstale = 0;
                        }
                    }
                }
            }
        }
        return maxstale;
    }

    public boolean canCachedResponseBeUsed(HttpHost host, HttpRequest request, HttpCacheEntry entry, Date now) {
        if (!isFreshEnough(entry, request, now)) {
            this.log.trace("Cache entry was not fresh enough");
            return false;
        } else if (!this.validityStrategy.contentLengthHeaderMatchesActualLength(entry)) {
            this.log.debug("Cache entry Content-Length and header information do not match");
            return false;
        } else if (hasUnsupportedConditionalHeaders(request)) {
            this.log.debug("Request contained conditional headers we don't handle");
            return false;
        } else if (isConditional(request) && !allConditionalsMatch(request, entry, now)) {
            return false;
        } else {
            Header[] arr$ = request.getHeaders("Cache-Control");
            for (Header ccHdr : arr$) {
                HeaderElement[] arr$2 = ccHdr.getElements();
                for (HeaderElement elt : arr$2) {
                    if (HeaderConstants.CACHE_CONTROL_NO_CACHE.equals(elt.getName())) {
                        this.log.trace("Response contained NO CACHE directive, cache was not suitable");
                        return false;
                    } else if (HeaderConstants.CACHE_CONTROL_NO_STORE.equals(elt.getName())) {
                        this.log.trace("Response contained NO STORE directive, cache was not suitable");
                        return false;
                    } else {
                        if ("max-age".equals(elt.getName())) {
                            try {
                                int maxage = Integer.parseInt(elt.getValue());
                                if (this.validityStrategy.getCurrentAgeSecs(entry, now) > maxage) {
                                    this.log.trace("Response from cache was NOT suitable due to max age");
                                    return false;
                                }
                            } catch (NumberFormatException ex) {
                                this.log.debug("Response from cache was malformed" + ex.getMessage());
                                return false;
                            }
                        }
                        if (HeaderConstants.CACHE_CONTROL_MAX_STALE.equals(elt.getName())) {
                            try {
                                int maxstale = Integer.parseInt(elt.getValue());
                                if (this.validityStrategy.getFreshnessLifetimeSecs(entry) > maxstale) {
                                    this.log.trace("Response from cache was not suitable due to Max stale freshness");
                                    return false;
                                }
                            } catch (NumberFormatException ex2) {
                                this.log.debug("Response from cache was malformed: " + ex2.getMessage());
                                return false;
                            }
                        }
                        if (HeaderConstants.CACHE_CONTROL_MIN_FRESH.equals(elt.getName())) {
                            try {
                                long minfresh = Long.parseLong(elt.getValue());
                                if (minfresh < 0) {
                                    return false;
                                }
                                long age = this.validityStrategy.getCurrentAgeSecs(entry, now);
                                long freshness = this.validityStrategy.getFreshnessLifetimeSecs(entry);
                                if (freshness - age < minfresh) {
                                    this.log.trace("Response from cache was not suitable due to min fresh freshness requirement");
                                    return false;
                                }
                            } catch (NumberFormatException ex3) {
                                this.log.debug("Response from cache was malformed: " + ex3.getMessage());
                                return false;
                            }
                        }
                    }
                }
            }
            this.log.trace("Response from cache was suitable");
            return true;
        }
    }

    public boolean isConditional(HttpRequest request) {
        return hasSupportedEtagValidator(request) || hasSupportedLastModifiedValidator(request);
    }

    public boolean allConditionalsMatch(HttpRequest request, HttpCacheEntry entry, Date now) {
        boolean hasEtagValidator = hasSupportedEtagValidator(request);
        boolean hasLastModifiedValidator = hasSupportedLastModifiedValidator(request);
        boolean etagValidatorMatches = hasEtagValidator && etagValidatorMatches(request, entry);
        boolean lastModifiedValidatorMatches = hasLastModifiedValidator && lastModifiedValidatorMatches(request, entry, now);
        if (!hasEtagValidator || !hasLastModifiedValidator || (etagValidatorMatches && lastModifiedValidatorMatches)) {
            if (hasEtagValidator && !etagValidatorMatches) {
                return false;
            }
            return !hasLastModifiedValidator || lastModifiedValidatorMatches;
        }
        return false;
    }

    private boolean hasUnsupportedConditionalHeaders(HttpRequest request) {
        return (request.getFirstHeader("If-Range") == null && request.getFirstHeader("If-Match") == null && !hasValidDateField(request, "If-Unmodified-Since")) ? false : true;
    }

    private boolean hasSupportedEtagValidator(HttpRequest request) {
        return request.containsHeader("If-None-Match");
    }

    private boolean hasSupportedLastModifiedValidator(HttpRequest request) {
        return hasValidDateField(request, "If-Modified-Since");
    }

    private boolean etagValidatorMatches(HttpRequest request, HttpCacheEntry entry) {
        Header etagHeader = entry.getFirstHeader("ETag");
        String etag = etagHeader != null ? etagHeader.getValue() : null;
        Header[] ifNoneMatch = request.getHeaders("If-None-Match");
        if (ifNoneMatch != null) {
            for (Header h : ifNoneMatch) {
                HeaderElement[] arr$ = h.getElements();
                for (HeaderElement elt : arr$) {
                    String reqEtag = elt.toString();
                    if ((TreeReference.NAME_WILDCARD.equals(reqEtag) && etag != null) || reqEtag.equals(etag)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean lastModifiedValidatorMatches(HttpRequest request, HttpCacheEntry entry, Date now) {
        Date ifModifiedSince;
        Header lastModifiedHeader = entry.getFirstHeader("Last-Modified");
        Date lastModified = null;
        if (lastModifiedHeader != null) {
            try {
                lastModified = DateUtils.parseDate(lastModifiedHeader.getValue());
            } catch (DateParseException e) {
            }
        }
        if (lastModified == null) {
            return false;
        }
        Header[] arr$ = request.getHeaders("If-Modified-Since");
        for (Header h : arr$) {
            try {
                ifModifiedSince = DateUtils.parseDate(h.getValue());
            } catch (DateParseException e2) {
            }
            if (ifModifiedSince.after(now) || lastModified.after(ifModifiedSince)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasValidDateField(HttpRequest request, String headerName) {
        Header[] arr$ = request.getHeaders(headerName);
        for (Header h : arr$) {
            try {
                DateUtils.parseDate(h.getValue());
                return true;
            } catch (DateParseException e) {
            }
        }
        return false;
    }
}
