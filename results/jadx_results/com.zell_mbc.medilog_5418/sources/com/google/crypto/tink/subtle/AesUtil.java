package com.google.crypto.tink.subtle;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes2.dex */
class AesUtil {
    public static final int BLOCK_SIZE = 16;

    AesUtil() {
    }

    public static byte[] dbl(final byte[] value) {
        if (value.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((value[i] << 1) & 254);
            if (i < 15) {
                bArr[i] = (byte) (bArr[i] | ((byte) ((value[i + 1] >> 7) & 1)));
            }
        }
        bArr[15] = (byte) (((byte) ((value[0] >> 7) & 135)) ^ bArr[15]);
        return bArr;
    }

    public static byte[] cmacPad(final byte[] x) {
        if (x.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(x, 16);
        copyOf[x.length] = ByteCompanionObject.MIN_VALUE;
        return copyOf;
    }
}
