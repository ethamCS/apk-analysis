package m0;

import m0.e;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    static boolean[] f16245a = new boolean[3];

    public static void a(f fVar, j0.d dVar, e eVar) {
        eVar.f16207t = -1;
        eVar.f16209u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f16160g;
            int U = fVar.U() - eVar.Q.f16160g;
            d dVar2 = eVar.O;
            dVar2.f16162i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f16162i = dVar.q(dVar3);
            dVar.f(eVar.O.f16162i, i10);
            dVar.f(eVar.Q.f16162i, U);
            eVar.f16207t = 2;
            eVar.L0(i10, U);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.P.f16160g;
        int v10 = fVar.v() - eVar.R.f16160g;
        d dVar4 = eVar.P;
        dVar4.f16162i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f16162i = dVar.q(dVar5);
        dVar.f(eVar.P.f16162i, i11);
        dVar.f(eVar.R.f16162i, v10);
        if (eVar.f16192l0 > 0 || eVar.T() == 8) {
            d dVar6 = eVar.S;
            dVar6.f16162i = dVar.q(dVar6);
            dVar.f(eVar.S.f16162i, eVar.f16192l0 + i11);
        }
        eVar.f16209u = 2;
        eVar.c1(i11, v10);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
