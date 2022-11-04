package o4;

import l4.i;
import p4.c;
/* loaded from: classes.dex */
class y {

    /* renamed from: a */
    private static final c.a f17545a = c.a.a("nm", "mm", "hd");

    public static l4.i a(p4.c cVar) {
        String str = null;
        boolean z10 = false;
        i.a aVar = null;
        while (cVar.j()) {
            int M = cVar.M(f17545a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                aVar = i.a.b(cVar.r());
            } else if (M != 2) {
                cVar.V();
                cVar.W();
            } else {
                z10 = cVar.n();
            }
        }
        return new l4.i(str, aVar, z10);
    }
}
