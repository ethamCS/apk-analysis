package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class e extends gg.t {

    /* renamed from: c */
    private gg.v f11950c;

    /* renamed from: d */
    private gg.e0 f11951d;

    private e(gg.d0 d0Var) {
        if (d0Var.size() == 2) {
            this.f11950c = gg.v.K(d0Var.G(0));
            this.f11951d = gg.e0.E(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public static e m(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj == null) {
            return null;
        }
        return new e(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11950c);
        hVar.a(this.f11951d);
        return new x1(hVar);
    }

    public gg.v l() {
        return new gg.v(this.f11950c.H());
    }
}
