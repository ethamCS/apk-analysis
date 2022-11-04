package of;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tf.e;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\u0013R*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR.\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lof/p;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "host", "Ltf/e$a;", "Ltf/e;", "c", BuildConfig.FLAVOR, "i", "T", "Ljava/util/Deque;", "calls", "call", "Ltb/e0;", "d", "(Ljava/util/Deque;Ljava/lang/Object;)V", "a", "(Ltf/e$a;)V", "e", BuildConfig.FLAVOR, "j", "maxRequests", "I", "g", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "h", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "idleCallback", "Ljava/lang/Runnable;", "f", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ExecutorService;", "b", "()Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c */
    private Runnable f18281c;

    /* renamed from: d */
    private ExecutorService f18282d;

    /* renamed from: a */
    private int f18279a = 64;

    /* renamed from: b */
    private int f18280b = 5;

    /* renamed from: e */
    private final ArrayDeque<e.a> f18283e = new ArrayDeque<>();

    /* renamed from: f */
    private final ArrayDeque<e.a> f18284f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<tf.e> f18285g = new ArrayDeque<>();

    private final e.a c(String str) {
        Iterator<e.a> it = this.f18284f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (hc.t.a(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f18283e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (hc.t.a(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void d(Deque<T> deque, T t10) {
        Runnable f10;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            f10 = f();
            tb.e0 e0Var = tb.e0.f22152a;
        }
        if (i() || f10 == null) {
            return;
        }
        f10.run();
    }

    private final boolean i() {
        int i10;
        boolean z10;
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.f18283e.iterator();
            hc.t.d(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                e.a next = it.next();
                if (this.f18284f.size() >= g()) {
                    break;
                } else if (next.c().get() < h()) {
                    it.remove();
                    next.c().incrementAndGet();
                    hc.t.d(next, "asyncCall");
                    arrayList.add(next);
                    this.f18284f.add(next);
                }
            }
            z10 = j() > 0;
            tb.e0 e0Var = tb.e0.f22152a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(b());
        }
        return z10;
    }

    public final void a(e.a aVar) {
        e.a c10;
        hc.t.e(aVar, "call");
        synchronized (this) {
            this.f18283e.add(aVar);
            if (!aVar.b().o() && (c10 = c(aVar.d())) != null) {
                aVar.e(c10);
            }
            tb.e0 e0Var = tb.e0.f22152a;
        }
        i();
    }

    public final synchronized ExecutorService b() {
        ExecutorService executorService;
        if (this.f18282d == null) {
            this.f18282d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), pf.d.M(hc.t.l(pf.d.f19196i, " Dispatcher"), false));
        }
        executorService = this.f18282d;
        hc.t.b(executorService);
        return executorService;
    }

    public final void e(e.a aVar) {
        hc.t.e(aVar, "call");
        aVar.c().decrementAndGet();
        d(this.f18284f, aVar);
    }

    public final synchronized Runnable f() {
        return this.f18281c;
    }

    public final synchronized int g() {
        return this.f18279a;
    }

    public final synchronized int h() {
        return this.f18280b;
    }

    public final synchronized int j() {
        return this.f18284f.size() + this.f18285g.size();
    }
}
