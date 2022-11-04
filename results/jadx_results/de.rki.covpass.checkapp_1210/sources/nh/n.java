package nh;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class n implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: g */
    private static final byte[] f17241g = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* renamed from: a */
    private byte[] f17242a;

    /* renamed from: b */
    private int f17243b;

    /* renamed from: c */
    private byte[] f17244c;

    /* renamed from: d */
    private int f17245d;

    /* renamed from: e */
    private byte[] f17246e;

    /* renamed from: f */
    private int f17247f;

    public n() {
        this.f17242a = new byte[48];
        this.f17244c = new byte[16];
        this.f17246e = new byte[16];
        reset();
    }

    public n(n nVar) {
        this.f17242a = new byte[48];
        this.f17244c = new byte[16];
        this.f17246e = new byte[16];
        d(nVar);
    }

    private void d(n nVar) {
        byte[] bArr = nVar.f17242a;
        System.arraycopy(bArr, 0, this.f17242a, 0, bArr.length);
        this.f17243b = nVar.f17243b;
        byte[] bArr2 = nVar.f17244c;
        System.arraycopy(bArr2, 0, this.f17244c, 0, bArr2.length);
        this.f17245d = nVar.f17245d;
        byte[] bArr3 = nVar.f17246e;
        System.arraycopy(bArr3, 0, this.f17246e, 0, bArr3.length);
        this.f17247f = nVar.f17247f;
    }

    @Override // ak.i
    public ak.i a() {
        return new n(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        d((n) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        int length = this.f17244c.length;
        int i11 = this.f17245d;
        byte b10 = (byte) (length - i11);
        while (true) {
            byte[] bArr2 = this.f17244c;
            if (i11 >= bArr2.length) {
                f(bArr2);
                e(this.f17244c);
                e(this.f17246e);
                System.arraycopy(this.f17242a, this.f17243b, bArr, i10, 16);
                reset();
                return 16;
            }
            bArr2[i11] = b10;
            i11++;
        }
    }

    protected void e(byte[] bArr) {
        for (int i10 = 0; i10 < 16; i10++) {
            byte[] bArr2 = this.f17242a;
            bArr2[i10 + 16] = bArr[i10];
            bArr2[i10 + 32] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 18; i12++) {
            for (int i13 = 0; i13 < 48; i13++) {
                byte[] bArr3 = this.f17242a;
                byte b10 = (byte) (f17241g[i11] ^ bArr3[i13]);
                bArr3[i13] = b10;
                i11 = b10 & 255;
            }
            i11 = (i11 + i12) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    protected void f(byte[] bArr) {
        byte b10 = this.f17246e[15];
        for (int i10 = 0; i10 < 16; i10++) {
            byte[] bArr2 = this.f17246e;
            bArr2[i10] = (byte) (f17241g[(b10 ^ bArr[i10]) & 255] ^ bArr2[i10]);
            b10 = bArr2[i10];
        }
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17243b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f17242a;
            if (i10 == bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        this.f17245d = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f17244c;
            if (i11 == bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        this.f17247f = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f17246e;
            if (i12 != bArr3.length) {
                bArr3[i12] = 0;
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        byte[] bArr = this.f17244c;
        int i10 = this.f17245d;
        int i11 = i10 + 1;
        this.f17245d = i11;
        bArr[i10] = b10;
        if (i11 == 16) {
            f(bArr);
            e(this.f17244c);
            this.f17245d = 0;
        }
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f17245d != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > 16) {
            System.arraycopy(bArr, i10, this.f17244c, 0, 16);
            f(this.f17244c);
            e(this.f17244c);
            i11 -= 16;
            i10 += 16;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
