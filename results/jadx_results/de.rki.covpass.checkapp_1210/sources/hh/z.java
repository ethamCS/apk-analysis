package hh;

import gg.a2;
import gg.x1;
/* loaded from: classes3.dex */
public class z extends gg.t {

    /* renamed from: c */
    a0 f12171c;

    /* renamed from: d */
    x f12172d;

    /* renamed from: q */
    g0 f12173q;

    /* renamed from: x */
    private int f12174x;

    private z(gg.d0 d0Var) {
        this.f12174x = 1;
        if (d0Var.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        for (int i10 = 0; i10 != d0Var.size(); i10++) {
            gg.j0 N = gg.j0.N(d0Var.G(i10));
            int Q = N.Q();
            if (Q == 0) {
                this.f12171c = a0.l(N, false);
            } else if (Q == 1) {
                this.f12172d = x.m(N, false);
            } else if (Q != 2) {
                throw new IllegalArgumentException("unknown tag in Holder");
            } else {
                this.f12173q = g0.n(N, false);
            }
        }
        this.f12174x = 1;
    }

    private z(gg.j0 j0Var) {
        this.f12174x = 1;
        int Q = j0Var.Q();
        if (Q == 0) {
            this.f12171c = a0.l(j0Var, true);
        } else if (Q != 1) {
            throw new IllegalArgumentException("unknown tag in Holder");
        } else {
            this.f12172d = x.m(j0Var, true);
        }
        this.f12174x = 0;
    }

    public static z n(Object obj) {
        if (obj instanceof z) {
            return (z) obj;
        }
        if (obj instanceof gg.j0) {
            return new z(gg.j0.N(obj));
        }
        if (obj == null) {
            return null;
        }
        return new z(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        if (this.f12174x != 1) {
            x xVar = this.f12172d;
            return xVar != null ? new a2(true, 1, xVar) : new a2(true, 0, this.f12171c);
        }
        gg.h hVar = new gg.h(3);
        a0 a0Var = this.f12171c;
        if (a0Var != null) {
            hVar.a(new a2(false, 0, a0Var));
        }
        x xVar2 = this.f12172d;
        if (xVar2 != null) {
            hVar.a(new a2(false, 1, xVar2));
        }
        g0 g0Var = this.f12173q;
        if (g0Var != null) {
            hVar.a(new a2(false, 2, g0Var));
        }
        return new x1(hVar);
    }

    public a0 l() {
        return this.f12171c;
    }

    public x m() {
        return this.f12172d;
    }

    public g0 o() {
        return this.f12173q;
    }
}
