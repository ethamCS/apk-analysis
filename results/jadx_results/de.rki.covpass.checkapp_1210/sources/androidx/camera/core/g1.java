package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.g1;
import androidx.camera.core.g2;
import androidx.camera.core.k0;
import androidx.concurrent.futures.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;
import w.c2;
import w.h1;
import w.k0;
import w.o0;
import w.o2;
import w.p2;
/* loaded from: classes.dex */
public final class g1 extends c3 {
    public static final g I = new g();
    static final c0.a J = new c0.a();
    o2 A;
    g2 B;
    private w.h D;
    private w.r0 E;
    private i F;
    final Executor G;

    /* renamed from: m */
    final Executor f2192m;

    /* renamed from: n */
    private final int f2193n;

    /* renamed from: p */
    private final int f2195p;

    /* renamed from: s */
    private ExecutorService f2198s;

    /* renamed from: t */
    private w.k0 f2199t;

    /* renamed from: u */
    private w.j0 f2200u;

    /* renamed from: v */
    private int f2201v;

    /* renamed from: w */
    private w.l0 f2202w;

    /* renamed from: z */
    c2.b f2205z;

    /* renamed from: l */
    private final h1.a f2191l = e1.f2164a;

    /* renamed from: o */
    private final AtomicReference<Integer> f2194o = new AtomicReference<>(null);

    /* renamed from: q */
    private int f2196q = -1;

    /* renamed from: r */
    private Rational f2197r = null;

    /* renamed from: x */
    private boolean f2203x = false;

    /* renamed from: y */
    private boolean f2204y = true;
    private x5.a<Void> C = y.f.h(null);
    private Matrix H = new Matrix();

    /* loaded from: classes.dex */
    public class a extends w.h {
        a() {
            g1.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class b extends w.h {
        b() {
            g1.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class c implements i.c {

        /* renamed from: a */
        final /* synthetic */ z.p f2208a;

        c(z.p pVar) {
            g1.this = r1;
            this.f2208a = pVar;
        }

        @Override // androidx.camera.core.g1.i.c
        public void a(h hVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2208a.h(hVar.f2217b);
                this.f2208a.i(hVar.f2216a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ c.a f2210a;

        d(c.a aVar) {
            g1.this = r1;
            this.f2210a = aVar;
        }

        @Override // y.c
        public void a(Throwable th2) {
            g1.this.s0();
            this.f2210a.f(th2);
        }

        /* renamed from: c */
        public void b(Void r12) {
            g1.this.s0();
        }
    }

    /* loaded from: classes.dex */
    class e implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2212a = new AtomicInteger(0);

        e() {
            g1.this = r2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f2212a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements o2.a<g1, w.a1, f> {

        /* renamed from: a */
        private final w.q1 f2214a;

        public f() {
            this(w.q1.L());
        }

        private f(w.q1 q1Var) {
            this.f2214a = q1Var;
            Class cls = (Class) q1Var.a(z.i.f26356w, null);
            if (cls == null || cls.equals(g1.class)) {
                h(g1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public static f d(w.o0 o0Var) {
            return new f(w.q1.M(o0Var));
        }

        @Override // androidx.camera.core.h0
        public w.p1 a() {
            return this.f2214a;
        }

        public g1 c() {
            int intValue;
            int i10;
            o0.a<Integer> aVar;
            w.p1 p1Var;
            if (a().a(w.f1.f24450g, null) == null || a().a(w.f1.f24453j, null) == null) {
                Integer num = (Integer) a().a(w.a1.E, null);
                boolean z10 = false;
                if (num != null) {
                    androidx.core.util.h.b(a().a(w.a1.D, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                    a().g(w.d1.f24439f, num);
                } else {
                    if (a().a(w.a1.D, null) != null) {
                        p1Var = a();
                        aVar = w.d1.f24439f;
                        i10 = 35;
                    } else {
                        p1Var = a();
                        aVar = w.d1.f24439f;
                        i10 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    p1Var.g(aVar, Integer.valueOf(i10));
                }
                g1 g1Var = new g1(b());
                Size size = (Size) a().a(w.f1.f24453j, null);
                if (size != null) {
                    g1Var.p0(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) a().a(w.a1.F, 2)).intValue() >= 1) {
                    z10 = true;
                }
                androidx.core.util.h.b(z10, "Maximum outstanding image count must be at least 1");
                androidx.core.util.h.h((Executor) a().a(z.g.f26354u, x.a.c()), "The IO executor can't be null");
                w.p1 a10 = a();
                o0.a<Integer> aVar2 = w.a1.B;
                if (!a10.e(aVar2) || (intValue = ((Integer) a().b(aVar2)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return g1Var;
                }
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: e */
        public w.a1 b() {
            return new w.a1(w.u1.J(this.f2214a));
        }

        public f f(int i10) {
            a().g(w.o2.f24558r, Integer.valueOf(i10));
            return this;
        }

        public f g(int i10) {
            a().g(w.f1.f24450g, Integer.valueOf(i10));
            return this;
        }

        public f h(Class<g1> cls) {
            a().g(z.i.f26356w, cls);
            if (a().a(z.i.f26355v, null) == null) {
                i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public f i(String str) {
            a().g(z.i.f26355v, str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        private static final w.a1 f2215a = new f().f(4).g(0).b();

        public w.a1 a() {
            return f2215a;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        final int f2216a;

        /* renamed from: b */
        final int f2217b;

        /* renamed from: c */
        private final Rational f2218c;

        /* renamed from: d */
        private final Executor f2219d;

        /* renamed from: e */
        AtomicBoolean f2220e;

        /* renamed from: f */
        private final Rect f2221f;

        /* renamed from: g */
        private final Matrix f2222g;

        public /* synthetic */ void d(n1 n1Var) {
            throw null;
        }

        public /* synthetic */ void e(int i10, String str, Throwable th2) {
            new j1(i10, str, th2);
            throw null;
        }

        void c(n1 n1Var) {
            Size size;
            int j10;
            if (!this.f2220e.compareAndSet(false, true)) {
                n1Var.close();
                return;
            }
            if (g1.J.b(n1Var)) {
                try {
                    ByteBuffer c10 = n1Var.w()[0].c();
                    c10.rewind();
                    byte[] bArr = new byte[c10.capacity()];
                    c10.get(bArr);
                    androidx.camera.core.impl.utils.e d10 = androidx.camera.core.impl.utils.e.d(new ByteArrayInputStream(bArr));
                    c10.rewind();
                    size = new Size(d10.l(), d10.g());
                    j10 = d10.j();
                } catch (IOException e10) {
                    f(1, "Unable to parse JPEG exif", e10);
                    n1Var.close();
                    return;
                }
            } else {
                size = new Size(n1Var.d(), n1Var.a());
                j10 = this.f2216a;
            }
            final p2 p2Var = new p2(n1Var, size, q1.f(n1Var.I().a(), n1Var.I().c(), j10, this.f2222g));
            p2Var.D(g1.V(this.f2221f, this.f2218c, this.f2216a, size, j10));
            try {
                this.f2219d.execute(new Runnable() { // from class: androidx.camera.core.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g1.h.this.d(p2Var);
                    }
                });
            } catch (RejectedExecutionException unused) {
                s1.c("ImageCapture", "Unable to post to the supplied executor.");
                n1Var.close();
            }
        }

        void f(final int i10, final String str, final Throwable th2) {
            if (!this.f2220e.compareAndSet(false, true)) {
                return;
            }
            try {
                this.f2219d.execute(new Runnable() { // from class: androidx.camera.core.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g1.h.this.e(i10, str, th2);
                    }
                });
            } catch (RejectedExecutionException unused) {
                s1.c("ImageCapture", "Unable to post to the supplied executor.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i implements k0.a {

        /* renamed from: e */
        private final b f2227e;

        /* renamed from: f */
        private final int f2228f;

        /* renamed from: g */
        private final c f2229g;

        /* renamed from: a */
        private final Deque<h> f2223a = new ArrayDeque();

        /* renamed from: b */
        h f2224b = null;

        /* renamed from: c */
        x5.a<n1> f2225c = null;

        /* renamed from: d */
        int f2226d = 0;

        /* renamed from: h */
        final Object f2230h = new Object();

        /* loaded from: classes.dex */
        public class a implements y.c<n1> {

            /* renamed from: a */
            final /* synthetic */ h f2231a;

            a(h hVar) {
                i.this = r1;
                this.f2231a = hVar;
            }

            @Override // y.c
            public void a(Throwable th2) {
                synchronized (i.this.f2230h) {
                    if (!(th2 instanceof CancellationException)) {
                        this.f2231a.f(g1.a0(th2), th2 != null ? th2.getMessage() : "Unknown error", th2);
                    }
                    i iVar = i.this;
                    iVar.f2224b = null;
                    iVar.f2225c = null;
                    iVar.b();
                }
            }

            /* renamed from: c */
            public void b(n1 n1Var) {
                synchronized (i.this.f2230h) {
                    androidx.core.util.h.g(n1Var);
                    r2 r2Var = new r2(n1Var);
                    r2Var.b(i.this);
                    i.this.f2226d++;
                    this.f2231a.c(r2Var);
                    i iVar = i.this;
                    iVar.f2224b = null;
                    iVar.f2225c = null;
                    iVar.b();
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            x5.a<n1> a(h hVar);
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(h hVar);
        }

        i(int i10, b bVar, c cVar) {
            this.f2228f = i10;
            this.f2227e = bVar;
            this.f2229g = cVar;
        }

        public void a(Throwable th2) {
            h hVar;
            x5.a<n1> aVar;
            ArrayList<h> arrayList;
            synchronized (this.f2230h) {
                hVar = this.f2224b;
                this.f2224b = null;
                aVar = this.f2225c;
                this.f2225c = null;
                arrayList = new ArrayList(this.f2223a);
                this.f2223a.clear();
            }
            if (hVar != null && aVar != null) {
                hVar.f(g1.a0(th2), th2.getMessage(), th2);
                aVar.cancel(true);
            }
            for (h hVar2 : arrayList) {
                hVar2.f(g1.a0(th2), th2.getMessage(), th2);
            }
        }

        void b() {
            synchronized (this.f2230h) {
                if (this.f2224b != null) {
                    return;
                }
                if (this.f2226d >= this.f2228f) {
                    s1.k("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                h poll = this.f2223a.poll();
                if (poll == null) {
                    return;
                }
                this.f2224b = poll;
                c cVar = this.f2229g;
                if (cVar != null) {
                    cVar.a(poll);
                }
                x5.a<n1> a10 = this.f2227e.a(poll);
                this.f2225c = a10;
                y.f.b(a10, new a(poll), x.a.a());
            }
        }

        @Override // androidx.camera.core.k0.a
        public void c(n1 n1Var) {
            synchronized (this.f2230h) {
                this.f2226d--;
                b();
            }
        }
    }

    g1(w.a1 a1Var) {
        super(a1Var);
        int i10 = 1;
        w.a1 a1Var2 = (w.a1) g();
        this.f2193n = a1Var2.e(w.a1.A) ? a1Var2.I() : i10;
        this.f2195p = a1Var2.L(0);
        Executor executor = (Executor) androidx.core.util.h.g(a1Var2.N(x.a.c()));
        this.f2192m = executor;
        this.G = x.a.f(executor);
    }

    private void T() {
        if (this.F != null) {
            this.F.a(new l("Camera is closed."));
        }
    }

    static Rect V(Rect rect, Rational rational, int i10, Size size, int i11) {
        if (rect != null) {
            return d0.a.b(rect, i10, size, i11);
        }
        if (rational != null) {
            if (i11 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (d0.a.f(size, rational)) {
                return d0.a.a(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    static boolean X(w.p1 p1Var) {
        o0.a<Boolean> aVar = w.a1.H;
        Boolean bool = Boolean.FALSE;
        boolean z10 = false;
        if (((Boolean) p1Var.a(aVar, bool)).booleanValue()) {
            boolean z11 = true;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26) {
                s1.k("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i10);
                z11 = false;
            }
            Integer num = (Integer) p1Var.a(w.a1.E, null);
            if (num == null || num.intValue() == 256) {
                z10 = z11;
            } else {
                s1.k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z10) {
                s1.k("ImageCapture", "Unable to support software JPEG. Disabling.");
                p1Var.g(aVar, bool);
            }
        }
        return z10;
    }

    private w.j0 Y(w.j0 j0Var) {
        List<w.m0> a10 = this.f2200u.a();
        return (a10 == null || a10.isEmpty()) ? j0Var : a0.a(a10);
    }

    static int a0(Throwable th2) {
        if (th2 instanceof l) {
            return 3;
        }
        if (!(th2 instanceof j1)) {
            return 0;
        }
        return ((j1) th2).b();
    }

    private int c0() {
        w.a1 a1Var = (w.a1) g();
        if (a1Var.e(w.a1.J)) {
            return a1Var.O();
        }
        int i10 = this.f2193n;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f2193n + " is invalid");
    }

    private static boolean d0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void g0(String str, w.a1 a1Var, Size size, w.c2 c2Var, c2.e eVar) {
        U();
        if (p(str)) {
            c2.b W = W(str, a1Var, size);
            this.f2205z = W;
            I(W.m());
            t();
        }
    }

    public static /* synthetic */ void h0(h hVar, String str, Throwable th2) {
        s1.c("ImageCapture", "Processing image failed! " + str);
        hVar.f(2, str, th2);
    }

    public static /* synthetic */ Void i0(List list) {
        return null;
    }

    public static /* synthetic */ void j0(w.h1 h1Var) {
        try {
            n1 e10 = h1Var.e();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + e10);
            if (e10 == null) {
                return;
            }
            e10.close();
        } catch (IllegalStateException e11) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e11);
        }
    }

    public static /* synthetic */ void l0(c.a aVar, w.h1 h1Var) {
        try {
            n1 e10 = h1Var.e();
            if (e10 == null) {
                aVar.f(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.c(e10)) {
                e10.close();
            }
        } catch (IllegalStateException e11) {
            aVar.f(e11);
        }
    }

    public /* synthetic */ Object n0(h hVar, final c.a aVar) {
        this.A.g(new h1.a() { // from class: androidx.camera.core.d1
            @Override // w.h1.a
            public final void a(w.h1 h1Var) {
                g1.l0(c.a.this, h1Var);
            }
        }, x.a.d());
        o0();
        final x5.a<Void> e02 = e0(hVar);
        y.f.b(e02, new d(aVar), this.f2198s);
        aVar.a(new Runnable() { // from class: androidx.camera.core.b1
            @Override // java.lang.Runnable
            public final void run() {
                x5.a.this.cancel(true);
            }
        }, x.a.a());
        return "takePictureInternal";
    }

    private void o0() {
        synchronized (this.f2194o) {
            if (this.f2194o.get() != null) {
                return;
            }
            this.f2194o.set(Integer.valueOf(b0()));
        }
    }

    /* renamed from: q0 */
    public x5.a<n1> f0(final h hVar) {
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.z0
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object n02;
                n02 = g1.this.n0(hVar, aVar);
                return n02;
            }
        });
    }

    private void r0() {
        synchronized (this.f2194o) {
            if (this.f2194o.get() != null) {
                return;
            }
            e().h(b0());
        }
    }

    @Override // androidx.camera.core.c3
    public void A() {
        x5.a<Void> aVar = this.C;
        T();
        U();
        this.f2203x = false;
        final ExecutorService executorService = this.f2198s;
        aVar.b(new Runnable() { // from class: androidx.camera.core.a1
            @Override // java.lang.Runnable
            public final void run() {
                executorService.shutdown();
            }
        }, x.a.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
        if (d0(r8, 35) != false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [w.o2, w.a2] */
    /* JADX WARN: Type inference failed for: r8v8, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected w.o2<?> B(w.b0 r8, w.o2.a<?, ?, ?> r9) {
        /*
            r7 = this;
            w.o2 r0 = r9.b()
            w.o0$a<w.l0> r1 = w.a1.D
            r2 = 0
            java.lang.Object r0 = r0.a(r1, r2)
            java.lang.String r3 = "ImageCapture"
            if (r0 == 0) goto L26
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 < r4) goto L26
            java.lang.String r8 = "Requesting software JPEG due to a CaptureProcessor is set."
            androidx.camera.core.s1.e(r3, r8)
            w.p1 r8 = r9.a()
            w.o0$a<java.lang.Boolean> r0 = w.a1.H
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.g(r0, r3)
            goto L58
        L26:
            w.y1 r8 = r8.h()
            java.lang.Class<b0.e> r0 = b0.e.class
            boolean r8 = r8.a(r0)
            if (r8 == 0) goto L58
            w.p1 r8 = r9.a()
            w.o0$a<java.lang.Boolean> r0 = w.a1.H
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.a(r0, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4c
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            androidx.camera.core.s1.k(r3, r8)
            goto L58
        L4c:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            androidx.camera.core.s1.e(r3, r8)
            w.p1 r8 = r9.a()
            r8.g(r0, r4)
        L58:
            w.p1 r8 = r9.a()
            boolean r8 = X(r8)
            w.p1 r0 = r9.a()
            w.o0$a<java.lang.Integer> r3 = w.a1.E
            java.lang.Object r0 = r0.a(r3, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = 0
            r4 = 1
            r5 = 35
            if (r0 == 0) goto L99
            w.p1 r6 = r9.a()
            java.lang.Object r1 = r6.a(r1, r2)
            if (r1 != 0) goto L7e
            r1 = r4
            goto L7f
        L7e:
            r1 = r3
        L7f:
            java.lang.String r2 = "Cannot set buffer format with CaptureProcessor defined."
            androidx.core.util.h.b(r1, r2)
            w.p1 r1 = r9.a()
            w.o0$a<java.lang.Integer> r2 = w.d1.f24439f
            if (r8 == 0) goto L8d
            goto L91
        L8d:
            int r5 = r0.intValue()
        L91:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r1.g(r2, r8)
            goto Lde
        L99:
            w.p1 r0 = r9.a()
            java.lang.Object r0 = r0.a(r1, r2)
            if (r0 != 0) goto Ld1
            if (r8 == 0) goto La6
            goto Ld1
        La6:
            w.p1 r8 = r9.a()
            w.o0$a<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = w.f1.f24456m
            java.lang.Object r8 = r8.a(r0, r2)
            java.util.List r8 = (java.util.List) r8
            r0 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto Lc4
        Lb6:
            w.p1 r8 = r9.a()
            w.o0$a<java.lang.Integer> r1 = w.d1.f24439f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.g(r1, r0)
            goto Lde
        Lc4:
            boolean r1 = d0(r8, r0)
            if (r1 == 0) goto Lcb
            goto Lb6
        Lcb:
            boolean r8 = d0(r8, r5)
            if (r8 == 0) goto Lde
        Ld1:
            w.p1 r8 = r9.a()
            w.o0$a<java.lang.Integer> r0 = w.d1.f24439f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r8.g(r0, r1)
        Lde:
            w.p1 r8 = r9.a()
            w.o0$a<java.lang.Integer> r0 = w.a1.F
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.a(r0, r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < r4) goto Lf6
            r3 = r4
        Lf6:
            java.lang.String r8 = "Maximum outstanding image count must be at least 1"
            androidx.core.util.h.b(r3, r8)
            w.o2 r8 = r9.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.g1.B(w.b0, w.o2$a):w.o2");
    }

    @Override // androidx.camera.core.c3
    public void D() {
        T();
    }

    @Override // androidx.camera.core.c3
    protected Size E(Size size) {
        c2.b W = W(f(), (w.a1) g(), size);
        this.f2205z = W;
        I(W.m());
        r();
        return size;
    }

    @Override // androidx.camera.core.c3
    public void G(Matrix matrix) {
        this.H = matrix;
    }

    void U() {
        androidx.camera.core.impl.utils.l.a();
        i iVar = this.F;
        if (iVar != null) {
            iVar.a(new CancellationException("Request is canceled."));
            this.F = null;
        }
        w.r0 r0Var = this.E;
        this.E = null;
        this.A = null;
        this.B = null;
        this.C = y.f.h(null);
        if (r0Var != null) {
            r0Var.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    w.c2.b W(final java.lang.String r16, final w.a1 r17, final android.util.Size r18) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.g1.W(java.lang.String, w.a1, android.util.Size):w.c2$b");
    }

    public int Z() {
        return this.f2193n;
    }

    public int b0() {
        int i10;
        synchronized (this.f2194o) {
            i10 = this.f2196q;
            if (i10 == -1) {
                i10 = ((w.a1) g()).K(2);
            }
        }
        return i10;
    }

    x5.a<Void> e0(final h hVar) {
        String str;
        w.j0 j0Var;
        s1.a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.B != null) {
            j0Var = Y(a0.c());
            if (j0Var == null) {
                return y.f.f(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.f2202w == null && j0Var.a().size() > 1) {
                return y.f.f(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (j0Var.a().size() > this.f2201v) {
                return y.f.f(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.B.v(j0Var);
            this.B.w(x.a.a(), new g2.f() { // from class: androidx.camera.core.y0
                @Override // androidx.camera.core.g2.f
                public final void a(String str2, Throwable th2) {
                    g1.h0(g1.h.this, str2, th2);
                }
            });
            str = this.B.q();
        } else {
            j0Var = Y(a0.c());
            if (j0Var.a().size() > 1) {
                return y.f.f(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (w.m0 m0Var : j0Var.a()) {
            k0.a aVar = new k0.a();
            aVar.p(this.f2199t.g());
            aVar.e(this.f2199t.d());
            aVar.a(this.f2205z.p());
            aVar.f(this.E);
            if (i() == 256) {
                if (J.a()) {
                    aVar.d(w.k0.f24491h, Integer.valueOf(hVar.f2216a));
                }
                aVar.d(w.k0.f24492i, Integer.valueOf(hVar.f2217b));
            }
            aVar.e(m0Var.a().d());
            if (str != null) {
                aVar.g(str, Integer.valueOf(m0Var.getId()));
            }
            aVar.c(this.D);
            arrayList.add(aVar.h());
        }
        return y.f.o(e().d(arrayList, this.f2193n, this.f2195p), c1.f2129a, x.a.a());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    public w.o2<?> h(boolean z10, w.p2 p2Var) {
        w.o0 a10 = p2Var.a(p2.b.IMAGE_CAPTURE, Z());
        if (z10) {
            a10 = w.n0.b(a10, I.a());
        }
        if (a10 == null) {
            return null;
        }
        return n(a10).b();
    }

    @Override // androidx.camera.core.c3
    public o2.a<?, ?, ?> n(w.o0 o0Var) {
        return f.d(o0Var);
    }

    public void p0(Rational rational) {
        this.f2197r = rational;
    }

    void s0() {
        synchronized (this.f2194o) {
            Integer andSet = this.f2194o.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != b0()) {
                r0();
            }
        }
    }

    public String toString() {
        return "ImageCapture:" + j();
    }

    @Override // androidx.camera.core.c3
    public void x() {
        w.a1 a1Var = (w.a1) g();
        this.f2199t = k0.a.j(a1Var).h();
        this.f2202w = a1Var.J(null);
        this.f2201v = a1Var.P(2);
        this.f2200u = a1Var.H(a0.c());
        this.f2203x = a1Var.S();
        this.f2204y = a1Var.R();
        androidx.core.util.h.h(d(), "Attached camera cannot be null");
        this.f2198s = Executors.newFixedThreadPool(1, new e());
    }

    @Override // androidx.camera.core.c3
    protected void y() {
        r0();
    }
}
