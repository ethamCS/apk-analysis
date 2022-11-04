package org.opendatakit.httpclientandroidlib.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.conn.routing.RouteTracker;
import org.opendatakit.httpclientandroidlib.pool.PoolEntry;
/* loaded from: classes.dex */
class HttpPoolEntry extends PoolEntry<HttpRoute, OperatedClientConnection> {
    private final Log log;
    private final RouteTracker tracker;

    public HttpPoolEntry(Log log, String id, HttpRoute route, OperatedClientConnection conn, long timeToLive, TimeUnit tunit) {
        super(id, route, conn, timeToLive, tunit);
        this.log = log;
        this.tracker = new RouteTracker(route);
    }

    @Override // org.opendatakit.httpclientandroidlib.pool.PoolEntry
    public boolean isExpired(long now) {
        boolean expired = super.isExpired(now);
        if (expired && this.log.isDebugEnabled()) {
            this.log.debug("Connection " + this + " expired @ " + new Date(getExpiry()));
        }
        return expired;
    }

    public RouteTracker getTracker() {
        return this.tracker;
    }

    public HttpRoute getPlannedRoute() {
        return getRoute();
    }

    public HttpRoute getEffectiveRoute() {
        return this.tracker.toRoute();
    }

    @Override // org.opendatakit.httpclientandroidlib.pool.PoolEntry
    public boolean isClosed() {
        OperatedClientConnection conn = getConnection();
        return !conn.isOpen();
    }

    @Override // org.opendatakit.httpclientandroidlib.pool.PoolEntry
    public void close() {
        OperatedClientConnection conn = getConnection();
        try {
            conn.close();
        } catch (IOException ex) {
            this.log.debug("I/O error closing connection", ex);
        }
    }
}
