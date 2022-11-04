package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class k0 extends gg.t {

    /* renamed from: c */
    private gg.v f11989c;

    /* renamed from: d */
    private gg.g f11990d;

    public k0(gg.d0 d0Var) {
        if (d0Var.size() == 2) {
            this.f11989c = gg.v.K(d0Var.G(0));
            this.f11990d = d0Var.G(1);
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public static k0 l(Object obj) {
        if (obj instanceof k0) {
            return (k0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new k0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11989c);
        hVar.a(this.f11990d);
        return new x1(hVar);
    }
}
