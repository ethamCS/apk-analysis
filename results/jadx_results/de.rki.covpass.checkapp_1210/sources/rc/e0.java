package rc;

import hc.l0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class e0 extends l0 {
    private static j j(hc.h hVar) {
        oc.f e02 = hVar.e0();
        return e02 instanceof j ? (j) e02 : b.f20586q;
    }

    @Override // hc.l0
    public oc.g a(hc.p pVar) {
        return new k(j(pVar), pVar.getName(), pVar.g0(), pVar.d0());
    }

    @Override // hc.l0
    public oc.d b(Class cls) {
        return g.a(cls);
    }

    @Override // hc.l0
    public oc.f c(Class cls, String str) {
        return new p(cls, str);
    }

    @Override // hc.l0
    public oc.i d(hc.x xVar) {
        return new m(j(xVar), xVar.getName(), xVar.g0(), xVar.d0());
    }

    @Override // hc.l0
    public oc.l e(hc.b0 b0Var) {
        return new r(j(b0Var), b0Var.getName(), b0Var.g0(), b0Var.d0());
    }

    @Override // hc.l0
    public oc.m f(hc.d0 d0Var) {
        return new s(j(d0Var), d0Var.getName(), d0Var.g0(), d0Var.d0());
    }

    @Override // hc.l0
    public String g(hc.o oVar) {
        k c10;
        oc.g a10 = qc.d.a(oVar);
        return (a10 == null || (c10 = j0.c(a10)) == null) ? super.g(oVar) : f0.f20627a.e(c10.E());
    }

    @Override // hc.l0
    public String h(hc.v vVar) {
        return g(vVar);
    }

    @Override // hc.l0
    public oc.n i(oc.e eVar, List<oc.p> list, boolean z10) {
        return pc.e.b(eVar, list, z10, Collections.emptyList());
    }
}
