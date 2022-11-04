package g6;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
class q {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i10 = 0;
            long c10 = c(bArr, 0, 0) & 67108863;
            int i11 = 3;
            long c11 = c(bArr, 3, 2) & 67108611;
            long c12 = c(bArr, 6, 4) & 67092735;
            long c13 = c(bArr, 9, 6) & 66076671;
            long c14 = c(bArr, 12, 8) & 1048575;
            long j10 = c11 * 5;
            long j11 = c12 * 5;
            long j12 = c13 * 5;
            long j13 = c14 * 5;
            byte[] bArr3 = new byte[17];
            long j14 = 0;
            int i12 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i12 < bArr2.length) {
                b(bArr3, bArr2, i12);
                long c15 = j18 + c(bArr3, i10, i10);
                long c16 = j14 + c(bArr3, i11, 2);
                long c17 = j15 + c(bArr3, 6, 4);
                long c18 = j16 + c(bArr3, 9, 6);
                long c19 = j17 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
                long j19 = (c15 * c10) + (c16 * j13) + (c17 * j12) + (c18 * j11) + (c19 * j10);
                long j20 = (c15 * c11) + (c16 * c10) + (c17 * j13) + (c18 * j12) + (c19 * j11) + (j19 >> 26);
                long j21 = (c15 * c12) + (c16 * c11) + (c17 * c10) + (c18 * j13) + (c19 * j12) + (j20 >> 26);
                long j22 = (c15 * c13) + (c16 * c12) + (c17 * c11) + (c18 * c10) + (c19 * j13) + (j21 >> 26);
                long j23 = (c15 * c14) + (c16 * c13) + (c17 * c12) + (c18 * c11) + (c19 * c10) + (j22 >> 26);
                long j24 = (j19 & 67108863) + ((j23 >> 26) * 5);
                j14 = (j20 & 67108863) + (j24 >> 26);
                i12 += 16;
                j15 = j21 & 67108863;
                j16 = j22 & 67108863;
                j17 = j23 & 67108863;
                i11 = 3;
                j18 = j24 & 67108863;
                i10 = 0;
            }
            long j25 = j15 + (j14 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j16 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = j17 + (j27 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j18 + ((j29 >> 26) * 5);
            long j32 = j31 & 67108863;
            long j33 = (j14 & 67108863) + (j31 >> 26);
            long j34 = j32 + 5;
            long j35 = j34 & 67108863;
            long j36 = (j34 >> 26) + j33;
            long j37 = j26 + (j36 >> 26);
            long j38 = j28 + (j37 >> 26);
            long j39 = (j30 + (j38 >> 26)) - 67108864;
            long j40 = j39 >> 63;
            long j41 = j32 & j40;
            long j42 = j33 & j40;
            long j43 = j26 & j40;
            long j44 = j28 & j40;
            long j45 = j30 & j40;
            long j46 = ~j40;
            long j47 = (j36 & 67108863 & j46) | j42;
            long j48 = (j37 & 67108863 & j46) | j43;
            long j49 = (j38 & 67108863 & j46) | j44;
            long d10 = ((j41 | (j35 & j46) | (j47 << 26)) & 4294967295L) + d(bArr, 16);
            long j50 = d10 & 4294967295L;
            long d11 = (((j47 >> 6) | (j48 << 20)) & 4294967295L) + d(bArr, 20) + (d10 >> 32);
            long d12 = (((j48 >> 12) | (j49 << 14)) & 4294967295L) + d(bArr, 24) + (d11 >> 32);
            byte[] bArr4 = new byte[16];
            e(bArr4, j50, 0);
            e(bArr4, d11 & 4294967295L, 4);
            e(bArr4, d12 & 4294967295L, 8);
            e(bArr4, ((((j49 >> 18) | (((j39 & j46) | j45) << 8)) & 4294967295L) + d(bArr, 28) + (d12 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    private static void b(byte[] bArr, byte[] bArr2, int i10) {
        int min = Math.min(16, bArr2.length - i10);
        System.arraycopy(bArr2, i10, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i10, int i11) {
        return (d(bArr, i10) >> i11) & 67108863;
    }

    private static long d(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void e(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (g.b(a(bArr, bArr2), bArr3)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
