package hh;

import gg.a2;
import gg.x1;
/* loaded from: classes3.dex */
public class v0 extends gg.t {

    /* renamed from: c */
    x f12077c;

    /* renamed from: d */
    a0 f12078d;

    /* renamed from: q */
    g0 f12079q;

    private v0(gg.d0 d0Var) {
        int i10;
        if (d0Var.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        if (!(d0Var.G(0) instanceof gg.j0)) {
            this.f12077c = x.n(d0Var.G(0));
            i10 = 1;
        } else {
            i10 = 0;
        }
        while (i10 != d0Var.size()) {
            gg.j0 N = gg.j0.N(d0Var.G(i10));
            if (N.Q() == 0) {
                this.f12078d = a0.l(N, false);
            } else if (N.Q() != 1) {
                throw new IllegalArgumentException("Bad tag number: " + N.Q());
            } else {
                this.f12079q = g0.n(N, false);
            }
            i10++;
        }
    }

    public static v0 m(gg.j0 j0Var, boolean z10) {
        return n(gg.d0.E(j0Var, z10));
    }

    public static v0 n(Object obj) {
        if (obj instanceof v0) {
            return (v0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new v0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        x xVar = this.f12077c;
        if (xVar != null) {
            hVar.a(xVar);
        }
        a0 a0Var = this.f12078d;
        if (a0Var != null) {
            hVar.a(new a2(false, 0, a0Var));
        }
        g0 g0Var = this.f12079q;
        if (g0Var != null) {
            hVar.a(new a2(false, 1, g0Var));
        }
        return new x1(hVar);
    }

    public a0 l() {
        return this.f12078d;
    }

    public x o() {
        return this.f12077c;
    }
}
