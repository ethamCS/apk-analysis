package pe;

import java.util.ArrayList;
import java.util.List;
import oe.b0;
import oe.f0;
import oe.g0;
import oe.m0;
import oe.q1;
import ub.c0;
/* loaded from: classes3.dex */
public final class d {
    public static final q1 a(List<? extends q1> list) {
        Object s02;
        int s10;
        int s11;
        m0 m0Var;
        hc.t.e(list, "types");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                s02 = c0.s0(list);
                return (q1) s02;
            }
            s10 = ub.v.s(list, 10);
            ArrayList arrayList = new ArrayList(s10);
            boolean z10 = false;
            boolean z11 = false;
            for (q1 q1Var : list) {
                z10 = z10 || g0.a(q1Var);
                if (q1Var instanceof m0) {
                    m0Var = (m0) q1Var;
                } else if (!(q1Var instanceof oe.y)) {
                    throw new tb.p();
                } else {
                    if (oe.w.a(q1Var)) {
                        return q1Var;
                    }
                    m0Var = ((oe.y) q1Var).e1();
                    z11 = true;
                }
                arrayList.add(m0Var);
            }
            if (z10) {
                return qe.k.d(qe.j.INTERSECTION_OF_ERROR_TYPES, list.toString());
            }
            if (!z11) {
                return w.f19176a.c(arrayList);
            }
            s11 = ub.v.s(list, 10);
            ArrayList arrayList2 = new ArrayList(s11);
            for (q1 q1Var2 : list) {
                arrayList2.add(b0.d(q1Var2));
            }
            w wVar = w.f19176a;
            return f0.d(wVar.c(arrayList), wVar.c(arrayList2));
        }
        throw new IllegalStateException("Expected some types".toString());
    }
}
