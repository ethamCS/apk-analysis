package qh;
/* loaded from: classes3.dex */
public class t0 implements org.bouncycastle.crypto.e {

    /* renamed from: c */
    private static final byte[] f20173c = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, Byte.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, Byte.MAX_VALUE, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* renamed from: d */
    private static final int[] f20174d = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* renamed from: e */
    private static final int[] f20175e = {-1548633402, 1453994832, 1736282519, -1301273892};

    /* renamed from: a */
    private final int[] f20176a = new int[4];

    /* renamed from: b */
    private int[] f20177b;

    private int c(int[] iArr, int i10) {
        return i((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i10) ^ iArr[0];
    }

    private int d(int[] iArr, int i10) {
        return i((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i10) ^ iArr[1];
    }

    private int e(int[] iArr, int i10) {
        return i((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i10) ^ iArr[2];
    }

    private int f(int[] iArr, int i10) {
        return i((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i10) ^ iArr[3];
    }

    private int g(int i10) {
        return l(i10, 24) ^ (((l(i10, 2) ^ i10) ^ l(i10, 10)) ^ l(i10, 18));
    }

    private int h(int i10) {
        return l(i10, 23) ^ (l(i10, 13) ^ i10);
    }

    private int i(int i10) {
        return g(m(i10));
    }

    private int j(int i10) {
        return h(m(i10));
    }

    private int[] k(boolean z10, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {ak.l.a(bArr, 0), ak.l.a(bArr, 4), ak.l.a(bArr, 8), ak.l.a(bArr, 12)};
        int i10 = iArr2[0];
        int[] iArr3 = f20175e;
        int[] iArr4 = {i10 ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z10) {
            int i11 = iArr4[0];
            int i12 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = f20174d;
            iArr[0] = i11 ^ j(i12 ^ iArr5[0]);
            iArr[1] = iArr4[1] ^ j(((iArr4[2] ^ iArr4[3]) ^ iArr[0]) ^ iArr5[1]);
            iArr[2] = iArr4[2] ^ j(((iArr4[3] ^ iArr[0]) ^ iArr[1]) ^ iArr5[2]);
            iArr[3] = iArr4[3] ^ j(((iArr[0] ^ iArr[1]) ^ iArr[2]) ^ iArr5[3]);
            for (int i13 = 4; i13 < 32; i13++) {
                iArr[i13] = iArr[i13 - 4] ^ j(((iArr[i13 - 3] ^ iArr[i13 - 2]) ^ iArr[i13 - 1]) ^ f20174d[i13]);
            }
        } else {
            int i14 = iArr4[0];
            int i15 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = f20174d;
            iArr[31] = i14 ^ j(i15 ^ iArr6[0]);
            iArr[30] = iArr4[1] ^ j(((iArr4[2] ^ iArr4[3]) ^ iArr[31]) ^ iArr6[1]);
            iArr[29] = iArr4[2] ^ j(((iArr4[3] ^ iArr[31]) ^ iArr[30]) ^ iArr6[2]);
            iArr[28] = iArr4[3] ^ j(((iArr[31] ^ iArr[30]) ^ iArr[29]) ^ iArr6[3]);
            for (int i16 = 27; i16 >= 0; i16--) {
                iArr[i16] = iArr[i16 + 4] ^ j(((iArr[i16 + 3] ^ iArr[i16 + 2]) ^ iArr[i16 + 1]) ^ f20174d[31 - i16]);
            }
        }
        return iArr;
    }

    private int l(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private int m(int i10) {
        byte[] bArr = f20173c;
        return (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 24) & 255] & 255) << 24) | ((bArr[(i10 >> 16) & 255] & 255) << 16) | ((bArr[(i10 >> 8) & 255] & 255) << 8);
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f20177b != null) {
            if (i10 + 16 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 16 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            this.f20176a[0] = ak.l.a(bArr, i10);
            this.f20176a[1] = ak.l.a(bArr, i10 + 4);
            this.f20176a[2] = ak.l.a(bArr, i10 + 8);
            this.f20176a[3] = ak.l.a(bArr, i10 + 12);
            for (int i12 = 0; i12 < 32; i12 += 4) {
                int[] iArr = this.f20176a;
                iArr[0] = c(iArr, this.f20177b[i12]);
                int[] iArr2 = this.f20176a;
                iArr2[1] = d(iArr2, this.f20177b[i12 + 1]);
                int[] iArr3 = this.f20176a;
                iArr3[2] = e(iArr3, this.f20177b[i12 + 2]);
                int[] iArr4 = this.f20176a;
                iArr4[3] = f(iArr4, this.f20177b[i12 + 3]);
            }
            ak.l.f(this.f20176a[3], bArr2, i11);
            ak.l.f(this.f20176a[2], bArr2, i11 + 4);
            ak.l.f(this.f20176a[1], bArr2, i11 + 8);
            ak.l.f(this.f20176a[0], bArr2, i11 + 12);
            return 16;
        }
        throw new IllegalStateException("SM4 not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + iVar.getClass().getName());
        }
        byte[] a10 = ((zh.b1) iVar).a();
        if (a10.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.f20177b = k(z10, a10);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
