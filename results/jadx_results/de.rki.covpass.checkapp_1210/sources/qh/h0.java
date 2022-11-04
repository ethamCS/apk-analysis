package qh;
/* loaded from: classes3.dex */
public class h0 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int f20020a = 12;

    /* renamed from: b */
    private int[] f20021b = null;

    /* renamed from: c */
    private boolean f20022c;

    private int c(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        for (int i12 = this.f20020a; i12 >= 1; i12--) {
            int i13 = i12 * 2;
            c11 = g(c11 - this.f20021b[i13 + 1], c10) ^ c10;
            c10 = g(c10 - this.f20021b[i13], c11) ^ c11;
        }
        i(c10 - this.f20021b[0], bArr2, i11);
        i(c11 - this.f20021b[1], bArr2, i11 + 4);
        return 8;
    }

    private int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10) + this.f20021b[0];
        int c11 = c(bArr, i10 + 4) + this.f20021b[1];
        for (int i12 = 1; i12 <= this.f20020a; i12++) {
            int i13 = i12 * 2;
            c10 = f(c10 ^ c11, c11) + this.f20021b[i13];
            c11 = f(c11 ^ c10, c10) + this.f20021b[i13 + 1];
        }
        i(c10, bArr2, i11);
        i(c11, bArr2, i11 + 4);
        return 8;
    }

    private int f(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 >>> (32 - i12)) | (i10 << i12);
    }

    private int g(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 << (32 - i12)) | (i10 >>> i12);
    }

    private void h(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            int i11 = i10 / 4;
            iArr2[i11] = iArr2[i11] + ((bArr[i10] & 255) << ((i10 % 4) * 8));
        }
        int[] iArr3 = new int[(this.f20020a + 1) * 2];
        this.f20021b = iArr3;
        iArr3[0] = -1209970333;
        int i12 = 1;
        while (true) {
            iArr = this.f20021b;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = iArr[i12 - 1] - 1640531527;
            i12++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length2; i17++) {
            int[] iArr4 = this.f20021b;
            i14 = f(iArr4[i13] + i14 + i15, 3);
            iArr4[i13] = i14;
            i15 = f(iArr2[i16] + i14 + i15, i15 + i14);
            iArr2[i16] = i15;
            i13 = (i13 + 1) % this.f20021b.length;
            i16 = (i16 + 1) % length;
        }
    }

    private void i(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f20022c ? e(bArr, i10, bArr2, i11) : d(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.k1) {
            zh.k1 k1Var = (zh.k1) iVar;
            this.f20020a = k1Var.b();
            h(k1Var.a());
        } else if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + iVar.getClass().getName());
        } else {
            h(((zh.b1) iVar).a());
        }
        this.f20022c = z10;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
