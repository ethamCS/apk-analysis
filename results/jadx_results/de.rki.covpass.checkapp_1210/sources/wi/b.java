package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    static final int[] f25101a = {-1, -1, -1, -3};

    /* renamed from: b */
    private static final int[] f25102b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* renamed from: c */
    private static final int[] f25103c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.d.a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && bj.d.n(iArr3, f25101a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (bj.n.w(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && bj.d.n(iArr2, f25101a))) {
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
            long j13 = (j12 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        iArr[3] = (int) (j11 + (4294967295L & iArr[3]) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] l10 = bj.d.l(bigInteger);
        if ((l10[3] >>> 1) >= 2147483646) {
            int[] iArr = f25101a;
            if (bj.d.n(l10, iArr)) {
                bj.d.w(iArr, l10);
            }
        }
        return l10;
    }

    public static void e(int[] iArr, int[] iArr2) {
        bj.c.b(f25101a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h10 = bj.d.h();
        bj.d.s(iArr, iArr2, h10);
        l(h10, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.d.t(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && bj.h.s(iArr3, f25102b))) {
            int[] iArr4 = f25103c;
            bj.n.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            bj.d.v(f25101a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25101a;
        bj.d.v(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 4);
        } while (bj.n.B(4, iArr, f25101a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j10 = iArr[7] & 4294967295L;
        long j11 = (iArr[3] & 4294967295L) + j10;
        long j12 = (iArr[6] & 4294967295L) + (j10 << 1);
        long j13 = (iArr[2] & 4294967295L) + j12;
        long j14 = (iArr[5] & 4294967295L) + (j12 << 1);
        long j15 = (iArr[1] & 4294967295L) + j14;
        long j16 = (iArr[4] & 4294967295L) + (j14 << 1);
        long j17 = (iArr[0] & 4294967295L) + j16;
        iArr2[0] = (int) j17;
        long j18 = j15 + (j17 >>> 32);
        iArr2[1] = (int) j18;
        long j19 = j13 + (j18 >>> 32);
        iArr2[2] = (int) j19;
        long j20 = j11 + (j16 << 1) + (j19 >>> 32);
        iArr2[3] = (int) j20;
        m((int) (j20 >>> 32), iArr2);
    }

    public static void m(int i10, int[] iArr) {
        while (i10 != 0) {
            long j10 = i10 & 4294967295L;
            long j11 = (iArr[0] & 4294967295L) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j13;
                long j14 = (j13 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = j12 + (4294967295L & iArr[3]) + (j10 << 1);
            iArr[3] = (int) j15;
            i10 = (int) (j15 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !bj.d.n(iArr, f25101a)) {
            return;
        }
        c(iArr);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] h10 = bj.d.h();
        bj.d.u(iArr, h10);
        l(h10, iArr2);
    }

    public static void o(int[] iArr, int i10, int[] iArr2) {
        int[] h10 = bj.d.h();
        bj.d.u(iArr, h10);
        while (true) {
            l(h10, iArr2);
            i10--;
            if (i10 > 0) {
                bj.d.u(iArr2, h10);
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
            long j13 = (j12 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        iArr[3] = (int) (j11 + ((4294967295L & iArr[3]) - 2));
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.d.v(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (bj.n.K(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && bj.d.n(iArr2, f25101a))) {
            c(iArr2);
        }
    }
}
