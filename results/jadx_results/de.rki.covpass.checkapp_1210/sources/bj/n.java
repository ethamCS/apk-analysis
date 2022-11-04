package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class n {
    public static boolean A(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int B(int i10, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 + ((iArr[i11] & 4294967295L) - (4294967295L & iArr2[i11]))) >> 32;
        }
        return (int) j10;
    }

    public static int C(int i10, int i11, int[] iArr, int i12, int[] iArr2, int[] iArr3, int i13) {
        long j10 = i11 & 4294967295L;
        long j11 = i12 & 4294967295L;
        long j12 = 0;
        int i14 = 0;
        do {
            int i15 = i13 + i14;
            long j13 = j12 + ((iArr[i14] & 4294967295L) * j10) + ((iArr2[i14] & 4294967295L) * j11) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j13;
            j12 = j13 >>> 32;
            i14++;
        } while (i14 < i10);
        return (int) j12;
    }

    public static int D(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        int i11;
        long j10 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long E = j10 + (E(i10, iArr[i12], iArr2, 0, iArr3, i12) & 4294967295L) + (iArr3[i11] & 4294967295L);
            iArr3[i12 + i10] = (int) E;
            j10 = E >>> 32;
        }
        return (int) j10;
    }

    public static int E(int i10, int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j10 = i11 & 4294967295L;
        long j11 = 0;
        int i14 = 0;
        do {
            int i15 = i13 + i14;
            long j12 = j11 + ((iArr[i12 + i14] & 4294967295L) * j10) + (iArr2[i15] & 4294967295L);
            iArr2[i15] = (int) j12;
            j11 = j12 >>> 32;
            i14++;
        } while (i14 < i10);
        return (int) j11;
    }

    public static int F(int i10, int[] iArr, int i11) {
        while (true) {
            i10--;
            if (i10 >= 0) {
                int i12 = iArr[i10];
                iArr[i10] = (i11 << 31) | (i12 >>> 1);
                i11 = i12;
            } else {
                return i11 << 31;
            }
        }
    }

    public static int G(int i10, int[] iArr, int i11, int i12) {
        while (true) {
            i10--;
            if (i10 >= 0) {
                int i13 = iArr[i10];
                iArr[i10] = (i12 << (-i11)) | (i13 >>> i11);
                i12 = i13;
            } else {
                return i12 << (-i11);
            }
        }
    }

    public static int H(int i10, int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14) {
        while (true) {
            i10--;
            if (i10 >= 0) {
                int i15 = iArr[i11 + i10];
                iArr2[i14 + i10] = (i13 << (-i12)) | (i15 >>> i12);
                i13 = i15;
            } else {
                return i13 << (-i12);
            }
        }
    }

    public static int I(int i10, int[] iArr, int i11) {
        while (true) {
            i10--;
            if (i10 >= 0) {
                int i12 = iArr[i10];
                iArr[i10] = i11;
                i11 = i12;
            } else {
                return i11;
            }
        }
    }

    public static int J(int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13) {
        int i14 = 0;
        while (i14 < i10) {
            int i15 = iArr[i11 + i14];
            iArr2[i13 + i14] = (i12 >>> 31) | (i15 << 1);
            i14++;
            i12 = i15;
        }
        return i12 >>> 31;
    }

    public static int K(int i10, int[] iArr, int i11, int[] iArr2) {
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            iArr2[i12] = (i11 >>> 31) | (i13 << 1);
            i12++;
            i11 = i13;
        }
        return i11 >>> 31;
    }

    public static long L(int i10, long[] jArr, int i11, long j10, long[] jArr2, int i12) {
        int i13 = 0;
        while (i13 < i10) {
            long j11 = jArr[i11 + i13];
            jArr2[i12 + i13] = (j10 >>> 63) | (j11 << 1);
            i13++;
            j10 = j11;
        }
        return j10 >>> 63;
    }

    public static int M(int i10, int[] iArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = iArr[i13];
            iArr[i13] = (i12 >>> (-i11)) | (i14 << i11);
            i13++;
            i12 = i14;
        }
        return i12 >>> (-i11);
    }

    public static int N(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = iArr[i13];
            iArr2[i13] = (i12 >>> (-i11)) | (i14 << i11);
            i13++;
            i12 = i14;
        }
        return i12 >>> (-i11);
    }

    public static long O(int i10, long[] jArr, int i11, int i12, long j10) {
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i11 + i13;
            long j11 = jArr[i14];
            jArr[i14] = (j10 >>> (-i12)) | (j11 << i12);
            i13++;
            j10 = j11;
        }
        return j10 >>> (-i12);
    }

    public static long P(int i10, long[] jArr, int i11, int i12, long j10, long[] jArr2, int i13) {
        int i14 = 0;
        while (i14 < i10) {
            long j11 = jArr[i11 + i14];
            jArr2[i13 + i14] = (j10 >>> (-i12)) | (j11 << i12);
            i14++;
            j10 = j11;
        }
        return j10 >>> (-i12);
    }

    public static int Q(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = j10 + ((iArr[i11] & 4294967295L) - (4294967295L & iArr2[i11]));
            iArr3[i11] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int R(int i10, int i11, int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - (i11 & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = (j10 >> 32) + ((4294967295L & iArr[1]) - 1);
        iArr[1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return n(i10, iArr, 2);
    }

    public static int S(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + i13;
            long j11 = j10 + ((iArr2[i14] & 4294967295L) - (4294967295L & iArr[i11 + i13]));
            iArr2[i14] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int T(int i10, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = j10 + ((iArr2[i11] & 4294967295L) - (4294967295L & iArr[i11]));
            iArr2[i11] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int U(int i10, int i11, int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - (4294967295L & i11);
        iArr[0] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return n(i10, iArr, 1);
    }

    public static BigInteger V(int i10, int[] iArr) {
        byte[] bArr = new byte[i10 << 2];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                ak.l.f(i12, bArr, ((i10 - 1) - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void W(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = 0;
        }
    }

    public static void X(int i10, long[] jArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = 0;
        }
    }

    public static int a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = j10 + (iArr[i11] & 4294967295L) + (4294967295L & iArr2[i11]);
            iArr3[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int b(int i10, int i11, int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + (i11 & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = (j10 >>> 32) + (4294967295L & iArr[1]) + 1;
        iArr[1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return x(i10, iArr, 2);
    }

    public static int c(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = j10 + (iArr[i11] & 4294967295L) + (iArr2[i11] & 4294967295L) + (4294967295L & iArr3[i11]);
            iArr3[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int d(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + i13;
            long j11 = j10 + (iArr[i11 + i13] & 4294967295L) + (4294967295L & iArr2[i14]);
            iArr2[i14] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int e(int i10, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = j10 + (iArr[i11] & 4294967295L) + (4294967295L & iArr2[i11]);
            iArr2[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int f(int i10, int i11, int[] iArr, int i12) {
        long j10 = (i11 & 4294967295L) + (4294967295L & iArr[i12]);
        iArr[i12] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return x(i10, iArr, i12 + 1);
    }

    public static int g(int i10, int i11, int[] iArr) {
        long j10 = (i11 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return x(i10, iArr, 1);
    }

    public static int h(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (-(i11 & 1)) & 4294967295L;
        long j11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j12 = j11 + (iArr[i12] & 4294967295L) + (iArr2[i12] & j10);
            iArr3[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static int i(int i10, int[] iArr, int[] iArr2) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i11];
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
        }
        return 0;
    }

    public static void j(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        System.arraycopy(iArr, i11, iArr2, i12, i10);
    }

    public static int[] k(int i10) {
        return new int[i10];
    }

    public static long[] l(int i10) {
        return new long[i10];
    }

    public static int m(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int n(int i10, int[] iArr, int i11) {
        while (i11 < i10) {
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 != -1) {
                return 0;
            }
            i11++;
        }
        return -1;
    }

    public static boolean o(int i10, int[] iArr, int[] iArr2) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int p(int i10, int[] iArr, int i11) {
        int i12 = i11 ^ iArr[0];
        for (int i13 = 1; i13 < i10; i13++) {
            i12 |= iArr[i13];
        }
        return (((i12 >>> 1) | (i12 & 1)) - 1) >> 31;
    }

    public static int q(int i10, int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static int[] r(int i10, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
            throw new IllegalArgumentException();
        }
        int i11 = (i10 + 31) >> 5;
        int[] k10 = k(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            k10[i12] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return k10;
    }

    public static long[] s(int i10, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
            throw new IllegalArgumentException();
        }
        int i11 = (i10 + 63) >> 6;
        long[] l10 = l(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            l10[i12] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return l10;
    }

    public static int t(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= iArr.length) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean u(int i10, int[] iArr, int[] iArr2) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static int v(int i10, int[] iArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 >= r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        r6[r1] = r5[r1];
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(int r4, int[] r5, int[] r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            if (r1 >= r4) goto L18
            r3 = r5[r1]
            int r3 = r3 + r2
            r6[r1] = r3
            int r1 = r1 + 1
            if (r3 == 0) goto L2
        Le:
            if (r1 >= r4) goto L17
            r2 = r5[r1]
            r6[r1] = r2
            int r1 = r1 + 1
            goto Le
        L17:
            return r0
        L18:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.n.w(int, int[], int[]):int");
    }

    public static int x(int i10, int[] iArr, int i11) {
        while (i11 < i10) {
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
            i11++;
        }
        return 1;
    }

    public static int y(int i10, int[] iArr, int i11, int i12) {
        while (i12 < i10) {
            int i13 = i11 + i12;
            int i14 = iArr[i13] + 1;
            iArr[i13] = i14;
            if (i14 != 0) {
                return 0;
            }
            i12++;
        }
        return 1;
    }

    public static boolean z(int i10, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }
}
