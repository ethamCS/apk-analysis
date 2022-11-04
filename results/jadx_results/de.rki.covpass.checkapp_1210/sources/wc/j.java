package wc;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oe.f1;
import oe.m0;
import ub.c0;
import ub.q0;
import ub.v;
/* loaded from: classes.dex */
public final class j {
    public static final f1 a(xc.e eVar, xc.e eVar2) {
        int s10;
        int s11;
        List M0;
        Map q10;
        t.e(eVar, "from");
        t.e(eVar2, "to");
        eVar.A().size();
        eVar2.A().size();
        f1.a aVar = f1.Companion;
        List<xc.f1> A = eVar.A();
        t.d(A, "from.declaredTypeParameters");
        s10 = v.s(A, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (xc.f1 f1Var : A) {
            arrayList.add(f1Var.r());
        }
        List<xc.f1> A2 = eVar2.A();
        t.d(A2, "to.declaredTypeParameters");
        s11 = v.s(A2, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (xc.f1 f1Var2 : A2) {
            m0 u10 = f1Var2.u();
            t.d(u10, "it.defaultType");
            arrayList2.add(te.a.a(u10));
        }
        M0 = c0.M0(arrayList, arrayList2);
        q10 = q0.q(M0);
        return f1.a.e(aVar, q10, false, 2, null);
    }
}
