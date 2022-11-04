package qh;
/* loaded from: classes3.dex */
public abstract class w0 implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    protected boolean f20213a;

    /* renamed from: b */
    protected int[] f20214b;

    /* renamed from: c */
    protected int f20215c;

    /* renamed from: d */
    protected int f20216d;

    /* renamed from: e */
    protected int f20217e;

    /* renamed from: f */
    protected int f20218f;

    public static int p(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    protected static int q(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    @Override // org.bouncycastle.crypto.e
    public final int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f20214b == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i11 + 16 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            if (this.f20213a) {
                e(bArr, i10, bArr2, i11);
                return 16;
            }
            d(bArr, i10, bArr2, i11);
            return 16;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return 16;
    }

    public final void c() {
        int p10 = p(this.f20215c, 13);
        int p11 = p(this.f20217e, 3);
        this.f20216d = p((this.f20216d ^ p10) ^ p11, 1);
        int p12 = p((this.f20218f ^ p11) ^ (p10 << 3), 7);
        this.f20218f = p12;
        this.f20215c = p((p10 ^ this.f20216d) ^ p12, 5);
        this.f20217e = p((this.f20218f ^ p11) ^ (this.f20216d << 7), 22);
    }

    protected abstract void d(byte[] bArr, int i10, byte[] bArr2, int i11);

    protected abstract void e(byte[] bArr, int i10, byte[] bArr2, int i11);

    public final void f(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i11 ^ i10;
        int i16 = (i14 | i15) ^ i13;
        int i17 = i12 ^ i16;
        int i18 = i15 ^ i17;
        this.f20217e = i18;
        int i19 = (i15 & i13) ^ i14;
        int i20 = (i18 & i19) ^ i16;
        this.f20216d = i20;
        int i21 = (i10 & i16) ^ (i20 | i17);
        this.f20218f = i21;
        this.f20215c = i21 ^ (i19 ^ i17);
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int i14 = i13 ^ i11;
        int i15 = i10 ^ (i11 & i14);
        int i16 = i14 ^ i15;
        int i17 = i12 ^ i16;
        this.f20218f = i17;
        int i18 = i11 ^ (i14 & i15);
        int i19 = i15 ^ (i17 | i18);
        this.f20216d = i19;
        int i20 = ~i19;
        int i21 = i18 ^ i17;
        this.f20215c = i20 ^ i21;
        this.f20217e = (i20 | i21) ^ i16;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Serpent";
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ i13;
        int i15 = ~i14;
        int i16 = i10 ^ i12;
        int i17 = i12 ^ i14;
        int i18 = (i11 & i17) ^ i16;
        this.f20215c = i18;
        int i19 = (((i10 | i15) ^ i13) | i16) ^ i14;
        this.f20218f = i19;
        int i20 = ~i17;
        int i21 = i19 | i18;
        this.f20216d = i20 ^ i21;
        this.f20217e = (i21 ^ i16) ^ (i13 & i20);
    }

    public final void i(int i10, int i11, int i12, int i13) {
        int i14 = i10 | i11;
        int i15 = i11 ^ i12;
        int i16 = i10 ^ (i11 & i15);
        int i17 = i12 ^ i16;
        int i18 = i13 | i16;
        int i19 = i15 ^ i18;
        this.f20215c = i19;
        int i20 = (i18 | i15) ^ i13;
        this.f20217e = i17 ^ i20;
        int i21 = i14 ^ i20;
        int i22 = i16 ^ (i19 & i21);
        this.f20218f = i22;
        this.f20216d = i22 ^ (i21 ^ i19);
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.b1) {
            this.f20213a = z10;
            this.f20214b = o(((zh.b1) iVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + iVar.getClass().getName());
    }

    public final void j(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ ((i12 | i13) & i10);
        int i15 = i12 ^ (i10 & i14);
        int i16 = i13 ^ i15;
        this.f20216d = i16;
        int i17 = ~i10;
        int i18 = (i15 & i16) ^ i14;
        this.f20218f = i18;
        int i19 = i13 ^ (i16 | i17);
        this.f20215c = i18 ^ i19;
        this.f20217e = (i17 ^ i16) ^ (i14 & i19);
    }

    public final void k(int i10, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = (i11 & i14) ^ i13;
        int i16 = i10 & i15;
        int i17 = (i11 ^ i14) ^ i16;
        this.f20218f = i17;
        int i18 = i17 | i11;
        this.f20216d = i15 ^ (i10 & i18);
        int i19 = i13 | i10;
        this.f20215c = (i14 ^ i18) ^ i19;
        this.f20217e = ((i10 ^ i12) | i16) ^ (i11 & i19);
    }

    public final void l(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i11;
        int i16 = i12 ^ i15;
        int i17 = (i12 | i14) ^ i13;
        this.f20216d = i16 ^ i17;
        int i18 = i15 ^ (i16 & i17);
        int i19 = i17 ^ (i11 | i18);
        this.f20218f = i19;
        int i20 = i11 | i19;
        this.f20215c = i18 ^ i20;
        this.f20217e = (i13 & i14) ^ (i20 ^ i16);
    }

    public final void m(int i10, int i11, int i12, int i13) {
        int i14 = (i10 & i11) | i12;
        int i15 = (i10 | i11) & i13;
        int i16 = i14 ^ i15;
        this.f20218f = i16;
        int i17 = i11 ^ i15;
        int i18 = ((i16 ^ (~i13)) | i17) ^ i10;
        this.f20216d = i18;
        int i19 = (i17 ^ i12) ^ (i13 | i18);
        this.f20215c = i19;
        this.f20217e = ((i10 & i16) ^ i19) ^ (i14 ^ i18);
    }

    public final void n() {
        int q10 = (q(this.f20217e, 22) ^ this.f20218f) ^ (this.f20216d << 7);
        int q11 = q(this.f20215c, 5) ^ this.f20216d;
        int i10 = this.f20218f;
        int i11 = q11 ^ i10;
        int q12 = q(i10, 7);
        int q13 = q(this.f20216d, 1);
        this.f20218f = (q12 ^ q10) ^ (i11 << 3);
        this.f20216d = (q13 ^ i11) ^ q10;
        this.f20217e = q(q10, 3);
        this.f20215c = q(i11, 13);
    }

    protected abstract int[] o(byte[] bArr);

    public final void r(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i13;
        int i15 = i12 ^ i14;
        int i16 = i11 ^ i15;
        int i17 = (i13 & i10) ^ i16;
        this.f20218f = i17;
        int i18 = i10 ^ (i11 & i14);
        this.f20217e = (i12 | i18) ^ i16;
        int i19 = (i15 ^ i18) & i17;
        this.f20216d = (~i15) ^ i19;
        this.f20215c = (~i18) ^ i19;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }

    public final void s(int i10, int i11, int i12, int i13) {
        int i14 = (~i10) ^ i11;
        int i15 = (i10 | i14) ^ i12;
        int i16 = i13 ^ i15;
        this.f20217e = i16;
        int i17 = i11 ^ (i13 | i14);
        int i18 = i16 ^ i14;
        int i19 = (i15 & i17) ^ i18;
        this.f20218f = i19;
        int i20 = i17 ^ i15;
        this.f20216d = i19 ^ i20;
        this.f20215c = i15 ^ (i20 & i18);
    }

    public final void t(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i11 ^ i13;
        int i16 = (i12 & i14) ^ i15;
        this.f20215c = i16;
        int i17 = i12 ^ i14;
        int i18 = i11 & (i12 ^ i16);
        int i19 = i17 ^ i18;
        this.f20218f = i19;
        int i20 = i10 ^ ((i18 | i13) & (i16 | i17));
        this.f20217e = i20;
        this.f20216d = (i20 ^ (i13 | i14)) ^ (i15 ^ i19);
    }

    public final void u(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i11;
        int i15 = i10 & i12;
        int i16 = i10 | i13;
        int i17 = i12 ^ i13;
        int i18 = i15 | (i14 & i16);
        int i19 = i17 ^ i18;
        this.f20217e = i19;
        int i20 = (i16 ^ i11) ^ i18;
        int i21 = i14 ^ (i17 & i20);
        this.f20215c = i21;
        int i22 = i21 & i19;
        this.f20216d = i20 ^ i22;
        this.f20218f = (i11 | i13) ^ (i17 ^ i22);
    }

    public final void v(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i13;
        int i15 = i12 ^ (i13 & i14);
        int i16 = i11 | i15;
        this.f20218f = i14 ^ i16;
        int i17 = ~i11;
        int i18 = (i14 | i17) ^ i15;
        this.f20215c = i18;
        int i19 = i17 ^ i14;
        int i20 = (i16 & i19) ^ (i18 & i10);
        this.f20217e = i20;
        this.f20216d = (i10 ^ i15) ^ (i19 & i20);
    }

    public final void w(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i11;
        int i16 = i10 ^ i13;
        int i17 = (i12 ^ i14) ^ (i15 | i16);
        this.f20215c = i17;
        int i18 = i13 & i17;
        int i19 = (i15 ^ i17) ^ i18;
        this.f20216d = i19;
        int i20 = i16 ^ (i17 | i14);
        this.f20217e = (i15 | i18) ^ i20;
        this.f20218f = (i20 & i19) ^ (i11 ^ i18);
    }

    public final void x(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i13;
        int i16 = i11 ^ i15;
        int i17 = i12 ^ (i14 | i15);
        int i18 = i11 ^ i17;
        this.f20216d = i18;
        int i19 = (i15 | i18) ^ i13;
        int i20 = (i17 & i19) ^ i16;
        this.f20217e = i20;
        int i21 = i19 ^ i17;
        this.f20215c = i20 ^ i21;
        this.f20218f = (i21 & i16) ^ (~i17);
    }

    public final void y(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ i12;
        int i15 = (i12 & i14) ^ i13;
        int i16 = i10 ^ i15;
        int i17 = i11 ^ ((i13 | i14) & i16);
        this.f20216d = i17;
        int i18 = (i10 & i16) ^ i14;
        this.f20218f = i18;
        int i19 = (i17 | i15) ^ i16;
        int i20 = i15 ^ (i18 & i19);
        this.f20217e = i20;
        this.f20215c = (i18 & i20) ^ (~i19);
    }
}
