package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class f {
    public static int A(int i10, int i11, int[] iArr, int i12) {
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
        return n.y(6, iArr, i12, 3);
    }

    public static int B(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        long j10 = 4294967295L;
        long j11 = iArr2[0] & 4294967295L;
        long j12 = iArr2[1] & 4294967295L;
        long j13 = iArr2[2] & 4294967295L;
        long j14 = iArr2[3] & 4294967295L;
        long j15 = iArr2[4] & 4294967295L;
        long j16 = iArr2[5] & 4294967295L;
        long j17 = 0;
        while (i16 < 6) {
            long j18 = j16;
            long j19 = iArr[i16] & j10;
            long j20 = j11;
            long j21 = (j19 * j11) + (iArr3[i10] & j10) + 0;
            iArr3[i16 + 0] = (int) j21;
            int i17 = i16 + 1;
            long j22 = (j21 >>> 32) + (j19 * j12) + (iArr3[i17] & 4294967295L);
            iArr3[i17] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j13) + (iArr3[i11] & 4294967295L);
            iArr3[i16 + 2] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j14) + (iArr3[i12] & 4294967295L);
            iArr3[i16 + 3] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j15) + (iArr3[i13] & 4294967295L);
            iArr3[i16 + 4] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j18) + (iArr3[i14] & 4294967295L);
            iArr3[i16 + 5] = (int) j26;
            long j27 = (j26 >>> 32) + (iArr3[i15] & 4294967295L) + j17;
            iArr3[i16 + 6] = (int) j27;
            j17 = j27 >>> 32;
            i16 = i17;
            j10 = 4294967295L;
            j16 = j18;
            j11 = j20;
            j12 = j12;
            j13 = j13;
        }
        return (int) j17;
    }

    public static void C(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j10 = iArr[i10 + 0] & 4294967295L;
        int i21 = 0;
        int i22 = 12;
        int i23 = 5;
        while (true) {
            int i24 = i23 - 1;
            long j11 = iArr[i10 + i23] & 4294967295L;
            long j12 = j11 * j11;
            int i25 = i22 - 1;
            iArr2[i11 + i25] = (i21 << 31) | ((int) (j12 >>> 33));
            i22 = i25 - 1;
            iArr2[i11 + i22] = (int) (j12 >>> 1);
            i21 = (int) j12;
            if (i24 <= 0) {
                long j13 = j10 * j10;
                iArr2[i11 + 0] = (int) j13;
                long j14 = iArr[i10 + 1] & 4294967295L;
                long j15 = (((i21 << 31) & 4294967295L) | (j13 >>> 33)) + (j14 * j10);
                int i26 = (int) j15;
                iArr2[i11 + 1] = (i26 << 1) | (((int) (j13 >>> 32)) & 1);
                int i27 = i26 >>> 31;
                long j16 = (iArr2[i12] & 4294967295L) + (j15 >>> 32);
                long j17 = iArr[i10 + 2] & 4294967295L;
                long j18 = j16 + (j17 * j10);
                int i28 = (int) j18;
                iArr2[i11 + 2] = (i28 << 1) | i27;
                int i29 = i28 >>> 31;
                long j19 = (iArr2[i13] & 4294967295L) + (j18 >>> 32) + (j17 * j14);
                long j20 = (iArr2[i14] & 4294967295L) + (j19 >>> 32);
                long j21 = iArr[i10 + 3] & 4294967295L;
                long j22 = (iArr2[i15] & 4294967295L) + (j20 >>> 32);
                long j23 = (iArr2[i16] & 4294967295L) + (j22 >>> 32);
                long j24 = (j19 & 4294967295L) + (j21 * j10);
                int i30 = (int) j24;
                iArr2[i11 + 3] = (i30 << 1) | i29;
                long j25 = (j20 & 4294967295L) + (j24 >>> 32) + (j21 * j14);
                long j26 = (j22 & 4294967295L) + (j25 >>> 32) + (j21 * j17);
                long j27 = j23 + (j26 >>> 32);
                long j28 = j26 & 4294967295L;
                long j29 = iArr[i10 + 4] & 4294967295L;
                long j30 = (iArr2[i17] & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = (j25 & 4294967295L) + (j29 * j10);
                int i31 = (int) j32;
                iArr2[i11 + 4] = (i30 >>> 31) | (i31 << 1);
                int i32 = i31 >>> 31;
                long j33 = j28 + (j32 >>> 32) + (j29 * j14);
                long j34 = j31 + (j33 >>> 32) + (j29 * j17);
                long j35 = (j30 & 4294967295L) + (j34 >>> 32) + (j29 * j21);
                long j36 = (iArr2[i18] & 4294967295L) + (j30 >>> 32) + (j35 >>> 32);
                long j37 = j35 & 4294967295L;
                long j38 = iArr[i10 + 5] & 4294967295L;
                long j39 = (iArr2[i19] & 4294967295L) + (j36 >>> 32);
                long j40 = (j33 & 4294967295L) + (j10 * j38);
                int i33 = (int) j40;
                iArr2[i11 + 5] = (i33 << 1) | i32;
                long j41 = (j34 & 4294967295L) + (j40 >>> 32) + (j38 * j14);
                long j42 = j37 + (j41 >>> 32) + (j38 * j17);
                long j43 = (j36 & 4294967295L) + (j42 >>> 32) + (j38 * j21);
                long j44 = (j39 & 4294967295L) + (j43 >>> 32) + (j38 * j29);
                long j45 = (iArr2[i20] & 4294967295L) + (j39 >>> 32) + (j44 >>> 32);
                int i34 = (int) j41;
                iArr2[i11 + 6] = (i33 >>> 31) | (i34 << 1);
                int i35 = (int) j42;
                iArr2[i11 + 7] = (i34 >>> 31) | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j43;
                iArr2[i11 + 8] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j44;
                iArr2[i11 + 9] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = (int) j45;
                iArr2[i11 + 10] = i40 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = i11 + 11;
                iArr2[i43] = i42 | ((iArr2[i43] + ((int) (j45 >>> 32))) << 1);
                return;
            }
            i23 = i24;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 12;
        int i11 = 0;
        int i12 = 5;
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
                long j33 = (j27 & 4294967295L) + (j31 * j10);
                int i19 = (int) j33;
                iArr2[4] = (i18 >>> 31) | (i19 << 1);
                long j34 = j30 + (j33 >>> 32) + (j31 * j15);
                long j35 = (j29 & 4294967295L) + (j34 >>> 32) + (j31 * j18);
                long j36 = (j32 & 4294967295L) + (j35 >>> 32) + (j31 * j22);
                long j37 = (iArr2[8] & 4294967295L) + (j32 >>> 32) + (j36 >>> 32);
                long j38 = iArr[5] & 4294967295L;
                long j39 = (iArr2[9] & 4294967295L) + (j37 >>> 32);
                long j40 = (j34 & 4294967295L) + (j10 * j38);
                int i20 = (int) j40;
                iArr2[5] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long j41 = (j35 & 4294967295L) + (j40 >>> 32) + (j15 * j38);
                long j42 = (j36 & 4294967295L) + (j41 >>> 32) + (j38 * j18);
                long j43 = (j37 & 4294967295L) + (j42 >>> 32) + (j38 * j22);
                long j44 = (j39 & 4294967295L) + (j43 >>> 32) + (j38 * j31);
                long j45 = (iArr2[10] & 4294967295L) + (j39 >>> 32) + (j44 >>> 32);
                int i22 = (int) j41;
                iArr2[6] = i21 | (i22 << 1);
                int i23 = (int) j42;
                iArr2[7] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j43;
                iArr2[8] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j44;
                iArr2[9] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j45;
                iArr2[10] = i28 | (i29 << 1);
                iArr2[11] = (i29 >>> 31) | ((iArr2[11] + ((int) (j45 >>> 32))) << 1);
                return;
            }
            i12 = i13;
            i11 = i15;
        }
    }

    public static int E(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = ((iArr[i10 + 0] & 4294967295L) - (iArr2[i11 + 0] & 4294967295L)) + 0;
        iArr3[i12 + 0] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[i10 + 1] & 4294967295L) - (iArr2[i11 + 1] & 4294967295L));
        iArr3[i12 + 1] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[i10 + 2] & 4294967295L) - (iArr2[i11 + 2] & 4294967295L));
        iArr3[i12 + 2] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[i10 + 3] & 4294967295L) - (iArr2[i11 + 3] & 4294967295L));
        iArr3[i12 + 3] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[i10 + 4] & 4294967295L) - (iArr2[i11 + 4] & 4294967295L));
        iArr3[i12 + 4] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[i10 + 5] & 4294967295L) - (iArr2[i11 + 5] & 4294967295L));
        iArr3[i12 + 5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j15 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
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
        long j15 = (j14 >> 32) + ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5]));
        iArr2[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                ak.l.f(i11, bArr, (5 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i10 = 0; i10 < 3; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                ak.l.s(j10, bArr, (2 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

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
        return (int) (j15 >>> 32);
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
        return (int) (j15 >>> 32);
    }

    public static int c(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        int i13 = i11 + 0;
        long j10 = (i12 & 4294967295L) + (iArr[i10 + 0] & 4294967295L) + (iArr2[i13] & 4294967295L);
        iArr2[i13] = (int) j10;
        int i14 = i11 + 1;
        long j11 = (j10 >>> 32) + (iArr[i10 + 1] & 4294967295L) + (iArr2[i14] & 4294967295L);
        iArr2[i14] = (int) j11;
        int i15 = i11 + 2;
        long j12 = (j11 >>> 32) + (iArr[i10 + 2] & 4294967295L) + (iArr2[i15] & 4294967295L);
        iArr2[i15] = (int) j12;
        int i16 = i11 + 3;
        long j13 = (j12 >>> 32) + (iArr[i10 + 3] & 4294967295L) + (iArr2[i16] & 4294967295L);
        iArr2[i16] = (int) j13;
        int i17 = i11 + 4;
        long j14 = (j13 >>> 32) + (iArr[i10 + 4] & 4294967295L) + (iArr2[i17] & 4294967295L);
        iArr2[i17] = (int) j14;
        int i18 = i11 + 5;
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & 4294967295L) + (4294967295L & iArr2[i18]);
        iArr2[i18] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int d(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = i10 + 0;
        int i13 = i11 + 0;
        long j10 = (iArr[i12] & 4294967295L) + (iArr2[i13] & 4294967295L) + 0;
        int i14 = (int) j10;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i10 + 1;
        int i16 = i11 + 1;
        long j11 = (j10 >>> 32) + (iArr[i15] & 4294967295L) + (iArr2[i16] & 4294967295L);
        int i17 = (int) j11;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i10 + 2;
        int i19 = i11 + 2;
        long j12 = (j11 >>> 32) + (iArr[i18] & 4294967295L) + (iArr2[i19] & 4294967295L);
        int i20 = (int) j12;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        int i21 = i10 + 3;
        int i22 = i11 + 3;
        long j13 = (j12 >>> 32) + (iArr[i21] & 4294967295L) + (iArr2[i22] & 4294967295L);
        int i23 = (int) j13;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i10 + 4;
        int i25 = i11 + 4;
        long j14 = (j13 >>> 32) + (iArr[i24] & 4294967295L) + (iArr2[i25] & 4294967295L);
        int i26 = (int) j14;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        int i27 = i10 + 5;
        int i28 = i11 + 5;
        long j15 = (j14 >>> 32) + (iArr[i27] & 4294967295L) + (4294967295L & iArr2[i28]);
        int i29 = (int) j15;
        iArr[i27] = i29;
        iArr2[i28] = i29;
        return (int) (j15 >>> 32);
    }

    public static void e(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11 + 0] = iArr[i10 + 0];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
    }

    public static void f(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11 + 0] = jArr[i10 + 0];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
    }

    public static void g(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] h() {
        return new int[6];
    }

    public static long[] i() {
        return new long[3];
    }

    public static int[] j() {
        return new int[12];
    }

    public static long[] k() {
        return new long[6];
    }

    public static boolean l(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean q10 = q(iArr, i10, iArr2, i11);
        if (q10) {
            E(iArr, i10, iArr2, i11, iArr3, i12);
        } else {
            E(iArr2, i11, iArr, i10, iArr3, i12);
        }
        return q10;
    }

    public static boolean m(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr, long[] jArr2) {
        for (int i10 = 2; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] h10 = h();
        for (int i10 = 0; i10 < 6; i10++) {
            h10[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return h10;
    }

    public static int p(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            int i12 = i10 >> 5;
            if (i12 < 0 || i12 >= 6) {
                return 0;
            }
            i11 = iArr[i12] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean q(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 5; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
                return true;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr, int[] iArr2) {
        for (int i10 = 5; i10 >= 0; i10--) {
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

    public static boolean s(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(int[] iArr) {
        for (int i10 = 0; i10 < 6; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(long[] jArr) {
        for (int i10 = 0; i10 < 3; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void w(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10 = iArr2[i11 + 0] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr[i10 + 0] & 4294967295L;
        long j17 = (j16 * j10) + 0;
        iArr3[i12 + 0] = (int) j17;
        long j18 = (j17 >>> 32) + (j16 * j11);
        iArr3[i12 + 1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j12);
        iArr3[i12 + 2] = (int) j19;
        long j20 = (j19 >>> 32) + (j16 * j13);
        iArr3[i12 + 3] = (int) j20;
        long j21 = (j20 >>> 32) + (j16 * j14);
        iArr3[i12 + 4] = (int) j21;
        long j22 = (j21 >>> 32) + (j16 * j15);
        iArr3[i12 + 5] = (int) j22;
        iArr3[i12 + 6] = (int) (j22 >>> 32);
        int i19 = 1;
        int i20 = i12;
        int i21 = 1;
        while (i21 < 6) {
            i20 += i19;
            long j23 = iArr[i10 + i21] & 4294967295L;
            long j24 = (j23 * j10) + (iArr3[i13] & 4294967295L) + 0;
            iArr3[i20 + 0] = (int) j24;
            long j25 = j15;
            long j26 = (j24 >>> 32) + (j23 * j11) + (iArr3[i14] & 4294967295L);
            iArr3[i20 + 1] = (int) j26;
            long j27 = (j26 >>> 32) + (j23 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i20 + 2] = (int) j27;
            long j28 = (j27 >>> 32) + (j23 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i20 + 3] = (int) j28;
            long j29 = (j28 >>> 32) + (j23 * j14) + (iArr3[i17] & 4294967295L);
            iArr3[i20 + 4] = (int) j29;
            long j30 = (j29 >>> 32) + (j23 * j25) + (iArr3[i18] & 4294967295L);
            iArr3[i20 + 5] = (int) j30;
            iArr3[i20 + 6] = (int) (j30 >>> 32);
            i21++;
            j12 = j12;
            j15 = j25;
            i19 = 1;
        }
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr[0] & 4294967295L;
        long j17 = (j16 * j10) + 0;
        iArr3[0] = (int) j17;
        long j18 = (j17 >>> 32) + (j16 * j11);
        iArr3[1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j12);
        iArr3[2] = (int) j19;
        long j20 = (j19 >>> 32) + (j16 * j13);
        iArr3[3] = (int) j20;
        long j21 = (j20 >>> 32) + (j16 * j14);
        iArr3[4] = (int) j21;
        long j22 = (j21 >>> 32) + (j16 * j15);
        iArr3[5] = (int) j22;
        iArr3[6] = (int) (j22 >>> 32);
        int i15 = 1;
        for (int i16 = 6; i15 < i16; i16 = 6) {
            long j23 = iArr[i15] & 4294967295L;
            long j24 = (j23 * j10) + (iArr3[i10] & 4294967295L) + 0;
            iArr3[i15 + 0] = (int) j24;
            int i17 = i15 + 1;
            long j25 = j11;
            long j26 = (j24 >>> 32) + (j23 * j11) + (iArr3[i17] & 4294967295L);
            iArr3[i17] = (int) j26;
            long j27 = j15;
            long j28 = (j26 >>> 32) + (j23 * j12) + (iArr3[i11] & 4294967295L);
            iArr3[i15 + 2] = (int) j28;
            long j29 = (j28 >>> 32) + (j23 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i15 + 3] = (int) j29;
            long j30 = (j29 >>> 32) + (j23 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i15 + 4] = (int) j30;
            long j31 = (j30 >>> 32) + (j23 * j27) + (iArr3[i14] & 4294967295L);
            iArr3[i15 + 5] = (int) j31;
            iArr3[i15 + 6] = (int) (j31 >>> 32);
            i15 = i17;
            j10 = j10;
            j11 = j25;
            j15 = j27;
        }
    }

    public static long y(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j23 = (j21 >>> 32) + (j10 * j22) + j20 + (4294967295L & iArr2[i12 + 5]);
        iArr3[i13 + 5] = (int) j23;
        return (j23 >>> 32) + j22;
    }

    public static int z(int i10, long j10, int[] iArr, int i11) {
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
        return n.y(6, iArr, i11, 4);
    }
}
