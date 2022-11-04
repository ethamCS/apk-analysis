package hh;

import gg.k1;
import gg.x1;
/* loaded from: classes3.dex */
public class g0 extends gg.t {

    /* renamed from: c */
    gg.i f11962c;

    /* renamed from: d */
    gg.v f11963d;

    /* renamed from: q */
    b f11964q;

    /* renamed from: x */
    gg.c f11965x;

    private g0(gg.d0 d0Var) {
        if (d0Var.size() > 4 || d0Var.size() < 3) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        int i10 = 0;
        this.f11962c = gg.i.E(d0Var.G(0));
        if (d0Var.size() == 4) {
            this.f11963d = gg.v.K(d0Var.G(1));
            i10 = 1;
        }
        this.f11964q = b.n(d0Var.G(i10 + 1));
        this.f11965x = k1.M(d0Var.G(i10 + 2));
    }

    public static g0 n(gg.j0 j0Var, boolean z10) {
        return o(gg.d0.E(j0Var, z10));
    }

    public static g0 o(Object obj) {
        if (obj instanceof g0) {
            return (g0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new g0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(4);
        hVar.a(this.f11962c);
        gg.v vVar = this.f11963d;
        if (vVar != null) {
            hVar.a(vVar);
        }
        hVar.a(this.f11964q);
        hVar.a(this.f11965x);
        return new x1(hVar);
    }

    public b l() {
        return this.f11964q;
    }

    public gg.i m() {
        return this.f11962c;
    }

    public gg.c q() {
        return this.f11965x;
    }
}
