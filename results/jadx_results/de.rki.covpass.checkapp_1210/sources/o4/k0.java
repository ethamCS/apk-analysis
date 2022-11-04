package o4;

import p4.c;
/* loaded from: classes.dex */
class k0 {

    /* renamed from: a */
    static c.a f17515a = c.a.a("nm", "ind", "ks", "hd");

    public static l4.q a(p4.c cVar, e4.h hVar) {
        int i10 = 0;
        String str = null;
        k4.h hVar2 = null;
        boolean z10 = false;
        while (cVar.j()) {
            int M = cVar.M(f17515a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                i10 = cVar.r();
            } else if (M == 2) {
                hVar2 = d.k(cVar, hVar);
            } else if (M != 3) {
                cVar.W();
            } else {
                z10 = cVar.n();
            }
        }
        return new l4.q(str, i10, hVar2, z10);
    }
}
