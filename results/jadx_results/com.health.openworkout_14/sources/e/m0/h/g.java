package e.m0.h;

import e.k0;
import e.m0.h.k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: g */
    private static final Executor f4121g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.m0.e.G("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f4122a;

    /* renamed from: b */
    private final long f4123b;

    /* renamed from: c */
    private final Runnable f4124c = new Runnable() { // from class: e.m0.h.a
        @Override // java.lang.Runnable
        public final void run() {
            g.this.e();
        }
    };

    /* renamed from: d */
    private final Deque<f> f4125d = new ArrayDeque();

    /* renamed from: e */
    final h f4126e = new h();

    /* renamed from: f */
    boolean f4127f;

    public g(int i, long j, TimeUnit timeUnit) {
        this.f4122a = i;
        this.f4123b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    /* renamed from: d */
    public /* synthetic */ void e() {
        while (true) {
            long a2 = a(System.nanoTime());
            if (a2 == -1) {
                return;
            }
            if (a2 > 0) {
                long j = a2 / 1000000;
                long j2 = a2 - (1000000 * j);
                synchronized (this) {
                    try {
                        wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private int f(f fVar, long j) {
        List<Reference<k>> list = fVar.p;
        int i = 0;
        while (i < list.size()) {
            Reference<k> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                e.m0.l.f.j().q("A connection to " + fVar.q().a().l() + " was leaked. Did you forget to close a response body?", ((k.b) reference).f4149a);
                list.remove(i);
                fVar.k = true;
                if (list.isEmpty()) {
                    fVar.q = j - this.f4123b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j) {
        synchronized (this) {
            f fVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (f fVar2 : this.f4125d) {
                if (f(fVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - fVar2.q;
                    if (j3 > j2) {
                        fVar = fVar2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f4123b;
            if (j2 < j4 && i <= this.f4122a) {
                if (i > 0) {
                    return j4 - j2;
                } else if (i2 > 0) {
                    return j4;
                } else {
                    this.f4127f = false;
                    return -1L;
                }
            }
            this.f4125d.remove(fVar);
            e.m0.e.f(fVar.s());
            return 0L;
        }
    }

    public void b(k0 k0Var, IOException iOException) {
        if (k0Var.b().type() != Proxy.Type.DIRECT) {
            e.e a2 = k0Var.a();
            a2.i().connectFailed(a2.l().E(), k0Var.b().address(), iOException);
        }
        this.f4126e.b(k0Var);
    }

    public boolean c(f fVar) {
        if (fVar.k || this.f4122a == 0) {
            this.f4125d.remove(fVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public void g(f fVar) {
        if (!this.f4127f) {
            this.f4127f = true;
            f4121g.execute(this.f4124c);
        }
        this.f4125d.add(fVar);
    }

    public boolean h(e.e eVar, k kVar, @Nullable List<k0> list, boolean z) {
        for (f fVar : this.f4125d) {
            if (!z || fVar.n()) {
                if (fVar.l(eVar, list)) {
                    kVar.a(fVar);
                    return true;
                }
            }
        }
        return false;
    }
}
