package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.util.LinkedHashMap;
import java.util.Map;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
/* loaded from: classes.dex */
final class CacheMap extends LinkedHashMap<String, HttpCacheEntry> {
    private static final long serialVersionUID = -7750025207539768511L;
    private final int maxEntries;

    public CacheMap(int maxEntries) {
        super(20, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<String, HttpCacheEntry> eldest) {
        return size() > this.maxEntries;
    }
}
