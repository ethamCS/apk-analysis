package xg;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    hh.b f25612c;

    /* renamed from: d */
    w f25613d;

    /* renamed from: q */
    w f25614q;

    /* renamed from: x */
    q f25615x;

    private b(d0 d0Var) {
        this.f25612c = hh.b.n(d0Var.G(0));
        this.f25613d = (w) d0Var.G(1);
        this.f25614q = (w) d0Var.G(2);
        this.f25615x = (q) d0Var.G(3);
    }

    public b(hh.b bVar, w wVar, w wVar2, q qVar) {
        this.f25612c = bVar;
        this.f25613d = wVar;
        this.f25614q = wVar2;
        this.f25615x = qVar;
    }

    public static b m(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(4);
        hVar.a(this.f25612c);
        hVar.a(this.f25613d);
        hVar.a(this.f25614q);
        hVar.a(this.f25615x);
        return new x1(hVar);
    }

    public hh.b l() {
        return this.f25612c;
    }

    public q n() {
        return this.f25615x;
    }
}
