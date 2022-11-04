package qh;
/* loaded from: classes3.dex */
public class x0 implements org.bouncycastle.crypto.e {

    /* renamed from: c */
    private static final int[] f20227c = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: a */
    private boolean f20228a = false;

    /* renamed from: b */
    private int[] f20229b = null;

    private void c(byte[] bArr, int[] iArr, int i10, int i11) {
        while (i11 < 8) {
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            iArr[i11] = i14 | ((bArr[i13] & 255) << 8) | (bArr[i15] & 255);
            i11++;
            i10 = i15 + 1;
        }
    }

    private void d(byte[] bArr, int[] iArr, int i10, int i11) {
        while (i11 < bArr.length / 4) {
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            iArr[i11] = i16 | (bArr[i15] & 255);
            i11++;
            i10 = i15 + 1;
        }
    }

    private void e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[8];
        c(bArr, iArr, i10, 0);
        for (int i12 = 63; i12 > -1; i12--) {
            int i13 = (iArr[0] - ((((iArr[1] >>> 2) | (iArr[1] << (-2))) ^ ((iArr[1] >>> 13) | (iArr[1] << (-13)))) ^ ((iArr[1] >>> 22) | (iArr[1] << (-22))))) - (((iArr[1] & iArr[2]) ^ (iArr[1] & iArr[3])) ^ (iArr[2] & iArr[3]));
            iArr[0] = iArr[1];
            iArr[1] = iArr[2];
            iArr[2] = iArr[3];
            iArr[3] = iArr[4] - i13;
            iArr[4] = iArr[5];
            iArr[5] = iArr[6];
            iArr[6] = iArr[7];
            iArr[7] = (((i13 - f20227c[i12]) - this.f20229b[i12]) - ((((iArr[4] >>> 6) | (iArr[4] << (-6))) ^ ((iArr[4] >>> 11) | (iArr[4] << (-11)))) ^ ((iArr[4] >>> 25) | (iArr[4] << (-25))))) - (((~iArr[4]) & iArr[6]) ^ (iArr[5] & iArr[4]));
        }
        g(iArr, bArr2, i11);
    }

    private void f(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[8];
        c(bArr, iArr, i10, 0);
        for (int i12 = 0; i12 < 64; i12++) {
            int i13 = ((((iArr[4] >>> 6) | (iArr[4] << (-6))) ^ ((iArr[4] >>> 11) | (iArr[4] << (-11)))) ^ ((iArr[4] >>> 25) | (iArr[4] << (-25)))) + ((iArr[4] & iArr[5]) ^ ((~iArr[4]) & iArr[6])) + iArr[7] + f20227c[i12] + this.f20229b[i12];
            iArr[7] = iArr[6];
            iArr[6] = iArr[5];
            iArr[5] = iArr[4];
            iArr[4] = iArr[3] + i13;
            iArr[3] = iArr[2];
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i13 + ((((iArr[0] >>> 2) | (iArr[0] << (-2))) ^ ((iArr[0] >>> 13) | (iArr[0] << (-13)))) ^ ((iArr[0] >>> 22) | (iArr[0] << (-22)))) + ((iArr[2] & iArr[3]) ^ ((iArr[0] & iArr[2]) ^ (iArr[0] & iArr[3])));
        }
        g(iArr, bArr2, i11);
    }

    private void g(int[] iArr, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = i10 + 1;
            bArr[i10] = (byte) (iArr[i11] >>> 24);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (iArr[i11] >>> 16);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (iArr[i11] >>> 8);
            i10 = i14 + 1;
            bArr[i14] = (byte) iArr[i11];
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f20229b != null) {
            if (i10 + 32 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 32 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            if (this.f20228a) {
                f(bArr, i10, bArr2, i11);
                return 32;
            }
            e(bArr, i10, bArr2, i11);
            return 32;
        }
        throw new IllegalStateException("Shacal2 not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Shacal2";
    }

    public void h(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                d(bArr, this.f20229b, 0, 0);
                for (int i10 = 16; i10 < 64; i10++) {
                    int[] iArr = this.f20229b;
                    int i11 = i10 - 2;
                    int i12 = i10 - 15;
                    iArr[i10] = ((iArr[i11] >>> 10) ^ (((iArr[i11] >>> 17) | (iArr[i11] << (-17))) ^ ((iArr[i11] >>> 19) | (iArr[i11] << (-19))))) + iArr[i10 - 7] + ((iArr[i12] >>> 3) ^ (((iArr[i12] >>> 7) | (iArr[i12] << (-7))) ^ ((iArr[i12] >>> 18) | (iArr[i12] << (-18))))) + iArr[i10 - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20228a = z10;
            this.f20229b = new int[64];
            h(((zh.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("only simple KeyParameter expected.");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
