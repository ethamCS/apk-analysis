package zg;

import gg.a0;
import gg.d0;
import gg.k1;
import gg.x1;
/* loaded from: classes3.dex */
public class d extends gg.t {

    /* renamed from: c */
    protected e f26755c;

    /* renamed from: d */
    protected hh.b f26756d;

    /* renamed from: q */
    protected k1 f26757q;

    protected d() {
        this.f26755c = null;
        this.f26756d = null;
        this.f26757q = null;
    }

    public d(d0 d0Var) {
        this.f26755c = null;
        this.f26756d = null;
        this.f26757q = null;
        this.f26755c = e.l(d0Var.G(0));
        this.f26756d = hh.b.n(d0Var.G(1));
        this.f26757q = (k1) d0Var.G(2);
    }

    public static d l(Object obj) {
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
        gg.h hVar = new gg.h(3);
        hVar.a(this.f26755c);
        hVar.a(this.f26756d);
        hVar.a(this.f26757q);
        return new x1(hVar);
    }
}
