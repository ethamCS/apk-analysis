package qh;
/* loaded from: classes3.dex */
public class i0 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int f20038a = 12;

    /* renamed from: b */
    private long[] f20039b = null;

    /* renamed from: c */
    private boolean f20040c;

    private long c(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = 7; i11 >= 0; i11--) {
            j10 = (j10 << 8) + (bArr[i11 + i10] & 255);
        }
        return j10;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        long c10 = c(bArr, i10);
        long c11 = c(bArr, i10 + 8);
        for (int i12 = this.f20038a; i12 >= 1; i12--) {
            int i13 = i12 * 2;
            c11 = g(c11 - this.f20039b[i13 + 1], c10) ^ c10;
            c10 = g(c10 - this.f20039b[i13], c11) ^ c11;
        }
        i(c10 - this.f20039b[0], bArr2, i11);
        i(c11 - this.f20039b[1], bArr2, i11 + 8);
        return 16;
    }

    private int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        long c10 = c(bArr, i10) + this.f20039b[0];
        long c11 = c(bArr, i10 + 8) + this.f20039b[1];
        for (int i12 = 1; i12 <= this.f20038a; i12++) {
            int i13 = i12 * 2;
            c10 = f(c10 ^ c11, c11) + this.f20039b[i13];
            c11 = f(c11 ^ c10, c10) + this.f20039b[i13 + 1];
        }
        i(c10, bArr2, i11);
        i(c11, bArr2, i11 + 8);
        return 16;
    }

    private long f(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 >>> ((int) (64 - j12))) | (j10 << ((int) j12));
    }

    private long g(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 << ((int) (64 - j12))) | (j10 >>> ((int) j12));
    }

    private void h(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            int i11 = i10 / 8;
            jArr2[i11] = jArr2[i11] + ((bArr[i10] & 255) << ((i10 % 8) * 8));
        }
        long[] jArr3 = new long[(this.f20038a + 1) * 2];
        this.f20039b = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i12 = 1;
        while (true) {
            jArr = this.f20039b;
            if (i12 >= jArr.length) {
                break;
            }
            jArr[i12] = jArr[i12 - 1] - 7046029254386353131L;
            i12++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long j10 = 0;
        long j11 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15++) {
            long[] jArr4 = this.f20039b;
            j10 = f(jArr4[i13] + j10 + j11, 3L);
            jArr4[i13] = j10;
            j11 = f(jArr2[i14] + j10 + j11, j11 + j10);
            jArr2[i14] = j11;
            i13 = (i13 + 1) % this.f20039b.length;
            i14 = (i14 + 1) % length;
        }
    }

    private void i(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i11 + i10] = (byte) j10;
            j10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f20040c ? e(bArr, i10, bArr2, i11) : d(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.k1)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + iVar.getClass().getName());
        }
        zh.k1 k1Var = (zh.k1) iVar;
        this.f20040c = z10;
        this.f20038a = k1Var.b();
        h(k1Var.a());
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}
