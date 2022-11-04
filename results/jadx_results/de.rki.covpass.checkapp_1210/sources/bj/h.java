package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class h {
    public static int A(int i10, long j10, int[] iArr, int i11) {
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
        return n.y(8, iArr, i11, 4);
    }

    public static int B(int i10, int i11, int[] iArr, int i12) {
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
        return n.y(8, iArr, i12, 3);
    }

    public static int C(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr2[7] & 4294967295L;
        long j18 = 0;
        int i18 = 0;
        while (i18 < 8) {
            long j19 = j17;
            long j20 = iArr[i18] & 4294967295L;
            long j21 = j15;
            long j22 = (j20 * j10) + (iArr3[i10] & 4294967295L) + 0;
            iArr3[i18 + 0] = (int) j22;
            int i19 = i18 + 1;
            long j23 = j11;
            long j24 = (j22 >>> 32) + (j20 * j11) + (iArr3[i19] & 4294967295L);
            iArr3[i19] = (int) j24;
            long j25 = (j24 >>> 32) + (j20 * j12) + (iArr3[i11] & 4294967295L);
            iArr3[i18 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j20 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i18 + 3] = (int) j26;
            long j27 = (j26 >>> 32) + (j20 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i18 + 4] = (int) j27;
            long j28 = (j27 >>> 32) + (j20 * j21) + (iArr3[i14] & 4294967295L);
            iArr3[i18 + 5] = (int) j28;
            long j29 = (j28 >>> 32) + (j20 * j16) + (iArr3[i15] & 4294967295L);
            iArr3[i18 + 6] = (int) j29;
            long j30 = (j29 >>> 32) + (j20 * j19) + (iArr3[i16] & 4294967295L);
            iArr3[i18 + 7] = (int) j30;
            long j31 = (j30 >>> 32) + (iArr3[i17] & 4294967295L) + j18;
            iArr3[i18 + 8] = (int) j31;
            j18 = j31 >>> 32;
            i18 = i19;
            j17 = j19;
            j15 = j21;
            j11 = j23;
        }
        return (int) j18;
    }

    public static int D(int i10, int[] iArr, int[] iArr2) {
        long j10 = i10 & 4294967295L;
        long j11 = ((iArr2[0] & 4294967295L) * j10) + (iArr[0] & 4294967295L) + 0;
        iArr2[0] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr2[1] & 4294967295L) * j10) + (iArr[1] & 4294967295L);
        iArr2[1] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr2[2] & 4294967295L) * j10) + (iArr[2] & 4294967295L);
        iArr2[2] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr2[3] & 4294967295L) * j10) + (iArr[3] & 4294967295L);
        iArr2[3] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr2[4] & 4294967295L) * j10) + (iArr[4] & 4294967295L);
        iArr2[4] = (int) j15;
        long j16 = (j15 >>> 32) + ((iArr2[5] & 4294967295L) * j10) + (iArr[5] & 4294967295L);
        iArr2[5] = (int) j16;
        long j17 = (j16 >>> 32) + ((iArr2[6] & 4294967295L) * j10) + (iArr[6] & 4294967295L);
        iArr2[6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static void E(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        long j10 = iArr[i10 + 0] & 4294967295L;
        int i25 = 0;
        int i26 = 16;
        int i27 = 7;
        while (true) {
            int i28 = i27 - 1;
            long j11 = iArr[i10 + i27] & 4294967295L;
            long j12 = j11 * j11;
            int i29 = i26 - 1;
            iArr2[i11 + i29] = (i25 << 31) | ((int) (j12 >>> 33));
            i26 = i29 - 1;
            iArr2[i11 + i26] = (int) (j12 >>> 1);
            i25 = (int) j12;
            if (i28 <= 0) {
                long j13 = j10 * j10;
                iArr2[i11 + 0] = (int) j13;
                long j14 = iArr[i10 + 1] & 4294967295L;
                long j15 = (((i25 << 31) & 4294967295L) | (j13 >>> 33)) + (j14 * j10);
                int i30 = (int) j15;
                iArr2[i11 + 1] = (i30 << 1) | (((int) (j13 >>> 32)) & 1);
                int i31 = i30 >>> 31;
                long j16 = (iArr2[i12] & 4294967295L) + (j15 >>> 32);
                long j17 = iArr[i10 + 2] & 4294967295L;
                long j18 = j16 + (j17 * j10);
                int i32 = (int) j18;
                iArr2[i11 + 2] = (i32 << 1) | i31;
                int i33 = i32 >>> 31;
                long j19 = (iArr2[i13] & 4294967295L) + (j18 >>> 32) + (j17 * j14);
                long j20 = (iArr2[i14] & 4294967295L) + (j19 >>> 32);
                long j21 = iArr[i10 + 3] & 4294967295L;
                long j22 = (iArr2[i15] & 4294967295L) + (j20 >>> 32);
                long j23 = (iArr2[i16] & 4294967295L) + (j22 >>> 32);
                long j24 = (j19 & 4294967295L) + (j21 * j10);
                int i34 = (int) j24;
                iArr2[i11 + 3] = (i34 << 1) | i33;
                long j25 = (j20 & 4294967295L) + (j24 >>> 32) + (j21 * j14);
                long j26 = (j22 & 4294967295L) + (j25 >>> 32) + (j21 * j17);
                long j27 = j23 + (j26 >>> 32);
                long j28 = j26 & 4294967295L;
                long j29 = iArr[i10 + 4] & 4294967295L;
                long j30 = (iArr2[i17] & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = (j25 & 4294967295L) + (j29 * j10);
                int i35 = (int) j32;
                iArr2[i11 + 4] = (i34 >>> 31) | (i35 << 1);
                int i36 = i35 >>> 31;
                long j33 = j28 + (j32 >>> 32) + (j29 * j14);
                long j34 = j31 + (j33 >>> 32) + (j29 * j17);
                long j35 = (j30 & 4294967295L) + (j34 >>> 32) + (j29 * j21);
                long j36 = (iArr2[i18] & 4294967295L) + (j30 >>> 32) + (j35 >>> 32);
                long j37 = j35 & 4294967295L;
                long j38 = iArr[i10 + 5] & 4294967295L;
                long j39 = (iArr2[i19] & 4294967295L) + (j36 >>> 32);
                long j40 = (j33 & 4294967295L) + (j38 * j10);
                int i37 = (int) j40;
                iArr2[i11 + 5] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                long j41 = (j34 & 4294967295L) + (j40 >>> 32) + (j38 * j14);
                long j42 = j37 + (j41 >>> 32) + (j38 * j17);
                long j43 = (j36 & 4294967295L) + (j42 >>> 32) + (j38 * j21);
                long j44 = (j39 & 4294967295L) + (j43 >>> 32) + (j38 * j29);
                long j45 = j43 & 4294967295L;
                long j46 = (iArr2[i20] & 4294967295L) + (j39 >>> 32) + (j44 >>> 32);
                long j47 = j44 & 4294967295L;
                long j48 = iArr[i10 + 6] & 4294967295L;
                long j49 = (iArr2[i21] & 4294967295L) + (j46 >>> 32);
                long j50 = j46 & 4294967295L;
                long j51 = (iArr2[i22] & 4294967295L) + (j49 >>> 32);
                long j52 = (j41 & 4294967295L) + (j48 * j10);
                int i39 = (int) j52;
                iArr2[i11 + 6] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                long j53 = (j42 & 4294967295L) + (j52 >>> 32) + (j48 * j14);
                long j54 = j45 + (j53 >>> 32) + (j48 * j17);
                long j55 = j47 + (j54 >>> 32) + (j48 * j21);
                long j56 = j54 & 4294967295L;
                long j57 = j50 + (j55 >>> 32) + (j48 * j29);
                long j58 = (j49 & 4294967295L) + (j57 >>> 32) + (j48 * j38);
                long j59 = j51 + (j58 >>> 32);
                long j60 = j58 & 4294967295L;
                long j61 = iArr[i10 + 7] & 4294967295L;
                long j62 = (iArr2[i23] & 4294967295L) + (j59 >>> 32);
                long j63 = (j53 & 4294967295L) + (j10 * j61);
                int i41 = (int) j63;
                iArr2[i11 + 7] = (i41 << 1) | i40;
                long j64 = j56 + (j63 >>> 32) + (j61 * j14);
                long j65 = (j55 & 4294967295L) + (j64 >>> 32) + (j61 * j17);
                long j66 = (j57 & 4294967295L) + (j65 >>> 32) + (j61 * j21);
                long j67 = j60 + (j66 >>> 32) + (j61 * j29);
                long j68 = (j59 & 4294967295L) + (j67 >>> 32) + (j61 * j38);
                long j69 = (j62 & 4294967295L) + (j68 >>> 32) + (j61 * j48);
                long j70 = (iArr2[i24] & 4294967295L) + (j62 >>> 32) + (j69 >>> 32);
                int i42 = (int) j64;
                iArr2[i11 + 8] = (i41 >>> 31) | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = (int) j65;
                iArr2[i11 + 9] = i43 | (i44 << 1);
                int i45 = i44 >>> 31;
                int i46 = (int) j66;
                iArr2[i11 + 10] = i45 | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j67;
                iArr2[i11 + 11] = i47 | (i48 << 1);
                int i49 = i48 >>> 31;
                int i50 = (int) j68;
                iArr2[i11 + 12] = i49 | (i50 << 1);
                int i51 = i50 >>> 31;
                int i52 = (int) j69;
                iArr2[i11 + 13] = i51 | (i52 << 1);
                int i53 = i52 >>> 31;
                int i54 = (int) j70;
                iArr2[i11 + 14] = i53 | (i54 << 1);
                int i55 = i54 >>> 31;
                int i56 = i11 + 15;
                iArr2[i56] = i55 | ((iArr2[i56] + ((int) (j70 >>> 32))) << 1);
                return;
            }
            i27 = i28;
        }
    }

    public static void F(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 16;
        int i11 = 0;
        int i12 = 7;
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
                int i20 = i19 >>> 31;
                long j34 = j30 + (j33 >>> 32) + (j31 * j15);
                long j35 = (j29 & 4294967295L) + (j34 >>> 32) + (j31 * j18);
                long j36 = (j32 & 4294967295L) + (j35 >>> 32) + (j31 * j22);
                long j37 = (iArr2[8] & 4294967295L) + (j32 >>> 32) + (j36 >>> 32);
                long j38 = j36 & 4294967295L;
                long j39 = iArr[5] & 4294967295L;
                long j40 = (iArr2[9] & 4294967295L) + (j37 >>> 32);
                long j41 = j37 & 4294967295L;
                long j42 = (iArr2[10] & 4294967295L) + (j40 >>> 32);
                long j43 = (j34 & 4294967295L) + (j39 * j10);
                int i21 = (int) j43;
                iArr2[5] = (i21 << 1) | i20;
                long j44 = (j35 & 4294967295L) + (j43 >>> 32) + (j39 * j15);
                long j45 = j38 + (j44 >>> 32) + (j39 * j18);
                long j46 = j41 + (j45 >>> 32) + (j39 * j22);
                long j47 = (j40 & 4294967295L) + (j46 >>> 32) + (j39 * j31);
                long j48 = j42 + (j47 >>> 32);
                long j49 = iArr[6] & 4294967295L;
                long j50 = (iArr2[11] & 4294967295L) + (j48 >>> 32);
                long j51 = j48 & 4294967295L;
                long j52 = (iArr2[12] & 4294967295L) + (j50 >>> 32);
                long j53 = (j44 & 4294967295L) + (j49 * j10);
                int i22 = (int) j53;
                iArr2[6] = (i22 << 1) | (i21 >>> 31);
                long j54 = (j45 & 4294967295L) + (j53 >>> 32) + (j49 * j15);
                long j55 = (j46 & 4294967295L) + (j54 >>> 32) + (j49 * j18);
                long j56 = (j47 & 4294967295L) + (j55 >>> 32) + (j49 * j22);
                long j57 = j51 + (j56 >>> 32) + (j49 * j31);
                long j58 = (j50 & 4294967295L) + (j57 >>> 32) + (j49 * j39);
                long j59 = j52 + (j58 >>> 32);
                long j60 = j58 & 4294967295L;
                long j61 = iArr[7] & 4294967295L;
                long j62 = (iArr2[13] & 4294967295L) + (j59 >>> 32);
                long j63 = (j54 & 4294967295L) + (j10 * j61);
                int i23 = (int) j63;
                iArr2[7] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                long j64 = (j55 & 4294967295L) + (j63 >>> 32) + (j15 * j61);
                long j65 = (j56 & 4294967295L) + (j64 >>> 32) + (j61 * j18);
                long j66 = (j57 & 4294967295L) + (j65 >>> 32) + (j61 * j22);
                long j67 = j60 + (j66 >>> 32) + (j61 * j31);
                long j68 = (j59 & 4294967295L) + (j67 >>> 32) + (j61 * j39);
                long j69 = (j62 & 4294967295L) + (j68 >>> 32) + (j61 * j49);
                long j70 = (iArr2[14] & 4294967295L) + (j62 >>> 32) + (j69 >>> 32);
                int i25 = (int) j64;
                iArr2[8] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j65;
                iArr2[9] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j66;
                iArr2[10] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j67;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j68;
                iArr2[12] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j69;
                iArr2[13] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j70;
                iArr2[14] = i36 | (i37 << 1);
                iArr2[15] = (i37 >>> 31) | ((iArr2[15] + ((int) (j70 >>> 32))) << 1);
                return;
            }
            i12 = i13;
            i11 = i15;
        }
    }

    public static int G(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
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
        long j16 = (j15 >> 32) + ((iArr[i10 + 6] & 4294967295L) - (iArr2[i11 + 6] & 4294967295L));
        iArr3[i12 + 6] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr[i10 + 7] & 4294967295L) - (iArr2[i11 + 7] & 4294967295L));
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int H(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j17 = (j16 >> 32) + ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int I(int[] iArr, int[] iArr2) {
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
        long j16 = (j15 >> 32) + ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L));
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7]));
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger J(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                ak.l.f(i11, bArr, (7 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger K(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 4; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                ak.l.s(j10, bArr, (3 - i10) << 3);
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
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j17 = (j16 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j15 = (j14 >>> 32) + (iArr[i10 + 5] & 4294967295L) + (iArr2[i18] & 4294967295L);
        iArr2[i18] = (int) j15;
        int i19 = i11 + 6;
        long j16 = (j15 >>> 32) + (iArr[i10 + 6] & 4294967295L) + (iArr2[i19] & 4294967295L);
        iArr2[i19] = (int) j16;
        int i20 = i11 + 7;
        long j17 = (j16 >>> 32) + (iArr[i10 + 7] & 4294967295L) + (4294967295L & iArr2[i20]);
        iArr2[i20] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr2[0] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr2[1] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr2[2] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr2[3] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr2[4] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr2[5] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr2[6] = (int) j16;
        long j17 = (j16 >>> 32) + (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int e(int[] iArr, int i10, int[] iArr2, int i11) {
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
        long j15 = (j14 >>> 32) + (iArr[i27] & 4294967295L) + (iArr2[i28] & 4294967295L);
        int i29 = (int) j15;
        iArr[i27] = i29;
        iArr2[i28] = i29;
        int i30 = i10 + 6;
        int i31 = i11 + 6;
        long j16 = (j15 >>> 32) + (iArr[i30] & 4294967295L) + (iArr2[i31] & 4294967295L);
        int i32 = (int) j16;
        iArr[i30] = i32;
        iArr2[i31] = i32;
        int i33 = i10 + 7;
        int i34 = i11 + 7;
        long j17 = (j16 >>> 32) + (iArr[i33] & 4294967295L) + (4294967295L & iArr2[i34]);
        int i35 = (int) j17;
        iArr[i33] = i35;
        iArr2[i34] = i35;
        return (int) (j17 >>> 32);
    }

    public static void f(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11 + 0] = iArr[i10 + 0];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
        iArr2[i11 + 7] = iArr[i10 + 7];
    }

    public static void g(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11 + 0] = jArr[i10 + 0];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
        jArr2[i11 + 3] = jArr[i10 + 3];
    }

    public static void h(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] i() {
        return new int[8];
    }

    public static long[] j() {
        return new long[4];
    }

    public static int[] k() {
        return new int[16];
    }

    public static long[] l() {
        return new long[8];
    }

    public static boolean m(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean r10 = r(iArr, i10, iArr2, i11);
        if (r10) {
            G(iArr, i10, iArr2, i11, iArr3, i12);
        } else {
            G(iArr2, i11, iArr, i10, iArr3, i12);
        }
        return r10;
    }

    public static boolean n(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(long[] jArr, long[] jArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] p(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] i10 = i();
        for (int i11 = 0; i11 < 8; i11++) {
            i10[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return i10;
    }

    public static int q(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else if ((i10 & 255) != i10) {
            return 0;
        } else {
            i11 = iArr[i10 >>> 5] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean r(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 7; i12 >= 0; i12--) {
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

    public static boolean s(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
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

    public static boolean t(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(long[] jArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void x(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j10 = iArr2[i11 + 0] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr2[i11 + 6] & 4294967295L;
        long j17 = iArr[i10 + 0] & 4294967295L;
        long j18 = (j17 * j10) + 0;
        iArr3[i12 + 0] = (int) j18;
        long j19 = (j18 >>> 32) + (j17 * j11);
        iArr3[i12 + 1] = (int) j19;
        long j20 = (j19 >>> 32) + (j17 * j12);
        iArr3[i12 + 2] = (int) j20;
        long j21 = (j20 >>> 32) + (j17 * j13);
        iArr3[i12 + 3] = (int) j21;
        long j22 = (j21 >>> 32) + (j17 * j14);
        iArr3[i12 + 4] = (int) j22;
        long j23 = (j22 >>> 32) + (j17 * j15);
        iArr3[i12 + 5] = (int) j23;
        long j24 = (j23 >>> 32) + (j17 * j16);
        iArr3[i12 + 6] = (int) j24;
        long j25 = iArr2[i11 + 7] & 4294967295L;
        long j26 = (j24 >>> 32) + (j17 * j25);
        iArr3[i12 + 7] = (int) j26;
        iArr3[i12 + 8] = (int) (j26 >>> 32);
        int i21 = 1;
        int i22 = i12;
        int i23 = 1;
        while (i23 < 8) {
            i22 += i21;
            long j27 = iArr[i10 + i23] & 4294967295L;
            long j28 = (j27 * j10) + (iArr3[i13] & 4294967295L) + 0;
            iArr3[i22 + 0] = (int) j28;
            long j29 = j25;
            long j30 = (j28 >>> 32) + (j27 * j11) + (iArr3[i14] & 4294967295L);
            iArr3[i22 + 1] = (int) j30;
            long j31 = j12;
            long j32 = (j30 >>> 32) + (j27 * j12) + (iArr3[i15] & 4294967295L);
            iArr3[i22 + 2] = (int) j32;
            long j33 = (j32 >>> 32) + (j27 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i22 + 3] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j14) + (iArr3[i17] & 4294967295L);
            iArr3[i22 + 4] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j15) + (iArr3[i18] & 4294967295L);
            iArr3[i22 + 5] = (int) j35;
            long j36 = (j35 >>> 32) + (j27 * j16) + (iArr3[i19] & 4294967295L);
            iArr3[i22 + 6] = (int) j36;
            long j37 = (j36 >>> 32) + (j27 * j29) + (iArr3[i20] & 4294967295L);
            iArr3[i22 + 7] = (int) j37;
            iArr3[i22 + 8] = (int) (j37 >>> 32);
            i23++;
            j12 = j31;
            j25 = j29;
            j13 = j13;
            i21 = 1;
        }
    }

    public static void y(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j17 = iArr2[7] & 4294967295L;
        long j18 = iArr[0] & 4294967295L;
        long j19 = (j18 * j10) + 0;
        iArr3[0] = (int) j19;
        long j20 = (j19 >>> 32) + (j18 * j11);
        iArr3[1] = (int) j20;
        long j21 = (j20 >>> 32) + (j18 * j12);
        iArr3[2] = (int) j21;
        long j22 = (j21 >>> 32) + (j18 * j13);
        iArr3[3] = (int) j22;
        long j23 = (j22 >>> 32) + (j18 * j14);
        iArr3[4] = (int) j23;
        long j24 = (j23 >>> 32) + (j18 * j15);
        iArr3[5] = (int) j24;
        long j25 = (j24 >>> 32) + (j18 * j16);
        iArr3[6] = (int) j25;
        long j26 = (j25 >>> 32) + (j18 * j17);
        iArr3[7] = (int) j26;
        iArr3[8] = (int) (j26 >>> 32);
        int i17 = 1;
        for (int i18 = 8; i17 < i18; i18 = 8) {
            long j27 = iArr[i17] & 4294967295L;
            long j28 = (j27 * j10) + (iArr3[i10] & 4294967295L) + 0;
            iArr3[i17 + 0] = (int) j28;
            int i19 = i17 + 1;
            long j29 = j11;
            long j30 = (j28 >>> 32) + (j27 * j11) + (iArr3[i19] & 4294967295L);
            iArr3[i19] = (int) j30;
            long j31 = j15;
            long j32 = (j30 >>> 32) + (j27 * j12) + (iArr3[i11] & 4294967295L);
            iArr3[i17 + 2] = (int) j32;
            long j33 = (j32 >>> 32) + (j27 * j13) + (iArr3[i12] & 4294967295L);
            iArr3[i17 + 3] = (int) j33;
            long j34 = (j33 >>> 32) + (j27 * j14) + (iArr3[i13] & 4294967295L);
            iArr3[i17 + 4] = (int) j34;
            long j35 = (j34 >>> 32) + (j27 * j31) + (iArr3[i14] & 4294967295L);
            iArr3[i17 + 5] = (int) j35;
            long j36 = (j35 >>> 32) + (j27 * j16) + (iArr3[i15] & 4294967295L);
            iArr3[i17 + 6] = (int) j36;
            long j37 = (j36 >>> 32) + (j27 * j17) + (iArr3[i16] & 4294967295L);
            iArr3[i17 + 7] = (int) j37;
            iArr3[i17 + 8] = (int) (j37 >>> 32);
            i17 = i19;
            j10 = j10;
            j11 = j29;
            j15 = j31;
        }
    }

    public static long z(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
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
        long j25 = (j23 >>> 32) + (j10 * j24) + j22 + (iArr2[i12 + 6] & 4294967295L);
        iArr3[i13 + 6] = (int) j25;
        long j26 = iArr[i11 + 7] & 4294967295L;
        long j27 = (j25 >>> 32) + (j10 * j26) + j24 + (4294967295L & iArr2[i12 + 7]);
        iArr3[i13 + 7] = (int) j27;
        return (j27 >>> 32) + j26;
    }
}
