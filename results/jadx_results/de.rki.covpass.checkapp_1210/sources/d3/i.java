package d3;

import java.util.Arrays;
/* loaded from: classes.dex */
public class i {
    public static void a(c4.a aVar, float f10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i10 = 0; i10 < aVar.f6221x; i10++) {
            int i11 = aVar.f6218c + (aVar.f6219d * i10);
            int i12 = aVar.f6220q + i11;
            while (i11 < i12) {
                int i13 = i11 + 1;
                int i14 = (int) (aVar.V3[i11] - f10);
                iArr[i14] = iArr[i14] + 1;
                i11 = i13;
            }
        }
    }

    public static void b(c4.b bVar, double d10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i10 = 0; i10 < bVar.f6221x; i10++) {
            int i11 = bVar.f6218c + (bVar.f6219d * i10);
            int i12 = bVar.f6220q + i11;
            while (i11 < i12) {
                int i13 = i11 + 1;
                int i14 = (int) (bVar.V3[i11] - d10);
                iArr[i14] = iArr[i14] + 1;
                i11 = i13;
            }
        }
    }

    public static void c(c4.g gVar, int i10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i11 = 0; i11 < gVar.f6221x; i11++) {
            int i12 = gVar.f6218c + (gVar.f6219d * i11);
            int i13 = gVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = gVar.V3[i12] - i10;
                iArr[i15] = iArr[i15] + 1;
                i12 = i14;
            }
        }
    }

    public static void d(c4.h hVar, int i10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i11 = 0; i11 < hVar.f6221x; i11++) {
            int i12 = hVar.f6218c + (hVar.f6219d * i11);
            int i13 = hVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = hVar.V3[i12] - i10;
                iArr[i15] = iArr[i15] + 1;
                i12 = i14;
            }
        }
    }

    public static void e(c4.i iVar, long j10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i10 = 0; i10 < iVar.f6221x; i10++) {
            int i11 = iVar.f6218c + (iVar.f6219d * i10);
            int i12 = iVar.f6220q + i11;
            while (i11 < i12) {
                int i13 = i11 + 1;
                int i14 = (int) (iVar.V3[i11] - j10);
                iArr[i14] = iArr[i14] + 1;
                i11 = i13;
            }
        }
    }

    public static void f(c4.j jVar, int i10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i11 = 0; i11 < jVar.f6221x; i11++) {
            int i12 = jVar.f6218c + (jVar.f6219d * i11);
            int i13 = jVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = jVar.V3[i12] - i10;
                iArr[i15] = iArr[i15] + 1;
                i12 = i14;
            }
        }
    }

    public static void g(c4.k kVar, int i10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i11 = 0; i11 < kVar.f6221x; i11++) {
            int i12 = kVar.f6218c + (kVar.f6219d * i11);
            int i13 = kVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = (kVar.V3[i12] & 65535) - i10;
                iArr[i15] = iArr[i15] + 1;
                i12 = i14;
            }
        }
    }

    public static void h(c4.l lVar, int i10, int[] iArr) {
        Arrays.fill(iArr, 0);
        for (int i11 = 0; i11 < lVar.f6221x; i11++) {
            int i12 = lVar.f6218c + (lVar.f6219d * i11);
            int i13 = lVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = (lVar.V3[i12] & 255) - i10;
                iArr[i15] = iArr[i15] + 1;
                i12 = i14;
            }
        }
    }

    public static float i(float[] fArr, int i10, int i11, int i12, int i13) {
        float f10 = fArr[i10];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = (i14 * i13) + i10;
            int i16 = i15 + i12;
            while (i15 < i16) {
                float f11 = fArr[i15];
                if (f11 > f10) {
                    f10 = f11;
                }
                i15++;
            }
        }
        return f10;
    }

    public static float j(float[] fArr, int i10, int i11, int i12, int i13) {
        float f10 = fArr[i10];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = (i14 * i13) + i10;
            int i16 = i15 + i12;
            while (i15 < i16) {
                float f11 = fArr[i15];
                if (f11 < f10) {
                    f10 = f11;
                }
                i15++;
            }
        }
        return f10;
    }
}
