package dl;
/* loaded from: classes3.dex */
public class a {
    public static void a(rk.d dVar, rk.d dVar2, rk.d dVar3) {
        if (dVar == dVar3 || dVar2 == dVar3) {
            throw new IllegalArgumentException("Neither 'a' or 'b' can be the same matrix as 'c'");
        }
        int i10 = dVar.f21269q;
        if (i10 != dVar2.f21268d) {
            throw new pk.c("The 'a' and 'b' matrices do not have compatible dimensions");
        }
        int i11 = dVar.f21268d;
        if (i11 != dVar3.f21268d || dVar2.f21269q != dVar3.f21269q) {
            throw new pk.c("The results matrix does not have the desired dimensions");
        }
        if (i10 == 0 || i11 == 0) {
            tk.a.a(dVar3, 0.0f, 0.0f);
            return;
        }
        int e10 = dVar.e();
        int e11 = dVar2.e();
        int e12 = dVar3.e();
        int i12 = dVar2.f21268d * e11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < dVar.f21268d) {
            int i15 = i13 * e10;
            int i16 = e11 + 0;
            float[] fArr = dVar.f21267c;
            int i17 = i15 + 1;
            float f10 = fArr[i15];
            int i18 = i17 + 1;
            float f11 = fArr[i17];
            int i19 = i14;
            int i20 = 0;
            while (i20 < i16) {
                float[] fArr2 = dVar2.f21267c;
                int i21 = i20 + 1;
                float f12 = fArr2[i20];
                int i22 = i21 + 1;
                float f13 = fArr2[i21];
                int i23 = e10;
                float[] fArr3 = dVar3.f21267c;
                int i24 = i19 + 1;
                fArr3[i19] = (f10 * f12) - (f11 * f13);
                i19 = i24 + 1;
                fArr3[i24] = (f13 * f10) + (f12 * f11);
                e10 = i23;
                i20 = i22;
            }
            int i25 = e10;
            while (i20 != i12) {
                int i26 = i20 + e11;
                float[] fArr4 = dVar.f21267c;
                int i27 = i18 + 1;
                float f14 = fArr4[i18];
                i18 = i27 + 1;
                float f15 = fArr4[i27];
                int i28 = i14;
                while (i20 < i26) {
                    float[] fArr5 = dVar2.f21267c;
                    int i29 = i20 + 1;
                    float f16 = fArr5[i20];
                    int i30 = i29 + 1;
                    float f17 = fArr5[i29];
                    float[] fArr6 = dVar3.f21267c;
                    int i31 = i28 + 1;
                    fArr6[i28] = fArr6[i28] + ((f14 * f16) - (f15 * f17));
                    i28 = i31 + 1;
                    fArr6[i31] = fArr6[i31] + (f17 * f14) + (f16 * f15);
                    i20 = i30;
                }
            }
            i14 += e12;
            i13++;
            e10 = i25;
        }
    }

    public static void b(rk.d dVar, rk.d dVar2, rk.d dVar3) {
        if (dVar == dVar3 || dVar2 == dVar3) {
            throw new IllegalArgumentException("Neither 'a' or 'b' can be the same matrix as 'c'");
        }
        if (dVar.f21269q != dVar2.f21268d) {
            throw new pk.c("The 'a' and 'b' matrices do not have compatible dimensions");
        }
        if (dVar.f21268d != dVar3.f21268d || dVar2.f21269q != dVar3.f21269q) {
            throw new pk.c("The results matrix does not have the desired dimensions");
        }
        int e10 = dVar.e();
        int e11 = dVar2.e();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < dVar.f21268d; i12++) {
            for (int i13 = 0; i13 < dVar2.f21269q; i13++) {
                int i14 = i13 * 2;
                int i15 = i10 + e10;
                float f10 = 0.0f;
                int i16 = i10;
                float f11 = 0.0f;
                while (i16 < i15) {
                    float[] fArr = dVar.f21267c;
                    int i17 = i16 + 1;
                    float f12 = fArr[i16];
                    float f13 = fArr[i17];
                    float[] fArr2 = dVar2.f21267c;
                    float f14 = fArr2[i14];
                    float f15 = fArr2[i14 + 1];
                    f10 += (f12 * f14) - (f13 * f15);
                    f11 += (f12 * f15) + (f13 * f14);
                    i14 += e11;
                    i16 = i17 + 1;
                }
                float[] fArr3 = dVar3.f21267c;
                int i18 = i11 + 1;
                fArr3[i11] = f10;
                i11 = i18 + 1;
                fArr3[i18] = f11;
            }
            i10 += e10;
        }
    }
}
