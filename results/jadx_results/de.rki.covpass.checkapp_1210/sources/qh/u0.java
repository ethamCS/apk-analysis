package qh;
/* loaded from: classes3.dex */
public class u0 implements org.bouncycastle.crypto.h0 {

    /* renamed from: j */
    private static final int[] f20191j = ak.l.o(ak.q.f("expand 16-byte kexpand 32-byte k"), 0, 8);

    /* renamed from: k */
    protected static final byte[] f20192k = ak.q.f("expand 32-byte k");

    /* renamed from: l */
    protected static final byte[] f20193l = ak.q.f("expand 16-byte k");

    /* renamed from: a */
    protected int f20194a;

    /* renamed from: b */
    private int f20195b;

    /* renamed from: c */
    protected int[] f20196c;

    /* renamed from: d */
    protected int[] f20197d;

    /* renamed from: e */
    private byte[] f20198e;

    /* renamed from: f */
    private boolean f20199f;

    /* renamed from: g */
    private int f20200g;

    /* renamed from: h */
    private int f20201h;

    /* renamed from: i */
    private int f20202i;

    public u0() {
        this(20);
    }

    public u0(int i10) {
        this.f20195b = 0;
        this.f20196c = new int[16];
        this.f20197d = new int[16];
        this.f20198e = new byte[64];
        this.f20199f = false;
        if (i10 <= 0 || (i10 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.f20194a = i10;
    }

    private boolean d(int i10) {
        int i11 = this.f20200g + i10;
        this.f20200g = i11;
        if (i11 >= i10 || i11 < 0) {
            return false;
        }
        int i12 = this.f20201h + 1;
        this.f20201h = i12;
        if (i12 != 0) {
            return false;
        }
        int i13 = this.f20202i + 1;
        this.f20202i = i13;
        return (i13 & 32) != 0;
    }

    private void g() {
        this.f20200g = 0;
        this.f20201h = 0;
        this.f20202i = 0;
    }

    public static void h(int i10, int[] iArr, int[] iArr2) {
        if (iArr.length == 16) {
            if (iArr2.length != 16) {
                throw new IllegalArgumentException();
            }
            if (i10 % 2 != 0) {
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            char c10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            int i15 = iArr[4];
            int i16 = iArr[5];
            int i17 = iArr[6];
            int i18 = 7;
            int i19 = iArr[7];
            int i20 = iArr[8];
            int i21 = 9;
            int i22 = iArr[9];
            int i23 = iArr[10];
            int i24 = iArr[11];
            int i25 = iArr[12];
            int i26 = 13;
            int i27 = iArr[13];
            int i28 = iArr[14];
            int i29 = iArr[15];
            int i30 = i28;
            int i31 = i27;
            int i32 = i25;
            int i33 = i24;
            int i34 = i23;
            int i35 = i22;
            int i36 = i20;
            int i37 = i19;
            int i38 = i17;
            int i39 = i16;
            int i40 = i15;
            int i41 = i14;
            int i42 = i13;
            int i43 = i12;
            int i44 = i11;
            int i45 = i10;
            while (i45 > 0) {
                int c11 = ak.g.c(i44 + i32, i18) ^ i40;
                int c12 = i36 ^ ak.g.c(c11 + i44, i21);
                int c13 = i32 ^ ak.g.c(c12 + c11, i26);
                int c14 = ak.g.c(c13 + c12, 18) ^ i44;
                int c15 = i35 ^ ak.g.c(i39 + i43, i18);
                int c16 = i31 ^ ak.g.c(c15 + i39, i21);
                int c17 = i43 ^ ak.g.c(c16 + c15, i26);
                int c18 = ak.g.c(c17 + c16, 18) ^ i39;
                int c19 = i30 ^ ak.g.c(i34 + i38, 7);
                int c20 = i42 ^ ak.g.c(c19 + i34, 9);
                int c21 = i38 ^ ak.g.c(c20 + c19, 13);
                int c22 = i34 ^ ak.g.c(c21 + c20, 18);
                int c23 = i41 ^ ak.g.c(i29 + i33, 7);
                int c24 = i37 ^ ak.g.c(c23 + i29, 9);
                int i46 = i45;
                int c25 = i33 ^ ak.g.c(c24 + c23, 13);
                int c26 = i29 ^ ak.g.c(c25 + c24, 18);
                i43 = c17 ^ ak.g.c(c14 + c23, 7);
                i42 = c20 ^ ak.g.c(i43 + c14, 9);
                int c27 = c23 ^ ak.g.c(i42 + i43, 13);
                int c28 = c14 ^ ak.g.c(c27 + i42, 18);
                i38 = c21 ^ ak.g.c(c18 + c11, 7);
                i37 = c24 ^ ak.g.c(i38 + c18, 9);
                int c29 = ak.g.c(i37 + i38, 13) ^ c11;
                i39 = c18 ^ ak.g.c(c29 + i37, 18);
                i33 = c25 ^ ak.g.c(c22 + c15, 7);
                int c30 = ak.g.c(i33 + c22, 9) ^ c12;
                i35 = c15 ^ ak.g.c(c30 + i33, 13);
                i34 = c22 ^ ak.g.c(i35 + c30, 18);
                i32 = c13 ^ ak.g.c(c26 + c19, 7);
                i31 = c16 ^ ak.g.c(i32 + c26, 9);
                i30 = c19 ^ ak.g.c(i31 + i32, 13);
                i29 = c26 ^ ak.g.c(i30 + i31, 18);
                i41 = c27;
                i36 = c30;
                i44 = c28;
                i40 = c29;
                c10 = 0;
                i26 = 13;
                i21 = 9;
                i18 = 7;
                i45 = i46 - 2;
            }
            char c31 = c10;
            iArr2[c31] = i44 + iArr[c31];
            iArr2[1] = i43 + iArr[1];
            iArr2[2] = i42 + iArr[2];
            iArr2[3] = i41 + iArr[3];
            iArr2[4] = i40 + iArr[4];
            iArr2[5] = i39 + iArr[5];
            iArr2[6] = i38 + iArr[6];
            iArr2[7] = i37 + iArr[7];
            iArr2[8] = i36 + iArr[8];
            iArr2[9] = i35 + iArr[9];
            iArr2[10] = i34 + iArr[10];
            iArr2[11] = i33 + iArr[11];
            iArr2[12] = i32 + iArr[12];
            iArr2[13] = i31 + iArr[13];
            iArr2[14] = i30 + iArr[14];
            iArr2[15] = i29 + iArr[15];
            return;
        }
        throw new IllegalArgumentException();
    }

    protected void a() {
        int[] iArr = this.f20196c;
        int i10 = iArr[8] + 1;
        iArr[8] = i10;
        if (i10 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void b(byte[] bArr) {
        h(this.f20194a, this.f20196c, this.f20197d);
        ak.l.j(this.f20197d, bArr, 0);
    }

    protected int c() {
        return 8;
    }

    public void e(int i10, int[] iArr, int i11) {
        int i12 = (i10 - 16) / 4;
        int[] iArr2 = f20191j;
        iArr[i11] = iArr2[i12];
        iArr[i11 + 1] = iArr2[i12 + 1];
        iArr[i11 + 2] = iArr2[i12 + 2];
        iArr[i11 + 3] = iArr2[i12 + 3];
    }

    protected void f() {
        int[] iArr = this.f20196c;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        if (this.f20194a != 20) {
            return "Salsa20/" + this.f20194a;
        }
        return "Salsa20";
    }

    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.f20196c;
            int[] iArr2 = f20191j;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            ak.l.n(bArr, 0, iArr, 1, 4);
            ak.l.n(bArr, bArr.length - 16, this.f20196c, 11, 4);
        }
        ak.l.n(bArr2, 0, this.f20196c, 6, 2);
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.f1)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        zh.f1 f1Var = (zh.f1) iVar;
        byte[] a10 = f1Var.a();
        if (a10 == null || a10.length != c()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + c() + " bytes of IV");
        }
        org.bouncycastle.crypto.i b10 = f1Var.b();
        if (b10 == null) {
            if (!this.f20199f) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            i(null, a10);
        } else if (!(b10 instanceof zh.b1)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
        } else {
            i(((zh.b1) b10).a(), a10);
        }
        reset();
        this.f20199f = true;
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f20199f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + i11 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            if (d(i11)) {
                throw new org.bouncycastle.crypto.z("2^70 byte limit per IV would be exceeded; Change IV");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                byte[] bArr3 = this.f20198e;
                int i14 = this.f20195b;
                bArr2[i13 + i12] = (byte) (bArr3[i14] ^ bArr[i13 + i10]);
                int i15 = (i14 + 1) & 63;
                this.f20195b = i15;
                if (i15 == 0) {
                    a();
                    b(this.f20198e);
                }
            }
            return i11;
        }
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        this.f20195b = 0;
        g();
        f();
        b(this.f20198e);
    }
}
