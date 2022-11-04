package nh;
/* loaded from: classes3.dex */
public class v extends h {

    /* renamed from: d */
    private int f17296d;

    /* renamed from: e */
    private int f17297e;

    /* renamed from: f */
    private int f17298f;

    /* renamed from: g */
    private int f17299g;

    /* renamed from: h */
    private int f17300h;

    /* renamed from: i */
    private int[] f17301i;

    /* renamed from: j */
    private int f17302j;

    public v() {
        this.f17301i = new int[80];
        reset();
    }

    public v(v vVar) {
        super(vVar);
        this.f17301i = new int[80];
        i(vVar);
    }

    private void i(v vVar) {
        this.f17296d = vVar.f17296d;
        this.f17297e = vVar.f17297e;
        this.f17298f = vVar.f17298f;
        this.f17299g = vVar.f17299g;
        this.f17300h = vVar.f17300h;
        int[] iArr = vVar.f17301i;
        System.arraycopy(iArr, 0, this.f17301i, 0, iArr.length);
        this.f17302j = vVar.f17302j;
    }

    private int j(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int k(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    private int l(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    @Override // ak.i
    public ak.i a() {
        return new v(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        v vVar = (v) iVar;
        super.d(vVar);
        i(vVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        ak.l.f(this.f17296d, bArr, i10);
        ak.l.f(this.f17297e, bArr, i10 + 4);
        ak.l.f(this.f17298f, bArr, i10 + 8);
        ak.l.f(this.f17299g, bArr, i10 + 12);
        ak.l.f(this.f17300h, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // nh.h
    protected void f() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        for (int i22 = 16; i22 < 80; i22++) {
            int[] iArr = this.f17301i;
            int i23 = ((iArr[i22 - 3] ^ iArr[i22 - 8]) ^ iArr[i22 - 14]) ^ iArr[i22 - 16];
            iArr[i22] = (i23 >>> 31) | (i23 << 1);
        }
        int i24 = this.f17296d;
        int i25 = this.f17297e;
        int i26 = this.f17298f;
        int i27 = this.f17299g;
        int i28 = this.f17300h;
        int i29 = 0;
        int i30 = 0;
        while (i29 < 4) {
            int i31 = i30 + 1;
            int j10 = i28 + ((i24 << 5) | (i24 >>> 27)) + j(i25, i26, i27) + this.f17301i[i30] + 1518500249;
            int i32 = (i25 >>> 2) | (i25 << 30);
            int i33 = i31 + 1;
            int j11 = i27 + ((j10 << 5) | (j10 >>> 27)) + j(i24, i32, i26) + this.f17301i[i31] + 1518500249;
            int i34 = (i24 >>> 2) | (i24 << 30);
            int i35 = i33 + 1;
            int j12 = i26 + ((j11 << 5) | (j11 >>> 27)) + j(j10, i34, i32) + this.f17301i[i33] + 1518500249;
            i28 = (j10 >>> 2) | (j10 << 30);
            int i36 = i35 + 1;
            i25 = i32 + ((j12 << 5) | (j12 >>> 27)) + j(j11, i28, i34) + this.f17301i[i35] + 1518500249;
            i27 = (j11 >>> 2) | (j11 << 30);
            i24 = i34 + ((i25 << 5) | (i25 >>> 27)) + j(j12, i27, i28) + this.f17301i[i36] + 1518500249;
            i26 = (j12 >>> 2) | (j12 << 30);
            i29++;
            i30 = i36 + 1;
        }
        int i37 = 0;
        while (i37 < 4) {
            int i38 = i30 + 1;
            int l10 = i28 + ((i24 << 5) | (i24 >>> 27)) + l(i25, i26, i27) + this.f17301i[i30] + 1859775393;
            int i39 = (i25 >>> 2) | (i25 << 30);
            int i40 = i38 + 1;
            int l11 = i27 + ((l10 << 5) | (l10 >>> 27)) + l(i24, i39, i26) + this.f17301i[i38] + 1859775393;
            int i41 = (i24 >>> 2) | (i24 << 30);
            int i42 = i40 + 1;
            int l12 = i26 + ((l11 << 5) | (l11 >>> 27)) + l(l10, i41, i39) + this.f17301i[i40] + 1859775393;
            i28 = (l10 >>> 2) | (l10 << 30);
            int i43 = i42 + 1;
            i25 = i39 + ((l12 << 5) | (l12 >>> 27)) + l(l11, i28, i41) + this.f17301i[i42] + 1859775393;
            i27 = (l11 >>> 2) | (l11 << 30);
            i24 = i41 + ((i25 << 5) | (i25 >>> 27)) + l(l12, i27, i28) + this.f17301i[i43] + 1859775393;
            i26 = (l12 >>> 2) | (l12 << 30);
            i37++;
            i30 = i43 + 1;
        }
        int i44 = 0;
        while (i44 < 4) {
            int k10 = i28 + (((((i24 << 5) | (i24 >>> 27)) + k(i25, i26, i27)) + this.f17301i[i30]) - 1894007588);
            int k11 = i27 + (((((k10 << 5) | (k10 >>> 27)) + k(i24, i17, i26)) + this.f17301i[i16]) - 1894007588);
            int k12 = i26 + (((((k11 << 5) | (k11 >>> 27)) + k(k10, i19, i17)) + this.f17301i[i18]) - 1894007588);
            i28 = (k10 >>> 2) | (k10 << 30);
            i25 = ((i25 >>> 2) | (i25 << 30)) + (((((k12 << 5) | (k12 >>> 27)) + k(k11, i28, i19)) + this.f17301i[i20]) - 1894007588);
            i27 = (k11 >>> 2) | (k11 << 30);
            i24 = ((i24 >>> 2) | (i24 << 30)) + (((((i25 << 5) | (i25 >>> 27)) + k(k12, i27, i28)) + this.f17301i[i21]) - 1894007588);
            i26 = (k12 >>> 2) | (k12 << 30);
            i44++;
            i30 = i30 + 1 + 1 + 1 + 1 + 1;
        }
        int i45 = 0;
        while (i45 <= 3) {
            int l13 = i28 + (((((i24 << 5) | (i24 >>> 27)) + l(i25, i26, i27)) + this.f17301i[i30]) - 899497514);
            int l14 = i27 + (((((l13 << 5) | (l13 >>> 27)) + l(i24, i11, i26)) + this.f17301i[i10]) - 899497514);
            int l15 = i26 + (((((l14 << 5) | (l14 >>> 27)) + l(l13, i13, i11)) + this.f17301i[i12]) - 899497514);
            i28 = (l13 >>> 2) | (l13 << 30);
            i25 = ((i25 >>> 2) | (i25 << 30)) + (((((l15 << 5) | (l15 >>> 27)) + l(l14, i28, i13)) + this.f17301i[i14]) - 899497514);
            i27 = (l14 >>> 2) | (l14 << 30);
            i24 = ((i24 >>> 2) | (i24 << 30)) + (((((i25 << 5) | (i25 >>> 27)) + l(l15, i27, i28)) + this.f17301i[i15]) - 899497514);
            i26 = (l15 >>> 2) | (l15 << 30);
            i45++;
            i30 = i30 + 1 + 1 + 1 + 1 + 1;
        }
        this.f17296d += i24;
        this.f17297e += i25;
        this.f17298f += i26;
        this.f17299g += i27;
        this.f17300h += i28;
        this.f17302j = 0;
        for (int i46 = 0; i46 < 16; i46++) {
            this.f17301i[i46] = 0;
        }
    }

    @Override // nh.h
    protected void g(long j10) {
        if (this.f17302j > 14) {
            f();
        }
        int[] iArr = this.f17301i;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 20;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i12 + 1] & 255) | (bArr[i10] << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        int[] iArr = this.f17301i;
        int i14 = this.f17302j;
        iArr[i14] = i13;
        int i15 = i14 + 1;
        this.f17302j = i15;
        if (i15 == 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17296d = 1732584193;
        this.f17297e = -271733879;
        this.f17298f = -1732584194;
        this.f17299g = 271733878;
        this.f17300h = -1009589776;
        this.f17302j = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17301i;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
