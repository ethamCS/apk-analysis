package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a */
    static final int[] f25141a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: b */
    private static final int[] f25142b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f25143c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.h.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && bj.h.s(iArr3, f25141a))) {
            bj.n.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (bj.n.w(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && bj.h.s(iArr2, f25141a))) {
            bj.n.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] p10 = bj.h.p(bigInteger);
        if (p10[7] == -1) {
            int[] iArr = f25141a;
            if (bj.h.s(p10, iArr)) {
                bj.h.I(iArr, p10);
            }
        }
        return p10;
    }

    public static void d(int[] iArr, int[] iArr2) {
        bj.c.b(f25141a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k10 = bj.h.k();
        bj.h.y(iArr, iArr2, k10);
        k(k10, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.h.C(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && bj.n.u(16, iArr3, f25142b))) {
            int[] iArr4 = f25143c;
            if (bj.n.e(iArr4.length, iArr4, iArr3) == 0) {
                return;
            }
            bj.n.x(16, iArr3, iArr4.length);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            bj.h.H(f25141a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25141a;
        bj.h.H(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 8);
        } while (bj.n.B(8, iArr, f25141a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (bj.h.A(977, bj.h.z(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && bj.h.s(iArr2, f25141a))) {
            bj.n.b(8, 977, iArr2);
        }
    }

    public static void l(int i10, int[] iArr) {
        if ((i10 == 0 || bj.h.B(977, i10, iArr, 0) == 0) && (iArr[7] != -1 || !bj.h.s(iArr, f25141a))) {
            return;
        }
        bj.n.b(8, 977, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] k10 = bj.h.k();
        bj.h.F(iArr, k10);
        k(k10, iArr2);
    }

    public static void n(int[] iArr, int i10, int[] iArr2) {
        int[] k10 = bj.h.k();
        bj.h.F(iArr, k10);
        while (true) {
            k(k10, iArr2);
            i10--;
            if (i10 > 0) {
                bj.h.F(iArr2, k10);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.h.H(iArr, iArr2, iArr3) != 0) {
            bj.n.R(8, 977, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (bj.n.K(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && bj.h.s(iArr2, f25141a))) {
            bj.n.b(8, 977, iArr2);
        }
    }
}
