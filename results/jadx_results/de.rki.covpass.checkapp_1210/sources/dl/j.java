package dl;

import rk.t;
import rk.w;
/* loaded from: classes3.dex */
public class j {
    public static void a(t tVar, w wVar, w wVar2) {
        int i10 = wVar.f21318d;
        if (i10 == 1) {
            if (tVar.f21319q != wVar.f21319q) {
                throw new pk.c("A and B are not compatible");
            }
        } else if (wVar.f21319q != 1) {
            throw new pk.c("B is not a vector");
        } else {
            if (tVar.f21319q != i10) {
                throw new pk.c("A and B are not compatible");
            }
        }
        wVar2.U(tVar.f21318d, 1);
        if (tVar.f21319q == 0) {
            tk.c.a(wVar2, 0.0f);
            return;
        }
        int i11 = 0;
        float b10 = wVar.b(0);
        int i12 = 0;
        int i13 = 0;
        while (i11 < tVar.f21318d) {
            int i14 = i12 + 1;
            float b11 = tVar.b(i12) * b10;
            int i15 = 1;
            while (i15 < tVar.f21319q) {
                b11 += tVar.b(i14) * wVar.b(i15);
                i15++;
                i14++;
            }
            wVar2.f(i13, b11);
            i11++;
            i12 = i14;
            i13++;
        }
    }
}
