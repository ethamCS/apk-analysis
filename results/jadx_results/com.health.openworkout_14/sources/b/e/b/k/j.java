package b.e.b.k;

import b.e.b.k.e;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    static boolean[] f2275a = new boolean[3];

    public static void a(f fVar, b.e.b.d dVar, e eVar) {
        eVar.l = -1;
        eVar.m = -1;
        e.b bVar = fVar.Q[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Q[0] == e.b.MATCH_PARENT) {
            int i = eVar.F.f2249g;
            int R = fVar.R() - eVar.H.f2249g;
            d dVar2 = eVar.F;
            dVar2.i = dVar.q(dVar2);
            d dVar3 = eVar.H;
            dVar3.i = dVar.q(dVar3);
            dVar.f(eVar.F.i, i);
            dVar.f(eVar.H.i, R);
            eVar.l = 2;
            eVar.y0(i, R);
        }
        if (fVar.Q[1] == bVar2 || eVar.Q[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i2 = eVar.G.f2249g;
        int v = fVar.v() - eVar.I.f2249g;
        d dVar4 = eVar.G;
        dVar4.i = dVar.q(dVar4);
        d dVar5 = eVar.I;
        dVar5.i = dVar.q(dVar5);
        dVar.f(eVar.G.i, i2);
        dVar.f(eVar.I.i, v);
        if (eVar.Y > 0 || eVar.Q() == 8) {
            d dVar6 = eVar.J;
            dVar6.i = dVar.q(dVar6);
            dVar.f(eVar.J.i, eVar.Y + i2);
        }
        eVar.m = 2;
        eVar.P0(i2, v);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
