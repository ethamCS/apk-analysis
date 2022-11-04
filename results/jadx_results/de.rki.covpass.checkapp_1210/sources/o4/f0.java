package o4;

import p4.c;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a */
    private static final c.a f17493a = c.a.a("nm", "r", "hd");

    public static l4.m a(p4.c cVar, e4.h hVar) {
        boolean z10 = false;
        String str = null;
        k4.b bVar = null;
        while (cVar.j()) {
            int M = cVar.M(f17493a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                bVar = d.f(cVar, hVar, true);
            } else if (M != 2) {
                cVar.W();
            } else {
                z10 = cVar.n();
            }
        }
        if (z10) {
            return null;
        }
        return new l4.m(str, bVar);
    }
}
