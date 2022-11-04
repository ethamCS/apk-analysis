package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.camera.core.b3;
import androidx.camera.core.c2;
import java.util.UUID;
import java.util.concurrent.Executor;
import w.c2;
import w.m0;
import w.o0;
import w.o2;
import w.p2;
/* loaded from: classes.dex */
public final class c2 extends c3 {

    /* renamed from: r */
    public static final c f2130r = new c();

    /* renamed from: s */
    private static final Executor f2131s = x.a.d();

    /* renamed from: l */
    private d f2132l;

    /* renamed from: n */
    private w.r0 f2134n;

    /* renamed from: o */
    b3 f2135o;

    /* renamed from: q */
    private Size f2137q;

    /* renamed from: m */
    private Executor f2133m = f2131s;

    /* renamed from: p */
    private boolean f2136p = false;

    /* loaded from: classes.dex */
    public class a extends w.h {

        /* renamed from: a */
        final /* synthetic */ w.b1 f2138a;

        a(w.b1 b1Var) {
            c2.this = r1;
            this.f2138a = b1Var;
        }

        @Override // w.h
        public void b(w.q qVar) {
            super.b(qVar);
            if (this.f2138a.a(new z.b(qVar))) {
                c2.this.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o2.a<c2, w.w1, b> {

        /* renamed from: a */
        private final w.q1 f2140a;

        public b() {
            this(w.q1.L());
        }

        private b(w.q1 q1Var) {
            this.f2140a = q1Var;
            Class cls = (Class) q1Var.a(z.i.f26356w, null);
            if (cls == null || cls.equals(c2.class)) {
                h(c2.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        static b d(w.o0 o0Var) {
            return new b(w.q1.M(o0Var));
        }

        @Override // androidx.camera.core.h0
        public w.p1 a() {
            return this.f2140a;
        }

        public c2 c() {
            if (a().a(w.f1.f24450g, null) == null || a().a(w.f1.f24453j, null) == null) {
                return new c2(b());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: e */
        public w.w1 b() {
            return new w.w1(w.u1.J(this.f2140a));
        }

        public b f(int i10) {
            a().g(w.o2.f24558r, Integer.valueOf(i10));
            return this;
        }

        public b g(int i10) {
            a().g(w.f1.f24450g, Integer.valueOf(i10));
            return this;
        }

        public b h(Class<c2> cls) {
            a().g(z.i.f26356w, cls);
            if (a().a(z.i.f26355v, null) == null) {
                i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b i(String str) {
            a().g(z.i.f26355v, str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private static final w.w1 f2141a = new b().f(2).g(0).b();

        public w.w1 a() {
            return f2141a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(b3 b3Var);
    }

    c2(w.w1 w1Var) {
        super(w1Var);
    }

    private Rect N(Size size) {
        if (o() != null) {
            return o();
        }
        if (size == null) {
            return null;
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public /* synthetic */ void O(String str, w.w1 w1Var, Size size, w.c2 c2Var, c2.e eVar) {
        if (p(str)) {
            I(M(str, w1Var, size).m());
            t();
        }
    }

    private boolean Q() {
        final b3 b3Var = this.f2135o;
        final d dVar = this.f2132l;
        if (dVar == null || b3Var == null) {
            return false;
        }
        this.f2133m.execute(new Runnable() { // from class: androidx.camera.core.a2
            @Override // java.lang.Runnable
            public final void run() {
                c2.d.this.a(b3Var);
            }
        });
        return true;
    }

    private void R() {
        w.d0 d10 = d();
        d dVar = this.f2132l;
        Rect N = N(this.f2137q);
        b3 b3Var = this.f2135o;
        if (d10 == null || dVar == null || N == null) {
            return;
        }
        b3Var.x(b3.g.d(N, k(d10), b()));
    }

    private void U(String str, w.w1 w1Var, Size size) {
        I(M(str, w1Var, size).m());
    }

    @Override // androidx.camera.core.c3
    public void A() {
        w.r0 r0Var = this.f2134n;
        if (r0Var != null) {
            r0Var.c();
        }
        this.f2135o = null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    protected w.o2<?> B(w.b0 b0Var, o2.a<?, ?, ?> aVar) {
        w.p1 p1Var;
        int i10;
        o0.a<Integer> aVar2;
        if (aVar.a().a(w.w1.B, null) != null) {
            p1Var = aVar.a();
            aVar2 = w.d1.f24439f;
            i10 = 35;
        } else {
            p1Var = aVar.a();
            aVar2 = w.d1.f24439f;
            i10 = 34;
        }
        p1Var.g(aVar2, Integer.valueOf(i10));
        return aVar.b();
    }

    @Override // androidx.camera.core.c3
    protected Size E(Size size) {
        this.f2137q = size;
        U(f(), (w.w1) g(), this.f2137q);
        return size;
    }

    @Override // androidx.camera.core.c3
    public void H(Rect rect) {
        super.H(rect);
        R();
    }

    c2.b M(final String str, final w.w1 w1Var, final Size size) {
        androidx.camera.core.impl.utils.l.a();
        c2.b o10 = c2.b.o(w1Var);
        w.l0 H = w1Var.H(null);
        w.r0 r0Var = this.f2134n;
        if (r0Var != null) {
            r0Var.c();
        }
        b3 b3Var = new b3(size, d(), w1Var.J(false));
        this.f2135o = b3Var;
        if (Q()) {
            R();
        } else {
            this.f2136p = true;
        }
        if (H != null) {
            m0.a aVar = new m0.a();
            final HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar.hashCode());
            l2 l2Var = new l2(size.getWidth(), size.getHeight(), w1Var.q(), new Handler(handlerThread.getLooper()), aVar, H, b3Var.k(), num);
            o10.d(l2Var.r());
            l2Var.i().b(new Runnable() { // from class: androidx.camera.core.z1
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            }, x.a.a());
            this.f2134n = l2Var;
            o10.l(num, Integer.valueOf(aVar.getId()));
        } else {
            w.b1 I = w1Var.I(null);
            if (I != null) {
                o10.d(new a(I));
            }
            this.f2134n = b3Var.k();
        }
        o10.k(this.f2134n);
        o10.f(new c2.c() { // from class: androidx.camera.core.b2
            @Override // w.c2.c
            public final void a(w.c2 c2Var, c2.e eVar) {
                c2.this.O(str, w1Var, size, c2Var, eVar);
            }
        });
        return o10;
    }

    public void S(d dVar) {
        T(f2131s, dVar);
    }

    public void T(Executor executor, d dVar) {
        androidx.camera.core.impl.utils.l.a();
        if (dVar == null) {
            this.f2132l = null;
            s();
            return;
        }
        this.f2132l = dVar;
        this.f2133m = executor;
        r();
        if (this.f2136p) {
            if (!Q()) {
                return;
            }
            R();
            this.f2136p = false;
        } else if (c() == null) {
        } else {
            U(f(), (w.w1) g(), c());
            t();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [w.o2<?>, w.o2] */
    @Override // androidx.camera.core.c3
    public w.o2<?> h(boolean z10, w.p2 p2Var) {
        w.o0 a10 = p2Var.a(p2.b.PREVIEW, 1);
        if (z10) {
            a10 = w.n0.b(a10, f2130r.a());
        }
        if (a10 == null) {
            return null;
        }
        return n(a10).b();
    }

    @Override // androidx.camera.core.c3
    public o2.a<?, ?, ?> n(w.o0 o0Var) {
        return b.d(o0Var);
    }

    public String toString() {
        return "Preview:" + j();
    }
}
