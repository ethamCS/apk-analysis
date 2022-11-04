package cl;

import rk.l;
import rk.n;
import rk.q;
/* loaded from: classes3.dex */
public class b {
    public static double a(l lVar, q qVar) {
        int c10 = lVar.c();
        double d10 = 0.0d;
        for (int i10 = 0; i10 < c10; i10++) {
            double abs = Math.abs(lVar.b(i10));
            if (abs > d10) {
                d10 = abs;
            }
        }
        return d10;
    }

    public static void b(n nVar, int i10, int i11, n nVar2, int i12, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < i14; i16++) {
            System.arraycopy(nVar.f21296c, nVar.j(i16 + i10, i11), nVar2.f21296c, nVar2.j(i16 + i12, i13), i15);
        }
    }
}
