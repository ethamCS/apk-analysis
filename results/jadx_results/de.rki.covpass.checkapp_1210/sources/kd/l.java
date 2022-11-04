package kd;

import hc.t;
import java.util.Collection;
import java.util.List;
import kd.j;
import nd.r;
import oe.e0;
import ub.u;
import xc.f1;
import xc.j1;
import xc.u0;
import xc.x0;
/* loaded from: classes.dex */
public abstract class l extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jd.g gVar) {
        super(gVar, null, 2, null);
        t.e(gVar, "c");
    }

    @Override // kd.j
    protected j.a H(r rVar, List<? extends f1> list, e0 e0Var, List<? extends j1> list2) {
        List h10;
        t.e(rVar, "method");
        t.e(list, "methodTypeParameters");
        t.e(e0Var, "returnType");
        t.e(list2, "valueParameters");
        h10 = u.h();
        return new j.a(e0Var, null, list2, list, false, h10);
    }

    @Override // kd.j
    protected void s(wd.f fVar, Collection<u0> collection) {
        t.e(fVar, "name");
        t.e(collection, "result");
    }

    @Override // kd.j
    protected x0 z() {
        return null;
    }
}
