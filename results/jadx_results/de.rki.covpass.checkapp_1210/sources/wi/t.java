package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a */
    static final int[] f25272a = {-1, -1, -2, -1, -1, -1};

    /* renamed from: b */
    private static final int[] f25273b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f25274c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && bj.f.r(iArr3, f25272a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (bj.n.w(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && bj.f.r(iArr2, f25272a))) {
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
        long j13 = j11 + (4294967295L & iArr[2]) + 1;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            bj.n.x(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] o10 = bj.f.o(bigInteger);
        if (o10[5] == -1) {
            int[] iArr = f25272a;
            if (bj.f.r(o10, iArr)) {
                bj.f.G(iArr, o10);
            }
        }
        return o10;
    }

    public static void e(int[] iArr, int[] iArr2) {
        bj.c.b(f25272a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j10 = bj.f.j();
        bj.f.x(iArr, iArr2, j10);
        l(j10, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.f.B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && bj.n.u(12, iArr3, f25273b))) {
            int[] iArr4 = f25274c;
            if (bj.n.e(iArr4.length, iArr4, iArr3) == 0) {
                return;
            }
            bj.n.x(12, iArr3, iArr4.length);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            bj.f.F(f25272a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25272a;
        bj.f.F(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 6);
        } while (bj.n.B(6, iArr, f25272a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j10 = iArr[6] & 4294967295L;
        long j11 = iArr[7] & 4294967295L;
        long j12 = (iArr[10] & 4294967295L) + j10;
        long j13 = (iArr[11] & 4294967295L) + j11;
        long j14 = (iArr[0] & 4294967295L) + j12 + 0;
        int i10 = (int) j14;
        long j15 = (j14 >> 32) + (iArr[1] & 4294967295L) + j13;
        iArr2[1] = (int) j15;
        long j16 = j12 + (iArr[8] & 4294967295L);
        long j17 = j13 + (iArr[9] & 4294967295L);
        long j18 = (j15 >> 32) + (iArr[2] & 4294967295L) + j16;
        long j19 = j18 & 4294967295L;
        long j20 = (j18 >> 32) + (iArr[3] & 4294967295L) + j17;
        iArr2[3] = (int) j20;
        long j21 = (j20 >> 32) + (iArr[4] & 4294967295L) + (j16 - j10);
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + (iArr[5] & 4294967295L) + (j17 - j11);
        iArr2[5] = (int) j22;
        long j23 = j22 >> 32;
        long j24 = j19 + j23;
        long j25 = j23 + (i10 & 4294967295L);
        iArr2[0] = (int) j25;
        long j26 = j25 >> 32;
        if (j26 != 0) {
            long j27 = j26 + (4294967295L & iArr2[1]);
            iArr2[1] = (int) j27;
            j24 += j27 >> 32;
        }
        iArr2[2] = (int) j24;
        if (((j24 >> 32) == 0 || bj.n.x(6, iArr2, 3) == 0) && (iArr2[5] != -1 || !bj.f.r(iArr2, f25272a))) {
            return;
        }
        c(iArr2);
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
            long j15 = j13 + (4294967295L & iArr[2]) + j11;
            iArr[2] = (int) j15;
            j10 = j15 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || bj.n.x(6, iArr, 3) == 0) && (iArr[5] != -1 || !bj.f.r(iArr, f25272a))) {
            return;
        }
        c(iArr);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] j10 = bj.f.j();
        bj.f.D(iArr, j10);
        l(j10, iArr2);
    }

    public static void o(int[] iArr, int i10, int[] iArr2) {
        int[] j10 = bj.f.j();
        bj.f.D(iArr, j10);
        while (true) {
            l(j10, iArr2);
            i10--;
            if (i10 > 0) {
                bj.f.D(iArr2, j10);
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
        long j13 = j11 + ((4294967295L & iArr[2]) - 1);
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            bj.n.n(6, iArr, 3);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.f.F(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (bj.n.K(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && bj.f.r(iArr2, f25272a))) {
            c(iArr2);
        }
    }
}
