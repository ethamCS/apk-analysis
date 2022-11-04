package hh;

import gg.a2;
import gg.x1;
/* loaded from: classes3.dex */
public class h0 extends gg.t {

    /* renamed from: c */
    private final gg.v f11967c;

    /* renamed from: d */
    private final gg.g f11968d;

    private h0(gg.d0 d0Var) {
        this.f11967c = gg.v.K(d0Var.G(0));
        this.f11968d = gg.j0.N(d0Var.G(1)).O();
    }

    public static h0 l(Object obj) {
        if (obj instanceof h0) {
            return (h0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new h0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11967c);
        hVar.a(new a2(true, 0, this.f11968d));
        return new x1(hVar);
    }

    public gg.v m() {
        return this.f11967c;
    }

    public gg.g n() {
        return this.f11968d;
    }
}
