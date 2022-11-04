package o4;

import android.graphics.PointF;
import p4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a */
    private static final c.a f17488a = c.a.a("nm", "p", "s", "r", "hd");

    public static l4.k a(p4.c cVar, e4.h hVar) {
        String str = null;
        k4.m<PointF, PointF> mVar = null;
        k4.f fVar = null;
        k4.b bVar = null;
        boolean z10 = false;
        while (cVar.j()) {
            int M = cVar.M(f17488a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                mVar = a.b(cVar, hVar);
            } else if (M == 2) {
                fVar = d.i(cVar, hVar);
            } else if (M == 3) {
                bVar = d.e(cVar, hVar);
            } else if (M != 4) {
                cVar.W();
            } else {
                z10 = cVar.n();
            }
        }
        return new l4.k(str, mVar, fVar, bVar, z10);
    }
}
