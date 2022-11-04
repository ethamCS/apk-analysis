package nh;
/* loaded from: classes3.dex */
public class r extends h {

    /* renamed from: d */
    private int f17261d;

    /* renamed from: e */
    private int f17262e;

    /* renamed from: f */
    private int f17263f;

    /* renamed from: g */
    private int f17264g;

    /* renamed from: h */
    private int[] f17265h;

    /* renamed from: i */
    private int f17266i;

    public r() {
        this.f17265h = new int[16];
        reset();
    }

    public r(r rVar) {
        super(rVar);
        this.f17265h = new int[16];
        r(rVar);
    }

    private int i(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + s(i11, i12, i13) + i14, i15);
    }

    private int j(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + t(i11, i12, i13) + i14 + 1518500249, i15);
    }

    private int k(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + u(i11, i12, i13) + i14 + 1859775393, i15);
    }

    private int l(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(((i10 + v(i11, i12, i13)) + i14) - 1894007588, i15);
    }

    private int m(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + s(i11, i12, i13) + i14, i15);
    }

    private int n(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + t(i11, i12, i13) + i14 + 1836072691, i15);
    }

    private int o(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + u(i11, i12, i13) + i14 + 1548603684, i15);
    }

    private int p(int i10, int i11, int i12, int i13, int i14, int i15) {
        return q(i10 + v(i11, i12, i13) + i14 + 1352829926, i15);
    }

    private int q(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void r(r rVar) {
        super.d(rVar);
        this.f17261d = rVar.f17261d;
        this.f17262e = rVar.f17262e;
        this.f17263f = rVar.f17263f;
        this.f17264g = rVar.f17264g;
        int[] iArr = rVar.f17265h;
        System.arraycopy(iArr, 0, this.f17265h, 0, iArr.length);
        this.f17266i = rVar.f17266i;
    }

    private int s(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int t(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int u(int i10, int i11, int i12) {
        return (i10 | (~i11)) ^ i12;
    }

    private int v(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    private void w(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // ak.i
    public ak.i a() {
        return new r(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        r((r) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        w(this.f17261d, bArr, i10);
        w(this.f17262e, bArr, i10 + 4);
        w(this.f17263f, bArr, i10 + 8);
        w(this.f17264g, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // nh.h
    protected void f() {
        int i10 = this.f17261d;
        int i11 = this.f17262e;
        int i12 = this.f17263f;
        int i13 = this.f17264g;
        int i14 = i(i10, i11, i12, i13, this.f17265h[0], 11);
        int i15 = i(i13, i14, i11, i12, this.f17265h[1], 14);
        int i16 = i(i12, i15, i14, i11, this.f17265h[2], 15);
        int i17 = i(i11, i16, i15, i14, this.f17265h[3], 12);
        int i18 = i(i14, i17, i16, i15, this.f17265h[4], 5);
        int i19 = i(i15, i18, i17, i16, this.f17265h[5], 8);
        int i20 = i(i16, i19, i18, i17, this.f17265h[6], 7);
        int i21 = i(i17, i20, i19, i18, this.f17265h[7], 9);
        int i22 = i(i18, i21, i20, i19, this.f17265h[8], 11);
        int i23 = i(i19, i22, i21, i20, this.f17265h[9], 13);
        int i24 = i(i20, i23, i22, i21, this.f17265h[10], 14);
        int i25 = i(i21, i24, i23, i22, this.f17265h[11], 15);
        int i26 = i(i22, i25, i24, i23, this.f17265h[12], 6);
        int i27 = i(i23, i26, i25, i24, this.f17265h[13], 7);
        int i28 = i(i24, i27, i26, i25, this.f17265h[14], 9);
        int i29 = i(i25, i28, i27, i26, this.f17265h[15], 8);
        int j10 = j(i26, i29, i28, i27, this.f17265h[7], 7);
        int j11 = j(i27, j10, i29, i28, this.f17265h[4], 6);
        int j12 = j(i28, j11, j10, i29, this.f17265h[13], 8);
        int j13 = j(i29, j12, j11, j10, this.f17265h[1], 13);
        int j14 = j(j10, j13, j12, j11, this.f17265h[10], 11);
        int j15 = j(j11, j14, j13, j12, this.f17265h[6], 9);
        int j16 = j(j12, j15, j14, j13, this.f17265h[15], 7);
        int j17 = j(j13, j16, j15, j14, this.f17265h[3], 15);
        int j18 = j(j14, j17, j16, j15, this.f17265h[12], 7);
        int j19 = j(j15, j18, j17, j16, this.f17265h[0], 12);
        int j20 = j(j16, j19, j18, j17, this.f17265h[9], 15);
        int j21 = j(j17, j20, j19, j18, this.f17265h[5], 9);
        int j22 = j(j18, j21, j20, j19, this.f17265h[2], 11);
        int j23 = j(j19, j22, j21, j20, this.f17265h[14], 7);
        int j24 = j(j20, j23, j22, j21, this.f17265h[11], 13);
        int j25 = j(j21, j24, j23, j22, this.f17265h[8], 12);
        int k10 = k(j22, j25, j24, j23, this.f17265h[3], 11);
        int k11 = k(j23, k10, j25, j24, this.f17265h[10], 13);
        int k12 = k(j24, k11, k10, j25, this.f17265h[14], 6);
        int k13 = k(j25, k12, k11, k10, this.f17265h[4], 7);
        int k14 = k(k10, k13, k12, k11, this.f17265h[9], 14);
        int k15 = k(k11, k14, k13, k12, this.f17265h[15], 9);
        int k16 = k(k12, k15, k14, k13, this.f17265h[8], 13);
        int k17 = k(k13, k16, k15, k14, this.f17265h[1], 15);
        int k18 = k(k14, k17, k16, k15, this.f17265h[2], 14);
        int k19 = k(k15, k18, k17, k16, this.f17265h[7], 8);
        int k20 = k(k16, k19, k18, k17, this.f17265h[0], 13);
        int k21 = k(k17, k20, k19, k18, this.f17265h[6], 6);
        int k22 = k(k18, k21, k20, k19, this.f17265h[13], 5);
        int k23 = k(k19, k22, k21, k20, this.f17265h[11], 12);
        int k24 = k(k20, k23, k22, k21, this.f17265h[5], 7);
        int k25 = k(k21, k24, k23, k22, this.f17265h[12], 5);
        int l10 = l(k22, k25, k24, k23, this.f17265h[1], 11);
        int l11 = l(k23, l10, k25, k24, this.f17265h[9], 12);
        int l12 = l(k24, l11, l10, k25, this.f17265h[11], 14);
        int l13 = l(k25, l12, l11, l10, this.f17265h[10], 15);
        int l14 = l(l10, l13, l12, l11, this.f17265h[0], 14);
        int l15 = l(l11, l14, l13, l12, this.f17265h[8], 15);
        int l16 = l(l12, l15, l14, l13, this.f17265h[12], 9);
        int l17 = l(l13, l16, l15, l14, this.f17265h[4], 8);
        int l18 = l(l14, l17, l16, l15, this.f17265h[13], 9);
        int l19 = l(l15, l18, l17, l16, this.f17265h[3], 14);
        int l20 = l(l16, l19, l18, l17, this.f17265h[7], 5);
        int l21 = l(l17, l20, l19, l18, this.f17265h[15], 6);
        int l22 = l(l18, l21, l20, l19, this.f17265h[14], 8);
        int l23 = l(l19, l22, l21, l20, this.f17265h[5], 6);
        int l24 = l(l20, l23, l22, l21, this.f17265h[6], 5);
        int l25 = l(l21, l24, l23, l22, this.f17265h[2], 12);
        int p10 = p(i10, i11, i12, i13, this.f17265h[5], 8);
        int p11 = p(i13, p10, i11, i12, this.f17265h[14], 9);
        int p12 = p(i12, p11, p10, i11, this.f17265h[7], 9);
        int p13 = p(i11, p12, p11, p10, this.f17265h[0], 11);
        int p14 = p(p10, p13, p12, p11, this.f17265h[9], 13);
        int p15 = p(p11, p14, p13, p12, this.f17265h[2], 15);
        int p16 = p(p12, p15, p14, p13, this.f17265h[11], 15);
        int p17 = p(p13, p16, p15, p14, this.f17265h[4], 5);
        int p18 = p(p14, p17, p16, p15, this.f17265h[13], 7);
        int p19 = p(p15, p18, p17, p16, this.f17265h[6], 7);
        int p20 = p(p16, p19, p18, p17, this.f17265h[15], 8);
        int p21 = p(p17, p20, p19, p18, this.f17265h[8], 11);
        int p22 = p(p18, p21, p20, p19, this.f17265h[1], 14);
        int p23 = p(p19, p22, p21, p20, this.f17265h[10], 14);
        int p24 = p(p20, p23, p22, p21, this.f17265h[3], 12);
        int p25 = p(p21, p24, p23, p22, this.f17265h[12], 6);
        int o10 = o(p22, p25, p24, p23, this.f17265h[6], 9);
        int o11 = o(p23, o10, p25, p24, this.f17265h[11], 13);
        int o12 = o(p24, o11, o10, p25, this.f17265h[3], 15);
        int o13 = o(p25, o12, o11, o10, this.f17265h[7], 7);
        int o14 = o(o10, o13, o12, o11, this.f17265h[0], 12);
        int o15 = o(o11, o14, o13, o12, this.f17265h[13], 8);
        int o16 = o(o12, o15, o14, o13, this.f17265h[5], 9);
        int o17 = o(o13, o16, o15, o14, this.f17265h[10], 11);
        int o18 = o(o14, o17, o16, o15, this.f17265h[14], 7);
        int o19 = o(o15, o18, o17, o16, this.f17265h[15], 7);
        int o20 = o(o16, o19, o18, o17, this.f17265h[8], 12);
        int o21 = o(o17, o20, o19, o18, this.f17265h[12], 7);
        int o22 = o(o18, o21, o20, o19, this.f17265h[4], 6);
        int o23 = o(o19, o22, o21, o20, this.f17265h[9], 15);
        int o24 = o(o20, o23, o22, o21, this.f17265h[1], 13);
        int o25 = o(o21, o24, o23, o22, this.f17265h[2], 11);
        int n10 = n(o22, o25, o24, o23, this.f17265h[15], 9);
        int n11 = n(o23, n10, o25, o24, this.f17265h[5], 7);
        int n12 = n(o24, n11, n10, o25, this.f17265h[1], 15);
        int n13 = n(o25, n12, n11, n10, this.f17265h[3], 11);
        int n14 = n(n10, n13, n12, n11, this.f17265h[7], 8);
        int n15 = n(n11, n14, n13, n12, this.f17265h[14], 6);
        int n16 = n(n12, n15, n14, n13, this.f17265h[6], 6);
        int n17 = n(n13, n16, n15, n14, this.f17265h[9], 14);
        int n18 = n(n14, n17, n16, n15, this.f17265h[11], 12);
        int n19 = n(n15, n18, n17, n16, this.f17265h[8], 13);
        int n20 = n(n16, n19, n18, n17, this.f17265h[12], 5);
        int n21 = n(n17, n20, n19, n18, this.f17265h[2], 14);
        int n22 = n(n18, n21, n20, n19, this.f17265h[10], 13);
        int n23 = n(n19, n22, n21, n20, this.f17265h[0], 13);
        int n24 = n(n20, n23, n22, n21, this.f17265h[4], 7);
        int n25 = n(n21, n24, n23, n22, this.f17265h[13], 5);
        int m10 = m(n22, n25, n24, n23, this.f17265h[8], 15);
        int m11 = m(n23, m10, n25, n24, this.f17265h[6], 5);
        int m12 = m(n24, m11, m10, n25, this.f17265h[4], 8);
        int m13 = m(n25, m12, m11, m10, this.f17265h[1], 11);
        int m14 = m(m10, m13, m12, m11, this.f17265h[3], 14);
        int m15 = m(m11, m14, m13, m12, this.f17265h[11], 14);
        int m16 = m(m12, m15, m14, m13, this.f17265h[15], 6);
        int m17 = m(m13, m16, m15, m14, this.f17265h[0], 14);
        int m18 = m(m14, m17, m16, m15, this.f17265h[5], 6);
        int m19 = m(m15, m18, m17, m16, this.f17265h[12], 9);
        int m20 = m(m16, m19, m18, m17, this.f17265h[2], 12);
        int m21 = m(m17, m20, m19, m18, this.f17265h[13], 9);
        int m22 = m(m18, m21, m20, m19, this.f17265h[9], 12);
        int m23 = m(m19, m22, m21, m20, this.f17265h[7], 5);
        int m24 = m(m20, m23, m22, m21, this.f17265h[10], 15);
        int m25 = m(m21, m24, m23, m22, this.f17265h[14], 8);
        this.f17262e = this.f17263f + l23 + m22;
        this.f17263f = this.f17264g + l22 + m25;
        this.f17264g = this.f17261d + l25 + m24;
        this.f17261d = m23 + l24 + this.f17262e;
        this.f17266i = 0;
        int i30 = 0;
        while (true) {
            int[] iArr = this.f17265h;
            if (i30 != iArr.length) {
                iArr[i30] = 0;
                i30++;
            } else {
                return;
            }
        }
    }

    @Override // nh.h
    protected void g(long j10) {
        if (this.f17266i > 14) {
            f();
        }
        int[] iArr = this.f17265h;
        iArr[14] = (int) ((-1) & j10);
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 16;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int[] iArr = this.f17265h;
        int i11 = this.f17266i;
        int i12 = i11 + 1;
        this.f17266i = i12;
        iArr[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17261d = 1732584193;
        this.f17262e = -271733879;
        this.f17263f = -1732584194;
        this.f17264g = 271733878;
        this.f17266i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17265h;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
