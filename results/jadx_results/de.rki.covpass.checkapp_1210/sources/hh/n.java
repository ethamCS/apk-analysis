package hh;
/* loaded from: classes3.dex */
public class n extends gg.t {

    /* renamed from: c */
    gg.d0 f11996c;

    /* renamed from: d */
    p0 f11997d;

    /* renamed from: q */
    b f11998q;

    /* renamed from: x */
    gg.c f11999x;

    private n(gg.d0 d0Var) {
        this.f11996c = d0Var;
        if (d0Var.size() == 3) {
            this.f11997d = p0.n(d0Var.G(0));
            this.f11998q = b.n(d0Var.G(1));
            this.f11999x = gg.c.F(d0Var.G(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static n m(gg.j0 j0Var, boolean z10) {
        return n(gg.d0.E(j0Var, z10));
    }

    public static n n(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj == null) {
            return null;
        }
        return new n(gg.d0.F(obj));
    }

    public p0 C() {
        return this.f11997d;
    }

    public int D() {
        return this.f11997d.D();
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f11996c;
    }

    public u0 l() {
        return this.f11997d.l();
    }

    public fh.c o() {
        return this.f11997d.o();
    }

    public gg.q q() {
        return this.f11997d.r();
    }

    public gg.c r() {
        return this.f11999x;
    }

    public b s() {
        return this.f11998q;
    }

    public u0 u() {
        return this.f11997d.u();
    }

    public fh.c w() {
        return this.f11997d.w();
    }

    public n0 z() {
        return this.f11997d.z();
    }
}
