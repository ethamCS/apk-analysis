package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    static final int[] f25159a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* renamed from: b */
    private static final int[] f25160b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f25161c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && bj.e.i(iArr3, f25159a))) {
            bj.n.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (bj.n.w(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && bj.e.i(iArr2, f25159a))) {
            bj.n.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] g10 = bj.e.g(bigInteger);
        if (g10[4] == -1) {
            int[] iArr = f25159a;
            if (bj.e.i(g10, iArr)) {
                bj.e.t(iArr, g10);
            }
        }
        return g10;
    }

    public static void d(int[] iArr, int[] iArr2) {
        bj.c.b(f25159a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e10 = bj.e.e();
        bj.e.l(iArr, iArr2, e10);
        k(e10, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.e.p(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && bj.n.u(10, iArr3, f25160b))) {
            int[] iArr4 = f25161c;
            if (bj.n.e(iArr4.length, iArr4, iArr3) == 0) {
                return;
            }
            bj.n.x(10, iArr3, iArr4.length);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            bj.e.s(f25159a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25159a;
        bj.e.s(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 5);
        } while (bj.n.B(5, iArr, f25159a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        long j10 = iArr[5] & 4294967295L;
        long j11 = iArr[6] & 4294967295L;
        long j12 = iArr[7] & 4294967295L;
        long j13 = iArr[8] & 4294967295L;
        long j14 = iArr[9] & 4294967295L;
        long j15 = (iArr[0] & 4294967295L) + j10 + (j10 << 31) + 0;
        iArr2[0] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[1] & 4294967295L) + j11 + (j11 << 31);
        iArr2[1] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[2] & 4294967295L) + j12 + (j12 << 31);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[3] & 4294967295L) + j13 + (j13 << 31);
        iArr2[3] = (int) j18;
        long j19 = (j18 >>> 32) + (4294967295L & iArr[4]) + j14 + (j14 << 31);
        iArr2[4] = (int) j19;
        l((int) (j19 >>> 32), iArr2);
    }

    public static void l(int i10, int[] iArr) {
        if ((i10 == 0 || bj.e.q(-2147483647, i10, iArr, 0) == 0) && (iArr[4] != -1 || !bj.e.i(iArr, f25159a))) {
            return;
        }
        bj.n.g(5, -2147483647, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] e10 = bj.e.e();
        bj.e.r(iArr, e10);
        k(e10, iArr2);
    }

    public static void n(int[] iArr, int i10, int[] iArr2) {
        int[] e10 = bj.e.e();
        bj.e.r(iArr, e10);
        while (true) {
            k(e10, iArr2);
            i10--;
            if (i10 > 0) {
                bj.e.r(iArr2, e10);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.e.s(iArr, iArr2, iArr3) != 0) {
            bj.n.U(5, -2147483647, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (bj.n.K(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && bj.e.i(iArr2, f25159a))) {
            bj.n.g(5, -2147483647, iArr2);
        }
    }
}
