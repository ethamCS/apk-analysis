package org.opendatakit.httpclientandroidlib.conn;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public interface ClientConnectionRequest {
    void abortRequest();

    ManagedClientConnection getConnection(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException;
}
