package qh;
/* loaded from: classes3.dex */
public class h1 implements org.bouncycastle.crypto.h0, ak.i {

    /* renamed from: h */
    private static final byte[] f20023h = {62, 114, 91, 71, -54, -32, 0, 51, 4, -47, 84, -104, 9, -71, 109, -53, 123, 27, -7, 50, -81, -99, 106, -91, -72, 45, -4, 29, 8, 83, 3, -112, 77, 78, -124, -103, -28, -50, -39, -111, -35, -74, -123, 72, -117, 41, 110, -84, -51, -63, -8, 30, 115, 67, 105, -58, -75, -67, -3, 57, 99, 32, -44, 56, 118, 125, -78, -89, -49, -19, 87, -59, -13, 44, -69, 20, 33, 6, 85, -101, -29, -17, 94, 49, 79, Byte.MAX_VALUE, 90, -92, 13, -126, 81, 73, 95, -70, 88, 28, 74, 22, -43, 23, -88, -110, 36, 31, -116, -1, -40, -82, 46, 1, -45, -83, 59, 75, -38, 70, -21, -55, -34, -102, -113, -121, -41, 58, Byte.MIN_VALUE, 111, 47, -56, -79, -76, 55, -9, 10, 34, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, -65, 126, -16, 11, 43, -105, 82, 53, 65, 121, 97, -90, 76, 16, -2, -68, 38, -107, -120, -118, -80, -93, -5, -64, 24, -108, -14, -31, -27, -23, 93, -48, -36, 17, 102, 100, 92, -20, 89, 66, 117, 18, -11, 116, -100, -86, 35, 14, -122, -85, -66, 42, 2, -25, 103, -26, 68, -94, 108, -62, -109, -97, -15, -10, -6, 54, -46, 80, 104, -98, 98, 113, 21, 61, -42, 64, -60, -30, 15, -114, -125, 119, 107, 37, 5, 63, 12, 48, -22, 112, -73, -95, -24, -87, 101, -115, 39, 26, -37, -127, -77, -96, -12, 69, 122, 25, -33, -18, 120, 52, 96};

    /* renamed from: i */
    private static final byte[] f20024i = {85, -62, 99, 113, 59, -56, 71, -122, -97, 60, -38, 91, 41, -86, -3, 119, -116, -59, -108, 12, -90, 26, 19, 0, -29, -88, 22, 114, 64, -7, -8, 66, 68, 38, 104, -106, -127, -39, 69, 62, 16, 118, -58, -89, -117, 57, 67, -31, 58, -75, 86, 42, -64, 109, -77, 5, 34, 102, -65, -36, 11, -6, 98, 72, -35, 32, 17, 6, 54, -55, -63, -49, -10, 39, 82, -69, 105, -11, -44, -121, Byte.MAX_VALUE, -124, 76, -46, -100, 87, -92, -68, 79, -102, -33, -2, -42, -115, 122, -21, 43, 83, -40, 92, -95, 20, 23, -5, 35, -43, 125, 48, 103, 115, 8, 9, -18, -73, 112, 63, 97, -78, 25, -114, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, 13, -4, -12, 45, 70, 110, 29, -105, -24, -47, -23, 77, 55, -91, 117, 94, -125, -98, -85, -126, -99, -71, 28, -32, -51, 73, -119, 1, -74, -67, 88, 36, -94, 95, 56, 120, -103, 21, -112, 80, -72, -107, -28, -48, -111, -57, -50, -19, 15, -76, 111, -96, -52, -16, 2, 74, 121, -61, -34, -93, -17, -22, 81, -26, 107, 24, -20, 27, 44, Byte.MIN_VALUE, -9, 116, -25, -1, 33, 90, 106, 84, 30, 65, 49, -110, 53, -60, 51, 7, 10, -70, 126, 14, 52, -120, -79, -104, 124, -13, 61, 96, 108, 123, -54, -45, 31, 50, 101, 4, 40, 100, -66, -123, -101, 47, 89, -118, -41, -80, 37, -84, -81, 18, 3, -30, -14};

    /* renamed from: j */
    private static final short[] f20025j = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};

    /* renamed from: a */
    private final int[] f20026a;

    /* renamed from: b */
    private final int[] f20027b;

    /* renamed from: c */
    private final int[] f20028c;

    /* renamed from: d */
    private int f20029d;

    /* renamed from: e */
    private final byte[] f20030e;

    /* renamed from: f */
    private int f20031f;

    /* renamed from: g */
    private h1 f20032g;

    public h1() {
        this.f20026a = new int[16];
        this.f20027b = new int[2];
        this.f20028c = new int[4];
        this.f20030e = new byte[4];
    }

    public h1(h1 h1Var) {
        this.f20026a = new int[16];
        this.f20027b = new int[2];
        this.f20028c = new int[4];
        this.f20030e = new byte[4];
        b(h1Var);
    }

    private int c(int i10, int i11) {
        int i12 = i10 + i11;
        return (Integer.MAX_VALUE & i12) + (i12 >>> 31);
    }

    private void d() {
        int[] iArr = this.f20028c;
        int[] iArr2 = this.f20026a;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & 65535);
        iArr[1] = ((iArr2[11] & 65535) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & 65535) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & 65535) << 16);
    }

    private static int f(int i10) {
        return m(i10, 24) ^ (((m(i10, 2) ^ i10) ^ m(i10, 10)) ^ m(i10, 18));
    }

    private static int g(int i10) {
        return m(i10, 30) ^ (((m(i10, 8) ^ i10) ^ m(i10, 14)) ^ m(i10, 22));
    }

    private void h(int i10) {
        int[] iArr = this.f20026a;
        int c10 = c(c(c(c(c(c(iArr[0], l(iArr[0], 8)), l(this.f20026a[4], 20)), l(this.f20026a[10], 21)), l(this.f20026a[13], 17)), l(this.f20026a[15], 15)), i10);
        int[] iArr2 = this.f20026a;
        iArr2[0] = iArr2[1];
        iArr2[1] = iArr2[2];
        iArr2[2] = iArr2[3];
        iArr2[3] = iArr2[4];
        iArr2[4] = iArr2[5];
        iArr2[5] = iArr2[6];
        iArr2[6] = iArr2[7];
        iArr2[7] = iArr2[8];
        iArr2[8] = iArr2[9];
        iArr2[9] = iArr2[10];
        iArr2[10] = iArr2[11];
        iArr2[11] = iArr2[12];
        iArr2[12] = iArr2[13];
        iArr2[13] = iArr2[14];
        iArr2[14] = iArr2[15];
        iArr2[15] = c10;
    }

    private void i() {
        int[] iArr = this.f20026a;
        int c10 = c(c(c(c(c(iArr[0], l(iArr[0], 8)), l(this.f20026a[4], 20)), l(this.f20026a[10], 21)), l(this.f20026a[13], 17)), l(this.f20026a[15], 15));
        int[] iArr2 = this.f20026a;
        iArr2[0] = iArr2[1];
        iArr2[1] = iArr2[2];
        iArr2[2] = iArr2[3];
        iArr2[3] = iArr2[4];
        iArr2[4] = iArr2[5];
        iArr2[5] = iArr2[6];
        iArr2[6] = iArr2[7];
        iArr2[7] = iArr2[8];
        iArr2[8] = iArr2[9];
        iArr2[9] = iArr2[10];
        iArr2[10] = iArr2[11];
        iArr2[11] = iArr2[12];
        iArr2[12] = iArr2[13];
        iArr2[13] = iArr2[14];
        iArr2[14] = iArr2[15];
        iArr2[15] = c10;
    }

    private static int j(byte b10, short s10, byte b11) {
        return ((b10 & 255) << 23) | ((s10 & 65535) << 8) | (b11 & 255);
    }

    private static int k(byte b10, byte b11, byte b12, byte b13) {
        return ((b10 & 255) << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    private static int l(int i10, int i11) {
        return ((i10 >>> (31 - i11)) | (i10 << i11)) & Integer.MAX_VALUE;
    }

    static int m(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static void n(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    private void p() {
        n(q(), this.f20030e, 0);
    }

    private void s(byte[] bArr, byte[] bArr2) {
        t(this.f20026a, bArr, bArr2);
        int[] iArr = this.f20027b;
        iArr[0] = 0;
        iArr[1] = 0;
        int i10 = 32;
        while (true) {
            d();
            if (i10 <= 0) {
                e();
                i();
                return;
            }
            h(e() >>> 1);
            i10--;
        }
    }

    @Override // ak.i
    public ak.i a() {
        return new h1(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        h1 h1Var = (h1) iVar;
        int[] iArr = h1Var.f20026a;
        int[] iArr2 = this.f20026a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = h1Var.f20027b;
        int[] iArr4 = this.f20027b;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = h1Var.f20028c;
        int[] iArr6 = this.f20028c;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = h1Var.f20030e;
        byte[] bArr2 = this.f20030e;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f20029d = h1Var.f20029d;
        this.f20031f = h1Var.f20031f;
        this.f20032g = h1Var;
    }

    int e() {
        int[] iArr = this.f20028c;
        int i10 = iArr[0];
        int[] iArr2 = this.f20027b;
        int i11 = (i10 ^ iArr2[0]) + iArr2[1];
        int i12 = iArr2[0] + iArr[1];
        int i13 = iArr[2] ^ iArr2[1];
        int f10 = f((i12 << 16) | (i13 >>> 16));
        int g10 = g((i13 << 16) | (i12 >>> 16));
        int[] iArr3 = this.f20027b;
        byte[] bArr = f20023h;
        byte b10 = bArr[f10 >>> 24];
        byte[] bArr2 = f20024i;
        iArr3[0] = k(b10, bArr2[(f10 >>> 16) & 255], bArr[(f10 >>> 8) & 255], bArr2[f10 & 255]);
        this.f20027b[1] = k(bArr[g10 >>> 24], bArr2[(g10 >>> 16) & 255], bArr[(g10 >>> 8) & 255], bArr2[g10 & 255]);
        return i11;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "Zuc-128";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            bArr = f1Var.a();
            iVar = f1Var.b();
        } else {
            bArr = null;
        }
        if (iVar instanceof zh.b1) {
            bArr2 = ((zh.b1) iVar).a();
        }
        this.f20029d = 0;
        this.f20031f = 0;
        s(bArr2, bArr);
        this.f20032g = (h1) a();
    }

    protected int o() {
        return 2047;
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (this.f20032g == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + i11 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                bArr2[i13 + i12] = r(bArr[i13 + i10]);
            }
            return i11;
        }
    }

    public int q() {
        int i10 = this.f20031f;
        this.f20031f = i10 + 1;
        if (i10 < o()) {
            d();
            int e10 = e() ^ this.f20028c[3];
            i();
            return e10;
        }
        throw new IllegalStateException("Too much data processed by singleKey/IV");
    }

    public byte r(byte b10) {
        if (this.f20029d == 0) {
            p();
        }
        byte[] bArr = this.f20030e;
        int i10 = this.f20029d;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        this.f20029d = (i10 + 1) % 4;
        return b11;
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        h1 h1Var = this.f20032g;
        if (h1Var != null) {
            b(h1Var);
        }
    }

    protected void t(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("A key of 16 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        }
        int[] iArr2 = this.f20026a;
        byte b10 = bArr[0];
        short[] sArr = f20025j;
        iArr2[0] = j(b10, sArr[0], bArr2[0]);
        this.f20026a[1] = j(bArr[1], sArr[1], bArr2[1]);
        this.f20026a[2] = j(bArr[2], sArr[2], bArr2[2]);
        this.f20026a[3] = j(bArr[3], sArr[3], bArr2[3]);
        this.f20026a[4] = j(bArr[4], sArr[4], bArr2[4]);
        this.f20026a[5] = j(bArr[5], sArr[5], bArr2[5]);
        this.f20026a[6] = j(bArr[6], sArr[6], bArr2[6]);
        this.f20026a[7] = j(bArr[7], sArr[7], bArr2[7]);
        this.f20026a[8] = j(bArr[8], sArr[8], bArr2[8]);
        this.f20026a[9] = j(bArr[9], sArr[9], bArr2[9]);
        this.f20026a[10] = j(bArr[10], sArr[10], bArr2[10]);
        this.f20026a[11] = j(bArr[11], sArr[11], bArr2[11]);
        this.f20026a[12] = j(bArr[12], sArr[12], bArr2[12]);
        this.f20026a[13] = j(bArr[13], sArr[13], bArr2[13]);
        this.f20026a[14] = j(bArr[14], sArr[14], bArr2[14]);
        this.f20026a[15] = j(bArr[15], sArr[15], bArr2[15]);
    }
}
