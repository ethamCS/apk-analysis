package o4;

import java.util.ArrayList;
import java.util.Collections;
import l4.r;
import p4.c;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a */
    private static final c.a f17526a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final c.a f17527b = c.a.a("p", "k");

    /* renamed from: c */
    private static final c.a f17528c = c.a.a("n", "v");

    public static l4.f a(p4.c cVar, e4.h hVar) {
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str = null;
        l4.g gVar = null;
        k4.c cVar2 = null;
        k4.f fVar = null;
        k4.f fVar2 = null;
        k4.b bVar = null;
        r.b bVar2 = null;
        r.c cVar3 = null;
        k4.b bVar3 = null;
        boolean z10 = false;
        k4.d dVar = null;
        while (cVar.j()) {
            switch (cVar.M(f17526a)) {
                case 0:
                    str = cVar.u();
                    break;
                case 1:
                    int i10 = -1;
                    cVar.f();
                    while (cVar.j()) {
                        int M = cVar.M(f17527b);
                        k4.c cVar4 = cVar2;
                        if (M == 0) {
                            i10 = cVar.r();
                        } else if (M != 1) {
                            cVar.V();
                            cVar.W();
                        } else {
                            cVar2 = d.g(cVar, hVar, i10);
                        }
                        cVar2 = cVar4;
                    }
                    cVar.i();
                    break;
                case 2:
                    dVar = d.h(cVar, hVar);
                    break;
                case 3:
                    gVar = cVar.r() == 1 ? l4.g.LINEAR : l4.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, hVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, hVar);
                    break;
                case 6:
                    bVar = d.e(cVar, hVar);
                    break;
                case 7:
                    bVar2 = r.b.values()[cVar.r() - 1];
                    break;
                case 8:
                    cVar3 = r.c.values()[cVar.r() - 1];
                    break;
                case 9:
                    f10 = (float) cVar.p();
                    break;
                case 10:
                    z10 = cVar.n();
                    break;
                case 11:
                    cVar.e();
                    while (cVar.j()) {
                        cVar.f();
                        String str2 = null;
                        k4.b bVar4 = null;
                        while (cVar.j()) {
                            int M2 = cVar.M(f17528c);
                            k4.b bVar5 = bVar3;
                            if (M2 != 0) {
                                if (M2 != 1) {
                                    cVar.V();
                                    cVar.W();
                                } else {
                                    bVar4 = d.e(cVar, hVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = cVar.u();
                            }
                        }
                        k4.b bVar6 = bVar3;
                        cVar.i();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                hVar.u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    k4.b bVar7 = bVar3;
                    cVar.h();
                    if (arrayList.size() == 1) {
                        arrayList.add((k4.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    break;
                default:
                    cVar.V();
                    cVar.W();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new k4.d(Collections.singletonList(new r4.a(100)));
        }
        return new l4.f(str, gVar, cVar2, dVar, fVar, fVar2, bVar, bVar2, cVar3, f10, arrayList, bVar3, z10);
    }
}
