package nh;
/* loaded from: classes3.dex */
public class d0 extends h {

    /* renamed from: h */
    private static final int[] f17138h = new int[64];

    /* renamed from: d */
    private int[] f17139d;

    /* renamed from: e */
    private int[] f17140e;

    /* renamed from: f */
    private int f17141f;

    /* renamed from: g */
    private int[] f17142g;

    static {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 < 16) {
                f17138h[i11] = (2043430169 >>> (32 - i11)) | (2043430169 << i11);
                i11++;
            }
        }
        for (i10 = 16; i10 < 64; i10++) {
            int i12 = i10 % 32;
            f17138h[i10] = (2055708042 >>> (32 - i12)) | (2055708042 << i12);
        }
    }

    public d0() {
        this.f17139d = new int[8];
        this.f17140e = new int[16];
        this.f17142g = new int[68];
        reset();
    }

    public d0(d0 d0Var) {
        super(d0Var);
        this.f17139d = new int[8];
        this.f17140e = new int[16];
        this.f17142g = new int[68];
        o(d0Var);
    }

    private int i(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int j(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    private int k(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int l(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int m(int i10) {
        return (i10 ^ ((i10 << 9) | (i10 >>> 23))) ^ ((i10 << 17) | (i10 >>> 15));
    }

    private int n(int i10) {
        return (i10 ^ ((i10 << 15) | (i10 >>> 17))) ^ ((i10 << 23) | (i10 >>> 9));
    }

    private void o(d0 d0Var) {
        int[] iArr = d0Var.f17139d;
        int[] iArr2 = this.f17139d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = d0Var.f17140e;
        int[] iArr4 = this.f17140e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.f17141f = d0Var.f17141f;
    }

    @Override // ak.i
    public ak.i a() {
        return new d0(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        d0 d0Var = (d0) iVar;
        super.d(d0Var);
        o(d0Var);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        e();
        ak.l.g(this.f17139d, bArr, i10);
        reset();
        return 32;
    }

    @Override // nh.h
    protected void f() {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            this.f17142g[i11] = this.f17140e[i11];
            i11++;
        }
        for (int i12 = 16; i12 < 68; i12++) {
            int[] iArr = this.f17142g;
            int i13 = iArr[i12 - 3];
            int i14 = iArr[i12 - 13];
            iArr[i12] = (n(((i13 >>> 17) | (i13 << 15)) ^ (iArr[i12 - 16] ^ iArr[i12 - 9])) ^ ((i14 >>> 25) | (i14 << 7))) ^ this.f17142g[i12 - 6];
        }
        int[] iArr2 = this.f17139d;
        int i15 = iArr2[0];
        int i16 = iArr2[1];
        int i17 = iArr2[2];
        int i18 = iArr2[3];
        int i19 = iArr2[4];
        int i20 = iArr2[5];
        int i21 = iArr2[6];
        int i22 = iArr2[7];
        int i23 = 0;
        int i24 = i21;
        for (i10 = 16; i23 < i10; i10 = 16) {
            int i25 = (i15 << 12) | (i15 >>> 20);
            int i26 = i25 + i19 + f17138h[i23];
            int i27 = (i26 << 7) | (i26 >>> 25);
            int[] iArr3 = this.f17142g;
            int i28 = iArr3[i23];
            int i29 = (i16 << 9) | (i16 >>> 23);
            int i30 = (i20 << 19) | (i20 >>> 13);
            i23++;
            i20 = i19;
            i19 = m(k(i19, i20, i24) + i22 + i27 + i28);
            i18 = i17;
            i17 = i29;
            i22 = i24;
            i24 = i30;
            i16 = i15;
            i15 = i(i15, i16, i17) + i18 + (i27 ^ i25) + (i28 ^ iArr3[i23 + 4]);
        }
        int i31 = i22;
        int i32 = i19;
        int i33 = i24;
        int i34 = i18;
        int i35 = i17;
        int i36 = i16;
        int i37 = i15;
        int i38 = 16;
        while (i38 < 64) {
            int i39 = (i37 << 12) | (i37 >>> 20);
            int i40 = i39 + i32 + f17138h[i38];
            int i41 = (i40 << 7) | (i40 >>> 25);
            int[] iArr4 = this.f17142g;
            int i42 = iArr4[i38];
            int i43 = (i20 << 19) | (i20 >>> 13);
            i38++;
            i20 = i32;
            i32 = m(l(i32, i20, i33) + i31 + i41 + i42);
            i34 = i35;
            i35 = (i36 >>> 23) | (i36 << 9);
            i36 = i37;
            i37 = j(i37, i36, i35) + i34 + (i41 ^ i39) + (i42 ^ iArr4[i38 + 4]);
            i31 = i33;
            i33 = i43;
        }
        int[] iArr5 = this.f17139d;
        iArr5[0] = i37 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i36;
        iArr5[2] = iArr5[2] ^ i35;
        iArr5[3] = iArr5[3] ^ i34;
        iArr5[4] = iArr5[4] ^ i32;
        iArr5[5] = iArr5[5] ^ i20;
        iArr5[6] = i33 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i31;
        this.f17141f = 0;
    }

    @Override // nh.h
    protected void g(long j10) {
        int i10 = this.f17141f;
        if (i10 > 14) {
            this.f17140e[i10] = 0;
            this.f17141f = i10 + 1;
            f();
        }
        while (true) {
            int i11 = this.f17141f;
            if (i11 >= 14) {
                int[] iArr = this.f17140e;
                int i12 = i11 + 1;
                this.f17141f = i12;
                iArr[i11] = (int) (j10 >>> 32);
                this.f17141f = i12 + 1;
                iArr[i12] = (int) j10;
                return;
            }
            this.f17140e[i11] = 0;
            this.f17141f = i11 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return 32;
    }

    @Override // nh.h
    protected void h(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i12 + 1] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        int[] iArr = this.f17140e;
        int i14 = this.f17141f;
        iArr[i14] = i13;
        int i15 = i14 + 1;
        this.f17141f = i15;
        if (i15 >= 16) {
            f();
        }
    }

    @Override // nh.h, org.bouncycastle.crypto.r
    public void reset() {
        super.reset();
        int[] iArr = this.f17139d;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f17141f = 0;
    }
}
