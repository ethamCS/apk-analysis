package gd;

import xc.n1;
/* loaded from: classes.dex */
public final class i0 {
    public static final boolean a(xc.b bVar) {
        hc.t.e(bVar, "memberDescriptor");
        return (bVar instanceof xc.y) && hc.t.a(bVar.D(id.e.f12493w4), Boolean.TRUE);
    }

    public static final boolean b(w wVar) {
        hc.t.e(wVar, "javaTypeEnhancementState");
        return wVar.c().invoke(u.e()) == f0.STRICT;
    }

    public static final xc.u c(n1 n1Var) {
        hc.t.e(n1Var, "<this>");
        xc.u g10 = r.g(n1Var);
        hc.t.d(g10, "toDescriptorVisibility(this)");
        return g10;
    }
}
