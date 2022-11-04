package org.javarosa.core.util;

import org.kxml2.wap.Wbxml;
/* loaded from: classes.dex */
public class SHA1 {
    private static int rol(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    public static String encodeBase64(String str) {
        int i;
        int i2;
        byte[] bytes = str.getBytes();
        int[] iArr = new int[(((bytes.length + 8) >> 6) + 1) * 16];
        int i3 = 0;
        while (i3 < bytes.length) {
            int i4 = i3 >> 2;
            iArr[i4] = iArr[i4] | (bytes[i3] << (24 - ((i3 % 4) * 8)));
            i3++;
        }
        int i5 = i3 >> 2;
        iArr[i5] = (Wbxml.EXT_T_0 << (24 - ((i3 % 4) * 8))) | iArr[i5];
        iArr[iArr.length - 1] = bytes.length * 8;
        int[] iArr2 = new int[80];
        int i6 = 1732584193;
        int i7 = -271733879;
        int i8 = -1732584194;
        int i9 = 271733878;
        int i10 = -1009589776;
        for (int i11 = 0; i11 < iArr.length; i11 += 16) {
            int i12 = 0;
            int i13 = i10;
            int i14 = i9;
            int i15 = i8;
            int i16 = i7;
            int i17 = i6;
            while (i12 < 80) {
                iArr2[i12] = i12 < 16 ? iArr[i11 + i12] : rol(((iArr2[i12 - 3] ^ iArr2[i12 - 8]) ^ iArr2[i12 - 14]) ^ iArr2[i12 - 16], 1);
                int rol = iArr2[i12] + rol(i17, 5) + i13;
                if (i12 < 20) {
                    i = 1518500249;
                    i2 = (i16 & i15) | ((i16 ^ (-1)) & i14);
                } else if (i12 < 40) {
                    i = 1859775393;
                    i2 = (i16 ^ i15) ^ i14;
                } else if (i12 < 60) {
                    i = -1894007588;
                    i2 = (i16 & i15) | (i16 & i14) | (i15 & i14);
                } else {
                    i = -899497514;
                    i2 = (i16 ^ i15) ^ i14;
                }
                int i18 = rol + i + i2;
                int rol2 = rol(i16, 30);
                i12++;
                i16 = i17;
                i17 = i18;
                i13 = i14;
                i14 = i15;
                i15 = rol2;
            }
            i6 += i17;
            i7 += i16;
            i8 += i15;
            i9 += i14;
            i10 += i13;
        }
        int[] iArr3 = {i6, i7, i8, i9, i10, 0};
        byte[] bytes2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes();
        byte[] bArr = new byte[28];
        for (int i19 = 0; i19 < 27; i19++) {
            int i20 = i19 * 6;
            int i21 = i20 >> 5;
            int i22 = i20 & 31;
            if (i22 <= 26) {
                bArr[i19] = bytes2[(iArr3[i21] >> (26 - i22)) & 63];
            } else if (i22 == 28) {
                bArr[i19] = bytes2[(((iArr3[i21] & 15) << 2) | ((iArr3[i21 + 1] >> 30) & 3)) & 63];
            } else {
                bArr[i19] = bytes2[(((iArr3[i21] & 3) << 4) | ((iArr3[i21 + 1] >> 28) & 15)) & 63];
            }
        }
        bArr[27] = 61;
        return new String(bArr);
    }

    public static String encodeHex(String str) {
        int i;
        int i2;
        byte[] bytes = str.getBytes();
        int[] iArr = new int[(((bytes.length + 8) >> 6) + 1) * 16];
        int i3 = 0;
        while (i3 < bytes.length) {
            int i4 = i3 >> 2;
            iArr[i4] = iArr[i4] | (bytes[i3] << (24 - ((i3 % 4) * 8)));
            i3++;
        }
        int i5 = i3 >> 2;
        iArr[i5] = (Wbxml.EXT_T_0 << (24 - ((i3 % 4) * 8))) | iArr[i5];
        iArr[iArr.length - 1] = bytes.length * 8;
        int[] iArr2 = new int[80];
        int i6 = 1732584193;
        int i7 = -271733879;
        int i8 = -1732584194;
        int i9 = 271733878;
        int i10 = -1009589776;
        for (int i11 = 0; i11 < iArr.length; i11 += 16) {
            int i12 = 0;
            int i13 = i10;
            int i14 = i9;
            int i15 = i8;
            int i16 = i7;
            int i17 = i6;
            while (i12 < 80) {
                iArr2[i12] = i12 < 16 ? iArr[i11 + i12] : rol(((iArr2[i12 - 3] ^ iArr2[i12 - 8]) ^ iArr2[i12 - 14]) ^ iArr2[i12 - 16], 1);
                int rol = iArr2[i12] + rol(i17, 5) + i13;
                if (i12 < 20) {
                    i = 1518500249;
                    i2 = (i16 & i15) | ((i16 ^ (-1)) & i14);
                } else if (i12 < 40) {
                    i = 1859775393;
                    i2 = (i16 ^ i15) ^ i14;
                } else if (i12 < 60) {
                    i = -1894007588;
                    i2 = (i16 & i15) | (i16 & i14) | (i15 & i14);
                } else {
                    i = -899497514;
                    i2 = (i16 ^ i15) ^ i14;
                }
                int i18 = rol + i + i2;
                int rol2 = rol(i16, 30);
                i12++;
                i16 = i17;
                i17 = i18;
                i13 = i14;
                i14 = i15;
                i15 = rol2;
            }
            i6 += i17;
            i7 += i16;
            i8 += i15;
            i9 += i14;
            i10 += i13;
        }
        int[] iArr3 = {i6, i7, i8, i9, i10};
        String str2 = "";
        for (int i19 : iArr3) {
            String hexString = Integer.toHexString(i19);
            while (hexString.length() < 8) {
                hexString = "0" + hexString;
            }
            str2 = str2 + hexString;
        }
        return str2;
    }
}
