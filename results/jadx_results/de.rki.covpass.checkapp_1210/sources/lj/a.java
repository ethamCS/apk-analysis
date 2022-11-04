package lj;

import java.lang.reflect.Array;
/* loaded from: classes3.dex */
public class a {
    public static byte[] a(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            bArr[i10] = (byte) sArr[i10];
        }
        return bArr;
    }

    public static short[] b(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sArr[i10] = (short) (bArr[i10] & 255);
        }
        return sArr;
    }

    public static byte[][] c(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                bArr[i10][i11] = (byte) sArr[i10][i11];
            }
        }
        return bArr;
    }

    public static short[][] d(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance(short.class, bArr.length, bArr[0].length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                sArr[i10][i11] = (short) (bArr[i10][i11] & 255);
            }
        }
        return sArr;
    }

    public static byte[][][] e(short[][][] sArr) {
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, sArr.length, sArr[0].length, sArr[0][0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                for (int i12 = 0; i12 < sArr[0][0].length; i12++) {
                    bArr[i10][i11][i12] = (byte) sArr[i10][i11][i12];
                }
            }
        }
        return bArr;
    }

    public static short[][][] f(byte[][][] bArr) {
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, bArr.length, bArr[0].length, bArr[0][0].length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                for (int i12 = 0; i12 < bArr[0][0].length; i12++) {
                    sArr[i10][i11][i12] = (short) (bArr[i10][i11][i12] & 255);
                }
            }
        }
        return sArr;
    }

    public static int[] g(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            iArr[i10] = bArr[i10] & 255;
        }
        return iArr;
    }

    public static byte[] h(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return bArr;
    }

    public static boolean i(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= sArr[length] == sArr2[length];
        }
        return z10;
    }

    public static boolean j(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= i(sArr[length], sArr2[length]);
        }
        return z10;
    }

    public static boolean k(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= j(sArr[length], sArr2[length]);
        }
        return z10;
    }
}
