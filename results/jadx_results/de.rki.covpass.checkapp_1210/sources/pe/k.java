package pe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oe.e0;
import oe.f0;
import oe.g1;
import oe.l1;
import oe.m0;
import oe.q1;
import oe.r1;
import pe.f;
import ub.c0;
import xc.f1;
/* loaded from: classes3.dex */
public final class k {
    private static final List<g1> a(q1 q1Var, se.b bVar) {
        List<tb.r> M0;
        int s10;
        boolean z10;
        if (q1Var.U0().size() != q1Var.W0().getParameters().size()) {
            return null;
        }
        List<g1> U0 = q1Var.U0();
        boolean z11 = true;
        if (!(U0 instanceof Collection) || !U0.isEmpty()) {
            Iterator<T> it = U0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((g1) it.next()).b() == r1.INVARIANT) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            return null;
        }
        List<f1> parameters = q1Var.W0().getParameters();
        hc.t.d(parameters, "type.constructor.parameters");
        M0 = c0.M0(U0, parameters);
        s10 = ub.v.s(M0, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (tb.r rVar : M0) {
            g1 g1Var = (g1) rVar.b();
            f1 f1Var = (f1) rVar.c();
            if (g1Var.b() != r1.INVARIANT) {
                q1 Z0 = (g1Var.c() || g1Var.b() != r1.IN_VARIANCE) ? null : g1Var.getType().Z0();
                hc.t.d(f1Var, "parameter");
                g1Var = te.a.a(new i(bVar, Z0, g1Var, f1Var));
            }
            arrayList.add(g1Var);
        }
        l1 c10 = oe.f1.Companion.b(q1Var.W0(), arrayList).c();
        int size = U0.size();
        for (int i10 = 0; i10 < size; i10++) {
            g1 g1Var2 = U0.get(i10);
            g1 g1Var3 = (g1) arrayList.get(i10);
            if (g1Var2.b() != r1.INVARIANT) {
                List<e0> upperBounds = q1Var.W0().getParameters().get(i10).getUpperBounds();
                hc.t.d(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                for (e0 e0Var : upperBounds) {
                    arrayList2.add(f.a.f19147a.a(c10.n(e0Var, r1.INVARIANT).Z0()));
                }
                q1 a10 = (g1Var2.c() || g1Var2.b() != r1.OUT_VARIANCE) ? null : f.a.f19147a.a(g1Var2.getType().Z0());
                e0 type = g1Var3.getType();
                hc.t.c(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((i) type).W0().g(a10, arrayList2);
            }
        }
        return arrayList;
    }

    public static final m0 b(m0 m0Var, se.b bVar) {
        hc.t.e(m0Var, "type");
        hc.t.e(bVar, "status");
        List<g1> a10 = a(m0Var, bVar);
        if (a10 != null) {
            return c(m0Var, a10);
        }
        return null;
    }

    private static final m0 c(q1 q1Var, List<? extends g1> list) {
        return f0.i(q1Var.V0(), q1Var.W0(), list, q1Var.X0(), null, 16, null);
    }
}
