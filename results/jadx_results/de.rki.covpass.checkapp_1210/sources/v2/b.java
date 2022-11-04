package v2;

import c4.e;
import c4.k;
import c4.l;
import z3.d;
/* loaded from: classes.dex */
public class b {
    public static void a(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar;
        float[] fArr = aVar3.V3;
        float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        int c10 = bVar.c();
        int a10 = bVar.a();
        int i10 = (c10 - a10) - 1;
        int p10 = aVar.p();
        int g10 = aVar.g();
        int i11 = 0;
        while (i11 < g10) {
            int i12 = aVar2.f6218c + (aVar2.f6219d * i11);
            int i13 = aVar3.f6218c + (aVar3.f6219d * i11);
            int i14 = i13 + a10;
            int i15 = i13;
            while (true) {
                float f10 = 0.0f;
                if (i15 >= i14) {
                    break;
                }
                int i16 = i13;
                int i17 = c10 - (((i10 + 1) + i15) - i13);
                float f11 = 0.0f;
                while (i17 < c10) {
                    float f12 = fArr3[i17];
                    f11 += f12;
                    f10 += fArr[i16] * f12;
                    i17++;
                    i16++;
                }
                fArr2[i12] = f10 / f11;
                i15++;
                i12++;
            }
            int i18 = p10 - (a10 + i10);
            int i19 = i15 + i18;
            int i20 = i12 + i18;
            int i21 = i13 + p10;
            while (i19 < i21) {
                int i22 = i19 - a10;
                int i23 = i21 - i22;
                float f13 = 0.0f;
                float f14 = 0.0f;
                int i24 = 0;
                while (i24 < i23) {
                    float f15 = fArr3[i24];
                    f14 += f15;
                    f13 += fArr[i22] * f15;
                    i24++;
                    i22++;
                }
                fArr2[i20] = f13 / f14;
                i19++;
                i20++;
            }
            i11++;
            aVar3 = aVar;
        }
    }

    public static void b(d dVar, k kVar, c4.d dVar2) {
        k kVar2 = kVar;
        short[] sArr = kVar2.V3;
        short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        int c10 = dVar.c();
        int a10 = dVar.a();
        int i10 = (c10 - a10) - 1;
        int p10 = kVar.p();
        int g10 = kVar.g();
        int i11 = 0;
        while (i11 < g10) {
            int i12 = dVar2.f6218c + (dVar2.f6219d * i11);
            int i13 = kVar2.f6218c + (kVar2.f6219d * i11);
            int i14 = i13 + a10;
            int i15 = i13;
            while (i15 < i14) {
                int i16 = i13;
                int i17 = c10 - (((i10 + 1) + i15) - i13);
                int i18 = 0;
                int i19 = 0;
                while (i17 < c10) {
                    int i20 = iArr[i17];
                    i19 += i20;
                    i18 += (sArr[i16] & 65535) * i20;
                    i17++;
                    i16++;
                }
                sArr2[i12] = (short) ((i18 + (i19 / 2)) / i19);
                i15++;
                i12++;
            }
            int i21 = p10 - (a10 + i10);
            int i22 = i15 + i21;
            int i23 = i12 + i21;
            int i24 = i13 + p10;
            while (i22 < i24) {
                int i25 = i22 - a10;
                int i26 = i24 - i25;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i27 < i26) {
                    int i30 = iArr[i27];
                    i29 += i30;
                    i28 += (sArr[i25] & 65535) * i30;
                    i27++;
                    i25++;
                }
                sArr2[i23] = (short) ((i28 + (i29 / 2)) / i29);
                i22++;
                i23++;
            }
            i11++;
            kVar2 = kVar;
        }
    }

    public static void c(d dVar, l lVar, e eVar) {
        l lVar2 = lVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        int c10 = dVar.c();
        int a10 = dVar.a();
        int i10 = (c10 - a10) - 1;
        int p10 = lVar.p();
        int g10 = lVar.g();
        int i11 = 0;
        while (i11 < g10) {
            int i12 = eVar.f6218c + (eVar.f6219d * i11);
            int i13 = lVar2.f6218c + (lVar2.f6219d * i11);
            int i14 = i13 + a10;
            int i15 = i13;
            while (i15 < i14) {
                int i16 = i13;
                int i17 = c10 - (((i10 + 1) + i15) - i13);
                int i18 = 0;
                int i19 = 0;
                while (i17 < c10) {
                    int i20 = iArr[i17];
                    i19 += i20;
                    i18 += (bArr[i16] & 255) * i20;
                    i17++;
                    i16++;
                }
                bArr2[i12] = (byte) ((i18 + (i19 / 2)) / i19);
                i15++;
                i12++;
            }
            int i21 = p10 - (a10 + i10);
            int i22 = i15 + i21;
            int i23 = i12 + i21;
            int i24 = i13 + p10;
            while (i22 < i24) {
                int i25 = i22 - a10;
                int i26 = i24 - i25;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i27 < i26) {
                    int i30 = iArr[i27];
                    i29 += i30;
                    i28 += (bArr[i25] & 255) * i30;
                    i27++;
                    i25++;
                }
                bArr2[i23] = (byte) ((i28 + (i29 / 2)) / i29);
                i22++;
                i23++;
            }
            i11++;
            lVar2 = lVar;
        }
    }

    public static void d(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        int c10 = bVar.c();
        int a10 = bVar.a();
        int p10 = aVar2.p();
        int g10 = aVar2.g();
        int i10 = g10 - ((c10 - a10) - 1);
        for (int i11 = 0; i11 < a10; i11++) {
            int i12 = aVar3.f6218c + (aVar3.f6219d * i11);
            int i13 = aVar.f6218c + (aVar.f6219d * i11);
            int i14 = i13 + p10;
            int i15 = a10 - i11;
            float f10 = 0.0f;
            for (int i16 = i15; i16 < c10; i16++) {
                f10 += fArr3[i16];
            }
            while (i13 < i14) {
                int i17 = i13 - (aVar.f6219d * i11);
                int i18 = i15;
                float f11 = 0.0f;
                while (i18 < c10) {
                    f11 += fArr[i17] * fArr3[i18];
                    i18++;
                    i17 += aVar.f6219d;
                    c10 = c10;
                }
                fArr2[i12] = f11 / f10;
                i13++;
                i12++;
                c10 = c10;
            }
        }
        while (i10 < g10) {
            int i19 = aVar3.f6218c + (aVar3.f6219d * i10);
            int i20 = aVar.f6218c + (aVar.f6219d * i10);
            int i21 = i20 + p10;
            int i22 = g10 - (i10 - a10);
            float f12 = 0.0f;
            for (int i23 = 0; i23 < i22; i23++) {
                f12 += fArr3[i23];
            }
            while (i20 < i21) {
                int i24 = i20 - (aVar.f6219d * a10);
                int i25 = 0;
                float f13 = 0.0f;
                while (i25 < i22) {
                    f13 += fArr[i24] * fArr3[i25];
                    i25++;
                    i24 += aVar.f6219d;
                }
                fArr2[i19] = f13 / f12;
                i20++;
                i19++;
            }
            i10++;
            aVar3 = aVar2;
        }
    }

    public static void e(d dVar, k kVar, c4.d dVar2) {
        c4.d dVar3 = dVar2;
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar3.V3;
        int[] iArr = dVar.f26449c;
        int c10 = dVar.c();
        int a10 = dVar.a();
        int p10 = dVar2.p();
        int g10 = dVar2.g();
        int i10 = g10 - ((c10 - a10) - 1);
        for (int i11 = 0; i11 < a10; i11++) {
            int i12 = dVar3.f6218c + (dVar3.f6219d * i11);
            int i13 = kVar.f6218c + (kVar.f6219d * i11);
            int i14 = i13 + p10;
            int i15 = a10 - i11;
            int i16 = 0;
            for (int i17 = i15; i17 < c10; i17++) {
                i16 += iArr[i17];
            }
            while (i13 < i14) {
                int i18 = i13 - (kVar.f6219d * i11);
                int i19 = i15;
                int i20 = 0;
                while (i19 < c10) {
                    i20 += (sArr[i18] & 65535) * iArr[i19];
                    i19++;
                    i18 += kVar.f6219d;
                    c10 = c10;
                }
                sArr2[i12] = (short) ((i20 + (i16 / 2)) / i16);
                i13++;
                i12++;
                c10 = c10;
            }
        }
        while (i10 < g10) {
            int i21 = dVar3.f6218c + (dVar3.f6219d * i10);
            int i22 = kVar.f6218c + (kVar.f6219d * i10);
            int i23 = i22 + p10;
            int i24 = g10 - (i10 - a10);
            int i25 = 0;
            for (int i26 = 0; i26 < i24; i26++) {
                i25 += iArr[i26];
            }
            while (i22 < i23) {
                int i27 = i22 - (kVar.f6219d * a10);
                int i28 = 0;
                int i29 = 0;
                while (i28 < i24) {
                    i29 += (sArr[i27] & 65535) * iArr[i28];
                    i28++;
                    i27 += kVar.f6219d;
                }
                sArr2[i21] = (short) ((i29 + (i25 / 2)) / i25);
                i22++;
                i21++;
            }
            i10++;
            dVar3 = dVar2;
        }
    }

    public static void f(d dVar, l lVar, e eVar) {
        int i10;
        e eVar2 = eVar;
        byte[] bArr = lVar.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int c10 = dVar.c();
        int a10 = dVar.a();
        int p10 = eVar.p();
        int g10 = eVar.g();
        int i11 = g10 - ((c10 - a10) - 1);
        for (int i12 = 0; i12 < a10; i12++) {
            int i13 = eVar2.f6218c + (eVar2.f6219d * i12);
            int i14 = lVar.f6218c + (lVar.f6219d * i12);
            int i15 = i14 + p10;
            int i16 = a10 - i12;
            int i17 = 0;
            for (int i18 = i16; i18 < c10; i18++) {
                i17 += iArr[i18];
            }
            while (i14 < i15) {
                int i19 = i14 - (lVar.f6219d * i12);
                int i20 = i11;
                int i21 = i16;
                int i22 = 0;
                while (true) {
                    i10 = c10;
                    if (i21 < c10) {
                        i22 += (bArr[i19] & 255) * iArr[i21];
                        i21++;
                        i19 += lVar.f6219d;
                        c10 = i10;
                    }
                }
                bArr2[i13] = (byte) ((i22 + (i17 / 2)) / i17);
                i14++;
                i13++;
                i11 = i20;
                c10 = i10;
            }
        }
        while (i11 < g10) {
            int i23 = eVar2.f6218c + (eVar2.f6219d * i11);
            int i24 = lVar.f6218c + (lVar.f6219d * i11);
            int i25 = i24 + p10;
            int i26 = g10 - (i11 - a10);
            int i27 = 0;
            for (int i28 = 0; i28 < i26; i28++) {
                i27 += iArr[i28];
            }
            while (i24 < i25) {
                int i29 = i24 - (lVar.f6219d * a10);
                int i30 = 0;
                int i31 = 0;
                while (i30 < i26) {
                    i31 += (bArr[i29] & 255) * iArr[i30];
                    i30++;
                    i29 += lVar.f6219d;
                }
                bArr2[i23] = (byte) ((i31 + (i27 / 2)) / i27);
                i24++;
                i23++;
            }
            i11++;
            eVar2 = eVar;
        }
    }
}
