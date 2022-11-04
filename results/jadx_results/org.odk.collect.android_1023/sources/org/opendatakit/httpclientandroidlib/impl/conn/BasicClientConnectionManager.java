package org.opendatakit.httpclientandroidlib.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.annotation.GuardedBy;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest;
import org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.conn.scheme.SchemeRegistry;
@ThreadSafe
/* loaded from: classes.dex */
public class BasicClientConnectionManager implements ClientConnectionManager {
    private static final AtomicLong COUNTER = new AtomicLong();
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    @GuardedBy("this")
    private ManagedClientConnectionImpl conn;
    private final ClientConnectionOperator connOperator;
    private final Log log;
    @GuardedBy("this")
    private HttpPoolEntry poolEntry;
    private final SchemeRegistry schemeRegistry;
    @GuardedBy("this")
    private volatile boolean shutdown;

    public BasicClientConnectionManager(SchemeRegistry schreg) {
        this.log = LogFactory.getLog(getClass());
        if (schreg == null) {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
        this.schemeRegistry = schreg;
        this.connOperator = createConnectionOperator(schreg);
    }

    public BasicClientConnectionManager() {
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

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute route, final Object state) {
        return new ClientConnectionRequest() { // from class: org.opendatakit.httpclientandroidlib.impl.conn.BasicClientConnectionManager.1
            @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long timeout, TimeUnit tunit) {
                return BasicClientConnectionManager.this.getConnection(route, state);
            }
        };
    }

    private void assertNotShutdown() {
        if (this.shutdown) {
            throw new IllegalStateException("Connection manager has been shut down");
        }
    }

    ManagedClientConnection getConnection(HttpRoute route, Object state) {
        ManagedClientConnectionImpl managedClientConnectionImpl;
        if (route == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        assertNotShutdown();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Get connection for route " + route);
        }
        synchronized (this) {
            if (this.conn != null) {
                throw new IllegalStateException(MISUSE_MESSAGE);
            }
            if (this.poolEntry != null && !this.poolEntry.getPlannedRoute().equals(route)) {
                this.poolEntry.close();
                this.poolEntry = null;
            }
            if (this.poolEntry == null) {
                String id = Long.toString(COUNTER.getAndIncrement());
                OperatedClientConnection conn = this.connOperator.createConnection();
                this.poolEntry = new HttpPoolEntry(this.log, id, route, conn, 0L, TimeUnit.MILLISECONDS);
            }
            long now = System.currentTimeMillis();
            if (this.poolEntry.isExpired(now)) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
            this.conn = new ManagedClientConnectionImpl(this, this.connOperator, this.poolEntry);
            managedClientConnectionImpl = this.conn;
        }
        return managedClientConnectionImpl;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection conn, long keepalive, TimeUnit tunit) {
        String s;
        assertNotShutdown();
        if (!(conn instanceof ManagedClientConnectionImpl)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager");
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection " + conn);
        }
        ManagedClientConnectionImpl managedConn = (ManagedClientConnectionImpl) conn;
        synchronized (managedConn) {
            if (managedConn.getPoolEntry() != null) {
                ClientConnectionManager manager = managedConn.getManager();
                if (manager != null && manager != this) {
                    throw new IllegalStateException("Connection not obtained from this manager");
                }
                synchronized (this) {
                    if (managedConn.isOpen() && !managedConn.isMarkedReusable()) {
                        try {
                            managedConn.shutdown();
                        } catch (IOException iox) {
                            if (this.log.isDebugEnabled()) {
                                this.log.debug("I/O exception shutting down released connection", iox);
                            }
                        }
                    }
                    this.poolEntry.updateExpiry(keepalive, tunit != null ? tunit : TimeUnit.MILLISECONDS);
                    if (this.log.isDebugEnabled()) {
                        if (keepalive > 0) {
                            s = "for " + keepalive + XFormAnswerDataSerializer.DELIMITER + tunit;
                        } else {
                            s = "indefinitely";
                        }
                        this.log.debug("Connection can be kept alive " + s);
                    }
                    managedConn.detach();
                    this.conn = null;
                    if (this.poolEntry.isClosed()) {
                        this.poolEntry = null;
                    }
                }
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        assertNotShutdown();
        synchronized (this) {
            long now = System.currentTimeMillis();
            if (this.poolEntry != null && this.poolEntry.isExpired(now)) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void closeIdleConnections(long idletime, TimeUnit tunit) {
        if (tunit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        assertNotShutdown();
        synchronized (this) {
            long time = tunit.toMillis(idletime);
            if (time < 0) {
                time = 0;
            }
            long deadline = System.currentTimeMillis() - time;
            if (this.poolEntry != null && this.poolEntry.getUpdated() <= deadline) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager
    public void shutdown() {
        this.shutdown = true;
        synchronized (this) {
            if (this.poolEntry != null) {
                this.poolEntry.close();
            }
            this.poolEntry = null;
            this.conn = null;
        }
    }
}
