package o4;

import android.graphics.PointF;
import p4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private static final c.a f17492a = c.a.a("nm", "p", "s", "hd", "d");

    public static l4.b a(p4.c cVar, e4.h hVar, int i10) {
        boolean z10 = i10 == 3;
        boolean z11 = false;
        String str = null;
        k4.m<PointF, PointF> mVar = null;
        k4.f fVar = null;
        while (cVar.j()) {
            int M = cVar.M(f17492a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                mVar = a.b(cVar, hVar);
            } else if (M == 2) {
                fVar = d.i(cVar, hVar);
            } else if (M == 3) {
                z11 = cVar.n();
            } else if (M != 4) {
                cVar.V();
                cVar.W();
            } else {
                z10 = cVar.r() == 3;
            }
        }
        return new l4.b(str, mVar, fVar, z10, z11);
    }
}
