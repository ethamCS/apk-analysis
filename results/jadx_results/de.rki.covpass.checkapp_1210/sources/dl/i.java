package dl;

import rk.l;
/* loaded from: classes3.dex */
public class i {
    public static void a(rk.i iVar, l lVar, l lVar2) {
        int i10 = lVar.f21297d;
        if (i10 == 1) {
            if (iVar.f21298q != lVar.f21298q) {
                throw new pk.c("A and B are not compatible");
            }
        } else if (lVar.f21298q != 1) {
            throw new pk.c("B is not a vector");
        } else {
            if (iVar.f21298q != i10) {
                throw new pk.c("A and B are not compatible");
            }
        }
        lVar2.U(iVar.f21297d, 1);
        if (iVar.f21298q == 0) {
            tk.b.e(lVar2, 0.0d);
            return;
        }
        int i11 = 0;
        double b10 = lVar.b(0);
        int i12 = 0;
        int i13 = 0;
        while (i11 < iVar.f21297d) {
            double b11 = iVar.b(i12) * b10;
            i12++;
            int i14 = 1;
            while (i14 < iVar.f21298q) {
                b11 += iVar.b(i12) * lVar.b(i14);
                i14++;
                i12++;
            }
            lVar2.f(i13, b11);
            i11++;
            i13++;
        }
    }
}
