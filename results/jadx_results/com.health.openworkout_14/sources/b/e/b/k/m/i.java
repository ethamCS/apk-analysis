package b.e.b.k.m;

import b.e.b.k.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class i {
    public static o a(b.e.b.k.e eVar, int i, ArrayList<o> arrayList, o oVar) {
        b.e.b.k.d dVar;
        int b1;
        int i2 = i == 0 ? eVar.m0 : eVar.n0;
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f2319b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i4);
                if (oVar2.c() == i2) {
                    if (oVar != null) {
                        oVar.g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof b.e.b.k.i) && (b1 = ((b.e.b.k.i) eVar).b1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i5);
                    if (oVar3.c() == b1) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof b.e.b.k.g) {
                b.e.b.k.g gVar = (b.e.b.k.g) eVar;
                b.e.b.k.d a1 = gVar.a1();
                if (gVar.b1() == 0) {
                    i3 = 1;
                }
                a1.b(i3, arrayList, oVar);
            }
            int c2 = oVar.c();
            if (i == 0) {
                eVar.m0 = c2;
                eVar.F.b(i, arrayList, oVar);
                dVar = eVar.H;
            } else {
                eVar.n0 = c2;
                eVar.G.b(i, arrayList, oVar);
                eVar.J.b(i, arrayList, oVar);
                dVar = eVar.I;
            }
            dVar.b(i, arrayList, oVar);
            eVar.M.b(i, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = arrayList.get(i2);
            if (i == oVar.f2319b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0387 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(b.e.b.k.f r16, b.e.b.k.m.b.AbstractC0041b r17) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.i.c(b.e.b.k.f, b.e.b.k.m.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
