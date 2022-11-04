package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheEntry;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage;
import org.opendatakit.httpclientandroidlib.client.cache.HttpCacheUpdateCallback;
@ThreadSafe
/* loaded from: classes.dex */
public class BasicHttpCacheStorage implements HttpCacheStorage {
    private final CacheMap entries;

    public BasicHttpCacheStorage(CacheConfig config) {
        this.entries = new CacheMap(config.getMaxCacheEntries());
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage
    public synchronized void putEntry(String url, HttpCacheEntry entry) throws IOException {
        this.entries.put(url, entry);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage
    public synchronized HttpCacheEntry getEntry(String url) throws IOException {
        return this.entries.get(url);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage
    public synchronized void removeEntry(String url) throws IOException {
        this.entries.remove(url);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.HttpCacheStorage
    public synchronized void updateEntry(String url, HttpCacheUpdateCallback callback) throws IOException {
        HttpCacheEntry existingEntry = this.entries.get(url);
        this.entries.put(url, callback.update(existingEntry));
    }
}
