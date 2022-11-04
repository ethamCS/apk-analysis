package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class d extends t {

    /* renamed from: c */
    private final int f10250c;

    /* renamed from: d */
    private final int f10251d;

    /* renamed from: q */
    private final zj.a f10252q;

    public d(int i10, int i11, zj.a aVar) {
        this.f10250c = i10;
        this.f10251d = i11;
        this.f10252q = new zj.a(aVar);
    }

    private d(d0 d0Var) {
        this.f10250c = ((q) d0Var.G(0)).M();
        this.f10251d = ((q) d0Var.G(1)).M();
        this.f10252q = new zj.a(((w) d0Var.G(2)).F());
    }

    public static d m(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj == null) {
            return null;
        }
        return new d(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(new q(this.f10250c));
        hVar.a(new q(this.f10251d));
        hVar.a(new t1(this.f10252q.c()));
        return new x1(hVar);
    }

    public zj.a l() {
        return new zj.a(this.f10252q);
    }

    public int n() {
        return this.f10250c;
    }

    public int o() {
        return this.f10251d;
    }
}
