package qh;
/* loaded from: classes3.dex */
public class z0 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int f20252a;

    /* renamed from: b */
    private int f20253b;

    /* renamed from: c */
    private int f20254c;

    /* renamed from: d */
    private int f20255d;

    /* renamed from: e */
    private boolean f20256e = false;

    /* renamed from: f */
    private boolean f20257f;

    private int c(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] << 24) | ((bArr[i11] & 255) << 16);
        return (bArr[i12 + 1] & 255) | i13 | ((bArr[i12] & 255) << 8);
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        int i12 = -957401312;
        for (int i13 = 0; i13 != 32; i13++) {
            c11 -= (((c10 << 4) + this.f20254c) ^ (c10 + i12)) ^ ((c10 >>> 5) + this.f20255d);
            c10 -= (((c11 << 4) + this.f20252a) ^ (c11 + i12)) ^ ((c11 >>> 5) + this.f20253b);
            i12 += 1640531527;
        }
        g(c10, bArr2, i11);
        g(c11, bArr2, i11 + 4);
        return 8;
    }

    private int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        int i12 = c10;
        int i13 = 0;
        for (int i14 = 0; i14 != 32; i14++) {
            i13 -= 1640531527;
            i12 += (((c11 << 4) + this.f20252a) ^ (c11 + i13)) ^ ((c11 >>> 5) + this.f20253b);
            c11 += (((i12 << 4) + this.f20254c) ^ (i12 + i13)) ^ ((i12 >>> 5) + this.f20255d);
        }
        g(i12, bArr2, i11);
        g(c11, bArr2, i11 + 4);
        return 8;
    }

    private void f(byte[] bArr) {
        if (bArr.length == 16) {
            this.f20252a = c(bArr, 0);
            this.f20253b = c(bArr, 4);
            this.f20254c = c(bArr, 8);
            this.f20255d = c(bArr, 12);
            return;
        }
        throw new IllegalArgumentException("Key size must be 128 bits.");
    }

    private void g(int i10, byte[] bArr, int i11) {
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >>> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >>> 16);
        bArr[i13] = (byte) (i10 >>> 8);
        bArr[i13 + 1] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f20256e) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i11 + 8 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            return this.f20257f ? e(bArr, i10, bArr2, i11) : d(bArr, i10, bArr2, i11);
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20257f = z10;
            this.f20256e = true;
            f(((zh.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
