package hh;

import gg.k1;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class o extends gg.t {

    /* renamed from: c */
    o0 f12002c;

    /* renamed from: d */
    b f12003d;

    /* renamed from: q */
    gg.c f12004q;

    /* renamed from: x */
    boolean f12005x = false;

    /* renamed from: y */
    int f12006y;

    private o(gg.d0 d0Var) {
        if (d0Var.size() == 3) {
            this.f12002c = o0.m(d0Var.G(0));
            this.f12003d = b.n(d0Var.G(1));
            this.f12004q = k1.M(d0Var.G(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for CertificateList");
    }

    public static o l(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj == null) {
            return null;
        }
        return new o(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f12002c);
        hVar.a(this.f12003d);
        hVar.a(this.f12004q);
        return new x1(hVar);
    }

    @Override // gg.t
    public int hashCode() {
        if (!this.f12005x) {
            this.f12006y = super.hashCode();
            this.f12005x = true;
        }
        return this.f12006y;
    }

    public fh.c m() {
        return this.f12002c.n();
    }

    public u0 n() {
        return this.f12002c.o();
    }

    public Enumeration o() {
        return this.f12002c.q();
    }

    public gg.c q() {
        return this.f12004q;
    }

    public b r() {
        return this.f12003d;
    }

    public o0 s() {
        return this.f12002c;
    }

    public u0 u() {
        return this.f12002c.s();
    }

    public int w() {
        return this.f12002c.u();
    }
}
