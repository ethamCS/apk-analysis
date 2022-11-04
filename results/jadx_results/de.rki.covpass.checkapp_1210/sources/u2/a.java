package u2;

import java.util.Arrays;
/* loaded from: classes.dex */
public class a {
    public static void a(z3.b bVar, c4.a aVar, c4.a aVar2) {
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        int a10 = bVar.a();
        int c10 = bVar.c();
        int p10 = aVar.p();
        for (int i10 = 0; i10 < aVar.f6221x; i10++) {
            int i11 = aVar2.f6218c + (aVar2.f6219d * i10) + a10;
            int i12 = aVar.f6218c + (aVar.f6219d * i10);
            int i13 = (i12 + p10) - (c10 - 1);
            while (i12 < i13) {
                float f10 = 0.0f;
                int i14 = 0;
                int i15 = i12;
                while (i14 < c10) {
                    f10 += fArr[i15] * fArr3[i14];
                    i14++;
                    i15++;
                }
                fArr2[i11] = f10;
                i12++;
                i11++;
            }
        }
    }

    public static void b(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        int a10 = dVar.a();
        int c10 = dVar.c();
        int i11 = i10 / 2;
        int p10 = kVar.p();
        for (int i12 = 0; i12 < kVar.f6221x; i12++) {
            int i13 = dVar2.f6218c + (dVar2.f6219d * i12) + a10;
            int i14 = kVar.f6218c + (kVar.f6219d * i12);
            int i15 = (i14 + p10) - (c10 - 1);
            while (i14 < i15) {
                int i16 = 0;
                int i17 = 0;
                int i18 = i14;
                while (i16 < c10) {
                    i17 += (sArr[i18] & 65535) * iArr[i16];
                    i16++;
                    i18++;
                }
                sArr2[i13] = (short) ((i17 + i11) / i10);
                i14++;
                i13++;
            }
        }
    }

    public static void c(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        byte[] bArr = lVar.V3;
        byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        int a10 = dVar.a();
        int c10 = dVar.c();
        int i11 = i10 / 2;
        int p10 = lVar.p();
        for (int i12 = 0; i12 < lVar.f6221x; i12++) {
            int i13 = eVar.f6218c + (eVar.f6219d * i12) + a10;
            int i14 = lVar.f6218c + (lVar.f6219d * i12);
            int i15 = (i14 + p10) - (c10 - 1);
            while (i14 < i15) {
                int i16 = i14;
                int i17 = 0;
                int i18 = 0;
                while (i17 < c10) {
                    i18 += (bArr[i16] & 255) * iArr[i17];
                    i17++;
                    i16++;
                }
                bArr2[i13] = (byte) ((i18 + i11) / i10);
                i14++;
                i13++;
            }
        }
    }

    public static void d(z3.b bVar, c4.a aVar, c4.a aVar2) {
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        int a10 = bVar.a();
        int c10 = bVar.c();
        int p10 = aVar2.p();
        int g10 = aVar2.g() - ((c10 - a10) - 1);
        for (int i10 = a10; i10 < g10; i10++) {
            int i11 = aVar2.f6218c + (aVar2.f6219d * i10);
            Arrays.fill(fArr2, i11, i11 + p10, 0.0f);
            for (int i12 = 0; i12 < c10; i12++) {
                int i13 = aVar.f6218c + (((i10 - a10) + i12) * aVar.f6219d);
                int i14 = i13 + p10;
                float f10 = fArr3[i12];
                int i15 = i11;
                while (i13 < i14) {
                    fArr2[i15] = fArr2[i15] + (fArr[i13] * f10);
                    i13++;
                    i15++;
                }
            }
        }
    }

    public static void e(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        c4.k kVar2 = kVar;
        c4.d dVar4 = dVar2;
        short[] sArr = kVar2.V3;
        short[] sArr2 = dVar4.V3;
        int[] iArr = dVar.f26449c;
        int a10 = dVar.a();
        int c10 = dVar.c();
        int i11 = i10 / 2;
        double d10 = 1.0d / i10;
        int p10 = dVar2.p();
        int g10 = dVar2.g() - ((c10 - a10) - 1);
        int[] d11 = v3.a.d((ok.g) v3.a.a(dVar3, m3.g.f16265a).d(), p10, true);
        int i12 = a10;
        while (i12 < g10) {
            int i13 = 0;
            while (i13 < c10) {
                int i14 = iArr[i13];
                int i15 = c10;
                int i16 = kVar2.f6218c + (((i12 - a10) + i13) * kVar2.f6219d);
                int i17 = 0;
                while (i17 < p10) {
                    d11[i17] = d11[i17] + ((sArr[i16] & 65535) * i14);
                    i17++;
                    i16++;
                }
                i13++;
                c10 = i15;
            }
            int i18 = c10;
            int i19 = dVar4.f6218c + (dVar4.f6219d * i12);
            int i20 = 0;
            while (i20 < p10) {
                sArr2[i19] = (short) ((d11[i20] + i11) * d10);
                i20++;
                i19++;
            }
            Arrays.fill(d11, 0, p10, 0);
            i12++;
            kVar2 = kVar;
            dVar4 = dVar2;
            c10 = i18;
        }
    }

    public static void f(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int a10 = dVar.a();
        int c10 = dVar.c();
        int i11 = i10 / 2;
        double d10 = 1.0d / i10;
        int p10 = eVar.p();
        int g10 = eVar.g() - ((c10 - a10) - 1);
        int[] d11 = v3.a.d((ok.g) v3.a.a(dVar2, m3.g.f16265a).d(), p10, true);
        int i12 = a10;
        while (i12 < g10) {
            int i13 = 0;
            while (i13 < c10) {
                int i14 = iArr[i13];
                int i15 = c10;
                int i16 = lVar2.f6218c + (((i12 - a10) + i13) * lVar2.f6219d);
                int i17 = 0;
                while (i17 < p10) {
                    d11[i17] = d11[i17] + ((bArr[i16] & 255) * i14);
                    i17++;
                    i16++;
                }
                i13++;
                c10 = i15;
            }
            int i18 = c10;
            int i19 = eVar2.f6218c + (eVar2.f6219d * i12);
            int i20 = 0;
            while (i20 < p10) {
                bArr2[i19] = (byte) ((d11[i20] + i11) * d10);
                i20++;
                i19++;
            }
            Arrays.fill(d11, 0, p10, 0);
            i12++;
            lVar2 = lVar;
            eVar2 = eVar;
            c10 = i18;
        }
    }
}
