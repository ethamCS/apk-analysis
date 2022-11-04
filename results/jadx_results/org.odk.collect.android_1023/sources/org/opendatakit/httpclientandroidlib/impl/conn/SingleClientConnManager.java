package org.opendatakit.httpclientandroidlib.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.GuardedBy;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest;
import org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.conn.routing.RouteTracker;
import org.opendatakit.httpclientandroidlib.conn.scheme.SchemeRegistry;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@ThreadSafe
@Deprecated
/* loaded from: classes.dex */
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected final boolean alwaysShutDown;
    protected final ClientConnectionOperator connOperator;
    @GuardedBy("this")
    protected volatile long connectionExpiresTime;
    protected volatile boolean isShutDown;
    @GuardedBy("this")
    protected volatile long lastReleaseTime;
    private final Log log;
    @GuardedBy("this")
    protected volatile ConnAdapter managedConn;
    protected final SchemeRegistry schemeRegistry;
    @GuardedBy("this")
    protected volatile PoolEntry uniquePoolEntry;

    public SingleClientConnManager(HttpParams params, SchemeRegistry schreg) {
        this(schreg);
    }

    public SingleClientConnManager(SchemeRegistry schreg) {
        this.log = LogFactory.getLog(getClass());
        if (schreg == null) {
            throw new IllegalArgumentException("Scheme registry must not be null.");
        }
        this.schemeRegistry = schreg;
        this.connOperator = createConnectionOperator(schreg);
        this.uniquePoolEntry = new PoolEntry();
        this.managedConn = null;
        this.lastReleaseTime = -1L;
        this.alwaysShutDown = false;
        this.isShutDown = false;
    }

    public SingleClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    protected void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg) {
        return new DefaultClientConnectionOperator(schreg);
    }

    protected final void assertStillUp() throws IllegalStateException {
        if (this.isShutDown) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute route, final Object state) {
        return new ClientConnectionRequest() { // from class: org.opendatakit.httpclientandroidlib.impl.conn.SingleClientConnManager.1
            @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long timeout, TimeUnit tunit) {
                return SingleClientConnManager.this.getConnection(route, state);
            }
        };
    }

    public ManagedClientConnection getConnection(HttpRoute route, Object state) {
        ConnAdapter connAdapter;
        if (route == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        assertStillUp();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Get connection for route " + route);
        }
        synchronized (this) {
            if (this.managedConn != null) {
                throw new IllegalStateException(MISUSE_MESSAGE);
            }
            boolean recreate = false;
            boolean shutdown = false;
            closeExpiredConnections();
            if (this.uniquePoolEntry.connection.isOpen()) {
                RouteTracker tracker = this.uniquePoolEntry.tracker;
                shutdown = tracker == null || !tracker.toRoute().equals(route);
            } else {
                recreate = true;
            }
            if (shutdown) {
                recreate = true;
                try {
                    this.uniquePoolEntry.shutdown();
                } catch (IOException iox) {
                    this.log.debug("Problem shutting down connection.", iox);
                }
            }
            if (recreate) {
                this.uniquePoolEntry = new PoolEntry();
            }
            this.managedConn = new ConnAdapter(this.uniquePoolEntry, route);
            connAdapter = this.managedConn;
        }
        return connAdapter;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection conn, long validDuration, TimeUnit timeUnit) {
        assertStillUp();
        if (!(conn instanceof ConnAdapter)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager.");
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection " + conn);
        }
        ConnAdapter sca = (ConnAdapter) conn;
        synchronized (sca) {
            if (sca.poolEntry == null) {
                return;
            }
            ClientConnectionManager manager = sca.getManager();
            if (manager != null && manager != this) {
                throw new IllegalArgumentException("Connection not obtained from this manager.");
            }
            try {
                if (sca.isOpen() && (this.alwaysShutDown || !sca.isMarkedReusable())) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Released connection open but not reusable.");
                    }
                    sca.shutdown();
                }
                sca.detach();
                synchronized (this) {
                    this.managedConn = null;
                    this.lastReleaseTime = System.currentTimeMillis();
                    if (validDuration > 0) {
                        this.connectionExpiresTime = timeUnit.toMillis(validDuration) + this.lastReleaseTime;
                    } else {
                        this.connectionExpiresTime = Long.MAX_VALUE;
                    }
                }
            } catch (IOException iox) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Exception shutting down released connection.", iox);
                }
                sca.detach();
                synchronized (this) {
                    this.managedConn = null;
                    this.lastReleaseTime = System.currentTimeMillis();
                    if (validDuration > 0) {
                        this.connectionExpiresTime = timeUnit.toMillis(validDuration) + this.lastReleaseTime;
                    } else {
                        this.connectionExpiresTime = Long.MAX_VALUE;
                    }
                }
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        long time = this.connectionExpiresTime;
        if (System.currentTimeMillis() >= time) {
            closeIdleConnections(0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void closeIdleConnections(long idletime, TimeUnit tunit) {
        assertStillUp();
        if (tunit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        synchronized (this) {
            if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
                long cutoff = System.currentTimeMillis() - tunit.toMillis(idletime);
                if (this.lastReleaseTime <= cutoff) {
                    try {
                        this.uniquePoolEntry.close();
                    } catch (IOException iox) {
                        this.log.debug("Problem closing idle connection.", iox);
                    }
                }
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void shutdown() {
        this.isShutDown = true;
        synchronized (this) {
            try {
                if (this.uniquePoolEntry != null) {
                    this.uniquePoolEntry.shutdown();
                }
                this.uniquePoolEntry = null;
                this.managedConn = null;
            } catch (IOException iox) {
                this.log.debug("Problem while shutting down manager.", iox);
                this.uniquePoolEntry = null;
                this.managedConn = null;
            }
        }
    }

    protected void revokeConnection() {
        ConnAdapter conn = this.managedConn;
        if (conn != null) {
            conn.detach();
            synchronized (this) {
                try {
                    this.uniquePoolEntry.shutdown();
                } catch (IOException iox) {
                    this.log.debug("Problem while shutting down connection.", iox);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class PoolEntry extends AbstractPoolEntry {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected PoolEntry() {
            super(r3.connOperator, null);
            SingleClientConnManager.this = r3;
        }

        protected void close() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        protected void shutdown() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public class ConnAdapter extends AbstractPooledConnAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected ConnAdapter(PoolEntry entry, HttpRoute route) {
            super(r1, entry);
            SingleClientConnManager.this = r1;
            markReusable();
            entry.route = route;
        }
    }
}
