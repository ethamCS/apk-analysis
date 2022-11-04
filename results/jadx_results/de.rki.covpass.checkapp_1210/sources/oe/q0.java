package oe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes3.dex */
public final class q0 {
    public static final a a(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        q1 Z0 = e0Var.Z0();
        if (Z0 instanceof a) {
            return (a) Z0;
        }
        return null;
    }

    public static final m0 b(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        a a10 = a(e0Var);
        if (a10 != null) {
            return a10.i1();
        }
        return null;
    }

    public static final boolean c(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        return e0Var.Z0() instanceof p;
    }

    private static final d0 d(d0 d0Var) {
        int s10;
        e0 e0Var;
        Collection<e0> l10 = d0Var.l();
        s10 = ub.v.s(l10, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = l10.iterator();
        boolean z10 = false;
        while (true) {
            e0Var = null;
            if (!it.hasNext()) {
                break;
            }
            e0 e0Var2 = (e0) it.next();
            if (n1.l(e0Var2)) {
                e0Var2 = f(e0Var2.Z0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(e0Var2);
        }
        if (!z10) {
            return null;
        }
        e0 f10 = d0Var.f();
        if (f10 != null) {
            if (n1.l(f10)) {
                f10 = f(f10.Z0(), false, 1, null);
            }
            e0Var = f10;
        }
        return new d0(arrayList).j(e0Var);
    }

    public static final q1 e(q1 q1Var, boolean z10) {
        hc.t.e(q1Var, "<this>");
        p b10 = p.Companion.b(q1Var, z10);
        if (b10 != null) {
            return b10;
        }
        m0 g10 = g(q1Var);
        return g10 != null ? g10 : q1Var.a1(false);
    }

    public static /* synthetic */ q1 f(q1 q1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(q1Var, z10);
    }

    private static final m0 g(e0 e0Var) {
        d0 d10;
        e1 W0 = e0Var.W0();
        d0 d0Var = W0 instanceof d0 ? (d0) W0 : null;
        if (d0Var == null || (d10 = d(d0Var)) == null) {
            return null;
        }
        return d10.e();
    }

    public static final m0 h(m0 m0Var, boolean z10) {
        hc.t.e(m0Var, "<this>");
        p b10 = p.Companion.b(m0Var, z10);
        if (b10 != null) {
            return b10;
        }
        m0 g10 = g(m0Var);
        return g10 == null ? m0Var.d1(false) : g10;
    }

    public static /* synthetic */ m0 i(m0 m0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(m0Var, z10);
    }

    public static final m0 j(m0 m0Var, m0 m0Var2) {
        hc.t.e(m0Var, "<this>");
        hc.t.e(m0Var2, "abbreviatedType");
        return g0.a(m0Var) ? m0Var : new a(m0Var, m0Var2);
    }

    public static final pe.i k(pe.i iVar) {
        hc.t.e(iVar, "<this>");
        return new pe.i(iVar.f1(), iVar.W0(), iVar.h1(), iVar.V0(), iVar.X0(), true);
    }
}
