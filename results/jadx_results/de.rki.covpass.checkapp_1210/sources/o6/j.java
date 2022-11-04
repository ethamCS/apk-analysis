package o6;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: e */
    private b f17597e;

    public j(h6.j jVar) {
        super(jVar);
    }

    private static int[][] i(byte[] bArr, int i10, int i11, int i12, int i13) {
        char c10;
        int i14 = 8;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        char c11 = 2;
        boolean z10 = true;
        int i17 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i11, i10);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 << 3;
            if (i19 > i15) {
                i19 = i15;
            }
            int i20 = i17;
            while (i20 < i10) {
                int i21 = i20 << 3;
                if (i21 > i16) {
                    i21 = i16;
                }
                int i22 = (i19 * i12) + i21;
                int i23 = i17;
                int i24 = i23;
                int i25 = i24;
                int i26 = 255;
                while (i23 < i14) {
                    int i27 = i25;
                    int i28 = 0;
                    while (i28 < i14) {
                        int i29 = bArr[i22 + i28] & 255;
                        i24 += i29;
                        if (i29 < i26) {
                            i26 = i29;
                        }
                        if (i29 > i27) {
                            i27 = i29;
                        }
                        i28++;
                        i14 = 8;
                    }
                    if (i27 - i26 <= 24) {
                        i23++;
                        i22 += i12;
                        i25 = i27;
                        z10 = true;
                        i14 = 8;
                    }
                    while (true) {
                        i23++;
                        i22 += i12;
                        if (i23 < 8) {
                            int i30 = 0;
                            for (int i31 = 8; i30 < i31; i31 = 8) {
                                i24 += bArr[i22 + i30] & 255;
                                i30++;
                            }
                        }
                    }
                    i23++;
                    i22 += i12;
                    i25 = i27;
                    z10 = true;
                    i14 = 8;
                }
                boolean z11 = z10;
                int i32 = i24 >> 6;
                if (i25 - i26 <= 24) {
                    i32 = i26 / 2;
                    if (i18 > 0 && i20 > 0) {
                        int i33 = i18 - 1;
                        int i34 = i20 - 1;
                        c10 = 2;
                        int i35 = ((iArr[i33][i20] + (iArr[i18][i34] * 2)) + iArr[i33][i34]) / 4;
                        if (i26 < i35) {
                            i32 = i35;
                        }
                        iArr[i18][i20] = i32;
                        i20++;
                        z10 = z11;
                        c11 = c10;
                        i14 = 8;
                        i17 = 0;
                    }
                }
                c10 = 2;
                iArr[i18][i20] = i32;
                i20++;
                z10 = z11;
                c11 = c10;
                i14 = 8;
                i17 = 0;
            }
            i18++;
            i14 = 8;
            i17 = 0;
        }
        return iArr;
    }

    private static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int k10 = k(i16, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int k11 = k(i19, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[k10 + i23];
                    i22 += iArr2[k11 - 2] + iArr2[k11 - 1] + iArr2[k11] + iArr2[k11 + 1] + iArr2[2 + k11];
                }
                l(bArr, i21, i18, i22 / 25, i12, bVar);
            }
        }
    }

    private static int k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    private static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.o(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // h6.b
    public h6.b a(h6.j jVar) {
        return new j(jVar);
    }

    @Override // o6.h, h6.b
    public b b() {
        b bVar;
        b bVar2 = this.f17597e;
        if (bVar2 != null) {
            return bVar2;
        }
        h6.j e10 = e();
        int d10 = e10.d();
        int a10 = e10.a();
        if (d10 < 40 || a10 < 40) {
            bVar = super.b();
        } else {
            byte[] b10 = e10.b();
            int i10 = d10 >> 3;
            if ((d10 & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = a10 >> 3;
            if ((a10 & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] i14 = i(b10, i11, i13, d10, a10);
            bVar = new b(d10, a10);
            j(b10, i11, i13, d10, a10, i14, bVar);
        }
        this.f17597e = bVar;
        return this.f17597e;
    }
}
