package pd;

import oe.e0;
import oe.f0;
import oe.m0;
/* loaded from: classes.dex */
public final class i implements ke.s {

    /* renamed from: a */
    public static final i f19110a = new i();

    private i() {
    }

    @Override // ke.s
    public e0 a(rd.q qVar, String str, m0 m0Var, m0 m0Var2) {
        hc.t.e(qVar, "proto");
        hc.t.e(str, "flexibleId");
        hc.t.e(m0Var, "lowerBound");
        hc.t.e(m0Var2, "upperBound");
        return !hc.t.a(str, "kotlin.jvm.PlatformType") ? qe.k.d(qe.j.ERROR_FLEXIBLE_TYPE, str, m0Var.toString(), m0Var2.toString()) : qVar.V(ud.a.f23541g) ? new ld.f(m0Var, m0Var2) : f0.d(m0Var, m0Var2);
    }
}
