package androidx.concurrent.futures;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class a<V> implements x5.a<V> {
    static final b U3;
    private static final Object V3;

    /* renamed from: x */
    static final boolean f2716x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y */
    private static final Logger f2717y = Logger.getLogger(a.class.getName());

    /* renamed from: c */
    volatile Object f2718c;

    /* renamed from: d */
    volatile e f2719d;

    /* renamed from: q */
    volatile i f2720q;

    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        static final c f2721c;

        /* renamed from: d */
        static final c f2722d;

        /* renamed from: a */
        final boolean f2723a;

        /* renamed from: b */
        final Throwable f2724b;

        static {
            if (a.f2716x) {
                f2722d = null;
                f2721c = null;
                return;
            }
            f2722d = new c(false, null);
            f2721c = new c(true, null);
        }

        c(boolean z10, Throwable th2) {
            this.f2723a = z10;
            this.f2724b = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        static final d f2725b = new d(new C0022a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f2726a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* loaded from: classes.dex */
        static class C0022a extends Throwable {
            C0022a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f2726a = (Throwable) a.e(th2);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f2727d = new e(null, null);

        /* renamed from: a */
        final Runnable f2728a;

        /* renamed from: b */
        final Executor f2729b;

        /* renamed from: c */
        e f2730c;

        e(Runnable runnable, Executor executor) {
            this.f2728a = runnable;
            this.f2729b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f2731a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f2732b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<a, i> f2733c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<a, e> f2734d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<a, Object> f2735e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2731a = atomicReferenceFieldUpdater;
            this.f2732b = atomicReferenceFieldUpdater2;
            this.f2733c = atomicReferenceFieldUpdater3;
            this.f2734d = atomicReferenceFieldUpdater4;
            this.f2735e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f2734d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f2735e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f2733c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f2732b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f2731a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: c */
        final a<V> f2736c;

        /* renamed from: d */
        final x5.a<? extends V> f2737d;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2736c.f2718c != this) {
                return;
            }
            if (!a.U3.b(this.f2736c, this, a.j(this.f2737d))) {
                return;
            }
            a.g(this.f2736c);
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2719d == eVar) {
                    aVar.f2719d = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2718c == obj) {
                    aVar.f2718c = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f2720q == iVar) {
                    aVar.f2720q = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f2740b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f2739a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        static final i f2738c = new i(false);

        /* renamed from: a */
        volatile Thread f2739a;

        /* renamed from: b */
        volatile i f2740b;

        i() {
            a.U3.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.U3.d(this, iVar);
        }

        void b() {
            Thread thread = this.f2739a;
            if (thread != null) {
                this.f2739a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b bVar;
        Throwable th2;
        try {
            bVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "q"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "c"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            bVar = new h();
        }
        U3 = bVar;
        if (th2 != null) {
            f2717y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
        V3 = new Object();
    }

    private void a(StringBuilder sb2) {
        String str = "]";
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(k10));
            sb2.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(str);
        }
    }

    private static CancellationException d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2719d;
        } while (!U3.a(this, eVar2, e.f2727d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2730c;
            eVar4.f2730c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f2730c;
                Runnable runnable = f10.f2728a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f2736c;
                    if (aVar.f2718c == gVar) {
                        if (U3.b(aVar, gVar, j(gVar.f2737d))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f2729b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f2717y;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof d) {
                throw new ExecutionException(((d) obj).f2726a);
            }
            if (obj != V3) {
                return obj;
            }
            return null;
        }
        throw d("Task was cancelled.", ((c) obj).f2724b);
    }

    static Object j(x5.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f2718c;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f2723a ? cVar.f2724b != null ? new c(false, cVar.f2724b) : c.f2722d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f2716x) && isCancelled) {
            return c.f2722d;
        }
        try {
            Object k10 = k(aVar);
            return k10 == null ? V3 : k10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V k(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f2720q;
        } while (!U3.c(this, iVar, i.f2738c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f2740b;
        }
    }

    private void o(i iVar) {
        iVar.f2739a = null;
        while (true) {
            i iVar2 = this.f2720q;
            if (iVar2 == i.f2738c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2740b;
                if (iVar2.f2739a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2740b = iVar4;
                    if (iVar3.f2739a == null) {
                        break;
                    }
                } else if (!U3.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // x5.a
    public final void b(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f2719d;
        if (eVar == e.f2727d) {
            h(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f2730c = eVar;
            if (U3.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f2719d;
        } while (eVar != e.f2727d);
        h(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f2718c;
        if ((obj == null) || (obj instanceof g)) {
            c cVar = f2716x ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f2721c : c.f2722d;
            a<V> aVar = this;
            boolean z11 = false;
            while (true) {
                if (U3.b(aVar, obj, cVar)) {
                    if (z10) {
                        aVar.l();
                    }
                    g(aVar);
                    if (!(obj instanceof g)) {
                        return true;
                    }
                    x5.a<? extends V> aVar2 = ((g) obj).f2737d;
                    if (!(aVar2 instanceof a)) {
                        aVar2.cancel(z10);
                        return true;
                    }
                    aVar = (a) aVar2;
                    obj = aVar.f2718c;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    obj = aVar.f2718c;
                    if (!(obj instanceof g)) {
                        return z11;
                    }
                }
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.f2718c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r4 & (!(r0 instanceof androidx.concurrent.futures.a.g))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        o(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.f2718c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.i(r0)
            return r0
        L1a:
            androidx.concurrent.futures.a$i r0 = r6.f2720q
            androidx.concurrent.futures.a$i r3 = androidx.concurrent.futures.a.i.f2738c
            if (r0 == r3) goto L5a
            androidx.concurrent.futures.a$i r3 = new androidx.concurrent.futures.a$i
            r3.<init>()
        L25:
            r3.a(r0)
            androidx.concurrent.futures.a$b r4 = androidx.concurrent.futures.a.U3
            boolean r0 = r4.c(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f2718c
            if (r0 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0 instanceof androidx.concurrent.futures.a.g
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.i(r0)
            return r0
        L4b:
            r6.o(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            androidx.concurrent.futures.a$i r0 = r6.f2720q
            androidx.concurrent.futures.a$i r4 = androidx.concurrent.futures.a.i.f2738c
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.f2718c
            java.lang.Object r0 = r6.i(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.get():java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r19.f2718c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r5 & (!(r4 instanceof androidx.concurrent.futures.a.g))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        return i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        o(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        o(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2718c instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f2718c;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    protected String m() {
        Object obj = this.f2718c;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f2737d) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) V3;
        }
        if (U3.b(this, null, v10)) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean q(Throwable th2) {
        if (U3.b(this, null, new d((Throwable) e(th2)))) {
            g(this);
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = m();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(str);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            a(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        str2 = "CANCELLED";
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
