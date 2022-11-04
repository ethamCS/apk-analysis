package qh;
/* loaded from: classes3.dex */
public class y0 implements org.bouncycastle.crypto.e {

    /* renamed from: f */
    static short[] f20238f = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};

    /* renamed from: a */
    private int[] f20239a;

    /* renamed from: b */
    private int[] f20240b;

    /* renamed from: c */
    private int[] f20241c;

    /* renamed from: d */
    private int[] f20242d;

    /* renamed from: e */
    private boolean f20243e;

    private int e(int i10, int i11) {
        int i12 = i11 & 255;
        short[] sArr = f20238f;
        int i13 = ((i11 >> 8) & 255) ^ sArr[this.f20239a[i10] ^ i12];
        int i14 = i12 ^ sArr[this.f20240b[i10] ^ i13];
        int i15 = i13 ^ sArr[this.f20241c[i10] ^ i14];
        return (i15 << 8) + (sArr[this.f20242d[i10] ^ i15] ^ i14);
    }

    private int f(int i10, int i11) {
        int i12 = i11 & 255;
        int i13 = (i11 >> 8) & 255;
        short[] sArr = f20238f;
        int i14 = i12 ^ sArr[this.f20242d[i10] ^ i13];
        int i15 = i13 ^ sArr[this.f20241c[i10] ^ i14];
        int i16 = i14 ^ sArr[this.f20240b[i10] ^ i15];
        return ((sArr[this.f20239a[i10] ^ i16] ^ i15) << 8) + i16;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f20240b != null) {
            if (i10 + 8 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 8 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            if (this.f20243e) {
                d(bArr, i10, bArr2, i11);
                return 8;
            }
            c(bArr, i10, bArr2, i11);
            return 8;
        }
        throw new IllegalStateException("SKIPJACK engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    public int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = (bArr[i10 + 0] << 8) + (bArr[i10 + 1] & 255);
        int i13 = (bArr[i10 + 2] << 8) + (bArr[i10 + 3] & 255);
        int i14 = (bArr[i10 + 4] << 8) + (bArr[i10 + 5] & 255);
        int i15 = (bArr[i10 + 6] << 8) + (bArr[i10 + 7] & 255);
        int i16 = 31;
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = 0;
            while (i18 < 8) {
                int f10 = f(i16, i13);
                i16--;
                i18++;
                int i19 = i15;
                i15 = i12;
                i12 = f10;
                i13 = (i14 ^ f10) ^ (i16 + 1);
                i14 = i19;
            }
            int i20 = 0;
            while (i20 < 8) {
                int f11 = f(i16, i13);
                i16--;
                i20++;
                int i21 = i15;
                i15 = (i12 ^ i13) ^ (i16 + 1);
                i12 = f11;
                i13 = i14;
                i14 = i21;
            }
        }
        bArr2[i11 + 0] = (byte) (i12 >> 8);
        bArr2[i11 + 1] = (byte) i12;
        bArr2[i11 + 2] = (byte) (i13 >> 8);
        bArr2[i11 + 3] = (byte) i13;
        bArr2[i11 + 4] = (byte) (i14 >> 8);
        bArr2[i11 + 5] = (byte) i14;
        bArr2[i11 + 6] = (byte) (i15 >> 8);
        bArr2[i11 + 7] = (byte) i15;
        return 8;
    }

    public int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = (bArr[i10 + 0] << 8) + (bArr[i10 + 1] & 255);
        int i13 = (bArr[i10 + 2] << 8) + (bArr[i10 + 3] & 255);
        int i14 = (bArr[i10 + 4] << 8) + (bArr[i10 + 5] & 255);
        int i15 = (bArr[i10 + 6] << 8) + (bArr[i10 + 7] & 255);
        int i16 = 0;
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = 0;
            while (i18 < 8) {
                int e10 = e(i16, i12);
                i16++;
                i18++;
                int i19 = i13;
                i13 = e10;
                i12 = (i15 ^ e10) ^ i16;
                i15 = i14;
                i14 = i19;
            }
            int i20 = 0;
            while (i20 < 8) {
                int i21 = i16 + 1;
                int i22 = (i13 ^ i12) ^ i21;
                int e11 = e(i16, i12);
                i20++;
                i16 = i21;
                i13 = e11;
                i12 = i15;
                i15 = i14;
                i14 = i22;
            }
        }
        bArr2[i11 + 0] = (byte) (i12 >> 8);
        bArr2[i11 + 1] = (byte) i12;
        bArr2[i11 + 2] = (byte) (i13 >> 8);
        bArr2[i11 + 3] = (byte) i13;
        bArr2[i11 + 4] = (byte) (i14 >> 8);
        bArr2[i11 + 5] = (byte) i14;
        bArr2[i11 + 6] = (byte) (i15 >> 8);
        bArr2[i11 + 7] = (byte) i15;
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + iVar.getClass().getName());
        }
        byte[] a10 = ((zh.b1) iVar).a();
        this.f20243e = z10;
        this.f20239a = new int[32];
        this.f20240b = new int[32];
        this.f20241c = new int[32];
        this.f20242d = new int[32];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = i10 * 4;
            this.f20239a[i10] = a10[i11 % 10] & 255;
            this.f20240b[i10] = a10[(i11 + 1) % 10] & 255;
            this.f20241c[i10] = a10[(i11 + 2) % 10] & 255;
            this.f20242d[i10] = a10[(i11 + 3) % 10] & 255;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
