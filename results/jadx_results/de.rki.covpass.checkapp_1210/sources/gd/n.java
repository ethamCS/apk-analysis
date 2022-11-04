package gd;

import ae.e;
import xc.u0;
/* loaded from: classes.dex */
public final class n implements ae.e {
    @Override // ae.e
    public e.b a(xc.a aVar, xc.a aVar2, xc.e eVar) {
        hc.t.e(aVar, "superDescriptor");
        hc.t.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof u0) || !(aVar instanceof u0)) {
            return e.b.UNKNOWN;
        }
        u0 u0Var = (u0) aVar2;
        u0 u0Var2 = (u0) aVar;
        return !hc.t.a(u0Var.getName(), u0Var2.getName()) ? e.b.UNKNOWN : (!kd.c.a(u0Var) || !kd.c.a(u0Var2)) ? (kd.c.a(u0Var) || kd.c.a(u0Var2)) ? e.b.INCOMPATIBLE : e.b.UNKNOWN : e.b.OVERRIDABLE;
    }

    @Override // ae.e
    public e.a b() {
        return e.a.BOTH;
    }
}
