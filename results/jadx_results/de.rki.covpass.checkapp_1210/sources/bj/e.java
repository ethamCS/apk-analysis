package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class e {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j14;
        return (int) (j14 >>> 32);
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
        long j14 = (j13 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static void c(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11 + 0] = iArr[i10 + 0];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
    }

    public static int[] d() {
        return new int[5];
    }

    public static int[] e() {
        return new int[10];
    }

    public static boolean f(int[] iArr, int[] iArr2) {
        for (int i10 = 4; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] g(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] d10 = d();
        for (int i10 = 0; i10 < 5; i10++) {
            d10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return d10;
    }

    public static int h(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 5) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        for (int i10 = 4; i10 >= 0; i10--) {
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

    public static boolean j(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr) {
        for (int i10 = 0; i10 < 5; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        int i10 = 1;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr[0] & 4294967295L;
        long j16 = (j15 * j10) + 0;
        iArr3[0] = (int) j16;
        long j17 = (j16 >>> 32) + (j15 * j11);
        iArr3[1] = (int) j17;
        long j18 = (j17 >>> 32) + (j15 * j12);
        iArr3[2] = (int) j18;
        long j19 = (j18 >>> 32) + (j15 * j13);
        iArr3[3] = (int) j19;
        long j20 = (j19 >>> 32) + (j15 * j14);
        iArr3[4] = (int) j20;
        iArr3[5] = (int) (j20 >>> 32);
        for (int i11 = 5; i10 < i11; i11 = 5) {
            long j21 = iArr[i10] & 4294967295L;
            int i12 = i10 + 0;
            long j22 = (j21 * j10) + (iArr3[i12] & 4294967295L) + 0;
            iArr3[i12] = (int) j22;
            int i13 = i10 + 1;
            long j23 = j11;
            long j24 = (j22 >>> 32) + (j21 * j11) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j24;
            int i14 = i10 + 2;
            long j25 = j14;
            long j26 = (j24 >>> 32) + (j21 * j12) + (iArr3[i14] & 4294967295L);
            iArr3[i14] = (int) j26;
            int i15 = i10 + 3;
            long j27 = (j26 >>> 32) + (j21 * j13) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j27;
            int i16 = i10 + 4;
            long j28 = (j27 >>> 32) + (j21 * j25) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j28;
            iArr3[i10 + 5] = (int) (j28 >>> 32);
            i10 = i13;
            j14 = j25;
            j10 = j10;
            j11 = j23;
        }
    }

    public static long m(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = i10 & 4294967295L;
        long j11 = iArr[i11 + 0] & 4294967295L;
        long j12 = (j10 * j11) + (iArr2[i12 + 0] & 4294967295L) + 0;
        iArr3[i13 + 0] = (int) j12;
        long j13 = iArr[i11 + 1] & 4294967295L;
        long j14 = (j12 >>> 32) + (j10 * j13) + j11 + (iArr2[i12 + 1] & 4294967295L);
        iArr3[i13 + 1] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = iArr[i11 + 2] & 4294967295L;
        long j17 = j15 + (j10 * j16) + j13 + (iArr2[i12 + 2] & 4294967295L);
        iArr3[i13 + 2] = (int) j17;
        long j18 = iArr[i11 + 3] & 4294967295L;
        long j19 = (j17 >>> 32) + (j10 * j18) + j16 + (iArr2[i12 + 3] & 4294967295L);
        iArr3[i13 + 3] = (int) j19;
        long j20 = iArr[i11 + 4] & 4294967295L;
        long j21 = (j19 >>> 32) + (j10 * j20) + j18 + (4294967295L & iArr2[i12 + 4]);
        iArr3[i13 + 4] = (int) j21;
        return (j21 >>> 32) + j20;
    }

    public static int n(int i10, long j10, int[] iArr, int i11) {
        long j11 = i10 & 4294967295L;
        long j12 = j10 & 4294967295L;
        int i12 = i11 + 0;
        long j13 = (j11 * j12) + (iArr[i12] & 4294967295L) + 0;
        iArr[i12] = (int) j13;
        long j14 = j10 >>> 32;
        long j15 = (j11 * j14) + j12;
        int i13 = i11 + 1;
        long j16 = (j13 >>> 32) + j15 + (iArr[i13] & 4294967295L);
        iArr[i13] = (int) j16;
        int i14 = i11 + 2;
        long j17 = (j16 >>> 32) + j14 + (iArr[i14] & 4294967295L);
        iArr[i14] = (int) j17;
        int i15 = i11 + 3;
        long j18 = (j17 >>> 32) + (4294967295L & iArr[i15]);
        iArr[i15] = (int) j18;
        if ((j18 >>> 32) == 0) {
            return 0;
        }
        return n.y(5, iArr, i11, 4);
    }

    public static int o(int i10, int i11, int[] iArr, int i12) {
        long j10 = i11 & 4294967295L;
        int i13 = i12 + 0;
        long j11 = ((i10 & 4294967295L) * j10) + (iArr[i13] & 4294967295L) + 0;
        iArr[i13] = (int) j11;
        int i14 = i12 + 1;
        long j12 = (j11 >>> 32) + j10 + (iArr[i14] & 4294967295L);
        iArr[i14] = (int) j12;
        long j13 = j12 >>> 32;
        int i15 = i12 + 2;
        long j14 = j13 + (iArr[i15] & 4294967295L);
        iArr[i15] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return n.y(5, iArr, i12, 3);
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        long j10 = 4294967295L;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = 0;
        while (i15 < 5) {
            long j17 = iArr[i15] & j10;
            long j18 = (j17 * j11) + (iArr3[i10] & j10) + 0;
            iArr3[i15 + 0] = (int) j18;
            int i16 = i15 + 1;
            long j19 = j12;
            long j20 = (j18 >>> 32) + (j17 * j12) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j20;
            long j21 = j13;
            long j22 = (j20 >>> 32) + (j17 * j13) + (iArr3[i11] & 4294967295L);
            iArr3[i15 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j17 * j14) + (iArr3[i12] & 4294967295L);
            iArr3[i15 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j17 * j15) + (iArr3[i13] & 4294967295L);
            iArr3[i15 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (iArr3[i14] & 4294967295L) + j16;
            iArr3[i15 + 5] = (int) j25;
            j16 = j25 >>> 32;
            i15 = i16;
            j10 = 4294967295L;
            j11 = j11;
            j13 = j21;
            j12 = j19;
        }
        return (int) j16;
    }

    public static int q(int i10, int i11, int[] iArr, int i12) {
        int i13 = i12 + 0;
        long j10 = ((i11 & 4294967295L) * (i10 & 4294967295L)) + (iArr[i13] & 4294967295L) + 0;
        iArr[i13] = (int) j10;
        int i14 = i12 + 1;
        long j11 = (j10 >>> 32) + (4294967295L & iArr[i14]);
        iArr[i14] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return n.y(5, iArr, i12, 2);
    }

    public static void r(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 10;
        int i11 = 0;
        int i12 = 4;
        while (true) {
            int i13 = i12 - 1;
            long j11 = iArr[i12] & 4294967295L;
            long j12 = j11 * j11;
            int i14 = i10 - 1;
            iArr2[i14] = (i11 << 31) | ((int) (j12 >>> 33));
            i10 = i14 - 1;
            iArr2[i10] = (int) (j12 >>> 1);
            int i15 = (int) j12;
            if (i13 <= 0) {
                long j13 = j10 * j10;
                long j14 = ((i15 << 31) & 4294967295L) | (j13 >>> 33);
                iArr2[0] = (int) j13;
                long j15 = iArr[1] & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i16 = (int) j16;
                iArr2[1] = (i16 << 1) | (((int) (j13 >>> 32)) & 1);
                long j17 = (iArr2[2] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[2] & 4294967295L;
                long j19 = j17 + (j18 * j10);
                int i17 = (int) j19;
                iArr2[2] = (i17 << 1) | (i16 >>> 31);
                int i18 = i17 >>> 31;
                long j20 = (iArr2[3] & 4294967295L) + (j19 >>> 32) + (j18 * j15);
                long j21 = (iArr2[4] & 4294967295L) + (j20 >>> 32);
                long j22 = iArr[3] & 4294967295L;
                long j23 = (iArr2[5] & 4294967295L) + (j21 >>> 32);
                long j24 = (iArr2[6] & 4294967295L) + (j23 >>> 32);
                long j25 = (j20 & 4294967295L) + (j22 * j10);
                int i19 = (int) j25;
                iArr2[3] = (i19 << 1) | i18;
                int i20 = i19 >>> 31;
                long j26 = (j21 & 4294967295L) + (j25 >>> 32) + (j22 * j15);
                long j27 = (j23 & 4294967295L) + (j26 >>> 32) + (j22 * j18);
                long j28 = j24 + (j27 >>> 32);
                long j29 = iArr[4] & 4294967295L;
                long j30 = (iArr2[7] & 4294967295L) + (j28 >>> 32);
                long j31 = (j26 & 4294967295L) + (j10 * j29);
                int i21 = (int) j31;
                iArr2[4] = (i21 << 1) | i20;
                long j32 = (j27 & 4294967295L) + (j31 >>> 32) + (j29 * j15);
                long j33 = (j28 & 4294967295L) + (j32 >>> 32) + (j29 * j18);
                long j34 = (4294967295L & j30) + (j33 >>> 32) + (j29 * j22);
                long j35 = (iArr2[8] & 4294967295L) + (j30 >>> 32) + (j34 >>> 32);
                int i22 = (int) j32;
                iArr2[5] = (i21 >>> 31) | (i22 << 1);
                int i23 = (int) j33;
                iArr2[6] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j34;
                iArr2[7] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j35;
                iArr2[8] = i26 | (i27 << 1);
                iArr2[9] = (i27 >>> 31) | ((iArr2[9] + ((int) (j35 >>> 32))) << 1);
                return;
            }
            i12 = i13;
            i11 = i15;
        }
    }

    public static int s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int t(int[] iArr, int[] iArr2) {
        long j10 = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + 0;
        iArr2[0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[4] & 4294967295L) - (4294967295L & iArr[4]));
        iArr2[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger u(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                ak.l.f(i11, bArr, (4 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
