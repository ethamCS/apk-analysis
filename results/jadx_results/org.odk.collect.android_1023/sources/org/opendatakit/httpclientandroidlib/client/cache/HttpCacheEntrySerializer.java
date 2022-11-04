package org.opendatakit.httpclientandroidlib.client.cache;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public interface HttpCacheEntrySerializer {
    HttpCacheEntry readFrom(InputStream inputStream) throws IOException;

    void writeTo(HttpCacheEntry httpCacheEntry, OutputStream outputStream) throws IOException;
}
