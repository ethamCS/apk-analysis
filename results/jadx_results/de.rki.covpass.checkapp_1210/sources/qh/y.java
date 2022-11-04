package qh;
/* loaded from: classes3.dex */
public class y implements org.bouncycastle.crypto.h0 {

    /* renamed from: a */
    private byte[] f20230a;

    /* renamed from: b */
    private byte[] f20231b;

    /* renamed from: c */
    private byte[] f20232c;

    /* renamed from: d */
    private int[] f20233d;

    /* renamed from: e */
    private int[] f20234e;

    /* renamed from: f */
    private int f20235f;

    /* renamed from: g */
    private int f20236g = 2;

    /* renamed from: h */
    private boolean f20237h = false;

    private byte a() {
        if (this.f20236g > 1) {
            f();
            this.f20236g = 0;
        }
        byte[] bArr = this.f20232c;
        int i10 = this.f20236g;
        this.f20236g = i10 + 1;
        return bArr[i10];
    }

    private int b() {
        int[] iArr = this.f20234e;
        int i10 = (iArr[0] >>> 1) | (iArr[1] << 15);
        int i11 = (iArr[0] >>> 2) | (iArr[1] << 14);
        int i12 = (iArr[0] >>> 4) | (iArr[1] << 12);
        int i13 = (iArr[0] >>> 10) | (iArr[1] << 6);
        int i14 = (iArr[1] >>> 15) | (iArr[2] << 1);
        int i15 = (iArr[2] >>> 11) | (iArr[3] << 5);
        int i16 = (iArr[3] >>> 8) | (iArr[4] << 8);
        int i17 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int[] iArr2 = this.f20233d;
        int i18 = (iArr2[0] >>> 3) | (iArr2[1] << 13);
        int i19 = (iArr2[1] >>> 9) | (iArr2[2] << 7);
        int i20 = (iArr2[3] << 2) | (iArr2[2] >>> 14);
        int i21 = iArr2[4];
        int i22 = (i19 ^ i17) ^ (i18 & i21);
        int i23 = i20 & i21;
        int i24 = i18 & i20;
        int i25 = i21 & i24;
        int i26 = i24 & i17;
        return (((((((((i17 & i23) ^ ((i26 ^ (i25 ^ (((i22 ^ i23) ^ (i21 & i17)) ^ ((i18 & i19) & i20)))) ^ ((i19 & i20) & i17))) ^ i10) ^ i11) ^ i12) ^ i13) ^ i14) ^ i15) ^ i16) & 65535;
    }

    private int c() {
        int[] iArr = this.f20233d;
        int i10 = iArr[0];
        int i11 = (iArr[1] >>> 7) | (iArr[2] << 9);
        int i12 = (iArr[2] >>> 6) | (iArr[3] << 10);
        return (((iArr[4] << 2) | (iArr[3] >>> 14)) ^ ((((((iArr[0] >>> 13) | (iArr[1] << 3)) ^ i10) ^ i11) ^ i12) ^ ((iArr[3] >>> 3) | (iArr[4] << 13)))) & 65535;
    }

    private int d() {
        int[] iArr = this.f20234e;
        int i10 = iArr[0];
        int i11 = (iArr[0] >>> 9) | (iArr[1] << 7);
        int i12 = (iArr[0] >>> 14) | (iArr[1] << 2);
        int i13 = (iArr[0] >>> 15) | (iArr[1] << 1);
        int i14 = (iArr[1] >>> 5) | (iArr[2] << 11);
        int i15 = (iArr[1] >>> 12) | (iArr[2] << 4);
        int i16 = (iArr[2] >>> 1) | (iArr[3] << 15);
        int i17 = (iArr[2] >>> 5) | (iArr[3] << 11);
        int i18 = (iArr[2] >>> 13) | (iArr[3] << 3);
        int i19 = (iArr[3] >>> 4) | (iArr[4] << 12);
        int i20 = (iArr[3] >>> 12) | (iArr[4] << 4);
        int i21 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int i22 = i21 & i20;
        int i23 = i20 & i19;
        int i24 = ((((i10 ^ (((((((((((iArr[3] >>> 14) | (iArr[4] << 2)) ^ i20) ^ i19) ^ i18) ^ i17) ^ i16) ^ i15) ^ i14) ^ i12) ^ i11)) ^ i22) ^ (i17 & i16)) ^ (i13 & i11)) ^ (i23 & i18);
        int i25 = i16 & i15 & i14;
        return (((((((((i21 & i18) & i15) & i11) ^ (i24 ^ i25)) ^ ((i23 & i17) & i16)) ^ ((i22 & i14) & i13)) ^ (((i22 & i19) & i18) & i17)) ^ ((i13 & i25) & i11)) ^ (((((i19 & i18) & i17) & i16) & i15) & i14)) & 65535;
    }

    private void e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f20235f = b();
            this.f20234e = h(this.f20234e, (d() ^ this.f20233d[0]) ^ this.f20235f);
            this.f20233d = h(this.f20233d, c() ^ this.f20235f);
        }
        this.f20237h = true;
    }

    private void f() {
        int b10 = b();
        this.f20235f = b10;
        byte[] bArr = this.f20232c;
        bArr[0] = (byte) b10;
        bArr[1] = (byte) (b10 >> 8);
        this.f20234e = h(this.f20234e, d() ^ this.f20233d[0]);
        this.f20233d = h(this.f20233d, c());
    }

    private void g(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.f20230a = bArr;
        this.f20231b = bArr2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f20234e;
            if (i10 < iArr.length) {
                byte[] bArr3 = this.f20230a;
                int i12 = i11 + 1;
                iArr[i10] = ((bArr3[i11] & 255) | (bArr3[i12] << 8)) & 65535;
                int[] iArr2 = this.f20233d;
                byte[] bArr4 = this.f20231b;
                iArr2[i10] = ((bArr4[i11] & 255) | (bArr4[i12] << 8)) & 65535;
                i11 += 2;
                i10++;
            } else {
                return;
            }
        }
    }

    private int[] h(int[] iArr, int i10) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i10;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            byte[] a10 = f1Var.a();
            if (a10 == null || a10.length != 8) {
                throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
            }
            if (!(f1Var.b() instanceof zh.b1)) {
                throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
            }
            zh.b1 b1Var = (zh.b1) f1Var.b();
            this.f20231b = new byte[b1Var.a().length];
            this.f20230a = new byte[b1Var.a().length];
            this.f20233d = new int[5];
            this.f20234e = new int[5];
            this.f20232c = new byte[2];
            System.arraycopy(a10, 0, this.f20231b, 0, a10.length);
            System.arraycopy(b1Var.a(), 0, this.f20230a, 0, b1Var.a().length);
            reset();
            return;
        }
        throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f20237h) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i10 + i11 > bArr.length) {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        } else {
            if (i12 + i11 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            for (int i13 = 0; i13 < i11; i13++) {
                bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ a());
            }
            return i11;
        }
    }

    @Override // org.bouncycastle.crypto.h0
    public void reset() {
        this.f20236g = 2;
        g(this.f20230a, this.f20231b);
        e();
    }
}
