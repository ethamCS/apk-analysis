package oe;

import java.util.List;
import oe.a1;
/* loaded from: classes3.dex */
public final class o implements z0 {

    /* renamed from: a */
    public static final o f18029a = new o();

    private o() {
    }

    @Override // oe.z0
    public a1 a(yc.g gVar, e1 e1Var, xc.m mVar) {
        List<? extends y0<?>> d10;
        hc.t.e(gVar, "annotations");
        if (gVar.isEmpty()) {
            return a1.Companion.h();
        }
        a1.a aVar = a1.Companion;
        d10 = ub.t.d(new j(gVar));
        return aVar.g(d10);
    }
}
