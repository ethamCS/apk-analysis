package org.opendatakit.httpclientandroidlib.impl.pool;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.HttpClientConnection;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.pool.PoolEntry;
@ThreadSafe
/* loaded from: classes.dex */
public class BasicPoolEntry extends PoolEntry<HttpHost, HttpClientConnection> {
    public BasicPoolEntry(String id, HttpHost route, HttpClientConnection conn) {
        super(id, route, conn);
    }

    @Override // org.opendatakit.httpclientandroidlib.pool.PoolEntry
    public void close() {
        try {
            getConnection().close();
        } catch (IOException e) {
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.pool.PoolEntry
    public boolean isClosed() {
        return !getConnection().isOpen();
    }
}
