package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class r0 {

    /* renamed from: a */
    static final int[] f25252a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a10 = bj.n.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a10 > 511 || (a10 == 511 && bj.n.o(16, iArr3, f25252a))) {
            a10 = (a10 + bj.n.v(16, iArr3)) & 511;
        }
        iArr3[16] = a10;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int w9 = bj.n.w(16, iArr, iArr2) + iArr[16];
        if (w9 > 511 || (w9 == 511 && bj.n.o(16, iArr2, f25252a))) {
            w9 = (w9 + bj.n.v(16, iArr2)) & 511;
        }
        iArr2[16] = w9;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] r10 = bj.n.r(521, bigInteger);
        if (bj.n.o(17, r10, f25252a)) {
            bj.n.W(17, r10);
        }
        return r10;
    }

    protected static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        bj.l.a(iArr, iArr2, iArr3);
        int i10 = iArr[16];
        int i11 = iArr2[16];
        iArr3[32] = bj.n.C(16, i10, iArr2, i11, iArr, iArr3, 16) + (i10 * i11);
    }

    protected static void e(int[] iArr, int[] iArr2) {
        bj.l.b(iArr, iArr2);
        int i10 = iArr[16];
        iArr2[32] = bj.n.E(16, i10 << 1, iArr, 0, iArr2, 16) + (i10 * i10);
    }

    public static void f(int[] iArr, int[] iArr2) {
        bj.c.b(f25252a, iArr, iArr2);
    }

    public static int g(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 17; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k10 = bj.n.k(33);
        d(iArr, iArr2, k10);
        l(k10, iArr3);
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (g(iArr) == 0) {
            bj.n.Q(17, f25252a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25252a;
        bj.n.Q(17, iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & 511;
        } while (bj.n.B(17, iArr, f25252a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (g(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int i10 = iArr[32];
        int H = (bj.n.H(16, iArr, 16, 9, i10, iArr2, 0) >>> 23) + (i10 >>> 9) + bj.n.e(16, iArr, iArr2);
        if (H > 511 || (H == 511 && bj.n.o(16, iArr2, f25252a))) {
            H = (H + bj.n.v(16, iArr2)) & 511;
        }
        iArr2[16] = H;
    }

    public static void m(int[] iArr) {
        int i10 = iArr[16];
        int g10 = bj.n.g(16, i10 >>> 9, iArr) + (i10 & 511);
        if (g10 > 511 || (g10 == 511 && bj.n.o(16, iArr, f25252a))) {
            g10 = (g10 + bj.n.v(16, iArr)) & 511;
        }
        iArr[16] = g10;
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k10 = bj.n.k(33);
        e(iArr, k10);
        l(k10, iArr2);
    }

    public static void o(int[] iArr, int i10, int[] iArr2) {
        int[] k10 = bj.n.k(33);
        e(iArr, k10);
        while (true) {
            l(k10, iArr2);
            i10--;
            if (i10 > 0) {
                e(iArr2, k10);
            } else {
                return;
            }
        }
    }

    public static void p(int[] iArr, int[] iArr2, int[] iArr3) {
        int Q = (bj.n.Q(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (Q < 0) {
            Q = (Q + bj.n.m(16, iArr3)) & 511;
        }
        iArr3[16] = Q;
    }

    public static void q(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (bj.n.K(16, iArr, i10 << 23, iArr2) | (i10 << 1)) & 511;
    }
}
