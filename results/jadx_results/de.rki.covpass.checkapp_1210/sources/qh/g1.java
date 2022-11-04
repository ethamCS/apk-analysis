package qh;
/* loaded from: classes3.dex */
public class g1 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int[] f20002a = new int[4];

    /* renamed from: b */
    private int[] f20003b = new int[32];

    /* renamed from: c */
    private int[] f20004c = new int[32];

    /* renamed from: d */
    private boolean f20005d = false;

    /* renamed from: e */
    private boolean f20006e;

    private int c(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] << 24) | ((bArr[i11] & 255) << 16);
        return (bArr[i12 + 1] & 255) | i13 | ((bArr[i12] & 255) << 8);
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        for (int i12 = 31; i12 >= 0; i12--) {
            c11 -= (((c10 << 4) ^ (c10 >>> 5)) + c10) ^ this.f20004c[i12];
            c10 -= (((c11 << 4) ^ (c11 >>> 5)) + c11) ^ this.f20003b[i12];
        }
        g(c10, bArr2, i11);
        g(c11, bArr2, i11 + 4);
        return 8;
    }

    private int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        for (int i12 = 0; i12 < 32; i12++) {
            c10 += (((c11 << 4) ^ (c11 >>> 5)) + c11) ^ this.f20003b[i12];
            c11 += (((c10 << 4) ^ (c10 >>> 5)) + c10) ^ this.f20004c[i12];
        }
        g(c10, bArr2, i11);
        g(c11, bArr2, i11 + 4);
        return 8;
    }

    private void f(byte[] bArr) {
        if (bArr.length == 16) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 4) {
                this.f20002a[i10] = c(bArr, i11);
                i10++;
                i11 += 4;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                int[] iArr = this.f20003b;
                int[] iArr2 = this.f20002a;
                iArr[i13] = iArr2[i12 & 3] + i12;
                i12 -= 1640531527;
                this.f20004c[i13] = iArr2[(i12 >>> 11) & 3] + i12;
            }
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
        if (!this.f20005d) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i11 + 8 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            return this.f20006e ? e(bArr, i10, bArr2, i11) : d(bArr, i10, bArr2, i11);
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20006e = z10;
            this.f20005d = true;
            f(((zh.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
