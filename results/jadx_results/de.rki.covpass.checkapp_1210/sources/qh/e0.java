package qh;
/* loaded from: classes3.dex */
public class e0 implements org.bouncycastle.crypto.e {

    /* renamed from: c */
    private static byte[] f19974c = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};

    /* renamed from: a */
    private int[] f19975a;

    /* renamed from: b */
    private boolean f19976b;

    private void c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = ((bArr[i10 + 7] & 255) << 8) + (bArr[i10 + 6] & 255);
        int i13 = ((bArr[i10 + 5] & 255) << 8) + (bArr[i10 + 4] & 255);
        int i14 = ((bArr[i10 + 3] & 255) << 8) + (bArr[i10 + 2] & 255);
        int i15 = ((bArr[i10 + 1] & 255) << 8) + (bArr[i10 + 0] & 255);
        for (int i16 = 60; i16 >= 44; i16 -= 4) {
            i12 = f(i12, 11) - ((((~i13) & i15) + (i14 & i13)) + this.f19975a[i16 + 3]);
            i13 = f(i13, 13) - ((((~i14) & i12) + (i15 & i14)) + this.f19975a[i16 + 2]);
            i14 = f(i14, 14) - ((((~i15) & i13) + (i12 & i15)) + this.f19975a[i16 + 1]);
            i15 = f(i15, 15) - ((((~i12) & i14) + (i13 & i12)) + this.f19975a[i16]);
        }
        int[] iArr = this.f19975a;
        int i17 = i12 - iArr[i13 & 63];
        int i18 = i13 - iArr[i14 & 63];
        int i19 = i14 - iArr[i15 & 63];
        int i20 = i15 - iArr[i17 & 63];
        for (int i21 = 40; i21 >= 20; i21 -= 4) {
            i17 = f(i17, 11) - ((((~i18) & i20) + (i19 & i18)) + this.f19975a[i21 + 3]);
            i18 = f(i18, 13) - ((((~i19) & i17) + (i20 & i19)) + this.f19975a[i21 + 2]);
            i19 = f(i19, 14) - ((((~i20) & i18) + (i17 & i20)) + this.f19975a[i21 + 1]);
            i20 = f(i20, 15) - ((((~i17) & i19) + (i18 & i17)) + this.f19975a[i21]);
        }
        int[] iArr2 = this.f19975a;
        int i22 = i17 - iArr2[i18 & 63];
        int i23 = i18 - iArr2[i19 & 63];
        int i24 = i19 - iArr2[i20 & 63];
        int i25 = i20 - iArr2[i22 & 63];
        for (int i26 = 16; i26 >= 0; i26 -= 4) {
            i22 = f(i22, 11) - ((((~i23) & i25) + (i24 & i23)) + this.f19975a[i26 + 3]);
            i23 = f(i23, 13) - ((((~i24) & i22) + (i25 & i24)) + this.f19975a[i26 + 2]);
            i24 = f(i24, 14) - ((((~i25) & i23) + (i22 & i25)) + this.f19975a[i26 + 1]);
            i25 = f(i25, 15) - ((((~i22) & i24) + (i23 & i22)) + this.f19975a[i26]);
        }
        bArr2[i11 + 0] = (byte) i25;
        bArr2[i11 + 1] = (byte) (i25 >> 8);
        bArr2[i11 + 2] = (byte) i24;
        bArr2[i11 + 3] = (byte) (i24 >> 8);
        bArr2[i11 + 4] = (byte) i23;
        bArr2[i11 + 5] = (byte) (i23 >> 8);
        bArr2[i11 + 6] = (byte) i22;
        bArr2[i11 + 7] = (byte) (i22 >> 8);
    }

    private void d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = ((bArr[i10 + 7] & 255) << 8) + (bArr[i10 + 6] & 255);
        int i13 = ((bArr[i10 + 5] & 255) << 8) + (bArr[i10 + 4] & 255);
        int i14 = ((bArr[i10 + 3] & 255) << 8) + (bArr[i10 + 2] & 255);
        int i15 = ((bArr[i10 + 1] & 255) << 8) + (bArr[i10 + 0] & 255);
        for (int i16 = 0; i16 <= 16; i16 += 4) {
            i15 = f(i15 + ((~i12) & i14) + (i13 & i12) + this.f19975a[i16], 1);
            i14 = f(i14 + ((~i15) & i13) + (i12 & i15) + this.f19975a[i16 + 1], 2);
            i13 = f(i13 + ((~i14) & i12) + (i15 & i14) + this.f19975a[i16 + 2], 3);
            i12 = f(i12 + ((~i13) & i15) + (i14 & i13) + this.f19975a[i16 + 3], 5);
        }
        int[] iArr = this.f19975a;
        int i17 = i15 + iArr[i12 & 63];
        int i18 = i14 + iArr[i17 & 63];
        int i19 = i13 + iArr[i18 & 63];
        int i20 = i12 + iArr[i19 & 63];
        for (int i21 = 20; i21 <= 40; i21 += 4) {
            i17 = f(i17 + ((~i20) & i18) + (i19 & i20) + this.f19975a[i21], 1);
            i18 = f(i18 + ((~i17) & i19) + (i20 & i17) + this.f19975a[i21 + 1], 2);
            i19 = f(i19 + ((~i18) & i20) + (i17 & i18) + this.f19975a[i21 + 2], 3);
            i20 = f(i20 + ((~i19) & i17) + (i18 & i19) + this.f19975a[i21 + 3], 5);
        }
        int[] iArr2 = this.f19975a;
        int i22 = i17 + iArr2[i20 & 63];
        int i23 = i18 + iArr2[i22 & 63];
        int i24 = i19 + iArr2[i23 & 63];
        int i25 = i20 + iArr2[i24 & 63];
        for (int i26 = 44; i26 < 64; i26 += 4) {
            i22 = f(i22 + ((~i25) & i23) + (i24 & i25) + this.f19975a[i26], 1);
            i23 = f(i23 + ((~i22) & i24) + (i25 & i22) + this.f19975a[i26 + 1], 2);
            i24 = f(i24 + ((~i23) & i25) + (i22 & i23) + this.f19975a[i26 + 2], 3);
            i25 = f(i25 + ((~i24) & i22) + (i23 & i24) + this.f19975a[i26 + 3], 5);
        }
        bArr2[i11 + 0] = (byte) i22;
        bArr2[i11 + 1] = (byte) (i22 >> 8);
        bArr2[i11 + 2] = (byte) i23;
        bArr2[i11 + 3] = (byte) (i23 >> 8);
        bArr2[i11 + 4] = (byte) i24;
        bArr2[i11 + 5] = (byte) (i24 >> 8);
        bArr2[i11 + 6] = (byte) i25;
        bArr2[i11 + 7] = (byte) (i25 >> 8);
    }

    private int[] e(byte[] bArr, int i10) {
        int[] iArr = new int[128];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i12 = iArr[length - 1];
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                i12 = f19974c[(i12 + iArr[i13]) & 255] & 255;
                int i15 = length + 1;
                iArr[length] = i12;
                if (i15 >= 128) {
                    break;
                }
                length = i15;
                i13 = i14;
            }
        }
        int i16 = (i10 + 7) >> 3;
        int i17 = 128 - i16;
        int i18 = f19974c[(255 >> ((-i10) & 7)) & iArr[i17]] & 255;
        iArr[i17] = i18;
        for (int i19 = i17 - 1; i19 >= 0; i19--) {
            i18 = f19974c[i18 ^ iArr[i19 + i16]] & 255;
            iArr[i19] = i18;
        }
        int[] iArr2 = new int[64];
        for (int i20 = 0; i20 != 64; i20++) {
            int i21 = i20 * 2;
            iArr2[i20] = iArr[i21] + (iArr[i21 + 1] << 8);
        }
        return iArr2;
    }

    private int f(int i10, int i11) {
        int i12 = i10 & 65535;
        return (i12 >> (16 - i11)) | (i12 << i11);
    }

    @Override // org.bouncycastle.crypto.e
    public final int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f19975a != null) {
            if (i10 + 8 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 8 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            if (this.f19976b) {
                d(bArr, i10, bArr2, i11);
                return 8;
            }
            c(bArr, i10, bArr2, i11);
            return 8;
        }
        throw new IllegalStateException("RC2 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f19976b = z10;
        if (iVar instanceof zh.j1) {
            zh.j1 j1Var = (zh.j1) iVar;
            this.f19975a = e(j1Var.a(), j1Var.b());
        } else if (iVar instanceof zh.b1) {
            byte[] a10 = ((zh.b1) iVar).a();
            this.f19975a = e(a10, a10.length * 8);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + iVar.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
