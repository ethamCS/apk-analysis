package qh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public final class c1 implements org.bouncycastle.crypto.e {

    /* renamed from: j */
    private static final byte[][] f19949j = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};

    /* renamed from: f */
    private int[] f19955f;

    /* renamed from: g */
    private int[] f19956g;

    /* renamed from: a */
    private boolean f19950a = false;

    /* renamed from: b */
    private int[] f19951b = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: c */
    private int[] f19952c = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: d */
    private int[] f19953d = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: e */
    private int[] f19954e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: h */
    private int f19957h = 0;

    /* renamed from: i */
    private byte[] f19958i = null;

    public c1() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i10 = 0; i10 < 256; i10++) {
            byte[][] bArr = f19949j;
            int i11 = bArr[0][i10] & 255;
            iArr[0] = i11;
            iArr2[0] = h(i11) & 255;
            iArr3[0] = i(i11) & 255;
            int i12 = bArr[1][i10] & 255;
            iArr[1] = i12;
            iArr2[1] = h(i12) & 255;
            iArr3[1] = i(i12) & 255;
            this.f19951b[i10] = iArr[1] | (iArr2[1] << 8) | (iArr3[1] << 16) | (iArr3[1] << 24);
            this.f19952c[i10] = iArr3[0] | (iArr3[0] << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            this.f19953d[i10] = (iArr3[1] << 24) | iArr2[1] | (iArr3[1] << 8) | (iArr[1] << 16);
            this.f19954e[i10] = iArr2[0] | (iArr[0] << 8) | (iArr3[0] << 16) | (iArr2[0] << 24);
        }
    }

    private int c(int i10, int[] iArr) {
        int i11;
        int i12;
        int l10 = l(i10);
        int m10 = m(i10);
        int n10 = n(i10);
        int o10 = o(i10);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        int i17 = this.f19957h & 3;
        if (i17 != 0) {
            if (i17 == 1) {
                int[] iArr2 = this.f19951b;
                byte[][] bArr = f19949j;
                i11 = (iArr2[(bArr[0][l10] & 255) ^ l(i13)] ^ this.f19952c[(bArr[0][m10] & 255) ^ m(i13)]) ^ this.f19953d[(bArr[1][n10] & 255) ^ n(i13)];
                i12 = this.f19954e[(bArr[1][o10] & 255) ^ o(i13)];
                return i11 ^ i12;
            }
            if (i17 != 2) {
                if (i17 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.f19951b;
            byte[][] bArr2 = f19949j;
            i11 = (iArr3[(bArr2[0][(bArr2[0][l10] & 255) ^ l(i14)] & 255) ^ l(i13)] ^ this.f19952c[(bArr2[0][(bArr2[1][m10] & 255) ^ m(i14)] & 255) ^ m(i13)]) ^ this.f19953d[(bArr2[1][(bArr2[0][n10] & 255) ^ n(i14)] & 255) ^ n(i13)];
            i12 = this.f19954e[(bArr2[1][(bArr2[1][o10] & 255) ^ o(i14)] & 255) ^ o(i13)];
            return i11 ^ i12;
        }
        byte[][] bArr3 = f19949j;
        l10 = (bArr3[1][l10] & 255) ^ l(i16);
        m10 = (bArr3[0][m10] & 255) ^ m(i16);
        n10 = (bArr3[0][n10] & 255) ^ n(i16);
        o10 = (bArr3[1][o10] & 255) ^ o(i16);
        byte[][] bArr4 = f19949j;
        l10 = (bArr4[1][l10] & 255) ^ l(i15);
        m10 = (bArr4[1][m10] & 255) ^ m(i15);
        n10 = (bArr4[0][n10] & 255) ^ n(i15);
        o10 = (bArr4[0][o10] & 255) ^ o(i15);
        int[] iArr32 = this.f19951b;
        byte[][] bArr22 = f19949j;
        i11 = (iArr32[(bArr22[0][(bArr22[0][l10] & 255) ^ l(i14)] & 255) ^ l(i13)] ^ this.f19952c[(bArr22[0][(bArr22[1][m10] & 255) ^ m(i14)] & 255) ^ m(i13)]) ^ this.f19953d[(bArr22[1][(bArr22[0][n10] & 255) ^ n(i14)] & 255) ^ n(i13)];
        i12 = this.f19954e[(bArr22[1][(bArr22[1][o10] & 255) ^ o(i14)] & 255) ^ o(i13)];
        return i11 ^ i12;
    }

    private int d(int i10) {
        int[] iArr = this.f19956g;
        return iArr[(((i10 >>> 24) & 255) * 2) + 513] ^ ((iArr[((i10 & 255) * 2) + 0] ^ iArr[(((i10 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i10 >>> 16) & 255) * 2) + 512]);
    }

    private int e(int i10) {
        int[] iArr = this.f19956g;
        return iArr[(((i10 >>> 16) & 255) * 2) + 513] ^ ((iArr[(((i10 >>> 24) & 255) * 2) + 0] ^ iArr[((i10 & 255) * 2) + 1]) ^ iArr[(((i10 >>> 8) & 255) * 2) + 512]);
    }

    private int f(int i10) {
        return ((i10 & 1) != 0 ? 180 : 0) ^ (i10 >> 1);
    }

    private int g(int i10) {
        int i11 = 0;
        int i12 = (i10 >> 2) ^ ((i10 & 2) != 0 ? 180 : 0);
        if ((i10 & 1) != 0) {
            i11 = 90;
        }
        return i12 ^ i11;
    }

    private int h(int i10) {
        return i10 ^ g(i10);
    }

    private int i(int i10) {
        return g(i10) ^ (f(i10) ^ i10);
    }

    private int j(int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = k(i11);
        }
        int i13 = i10 ^ i11;
        for (int i14 = 0; i14 < 4; i14++) {
            i13 = k(i13);
        }
        return i13;
    }

    private int k(int i10) {
        int i11 = (i10 >>> 24) & 255;
        int i12 = 0;
        int i13 = ((i11 << 1) ^ ((i11 & 128) != 0 ? 333 : 0)) & 255;
        int i14 = i11 >>> 1;
        if ((i11 & 1) != 0) {
            i12 = 166;
        }
        int i15 = (i14 ^ i12) ^ i13;
        return ((((i10 << 8) ^ (i15 << 24)) ^ (i13 << 16)) ^ (i15 << 8)) ^ i11;
    }

    private int l(int i10) {
        return i10 & 255;
    }

    private int m(int i10) {
        return (i10 >>> 8) & 255;
    }

    private int n(int i10) {
        return (i10 >>> 16) & 255;
    }

    private int o(int i10) {
        return (i10 >>> 24) & 255;
    }

    private void p(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int l10 = ak.l.l(bArr, i10) ^ this.f19955f[4];
        int l11 = ak.l.l(bArr, i10 + 4) ^ this.f19955f[5];
        int l12 = ak.l.l(bArr, i10 + 8) ^ this.f19955f[6];
        int l13 = ak.l.l(bArr, i10 + 12) ^ this.f19955f[7];
        int i12 = 39;
        int i13 = 0;
        while (i13 < 16) {
            int d10 = d(l10);
            int e10 = e(l11);
            int i14 = i12 - 1;
            int i15 = d10 + e10;
            int i16 = i14 - 1;
            l12 = ak.g.c(l12, 1) ^ (i15 + this.f19955f[i14]);
            l13 = ak.g.d(l13 ^ (((e10 * 2) + d10) + this.f19955f[i12]), 1);
            int d11 = d(l12);
            int e11 = e(l13);
            int i17 = i16 - 1;
            l10 = ak.g.c(l10, 1) ^ ((d11 + e11) + this.f19955f[i17]);
            l11 = ak.g.d(l11 ^ (((e11 * 2) + d11) + this.f19955f[i16]), 1);
            i13 += 2;
            i12 = i17 - 1;
        }
        ak.l.i(this.f19955f[0] ^ l12, bArr2, i11);
        ak.l.i(l13 ^ this.f19955f[1], bArr2, i11 + 4);
        ak.l.i(this.f19955f[2] ^ l10, bArr2, i11 + 8);
        ak.l.i(this.f19955f[3] ^ l11, bArr2, i11 + 12);
    }

    private void q(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = 0;
        int l10 = ak.l.l(bArr, i10) ^ this.f19955f[0];
        int l11 = ak.l.l(bArr, i10 + 4) ^ this.f19955f[1];
        int l12 = ak.l.l(bArr, i10 + 8) ^ this.f19955f[2];
        int l13 = ak.l.l(bArr, i10 + 12) ^ this.f19955f[3];
        int i13 = 8;
        while (i12 < 16) {
            int d10 = d(l10);
            int e10 = e(l11);
            int i14 = i13 + 1;
            l12 = ak.g.d(l12 ^ ((d10 + e10) + this.f19955f[i13]), 1);
            int i15 = d10 + (e10 * 2);
            int i16 = i14 + 1;
            l13 = ak.g.c(l13, 1) ^ (i15 + this.f19955f[i14]);
            int d11 = d(l12);
            int e11 = e(l13);
            int i17 = i16 + 1;
            l10 = ak.g.d(l10 ^ ((d11 + e11) + this.f19955f[i16]), 1);
            l11 = ak.g.c(l11, 1) ^ ((d11 + (e11 * 2)) + this.f19955f[i17]);
            i12 += 2;
            i13 = i17 + 1;
        }
        ak.l.i(this.f19955f[4] ^ l12, bArr2, i11);
        ak.l.i(l13 ^ this.f19955f[5], bArr2, i11 + 4);
        ak.l.i(this.f19955f[6] ^ l10, bArr2, i11 + 8);
        ak.l.i(this.f19955f[7] ^ l11, bArr2, i11 + 12);
    }

    private void r(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.f19955f = new int[40];
        for (int i18 = 0; i18 < this.f19957h; i18++) {
            int i19 = i18 * 8;
            iArr[i18] = ak.l.l(bArr, i19);
            iArr2[i18] = ak.l.l(bArr, i19 + 4);
            iArr3[(this.f19957h - 1) - i18] = j(iArr[i18], iArr2[i18]);
        }
        for (int i20 = 0; i20 < 20; i20++) {
            int i21 = 33686018 * i20;
            int c10 = c(i21, iArr);
            int c11 = ak.g.c(c(i21 + 16843009, iArr2), 8);
            int i22 = c10 + c11;
            int[] iArr4 = this.f19955f;
            int i23 = i20 * 2;
            iArr4[i23] = i22;
            int i24 = i22 + c11;
            iArr4[i23 + 1] = (i24 << 9) | (i24 >>> 23);
        }
        int i25 = iArr3[0];
        int i26 = iArr3[1];
        int i27 = 2;
        int i28 = iArr3[2];
        int i29 = iArr3[3];
        this.f19956g = new int[1024];
        int i30 = 0;
        while (i30 < 256) {
            int i31 = this.f19957h & 3;
            if (i31 != 0) {
                if (i31 == 1) {
                    int[] iArr5 = this.f19956g;
                    int i32 = i30 * 2;
                    int[] iArr6 = this.f19951b;
                    byte[][] bArr2 = f19949j;
                    iArr5[i32] = iArr6[(bArr2[0][i30] & 255) ^ l(i25)];
                    this.f19956g[i32 + 1] = this.f19952c[(bArr2[0][i30] & 255) ^ m(i25)];
                    this.f19956g[i32 + 512] = this.f19953d[(bArr2[1][i30] & 255) ^ n(i25)];
                    this.f19956g[i32 + 513] = this.f19954e[(bArr2[1][i30] & 255) ^ o(i25)];
                } else if (i31 == i27) {
                    i13 = i30;
                    i12 = i13;
                    i11 = i12;
                    i10 = i11;
                    int[] iArr7 = this.f19956g;
                    int i33 = i30 * 2;
                    int[] iArr8 = this.f19951b;
                    byte[][] bArr3 = f19949j;
                    iArr7[i33] = iArr8[(bArr3[0][(bArr3[0][i12] & 255) ^ l(i26)] & 255) ^ l(i25)];
                    this.f19956g[i33 + 1] = this.f19952c[(bArr3[0][(bArr3[1][i11] & 255) ^ m(i26)] & 255) ^ m(i25)];
                    this.f19956g[i33 + 512] = this.f19953d[(bArr3[1][(bArr3[0][i10] & 255) ^ n(i26)] & 255) ^ n(i25)];
                    this.f19956g[i33 + 513] = this.f19954e[(bArr3[1][(bArr3[1][i13] & 255) ^ o(i26)] & 255) ^ o(i25)];
                } else if (i31 == 3) {
                    i17 = i30;
                    i16 = i17;
                    i15 = i16;
                    i14 = i15;
                }
                i30++;
                i27 = 2;
            } else {
                byte[][] bArr4 = f19949j;
                i16 = (bArr4[1][i30] & 255) ^ l(i29);
                i15 = (bArr4[0][i30] & 255) ^ m(i29);
                i14 = (bArr4[0][i30] & 255) ^ n(i29);
                i17 = (bArr4[1][i30] & 255) ^ o(i29);
            }
            byte[][] bArr5 = f19949j;
            i12 = (bArr5[1][i16] & 255) ^ l(i28);
            i11 = (bArr5[1][i15] & 255) ^ m(i28);
            i10 = (bArr5[0][i14] & 255) ^ n(i28);
            i13 = (bArr5[0][i17] & 255) ^ o(i28);
            int[] iArr72 = this.f19956g;
            int i332 = i30 * 2;
            int[] iArr82 = this.f19951b;
            byte[][] bArr32 = f19949j;
            iArr72[i332] = iArr82[(bArr32[0][(bArr32[0][i12] & 255) ^ l(i26)] & 255) ^ l(i25)];
            this.f19956g[i332 + 1] = this.f19952c[(bArr32[0][(bArr32[1][i11] & 255) ^ m(i26)] & 255) ^ m(i25)];
            this.f19956g[i332 + 512] = this.f19953d[(bArr32[1][(bArr32[0][i10] & 255) ^ n(i26)] & 255) ^ n(i25)];
            this.f19956g[i332 + 513] = this.f19954e[(bArr32[1][(bArr32[1][i13] & 255) ^ o(i26)] & 255) ^ o(i25)];
            i30++;
            i27 = 2;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f19958i != null) {
            if (i10 + 16 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 16 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            if (this.f19950a) {
                q(bArr, i10, bArr2, i11);
                return 16;
            }
            p(bArr, i10, bArr2, i11);
            return 16;
        }
        throw new IllegalStateException("Twofish not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + iVar.getClass().getName());
        }
        this.f19950a = z10;
        byte[] a10 = ((zh.b1) iVar).a();
        this.f19958i = a10;
        int length = a10.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        this.f19957h = a10.length / 8;
        r(a10);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f19958i;
        if (bArr != null) {
            r(bArr);
        }
    }
}
