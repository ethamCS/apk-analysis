package nh;
/* loaded from: classes3.dex */
public class x extends h {

    /* renamed from: n */
    static final int[] f17314n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    private int f17315d;

    /* renamed from: e */
    private int f17316e;

    /* renamed from: f */
    private int f17317f;

    /* renamed from: g */
    private int f17318g;

    /* renamed from: h */
    private int f17319h;

    /* renamed from: i */
    private int f17320i;

    /* renamed from: j */
    private int f17321j;

    /* renamed from: k */
    private int f17322k;

    /* renamed from: l */
    private int[] f17323l;

    /* renamed from: m */
    private int f17324m;

    public x() {
        this.f17323l = new int[64];
        reset();
    }

    public x(x xVar) {
        super(xVar);
        this.f17323l = new int[64];
        o(xVar);
    }

    private static int i(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    private static int j(int i10, int i11, int i12) {
        return ((i10 ^ i11) & i12) | (i10 & i11);
    }

    private static int k(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    private static int l(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    private static int m(int i10) {
        return (i10 >>> 3) ^ (((i10 >>> 7) | (i10 << 25)) ^ ((i10 >>> 18) | (i10 << 14)));
    }

    private static int n(int i10) {
        return (i10 >>> 10) ^ (((i10 >>> 17) | (i10 << 15)) ^ ((i10 >>> 19) | (i10 << 13)));
    }

    private void o(x xVar) {
        super.d(xVar);
        this.f17315d = xVar.f17315d;
        this.f17316e = xVar.f17316e;
        this.f17317f = xVar.f17317f;
        this.f17318g = xVar.f17318g;
        this.f17319h = xVar.f17319h;
        this.f17320i = xVar.f17320i;
        this.f17321j = xVar.f17321j;
        this.f17322k = xVar.f17322k;
        int[] iArr = xVar.f17323l;
        System.arraycopy(iArr, 0, this.f17323l, 0, iArr.length);
        this.f17324m = xVar.f17324m;
    }

    @Override // ak.i
    public ak.i a() {
        return new x(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        o((x) iVar);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        ak.l.f(this.f17315d, bArr, i10);
        ak.l.f(this.f17316e, bArr, i10 + 4);
        ak.l.f(this.f17317f, bArr, i10 + 8);
        ak.l.f(this.f17318g, bArr, i10 + 12);
        ak.l.f(this.f17319h, bArr, i10 + 16);
        ak.l.f(this.f17320i, bArr, i10 + 20);
        ak.l.f(this.f17321j, bArr, i10 + 24);
        ak.l.f(this.f17322k, bArr, i10 + 28);
        reset();
        return 32;
    }

    @Override // nh.h
    protected void f() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f17323l;
            int n10 = n(iArr[i10 - 2]);
            int[] iArr2 = this.f17323l;
            iArr[i10] = n10 + iArr2[i10 - 7] + m(iArr2[i10 - 15]) + this.f17323l[i10 - 16];
        }
        int i11 = this.f17315d;
        int i12 = this.f17316e;
        int i13 = this.f17317f;
        int i14 = this.f17318g;
        int i15 = this.f17319h;
        int i16 = this.f17320i;
        int i17 = this.f17321j;
        int i18 = this.f17322k;
        int i19 = 0;
        for (int i20 = 0; i20 < 8; i20++) {
            int l10 = l(i15) + i(i15, i16, i17);
            int[] iArr3 = f17314n;
            int i21 = i18 + l10 + iArr3[i19] + this.f17323l[i19];
            int i22 = i14 + i21;
            int k10 = i21 + k(i11) + j(i11, i12, i13);
            int i23 = i19 + 1;
            int l11 = i17 + l(i22) + i(i22, i15, i16) + iArr3[i23] + this.f17323l[i23];
            int i24 = i13 + l11;
            int k11 = l11 + k(k10) + j(k10, i11, i12);
            int i25 = i23 + 1;
            int l12 = i16 + l(i24) + i(i24, i22, i15) + iArr3[i25] + this.f17323l[i25];
            int i26 = i12 + l12;
            int k12 = l12 + k(k11) + j(k11, k10, i11);
            int i27 = i25 + 1;
            int l13 = i15 + l(i26) + i(i26, i24, i22) + iArr3[i27] + this.f17323l[i27];
            int i28 = i11 + l13;
            int k13 = l13 + k(k12) + j(k12, k11, k10);
            int i29 = i27 + 1;
            int l14 = i22 + l(i28) + i(i28, i26, i24) + iArr3[i29] + this.f17323l[i29];
            i18 = k10 + l14;
            i14 = l14 + k(k13) + j(k13, k12, k11);
            int i30 = i29 + 1;
            int l15 = i24 + l(i18) + i(i18, i28, i26) + iArr3[i30] + this.f17323l[i30];
            i17 = k11 + l15;
            i13 = l15 + k(i14) + j(i14, k13, k12);
            int i31 = i30 + 1;
            int l16 = i26 + l(i17) + i(i17, i18, i28) + iArr3[i31] + this.f17323l[i31];
            i16 = k12 + l16;
            i12 = l16 + k(i13) + j(i13, i14, k13);
            int i32 = i31 + 1;
            int l17 = i28 + l(i16) + i(i16, i17, i18) + iArr3[i32] + this.f17323l[i32];
            i15 = k13 + l17;
            i11 = l17 + k(i12) + j(i12, i13, i14);
            i19 = i32 + 1;
        }
        this.f17315d += i11;
        this.f17316e += i12;
        this.f17317f += i13;
        this.f17318g += i14;
        this.f17319h += i15;
        this.f17320i += i16;
        this.f17321j += i17;
        this.f17322k += i18;
        this.f17324m = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            this.f17323l[i33] = 0;
        }
    }

    @Override // nh.h
    protected void g(long j10) {
        if (this.f17324m > 14) {
            f();
        }
        int[] iArr = this.f17323l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) (j10 & (-1));
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 32;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i12 + 1] & 255) | (bArr[i10] << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        int[] iArr = this.f17323l;
        int i14 = this.f17324m;
        iArr[i14] = i13;
        int i15 = i14 + 1;
        this.f17324m = i15;
        if (i15 == 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        this.f17315d = 1779033703;
        this.f17316e = -1150833019;
        this.f17317f = 1013904242;
        this.f17318g = -1521486534;
        this.f17319h = 1359893119;
        this.f17320i = -1694144372;
        this.f17321j = 528734635;
        this.f17322k = 1541459225;
        this.f17324m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17323l;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}