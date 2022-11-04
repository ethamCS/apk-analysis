package hh;

import gg.k1;
import gg.x1;
/* loaded from: classes3.dex */
public class f extends gg.t {

    /* renamed from: c */
    g f11952c;

    /* renamed from: d */
    b f11953d;

    /* renamed from: q */
    gg.c f11954q;

    private f(gg.d0 d0Var) {
        if (d0Var.size() == 3) {
            this.f11952c = g.q(d0Var.G(0));
            this.f11953d = b.n(d0Var.G(1));
            this.f11954q = k1.M(d0Var.G(2));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public static f m(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f11952c);
        hVar.a(this.f11953d);
        hVar.a(this.f11954q);
        return new x1(hVar);
    }

    public g l() {
        return this.f11952c;
    }
}
