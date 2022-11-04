package nh;
/* loaded from: classes3.dex */
public class o extends h {

    /* renamed from: d */
    private int f17248d;

    /* renamed from: e */
    private int f17249e;

    /* renamed from: f */
    private int f17250f;

    /* renamed from: g */
    private int f17251g;

    /* renamed from: h */
    private int[] f17252h;

    /* renamed from: i */
    private int f17253i;

    public o() {
        this.f17252h = new int[16];
        reset();
    }

    public o(o oVar) {
        super(oVar);
        this.f17252h = new int[16];
        l(oVar);
    }

    private int i(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int j(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    private int k(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private void l(o oVar) {
        super.d(oVar);
        this.f17248d = oVar.f17248d;
        this.f17249e = oVar.f17249e;
        this.f17250f = oVar.f17250f;
        this.f17251g = oVar.f17251g;
        int[] iArr = oVar.f17252h;
        System.arraycopy(iArr, 0, this.f17252h, 0, iArr.length);
        this.f17253i = oVar.f17253i;
    }

    private int m(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void n(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // ak.i
    public ak.i a() {
        return new o(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        l((o) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        n(this.f17248d, bArr, i10);
        n(this.f17249e, bArr, i10 + 4);
        n(this.f17250f, bArr, i10 + 8);
        n(this.f17251g, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // nh.h
    protected void f() {
        int i10 = this.f17248d;
        int i11 = this.f17249e;
        int i12 = this.f17250f;
        int i13 = this.f17251g;
        int m10 = m(i10 + i(i11, i12, i13) + this.f17252h[0], 3);
        int m11 = m(i13 + i(m10, i11, i12) + this.f17252h[1], 7);
        int m12 = m(i12 + i(m11, m10, i11) + this.f17252h[2], 11);
        int m13 = m(i11 + i(m12, m11, m10) + this.f17252h[3], 19);
        int m14 = m(m10 + i(m13, m12, m11) + this.f17252h[4], 3);
        int m15 = m(m11 + i(m14, m13, m12) + this.f17252h[5], 7);
        int m16 = m(m12 + i(m15, m14, m13) + this.f17252h[6], 11);
        int m17 = m(m13 + i(m16, m15, m14) + this.f17252h[7], 19);
        int m18 = m(m14 + i(m17, m16, m15) + this.f17252h[8], 3);
        int m19 = m(m15 + i(m18, m17, m16) + this.f17252h[9], 7);
        int m20 = m(m16 + i(m19, m18, m17) + this.f17252h[10], 11);
        int m21 = m(m17 + i(m20, m19, m18) + this.f17252h[11], 19);
        int m22 = m(m18 + i(m21, m20, m19) + this.f17252h[12], 3);
        int m23 = m(m19 + i(m22, m21, m20) + this.f17252h[13], 7);
        int m24 = m(m20 + i(m23, m22, m21) + this.f17252h[14], 11);
        int m25 = m(m21 + i(m24, m23, m22) + this.f17252h[15], 19);
        int m26 = m(m22 + j(m25, m24, m23) + this.f17252h[0] + 1518500249, 3);
        int m27 = m(m23 + j(m26, m25, m24) + this.f17252h[4] + 1518500249, 5);
        int m28 = m(m24 + j(m27, m26, m25) + this.f17252h[8] + 1518500249, 9);
        int m29 = m(m25 + j(m28, m27, m26) + this.f17252h[12] + 1518500249, 13);
        int m30 = m(m26 + j(m29, m28, m27) + this.f17252h[1] + 1518500249, 3);
        int m31 = m(m27 + j(m30, m29, m28) + this.f17252h[5] + 1518500249, 5);
        int m32 = m(m28 + j(m31, m30, m29) + this.f17252h[9] + 1518500249, 9);
        int m33 = m(m29 + j(m32, m31, m30) + this.f17252h[13] + 1518500249, 13);
        int m34 = m(m30 + j(m33, m32, m31) + this.f17252h[2] + 1518500249, 3);
        int m35 = m(m31 + j(m34, m33, m32) + this.f17252h[6] + 1518500249, 5);
        int m36 = m(m32 + j(m35, m34, m33) + this.f17252h[10] + 1518500249, 9);
        int m37 = m(m33 + j(m36, m35, m34) + this.f17252h[14] + 1518500249, 13);
        int m38 = m(m34 + j(m37, m36, m35) + this.f17252h[3] + 1518500249, 3);
        int m39 = m(m35 + j(m38, m37, m36) + this.f17252h[7] + 1518500249, 5);
        int m40 = m(m36 + j(m39, m38, m37) + this.f17252h[11] + 1518500249, 9);
        int m41 = m(m37 + j(m40, m39, m38) + this.f17252h[15] + 1518500249, 13);
        int m42 = m(m38 + k(m41, m40, m39) + this.f17252h[0] + 1859775393, 3);
        int m43 = m(m39 + k(m42, m41, m40) + this.f17252h[8] + 1859775393, 9);
        int m44 = m(m40 + k(m43, m42, m41) + this.f17252h[4] + 1859775393, 11);
        int m45 = m(m41 + k(m44, m43, m42) + this.f17252h[12] + 1859775393, 15);
        int m46 = m(m42 + k(m45, m44, m43) + this.f17252h[2] + 1859775393, 3);
        int m47 = m(m43 + k(m46, m45, m44) + this.f17252h[10] + 1859775393, 9);
        int m48 = m(m44 + k(m47, m46, m45) + this.f17252h[6] + 1859775393, 11);
        int m49 = m(m45 + k(m48, m47, m46) + this.f17252h[14] + 1859775393, 15);
        int m50 = m(m46 + k(m49, m48, m47) + this.f17252h[1] + 1859775393, 3);
        int m51 = m(m47 + k(m50, m49, m48) + this.f17252h[9] + 1859775393, 9);
        int m52 = m(m48 + k(m51, m50, m49) + this.f17252h[5] + 1859775393, 11);
        int m53 = m(m49 + k(m52, m51, m50) + this.f17252h[13] + 1859775393, 15);
        int m54 = m(m50 + k(m53, m52, m51) + this.f17252h[3] + 1859775393, 3);
        int m55 = m(m51 + k(m54, m53, m52) + this.f17252h[11] + 1859775393, 9);
        int m56 = m(m52 + k(m55, m54, m53) + this.f17252h[7] + 1859775393, 11);
        int m57 = m(m53 + k(m56, m55, m54) + this.f17252h[15] + 1859775393, 15);
        this.f17248d += m54;
        this.f17249e += m57;
        this.f17250f += m56;
        this.f17251g += m55;
        this.f17253i = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f17252h;
            if (i14 != iArr.length) {
                iArr[i14] = 0;
                i14++;
            } else {
                return;
            }
        }
    }

    @Override // nh.h
    protected void g(long j10) {
        if (this.f17253i > 14) {
            f();
        }
        int[] iArr = this.f17252h;
        iArr[14] = (int) ((-1) & j10);
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 16;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int[] iArr = this.f17252h;
        int i11 = this.f17253i;
        int i12 = i11 + 1;
        this.f17253i = i12;
        iArr[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17248d = 1732584193;
        this.f17249e = -271733879;
        this.f17250f = -1732584194;
        this.f17251g = 271733878;
        this.f17253i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17252h;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
