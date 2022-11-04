package o4;

import l4.s;
import p4.c;
/* loaded from: classes.dex */
class m0 {

    /* renamed from: a */
    private static final c.a f17521a = c.a.a("s", "e", "o", "nm", "m", "hd");

    public static l4.s a(p4.c cVar, e4.h hVar) {
        boolean z10 = false;
        String str = null;
        s.a aVar = null;
        k4.b bVar = null;
        k4.b bVar2 = null;
        k4.b bVar3 = null;
        while (cVar.j()) {
            int M = cVar.M(f17521a);
            if (M == 0) {
                bVar = d.f(cVar, hVar, false);
            } else if (M == 1) {
                bVar2 = d.f(cVar, hVar, false);
            } else if (M == 2) {
                bVar3 = d.f(cVar, hVar, false);
            } else if (M == 3) {
                str = cVar.u();
            } else if (M == 4) {
                aVar = s.a.b(cVar.r());
            } else if (M != 5) {
                cVar.W();
            } else {
                z10 = cVar.n();
            }
        }
        return new l4.s(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
