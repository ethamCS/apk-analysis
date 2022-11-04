package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class g {
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
        long j15 = (j14 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
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
        long j15 = (j14 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void c(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11 + 0] = iArr[i10 + 0];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
    }

    public static void d(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] e() {
        return new int[7];
    }

    public static int[] f() {
        return new int[14];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] h(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] e10 = e();
        for (int i10 = 0; i10 < 7; i10++) {
            e10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return e10;
    }

    public static int i(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 7) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
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

    public static boolean k(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(int[] iArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr[0] & 4294967295L;
        long j18 = (j17 * j10) + 0;
        iArr3[0] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j11);
        iArr3[1] = (int) j19;
        long j20 = (j19 >>> 32) + (j17 * j12);
        iArr3[2] = (int) j20;
        long j21 = (j20 >>> 32) + (j17 * j13);
        iArr3[3] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[4] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[5] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[6] = (int) j24;
        iArr3[7] = (int) (j24 >>> 32);
        int i16 = 1;
        for (int i17 = 7; i16 < i17; i17 = 7) {
            long j25 = iArr[i16] & 4294967295L;
            long j26 = (j25 * j10) + (iArr3[i10] & 4294967295L) + 0;
            iArr3[i16 + 0] = (int) j26;
            int i18 = i16 + 1;
            long j27 = j11;
            long j28 = (j26 >>> 32) + (j25 * j11) + (iArr3[i18] & 4294967295L);
            iArr3[i18] = (int) j28;
            long j29 = j15;
            long j30 = (j28 >>> 32) + (j25 * j12) + (iArr3[i11] & 4294967295L);
            iArr3[i16 + 2] = (int) j30;
            long j31 = (j30 >>> 32) + (j25 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i16 + 3] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i16 + 4] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j29) + (iArr3[i14] & 4294967295L);
            iArr3[i16 + 5] = (int) j33;
            long j34 = (j33 >>> 32) + (j25 * j16) + (iArr3[i15] & 4294967295L);
            iArr3[i16 + 6] = (int) j34;
            iArr3[i16 + 7] = (int) (j34 >>> 32);
            i16 = i18;
            j10 = j10;
            j11 = j27;
            j15 = j29;
        }
    }

    public static long n(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j21 = (j19 >>> 32) + (j10 * j20) + j18 + (iArr2[i12 + 4] & 4294967295L);
        iArr3[i13 + 4] = (int) j21;
        long j22 = iArr[i11 + 5] & 4294967295L;
        long j23 = (j21 >>> 32) + (j10 * j22) + j20 + (iArr2[i12 + 5] & 4294967295L);
        iArr3[i13 + 5] = (int) j23;
        long j24 = iArr[i11 + 6] & 4294967295L;
        long j25 = (j23 >>> 32) + (j10 * j24) + j22 + (4294967295L & iArr2[i12 + 6]);
        iArr3[i13 + 6] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int o(int i10, long j10, int[] iArr, int i11) {
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
        return n.y(7, iArr, i11, 4);
    }

    public static int p(int i10, int i11, int[] iArr, int i12) {
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
        return n.y(7, iArr, i12, 3);
    }

    public static int q(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = 0;
        int i17 = 0;
        while (i17 < 7) {
            long j18 = j16;
            long j19 = iArr[i17] & 4294967295L;
            long j20 = j15;
            long j21 = (j19 * j10) + (iArr3[i10] & 4294967295L) + 0;
            iArr3[i17 + 0] = (int) j21;
            int i18 = i17 + 1;
            long j22 = j11;
            long j23 = (j21 >>> 32) + (j19 * j11) + (iArr3[i18] & 4294967295L);
            iArr3[i18] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j12) + (iArr3[i11] & 4294967295L);
            iArr3[i17 + 2] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i17 + 3] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i17 + 4] = (int) j26;
            long j27 = (j26 >>> 32) + (j19 * j20) + (iArr3[i14] & 4294967295L);
            iArr3[i17 + 5] = (int) j27;
            long j28 = (j27 >>> 32) + (j19 * j18) + (iArr3[i15] & 4294967295L);
            iArr3[i17 + 6] = (int) j28;
            long j29 = (j28 >>> 32) + (iArr3[i16] & 4294967295L) + j17;
            iArr3[i17 + 7] = (int) j29;
            j17 = j29 >>> 32;
            i17 = i18;
            j16 = j18;
            j15 = j20;
            j11 = j22;
        }
        return (int) j17;
    }

    public static void r(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 14;
        int i11 = 0;
        int i12 = 6;
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
                long j20 = (iArr2[3] & 4294967295L) + (j19 >>> 32) + (j18 * j15);
                long j21 = (iArr2[4] & 4294967295L) + (j20 >>> 32);
                long j22 = iArr[3] & 4294967295L;
                long j23 = (iArr2[5] & 4294967295L) + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = (iArr2[6] & 4294967295L) + (j23 >>> 32);
                long j26 = (j20 & 4294967295L) + (j22 * j10);
                int i18 = (int) j26;
                iArr2[3] = (i18 << 1) | (i17 >>> 31);
                long j27 = j24 + (j26 >>> 32) + (j22 * j15);
                long j28 = (j23 & 4294967295L) + (j27 >>> 32) + (j22 * j18);
                long j29 = j25 + (j28 >>> 32);
                long j30 = j28 & 4294967295L;
                long j31 = iArr[4] & 4294967295L;
                long j32 = (iArr2[7] & 4294967295L) + (j29 >>> 32);
                long j33 = j29 & 4294967295L;
                long j34 = (iArr2[8] & 4294967295L) + (j32 >>> 32);
                long j35 = (j27 & 4294967295L) + (j31 * j10);
                int i19 = (int) j35;
                iArr2[4] = (i18 >>> 31) | (i19 << 1);
                long j36 = j30 + (j35 >>> 32) + (j31 * j15);
                long j37 = j33 + (j36 >>> 32) + (j31 * j18);
                long j38 = (j32 & 4294967295L) + (j37 >>> 32) + (j31 * j22);
                long j39 = j34 + (j38 >>> 32);
                long j40 = iArr[5] & 4294967295L;
                long j41 = (iArr2[9] & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                long j43 = (iArr2[10] & 4294967295L) + (j41 >>> 32);
                long j44 = (j36 & 4294967295L) + (j40 * j10);
                int i20 = (int) j44;
                iArr2[5] = (i20 << 1) | (i19 >>> 31);
                long j45 = (j37 & 4294967295L) + (j44 >>> 32) + (j40 * j15);
                long j46 = (j38 & 4294967295L) + (j45 >>> 32) + (j40 * j18);
                long j47 = j42 + (j46 >>> 32) + (j40 * j22);
                long j48 = (j41 & 4294967295L) + (j47 >>> 32) + (j40 * j31);
                long j49 = j43 + (j48 >>> 32);
                long j50 = j48 & 4294967295L;
                long j51 = iArr[6] & 4294967295L;
                long j52 = (iArr2[11] & 4294967295L) + (j49 >>> 32);
                long j53 = (j45 & 4294967295L) + (j10 * j51);
                int i21 = (int) j53;
                iArr2[6] = (i20 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                long j54 = (j46 & 4294967295L) + (j53 >>> 32) + (j15 * j51);
                long j55 = (j47 & 4294967295L) + (j54 >>> 32) + (j51 * j18);
                long j56 = j50 + (j55 >>> 32) + (j51 * j22);
                long j57 = (j49 & 4294967295L) + (j56 >>> 32) + (j51 * j31);
                long j58 = (j52 & 4294967295L) + (j57 >>> 32) + (j51 * j40);
                long j59 = (iArr2[12] & 4294967295L) + (j52 >>> 32) + (j58 >>> 32);
                int i23 = (int) j54;
                iArr2[7] = i22 | (i23 << 1);
                int i24 = (int) j55;
                iArr2[8] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j56;
                iArr2[9] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j57;
                iArr2[10] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j58;
                iArr2[11] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j59;
                iArr2[12] = i31 | (i32 << 1);
                iArr2[13] = (i32 >>> 31) | ((iArr2[13] + ((int) (j59 >>> 32))) << 1);
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
        long j15 = (j14 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
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
        long j14 = (j13 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6]));
        iArr2[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger u(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                ak.l.f(i11, bArr, (6 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
