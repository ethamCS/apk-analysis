package zg;

import gg.a0;
import gg.d0;
import gg.e0;
import gg.j0;
import gg.l2;
import gg.p2;
/* loaded from: classes3.dex */
public class y extends gg.t {

    /* renamed from: c */
    private gg.v f26892c;

    /* renamed from: d */
    private gg.g f26893d;

    /* renamed from: q */
    private e0 f26894q;

    private y(d0 d0Var) {
        this.f26892c = (gg.v) d0Var.G(0);
        this.f26893d = ((j0) d0Var.G(1)).O();
        if (d0Var.size() == 3) {
            this.f26894q = (e0) d0Var.G(2);
        }
    }

    public y(gg.v vVar, gg.g gVar, e0 e0Var) {
        this.f26892c = vVar;
        this.f26893d = gVar;
        this.f26894q = e0Var;
    }

    public static y o(Object obj) {
        if (obj instanceof y) {
            return (y) obj;
        }
        if (obj == null) {
            return null;
        }
        return new y(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f26892c);
        hVar.a(new p2(true, 0, this.f26893d));
        e0 e0Var = this.f26894q;
        if (e0Var != null) {
            hVar.a(e0Var);
        }
        return new l2(hVar);
    }

    public e0 l() {
        return this.f26894q;
    }

    public gg.v m() {
        return this.f26892c;
    }

    public gg.g n() {
        return this.f26893d;
    }
}
