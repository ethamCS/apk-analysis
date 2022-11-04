package org.opendatakit.httpclientandroidlib.impl.conn.tsccm;

import java.util.LinkedList;
import java.util.Queue;
import org.opendatakit.httpclientandroidlib.androidextra.Log;
import org.opendatakit.httpclientandroidlib.androidextra.LogFactory;
import org.opendatakit.httpclientandroidlib.conn.params.ConnPerRoute;
import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
@Deprecated
/* loaded from: classes.dex */
public class RouteSpecificPool {
    protected final ConnPerRoute connPerRoute;
    protected final LinkedList<BasicPoolEntry> freeEntries;
    private final Log log;
    protected final int maxEntries;
    protected int numEntries;
    protected final HttpRoute route;
    protected final Queue<WaitingThread> waitingThreads;

    public RouteSpecificPool(HttpRoute route, int maxEntries) {
        this.log = LogFactory.getLog(getClass());
        this.route = route;
        this.maxEntries = maxEntries;
        this.connPerRoute = new ConnPerRoute() { // from class: org.opendatakit.httpclientandroidlib.impl.conn.tsccm.RouteSpecificPool.1
            @Override // org.opendatakit.httpclientandroidlib.conn.params.ConnPerRoute
            public int getMaxForRoute(HttpRoute route2) {
                return RouteSpecificPool.this.maxEntries;
            }
        };
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }

    public RouteSpecificPool(HttpRoute route, ConnPerRoute connPerRoute) {
        this.log = LogFactory.getLog(getClass());
        this.route = route;
        this.connPerRoute = connPerRoute;
        this.maxEntries = connPerRoute.getMaxForRoute(route);
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }

    public final int getMaxEntries() {
        return this.maxEntries;
    }

    public boolean isUnused() {
        return this.numEntries < 1 && this.waitingThreads.isEmpty();
    }

    public int getCapacity() {
        return this.connPerRoute.getMaxForRoute(this.route) - this.numEntries;
    }

    public final int getEntryCount() {
        return this.numEntries;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry allocEntry(java.lang.Object r7) {
        /*
            r6 = this;
            java.util.LinkedList<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry> r4 = r6.freeEntries
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L34
            java.util.LinkedList<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry> r4 = r6.freeEntries
            java.util.LinkedList<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry> r5 = r6.freeEntries
            int r5 = r5.size()
            java.util.ListIterator r3 = r4.listIterator(r5)
        L14:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L34
            java.lang.Object r1 = r3.previous()
            org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry r1 = (org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry) r1
            java.lang.Object r4 = r1.getState()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r1.getState()
            boolean r4 = org.opendatakit.httpclientandroidlib.util.LangUtils.equals(r7, r4)
            if (r4 == 0) goto L14
        L30:
            r3.remove()
        L33:
            return r1
        L34:
            int r4 = r6.getCapacity()
            if (r4 != 0) goto L5e
            java.util.LinkedList<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry> r4 = r6.freeEntries
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L5e
            java.util.LinkedList<org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry> r4 = r6.freeEntries
            java.lang.Object r1 = r4.remove()
            org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry r1 = (org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry) r1
            r1.shutdownEntry()
            org.opendatakit.httpclientandroidlib.conn.OperatedClientConnection r0 = r1.getConnection()
            r0.close()     // Catch: java.io.IOException -> L55
            goto L33
        L55:
            r2 = move-exception
            org.opendatakit.httpclientandroidlib.androidextra.Log r4 = r6.log
            java.lang.String r5 = "I/O error closing connection"
            r4.debug(r5, r2)
            goto L33
        L5e:
            r1 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opendatakit.httpclientandroidlib.impl.conn.tsccm.RouteSpecificPool.allocEntry(java.lang.Object):org.opendatakit.httpclientandroidlib.impl.conn.tsccm.BasicPoolEntry");
    }

    public void freeEntry(BasicPoolEntry entry) {
        if (this.numEntries < 1) {
            throw new IllegalStateException("No entry created for this pool. " + this.route);
        }
        if (this.numEntries <= this.freeEntries.size()) {
            throw new IllegalStateException("No entry allocated from this pool. " + this.route);
        }
        this.freeEntries.add(entry);
    }

    public void createdEntry(BasicPoolEntry entry) {
        if (!this.route.equals(entry.getPlannedRoute())) {
            throw new IllegalArgumentException("Entry not planned for this pool.\npool: " + this.route + "\nplan: " + entry.getPlannedRoute());
        }
        this.numEntries++;
    }

    public boolean deleteEntry(BasicPoolEntry entry) {
        boolean found = this.freeEntries.remove(entry);
        if (found) {
            this.numEntries--;
        }
        return found;
    }

    public void dropEntry() {
        if (this.numEntries < 1) {
            throw new IllegalStateException("There is no entry that could be dropped.");
        }
        this.numEntries--;
    }

    public void queueThread(WaitingThread wt) {
        if (wt == null) {
            throw new IllegalArgumentException("Waiting thread must not be null.");
        }
        this.waitingThreads.add(wt);
    }

    public boolean hasThread() {
        return !this.waitingThreads.isEmpty();
    }

    public WaitingThread nextThread() {
        return this.waitingThreads.peek();
    }

    public void removeThread(WaitingThread wt) {
        if (wt != null) {
            this.waitingThreads.remove(wt);
        }
    }
}
