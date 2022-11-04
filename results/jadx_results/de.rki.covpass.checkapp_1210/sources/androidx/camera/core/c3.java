package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import w.o0;
import w.o2;
/* loaded from: classes.dex */
public abstract class c3 {

    /* renamed from: d */
    private w.o2<?> f2145d;

    /* renamed from: e */
    private w.o2<?> f2146e;

    /* renamed from: f */
    private w.o2<?> f2147f;

    /* renamed from: g */
    private Size f2148g;

    /* renamed from: h */
    private w.o2<?> f2149h;

    /* renamed from: i */
    private Rect f2150i;

    /* renamed from: j */
    private w.d0 f2151j;

    /* renamed from: a */
    private final Set<d> f2142a = new HashSet();

    /* renamed from: b */
    private final Object f2143b = new Object();

    /* renamed from: c */
    private c f2144c = c.INACTIVE;

    /* renamed from: k */
    private w.c2 f2152k = w.c2.a();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2153a;

        static {
            int[] iArr = new int[c.values().length];
            f2153a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2153a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(r rVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes.dex */
    public interface d {
        void c(c3 c3Var);

        void f(c3 c3Var);

        void j(c3 c3Var);

        void k(c3 c3Var);
    }

    public c3(w.o2<?> o2Var) {
        this.f2146e = o2Var;
        this.f2147f = o2Var;
    }

    private void F(d dVar) {
        this.f2142a.remove(dVar);
    }

    private void a(d dVar) {
        this.f2142a.add(dVar);
    }

    public void A() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w.o2<?>, w.o2] */
    protected w.o2<?> B(w.b0 b0Var, o2.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public void C() {
        y();
    }

    public void D() {
    }

    protected abstract Size E(Size size);

    public void G(Matrix matrix) {
    }

    public void H(Rect rect) {
        this.f2150i = rect;
    }

    public void I(w.c2 c2Var) {
        this.f2152k = c2Var;
        for (w.r0 r0Var : c2Var.j()) {
            if (r0Var.e() == null) {
                r0Var.o(getClass());
            }
        }
    }

    public void J(Size size) {
        this.f2148g = E(size);
    }

    public int b() {
        return ((w.f1) this.f2147f).A(-1);
    }

    public Size c() {
        return this.f2148g;
    }

    public w.d0 d() {
        w.d0 d0Var;
        synchronized (this.f2143b) {
            d0Var = this.f2151j;
        }
        return d0Var;
    }

    public w.y e() {
        synchronized (this.f2143b) {
            w.d0 d0Var = this.f2151j;
            if (d0Var == null) {
                return w.y.f24614a;
            }
            return d0Var.m();
        }
    }

    public String f() {
        w.d0 d10 = d();
        return ((w.d0) androidx.core.util.h.h(d10, "No camera attached to use case: " + this)).i().c();
    }

    public w.o2<?> g() {
        return this.f2147f;
    }

    public abstract w.o2<?> h(boolean z10, w.p2 p2Var);

    public int i() {
        return this.f2147f.q();
    }

    public String j() {
        w.o2<?> o2Var = this.f2147f;
        return o2Var.B("<UnknownUseCase-" + hashCode() + ">");
    }

    public int k(w.d0 d0Var) {
        return d0Var.i().e(m());
    }

    public w.c2 l() {
        return this.f2152k;
    }

    @SuppressLint({"WrongConstant"})
    protected int m() {
        return ((w.f1) this.f2147f).E(0);
    }

    public abstract o2.a<?, ?, ?> n(w.o0 o0Var);

    public Rect o() {
        return this.f2150i;
    }

    public boolean p(String str) {
        if (d() == null) {
            return false;
        }
        return Objects.equals(str, f());
    }

    public w.o2<?> q(w.b0 b0Var, w.o2<?> o2Var, w.o2<?> o2Var2) {
        w.q1 q1Var;
        if (o2Var2 != null) {
            q1Var = w.q1.M(o2Var2);
            q1Var.N(z.i.f26355v);
        } else {
            q1Var = w.q1.L();
        }
        for (o0.a<?> aVar : this.f2146e.c()) {
            q1Var.G(aVar, this.f2146e.d(aVar), this.f2146e.b(aVar));
        }
        if (o2Var != null) {
            for (o0.a<?> aVar2 : o2Var.c()) {
                if (!aVar2.c().equals(z.i.f26355v.c())) {
                    q1Var.G(aVar2, o2Var.d(aVar2), o2Var.b(aVar2));
                }
            }
        }
        if (q1Var.e(w.f1.f24453j)) {
            o0.a<Integer> aVar3 = w.f1.f24450g;
            if (q1Var.e(aVar3)) {
                q1Var.N(aVar3);
            }
        }
        return B(b0Var, n(q1Var));
    }

    public final void r() {
        this.f2144c = c.ACTIVE;
        u();
    }

    public final void s() {
        this.f2144c = c.INACTIVE;
        u();
    }

    public final void t() {
        for (d dVar : this.f2142a) {
            dVar.f(this);
        }
    }

    public final void u() {
        int i10 = a.f2153a[this.f2144c.ordinal()];
        if (i10 == 1) {
            for (d dVar : this.f2142a) {
                dVar.j(this);
            }
        } else if (i10 == 2) {
            for (d dVar2 : this.f2142a) {
                dVar2.c(this);
            }
        }
    }

    public final void v() {
        for (d dVar : this.f2142a) {
            dVar.k(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void w(w.d0 d0Var, w.o2<?> o2Var, w.o2<?> o2Var2) {
        synchronized (this.f2143b) {
            this.f2151j = d0Var;
            a(d0Var);
        }
        this.f2145d = o2Var;
        this.f2149h = o2Var2;
        w.o2<?> q10 = q(d0Var.i(), this.f2145d, this.f2149h);
        this.f2147f = q10;
        b D = q10.D(null);
        if (D != null) {
            D.b(d0Var.i());
        }
        x();
    }

    public void x() {
    }

    protected void y() {
    }

    public void z(w.d0 d0Var) {
        A();
        b D = this.f2147f.D(null);
        if (D != null) {
            D.a();
        }
        synchronized (this.f2143b) {
            androidx.core.util.h.a(d0Var == this.f2151j);
            F(this.f2151j);
            this.f2151j = null;
        }
        this.f2148g = null;
        this.f2150i = null;
        this.f2147f = this.f2146e;
        this.f2145d = null;
        this.f2149h = null;
    }
}
