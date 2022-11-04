package com.google.crypto.tink.subtle;

import java.util.Arrays;
import kotlin.UByte;
/* loaded from: classes2.dex */
final class Field25519 {
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;
    private static final int[] EXPAND_START = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] EXPAND_SHIFT = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] MASK = {67108863, 33554431};
    private static final int[] SHIFT = {26, 25};

    private static int eq(int a, int b) {
        int i = ~(a ^ b);
        int i2 = i & (i << 16);
        int i3 = i2 & (i2 << 8);
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 << 1)) >> 31;
    }

    private static int gte(int a, int b) {
        return ~((a - b) >> 31);
    }

    Field25519() {
    }

    public static void sum(long[] output, long[] in1, long[] in2) {
        for (int i = 0; i < 10; i++) {
            output[i] = in1[i] + in2[i];
        }
    }

    public static void sum(long[] output, long[] in) {
        sum(output, output, in);
    }

    public static void sub(long[] output, long[] in1, long[] in2) {
        for (int i = 0; i < 10; i++) {
            output[i] = in1[i] - in2[i];
        }
    }

    public static void sub(long[] output, long[] in) {
        sub(output, in, output);
    }

    public static void scalarProduct(long[] output, long[] in, long scalar) {
        for (int i = 0; i < 10; i++) {
            output[i] = in[i] * scalar;
        }
    }

    public static void product(long[] out, long[] in2, long[] in) {
        out[0] = in2[0] * in[0];
        out[1] = (in2[0] * in[1]) + (in2[1] * in[0]);
        out[2] = (in2[1] * 2 * in[1]) + (in2[0] * in[2]) + (in2[2] * in[0]);
        out[3] = (in2[1] * in[2]) + (in2[2] * in[1]) + (in2[0] * in[3]) + (in2[3] * in[0]);
        out[4] = (in2[2] * in[2]) + (((in2[1] * in[3]) + (in2[3] * in[1])) * 2) + (in2[0] * in[4]) + (in2[4] * in[0]);
        out[5] = (in2[2] * in[3]) + (in2[3] * in[2]) + (in2[1] * in[4]) + (in2[4] * in[1]) + (in2[0] * in[5]) + (in2[5] * in[0]);
        out[6] = (((in2[3] * in[3]) + (in2[1] * in[5]) + (in2[5] * in[1])) * 2) + (in2[2] * in[4]) + (in2[4] * in[2]) + (in2[0] * in[6]) + (in2[6] * in[0]);
        out[7] = (in2[3] * in[4]) + (in2[4] * in[3]) + (in2[2] * in[5]) + (in2[5] * in[2]) + (in2[1] * in[6]) + (in2[6] * in[1]) + (in2[0] * in[7]) + (in2[7] * in[0]);
        out[8] = (in2[4] * in[4]) + (((in2[3] * in[5]) + (in2[5] * in[3]) + (in2[1] * in[7]) + (in2[7] * in[1])) * 2) + (in2[2] * in[6]) + (in2[6] * in[2]) + (in2[0] * in[8]) + (in2[8] * in[0]);
        out[9] = (in2[4] * in[5]) + (in2[5] * in[4]) + (in2[3] * in[6]) + (in2[6] * in[3]) + (in2[2] * in[7]) + (in2[7] * in[2]) + (in2[1] * in[8]) + (in2[8] * in[1]) + (in2[0] * in[9]) + (in2[9] * in[0]);
        out[10] = (((in2[5] * in[5]) + (in2[3] * in[7]) + (in2[7] * in[3]) + (in2[1] * in[9]) + (in2[9] * in[1])) * 2) + (in2[4] * in[6]) + (in2[6] * in[4]) + (in2[2] * in[8]) + (in2[8] * in[2]);
        out[11] = (in2[5] * in[6]) + (in2[6] * in[5]) + (in2[4] * in[7]) + (in2[7] * in[4]) + (in2[3] * in[8]) + (in2[8] * in[3]) + (in2[2] * in[9]) + (in2[9] * in[2]);
        out[12] = (in2[6] * in[6]) + (((in2[5] * in[7]) + (in2[7] * in[5]) + (in2[3] * in[9]) + (in2[9] * in[3])) * 2) + (in2[4] * in[8]) + (in2[8] * in[4]);
        out[13] = (in2[6] * in[7]) + (in2[7] * in[6]) + (in2[5] * in[8]) + (in2[8] * in[5]) + (in2[4] * in[9]) + (in2[9] * in[4]);
        out[14] = (((in2[7] * in[7]) + (in2[5] * in[9]) + (in2[9] * in[5])) * 2) + (in2[6] * in[8]) + (in2[8] * in[6]);
        out[15] = (in2[7] * in[8]) + (in2[8] * in[7]) + (in2[6] * in[9]) + (in2[9] * in[6]);
        out[16] = (in2[8] * in[8]) + (((in2[7] * in[9]) + (in2[9] * in[7])) * 2);
        out[17] = (in2[8] * in[9]) + (in2[9] * in[8]);
        out[18] = in2[9] * 2 * in[9];
    }

    public static void reduce(long[] input, long[] output) {
        if (input.length != 19) {
            long[] jArr = new long[19];
            System.arraycopy(input, 0, jArr, 0, input.length);
            input = jArr;
        }
        reduceSizeByModularReduction(input);
        reduceCoefficients(input);
        System.arraycopy(input, 0, output, 0, 10);
    }

    public static void reduceSizeByModularReduction(long[] output) {
        output[8] = output[8] + (output[18] << 4);
        output[8] = output[8] + (output[18] << 1);
        output[8] = output[8] + output[18];
        output[7] = output[7] + (output[17] << 4);
        output[7] = output[7] + (output[17] << 1);
        output[7] = output[7] + output[17];
        output[6] = output[6] + (output[16] << 4);
        output[6] = output[6] + (output[16] << 1);
        output[6] = output[6] + output[16];
        output[5] = output[5] + (output[15] << 4);
        output[5] = output[5] + (output[15] << 1);
        output[5] = output[5] + output[15];
        output[4] = output[4] + (output[14] << 4);
        output[4] = output[4] + (output[14] << 1);
        output[4] = output[4] + output[14];
        output[3] = output[3] + (output[13] << 4);
        output[3] = output[3] + (output[13] << 1);
        output[3] = output[3] + output[13];
        output[2] = output[2] + (output[12] << 4);
        output[2] = output[2] + (output[12] << 1);
        output[2] = output[2] + output[12];
        output[1] = output[1] + (output[11] << 4);
        output[1] = output[1] + (output[11] << 1);
        output[1] = output[1] + output[11];
        output[0] = output[0] + (output[10] << 4);
        output[0] = output[0] + (output[10] << 1);
        output[0] = output[0] + output[10];
    }

    public static void reduceCoefficients(long[] output) {
        output[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = output[i] / TWO_TO_26;
            output[i] = output[i] - (j << 26);
            int i2 = i + 1;
            output[i2] = output[i2] + j;
            long j2 = output[i2] / TWO_TO_25;
            output[i2] = output[i2] - (j2 << 25);
            i += 2;
            output[i] = output[i] + j2;
        }
        output[0] = output[0] + (output[10] << 4);
        output[0] = output[0] + (output[10] << 1);
        output[0] = output[0] + output[10];
        output[10] = 0;
        long j3 = output[0] / TWO_TO_26;
        output[0] = output[0] - (j3 << 26);
        output[1] = output[1] + j3;
    }

    public static void mult(long[] output, long[] in, long[] in2) {
        long[] jArr = new long[19];
        product(jArr, in, in2);
        reduce(jArr, output);
    }

    private static void squareInner(long[] out, long[] in) {
        out[0] = in[0] * in[0];
        out[1] = in[0] * 2 * in[1];
        out[2] = ((in[1] * in[1]) + (in[0] * in[2])) * 2;
        out[3] = ((in[1] * in[2]) + (in[0] * in[3])) * 2;
        out[4] = (in[2] * in[2]) + (in[1] * 4 * in[3]) + (in[0] * 2 * in[4]);
        out[5] = ((in[2] * in[3]) + (in[1] * in[4]) + (in[0] * in[5])) * 2;
        out[6] = ((in[3] * in[3]) + (in[2] * in[4]) + (in[0] * in[6]) + (in[1] * 2 * in[5])) * 2;
        out[7] = ((in[3] * in[4]) + (in[2] * in[5]) + (in[1] * in[6]) + (in[0] * in[7])) * 2;
        out[8] = (in[4] * in[4]) + (((in[2] * in[6]) + (in[0] * in[8]) + (((in[1] * in[7]) + (in[3] * in[5])) * 2)) * 2);
        out[9] = ((in[4] * in[5]) + (in[3] * in[6]) + (in[2] * in[7]) + (in[1] * in[8]) + (in[0] * in[9])) * 2;
        out[10] = ((in[5] * in[5]) + (in[4] * in[6]) + (in[2] * in[8]) + (((in[3] * in[7]) + (in[1] * in[9])) * 2)) * 2;
        out[11] = ((in[5] * in[6]) + (in[4] * in[7]) + (in[3] * in[8]) + (in[2] * in[9])) * 2;
        out[12] = (in[6] * in[6]) + (((in[4] * in[8]) + (((in[5] * in[7]) + (in[3] * in[9])) * 2)) * 2);
        out[13] = ((in[6] * in[7]) + (in[5] * in[8]) + (in[4] * in[9])) * 2;
        out[14] = ((in[7] * in[7]) + (in[6] * in[8]) + (in[5] * 2 * in[9])) * 2;
        out[15] = ((in[7] * in[8]) + (in[6] * in[9])) * 2;
        out[16] = (in[8] * in[8]) + (in[7] * 4 * in[9]);
        out[17] = in[8] * 2 * in[9];
        out[18] = in[9] * 2 * in[9];
    }

    public static void square(long[] output, long[] in) {
        long[] jArr = new long[19];
        squareInner(jArr, in);
        reduce(jArr, output);
    }

    public static long[] expand(byte[] input) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int[] iArr = EXPAND_START;
            jArr[i] = (((((input[iArr[i]] & UByte.MAX_VALUE) | ((input[iArr[i] + 1] & UByte.MAX_VALUE) << 8)) | ((input[iArr[i] + 2] & UByte.MAX_VALUE) << 16)) | ((input[iArr[i] + 3] & UByte.MAX_VALUE) << 24)) >> EXPAND_SHIFT[i]) & MASK[i & 1];
        }
        return jArr;
    }

    public static byte[] contract(long[] inputLimbs) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        long[] copyOf = Arrays.copyOf(inputLimbs, 10);
        for (int i7 = 0; i7 < 2; i7++) {
            int i8 = 0;
            while (i8 < 9) {
                int i9 = -((int) ((copyOf[i8] & (copyOf[i8] >> 31)) >> SHIFT[i8 & 1]));
                copyOf[i8] = copyOf[i8] + (i9 << iArr[i6]);
                i8++;
                copyOf[i8] = copyOf[i8] - i9;
            }
            int i10 = -((int) (((copyOf[9] >> 31) & copyOf[9]) >> 25));
            copyOf[9] = copyOf[9] + (i10 << 25);
            copyOf[0] = copyOf[0] - (i10 * 19);
        }
        int i11 = -((int) ((copyOf[0] & (copyOf[0] >> 31)) >> 26));
        copyOf[0] = copyOf[0] + (i11 << 26);
        copyOf[1] = copyOf[1] - i11;
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = 0;
            while (i13 < 9) {
                int i14 = (int) (copyOf[i13] >> SHIFT[i13 & 1]);
                copyOf[i13] = MASK[i5] & copyOf[i13];
                i13++;
                copyOf[i13] = copyOf[i13] + i14;
            }
        }
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = copyOf[0] + (((int) (copyOf[9] >> 25)) * 19);
        int gte = gte((int) copyOf[0], 67108845);
        for (int i15 = 1; i15 < 10; i15++) {
            gte &= eq((int) copyOf[i15], MASK[i15 & 1]);
        }
        copyOf[0] = copyOf[0] - (67108845 & gte);
        long j = 33554431 & gte;
        copyOf[1] = copyOf[1] - j;
        for (int i16 = 2; i16 < 10; i16 += 2) {
            copyOf[i16] = copyOf[i16] - (67108863 & gte);
            int i17 = i16 + 1;
            copyOf[i17] = copyOf[i17] - j;
        }
        for (int i18 = 0; i18 < 10; i18++) {
            copyOf[i18] = copyOf[i18] << EXPAND_SHIFT[i18];
        }
        byte[] bArr = new byte[32];
        for (int i19 = 0; i19 < 10; i19++) {
            int[] iArr2 = EXPAND_START;
            bArr[iArr2[i19]] = (byte) (bArr[i] | (copyOf[i19] & 255));
            bArr[iArr2[i19] + 1] = (byte) (bArr[i2] | ((copyOf[i19] >> 8) & 255));
            bArr[iArr2[i19] + 2] = (byte) (bArr[i3] | ((copyOf[i19] >> 16) & 255));
            bArr[iArr2[i19] + 3] = (byte) (bArr[i4] | ((copyOf[i19] >> 24) & 255));
        }
        return bArr;
    }

    public static void inverse(long[] out, long[] z) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        square(jArr, z);
        square(jArr10, jArr);
        square(jArr9, jArr10);
        mult(jArr2, jArr9, z);
        mult(jArr3, jArr2, jArr);
        square(jArr9, jArr3);
        mult(jArr4, jArr9, jArr2);
        square(jArr9, jArr4);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        mult(jArr5, jArr9, jArr4);
        square(jArr9, jArr5);
        square(jArr10, jArr9);
        for (int i = 2; i < 10; i += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr6, jArr10, jArr5);
        square(jArr9, jArr6);
        square(jArr10, jArr9);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr9, jArr10, jArr6);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            square(jArr10, jArr9);
            square(jArr9, jArr10);
        }
        mult(jArr7, jArr9, jArr5);
        square(jArr9, jArr7);
        square(jArr10, jArr9);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr8, jArr10, jArr7);
        square(jArr10, jArr8);
        square(jArr9, jArr10);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            square(jArr10, jArr9);
            square(jArr9, jArr10);
        }
        mult(jArr10, jArr9, jArr8);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr9, jArr10, jArr7);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        mult(out, jArr10, jArr3);
    }
}
