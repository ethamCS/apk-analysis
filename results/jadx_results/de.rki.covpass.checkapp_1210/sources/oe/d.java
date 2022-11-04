package oe;
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final d f17923a = new d();

    private d() {
    }

    private final boolean a(se.p pVar, se.k kVar, se.k kVar2) {
        if (pVar.t0(kVar) == pVar.t0(kVar2) && pVar.l(kVar) == pVar.l(kVar2)) {
            if ((pVar.C(kVar) == null) == (pVar.C(kVar2) == null) && pVar.F(pVar.c(kVar), pVar.c(kVar2))) {
                if (pVar.C0(kVar, kVar2)) {
                    return true;
                }
                int t02 = pVar.t0(kVar);
                for (int i10 = 0; i10 < t02; i10++) {
                    se.m X = pVar.X(kVar, i10);
                    se.m X2 = pVar.X(kVar2, i10);
                    if (pVar.i(X) != pVar.i(X2)) {
                        return false;
                    }
                    if (!pVar.i(X) && (pVar.I(X) != pVar.I(X2) || !c(pVar, pVar.q(X), pVar.q(X2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(se.p pVar, se.i iVar, se.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        se.k d10 = pVar.d(iVar);
        se.k d11 = pVar.d(iVar2);
        if (d10 != null && d11 != null) {
            return a(pVar, d10, d11);
        }
        se.g q02 = pVar.q0(iVar);
        se.g q03 = pVar.q0(iVar2);
        if (q02 == null || q03 == null) {
            return false;
        }
        return a(pVar, pVar.e(q02), pVar.e(q03)) && a(pVar, pVar.b(q02), pVar.b(q03));
    }

    public final boolean b(se.p pVar, se.i iVar, se.i iVar2) {
        hc.t.e(pVar, "context");
        hc.t.e(iVar, "a");
        hc.t.e(iVar2, "b");
        return c(pVar, iVar, iVar2);
    }
}
