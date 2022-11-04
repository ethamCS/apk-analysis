package sf;

import hc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\tB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lsf/e;", BuildConfig.FLAVOR, "Lsf/a;", "task", "Ltb/e0;", "e", "j", BuildConfig.FLAVOR, "delayNanos", "c", "Lsf/d;", "taskQueue", "h", "(Lsf/d;)V", "d", "i", "f", "Lsf/e$a;", "backend", "Lsf/e$a;", "g", "()Lsf/e$a;", "<init>", "(Lsf/e$a;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final b Companion = new b(null);

    /* renamed from: h */
    public static final e f21693h = new e(new c(pf.d.M(t.l(pf.d.f19196i, " TaskRunner"), true)));

    /* renamed from: i */
    private static final Logger f21694i;

    /* renamed from: a */
    private final a f21695a;

    /* renamed from: c */
    private boolean f21697c;

    /* renamed from: d */
    private long f21698d;

    /* renamed from: b */
    private int f21696b = 10000;

    /* renamed from: e */
    private final List<sf.d> f21699e = new ArrayList();

    /* renamed from: f */
    private final List<sf.d> f21700f = new ArrayList();

    /* renamed from: g */
    private final Runnable f21701g = new d();

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lsf/e$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "Lsf/e;", "taskRunner", "Ltb/e0;", "b", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public interface a {
        void a(e eVar, long j10);

        void b(e eVar);

        long c();

        void execute(Runnable runnable);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lsf/e$b;", BuildConfig.FLAVOR, "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lsf/e;", "INSTANCE", "Lsf/e;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return e.f21694i;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lsf/e$c;", "Lsf/e$a;", BuildConfig.FLAVOR, "c", "Lsf/e;", "taskRunner", "Ltb/e0;", "b", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a */
        private final ThreadPoolExecutor f21702a;

        public c(ThreadFactory threadFactory) {
            t.e(threadFactory, "threadFactory");
            this.f21702a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // sf.e.a
        public void a(e eVar, long j10) {
            t.e(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        @Override // sf.e.a
        public void b(e eVar) {
            t.e(eVar, "taskRunner");
            eVar.notify();
        }

        @Override // sf.e.a
        public long c() {
            return System.nanoTime();
        }

        @Override // sf.e.a
        public void execute(Runnable runnable) {
            t.e(runnable, "runnable");
            this.f21702a.execute(runnable);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"sf/e$d", "Ljava/lang/Runnable;", "Ltb/e0;", "run", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        d() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            sf.a d10;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    d10 = eVar.d();
                }
                if (d10 == null) {
                    return;
                }
                sf.d d11 = d10.d();
                t.b(d11);
                e eVar2 = e.this;
                long j10 = -1;
                boolean isLoggable = e.Companion.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = d11.h().g().c();
                    sf.b.c(d10, d11, "starting");
                }
                try {
                    eVar2.j(d10);
                    e0 e0Var = e0.f22152a;
                    if (isLoggable) {
                        sf.b.c(d10, d11, t.l("finished run in ", sf.b.b(d11.h().g().c() - j10)));
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        sf.b.c(d10, d11, t.l("failed a run in ", sf.b.b(d11.h().g().c() - j10)));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        t.d(logger, "getLogger(TaskRunner::class.java.name)");
        f21694i = logger;
    }

    public e(a aVar) {
        t.e(aVar, "backend");
        this.f21695a = aVar;
    }

    private final void c(sf.a aVar, long j10) {
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        sf.d d10 = aVar.d();
        t.b(d10);
        if (!(d10.c() == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean d11 = d10.d();
        d10.m(false);
        d10.l(null);
        this.f21699e.remove(d10);
        if (j10 != -1 && !d11 && !d10.g()) {
            d10.k(aVar, j10, true);
        }
        if (!(!d10.e().isEmpty())) {
            return;
        }
        this.f21700f.add(d10);
    }

    private final void e(sf.a aVar) {
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        sf.d d10 = aVar.d();
        t.b(d10);
        d10.e().remove(aVar);
        this.f21700f.remove(d10);
        d10.l(aVar);
        this.f21699e.add(d10);
    }

    public final void j(sf.a aVar) {
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.b());
        try {
            long f10 = aVar.f();
            synchronized (this) {
                c(aVar, f10);
                e0 e0Var = e0.f22152a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                c(aVar, -1L);
                e0 e0Var2 = e0.f22152a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final sf.a d() {
        boolean z10;
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f21700f.isEmpty()) {
            long c10 = this.f21695a.c();
            long j10 = Long.MAX_VALUE;
            Iterator<sf.d> it = this.f21700f.iterator();
            sf.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                sf.a aVar2 = it.next().e().get(0);
                long max = Math.max(0L, aVar2.c() - c10);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else if (aVar != null) {
                    z10 = true;
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f21697c && (!this.f21700f.isEmpty()))) {
                    this.f21695a.execute(this.f21701g);
                }
                return aVar;
            } else if (this.f21697c) {
                if (j10 < this.f21698d - c10) {
                    this.f21695a.b(this);
                }
                return null;
            } else {
                this.f21697c = true;
                this.f21698d = c10 + j10;
                try {
                    try {
                        this.f21695a.a(this, j10);
                    } catch (InterruptedException unused) {
                        f();
                    }
                } finally {
                    this.f21697c = false;
                }
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f21699e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.f21699e.get(size).b();
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        int size2 = this.f21700f.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i11 = size2 - 1;
                sf.d dVar = this.f21700f.get(size2);
                dVar.b();
                if (dVar.e().isEmpty()) {
                    this.f21700f.remove(size2);
                }
                if (i11 < 0) {
                    return;
                }
                size2 = i11;
            }
        }
    }

    public final a g() {
        return this.f21695a;
    }

    public final void h(sf.d dVar) {
        t.e(dVar, "taskQueue");
        if (pf.d.f19195h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (dVar.c() == null) {
            if (!dVar.e().isEmpty()) {
                pf.d.c(this.f21700f, dVar);
            } else {
                this.f21700f.remove(dVar);
            }
        }
        if (this.f21697c) {
            this.f21695a.b(this);
        } else {
            this.f21695a.execute(this.f21701g);
        }
    }

    public final sf.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f21696b;
            this.f21696b = i10 + 1;
        }
        return new sf.d(this, t.l("Q", Integer.valueOf(i10)));
    }
}
