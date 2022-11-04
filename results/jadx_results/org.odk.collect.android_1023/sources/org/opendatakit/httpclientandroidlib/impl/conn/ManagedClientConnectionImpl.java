package org.opendatakit.httpclientandroidlib.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.opendatakit.httpclientandroidlib.HttpConnectionMetrics;
import org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest;
import org.opendatakit.httpclientandroidlib.HttpException;
import org.opendatakit.httpclientandroidlib.HttpHost;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionManager;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator;
import org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.conn.routing.RouteTracker;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
@NotThreadSafe
/* loaded from: classes.dex */
class ManagedClientConnectionImpl implements ManagedClientConnection {
    private volatile long duration;
    private final ClientConnectionManager manager;
    private final ClientConnectionOperator operator;
    private volatile HttpPoolEntry poolEntry;
    private volatile boolean reusable;

    public ManagedClientConnectionImpl(ClientConnectionManager manager, ClientConnectionOperator operator, HttpPoolEntry entry) {
        if (manager == null) {
            throw new IllegalArgumentException("Connection manager may not be null");
        }
        if (operator == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        if (entry == null) {
            throw new IllegalArgumentException("HTTP pool entry may not be null");
        }
        this.manager = manager;
        this.operator = operator;
        this.poolEntry = entry;
        this.reusable = false;
        this.duration = Long.MAX_VALUE;
    }

    public HttpPoolEntry getPoolEntry() {
        return this.poolEntry;
    }

    public HttpPoolEntry detach() {
        HttpPoolEntry local = this.poolEntry;
        this.poolEntry = null;
        return local;
    }

    public ClientConnectionManager getManager() {
        return this.manager;
    }

    private OperatedClientConnection getConnection() {
        HttpPoolEntry local = this.poolEntry;
        if (local == null) {
            return null;
        }
        return local.getConnection();
    }

    private OperatedClientConnection ensureConnection() {
        HttpPoolEntry local = this.poolEntry;
        if (local == null) {
            throw new ConnectionShutdownException();
        }
        return local.getConnection();
    }

    private HttpPoolEntry ensurePoolEntry() {
        HttpPoolEntry local = this.poolEntry;
        if (local == null) {
            throw new ConnectionShutdownException();
        }
        return local;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        HttpPoolEntry local = this.poolEntry;
        if (local != null) {
            OperatedClientConnection conn = local.getConnection();
            local.getTracker().reset();
            conn.close();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection
    public void shutdown() throws IOException {
        HttpPoolEntry local = this.poolEntry;
        if (local != null) {
            OperatedClientConnection conn = local.getConnection();
            local.getTracker().reset();
            conn.shutdown();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection
    public boolean isOpen() {
        OperatedClientConnection conn = getConnection();
        if (conn != null) {
            return conn.isOpen();
        }
        return false;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection
    public boolean isStale() {
        OperatedClientConnection conn = getConnection();
        if (conn != null) {
            return conn.isStale();
        }
        return true;
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection
    public void setSocketTimeout(int timeout) {
        OperatedClientConnection conn = ensureConnection();
        conn.setSocketTimeout(timeout);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection
    public int getSocketTimeout() {
        OperatedClientConnection conn = ensureConnection();
        return conn.getSocketTimeout();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        OperatedClientConnection conn = ensureConnection();
        return conn.getMetrics();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpClientConnection
    public void flush() throws IOException {
        OperatedClientConnection conn = ensureConnection();
        conn.flush();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpClientConnection
    public boolean isResponseAvailable(int timeout) throws IOException {
        OperatedClientConnection conn = ensureConnection();
        return conn.isResponseAvailable(timeout);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpClientConnection
    public void receiveResponseEntity(HttpResponse response) throws HttpException, IOException {
        OperatedClientConnection conn = ensureConnection();
        conn.receiveResponseEntity(response);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpClientConnection
    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        OperatedClientConnection conn = ensureConnection();
        return conn.receiveResponseHeader();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest request) throws HttpException, IOException {
        OperatedClientConnection conn = ensureConnection();
        conn.sendRequestEntity(request);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpClientConnection
    public void sendRequestHeader(HttpRequest request) throws HttpException, IOException {
        OperatedClientConnection conn = ensureConnection();
        conn.sendRequestHeader(request);
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpInetConnection
    public InetAddress getLocalAddress() {
        OperatedClientConnection conn = ensureConnection();
        return conn.getLocalAddress();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpInetConnection
    public int getLocalPort() {
        OperatedClientConnection conn = ensureConnection();
        return conn.getLocalPort();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpInetConnection
    public InetAddress getRemoteAddress() {
        OperatedClientConnection conn = ensureConnection();
        return conn.getRemoteAddress();
    }

    @Override // org.opendatakit.httpclientandroidlib.HttpInetConnection
    public int getRemotePort() {
        OperatedClientConnection conn = ensureConnection();
        return conn.getRemotePort();
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection, org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection
    public boolean isSecure() {
        OperatedClientConnection conn = ensureConnection();
        return conn.isSecure();
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection, org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection
    public SSLSession getSSLSession() {
        OperatedClientConnection conn = ensureConnection();
        Socket sock = conn.getSocket();
        if (!(sock instanceof SSLSocket)) {
            return null;
        }
        SSLSession result = ((SSLSocket) sock).getSession();
        return result;
    }

    public Object getAttribute(String id) {
        OperatedClientConnection conn = ensureConnection();
        if (conn instanceof HttpContext) {
            return ((HttpContext) conn).getAttribute(id);
        }
        return null;
    }

    public Object removeAttribute(String id) {
        OperatedClientConnection conn = ensureConnection();
        if (conn instanceof HttpContext) {
            return ((HttpContext) conn).removeAttribute(id);
        }
        return null;
    }

    public void setAttribute(String id, Object obj) {
        OperatedClientConnection conn = ensureConnection();
        if (conn instanceof HttpContext) {
            ((HttpContext) conn).setAttribute(id, obj);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection, org.opendatakit.httpclientandroidlib.conn.HttpRoutedConnection
    public HttpRoute getRoute() {
        HttpPoolEntry local = ensurePoolEntry();
        return local.getEffectiveRoute();
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void open(HttpRoute route, HttpContext context, HttpParams params) throws IOException {
        OperatedClientConnection conn;
        if (route == null) {
            throw new IllegalArgumentException("Route may not be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            if (this.poolEntry.getTracker().isConnected()) {
                throw new IllegalStateException("Connection already open");
            }
            conn = this.poolEntry.getConnection();
        }
        HttpHost proxy = route.getProxyHost();
        this.operator.openConnection(conn, proxy != null ? proxy : route.getTargetHost(), route.getLocalAddress(), context, params);
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new InterruptedIOException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            if (proxy == null) {
                tracker.connectTarget(conn.isSecure());
            } else {
                tracker.connectProxy(proxy, conn.isSecure());
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void tunnelTarget(boolean secure, HttpParams params) throws IOException {
        HttpHost target;
        OperatedClientConnection conn;
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            if (!tracker.isConnected()) {
                throw new IllegalStateException("Connection not open");
            }
            if (tracker.isTunnelled()) {
                throw new IllegalStateException("Connection is already tunnelled");
            }
            target = tracker.getTargetHost();
            conn = this.poolEntry.getConnection();
        }
        conn.update(null, target, secure, params);
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new InterruptedIOException();
            }
            this.poolEntry.getTracker().tunnelTarget(secure);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void tunnelProxy(HttpHost next, boolean secure, HttpParams params) throws IOException {
        OperatedClientConnection conn;
        if (next == null) {
            throw new IllegalArgumentException("Next proxy amy not be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            if (!tracker.isConnected()) {
                throw new IllegalStateException("Connection not open");
            }
            conn = this.poolEntry.getConnection();
        }
        conn.update(null, next, secure, params);
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new InterruptedIOException();
            }
            RouteTracker tracker2 = this.poolEntry.getTracker();
            tracker2.tunnelProxy(next, secure);
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void layerProtocol(HttpContext context, HttpParams params) throws IOException {
        HttpHost target;
        OperatedClientConnection conn;
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            if (!tracker.isConnected()) {
                throw new IllegalStateException("Connection not open");
            }
            if (!tracker.isTunnelled()) {
                throw new IllegalStateException("Protocol layering without a tunnel not supported");
            }
            if (tracker.isLayered()) {
                throw new IllegalStateException("Multiple protocol layering not supported");
            }
            target = tracker.getTargetHost();
            conn = this.poolEntry.getConnection();
        }
        this.operator.updateSecureConnection(conn, target, context, params);
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new InterruptedIOException();
            }
            this.poolEntry.getTracker().layerProtocol(conn.isSecure());
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public Object getState() {
        HttpPoolEntry local = ensurePoolEntry();
        return local.getState();
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void setState(Object state) {
        HttpPoolEntry local = ensurePoolEntry();
        local.setState(state);
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void markReusable() {
        this.reusable = true;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void unmarkReusable() {
        this.reusable = false;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public boolean isMarkedReusable() {
        return this.reusable;
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ManagedClientConnection
    public void setIdleDuration(long duration, TimeUnit unit) {
        if (duration > 0) {
            this.duration = unit.toMillis(duration);
        } else {
            this.duration = -1L;
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        synchronized (this) {
            if (this.poolEntry != null) {
                this.manager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
                this.poolEntry = null;
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        synchronized (this) {
            if (this.poolEntry != null) {
                this.reusable = false;
                OperatedClientConnection conn = this.poolEntry.getConnection();
                try {
                    conn.shutdown();
                } catch (IOException e) {
                }
                this.manager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
                this.poolEntry = null;
            }
        }
    }
}
