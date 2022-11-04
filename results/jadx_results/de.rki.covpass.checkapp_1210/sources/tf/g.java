package tf;

import hc.t;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.d0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tf.e;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J.\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u001f"}, d2 = {"Ltf/g;", BuildConfig.FLAVOR, "Ltf/f;", "connection", BuildConfig.FLAVOR, "now", BuildConfig.FLAVOR, "e", "Lof/a;", "address", "Ltf/e;", "call", BuildConfig.FLAVOR, "Lof/d0;", "routes", BuildConfig.FLAVOR, "requireMultiplexed", "a", "Ltb/e0;", "f", "c", "d", "b", "Lsf/e;", "taskRunner", "maxIdleConnections", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lsf/e;IJLjava/util/concurrent/TimeUnit;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f22299a;

    /* renamed from: b */
    private final long f22300b;

    /* renamed from: c */
    private final sf.d f22301c;

    /* renamed from: d */
    private final b f22302d = new b(t.l(pf.d.f19196i, " ConnectionPool"));

    /* renamed from: e */
    private final ConcurrentLinkedQueue<f> f22303e = new ConcurrentLinkedQueue<>();

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltf/g$a;", BuildConfig.FLAVOR, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"tf/g$b", "Lsf/a;", BuildConfig.FLAVOR, "f", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends sf.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(str, false, 2, null);
            g.this = r3;
        }

        @Override // sf.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(sf.e eVar, int i10, long j10, TimeUnit timeUnit) {
        t.e(eVar, "taskRunner");
        t.e(timeUnit, "timeUnit");
        this.f22299a = i10;
        this.f22300b = timeUnit.toNanos(j10);
        this.f22301c = eVar.i();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(t.l("keepAliveDuration <= 0: ", Long.valueOf(j10)).toString());
    }

    private final int e(f fVar, long j10) {
        if (pf.d.f19195h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> o10 = fVar.o();
        int i10 = 0;
        while (i10 < o10.size()) {
            Reference<e> reference = o10.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                yf.h.Companion.g().m("A connection to " + fVar.B().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                o10.remove(i10);
                fVar.E(true);
                if (o10.isEmpty()) {
                    fVar.D(j10 - this.f22300b);
                    return 0;
                }
            }
        }
        return o10.size();
    }

    public final boolean a(of.a aVar, e eVar, List<d0> list, boolean z10) {
        t.e(aVar, "address");
        t.e(eVar, "call");
        Iterator<f> it = this.f22303e.iterator();
        while (it.hasNext()) {
            f next = it.next();
            t.d(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (!next.w()) {
                        e0 e0Var = e0.f22152a;
                    }
                }
                if (next.u(aVar, list)) {
                    eVar.d(next);
                    return true;
                }
                e0 e0Var2 = e0.f22152a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        Iterator<f> it = this.f22303e.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            f next = it.next();
            t.d(next, "connection");
            synchronized (next) {
                if (e(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long p10 = j10 - next.p();
                    if (p10 > j11) {
                        fVar = next;
                        j11 = p10;
                    }
                    e0 e0Var = e0.f22152a;
                }
            }
        }
        long j12 = this.f22300b;
        if (j11 < j12 && i10 <= this.f22299a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 <= 0) {
                return -1L;
            }
            return j12;
        }
        t.b(fVar);
        synchronized (fVar) {
            if (!fVar.o().isEmpty()) {
                return 0L;
            }
            if (fVar.p() + j11 != j10) {
                return 0L;
            }
            fVar.E(true);
            this.f22303e.remove(fVar);
            pf.d.n(fVar.F());
            if (this.f22303e.isEmpty()) {
                this.f22301c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f fVar) {
        t.e(fVar, "connection");
        if (pf.d.f19195h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        } else if (!fVar.q() && this.f22299a != 0) {
            sf.d.j(this.f22301c, this.f22302d, 0L, 2, null);
            return false;
        } else {
            fVar.E(true);
            this.f22303e.remove(fVar);
            if (!this.f22303e.isEmpty()) {
                return true;
            }
            this.f22301c.a();
            return true;
        }
    }

    public final void d() {
        Socket socket;
        Iterator<f> it = this.f22303e.iterator();
        t.d(it, "connections.iterator()");
        while (it.hasNext()) {
            f next = it.next();
            t.d(next, "connection");
            synchronized (next) {
                if (next.o().isEmpty()) {
                    it.remove();
                    next.E(true);
                    socket = next.F();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                pf.d.n(socket);
            }
        }
        if (this.f22303e.isEmpty()) {
            this.f22301c.a();
        }
    }

    public final void f(f fVar) {
        t.e(fVar, "connection");
        if (!pf.d.f19195h || Thread.holdsLock(fVar)) {
            this.f22303e.add(fVar);
            sf.d.j(this.f22301c, this.f22302d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
    }
}
