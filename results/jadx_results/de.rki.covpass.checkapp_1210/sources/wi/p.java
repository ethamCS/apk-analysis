package wi;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a */
    static final int[] f25234a = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: b */
    private static final int[] f25235b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f25236c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && bj.f.r(iArr3, f25234a))) {
            bj.n.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (bj.n.w(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && bj.f.r(iArr2, f25234a))) {
            bj.n.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] o10 = bj.f.o(bigInteger);
        if (o10[5] == -1) {
            int[] iArr = f25234a;
            if (bj.f.r(o10, iArr)) {
                bj.f.G(iArr, o10);
            }
        }
        return o10;
    }

    public static void d(int[] iArr, int[] iArr2) {
        bj.c.b(f25234a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j10 = bj.f.j();
        bj.f.x(iArr, iArr2, j10);
        k(j10, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.f.B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && bj.n.u(12, iArr3, f25235b))) {
            int[] iArr4 = f25236c;
            if (bj.n.e(iArr4.length, iArr4, iArr3) == 0) {
                return;
            }
            bj.n.x(12, iArr3, iArr4.length);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) == 0) {
            bj.f.F(f25234a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f25234a;
        bj.f.F(iArr3, iArr3, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            ak.l.n(bArr, 0, iArr, 0, 6);
        } while (bj.n.B(6, iArr, f25234a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (bj.f.z(4553, bj.f.y(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && bj.f.r(iArr2, f25234a))) {
            bj.n.b(6, 4553, iArr2);
        }
    }

    public static void l(int i10, int[] iArr) {
        if ((i10 == 0 || bj.f.A(4553, i10, iArr, 0) == 0) && (iArr[5] != -1 || !bj.f.r(iArr, f25234a))) {
            return;
        }
        bj.n.b(6, 4553, iArr);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] j10 = bj.f.j();
        bj.f.D(iArr, j10);
        k(j10, iArr2);
    }

    public static void n(int[] iArr, int i10, int[] iArr2) {
        int[] j10 = bj.f.j();
        bj.f.D(iArr, j10);
        while (true) {
            k(j10, iArr2);
            i10--;
            if (i10 > 0) {
                bj.f.D(iArr2, j10);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bj.f.F(iArr, iArr2, iArr3) != 0) {
            bj.n.R(6, 4553, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (bj.n.K(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && bj.f.r(iArr2, f25234a))) {
            bj.n.b(6, 4553, iArr2);
        }
    }
}
