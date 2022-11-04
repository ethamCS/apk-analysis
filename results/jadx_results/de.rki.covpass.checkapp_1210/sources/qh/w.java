package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class w implements org.bouncycastle.crypto.e {

    /* renamed from: g */
    private static final byte[] f20205g = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, 33, -127, 28, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, Byte.MAX_VALUE, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, 112, 14, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, 50, 117, 25, 61, -1, 53, -118, 126, 109, 84, -58, Byte.MIN_VALUE, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, -80, -68, -36, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, 30, 0, 98, 68, 26, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};

    /* renamed from: h */
    private static final byte[] f20206h = {-91, 45, 50, -113, 14, 48, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, 112, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, Byte.MAX_VALUE, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, -68, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, 61, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, Byte.MIN_VALUE, -112, -48, 36, 52, -53, -19, -12, -50, -103, 16, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};

    /* renamed from: e */
    private boolean f20211e;

    /* renamed from: a */
    private final byte[] f20207a = {-108, 32, -123, 16, -62, -64, 1, -5, 1, -64, -62, 16, -123, 32, -108, 1};

    /* renamed from: b */
    private int f20208b = 32;

    /* renamed from: c */
    private int f20209c = 32 / 2;

    /* renamed from: d */
    private byte[][] f20210d = null;

    /* renamed from: f */
    private byte[][] f20212f = m();

    private void c(byte[] bArr, int i10) {
        ak.a.g(bArr);
        bArr[15] = (byte) i10;
        f(bArr);
    }

    private void d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] g10 = g(bArr, bArr2);
        j(g10, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 0, this.f20209c);
        System.arraycopy(g10, 0, bArr2, 0, this.f20209c);
    }

    private void e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[][] bArr3;
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i10, bArr4, 0, 16);
        int i12 = 9;
        if (this.f20211e) {
            for (int i13 = 0; i13 < 9; i13++) {
                bArr4 = ak.a.v(g(this.f20210d[i13], bArr4), 16);
            }
            j(bArr4, this.f20210d[9]);
        } else {
            while (true) {
                bArr3 = this.f20210d;
                if (i12 <= 0) {
                    break;
                }
                bArr4 = ak.a.v(k(bArr3[i12], bArr4), 16);
                i12--;
            }
            j(bArr4, bArr3[0]);
        }
        System.arraycopy(bArr4, 0, bArr2, i11, 16);
    }

    private void f(byte[] bArr) {
        for (int i10 = 0; i10 < 16; i10++) {
            h(bArr);
        }
    }

    private byte[] g(byte[] bArr, byte[] bArr2) {
        byte[] v10 = ak.a.v(bArr, bArr.length);
        j(v10, bArr2);
        i(v10);
        f(v10);
        return v10;
    }

    private void h(byte[] bArr) {
        byte r10 = r(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = r10;
    }

    private void i(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = f20205g[s(bArr[i10])];
        }
    }

    private void j(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    private byte[] k(byte[] bArr, byte[] bArr2) {
        byte[] v10 = ak.a.v(bArr, bArr.length);
        j(v10, bArr2);
        n(v10);
        p(v10);
        return v10;
    }

    private void l(byte[] bArr) {
        int i10;
        if (bArr.length == this.f20208b) {
            this.f20210d = new byte[10];
            for (int i11 = 0; i11 < 10; i11++) {
                this.f20210d[i11] = new byte[this.f20209c];
            }
            int i12 = this.f20209c;
            byte[] bArr2 = new byte[i12];
            byte[] bArr3 = new byte[i12];
            int i13 = 0;
            while (true) {
                i10 = this.f20209c;
                if (i13 >= i10) {
                    break;
                }
                byte[][] bArr4 = this.f20210d;
                byte[] bArr5 = bArr4[0];
                byte b10 = bArr[i13];
                bArr2[i13] = b10;
                bArr5[i13] = b10;
                byte[] bArr6 = bArr4[1];
                byte b11 = bArr[i10 + i13];
                bArr3[i13] = b11;
                bArr6[i13] = b11;
                i13++;
            }
            byte[] bArr7 = new byte[i10];
            for (int i14 = 1; i14 < 5; i14++) {
                for (int i15 = 1; i15 <= 8; i15++) {
                    c(bArr7, ((i14 - 1) * 8) + i15);
                    d(bArr7, bArr2, bArr3);
                }
                int i16 = i14 * 2;
                System.arraycopy(bArr2, 0, this.f20210d[i16], 0, this.f20209c);
                System.arraycopy(bArr3, 0, this.f20210d[i16 + 1], 0, this.f20209c);
            }
            return;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    private static byte[][] m() {
        byte[][] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr[i10] = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            for (int i11 = 0; i11 < 256; i11++) {
                bArr[i10][i11] = q((byte) i10, (byte) i11);
            }
        }
        return bArr;
    }

    private void n(byte[] bArr) {
        for (int i10 = 0; i10 < 16; i10++) {
            o(bArr);
        }
    }

    private void o(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 1, bArr2, 0, 15);
        bArr2[15] = bArr[0];
        byte r10 = r(bArr2);
        System.arraycopy(bArr, 1, bArr, 0, 15);
        bArr[15] = r10;
    }

    private void p(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = f20206h[s(bArr[i10])];
        }
    }

    private static byte q(byte b10, byte b11) {
        byte b12 = 0;
        for (byte b13 = 0; b13 < 8 && b10 != 0 && b11 != 0; b13 = (byte) (b13 + 1)) {
            if ((b11 & 1) != 0) {
                b12 = (byte) (b12 ^ b10);
            }
            byte b14 = (byte) (b10 & 128);
            b10 = (byte) (b10 << 1);
            if (b14 != 0) {
                b10 = (byte) (b10 ^ 195);
            }
            b11 = (byte) (b11 >> 1);
        }
        return b12;
    }

    private byte r(byte[] bArr) {
        byte b10 = bArr[15];
        for (int i10 = 14; i10 >= 0; i10--) {
            b10 = (byte) (b10 ^ this.f20212f[s(bArr[i10])][s(this.f20207a[i10])]);
        }
        return b10;
    }

    private int s(byte b10) {
        return b10 & 255;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f20210d != null) {
            if (i10 + 16 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 16 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            e(bArr, i10, bArr2, i11);
            return 16;
        }
        throw new IllegalStateException("GOST3412_2015 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "GOST3412_2015";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20211e = z10;
            l(((zh.b1) iVar).a());
        } else if (iVar == null) {
        } else {
            throw new IllegalArgumentException("invalid parameter passed to GOST3412_2015 init - " + iVar.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
