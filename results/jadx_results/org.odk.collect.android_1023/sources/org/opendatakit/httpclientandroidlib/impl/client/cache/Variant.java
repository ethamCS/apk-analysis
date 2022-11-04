package org.opendatakit.httpclientandroidlib.impl.client.cache;

import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
/* loaded from: classes.dex */
class Variant {
    private final String cacheKey;
    private final HttpCacheEntry entry;
    private final String variantKey;

    public Variant(String variantKey, String cacheKey, HttpCacheEntry entry) {
        this.variantKey = variantKey;
        this.cacheKey = cacheKey;
        this.entry = entry;
    }

    public String getVariantKey() {
        return this.variantKey;
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public HttpCacheEntry getEntry() {
        return this.entry;
    }
}
