package c3;

import c4.a0;
import c4.b0;
import c4.f0;
import c4.h;
import c4.i;
import c4.q;
import c4.r;
import c4.s;
import c4.u;
import c4.v;
import c4.w;
import c4.x;
/* loaded from: classes.dex */
public class a {
    public static void a(q qVar, int i10, s sVar) {
        if (!(sVar instanceof r)) {
            if (sVar instanceof f0) {
                ((f0) sVar).B(i10).y(qVar);
                return;
            }
            String simpleName = qVar.getClass().getSimpleName();
            throw new IllegalArgumentException("Unknown image type: " + simpleName);
        } else if (x.class.isAssignableFrom(sVar.getClass())) {
            d.f((c4.e) qVar, i10, (x) sVar);
        } else if (w.class.isAssignableFrom(sVar.getClass())) {
            d.e((c4.d) qVar, i10, (w) sVar);
        } else if (a0.class == sVar.getClass()) {
            d.g((h) qVar, i10, (a0) sVar);
        } else if (b0.class == sVar.getClass()) {
            d.h((i) qVar, i10, (b0) sVar);
        } else if (u.class == sVar.getClass()) {
            d.c((c4.a) qVar, i10, (u) sVar);
        } else if (v.class == sVar.getClass()) {
            d.d((c4.b) qVar, i10, (v) sVar);
        } else {
            String simpleName2 = qVar.getClass().getSimpleName();
            throw new IllegalArgumentException("Unknown image Type: " + simpleName2);
        }
    }
}
