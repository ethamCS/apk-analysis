package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class d extends gg.t {

    /* renamed from: c */
    gg.m f11947c;

    /* renamed from: d */
    gg.m f11948d;

    private d(gg.d0 d0Var) {
        if (d0Var.size() == 2) {
            this.f11947c = gg.m.J(d0Var.G(0));
            this.f11948d = gg.m.J(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public static d l(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj == null) {
            return null;
        }
        return new d(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11947c);
        hVar.a(this.f11948d);
        return new x1(hVar);
    }

    public gg.m m() {
        return this.f11948d;
    }

    public gg.m n() {
        return this.f11947c;
    }
}
