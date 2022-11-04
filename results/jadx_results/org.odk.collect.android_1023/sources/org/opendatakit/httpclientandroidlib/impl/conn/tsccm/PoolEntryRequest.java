package org.opendatakit.httpclientandroidlib.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;
import org.opendatakit.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
@Deprecated
/* loaded from: classes.dex */
public interface PoolEntryRequest {
    void abortRequest();

    BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException;
}
