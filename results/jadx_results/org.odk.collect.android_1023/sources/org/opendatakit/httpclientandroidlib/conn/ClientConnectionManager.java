package org.opendatakit.httpclientandroidlib.conn;

import java.util.concurrent.TimeUnit;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.conn.scheme.SchemeRegistry;
/* loaded from: classes.dex */
public interface ClientConnectionManager {
    void closeExpiredConnections();

    void closeIdleConnections(long j, TimeUnit timeUnit);

    SchemeRegistry getSchemeRegistry();

    void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit);

    ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj);

    void shutdown();
}
