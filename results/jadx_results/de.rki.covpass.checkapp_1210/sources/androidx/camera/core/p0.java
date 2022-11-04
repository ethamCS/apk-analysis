package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import w.c2;
import w.o2;
import w.p2;
/* loaded from: classes.dex */
public final class p0 extends c3 {

    /* renamed from: p */
    public static final d f2428p = new d();

    /* renamed from: q */
    private static final Boolean f2429q = null;

    /* renamed from: l */
    final s0 f2430l;

    /* renamed from: m */
    private final Object f2431m = new Object();

    /* renamed from: n */
    private a f2432n;

    /* renamed from: o */
    private w.r0 f2433o;

    /* loaded from: classes.dex */
    public interface a {
        Size a();

        void b(n1 n1Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements o2.a<p0, w.z0, c> {

        /* renamed from: a */
        private final w.q1 f2434a;

        public c() {
            this(w.q1.L());
        }

        private c(w.q1 q1Var) {
            this.f2434a = q1Var;
            Class cls = (Class) q1Var.a(z.i.f26356w, null);
            if (cls == null || cls.equals(p0.class)) {
                i(p0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        static c d(w.o0 o0Var) {
            return new c(w.q1.M(o0Var));
        }

        @Override // androidx.camera.core.h0
        public w.p1 a() {
            return this.f2434a;
        }

        public p0 c() {
            if (a().a(w.f1.f24450g, null) == null || a().a(w.f1.f24453j, null) == null) {
                return new p0(b());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: e */
        public w.z0 b() {
            return new w.z0(w.u1.J(this.f2434a));
        }

        public c f(Size size) {
            a().g(w.f1.f24454k, size);
            return this;
        }

        public c g(int i10) {
            a().g(w.o2.f24558r, Integer.valueOf(i10));
            return this;
        }

        public c h(int i10) {
            a().g(w.f1.f24450g, Integer.valueOf(i10));
            return this;
        }

        public c i(Class<p0> cls) {
            a().g(z.i.f26356w, cls);
            if (a().a(z.i.f26355v, null) == null) {
                j(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c j(String str) {
            a().g(z.i.f26355v, str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f2435a;

        /* renamed from: b */
        private static final w.z0 f2436b;

        static {
            Size size = new Size(640, 480);
            f2435a = size;
            f2436b = new c().f(size).g(1).h(0).b();
        }

        public w.z0 a() {
            return f2436b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    p0(w.z0 z0Var) {
        super(z0Var);
        if (((w.z0) g()).I(0) == 1) {
            this.f2430l = new t0();
        } else {
            this.f2430l = new u0(z0Var.H(x.a.b()));
        }
        this.f2430l.u(S());
        this.f2430l.v(U());
    }

    private boolean T(w.d0 d0Var) {
        return U() && k(d0Var) % 180 != 0;
    }

    public static /* synthetic */ void V(o2 o2Var, o2 o2Var2) {
        o2Var.n();
        if (o2Var2 != null) {
            o2Var2.n();
        }
    }

    public /* synthetic */ void W(String str, w.z0 z0Var, Size size, w.c2 c2Var, c2.e eVar) {
        N();
        this.f2430l.g();
        if (p(str)) {
            I(O(str, z0Var, size).m());
            t();
        }
    }

    private void Z() {
        w.d0 d10 = d();
        if (d10 != null) {
            this.f2430l.x(k(d10));
        }
    }

    @Override // androidx.camera.core.c3
    public void A() {
        N();
        this.f2430l.j();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    protected w.o2<?> B(w.b0 b0Var, o2.a<?, ?, ?> aVar) {
        Size a10;
        Boolean R = R();
        boolean a11 = b0Var.h().a(b0.d.class);
        s0 s0Var = this.f2430l;
        if (R != null) {
            a11 = R.booleanValue();
        }
        s0Var.t(a11);
        synchronized (this.f2431m) {
            a aVar2 = this.f2432n;
            a10 = aVar2 != null ? aVar2.a() : null;
        }
        if (a10 != null) {
            aVar.a().g(w.f1.f24453j, a10);
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.c3
    protected Size E(Size size) {
        I(O(f(), (w.z0) g(), size).m());
        return size;
    }

    @Override // androidx.camera.core.c3
    public void G(Matrix matrix) {
        this.f2430l.y(matrix);
    }

    @Override // androidx.camera.core.c3
    public void H(Rect rect) {
        super.H(rect);
        this.f2430l.z(rect);
    }

    void N() {
        androidx.camera.core.impl.utils.l.a();
        w.r0 r0Var = this.f2433o;
        if (r0Var != null) {
            r0Var.c();
            this.f2433o = null;
        }
    }

    c2.b O(final String str, final w.z0 z0Var, final Size size) {
        androidx.camera.core.impl.utils.l.a();
        Executor executor = (Executor) androidx.core.util.h.g(z0Var.H(x.a.b()));
        boolean z10 = true;
        int Q = P() == 1 ? Q() : 4;
        final o2 o2Var = z0Var.K() != null ? new o2(z0Var.K().a(size.getWidth(), size.getHeight(), i(), Q, 0L)) : new o2(p1.a(size.getWidth(), size.getHeight(), i(), Q));
        boolean T = d() != null ? T(d()) : false;
        int height = T ? size.getHeight() : size.getWidth();
        int width = T ? size.getWidth() : size.getHeight();
        int i10 = S() == 2 ? 1 : 35;
        boolean z11 = i() == 35 && S() == 2;
        if (i() != 35 || ((d() == null || k(d()) == 0) && !Boolean.TRUE.equals(R()))) {
            z10 = false;
        }
        final o2 o2Var2 = (z11 || z10) ? new o2(p1.a(height, width, i10, o2Var.i())) : null;
        if (o2Var2 != null) {
            this.f2430l.w(o2Var2);
        }
        Z();
        o2Var.g(this.f2430l, executor);
        c2.b o10 = c2.b.o(z0Var);
        w.r0 r0Var = this.f2433o;
        if (r0Var != null) {
            r0Var.c();
        }
        w.i1 i1Var = new w.i1(o2Var.b(), size, i());
        this.f2433o = i1Var;
        i1Var.i().b(new Runnable() { // from class: androidx.camera.core.m0
            @Override // java.lang.Runnable
            public final void run() {
                p0.V(o2.this, o2Var2);
            }
        }, x.a.d());
        o10.k(this.f2433o);
        o10.f(new c2.c() { // from class: androidx.camera.core.n0
            @Override // w.c2.c
            public final void a(w.c2 c2Var, c2.e eVar) {
                p0.this.W(str, z0Var, size, c2Var, eVar);
            }
        });
        return o10;
    }

    public int P() {
        return ((w.z0) g()).I(0);
    }

    public int Q() {
        return ((w.z0) g()).J(6);
    }

    public Boolean R() {
        return ((w.z0) g()).L(f2429q);
    }

    public int S() {
        return ((w.z0) g()).M(1);
    }

    public boolean U() {
        return ((w.z0) g()).N(Boolean.FALSE).booleanValue();
    }

    public void Y(Executor executor, final a aVar) {
        synchronized (this.f2431m) {
            this.f2430l.s(executor, new a() { // from class: androidx.camera.core.l0
                @Override // androidx.camera.core.p0.a
                public /* synthetic */ Size a() {
                    return o0.a(this);
                }

                @Override // androidx.camera.core.p0.a
                public final void b(n1 n1Var) {
                    p0.a.this.b(n1Var);
                }
            });
            if (this.f2432n == null) {
                r();
            }
            this.f2432n = aVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    public w.o2<?> h(boolean z10, w.p2 p2Var) {
        w.o0 a10 = p2Var.a(p2.b.IMAGE_ANALYSIS, 1);
        if (z10) {
            a10 = w.n0.b(a10, f2428p.a());
        }
        if (a10 == null) {
            return null;
        }
        return n(a10).b();
    }

    @Override // androidx.camera.core.c3
    public o2.a<?, ?, ?> n(w.o0 o0Var) {
        return c.d(o0Var);
    }

    public String toString() {
        return "ImageAnalysis:" + j();
    }

    @Override // androidx.camera.core.c3
    public void x() {
        this.f2430l.f();
    }
}
