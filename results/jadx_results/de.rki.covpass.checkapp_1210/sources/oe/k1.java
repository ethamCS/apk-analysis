package oe;

import java.util.List;
/* loaded from: classes3.dex */
public final class k1 {
    public static final m0 a(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        q1 Z0 = e0Var.Z0();
        m0 m0Var = Z0 instanceof m0 ? (m0) Z0 : null;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + e0Var).toString());
    }

    public static final e0 b(e0 e0Var, List<? extends g1> list, yc.g gVar) {
        hc.t.e(e0Var, "<this>");
        hc.t.e(list, "newArguments");
        hc.t.e(gVar, "newAnnotations");
        return e(e0Var, list, gVar, null, 4, null);
    }

    public static final e0 c(e0 e0Var, List<? extends g1> list, yc.g gVar, List<? extends g1> list2) {
        hc.t.e(e0Var, "<this>");
        hc.t.e(list, "newArguments");
        hc.t.e(gVar, "newAnnotations");
        hc.t.e(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == e0Var.U0()) && gVar == e0Var.j()) {
            return e0Var;
        }
        a1 V0 = e0Var.V0();
        if ((gVar instanceof yc.l) && gVar.isEmpty()) {
            gVar = yc.g.Companion.b();
        }
        a1 a10 = b1.a(V0, gVar);
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof y) {
            y yVar = (y) Z0;
            return f0.d(d(yVar.e1(), list, a10), d(yVar.f1(), list2, a10));
        } else if (!(Z0 instanceof m0)) {
            throw new tb.p();
        } else {
            return d((m0) Z0, list, a10);
        }
    }

    public static final m0 d(m0 m0Var, List<? extends g1> list, a1 a1Var) {
        hc.t.e(m0Var, "<this>");
        hc.t.e(list, "newArguments");
        hc.t.e(a1Var, "newAttributes");
        return (!list.isEmpty() || a1Var != m0Var.V0()) ? list.isEmpty() ? m0Var.e1(a1Var) : f0.i(a1Var, m0Var.W0(), list, m0Var.X0(), null, 16, null) : m0Var;
    }

    public static /* synthetic */ e0 e(e0 e0Var, List list, yc.g gVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = e0Var.U0();
        }
        if ((i10 & 2) != 0) {
            gVar = e0Var.j();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(e0Var, list, gVar, list2);
    }

    public static /* synthetic */ m0 f(m0 m0Var, List list, a1 a1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = m0Var.U0();
        }
        if ((i10 & 2) != 0) {
            a1Var = m0Var.V0();
        }
        return d(m0Var, list, a1Var);
    }
}
