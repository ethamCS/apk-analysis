package androidx.work.impl.utils.futures;

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
    static final boolean f5389x = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: y */
    private static final Logger f5390y = Logger.getLogger(a.class.getName());

    /* renamed from: c */
    volatile Object f5391c;

    /* renamed from: d */
    volatile e f5392d;

    /* renamed from: q */
    volatile i f5393q;

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
        static final c f5394c;

        /* renamed from: d */
        static final c f5395d;

        /* renamed from: a */
        final boolean f5396a;

        /* renamed from: b */
        final Throwable f5397b;

        static {
            if (a.f5389x) {
                f5395d = null;
                f5394c = null;
                return;
            }
            f5395d = new c(false, null);
            f5394c = new c(true, null);
        }

        c(boolean z10, Throwable th2) {
            this.f5396a = z10;
            this.f5397b = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        static final d f5398b = new d(new C0073a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f5399a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        /* loaded from: classes.dex */
        class C0073a extends Throwable {
            C0073a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f5399a = (Throwable) a.e(th2);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f5400d = new e(null, null);

        /* renamed from: a */
        final Runnable f5401a;

        /* renamed from: b */
        final Executor f5402b;

        /* renamed from: c */
        e f5403c;

        e(Runnable runnable, Executor executor) {
            this.f5401a = runnable;
            this.f5402b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f5404a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f5405b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<a, i> f5406c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<a, e> f5407d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<a, Object> f5408e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5404a = atomicReferenceFieldUpdater;
            this.f5405b = atomicReferenceFieldUpdater2;
            this.f5406c = atomicReferenceFieldUpdater3;
            this.f5407d = atomicReferenceFieldUpdater4;
            this.f5408e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f5407d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f5408e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f5406c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f5405b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f5404a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: c */
        final a<V> f5409c;

        /* renamed from: d */
        final x5.a<? extends V> f5410d;

        g(a<V> aVar, x5.a<? extends V> aVar2) {
            this.f5409c = aVar;
            this.f5410d = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5409c.f5391c != this) {
                return;
            }
            if (!a.U3.b(this.f5409c, this, a.j(this.f5410d))) {
                return;
            }
            a.g(this.f5409c);
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f5392d == eVar) {
                    aVar.f5392d = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5391c == obj) {
                    aVar.f5391c = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f5393q == iVar) {
                    aVar.f5393q = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f5413b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f5412a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        static final i f5411c = new i(false);

        /* renamed from: a */
        volatile Thread f5412a;

        /* renamed from: b */
        volatile i f5413b;

        i() {
            a.U3.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.U3.d(this, iVar);
        }

        void b() {
            Thread thread = this.f5412a;
            if (thread != null) {
                this.f5412a = null;
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
            f5390y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
        V3 = new Object();
    }

    private void a(StringBuilder sb2) {
        String str = "]";
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
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
            eVar2 = this.f5392d;
        } while (!U3.a(this, eVar2, e.f5400d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f5403c;
            eVar4.f5403c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f5403c;
                Runnable runnable = f10.f5401a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f5409c;
                    if (aVar.f5391c == gVar) {
                        if (U3.b(aVar, gVar, j(gVar.f5410d))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f5402b);
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
            Logger logger = f5390y;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof d) {
                throw new ExecutionException(((d) obj).f5399a);
            }
            if (obj != V3) {
                return obj;
            }
            return null;
        }
        throw d("Task was cancelled.", ((c) obj).f5397b);
    }

    static Object j(x5.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f5391c;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f5396a ? cVar.f5397b != null ? new c(false, cVar.f5397b) : c.f5395d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f5389x) && isCancelled) {
            return c.f5395d;
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
            iVar = this.f5393q;
        } while (!U3.c(this, iVar, i.f5411c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f5413b;
        }
    }

    private void o(i iVar) {
        iVar.f5412a = null;
        while (true) {
            i iVar2 = this.f5393q;
            if (iVar2 == i.f5411c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f5413b;
                if (iVar2.f5412a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f5413b = iVar4;
                    if (iVar3.f5412a == null) {
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

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // x5.a
    public final void b(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f5392d;
        if (eVar == e.f5400d) {
            h(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f5403c = eVar;
            if (U3.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f5392d;
        } while (eVar != e.f5400d);
        h(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f5391c;
        if ((obj == null) || (obj instanceof g)) {
            c cVar = f5389x ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f5394c : c.f5395d;
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
                    x5.a<? extends V> aVar2 = ((g) obj).f5410d;
                    if (!(aVar2 instanceof a)) {
                        aVar2.cancel(z10);
                        return true;
                    }
                    aVar = (a) aVar2;
                    obj = aVar.f5391c;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    obj = aVar.f5391c;
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
        r0 = r6.f5391c;
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
        if ((r4 & (!(r0 instanceof androidx.work.impl.utils.futures.a.g))) == false) goto L17;
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
            java.lang.Object r0 = r6.f5391c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.i(r0)
            return r0
        L1a:
            androidx.work.impl.utils.futures.a$i r0 = r6.f5393q
            androidx.work.impl.utils.futures.a$i r3 = androidx.work.impl.utils.futures.a.i.f5411c
            if (r0 == r3) goto L5a
            androidx.work.impl.utils.futures.a$i r3 = new androidx.work.impl.utils.futures.a$i
            r3.<init>()
        L25:
            r3.a(r0)
            androidx.work.impl.utils.futures.a$b r4 = androidx.work.impl.utils.futures.a.U3
            boolean r0 = r4.c(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f5391c
            if (r0 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0 instanceof androidx.work.impl.utils.futures.a.g
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
            androidx.work.impl.utils.futures.a$i r0 = r6.f5393q
            androidx.work.impl.utils.futures.a$i r4 = androidx.work.impl.utils.futures.a.i.f5411c
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.f5391c
            java.lang.Object r0 = r6.i(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.get():java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r19.f5391c;
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
        if ((r5 & (!(r4 instanceof androidx.work.impl.utils.futures.a.g))) == false) goto L33;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5391c instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f5391c;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    protected String m() {
        Object obj = this.f5391c;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f5410d) + "]";
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

    public boolean r(x5.a<? extends V> aVar) {
        d dVar;
        e(aVar);
        Object obj = this.f5391c;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!U3.b(this, null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (U3.b(this, null, gVar)) {
                try {
                    aVar.b(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f5398b;
                    }
                    U3.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f5391c;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f5396a);
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
