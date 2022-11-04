package e;

import e.f0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class s {
    @Nullable

    /* renamed from: c */
    private Runnable f4390c;
    @Nullable

    /* renamed from: d */
    private ExecutorService f4391d;

    /* renamed from: a */
    private int f4388a = 64;

    /* renamed from: b */
    private int f4389b = 5;

    /* renamed from: e */
    private final Deque<f0.a> f4392e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<f0.a> f4393f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<f0> f4394g = new ArrayDeque();

    @Nullable
    private f0.a c(String str) {
        for (f0.a aVar : this.f4393f) {
            if (aVar.o().equals(str)) {
                return aVar;
            }
        }
        for (f0.a aVar2 : this.f4392e) {
            if (aVar2.o().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    private <T> void d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f4390c;
        }
        if (f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean f() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<f0.a> it = this.f4392e.iterator();
            while (it.hasNext()) {
                f0.a next = it.next();
                if (this.f4393f.size() >= this.f4388a) {
                    break;
                } else if (next.l().get() < this.f4389b) {
                    it.remove();
                    next.l().incrementAndGet();
                    arrayList.add(next);
                    this.f4393f.add(next);
                }
            }
            z = g() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((f0.a) arrayList.get(i)).m(b());
        }
        return z;
    }

    public void a(f0.a aVar) {
        f0.a c2;
        synchronized (this) {
            this.f4392e.add(aVar);
            if (!aVar.n().f3968e && (c2 = c(aVar.o())) != null) {
                aVar.p(c2);
            }
        }
        f();
    }

    public synchronized ExecutorService b() {
        if (this.f4391d == null) {
            this.f4391d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), e.m0.e.G("OkHttp Dispatcher", false));
        }
        return this.f4391d;
    }

    public void e(f0.a aVar) {
        aVar.l().decrementAndGet();
        d(this.f4393f, aVar);
    }

    public synchronized int g() {
        return this.f4393f.size() + this.f4394g.size();
    }
}
