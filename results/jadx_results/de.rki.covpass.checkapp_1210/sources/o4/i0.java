package o4;

import android.graphics.Path;
import java.util.Collections;
import p4.c;
/* loaded from: classes.dex */
class i0 {

    /* renamed from: a */
    private static final c.a f17501a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static l4.o a(p4.c cVar, e4.h hVar) {
        k4.d dVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        String str = null;
        k4.a aVar = null;
        while (cVar.j()) {
            int M = cVar.M(f17501a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                aVar = d.c(cVar, hVar);
            } else if (M == 2) {
                dVar = d.h(cVar, hVar);
            } else if (M == 3) {
                z10 = cVar.n();
            } else if (M == 4) {
                i10 = cVar.r();
            } else if (M != 5) {
                cVar.V();
                cVar.W();
            } else {
                z11 = cVar.n();
            }
        }
        return new l4.o(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar == null ? new k4.d(Collections.singletonList(new r4.a(100))) : dVar, z11);
    }
}
