package bk;

import androidx.constraintlayout.widget.i;
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    private static final short[] f6117a = new short[128];

    /* renamed from: b */
    private static final byte[] f6118b;

    static {
        byte[] bArr = new byte[112];
        f6118b = bArr;
        byte[] bArr2 = new byte[128];
        a(bArr2, 0, 15, (byte) 1);
        a(bArr2, 16, 31, (byte) 2);
        a(bArr2, 32, 63, (byte) 3);
        a(bArr2, 64, 65, (byte) 0);
        a(bArr2, 66, 95, (byte) 4);
        a(bArr2, 96, 96, (byte) 5);
        a(bArr2, 97, 108, (byte) 6);
        a(bArr2, 109, 109, (byte) 7);
        a(bArr2, i.E2, 111, (byte) 6);
        a(bArr2, 112, 112, (byte) 8);
        a(bArr2, 113, 115, (byte) 9);
        a(bArr2, 116, 116, (byte) 10);
        a(bArr2, 117, 127, (byte) 0);
        a(bArr, 0, bArr.length - 1, (byte) -2);
        a(bArr, 8, 11, (byte) -1);
        a(bArr, 24, 27, (byte) 0);
        a(bArr, 40, 43, (byte) 16);
        a(bArr, 58, 59, (byte) 0);
        a(bArr, 72, 73, (byte) 0);
        a(bArr, 89, 91, (byte) 16);
        a(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i10 = 0; i10 < 128; i10++) {
            byte b10 = bArr2[i10];
            f6117a[i10] = (short) (bArr4[b10] | ((bArr3[b10] & i10) << 8));
        }
    }

    private static void a(byte[] bArr, int i10, int i11, byte b10) {
        while (i10 <= i11) {
            bArr[i10] = b10;
            i10++;
        }
    }

    public static int b(byte[] bArr, char[] cArr) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0) {
                short s10 = f6117a[b10 & Byte.MAX_VALUE];
                int i13 = s10 >>> 8;
                byte b11 = (byte) s10;
                while (b11 >= 0) {
                    if (i12 >= bArr.length) {
                        return -1;
                    }
                    int i14 = i12 + 1;
                    byte b12 = bArr[i12];
                    i13 = (i13 << 6) | (b12 & 63);
                    b11 = f6118b[b11 + ((b12 & 255) >>> 4)];
                    i12 = i14;
                }
                if (b11 == -2) {
                    return -1;
                }
                if (i13 <= 65535) {
                    if (i11 >= cArr.length) {
                        return -1;
                    }
                    cArr[i11] = (char) i13;
                    i11++;
                } else if (i11 >= cArr.length - 1) {
                    return -1;
                } else {
                    int i15 = i11 + 1;
                    cArr[i11] = (char) ((i13 >>> 10) + 55232);
                    i11 = i15 + 1;
                    cArr[i15] = (char) (56320 | (i13 & 1023));
                }
                i10 = i12;
            } else if (i11 >= cArr.length) {
                return -1;
            } else {
                cArr[i11] = (char) b10;
                i10 = i12;
                i11++;
            }
        }
        return i11;
    }
}
