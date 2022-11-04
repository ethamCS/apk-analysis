package ui;

import ak.l;
import bj.h;
import bj.n;
import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    static final int[] f23800a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b */
    private static final int[] f23801b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        h.a(iArr, iArr2, iArr3);
        if (h.s(iArr3, f23800a)) {
            q(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        n.w(8, iArr, iArr2);
        if (h.s(iArr2, f23800a)) {
            q(iArr2);
        }
    }

    private static int c(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = n.n(7, iArr, 1);
        }
        long j12 = j11 + (4294967295L & iArr[7]) + 2147483648L;
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] p10 = h.p(bigInteger);
        while (true) {
            int[] iArr = f23800a;
            if (h.s(p10, iArr)) {
                h.I(iArr, p10);
            } else {
                return p10;
            }
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        bj.c.b(f23800a, iArr, iArr2);
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
        h.C(iArr, iArr2, iArr3);
        if (n.u(16, iArr3, f23801b)) {
            p(iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) == 0) {
            h.H(f23800a, iArr, iArr2);
            return;
        }
        int[] iArr3 = f23800a;
        h.H(iArr3, iArr3, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            l.n(bArr, 0, iArr, 0, 8);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (n.B(8, iArr, f23800a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int i10 = iArr[7];
        n.J(8, iArr, 8, i10, iArr2, 0);
        int i11 = iArr2[7];
        iArr2[7] = (i11 & Integer.MAX_VALUE) + n.g(7, ((h.D(19, iArr, iArr2) << 1) + ((i11 >>> 31) - (i10 >>> 31))) * 19, iArr2);
        if (h.s(iArr2, f23800a)) {
            q(iArr2);
        }
    }

    public static void m(int i10, int[] iArr) {
        int i11 = iArr[7];
        iArr[7] = (i11 & Integer.MAX_VALUE) + n.g(7, ((i10 << 1) | (i11 >>> 31)) * 19, iArr);
        if (h.s(iArr, f23800a)) {
            q(iArr);
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

    private static int p(int[] iArr) {
        int[] iArr2 = f23801b;
        long j10 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = n.n(8, iArr, 1);
        }
        long j12 = j11 + (iArr[8] & 4294967295L) + 19;
        iArr[8] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            j13 = n.x(15, iArr, 9);
        }
        long j14 = j13 + ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1)));
        iArr[15] = (int) j14;
        return (int) (j14 >> 32);
    }

    private static int q(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = n.x(7, iArr, 1);
        }
        long j12 = j11 + ((4294967295L & iArr[7]) - 2147483648L);
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.H(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void s(int[] iArr, int[] iArr2) {
        n.K(8, iArr, 0, iArr2);
        if (h.s(iArr2, f23800a)) {
            q(iArr2);
        }
    }
}
