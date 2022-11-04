package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class d {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static void c(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11 + 0] = iArr[i10 + 0];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
    }

    public static void d(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11 + 0] = jArr[i10 + 0];
        jArr2[i11 + 1] = jArr[i10 + 1];
    }

    public static void e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] f() {
        return new int[4];
    }

    public static long[] g() {
        return new long[2];
    }

    public static int[] h() {
        return new int[8];
    }

    public static long[] i() {
        return new long[4];
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, long[] jArr2) {
        for (int i10 = 1; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] l(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] f10 = f();
        for (int i10 = 0; i10 < 4; i10++) {
            f10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return f10;
    }

    public static int m(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 4) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean n(int[] iArr, int[] iArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 4; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 2; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean q(int[] iArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(long[] jArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        int i10 = 1;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr[0] & 4294967295L;
        long j15 = (j14 * j10) + 0;
        iArr3[0] = (int) j15;
        char c10 = ' ';
        long j16 = (j15 >>> 32) + (j14 * j11);
        iArr3[1] = (int) j16;
        long j17 = (j16 >>> 32) + (j14 * j12);
        iArr3[2] = (int) j17;
        long j18 = (j17 >>> 32) + (j14 * j13);
        iArr3[3] = (int) j18;
        iArr3[4] = (int) (j18 >>> 32);
        for (int i11 = 4; i10 < i11; i11 = 4) {
            long j19 = iArr[i10] & 4294967295L;
            int i12 = i10 + 0;
            int i13 = i10;
            long j20 = (j19 * j10) + (iArr3[i12] & 4294967295L) + 0;
            iArr3[i12] = (int) j20;
            int i14 = i13 + 1;
            long j21 = j10;
            long j22 = (j20 >>> c10) + (j19 * j11) + (iArr3[i14] & 4294967295L);
            iArr3[i14] = (int) j22;
            int i15 = i13 + 2;
            long j23 = (j22 >>> 32) + (j19 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j23;
            c10 = ' ';
            int i16 = i13 + 3;
            long j24 = (j23 >>> 32) + (j19 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j24;
            iArr3[i13 + 4] = (int) (j24 >>> 32);
            i10 = i14;
            j10 = j21;
            j11 = j11;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        long j10 = 4294967295L;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = 0;
        while (i14 < 4) {
            long j16 = iArr[i14] & j10;
            long j17 = (j16 * j11) + (iArr3[i10] & j10) + 0;
            iArr3[i14 + 0] = (int) j17;
            int i15 = i14 + 1;
            long j18 = (j17 >>> 32) + (j16 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j18;
            long j19 = (j18 >>> 32) + (j16 * j13) + (iArr3[i11] & 4294967295L);
            iArr3[i14 + 2] = (int) j19;
            long j20 = (j19 >>> 32) + (j16 * j14) + (iArr3[i12] & 4294967295L);
            iArr3[i14 + 3] = (int) j20;
            long j21 = j15 + (j20 >>> 32) + (iArr3[i13] & 4294967295L);
            iArr3[i14 + 4] = (int) j21;
            j15 = j21 >>> 32;
            i14 = i15;
            j10 = 4294967295L;
            j11 = j11;
            j12 = j12;
        }
        return (int) j15;
    }

    public static void u(int[] iArr, int[] iArr2) {
        long j10 = 4294967295L;
        long j11 = iArr[0] & 4294967295L;
        char c10 = 3;
        int i10 = 8;
        int i11 = 0;
        int i12 = 3;
        while (true) {
            int i13 = i12 - 1;
            long j12 = iArr[i12] & j10;
            long j13 = j12 * j12;
            int i14 = i10 - 1;
            iArr2[i14] = (i11 << 31) | ((int) (j13 >>> 33));
            i10 = i14 - 1;
            iArr2[i10] = (int) (j13 >>> 1);
            int i15 = (int) j13;
            if (i13 <= 0) {
                long j14 = j11 * j11;
                long j15 = ((i15 << 31) & j10) | (j14 >>> 33);
                iArr2[0] = (int) j14;
                long j16 = iArr[1] & j10;
                long j17 = j15 + (j16 * j11);
                int i16 = (int) j17;
                iArr2[1] = (i16 << 1) | (((int) (j14 >>> 32)) & 1);
                long j18 = (iArr2[2] & j10) + (j17 >>> 32);
                long j19 = iArr[2] & j10;
                long j20 = iArr2[c10] & j10;
                long j21 = iArr2[4] & j10;
                long j22 = j18 + (j19 * j11);
                int i17 = (int) j22;
                iArr2[2] = (i17 << 1) | (i16 >>> 31);
                long j23 = j20 + (j22 >>> 32) + (j19 * j16);
                long j24 = j21 + (j23 >>> 32);
                long j25 = iArr[3] & 4294967295L;
                long j26 = (iArr2[5] & 4294967295L) + (j24 >>> 32);
                long j27 = (j23 & 4294967295L) + (j11 * j25);
                int i18 = (int) j27;
                iArr2[3] = (i18 << 1) | (i17 >>> 31);
                long j28 = (j24 & 4294967295L) + (j27 >>> 32) + (j16 * j25);
                long j29 = (j26 & 4294967295L) + (j28 >>> 32) + (j25 * j19);
                long j30 = (iArr2[6] & 4294967295L) + (j26 >>> 32) + (j29 >>> 32);
                int i19 = (int) j28;
                iArr2[4] = (i18 >>> 31) | (i19 << 1);
                int i20 = (int) (4294967295L & j29);
                iArr2[5] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j30;
                iArr2[6] = i21 | (i22 << 1);
                iArr2[7] = (i22 >>> 31) | ((iArr2[7] + ((int) (j30 >>> 32))) << 1);
                return;
            }
            i12 = i13;
            i11 = i15;
            c10 = c10;
            j10 = j10;
        }
    }

    public static int v(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int w(int[] iArr, int[] iArr2) {
        long j10 = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[3] & 4294967295L) - (4294967295L & iArr[3]));
        iArr2[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static BigInteger x(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                ak.l.f(i11, bArr, (3 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger y(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 2; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                ak.l.s(j10, bArr, (1 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
