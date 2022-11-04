package e.m0.k;

import e.m0.k.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class f implements Closeable {
    private static final ExecutorService z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.m0.e.G("OkHttp Http2Connection", true));

    /* renamed from: b */
    final boolean f4230b;

    /* renamed from: c */
    final j f4231c;

    /* renamed from: e */
    final String f4233e;

    /* renamed from: f */
    int f4234f;

    /* renamed from: g */
    int f4235g;

    /* renamed from: h */
    private boolean f4236h;
    private final ScheduledExecutorService i;
    private final ExecutorService j;
    final e.m0.k.l k;
    long s;
    final m u;
    final Socket v;
    final e.m0.k.j w;
    final l x;

    /* renamed from: d */
    final Map<Integer, e.m0.k.i> f4232d = new LinkedHashMap();
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    long r = 0;
    m t = new m();
    final Set<Integer> y = new LinkedHashSet();

    /* loaded from: classes.dex */
    public class a extends e.m0.d {

        /* renamed from: c */
        final /* synthetic */ int f4237c;

        /* renamed from: d */
        final /* synthetic */ e.m0.k.b f4238d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, e.m0.k.b bVar) {
            super(str, objArr);
            f.this = r1;
            this.f4237c = i;
            this.f4238d = bVar;
        }

        @Override // e.m0.d
        public void k() {
            try {
                f.this.H0(this.f4237c, this.f4238d);
            } catch (IOException e2) {
                f.this.m0(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends e.m0.d {

        /* renamed from: c */
        final /* synthetic */ int f4240c;

        /* renamed from: d */
        final /* synthetic */ long f4241d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            f.this = r1;
            this.f4240c = i;
            this.f4241d = j;
        }

        @Override // e.m0.d
        public void k() {
            try {
                f.this.w.m0(this.f4240c, this.f4241d);
            } catch (IOException e2) {
                f.this.m0(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends e.m0.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object... objArr) {
            super(str, objArr);
            f.this = r1;
        }

        @Override // e.m0.d
        public void k() {
            f.this.G0(false, 2, 0);
        }
    }

    /* loaded from: classes.dex */
    public class d extends e.m0.d {

        /* renamed from: c */
        final /* synthetic */ int f4244c;

        /* renamed from: d */
        final /* synthetic */ List f4245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            f.this = r1;
            this.f4244c = i;
            this.f4245d = list;
        }

        @Override // e.m0.d
        public void k() {
            if (f.this.k.a(this.f4244c, this.f4245d)) {
                try {
                    f.this.w.k0(this.f4244c, e.m0.k.b.CANCEL);
                    synchronized (f.this) {
                        f.this.y.remove(Integer.valueOf(this.f4244c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends e.m0.d {

        /* renamed from: c */
        final /* synthetic */ int f4247c;

        /* renamed from: d */
        final /* synthetic */ List f4248d;

        /* renamed from: e */
        final /* synthetic */ boolean f4249e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            f.this = r1;
            this.f4247c = i;
            this.f4248d = list;
            this.f4249e = z;
        }

        @Override // e.m0.d
        public void k() {
            boolean b2 = f.this.k.b(this.f4247c, this.f4248d, this.f4249e);
            if (b2) {
                try {
                    f.this.w.k0(this.f4247c, e.m0.k.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b2 || this.f4249e) {
                synchronized (f.this) {
                    f.this.y.remove(Integer.valueOf(this.f4247c));
                }
            }
        }
    }

    /* renamed from: e.m0.k.f$f */
    /* loaded from: classes.dex */
    public class C0115f extends e.m0.d {

        /* renamed from: c */
        final /* synthetic */ int f4251c;

        /* renamed from: d */
        final /* synthetic */ f.c f4252d;

        /* renamed from: e */
        final /* synthetic */ int f4253e;

        /* renamed from: f */
        final /* synthetic */ boolean f4254f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0115f(String str, Object[] objArr, int i, f.c cVar, int i2, boolean z) {
            super(str, objArr);
            f.this = r1;
            this.f4251c = i;
            this.f4252d = cVar;
            this.f4253e = i2;
            this.f4254f = z;
        }

        @Override // e.m0.d
        public void k() {
            try {
                boolean d2 = f.this.k.d(this.f4251c, this.f4252d, this.f4253e, this.f4254f);
                if (d2) {
                    f.this.w.k0(this.f4251c, e.m0.k.b.CANCEL);
                }
                if (!d2 && !this.f4254f) {
                    return;
                }
                synchronized (f.this) {
                    f.this.y.remove(Integer.valueOf(this.f4251c));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends e.m0.d {

        /* renamed from: c */
        final /* synthetic */ int f4256c;

        /* renamed from: d */
        final /* synthetic */ e.m0.k.b f4257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i, e.m0.k.b bVar) {
            super(str, objArr);
            f.this = r1;
            this.f4256c = i;
            this.f4257d = bVar;
        }

        @Override // e.m0.d
        public void k() {
            f.this.k.c(this.f4256c, this.f4257d);
            synchronized (f.this) {
                f.this.y.remove(Integer.valueOf(this.f4256c));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        Socket f4259a;

        /* renamed from: b */
        String f4260b;

        /* renamed from: c */
        f.e f4261c;

        /* renamed from: d */
        f.d f4262d;

        /* renamed from: e */
        j f4263e = j.f4268a;

        /* renamed from: f */
        e.m0.k.l f4264f = e.m0.k.l.f4334a;

        /* renamed from: g */
        boolean f4265g;

        /* renamed from: h */
        int f4266h;

        public h(boolean z) {
            this.f4265g = z;
        }

        public f a() {
            return new f(this);
        }

        public h b(j jVar) {
            this.f4263e = jVar;
            return this;
        }

        public h c(int i) {
            this.f4266h = i;
            return this;
        }

        public h d(Socket socket, String str, f.e eVar, f.d dVar) {
            this.f4259a = socket;
            this.f4260b = str;
            this.f4261c = eVar;
            this.f4262d = dVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class i extends e.m0.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super("OkHttp %s ping", r3.f4233e);
            f.this = r3;
        }

        @Override // e.m0.d
        public void k() {
            boolean z;
            synchronized (f.this) {
                if (f.this.m < f.this.l) {
                    z = true;
                } else {
                    f.N(f.this);
                    z = false;
                }
            }
            f fVar = f.this;
            if (z) {
                fVar.m0(null);
            } else {
                fVar.G0(false, 1, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        public static final j f4268a = new a();

        /* loaded from: classes.dex */
        class a extends j {
            a() {
            }

            @Override // e.m0.k.f.j
            public void b(e.m0.k.i iVar) {
                iVar.d(e.m0.k.b.REFUSED_STREAM, null);
            }
        }

        public void a(f fVar) {
        }

        public abstract void b(e.m0.k.i iVar);
    }

    /* loaded from: classes.dex */
    final class k extends e.m0.d {

        /* renamed from: c */
        final boolean f4269c;

        /* renamed from: d */
        final int f4270d;

        /* renamed from: e */
        final int f4271e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", r3.f4233e, Integer.valueOf(i), Integer.valueOf(i2));
            f.this = r3;
            this.f4269c = z;
            this.f4270d = i;
            this.f4271e = i2;
        }

        @Override // e.m0.d
        public void k() {
            f.this.G0(this.f4269c, this.f4270d, this.f4271e);
        }
    }

    /* loaded from: classes.dex */
    public class l extends e.m0.d implements h.b {

        /* renamed from: c */
        final e.m0.k.h f4273c;

        /* loaded from: classes.dex */
        class a extends e.m0.d {

            /* renamed from: c */
            final /* synthetic */ e.m0.k.i f4275c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, e.m0.k.i iVar) {
                super(str, objArr);
                l.this = r1;
                this.f4275c = iVar;
            }

            @Override // e.m0.d
            public void k() {
                try {
                    f.this.f4231c.b(this.f4275c);
                } catch (IOException e2) {
                    e.m0.l.f j = e.m0.l.f.j();
                    j.p(4, "Http2Connection.Listener failure for " + f.this.f4233e, e2);
                    try {
                        this.f4275c.d(e.m0.k.b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        class b extends e.m0.d {

            /* renamed from: c */
            final /* synthetic */ boolean f4277c;

            /* renamed from: d */
            final /* synthetic */ m f4278d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z, m mVar) {
                super(str, objArr);
                l.this = r1;
                this.f4277c = z;
                this.f4278d = mVar;
            }

            @Override // e.m0.d
            public void k() {
                l.this.l(this.f4277c, this.f4278d);
            }
        }

        /* loaded from: classes.dex */
        public class c extends e.m0.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object... objArr) {
                super(str, objArr);
                l.this = r1;
            }

            @Override // e.m0.d
            public void k() {
                f fVar = f.this;
                fVar.f4231c.a(fVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e.m0.k.h hVar) {
            super("OkHttp %s", r3.f4233e);
            f.this = r3;
            this.f4273c = hVar;
        }

        @Override // e.m0.k.h.b
        public void a(boolean z, int i, int i2, List<e.m0.k.c> list) {
            if (f.this.x0(i)) {
                f.this.u0(i, list, z);
                return;
            }
            synchronized (f.this) {
                e.m0.k.i n0 = f.this.n0(i);
                if (n0 != null) {
                    n0.n(e.m0.e.I(list), z);
                } else if (f.this.f4236h) {
                } else {
                    f fVar = f.this;
                    if (i <= fVar.f4234f) {
                        return;
                    }
                    if (i % 2 == fVar.f4235g % 2) {
                        return;
                    }
                    e.m0.k.i iVar = new e.m0.k.i(i, f.this, false, z, e.m0.e.I(list));
                    f fVar2 = f.this;
                    fVar2.f4234f = i;
                    fVar2.f4232d.put(Integer.valueOf(i), iVar);
                    f.z.execute(new a("OkHttp %s stream %d", new Object[]{f.this.f4233e, Integer.valueOf(i)}, iVar));
                }
            }
        }

        @Override // e.m0.k.h.b
        public void b() {
        }

        @Override // e.m0.k.h.b
        public void c(int i, long j) {
            f fVar = f.this;
            if (i == 0) {
                synchronized (fVar) {
                    f fVar2 = f.this;
                    fVar2.s += j;
                    fVar2.notifyAll();
                }
                return;
            }
            e.m0.k.i n0 = fVar.n0(i);
            if (n0 == null) {
                return;
            }
            synchronized (n0) {
                n0.a(j);
            }
        }

        @Override // e.m0.k.h.b
        public void d(boolean z, m mVar) {
            try {
                f.this.i.execute(new b("OkHttp %s ACK Settings", new Object[]{f.this.f4233e}, z, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // e.m0.k.h.b
        public void e(int i, int i2, List<e.m0.k.c> list) {
            f.this.v0(i2, list);
        }

        @Override // e.m0.k.h.b
        public void f(boolean z, int i, f.e eVar, int i2) {
            if (f.this.x0(i)) {
                f.this.s0(i, eVar, i2, z);
                return;
            }
            e.m0.k.i n0 = f.this.n0(i);
            if (n0 == null) {
                f.this.I0(i, e.m0.k.b.PROTOCOL_ERROR);
                long j = i2;
                f.this.D0(j);
                eVar.w(j);
                return;
            }
            n0.m(eVar, i2);
            if (!z) {
                return;
            }
            n0.n(e.m0.e.f4064c, true);
        }

        @Override // e.m0.k.h.b
        public void g(boolean z, int i, int i2) {
            if (!z) {
                try {
                    f.this.i.execute(new k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (f.this) {
                try {
                    if (i == 1) {
                        f.k(f.this);
                    } else if (i == 2) {
                        f.j0(f.this);
                    } else if (i == 3) {
                        f.k0(f.this);
                        f.this.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // e.m0.k.h.b
        public void h(int i, e.m0.k.b bVar, f.f fVar) {
            e.m0.k.i[] iVarArr;
            fVar.r();
            synchronized (f.this) {
                iVarArr = (e.m0.k.i[]) f.this.f4232d.values().toArray(new e.m0.k.i[f.this.f4232d.size()]);
                f.this.f4236h = true;
            }
            for (e.m0.k.i iVar : iVarArr) {
                if (iVar.g() > i && iVar.j()) {
                    iVar.o(e.m0.k.b.REFUSED_STREAM);
                    f.this.y0(iVar.g());
                }
            }
        }

        @Override // e.m0.k.h.b
        public void i(int i, int i2, int i3, boolean z) {
        }

        @Override // e.m0.k.h.b
        public void j(int i, e.m0.k.b bVar) {
            if (f.this.x0(i)) {
                f.this.w0(i, bVar);
                return;
            }
            e.m0.k.i y0 = f.this.y0(i);
            if (y0 == null) {
                return;
            }
            y0.o(bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [e.m0.k.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [e.m0.k.h, java.io.Closeable] */
        @Override // e.m0.d
        protected void k() {
            Throwable th;
            e.m0.k.b bVar;
            e.m0.k.b bVar2 = e.m0.k.b.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.f4273c.k(this);
                    while (this.f4273c.c(false, this)) {
                    }
                    e.m0.k.b bVar3 = e.m0.k.b.NO_ERROR;
                    try {
                        f.this.l0(bVar3, e.m0.k.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e3) {
                        e2 = e3;
                        e.m0.k.b bVar4 = e.m0.k.b.PROTOCOL_ERROR;
                        f fVar = f.this;
                        fVar.l0(bVar4, bVar4, e2);
                        bVar = fVar;
                        bVar2 = this.f4273c;
                        e.m0.e.e(bVar2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f.this.l0(bVar, bVar2, e2);
                    e.m0.e.e(this.f4273c);
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                f.this.l0(bVar, bVar2, e2);
                e.m0.e.e(this.f4273c);
                throw th;
            }
            bVar2 = this.f4273c;
            e.m0.e.e(bVar2);
        }

        void l(boolean z, m mVar) {
            e.m0.k.i[] iVarArr;
            long j;
            synchronized (f.this.w) {
                synchronized (f.this) {
                    int d2 = f.this.u.d();
                    if (z) {
                        f.this.u.a();
                    }
                    f.this.u.h(mVar);
                    int d3 = f.this.u.d();
                    iVarArr = null;
                    if (d3 == -1 || d3 == d2) {
                        j = 0;
                    } else {
                        j = d3 - d2;
                        if (!f.this.f4232d.isEmpty()) {
                            iVarArr = (e.m0.k.i[]) f.this.f4232d.values().toArray(new e.m0.k.i[f.this.f4232d.size()]);
                        }
                    }
                }
                try {
                    f fVar = f.this;
                    fVar.w.a(fVar.u);
                } catch (IOException e2) {
                    f.this.m0(e2);
                }
            }
            if (iVarArr != null) {
                for (e.m0.k.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j);
                    }
                }
            }
            f.z.execute(new c("OkHttp %s settings", f.this.f4233e));
        }
    }

    f(h hVar) {
        m mVar = new m();
        this.u = mVar;
        this.k = hVar.f4264f;
        boolean z2 = hVar.f4265g;
        this.f4230b = z2;
        this.f4231c = hVar.f4263e;
        int i2 = z2 ? 1 : 2;
        this.f4235g = i2;
        if (z2) {
            this.f4235g = i2 + 2;
        }
        if (z2) {
            this.t.i(7, 16777216);
        }
        String str = hVar.f4260b;
        this.f4233e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, e.m0.e.G(e.m0.e.o("OkHttp %s Writer", str), false));
        this.i = scheduledThreadPoolExecutor;
        if (hVar.f4266h != 0) {
            i iVar = new i();
            int i3 = hVar.f4266h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i3, i3, TimeUnit.MILLISECONDS);
        }
        this.j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.m0.e.G(e.m0.e.o("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.s = mVar.d();
        this.v = hVar.f4259a;
        this.w = new e.m0.k.j(hVar.f4262d, z2);
        this.x = new l(new e.m0.k.h(hVar.f4261c, z2));
    }

    static /* synthetic */ long N(f fVar) {
        long j2 = fVar.l;
        fVar.l = 1 + j2;
        return j2;
    }

    static /* synthetic */ long j0(f fVar) {
        long j2 = fVar.o;
        fVar.o = 1 + j2;
        return j2;
    }

    static /* synthetic */ long k(f fVar) {
        long j2 = fVar.m;
        fVar.m = 1 + j2;
        return j2;
    }

    static /* synthetic */ long k0(f fVar) {
        long j2 = fVar.p;
        fVar.p = 1 + j2;
        return j2;
    }

    public void m0(@Nullable IOException iOException) {
        e.m0.k.b bVar = e.m0.k.b.PROTOCOL_ERROR;
        l0(bVar, bVar, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x0073, TryCatch #1 {, blocks: (B:4:0x0006, B:24:0x004d, B:25:0x0053, B:27:0x0057, B:28:0x005c, B:32:0x0065, B:33:0x006c, B:5:0x0007, B:7:0x000e, B:8:0x0013, B:10:0x0017, B:12:0x0029, B:14:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x004a, B:34:0x006d, B:35:0x0072), top: B:39:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private e.m0.k.i q0(int r11, java.util.List<e.m0.k.c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            e.m0.k.j r7 = r10.w
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L76
            int r0 = r10.f4235g     // Catch: java.lang.Throwable -> L73
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            e.m0.k.b r0 = e.m0.k.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L73
            r10.A0(r0)     // Catch: java.lang.Throwable -> L73
        L13:
            boolean r0 = r10.f4236h     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6d
            int r8 = r10.f4235g     // Catch: java.lang.Throwable -> L73
            int r0 = r8 + 2
            r10.f4235g = r0     // Catch: java.lang.Throwable -> L73
            e.m0.k.i r9 = new e.m0.k.i     // Catch: java.lang.Throwable -> L73
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L3a
            long r0 = r10.s     // Catch: java.lang.Throwable -> L73
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3a
            long r0 = r9.f4301b     // Catch: java.lang.Throwable -> L73
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L38
            goto L3a
        L38:
            r13 = 0
            goto L3b
        L3a:
            r13 = 1
        L3b:
            boolean r0 = r9.k()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L4a
            java.util.Map<java.lang.Integer, e.m0.k.i> r0 = r10.f4232d     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L73
        L4a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L53
            e.m0.k.j r11 = r10.w     // Catch: java.lang.Throwable -> L76
            r11.g0(r6, r8, r12)     // Catch: java.lang.Throwable -> L76
            goto L5c
        L53:
            boolean r0 = r10.f4230b     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L65
            e.m0.k.j r0 = r10.w     // Catch: java.lang.Throwable -> L76
            r0.j0(r11, r8, r12)     // Catch: java.lang.Throwable -> L76
        L5c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L64
            e.m0.k.j r11 = r10.w
            r11.flush()
        L64:
            return r9
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L76
        L6d:
            e.m0.k.a r11 = new e.m0.k.a     // Catch: java.lang.Throwable -> L73
            r11.<init>()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L76
        L76:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.k.f.q0(int, java.util.List, boolean):e.m0.k.i");
    }

    private synchronized void t0(e.m0.d dVar) {
        if (!this.f4236h) {
            this.j.execute(dVar);
        }
    }

    public void A0(e.m0.k.b bVar) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f4236h) {
                    return;
                }
                this.f4236h = true;
                this.w.f0(this.f4234f, bVar, e.m0.e.f4062a);
            }
        }
    }

    public void B0() {
        C0(true);
    }

    void C0(boolean z2) {
        if (z2) {
            this.w.c();
            this.w.l0(this.t);
            int d2 = this.t.d();
            if (d2 != 65535) {
                this.w.m0(0, d2 - 65535);
            }
        }
        new Thread(this.x).start();
    }

    public synchronized void D0(long j2) {
        long j3 = this.r + j2;
        this.r = j3;
        if (j3 >= this.t.d() / 2) {
            J0(0, this.r);
            this.r = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.w.h0());
        r6 = r3;
        r8.s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E0(int r9, boolean r10, f.c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            e.m0.k.j r12 = r8.w
            r12.k(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r3 = r8.s     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, e.m0.k.i> r3 = r8.f4232d     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            e.m0.k.j r3 = r8.w     // Catch: java.lang.Throwable -> L56
            int r3 = r3.h0()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.s     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.s = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            e.m0.k.j r4 = r8.w
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.k(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.k.f.E0(int, boolean, f.c, long):void");
    }

    public void F0(int i2, boolean z2, List<e.m0.k.c> list) {
        this.w.g0(z2, i2, list);
    }

    void G0(boolean z2, int i2, int i3) {
        try {
            this.w.i0(z2, i2, i3);
        } catch (IOException e2) {
            m0(e2);
        }
    }

    public void H0(int i2, e.m0.k.b bVar) {
        this.w.k0(i2, bVar);
    }

    public void I0(int i2, e.m0.k.b bVar) {
        try {
            this.i.execute(new a("OkHttp %s stream %d", new Object[]{this.f4233e, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void J0(int i2, long j2) {
        try {
            this.i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f4233e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        l0(e.m0.k.b.NO_ERROR, e.m0.k.b.CANCEL, null);
    }

    public void flush() {
        this.w.flush();
    }

    void l0(e.m0.k.b bVar, e.m0.k.b bVar2, @Nullable IOException iOException) {
        try {
            A0(bVar);
        } catch (IOException unused) {
        }
        e.m0.k.i[] iVarArr = null;
        synchronized (this) {
            if (!this.f4232d.isEmpty()) {
                iVarArr = (e.m0.k.i[]) this.f4232d.values().toArray(new e.m0.k.i[this.f4232d.size()]);
                this.f4232d.clear();
            }
        }
        if (iVarArr != null) {
            for (e.m0.k.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.i.shutdown();
        this.j.shutdown();
    }

    synchronized e.m0.k.i n0(int i2) {
        return this.f4232d.get(Integer.valueOf(i2));
    }

    public synchronized boolean o0(long j2) {
        if (this.f4236h) {
            return false;
        }
        if (this.o < this.n) {
            if (j2 >= this.q) {
                return false;
            }
        }
        return true;
    }

    public synchronized int p0() {
        return this.u.e(Integer.MAX_VALUE);
    }

    public e.m0.k.i r0(List<e.m0.k.c> list, boolean z2) {
        return q0(0, list, z2);
    }

    void s0(int i2, f.e eVar, int i3, boolean z2) {
        f.c cVar = new f.c();
        long j2 = i3;
        eVar.M(j2);
        eVar.q(cVar, j2);
        if (cVar.v0() == j2) {
            t0(new C0115f("OkHttp %s Push Data[%s]", new Object[]{this.f4233e, Integer.valueOf(i2)}, i2, cVar, i3, z2));
            return;
        }
        throw new IOException(cVar.v0() + " != " + i3);
    }

    void u0(int i2, List<e.m0.k.c> list, boolean z2) {
        try {
            t0(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f4233e, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    void v0(int i2, List<e.m0.k.c> list) {
        synchronized (this) {
            if (this.y.contains(Integer.valueOf(i2))) {
                I0(i2, e.m0.k.b.PROTOCOL_ERROR);
                return;
            }
            this.y.add(Integer.valueOf(i2));
            try {
                t0(new d("OkHttp %s Push Request[%s]", new Object[]{this.f4233e, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    void w0(int i2, e.m0.k.b bVar) {
        t0(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f4233e, Integer.valueOf(i2)}, i2, bVar));
    }

    boolean x0(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized e.m0.k.i y0(int i2) {
        e.m0.k.i remove;
        remove = this.f4232d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public void z0() {
        synchronized (this) {
            long j2 = this.o;
            long j3 = this.n;
            if (j2 < j3) {
                return;
            }
            this.n = j3 + 1;
            this.q = System.nanoTime() + 1000000000;
            try {
                this.i.execute(new c("OkHttp %s ping", this.f4233e));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
