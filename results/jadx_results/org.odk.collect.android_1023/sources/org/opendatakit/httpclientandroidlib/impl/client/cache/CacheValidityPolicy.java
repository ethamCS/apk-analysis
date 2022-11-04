package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.util.Date;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HeaderElement;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.HeaderConstants;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateParseException;
import org.opendatakit.httpclientandroidlib.impl.cookie.DateUtils;
@Immutable
/* loaded from: classes.dex */
class CacheValidityPolicy {
    public static final long MAX_AGE = 2147483648L;

    public long getCurrentAgeSecs(HttpCacheEntry entry, Date now) {
        return getCorrectedInitialAgeSecs(entry) + getResidentTimeSecs(entry, now);
    }

    public long getFreshnessLifetimeSecs(HttpCacheEntry entry) {
        Date expiry;
        long maxage = getMaxAge(entry);
        if (maxage <= -1) {
            Date dateValue = getDateValue(entry);
            if (dateValue != null && (expiry = getExpirationDate(entry)) != null) {
                long diff = expiry.getTime() - dateValue.getTime();
                return diff / 1000;
            }
            return 0L;
        }
        return maxage;
    }

    public boolean isResponseFresh(HttpCacheEntry entry, Date now) {
        return getCurrentAgeSecs(entry, now) < getFreshnessLifetimeSecs(entry);
    }

    public boolean isResponseHeuristicallyFresh(HttpCacheEntry entry, Date now, float coefficient, long defaultLifetime) {
        return getCurrentAgeSecs(entry, now) < getHeuristicFreshnessLifetimeSecs(entry, coefficient, defaultLifetime);
    }

    public long getHeuristicFreshnessLifetimeSecs(HttpCacheEntry entry, float coefficient, long defaultLifetime) {
        Date dateValue = getDateValue(entry);
        Date lastModifiedValue = getLastModifiedValue(entry);
        if (dateValue != null && lastModifiedValue != null) {
            long diff = dateValue.getTime() - lastModifiedValue.getTime();
            if (diff >= 0) {
                return ((float) (diff / 1000)) * coefficient;
            }
            return 0L;
        }
        return defaultLifetime;
    }

    public boolean isRevalidatable(HttpCacheEntry entry) {
        return (entry.getFirstHeader("ETag") == null && entry.getFirstHeader("Last-Modified") == null) ? false : true;
    }

    public boolean mustRevalidate(HttpCacheEntry entry) {
        return hasCacheControlDirective(entry, HeaderConstants.CACHE_CONTROL_MUST_REVALIDATE);
    }

    public boolean proxyRevalidate(HttpCacheEntry entry) {
        return hasCacheControlDirective(entry, HeaderConstants.CACHE_CONTROL_PROXY_REVALIDATE);
    }

    public boolean mayReturnStaleWhileRevalidating(HttpCacheEntry entry, Date now) {
        Header[] arr$ = entry.getHeaders("Cache-Control");
        for (Header h : arr$) {
            HeaderElement[] arr$2 = h.getElements();
            for (HeaderElement elt : arr$2) {
                if (HeaderConstants.STALE_WHILE_REVALIDATE.equalsIgnoreCase(elt.getName())) {
                    try {
                        int allowedStalenessLifetime = Integer.parseInt(elt.getValue());
                        if (getStalenessSecs(entry, now) <= allowedStalenessLifetime) {
                            return true;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }
        return false;
    }

    public boolean mayReturnStaleIfError(HttpRequest request, HttpCacheEntry entry, Date now) {
        long stalenessSecs = getStalenessSecs(entry, now);
        return mayReturnStaleIfError(request.getHeaders("Cache-Control"), stalenessSecs) || mayReturnStaleIfError(entry.getHeaders("Cache-Control"), stalenessSecs);
    }

    private boolean mayReturnStaleIfError(Header[] headers, long stalenessSecs) {
        boolean result = false;
        for (Header h : headers) {
            HeaderElement[] arr$ = h.getElements();
            int len$ = arr$.length;
            int i$ = 0;
            while (true) {
                if (i$ < len$) {
                    HeaderElement elt = arr$[i$];
                    if (HeaderConstants.STALE_IF_ERROR.equals(elt.getName())) {
                        try {
                            int staleIfErrorSecs = Integer.parseInt(elt.getValue());
                            if (stalenessSecs <= staleIfErrorSecs) {
                                result = true;
                                break;
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                    i$++;
                }
            }
        }
        return result;
    }

    protected Date getDateValue(HttpCacheEntry entry) {
        Header dateHdr = entry.getFirstHeader("Date");
        if (dateHdr == null) {
            return null;
        }
        try {
            return DateUtils.parseDate(dateHdr.getValue());
        } catch (DateParseException e) {
            return null;
        }
    }

    protected Date getLastModifiedValue(HttpCacheEntry entry) {
        Header dateHdr = entry.getFirstHeader("Last-Modified");
        if (dateHdr == null) {
            return null;
        }
        try {
            return DateUtils.parseDate(dateHdr.getValue());
        } catch (DateParseException e) {
            return null;
        }
    }

    protected long getContentLengthValue(HttpCacheEntry entry) {
        Header cl = entry.getFirstHeader("Content-Length");
        if (cl == null) {
            return -1L;
        }
        try {
            return Long.parseLong(cl.getValue());
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    protected boolean hasContentLengthHeader(HttpCacheEntry entry) {
        return entry.getFirstHeader("Content-Length") != null;
    }

    public boolean contentLengthHeaderMatchesActualLength(HttpCacheEntry entry) {
        return !hasContentLengthHeader(entry) || getContentLengthValue(entry) == entry.getResource().length();
    }

    protected long getApparentAgeSecs(HttpCacheEntry entry) {
        Date dateValue = getDateValue(entry);
        if (dateValue == null) {
            return MAX_AGE;
        }
        long diff = entry.getResponseDate().getTime() - dateValue.getTime();
        if (diff < 0) {
            return 0L;
        }
        return diff / 1000;
    }

    protected long getAgeValue(HttpCacheEntry entry) {
        long hdrAge;
        long ageValue = 0;
        Header[] arr$ = entry.getHeaders("Age");
        for (Header hdr : arr$) {
            try {
                hdrAge = Long.parseLong(hdr.getValue());
                if (hdrAge < 0) {
                    hdrAge = MAX_AGE;
                }
            } catch (NumberFormatException e) {
                hdrAge = MAX_AGE;
            }
            if (hdrAge > ageValue) {
                ageValue = hdrAge;
            }
        }
        return ageValue;
    }

    protected long getCorrectedReceivedAgeSecs(HttpCacheEntry entry) {
        long apparentAge = getApparentAgeSecs(entry);
        long ageValue = getAgeValue(entry);
        return apparentAge > ageValue ? apparentAge : ageValue;
    }

    protected long getResponseDelaySecs(HttpCacheEntry entry) {
        long diff = entry.getResponseDate().getTime() - entry.getRequestDate().getTime();
        return diff / 1000;
    }

    protected long getCorrectedInitialAgeSecs(HttpCacheEntry entry) {
        return getCorrectedReceivedAgeSecs(entry) + getResponseDelaySecs(entry);
    }

    protected long getResidentTimeSecs(HttpCacheEntry entry, Date now) {
        long diff = now.getTime() - entry.getResponseDate().getTime();
        return diff / 1000;
    }

    protected long getMaxAge(HttpCacheEntry entry) {
        long maxage = -1;
        Header[] arr$ = entry.getHeaders("Cache-Control");
        for (Header hdr : arr$) {
            HeaderElement[] arr$2 = hdr.getElements();
            for (HeaderElement elt : arr$2) {
                if ("max-age".equals(elt.getName()) || "s-maxage".equals(elt.getName())) {
                    try {
                        long currMaxAge = Long.parseLong(elt.getValue());
                        if (maxage == -1 || currMaxAge < maxage) {
                            maxage = currMaxAge;
                        }
                    } catch (NumberFormatException e) {
                        maxage = 0;
                    }
                }
            }
        }
        return maxage;
    }

    protected Date getExpirationDate(HttpCacheEntry entry) {
        Header expiresHeader = entry.getFirstHeader("Expires");
        if (expiresHeader == null) {
            return null;
        }
        try {
            return DateUtils.parseDate(expiresHeader.getValue());
        } catch (DateParseException e) {
            return null;
        }
    }

    public boolean hasCacheControlDirective(HttpCacheEntry entry, String directive) {
        Header[] arr$ = entry.getHeaders("Cache-Control");
        for (Header h : arr$) {
            HeaderElement[] arr$2 = h.getElements();
            for (HeaderElement elt : arr$2) {
                if (directive.equalsIgnoreCase(elt.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public long getStalenessSecs(HttpCacheEntry entry, Date now) {
        long age = getCurrentAgeSecs(entry, now);
        long freshness = getFreshnessLifetimeSecs(entry);
        if (age <= freshness) {
            return 0L;
        }
        return age - freshness;
    }
}
