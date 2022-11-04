package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class b extends gg.t {

    /* renamed from: c */
    private gg.v f11918c;

    /* renamed from: d */
    private gg.g f11919d;

    private b(gg.d0 d0Var) {
        if (d0Var.size() >= 1 && d0Var.size() <= 2) {
            this.f11918c = gg.v.K(d0Var.G(0));
            this.f11919d = d0Var.size() == 2 ? d0Var.G(1) : null;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public b(gg.v vVar) {
        this.f11918c = vVar;
    }

    public b(gg.v vVar, gg.g gVar) {
        this.f11918c = vVar;
        this.f11919d = gVar;
    }

    public static b m(gg.j0 j0Var, boolean z10) {
        return n(gg.d0.E(j0Var, z10));
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11918c);
        gg.g gVar = this.f11919d;
        if (gVar != null) {
            hVar.a(gVar);
        }
        return new x1(hVar);
    }

    public gg.v l() {
        return this.f11918c;
    }

    public gg.g o() {
        return this.f11919d;
    }
}
