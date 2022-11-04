package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class x {

    /* renamed from: a */
    static final int[] f25302a = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: b */
    private static final int[] f25303b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f25304c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && bj.g.j(iArr3, f25302a))) {
            bj.n.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (bj.n.w(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && bj.g.j(iArr2, f25302a))) {
            bj.n.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] h10 = bj.g.h(bigInteger);
        if (h10[6] == -1 && bj.g.j(h10, f25302a)) {
            bj.n.b(7, 6803, h10);
        }
        return h10;
    }

    public static void d(int[] iArr, int[] iArr2) {
        bj.c.b(f25302a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f10 = bj.g.f();
        bj.g.m(iArr, iArr2, f10);
        k(f10, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.g.q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && bj.n.u(14, iArr3, f25303b))) {
            int[] iArr4 = f25304c;
            if (bj.n.e(iArr4.length, iArr4, iArr3) == 0) {
                return;
            }
            bj.n.x(14, iArr3, iArr4.length);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            bj.g.s(f25302a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25302a;
        bj.g.s(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 7);
        } while (bj.n.B(7, iArr, f25302a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (bj.g.o(6803, bj.g.n(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && bj.g.j(iArr2, f25302a))) {
            bj.n.b(7, 6803, iArr2);
        }
    }

    public static void l(int i10, int[] iArr) {
        if ((i10 == 0 || bj.g.p(6803, i10, iArr, 0) == 0) && (iArr[6] != -1 || !bj.g.j(iArr, f25302a))) {
            return;
        }
        bj.n.b(7, 6803, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] f10 = bj.g.f();
        bj.g.r(iArr, f10);
        k(f10, iArr2);
    }

    public static void n(int[] iArr, int i10, int[] iArr2) {
        int[] f10 = bj.g.f();
        bj.g.r(iArr, f10);
        while (true) {
            k(f10, iArr2);
            i10--;
            if (i10 > 0) {
                bj.g.r(iArr2, f10);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.g.s(iArr, iArr2, iArr3) != 0) {
            bj.n.R(7, 6803, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (bj.n.K(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && bj.g.j(iArr2, f25302a))) {
            bj.n.b(7, 6803, iArr2);
        }
    }
}
