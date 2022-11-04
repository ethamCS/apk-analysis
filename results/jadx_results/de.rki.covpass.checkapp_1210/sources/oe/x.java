package oe;

import java.util.HashSet;
/* loaded from: classes3.dex */
public final class x {
    public static final se.i a(m1 m1Var, se.i iVar) {
        hc.t.e(m1Var, "<this>");
        hc.t.e(iVar, "inlineClassType");
        return b(m1Var, iVar, new HashSet());
    }

    private static final se.i b(m1 m1Var, se.i iVar, HashSet<se.n> hashSet) {
        se.i iVar2;
        se.i iVar3;
        se.n D0 = m1Var.D0(iVar);
        if (!hashSet.add(D0)) {
            return null;
        }
        se.o v10 = m1Var.v(D0);
        if (v10 != null) {
            se.i n10 = m1Var.n(v10);
            iVar2 = b(m1Var, n10, hashSet);
            if (iVar2 == null) {
                return null;
            }
            boolean z10 = m1Var.T(m1Var.D0(n10)) || ((n10 instanceof se.k) && m1Var.P((se.k) n10));
            if ((iVar2 instanceof se.k) && m1Var.P((se.k) iVar2) && m1Var.V(iVar) && z10) {
                iVar3 = m1Var.D(n10);
            } else if (!m1Var.V(iVar2) && m1Var.c0(iVar)) {
                iVar3 = m1Var.D(iVar2);
            }
            return iVar3;
        } else if (!m1Var.T(D0)) {
            return iVar;
        } else {
            se.i y02 = m1Var.y0(iVar);
            if (y02 == null || (iVar2 = b(m1Var, y02, hashSet)) == null) {
                return null;
            }
            if (m1Var.V(iVar)) {
                return m1Var.V(iVar2) ? iVar : (!(iVar2 instanceof se.k) || !m1Var.P((se.k) iVar2)) ? m1Var.D(iVar2) : iVar;
            }
        }
        return iVar2;
    }
}
