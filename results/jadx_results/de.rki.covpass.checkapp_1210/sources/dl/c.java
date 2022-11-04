package dl;

import rk.t;
/* loaded from: classes3.dex */
public class c {
    public static void a(t tVar, t tVar2, t tVar3) {
        pk.d.h((tVar == tVar3 || tVar2 == tVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(tVar.f21319q, tVar2.f21318d, "The 'A' and 'B' matrices do not have compatible dimensions");
        tVar3.U(tVar.f21318d, tVar2.f21319q);
        if (tVar.f21319q == 0 || tVar.f21318d == 0) {
            tk.c.a(tVar3, 0.0f);
            return;
        }
        int i10 = tVar2.f21318d * tVar2.f21319q;
        for (int i11 = 0; i11 < tVar.f21318d; i11++) {
            int i12 = tVar3.f21319q * i11;
            int i13 = tVar.f21319q * i11;
            int i14 = tVar2.f21319q + 0;
            int i15 = i13 + 1;
            float f10 = tVar.f21317c[i13];
            int i16 = 0;
            int i17 = i12;
            while (i16 < i14) {
                tVar3.f(i17, tVar2.f21317c[i16] * f10);
                i17++;
                i16++;
            }
            while (i16 != i10) {
                int i18 = tVar2.f21319q + i16;
                int i19 = i15 + 1;
                float f11 = tVar.f21317c[i15];
                int i20 = i12;
                while (i16 < i18) {
                    float[] fArr = tVar3.f21317c;
                    fArr[i20] = fArr[i20] + (tVar2.f21317c[i16] * f11);
                    i20++;
                    i16++;
                }
                i15 = i19;
            }
        }
    }

    public static void b(t tVar, t tVar2, t tVar3) {
        pk.d.h((tVar == tVar3 || tVar2 == tVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(tVar.f21319q, tVar2.f21318d, "The 'A' and 'B' matrices do not have compatible dimensions");
        tVar3.U(tVar.f21318d, tVar2.f21319q);
        for (int i10 = 0; i10 < tVar.f21318d; i10++) {
            int i11 = tVar2.f21319q * i10;
            int i12 = tVar.f21319q * i10;
            int i13 = 0;
            while (i13 < tVar2.f21319q) {
                float f10 = 0.0f;
                int i14 = tVar2.f21318d + i12;
                int i15 = i13;
                for (int i16 = i12; i16 < i14; i16++) {
                    f10 += tVar.f21317c[i16] * tVar2.f21317c[i15];
                    i15 += tVar2.f21319q;
                }
                tVar3.f(i11, f10);
                i13++;
                i11++;
            }
        }
    }
}
