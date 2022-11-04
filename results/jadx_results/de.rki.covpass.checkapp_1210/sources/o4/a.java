package o4;

import android.graphics.PointF;
import java.util.ArrayList;
import p4.c;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final c.a f17480a = c.a.a("k", "x", "y");

    public static k4.e a(p4.c cVar, e4.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.B() == c.b.BEGIN_ARRAY) {
            cVar.e();
            while (cVar.j()) {
                arrayList.add(z.a(cVar, hVar));
            }
            cVar.h();
            u.b(arrayList);
        } else {
            arrayList.add(new r4.a(s.e(cVar, q4.h.e())));
        }
        return new k4.e(arrayList);
    }

    public static k4.m<PointF, PointF> b(p4.c cVar, e4.h hVar) {
        cVar.f();
        k4.e eVar = null;
        k4.b bVar = null;
        boolean z10 = false;
        k4.b bVar2 = null;
        while (cVar.B() != c.b.END_OBJECT) {
            int M = cVar.M(f17480a);
            if (M == 0) {
                eVar = a(cVar, hVar);
            } else if (M != 1) {
                if (M != 2) {
                    cVar.V();
                    cVar.W();
                } else if (cVar.B() == c.b.STRING) {
                    cVar.W();
                    z10 = true;
                } else {
                    bVar = d.e(cVar, hVar);
                }
            } else if (cVar.B() == c.b.STRING) {
                cVar.W();
                z10 = true;
            } else {
                bVar2 = d.e(cVar, hVar);
            }
        }
        cVar.i();
        if (z10) {
            hVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new k4.i(bVar2, bVar);
    }
}
