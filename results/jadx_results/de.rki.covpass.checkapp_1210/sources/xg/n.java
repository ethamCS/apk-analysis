package xg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.t;
import gg.x1;
import hh.v;
/* loaded from: classes3.dex */
public class n extends t {

    /* renamed from: c */
    private b f25644c;

    /* renamed from: d */
    private c f25645d;

    /* renamed from: q */
    private gg.m f25646q;

    /* renamed from: x */
    private gg.m f25647x;

    /* renamed from: y */
    private v f25648y;

    private n(d0 d0Var) {
        j0 j0Var;
        this.f25644c = b.m(d0Var.G(0));
        this.f25645d = c.l(d0Var.G(1));
        this.f25646q = gg.m.J(d0Var.G(2));
        if (d0Var.size() > 4) {
            this.f25647x = gg.m.H((j0) d0Var.G(3), true);
            j0Var = (j0) d0Var.G(4);
        } else if (d0Var.size() <= 3) {
            return;
        } else {
            j0Var = (j0) d0Var.G(3);
            if (j0Var.Q() == 0) {
                this.f25647x = gg.m.H(j0Var, true);
                return;
            }
        }
        this.f25648y = v.m(j0Var, true);
    }

    public static n n(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj == null) {
            return null;
        }
        return new n(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(5);
        hVar.a(this.f25644c);
        hVar.a(this.f25645d);
        hVar.a(this.f25646q);
        gg.m mVar = this.f25647x;
        if (mVar != null) {
            hVar.a(new a2(true, 0, mVar));
        }
        v vVar = this.f25648y;
        if (vVar != null) {
            hVar.a(new a2(true, 1, vVar));
        }
        return new x1(hVar);
    }

    public b l() {
        return this.f25644c;
    }

    public c m() {
        return this.f25645d;
    }

    public gg.m o() {
        return this.f25647x;
    }
}
