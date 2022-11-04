package c.b.a.d.a;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class a<V> extends c.b.a.d.a.j.a implements c.b.a.d.a.e<V> {

    /* renamed from: d */
    private static final boolean f403d;

    /* renamed from: e */
    private static final Logger f404e;
    private static final b f;
    private static final Object g;

    /* renamed from: a */
    private volatile Object f405a;

    /* renamed from: b */
    private volatile e f406b;

    /* renamed from: c */
    private volatile l f407c;

    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract void d(l lVar, l lVar2);

        abstract void e(l lVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        static final c f408c;

        /* renamed from: d */
        static final c f409d;

        /* renamed from: a */
        final boolean f410a;

        /* renamed from: b */
        final Throwable f411b;

        static {
            if (a.f403d) {
                f409d = null;
                f408c = null;
                return;
            }
            f409d = new c(false, null);
            f408c = new c(true, null);
        }

        c(boolean z, Throwable th) {
            this.f410a = z;
            this.f411b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final Throwable f412a;

        /* renamed from: c.b.a.d.a.a$d$a */
        /* loaded from: classes.dex */
        class C0023a extends Throwable {
            C0023a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C0023a("Failure occurred while trying to finish a future."));
        }

        d(Throwable th) {
            c.b.a.a.i.h(th);
            this.f412a = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f413d = new e(null, null);

        /* renamed from: a */
        final Runnable f414a;

        /* renamed from: b */
        final Executor f415b;

        /* renamed from: c */
        e f416c;

        e(Runnable runnable, Executor executor) {
            this.f414a = runnable;
            this.f415b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<l, Thread> f417a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<l, l> f418b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<a, l> f419c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<a, e> f420d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<a, Object> f421e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f417a = atomicReferenceFieldUpdater;
            this.f418b = atomicReferenceFieldUpdater2;
            this.f419c = atomicReferenceFieldUpdater3;
            this.f420d = atomicReferenceFieldUpdater4;
            this.f421e = atomicReferenceFieldUpdater5;
        }

        @Override // c.b.a.d.a.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f420d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // c.b.a.d.a.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f421e.compareAndSet(aVar, obj, obj2);
        }

        @Override // c.b.a.d.a.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return this.f419c.compareAndSet(aVar, lVar, lVar2);
        }

        @Override // c.b.a.d.a.a.b
        void d(l lVar, l lVar2) {
            this.f418b.lazySet(lVar, lVar2);
        }

        @Override // c.b.a.d.a.a.b
        void e(l lVar, Thread thread) {
            this.f417a.lazySet(lVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a */
        final a<V> f422a;

        /* renamed from: b */
        final c.b.a.d.a.e<? extends V> f423b;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f422a).f405a != this) {
                return;
            }
            if (!a.f.b(this.f422a, this, a.w(this.f423b))) {
                return;
            }
            a.t(this.f422a);
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // c.b.a.d.a.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f406b == eVar) {
                    ((a) aVar).f406b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // c.b.a.d.a.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f405a == obj) {
                    ((a) aVar).f405a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // c.b.a.d.a.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (((a) aVar).f407c == lVar) {
                    ((a) aVar).f407c = lVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // c.b.a.d.a.a.b
        void d(l lVar, l lVar2) {
            lVar.f431b = lVar2;
        }

        @Override // c.b.a.d.a.a.b
        void e(l lVar, Thread thread) {
            lVar.f430a = thread;
        }
    }

    /* loaded from: classes.dex */
    public interface i<V> extends c.b.a.d.a.e<V> {
    }

    /* loaded from: classes.dex */
    static abstract class j<V> extends a<V> implements i<V> {
        @Override // c.b.a.d.a.a, c.b.a.d.a.e
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // c.b.a.d.a.a, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // c.b.a.d.a.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // c.b.a.d.a.a, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) {
            return (V) super.get(j, timeUnit);
        }

        @Override // c.b.a.d.a.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // c.b.a.d.a.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* loaded from: classes.dex */
    private static final class k extends b {

        /* renamed from: a */
        static final Unsafe f424a;

        /* renamed from: b */
        static final long f425b;

        /* renamed from: c */
        static final long f426c;

        /* renamed from: d */
        static final long f427d;

        /* renamed from: e */
        static final long f428e;
        static final long f;

        /* renamed from: c.b.a.d.a.a$k$a */
        /* loaded from: classes.dex */
        class C0024a implements PrivilegedExceptionAction<Unsafe> {
            C0024a() {
            }

            /* renamed from: a */
            public Unsafe run() {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0024a());
            }
            try {
                f426c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f425b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f427d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f428e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f424a = unsafe;
            } catch (Exception e3) {
                c.b.a.a.l.e(e3);
                throw new RuntimeException(e3);
            }
        }

        private k() {
            super();
        }

        @Override // c.b.a.d.a.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return f424a.compareAndSwapObject(aVar, f425b, eVar, eVar2);
        }

        @Override // c.b.a.d.a.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return f424a.compareAndSwapObject(aVar, f427d, obj, obj2);
        }

        @Override // c.b.a.d.a.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return f424a.compareAndSwapObject(aVar, f426c, lVar, lVar2);
        }

        @Override // c.b.a.d.a.a.b
        void d(l lVar, l lVar2) {
            f424a.putObject(lVar, f, lVar2);
        }

        @Override // c.b.a.d.a.a.b
        void e(l lVar, Thread thread) {
            f424a.putObject(lVar, f428e, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: c */
        static final l f429c = new l(false);

        /* renamed from: a */
        volatile Thread f430a;

        /* renamed from: b */
        volatile l f431b;

        l() {
            a.f.e(this, Thread.currentThread());
        }

        l(boolean z) {
        }

        void a(l lVar) {
            a.f.d(this, lVar);
        }

        void b() {
            Thread thread = this.f430a;
            if (thread != null) {
                this.f430a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z;
        b bVar;
        Throwable th;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f403d = z;
        f404e = Logger.getLogger(a.class.getName());
        Throwable th2 = null;
        try {
            bVar = new k();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                bVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Throwable th4) {
                bVar = new h();
                th2 = th4;
            }
        }
        f = bVar;
        if (th2 != null) {
            Logger logger = f404e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    protected a() {
    }

    private void A() {
        l lVar;
        do {
            lVar = this.f407c;
        } while (!f.c(this, lVar, l.f429c));
        while (lVar != null) {
            lVar.b();
            lVar = lVar.f431b;
        }
    }

    private void B(l lVar) {
        lVar.f430a = null;
        while (true) {
            l lVar2 = this.f407c;
            if (lVar2 == l.f429c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f431b;
                if (lVar2.f430a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f431b = lVar4;
                    if (lVar3.f430a == null) {
                        break;
                    }
                } else if (!f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void m(StringBuilder sb) {
        String str = "]";
        try {
            Object x = x(this);
            sb.append("SUCCESS, result=[");
            p(sb, x);
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f405a
            boolean r2 = r1 instanceof c.b.a.d.a.a.g
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            c.b.a.d.a.a$g r1 = (c.b.a.d.a.a.g) r1
            c.b.a.d.a.e<? extends V> r1 = r1.f423b
            r5.q(r6, r1)
        L1d:
            r6.append(r3)
            goto L5b
        L21:
            java.lang.String r1 = r5.z()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = c.b.a.a.k.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L50
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r2 = r2 + 38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Exception thrown from implementation: "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L50:
            if (r1 == 0) goto L5b
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            goto L1d
        L5b:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L6b
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.m(r6)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.d.a.a.n(java.lang.StringBuilder):void");
    }

    private void p(StringBuilder sb, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    private void q(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static CancellationException r(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e s(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f406b;
        } while (!f.a(this, eVar2, e.f413d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f416c;
            eVar4.f416c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c.b.a.d.a.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [c.b.a.d.a.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [c.b.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [c.b.a.d.a.a, c.b.a.d.a.a<V>] */
    public static void t(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.A();
            aVar.o();
            e s = aVar.s(eVar);
            while (s != null) {
                eVar = s.f416c;
                Runnable runnable = s.f414a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f422a;
                    if (((a) aVar).f405a == gVar) {
                        if (f.b(aVar, gVar, w(gVar.f423b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    u(runnable, s.f415b);
                }
                s = eVar;
            }
            return;
        }
    }

    private static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f404e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V v(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof d) {
                throw new ExecutionException(((d) obj).f412a);
            }
            if (obj != g) {
                return obj;
            }
            return null;
        }
        throw r("Task was cancelled.", ((c) obj).f411b);
    }

    public static Object w(c.b.a.d.a.e<?> eVar) {
        Throwable a2;
        if (eVar instanceof i) {
            Object obj = ((a) eVar).f405a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f410a ? cVar.f411b != null ? new c(false, cVar.f411b) : c.f409d : obj;
        } else if ((eVar instanceof c.b.a.d.a.j.a) && (a2 = c.b.a.d.a.j.b.a((c.b.a.d.a.j.a) eVar)) != null) {
            return new d(a2);
        } else {
            boolean isCancelled = eVar.isCancelled();
            if ((!f403d) && isCancelled) {
                return c.f409d;
            }
            try {
                Object x = x(eVar);
                if (!isCancelled) {
                    return x == null ? g : x;
                }
                String valueOf = String.valueOf(eVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new c(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new c(false, e2);
                }
                String valueOf2 = String.valueOf(eVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(valueOf2);
                return new d(new IllegalArgumentException(sb2.toString(), e2));
            } catch (ExecutionException e3) {
                if (!isCancelled) {
                    return new d(e3.getCause());
                }
                String valueOf3 = String.valueOf(eVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(valueOf3);
                return new c(false, new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th) {
                return new d(th);
            }
        }
    }

    private static <V> V x(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public boolean C(V v) {
        if (v == null) {
            v = (V) g;
        }
        if (f.b(this, null, v)) {
            t(this);
            return true;
        }
        return false;
    }

    public boolean D(Throwable th) {
        c.b.a.a.i.h(th);
        if (f.b(this, null, new d(th))) {
            t(this);
            return true;
        }
        return false;
    }

    @Override // c.b.a.d.a.e
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        c.b.a.a.i.i(runnable, "Runnable was null.");
        c.b.a.a.i.i(executor, "Executor was null.");
        if (isDone() || (eVar = this.f406b) == e.f413d) {
            u(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f416c = eVar;
            if (f.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f406b;
        } while (eVar != e.f413d);
        u(runnable, executor);
    }

    @Override // c.b.a.d.a.j.a
    public final Throwable b() {
        if (this instanceof i) {
            Object obj = this.f405a;
            if (!(obj instanceof d)) {
                return null;
            }
            return ((d) obj).f412a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object obj = this.f405a;
        if ((obj == null) || (obj instanceof g)) {
            c cVar = f403d ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f408c : c.f409d;
            boolean z2 = false;
            a<V> aVar = this;
            while (true) {
                if (f.b(aVar, obj, cVar)) {
                    if (z) {
                        aVar.y();
                    }
                    t(aVar);
                    if (!(obj instanceof g)) {
                        return true;
                    }
                    c.b.a.d.a.e<? extends V> eVar = ((g) obj).f423b;
                    if (!(eVar instanceof i)) {
                        eVar.cancel(z);
                        return true;
                    }
                    aVar = (a) eVar;
                    obj = aVar.f405a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    obj = aVar.f405a;
                    if (!(obj instanceof g)) {
                        return z2;
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
        r0 = r6.f405a;
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
        if ((r4 & (!(r0 instanceof c.b.a.d.a.a.g))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return v(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        B(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.f405a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof c.b.a.d.a.a.g
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.v(r0)
            return r0
        L1a:
            c.b.a.d.a.a$l r0 = r6.f407c
            c.b.a.d.a.a$l r3 = c.b.a.d.a.a.l.f429c
            if (r0 == r3) goto L5a
            c.b.a.d.a.a$l r3 = new c.b.a.d.a.a$l
            r3.<init>()
        L25:
            r3.a(r0)
            c.b.a.d.a.a$b r4 = c.b.a.d.a.a.f
            boolean r0 = r4.c(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f405a
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof c.b.a.d.a.a.g
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.v(r0)
            return r0
        L4b:
            r6.B(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            c.b.a.d.a.a$l r0 = r6.f407c
            c.b.a.d.a.a$l r4 = c.b.a.d.a.a.l.f429c
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.f405a
            java.lang.Object r0 = r6.v(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            goto L68
        L67:
            throw r0
        L68:
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.d.a.a.get():java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        c.b.a.d.a.f.a(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r19.f405a;
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
        if ((r5 & (!(r4 instanceof c.b.a.d.a.a.g))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        return v(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        B(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        B(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.d.a.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f405a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f405a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void o() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m(sb);
        } else {
            n(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void y() {
    }

    protected String z() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }
}
