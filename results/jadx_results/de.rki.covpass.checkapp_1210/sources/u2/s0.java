package u2;
/* loaded from: classes.dex */
public class s0 {
    public static void a(c4.a aVar, c4.a aVar2, int i10, int i11) {
        float f10 = i11;
        for (int i12 = 0; i12 < aVar.f6221x; i12++) {
            int i13 = aVar.f6218c + (aVar.f6219d * i12);
            int i14 = aVar2.f6218c + (aVar2.f6219d * i12) + i10;
            float f11 = 0.0f;
            int i15 = i13 + i11;
            while (i13 < i15) {
                f11 += aVar.V3[i13];
                i13++;
            }
            int i16 = i14 + 1;
            aVar2.V3[i14] = f11 / f10;
            int i17 = (aVar.f6220q + i13) - i11;
            while (i13 < i17) {
                float[] fArr = aVar.V3;
                f11 = (f11 - fArr[i13 - i11]) + fArr[i13];
                aVar2.V3[i16] = f11 / f10;
                i13++;
                i16++;
            }
        }
    }

    public static void b(c4.k kVar, c4.d dVar, int i10, int i11) {
        int i12 = i11 / 2;
        for (int i13 = 0; i13 < kVar.f6221x; i13++) {
            int i14 = kVar.f6218c + (kVar.f6219d * i13);
            int i15 = dVar.f6218c + (dVar.f6219d * i13) + i10;
            int i16 = i14 + i11;
            int i17 = 0;
            while (i14 < i16) {
                i17 += 65535 & kVar.V3[i14];
                i14++;
            }
            int i18 = i15 + 1;
            dVar.V3[i15] = (short) ((i17 + i12) / i11);
            int i19 = (kVar.f6220q + i14) - i11;
            while (i14 < i19) {
                short[] sArr = kVar.V3;
                i17 = (i17 - (sArr[i14 - i11] & 65535)) + (sArr[i14] & 65535);
                dVar.V3[i18] = (short) ((i17 + i12) / i11);
                i14++;
                i18++;
            }
        }
    }

    public static void c(c4.l lVar, c4.e eVar, int i10, int i11) {
        int i12 = i11 / 2;
        for (int i13 = 0; i13 < lVar.f6221x; i13++) {
            int i14 = lVar.f6218c + (lVar.f6219d * i13);
            int i15 = eVar.f6218c + (eVar.f6219d * i13) + i10;
            int i16 = i14 + i11;
            int i17 = 0;
            while (i14 < i16) {
                i17 += lVar.V3[i14] & 255;
                i14++;
            }
            int i18 = i15 + 1;
            eVar.V3[i15] = (byte) ((i17 + i12) / i11);
            int i19 = (lVar.f6220q + i14) - i11;
            while (i14 < i19) {
                byte[] bArr = lVar.V3;
                i17 = (i17 - (bArr[i14 - i11] & 255)) + (bArr[i14] & 255);
                eVar.V3[i18] = (byte) ((i17 + i12) / i11);
                i14++;
                i18++;
            }
        }
    }

    public static void d(c4.a aVar, c4.a aVar2, int i10, int i11, ll.d<ok.e> dVar) {
        int i12 = aVar.f6219d * i11;
        int i13 = (i11 - i10) - 1;
        float f10 = i11;
        int i14 = aVar2.f6221x - i13;
        float[] c10 = v3.a.c((ok.e) v3.a.a(dVar, m3.e.f16263a).d(), aVar.f6220q, false);
        for (int i15 = 0; i15 < aVar.f6220q; i15++) {
            int i16 = aVar.f6218c;
            int i17 = aVar.f6219d;
            int i18 = i16 + ((i10 - i10) * i17) + i15;
            int i19 = aVar2.f6218c + (aVar2.f6219d * i10) + i15;
            float f11 = 0.0f;
            int i20 = (i17 * i11) + i18;
            while (i18 < i20) {
                f11 += aVar.V3[i18];
                i18 += aVar.f6219d;
            }
            c10[i15] = f11;
            aVar2.V3[i19] = f11 / f10;
        }
        while (true) {
            i10++;
            if (i10 < i14) {
                int i21 = aVar.f6218c + ((i10 + i13) * aVar.f6219d);
                int i22 = aVar2.f6218c + (aVar2.f6219d * i10);
                int i23 = 0;
                while (i23 < aVar.f6220q) {
                    float f12 = c10[i23];
                    float[] fArr = aVar.V3;
                    float f13 = (f12 - fArr[i21 - i12]) + fArr[i21];
                    c10[i23] = f13;
                    aVar2.V3[i22] = f13 / f10;
                    i23++;
                    i21++;
                    i22++;
                }
            } else {
                return;
            }
        }
    }

    public static void e(c4.k kVar, c4.d dVar, int i10, int i11, ll.d<ok.g> dVar2) {
        int i12 = kVar.f6219d * i11;
        int i13 = (i11 - i10) - 1;
        int i14 = i11 / 2;
        int i15 = dVar.f6221x - i13;
        int[] d10 = v3.a.d((ok.g) v3.a.a(dVar2, m3.g.f16265a).d(), kVar.f6220q, false);
        for (int i16 = 0; i16 < kVar.f6220q; i16++) {
            int i17 = kVar.f6218c;
            int i18 = kVar.f6219d;
            int i19 = i17 + ((i10 - i10) * i18) + i16;
            int i20 = dVar.f6218c + (dVar.f6219d * i10) + i16;
            int i21 = (i18 * i11) + i19;
            int i22 = 0;
            while (i19 < i21) {
                i22 += kVar.V3[i19] & 65535;
                i19 += kVar.f6219d;
            }
            d10[i16] = i22;
            dVar.V3[i20] = (short) ((i22 + i14) / i11);
        }
        for (int i23 = i10 + 1; i23 < i15; i23++) {
            int i24 = kVar.f6218c + ((i23 + i13) * kVar.f6219d);
            int i25 = dVar.f6218c + (dVar.f6219d * i23);
            int i26 = 0;
            while (i26 < kVar.f6220q) {
                int i27 = d10[i26];
                short[] sArr = kVar.V3;
                int i28 = (i27 - (sArr[i24 - i12] & 65535)) + (sArr[i24] & 65535);
                d10[i26] = i28;
                dVar.V3[i25] = (short) ((i28 + i14) / i11);
                i26++;
                i24++;
                i25++;
            }
        }
    }

    public static void f(c4.l lVar, c4.e eVar, int i10, int i11, ll.d<ok.g> dVar) {
        int i12 = lVar.f6219d * i11;
        int i13 = (i11 - i10) - 1;
        int i14 = i11 / 2;
        int i15 = eVar.f6221x - i13;
        int[] d10 = v3.a.d((ok.g) v3.a.a(dVar, m3.g.f16265a).d(), lVar.f6220q, false);
        for (int i16 = 0; i16 < lVar.f6220q; i16++) {
            int i17 = lVar.f6218c;
            int i18 = lVar.f6219d;
            int i19 = i17 + ((i10 - i10) * i18) + i16;
            int i20 = eVar.f6218c + (eVar.f6219d * i10) + i16;
            int i21 = (i18 * i11) + i19;
            int i22 = 0;
            while (i19 < i21) {
                i22 += lVar.V3[i19] & 255;
                i19 += lVar.f6219d;
            }
            d10[i16] = i22;
            eVar.V3[i20] = (byte) ((i22 + i14) / i11);
        }
        while (true) {
            i10++;
            if (i10 < i15) {
                int i23 = lVar.f6218c + ((i10 + i13) * lVar.f6219d);
                int i24 = eVar.f6218c + (eVar.f6219d * i10);
                int i25 = 0;
                while (i25 < lVar.f6220q) {
                    int i26 = d10[i25];
                    byte[] bArr = lVar.V3;
                    int i27 = (i26 - (bArr[i23 - i12] & 255)) + (bArr[i23] & 255);
                    d10[i25] = i27;
                    eVar.V3[i24] = (byte) ((i27 + i14) / i11);
                    i25++;
                    i23++;
                    i24++;
                }
            } else {
                return;
            }
        }
    }
}
