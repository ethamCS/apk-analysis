package qh;
/* loaded from: classes3.dex */
public class j0 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int[] f20052a = null;

    /* renamed from: b */
    private boolean f20053b;

    private int c(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 3; i12 >= 0; i12--) {
            i11 = (i11 << 8) + (bArr[i12 + i10] & 255);
        }
        return i11;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        int c12 = c(bArr, i10 + 8);
        int c13 = c(bArr, i10 + 12);
        int[] iArr = this.f20052a;
        int i12 = c12 - iArr[43];
        int i13 = c10 - iArr[42];
        int i14 = 20;
        while (i14 >= 1) {
            int f10 = f(((i13 * 2) + 1) * i13, 5);
            int f11 = f(((i12 * 2) + 1) * i12, 5);
            int i15 = i14 * 2;
            i14--;
            int i16 = i13;
            i13 = g(c13 - this.f20052a[i15], f11) ^ f10;
            c13 = i12;
            i12 = g(c11 - this.f20052a[i15 + 1], f10) ^ f11;
            c11 = i16;
        }
        int[] iArr2 = this.f20052a;
        i(i13, bArr2, i11);
        i(c11 - iArr2[0], bArr2, i11 + 4);
        i(i12, bArr2, i11 + 8);
        i(c13 - iArr2[1], bArr2, i11 + 12);
        return 16;
    }

    private int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        int c12 = c(bArr, i10 + 8);
        int c13 = c(bArr, i10 + 12);
        int[] iArr = this.f20052a;
        int i12 = c11 + iArr[0];
        int i13 = c13 + iArr[1];
        int i14 = 1;
        while (i14 <= 20) {
            int f10 = f(((i12 * 2) + 1) * i12, 5);
            int f11 = f(((i13 * 2) + 1) * i13, 5);
            int i15 = i14 * 2;
            int f12 = f(c12 ^ f11, f10) + this.f20052a[i15 + 1];
            i14++;
            c12 = i13;
            i13 = f(c10 ^ f10, f11) + this.f20052a[i15];
            c10 = i12;
            i12 = f12;
        }
        int[] iArr2 = this.f20052a;
        int i16 = c12 + iArr2[43];
        i(c10 + iArr2[42], bArr2, i11);
        i(i12, bArr2, i11 + 4);
        i(i16, bArr2, i11 + 8);
        i(i13, bArr2, i11 + 12);
        return 16;
    }

    private int f(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private int g(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private void h(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int length2 = ((bArr.length + 4) - 1) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i10 = length3 / 4;
            iArr2[i10] = (iArr2[i10] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this.f20052a = iArr3;
        iArr3[0] = -1209970333;
        int i11 = 1;
        while (true) {
            iArr = this.f20052a;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = iArr[i11 - 1] - 1640531527;
            i11++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length4; i16++) {
            int[] iArr4 = this.f20052a;
            i13 = f(iArr4[i12] + i13 + i14, 3);
            iArr4[i12] = i13;
            i14 = f(iArr2[i15] + i13 + i14, i14 + i13);
            iArr2[i15] = i14;
            i12 = (i12 + 1) % this.f20052a.length;
            i15 = (i15 + 1) % length2;
        }
    }

    private void i(int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i12 + i11] = (byte) i10;
            i10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b();
        if (this.f20052a != null) {
            if (i10 + b10 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (b10 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            return this.f20053b ? e(bArr, i10, bArr2, i11) : d(bArr, i10, bArr2, i11);
        }
        throw new IllegalStateException("RC6 engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20053b = z10;
            h(((zh.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
