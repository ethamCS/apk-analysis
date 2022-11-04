package hh;

import gg.k1;
import gg.x1;
/* loaded from: classes3.dex */
public class a0 extends gg.t {

    /* renamed from: c */
    x f11915c;

    /* renamed from: d */
    gg.q f11916d;

    /* renamed from: q */
    gg.c f11917q;

    private a0(gg.d0 d0Var) {
        if (d0Var.size() != 2 && d0Var.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        this.f11915c = x.n(d0Var.G(0));
        this.f11916d = gg.q.E(d0Var.G(1));
        if (d0Var.size() != 3) {
            return;
        }
        this.f11917q = k1.M(d0Var.G(2));
    }

    public static a0 l(gg.j0 j0Var, boolean z10) {
        return m(gg.d0.E(j0Var, z10));
    }

    public static a0 m(Object obj) {
        if (obj instanceof a0) {
            return (a0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new a0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f11915c);
        hVar.a(this.f11916d);
        gg.c cVar = this.f11917q;
        if (cVar != null) {
            hVar.a(cVar);
        }
        return new x1(hVar);
    }

    public x n() {
        return this.f11915c;
    }

    public gg.q o() {
        return this.f11916d;
    }
}
