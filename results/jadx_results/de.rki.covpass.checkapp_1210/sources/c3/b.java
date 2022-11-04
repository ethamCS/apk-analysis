package c3;

import c4.g;
import c4.h;
import c4.i;
import c4.j;
import c4.k;
import c4.l;
import c4.q;
/* loaded from: classes.dex */
public class b {
    public static void a(q qVar, double d10, int[] iArr) {
        if (l.class == qVar.getClass()) {
            e.h((l) qVar, (int) d10, iArr);
        } else if (j.class == qVar.getClass()) {
            e.f((j) qVar, (int) d10, iArr);
        } else if (k.class == qVar.getClass()) {
            e.g((k) qVar, (int) d10, iArr);
        } else if (g.class == qVar.getClass()) {
            e.c((g) qVar, (int) d10, iArr);
        } else if (h.class == qVar.getClass()) {
            e.d((h) qVar, (int) d10, iArr);
        } else if (i.class == qVar.getClass()) {
            e.e((i) qVar, (long) d10, iArr);
        } else if (c4.a.class == qVar.getClass()) {
            e.a((c4.a) qVar, (float) d10, iArr);
        } else if (c4.b.class != qVar.getClass()) {
            throw new IllegalArgumentException("Unknown image Type");
        } else {
            e.b((c4.b) qVar, d10, iArr);
        }
    }
}
