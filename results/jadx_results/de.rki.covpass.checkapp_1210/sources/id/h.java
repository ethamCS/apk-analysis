package id;

import ad.l0;
import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kd.k;
import oe.e0;
import tb.r;
import ub.c0;
import ub.v;
import xc.a1;
import xc.j1;
/* loaded from: classes.dex */
public final class h {
    public static final List<j1> a(Collection<? extends e0> collection, Collection<? extends j1> collection2, xc.a aVar) {
        List<r> M0;
        int s10;
        t.e(collection, "newValueParameterTypes");
        t.e(collection2, "oldValueParameters");
        t.e(aVar, "newOwner");
        collection.size();
        collection2.size();
        M0 = c0.M0(collection, collection2);
        s10 = v.s(M0, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (r rVar : M0) {
            e0 e0Var = (e0) rVar.b();
            j1 j1Var = (j1) rVar.c();
            int l10 = j1Var.l();
            yc.g j10 = j1Var.j();
            wd.f name = j1Var.getName();
            t.d(name, "oldParameter.name");
            boolean k02 = j1Var.k0();
            boolean C = j1Var.C();
            boolean K0 = j1Var.K0();
            e0 k10 = j1Var.R() != null ? ee.a.l(aVar).x().k(e0Var) : null;
            a1 m10 = j1Var.m();
            t.d(m10, "oldParameter.source");
            arrayList.add(new l0(aVar, null, l10, j10, name, e0Var, k02, C, K0, k10, m10));
        }
        return arrayList;
    }

    public static final k b(xc.e eVar) {
        t.e(eVar, "<this>");
        xc.e p10 = ee.a.p(eVar);
        k kVar = null;
        if (p10 == null) {
            return null;
        }
        he.h B0 = p10.B0();
        if (B0 instanceof k) {
            kVar = (k) B0;
        }
        return kVar == null ? b(p10) : kVar;
    }
}
