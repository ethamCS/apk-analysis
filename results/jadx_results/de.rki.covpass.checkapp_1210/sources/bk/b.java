package bk;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public class b implements d {

    /* renamed from: a */
    protected final byte[] f6109a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    protected byte f6110b = 61;

    /* renamed from: c */
    protected final byte[] f6111c = new byte[128];

    public b() {
        g();
    }

    private int d(OutputStream outputStream, char c10, char c11, char c12, char c13) {
        byte b10 = this.f6110b;
        if (c12 == b10) {
            if (c13 != b10) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.f6111c;
            byte b11 = bArr[c10];
            byte b12 = bArr[c11];
            if ((b11 | b12) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b11 << 2) | (b12 >> 4));
            return 1;
        } else if (c13 == b10) {
            byte[] bArr2 = this.f6111c;
            byte b13 = bArr2[c10];
            byte b14 = bArr2[c11];
            byte b15 = bArr2[c12];
            if ((b13 | b14 | b15) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b13 << 2) | (b14 >> 4));
            outputStream.write((b14 << 4) | (b15 >> 2));
            return 2;
        } else {
            byte[] bArr3 = this.f6111c;
            byte b16 = bArr3[c10];
            byte b17 = bArr3[c11];
            byte b18 = bArr3[c12];
            byte b19 = bArr3[c13];
            if ((b16 | b17 | b18 | b19) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b16 << 2) | (b17 >> 4));
            outputStream.write((b17 << 4) | (b18 >> 2));
            outputStream.write((b18 << 6) | b19);
            return 3;
        }
    }

    private boolean f(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int h(String str, int i10, int i11) {
        while (i10 < i11 && f(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    @Override // bk.d
    public int a(String str, OutputStream outputStream) {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && f(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i10 = length;
        int i11 = 0;
        while (i10 > 0 && i11 != 4) {
            if (!f(str.charAt(i10 - 1))) {
                i11++;
            }
            i10--;
        }
        int h10 = h(str, 0, i10);
        int i12 = 0;
        int i13 = 0;
        while (h10 < i10) {
            int i14 = h10 + 1;
            byte b10 = this.f6111c[str.charAt(h10)];
            int h11 = h(str, i14, i10);
            int i15 = h11 + 1;
            byte b11 = this.f6111c[str.charAt(h11)];
            int h12 = h(str, i15, i10);
            int i16 = h12 + 1;
            byte b12 = this.f6111c[str.charAt(h12)];
            int h13 = h(str, i16, i10);
            int i17 = h13 + 1;
            byte b13 = this.f6111c[str.charAt(h13)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            int i18 = i12 + 1;
            bArr[i12] = (byte) ((b10 << 2) | (b11 >> 4));
            int i19 = i18 + 1;
            bArr[i18] = (byte) ((b11 << 4) | (b12 >> 2));
            i12 = i19 + 1;
            bArr[i19] = (byte) ((b12 << 6) | b13);
            i13 += 3;
            if (i12 == 54) {
                outputStream.write(bArr);
                i12 = 0;
            }
            h10 = h(str, i17, i10);
        }
        if (i12 > 0) {
            outputStream.write(bArr, 0, i12);
        }
        int h14 = h(str, h10, length);
        int h15 = h(str, h14 + 1, length);
        int h16 = h(str, h15 + 1, length);
        return i13 + d(outputStream, str.charAt(h14), str.charAt(h15), str.charAt(h16), str.charAt(h(str, h16 + 1, length)));
    }

    @Override // bk.d
    public int b(int i10) {
        return ((i10 + 2) / 3) * 4;
    }

    @Override // bk.d
    public int c(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        if (i11 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i12 = i11;
        while (i12 > 0) {
            int min = Math.min(54, i12);
            outputStream.write(bArr2, 0, e(bArr, i10, min, bArr2, 0));
            i10 += min;
            i12 -= min;
        }
        return ((i11 + 2) / 3) * 4;
    }

    public int e(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = (i10 + i11) - 2;
        int i14 = i10;
        int i15 = i12;
        while (i14 < i13) {
            int i16 = i14 + 1;
            byte b10 = bArr[i14];
            int i17 = i16 + 1;
            int i18 = bArr[i16] & 255;
            int i19 = i17 + 1;
            int i20 = bArr[i17] & 255;
            int i21 = i15 + 1;
            byte[] bArr3 = this.f6109a;
            bArr2[i15] = bArr3[(b10 >>> 2) & 63];
            int i22 = i21 + 1;
            bArr2[i21] = bArr3[((b10 << 4) | (i18 >>> 4)) & 63];
            int i23 = i22 + 1;
            bArr2[i22] = bArr3[((i18 << 2) | (i20 >>> 6)) & 63];
            i15 = i23 + 1;
            bArr2[i23] = bArr3[i20 & 63];
            i14 = i19;
        }
        int i24 = i11 - (i14 - i10);
        if (i24 == 1) {
            int i25 = bArr[i14] & 255;
            int i26 = i15 + 1;
            byte[] bArr4 = this.f6109a;
            bArr2[i15] = bArr4[(i25 >>> 2) & 63];
            int i27 = i26 + 1;
            bArr2[i26] = bArr4[(i25 << 4) & 63];
            int i28 = i27 + 1;
            byte b11 = this.f6110b;
            bArr2[i27] = b11;
            i15 = i28 + 1;
            bArr2[i28] = b11;
        } else if (i24 == 2) {
            int i29 = bArr[i14] & 255;
            int i30 = bArr[i14 + 1] & 255;
            int i31 = i15 + 1;
            byte[] bArr5 = this.f6109a;
            bArr2[i15] = bArr5[(i29 >>> 2) & 63];
            int i32 = i31 + 1;
            bArr2[i31] = bArr5[((i29 << 4) | (i30 >>> 4)) & 63];
            int i33 = i32 + 1;
            bArr2[i32] = bArr5[(i30 << 2) & 63];
            i15 = i33 + 1;
            bArr2[i33] = this.f6110b;
        }
        return i15 - i12;
    }

    protected void g() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f6111c;
            if (i11 < bArr.length) {
                bArr[i11] = -1;
                i11++;
            }
        }
        while (true) {
            byte[] bArr2 = this.f6109a;
            if (i10 < bArr2.length) {
                this.f6111c[bArr2[i10]] = (byte) i10;
                i10++;
            } else {
                return;
            }
        }
    }
}
