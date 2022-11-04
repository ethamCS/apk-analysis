package org.opendatakit.httpclientandroidlib.client.cache;

import java.io.IOException;
/* loaded from: classes.dex */
public interface HttpCacheStorage {
    HttpCacheEntry getEntry(String str) throws IOException;

    void putEntry(String str, HttpCacheEntry httpCacheEntry) throws IOException;

    void removeEntry(String str) throws IOException;

    void updateEntry(String str, HttpCacheUpdateCallback httpCacheUpdateCallback) throws IOException, HttpCacheUpdateException;
}
