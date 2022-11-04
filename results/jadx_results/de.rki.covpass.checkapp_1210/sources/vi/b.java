package vi;

import ak.l;
import bj.h;
import bj.n;
import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    static final int[] f24380a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: b */
    private static final int[] f24381b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.a(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr3, f24380a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (n.w(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr2, f24380a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = j11 + ((iArr[2] & 4294967295L) - 1);
        iArr[2] = (int) j13;
        long j14 = (j13 >> 32) + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j18;
            j15 = j18 >> 32;
        }
        iArr[7] = (int) (j15 + (4294967295L & iArr[7]) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] p10 = h.p(bigInteger);
        if ((p10[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = f24380a;
            if (h.s(p10, iArr)) {
                h.I(iArr, p10);
            }
        }
        return p10;
    }

    public static void e(int[] iArr, int[] iArr2) {
        bj.c.b(f24380a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k10 = h.k();
        h.y(iArr, iArr2, k10);
        l(k10, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.C(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && n.u(16, iArr3, f24381b))) {
            n.T(16, f24381b, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            h.H(f24380a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f24380a;
        h.H(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            l.n(bArr, 0, iArr, 0, 8);
        } while (n.B(8, iArr, f24380a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j10 = iArr[8] & 4294967295L;
        long j11 = iArr[9] & 4294967295L;
        long j12 = iArr[10] & 4294967295L;
        long j13 = iArr[11] & 4294967295L;
        long j14 = iArr[12] & 4294967295L;
        long j15 = iArr[13] & 4294967295L;
        long j16 = iArr[14] & 4294967295L;
        long j17 = iArr[15] & 4294967295L;
        long j18 = j12 + j13;
        long j19 = j15 + j16;
        long j20 = j19 + (j17 << 1);
        long j21 = j10 + j11 + j19;
        long j22 = j18 + j14 + j17 + j21;
        long j23 = (iArr[0] & 4294967295L) + j22 + j15 + j16 + j17 + 0;
        iArr2[0] = (int) j23;
        long j24 = (j23 >> 32) + (((iArr[1] & 4294967295L) + j22) - j10) + j16 + j17;
        iArr2[1] = (int) j24;
        long j25 = (j24 >> 32) + ((iArr[2] & 4294967295L) - j21);
        iArr2[2] = (int) j25;
        long j26 = (j25 >> 32) + ((((iArr[3] & 4294967295L) + j22) - j11) - j12) + j15;
        iArr2[3] = (int) j26;
        long j27 = (j26 >> 32) + ((((iArr[4] & 4294967295L) + j22) - j18) - j10) + j16;
        iArr2[4] = (int) j27;
        long j28 = (j27 >> 32) + (iArr[5] & 4294967295L) + j20 + j12;
        iArr2[5] = (int) j28;
        long j29 = (j28 >> 32) + (iArr[6] & 4294967295L) + j13 + j16 + j17;
        iArr2[6] = (int) j29;
        long j30 = (j29 >> 32) + (4294967295L & iArr[7]) + j22 + j20 + j14;
        iArr2[7] = (int) j30;
        m((int) (j30 >> 32), iArr2);
    }

    public static void m(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = i10 & 4294967295L;
            long j12 = (iArr[0] & 4294967295L) + j11 + 0;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j14;
                j13 = j14 >> 32;
            }
            long j15 = j13 + ((iArr[2] & 4294967295L) - j11);
            iArr[2] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[3] & 4294967295L) + j11;
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j19;
                long j20 = (j19 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j20;
                j17 = j20 >> 32;
            }
            long j21 = j17 + (4294967295L & iArr[7]) + j11;
            iArr[7] = (int) j21;
            j10 = j21 >> 32;
        } else {
            j10 = 0;
        }
        if (j10 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr, f24380a))) {
            c(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k10 = h.k();
        h.F(iArr, k10);
        l(k10, iArr2);
    }

    public static void o(int[] iArr, int i10, int[] iArr2) {
        int[] k10 = h.k();
        h.F(iArr, k10);
        while (true) {
            l(k10, iArr2);
            i10--;
            if (i10 > 0) {
                h.F(iArr2, k10);
            } else {
                return;
            }
        }
    }

    private static void p(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = j11 + (iArr[2] & 4294967295L) + 1;
        iArr[2] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j17;
            long j18 = (j17 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j18;
            j15 = j18 >> 32;
        }
        iArr[7] = (int) (j15 + ((4294967295L & iArr[7]) - 1));
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.H(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (n.K(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.s(iArr2, f24380a))) {
            c(iArr2);
        }
    }
}
