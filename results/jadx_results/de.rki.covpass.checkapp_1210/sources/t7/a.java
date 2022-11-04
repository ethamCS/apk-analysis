package t7;

import java.util.Objects;
/* loaded from: classes.dex */
final class a {
    public static void a(b0 b0Var, byte[] bArr, int i10, int i11, boolean z10) {
        b(b0Var, bArr, i10, i11, true, z10);
    }

    private static void b(b0 b0Var, byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        Objects.requireNonNull(b0Var, "writer");
        if (i10 < 0) {
            throw new IllegalArgumentException("offset(" + i10 + ") is less than 0 ");
        } else if (i10 > bArr.length) {
            throw new IllegalArgumentException("offset(" + i10 + ") is more than " + bArr.length);
        } else if (i11 < 0) {
            throw new IllegalArgumentException("count(" + i11 + ") is less than 0 ");
        } else if (i11 > bArr.length) {
            throw new IllegalArgumentException("count(" + i11 + ") is more than " + bArr.length);
        } else if (bArr.length - i10 < i11) {
            throw new IllegalArgumentException("data's length minus " + i10 + "(" + (bArr.length - i10) + ") is less than " + i11);
        } else {
            String str = z10 ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/" : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
            int i12 = i10 + i11;
            byte[] bArr2 = new byte[32];
            int i13 = 0;
            while (i10 < i12 - 2) {
                if (i13 >= 32) {
                    b0Var.a(bArr2, 0, i13);
                    i13 = 0;
                }
                int i14 = i13 + 1;
                bArr2[i13] = (byte) str.charAt((bArr[i10] >> 2) & 63);
                int i15 = i14 + 1;
                int i16 = i10 + 1;
                bArr2[i14] = (byte) str.charAt(((bArr[i10] & 3) << 4) + ((bArr[i16] >> 4) & 15));
                int i17 = i15 + 1;
                int i18 = i10 + 2;
                bArr2[i15] = (byte) str.charAt(((bArr[i16] & 15) << 2) + ((bArr[i18] >> 6) & 3));
                i13 = i17 + 1;
                bArr2[i17] = (byte) str.charAt(bArr[i18] & 63);
                i10 += 3;
            }
            int i19 = i11 % 3;
            if (i19 != 0) {
                if (i13 >= 32) {
                    b0Var.a(bArr2, 0, i13);
                    i13 = 0;
                }
                int i20 = i12 - i19;
                int i21 = i13 + 1;
                bArr2[i13] = (byte) str.charAt((bArr[i20] >> 2) & 63);
                if (i19 == 2) {
                    int i22 = i21 + 1;
                    int i23 = i20 + 1;
                    bArr2[i21] = (byte) str.charAt(((bArr[i20] & 3) << 4) + ((bArr[i23] >> 4) & 15));
                    i13 = i22 + 1;
                    bArr2[i22] = (byte) str.charAt((bArr[i23] & 15) << 2);
                    if (z11) {
                        bArr2[i13] = 61;
                        i13++;
                    }
                } else {
                    i13 = i21 + 1;
                    bArr2[i21] = (byte) str.charAt((bArr[i20] & 3) << 4);
                    if (z11) {
                        int i24 = i13 + 1;
                        bArr2[i13] = 61;
                        i13 = i24 + 1;
                        bArr2[i24] = 61;
                    }
                }
            }
            if (i13 < 0) {
                return;
            }
            b0Var.a(bArr2, 0, i13);
        }
    }

    public static void c(b0 b0Var, byte[] bArr, int i10, int i11, boolean z10) {
        b(b0Var, bArr, i10, i11, false, z10);
    }
}
