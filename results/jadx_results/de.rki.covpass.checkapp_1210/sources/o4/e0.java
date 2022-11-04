package o4;

import p4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a */
    private static final c.a f17491a = c.a.a("nm", "c", "o", "tr", "hd");

    public static l4.l a(p4.c cVar, e4.h hVar) {
        boolean z10 = false;
        String str = null;
        k4.b bVar = null;
        k4.b bVar2 = null;
        k4.l lVar = null;
        while (cVar.j()) {
            int M = cVar.M(f17491a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                bVar = d.f(cVar, hVar, false);
            } else if (M == 2) {
                bVar2 = d.f(cVar, hVar, false);
            } else if (M == 3) {
                lVar = c.g(cVar, hVar);
            } else if (M != 4) {
                cVar.W();
            } else {
                z10 = cVar.n();
            }
        }
        return new l4.l(str, bVar, bVar2, lVar, z10);
    }
}
