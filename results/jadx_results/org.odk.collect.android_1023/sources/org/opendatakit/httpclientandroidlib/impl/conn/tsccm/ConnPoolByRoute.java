package org.opendatakit.httpclientandroidlib.impl.conn.tsccm;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionOperator;
import org.opendatakit.httpclientandroidlib.conn.ConnectionPoolTimeoutException;
import org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection;
import org.opendatakit.httpclientandroidlib.conn.params.ConnManagerParams;
import org.opendatakit.httpclientandroidlib.conn.params.ConnPerRoute;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
import org.opendatakit.httpclientandroidlib.params.HttpParams;
@Deprecated
/* loaded from: classes.dex */
public class ConnPoolByRoute extends AbstractConnPool {
    protected final ConnPerRoute connPerRoute;
    private final long connTTL;
    private final TimeUnit connTTLTimeUnit;
    protected final Queue<BasicPoolEntry> freeConnections;
    protected final Set<BasicPoolEntry> leasedConnections;
    private final Log log;
    protected volatile int maxTotalConnections;
    protected volatile int numConnections;
    protected final ClientConnectionOperator operator;
    private final Lock poolLock;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected volatile boolean shutdown;
    protected final Queue<WaitingThread> waitingThreads;

    public ConnPoolByRoute(ClientConnectionOperator operator, ConnPerRoute connPerRoute, int maxTotalConnections) {
        this(operator, connPerRoute, maxTotalConnections, -1L, TimeUnit.MILLISECONDS);
    }

    public ConnPoolByRoute(ClientConnectionOperator operator, ConnPerRoute connPerRoute, int maxTotalConnections, long connTTL, TimeUnit connTTLTimeUnit) {
        this.log = LogFactory.getLog(getClass());
        if (operator == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        if (connPerRoute == null) {
            throw new IllegalArgumentException("Connections per route may not be null");
        }
        this.poolLock = super.poolLock;
        this.leasedConnections = super.leasedConnections;
        this.operator = operator;
        this.connPerRoute = connPerRoute;
        this.maxTotalConnections = maxTotalConnections;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.connTTL = connTTL;
        this.connTTLTimeUnit = connTTLTimeUnit;
    }

    protected Lock getLock() {
        return this.poolLock;
    }

    public ConnPoolByRoute(ClientConnectionOperator operator, HttpParams params) {
        this(operator, ConnManagerParams.getMaxConnectionsPerRoute(params), ConnManagerParams.getMaxTotalConnections(params));
    }

    protected Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    protected Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    protected Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    protected RouteSpecificPool newRouteSpecificPool(HttpRoute route) {
        return new RouteSpecificPool(route, this.connPerRoute);
    }

    protected WaitingThread newWaitingThread(Condition cond, RouteSpecificPool rospl) {
        return new WaitingThread(cond, rospl);
    }

    private void closeConnection(BasicPoolEntry entry) {
        OperatedClientConnection conn = entry.getConnection();
        if (conn != null) {
            try {
                conn.close();
            } catch (IOException ex) {
                this.log.debug("I/O error closing connection", ex);
            }
        }
    }

    protected RouteSpecificPool getRoutePool(HttpRoute route, boolean create) {
        this.poolLock.lock();
        try {
            RouteSpecificPool rospl = this.routeToPool.get(route);
            if (rospl == null && create) {
                rospl = newRouteSpecificPool(route);
                this.routeToPool.put(route, rospl);
            }
            return rospl;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute route) {
        int i = 0;
        this.poolLock.lock();
        try {
            RouteSpecificPool rospl = getRoutePool(route, false);
            if (rospl != null) {
                i = rospl.getEntryCount();
            }
            return i;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool() {
        this.poolLock.lock();
        try {
            return this.numConnections;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(final HttpRoute route, final Object state) {
        final WaitingThreadAborter aborter = new WaitingThreadAborter();
        return new PoolEntryRequest() { // from class: org.opendatakit.httpclientandroidlib.impl.conn.tsccm.ConnPoolByRoute.1
            @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.PoolEntryRequest
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    aborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.PoolEntryRequest
            public BasicPoolEntry getPoolEntry(long timeout, TimeUnit tunit) throws InterruptedException, ConnectionPoolTimeoutException {
                return ConnPoolByRoute.this.getEntryBlocking(route, state, timeout, tunit, aborter);
            }
        };
    }

    protected BasicPoolEntry getEntryBlocking(HttpRoute route, Object state, long timeout, TimeUnit tunit, WaitingThreadAborter aborter) throws ConnectionPoolTimeoutException, InterruptedException {
        Date deadline = null;
        if (timeout > 0) {
            deadline = new Date(System.currentTimeMillis() + tunit.toMillis(timeout));
        }
        BasicPoolEntry entry = null;
        this.poolLock.lock();
        try {
            RouteSpecificPool rospl = getRoutePool(route, true);
            WaitingThread waitingThread = null;
            while (entry == null) {
                if (this.shutdown) {
                    throw new IllegalStateException("Connection pool shut down");
                }
                if (this.log.isDebugEnabled()) {
                    this.log.debug("[" + route + "] total kept alive: " + this.freeConnections.size() + ", total issued: " + this.leasedConnections.size() + ", total allocated: " + this.numConnections + " out of " + this.maxTotalConnections);
                }
                entry = getFreeEntry(rospl, state);
                if (entry != null) {
                    break;
                }
                boolean hasCapacity = rospl.getCapacity() > 0;
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Available capacity: " + rospl.getCapacity() + " out of " + rospl.getMaxEntries() + " [" + route + "][" + state + "]");
                }
                if (hasCapacity && this.numConnections < this.maxTotalConnections) {
                    entry = createEntry(rospl, this.operator);
                } else if (hasCapacity && !this.freeConnections.isEmpty()) {
                    deleteLeastUsedEntry();
                    rospl = getRoutePool(route, true);
                    entry = createEntry(rospl, this.operator);
                } else {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Need to wait for connection [" + route + "][" + state + "]");
                    }
                    if (waitingThread == null) {
                        waitingThread = newWaitingThread(this.poolLock.newCondition(), rospl);
                        aborter.setWaitingThread(waitingThread);
                    }
                    rospl.queueThread(waitingThread);
                    this.waitingThreads.add(waitingThread);
                    boolean success = waitingThread.await(deadline);
                    rospl.removeThread(waitingThread);
                    this.waitingThreads.remove(waitingThread);
                    if (!success && deadline != null && deadline.getTime() <= System.currentTimeMillis()) {
                        throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                    }
                }
            }
            return entry;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry entry, boolean reusable, long validDuration, TimeUnit timeUnit) {
        String s;
        HttpRoute route = entry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection [" + route + "][" + entry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                closeConnection(entry);
                return;
            }
            this.leasedConnections.remove(entry);
            RouteSpecificPool rospl = getRoutePool(route, true);
            if (reusable && rospl.getCapacity() >= 0) {
                if (this.log.isDebugEnabled()) {
                    if (validDuration > 0) {
                        s = "for " + validDuration + XFormAnswerDataSerializer.DELIMITER + timeUnit;
                    } else {
                        s = "indefinitely";
                    }
                    this.log.debug("Pooling connection [" + route + "][" + entry.getState() + "]; keep alive " + s);
                }
                rospl.freeEntry(entry);
                entry.updateExpiry(validDuration, timeUnit);
                this.freeConnections.add(entry);
            } else {
                closeConnection(entry);
                rospl.dropEntry();
                this.numConnections--;
            }
            notifyWaitingThread(rospl);
        } finally {
            this.poolLock.unlock();
        }
    }

    protected BasicPoolEntry getFreeEntry(RouteSpecificPool rospl, Object state) {
        BasicPoolEntry entry = null;
        this.poolLock.lock();
        boolean done = false;
        while (!done) {
            try {
                entry = rospl.allocEntry(state);
                if (entry != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + rospl.getRoute() + "][" + state + "]");
                    }
                    this.freeConnections.remove(entry);
                    if (entry.isExpired(System.currentTimeMillis())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + rospl.getRoute() + "][" + state + "]");
                        }
                        closeConnection(entry);
                        rospl.dropEntry();
                        this.numConnections--;
                    } else {
                        this.leasedConnections.add(entry);
                        done = true;
                    }
                } else {
                    done = true;
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("No free connections [" + rospl.getRoute() + "][" + state + "]");
                    }
                }
            } finally {
                this.poolLock.unlock();
            }
        }
        return entry;
    }

    protected BasicPoolEntry createEntry(RouteSpecificPool rospl, ClientConnectionOperator op) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + rospl.getRoute() + "]");
        }
        BasicPoolEntry entry = new BasicPoolEntry(op, rospl.getRoute(), this.connTTL, this.connTTLTimeUnit);
        this.poolLock.lock();
        try {
            rospl.createdEntry(entry);
            this.numConnections++;
            this.leasedConnections.add(entry);
            return entry;
        } finally {
            this.poolLock.unlock();
        }
    }

    protected void deleteEntry(BasicPoolEntry entry) {
        HttpRoute route = entry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + route + "][" + entry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(entry);
            RouteSpecificPool rospl = getRoutePool(route, true);
            rospl.deleteEntry(entry);
            this.numConnections--;
            if (rospl.isUnused()) {
                this.routeToPool.remove(route);
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    protected void deleteLeastUsedEntry() {
        this.poolLock.lock();
        try {
            BasicPoolEntry entry = this.freeConnections.remove();
            if (entry != null) {
                deleteEntry(entry);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    protected void handleLostEntry(HttpRoute route) {
        this.poolLock.lock();
        try {
            RouteSpecificPool rospl = getRoutePool(route, true);
            rospl.dropEntry();
            if (rospl.isUnused()) {
                this.routeToPool.remove(route);
            }
            this.numConnections--;
            notifyWaitingThread(rospl);
        } finally {
            this.poolLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0016, B:9:0x0038, B:11:0x003e, B:14:0x0047, B:16:0x004f, B:18:0x0057, B:19:0x005e, B:20:0x0069, B:22:0x0071), top: B:26:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void notifyWaitingThread(org.opendatakit.httpclientandroidlib.impl.conn.tsccm.RouteSpecificPool r6) {
        /*
            r5 = this;
            r1 = 0
            java.util.concurrent.locks.Lock r2 = r5.poolLock
            r2.lock()
            if (r6 == 0) goto L47
            boolean r2 = r6.hasThread()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L47
            org.opendatakit.httpclientandroidlib.androidextra.Log r2 = r5.log     // Catch: java.lang.Throwable -> L79
            boolean r2 = r2.isDebugEnabled()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L38
            org.opendatakit.httpclientandroidlib.androidextra.Log r2 = r5.log     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "Notifying thread waiting on pool ["
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L79
            org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute r4 = r6.getRoute()     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "]"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L79
            r2.debug(r3)     // Catch: java.lang.Throwable -> L79
        L38:
            org.opendatakit.httpclientandroidlib.impl.conn.tsccm.WaitingThread r1 = r6.nextThread()     // Catch: java.lang.Throwable -> L79
        L3c:
            if (r1 == 0) goto L41
            r1.wakeup()     // Catch: java.lang.Throwable -> L79
        L41:
            java.util.concurrent.locks.Lock r2 = r5.poolLock
            r2.unlock()
            return
        L47:
            java.util.Queue<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.WaitingThread> r2 = r5.waitingThreads     // Catch: java.lang.Throwable -> L79
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto L69
            org.opendatakit.httpclientandroidlib.androidextra.Log r2 = r5.log     // Catch: java.lang.Throwable -> L79
            boolean r2 = r2.isDebugEnabled()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L5e
            org.opendatakit.httpclientandroidlib.androidextra.Log r2 = r5.log     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "Notifying thread waiting on any pool"
            r2.debug(r3)     // Catch: java.lang.Throwable -> L79
        L5e:
            java.util.Queue<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.WaitingThread> r2 = r5.waitingThreads     // Catch: java.lang.Throwable -> L79
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L79
            r0 = r2
            org.opendatakit.httpclientandroidlib.impl.conn.tsccm.WaitingThread r0 = (org.opendatakit.httpclientandroidlib.impl.conn.tsccm.WaitingThread) r0     // Catch: java.lang.Throwable -> L79
            r1 = r0
            goto L3c
        L69:
            org.opendatakit.httpclientandroidlib.androidextra.Log r2 = r5.log     // Catch: java.lang.Throwable -> L79
            boolean r2 = r2.isDebugEnabled()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3c
            org.opendatakit.httpclientandroidlib.androidextra.Log r2 = r5.log     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "Notifying no-one, there are no waiting threads"
            r2.debug(r3)     // Catch: java.lang.Throwable -> L79
            goto L3c
        L79:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r5.poolLock
            r3.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opendatakit.httpclientandroidlib.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.opendatakit.httpclientandroidlib.impl.conn.tsccm.RouteSpecificPool):void");
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> iter = this.freeConnections.iterator();
            while (iter.hasNext()) {
                BasicPoolEntry entry = iter.next();
                if (!entry.getConnection().isOpen()) {
                    iter.remove();
                    deleteEntry(entry);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    public void closeIdleConnections(long idletime, TimeUnit tunit) {
        if (tunit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        if (idletime < 0) {
            idletime = 0;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + idletime + XFormAnswerDataSerializer.DELIMITER + tunit);
        }
        long deadline = System.currentTimeMillis() - tunit.toMillis(idletime);
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> iter = this.freeConnections.iterator();
            while (iter.hasNext()) {
                BasicPoolEntry entry = iter.next();
                if (entry.getUpdated() <= deadline) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection last used @ " + new Date(entry.getUpdated()));
                    }
                    iter.remove();
                    deleteEntry(entry);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        long now = System.currentTimeMillis();
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> iter = this.freeConnections.iterator();
            while (iter.hasNext()) {
                BasicPoolEntry entry = iter.next();
                if (entry.isExpired(now)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection expired @ " + new Date(entry.getExpiry()));
                    }
                    iter.remove();
                    deleteEntry(entry);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            if (!this.shutdown) {
                this.shutdown = true;
                Iterator<BasicPoolEntry> iter1 = this.leasedConnections.iterator();
                while (iter1.hasNext()) {
                    iter1.remove();
                    closeConnection(iter1.next());
                }
                Iterator<BasicPoolEntry> iter2 = this.freeConnections.iterator();
                while (iter2.hasNext()) {
                    BasicPoolEntry entry = iter2.next();
                    iter2.remove();
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection [" + entry.getPlannedRoute() + "][" + entry.getState() + "]");
                    }
                    closeConnection(entry);
                }
                Iterator<WaitingThread> iwth = this.waitingThreads.iterator();
                while (iwth.hasNext()) {
                    WaitingThread waiter = iwth.next();
                    iwth.remove();
                    waiter.wakeup();
                }
                this.routeToPool.clear();
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void setMaxTotalConnections(int max) {
        this.poolLock.lock();
        try {
            this.maxTotalConnections = max;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getMaxTotalConnections() {
        return this.maxTotalConnections;
    }
}
