package bj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class m {
    public static void a(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11 + 0] = jArr[i10 + 0];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
        jArr2[i11 + 3] = jArr[i10 + 3];
        jArr2[i11 + 4] = jArr[i10 + 4];
        jArr2[i11 + 5] = jArr[i10 + 5];
        jArr2[i11 + 6] = jArr[i10 + 6];
        jArr2[i11 + 7] = jArr[i10 + 7];
        jArr2[i11 + 8] = jArr[i10 + 8];
    }

    public static void b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
        jArr2[8] = jArr[8];
    }

    public static long[] c() {
        return new long[9];
    }

    public static long[] d() {
        return new long[18];
    }

    public static boolean e(long[] jArr, long[] jArr2) {
        for (int i10 = 8; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 9; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(long[] jArr) {
        for (int i10 = 0; i10 < 9; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger h(long[] jArr) {
        byte[] bArr = new byte[72];
        for (int i10 = 0; i10 < 9; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                ak.l.s(j10, bArr, (8 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
