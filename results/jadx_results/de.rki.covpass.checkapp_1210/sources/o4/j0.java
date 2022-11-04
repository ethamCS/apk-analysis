package o4;

import java.util.ArrayList;
import p4.c;
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a */
    private static final c.a f17507a = c.a.a("nm", "hd", "it");

    public static l4.p a(p4.c cVar, e4.h hVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.j()) {
            int M = cVar.M(f17507a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                z10 = cVar.n();
            } else if (M != 2) {
                cVar.W();
            } else {
                cVar.e();
                while (cVar.j()) {
                    l4.c a10 = h.a(cVar, hVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.h();
            }
        }
        return new l4.p(str, arrayList, z10);
    }
}
