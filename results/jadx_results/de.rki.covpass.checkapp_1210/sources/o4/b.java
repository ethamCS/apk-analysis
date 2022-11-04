package o4;

import p4.c;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private static final c.a f17482a = c.a.a("a");

    /* renamed from: b */
    private static final c.a f17483b = c.a.a("fc", "sc", "sw", "t");

    public static k4.k a(p4.c cVar, e4.h hVar) {
        cVar.f();
        k4.k kVar = null;
        while (cVar.j()) {
            if (cVar.M(f17482a) != 0) {
                cVar.V();
                cVar.W();
            } else {
                kVar = b(cVar, hVar);
            }
        }
        cVar.i();
        return kVar == null ? new k4.k(null, null, null, null) : kVar;
    }

    private static k4.k b(p4.c cVar, e4.h hVar) {
        cVar.f();
        k4.a aVar = null;
        k4.a aVar2 = null;
        k4.b bVar = null;
        k4.b bVar2 = null;
        while (cVar.j()) {
            int M = cVar.M(f17483b);
            if (M == 0) {
                aVar = d.c(cVar, hVar);
            } else if (M == 1) {
                aVar2 = d.c(cVar, hVar);
            } else if (M == 2) {
                bVar = d.e(cVar, hVar);
            } else if (M != 3) {
                cVar.V();
                cVar.W();
            } else {
                bVar2 = d.e(cVar, hVar);
            }
        }
        cVar.i();
        return new k4.k(aVar, aVar2, bVar, bVar2);
    }
}
