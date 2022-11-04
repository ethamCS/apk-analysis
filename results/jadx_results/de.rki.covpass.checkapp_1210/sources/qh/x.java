package qh;
/* loaded from: classes3.dex */
public class x implements org.bouncycastle.crypto.h0 {

    /* renamed from: a */
    private byte[] f20219a;

    /* renamed from: b */
    private byte[] f20220b;

    /* renamed from: c */
    private byte[] f20221c;

    /* renamed from: d */
    private int[] f20222d;

    /* renamed from: e */
    private int[] f20223e;

    /* renamed from: f */
    private int f20224f;

    /* renamed from: g */
    private int f20225g = 4;

    /* renamed from: h */
    private boolean f20226h = false;

    private byte a() {
        if (this.f20225g > 3) {
            f();
            this.f20225g = 0;
        }
        byte[] bArr = this.f20221c;
        int i10 = this.f20225g;
        this.f20225g = i10 + 1;
        return bArr[i10];
    }

    private int b() {
        int[] iArr = this.f20223e;
        int i10 = (iArr[0] >>> 2) | (iArr[1] << 30);
        int i11 = (iArr[0] >>> 12) | (iArr[1] << 20);
        int i12 = (iArr[0] >>> 15) | (iArr[1] << 17);
        int i13 = (iArr[1] >>> 4) | (iArr[2] << 28);
        int i14 = (iArr[1] >>> 13) | (iArr[2] << 19);
        int i15 = iArr[2];
        int i16 = (iArr[2] >>> 9) | (iArr[3] << 23);
        int i17 = (iArr[2] >>> 25) | (iArr[3] << 7);
        int i18 = (iArr[3] << 1) | (iArr[2] >>> 31);
        int[] iArr2 = this.f20222d;
        int i19 = (iArr2[0] >>> 8) | (iArr2[1] << 24);
        int i20 = (iArr2[0] >>> 13) | (iArr2[1] << 19);
        int i21 = (iArr2[0] >>> 20) | (iArr2[1] << 12);
        int i22 = (iArr2[1] >>> 10) | (iArr2[2] << 22);
        int i23 = (iArr2[1] >>> 28) | (iArr2[2] << 4);
        int i24 = (iArr2[2] >>> 15) | (iArr2[3] << 17);
        int i25 = i18 & i11 & ((iArr2[2] >>> 31) | (iArr2[3] << 1));
        return ((((((((i25 ^ ((((i20 & i21) ^ (i11 & i19)) ^ (i18 & i22)) ^ (i23 & i24))) ^ ((iArr2[2] >>> 29) | (iArr2[3] << 3))) ^ i10) ^ i12) ^ i13) ^ i14) ^ i15) ^ i16) ^ i17;
    }

    private int c() {
        int[] iArr = this.f20222d;
        int i10 = iArr[0];
        int i11 = (iArr[0] >>> 7) | (iArr[1] << 25);
        int i12 = (iArr[1] >>> 6) | (iArr[2] << 26);
        return iArr[3] ^ ((((i11 ^ i10) ^ i12) ^ ((iArr[2] >>> 6) | (iArr[3] << 26))) ^ ((iArr[2] >>> 17) | (iArr[3] << 15)));
    }

    private int d() {
        int[] iArr = this.f20223e;
        int i10 = iArr[0];
        int i11 = (iArr[0] >>> 3) | (iArr[1] << 29);
        int i12 = (iArr[0] >>> 11) | (iArr[1] << 21);
        int i13 = (iArr[0] >>> 13) | (iArr[1] << 19);
        int i14 = (iArr[0] >>> 17) | (iArr[1] << 15);
        int i15 = (iArr[0] >>> 18) | (iArr[1] << 14);
        int i16 = (iArr[0] >>> 26) | (iArr[1] << 6);
        int i17 = (iArr[0] >>> 27) | (iArr[1] << 5);
        int i18 = (iArr[1] >>> 8) | (iArr[2] << 24);
        int i19 = (iArr[1] >>> 16) | (iArr[2] << 16);
        int i20 = (iArr[1] >>> 24) | (iArr[2] << 8);
        int i21 = (iArr[1] >>> 27) | (iArr[2] << 5);
        int i22 = (iArr[1] >>> 29) | (iArr[2] << 3);
        int i23 = (iArr[2] >>> 1) | (iArr[3] << 31);
        return (((((((iArr[3] ^ (((i10 ^ i16) ^ i20) ^ ((iArr[2] >>> 27) | (iArr[3] << 5)))) ^ (i11 & ((iArr[2] >>> 3) | (iArr[3] << 29)))) ^ (i12 & i13)) ^ (i14 & i15)) ^ (i17 & i21)) ^ (i18 & i19)) ^ (i22 & i23)) ^ (((iArr[2] >>> 4) | (iArr[3] << 28)) & ((iArr[2] >>> 20) | (iArr[3] << 12)));
    }

    private void e() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f20224f = b();
            this.f20223e = h(this.f20223e, (d() ^ this.f20222d[0]) ^ this.f20224f);
            this.f20222d = h(this.f20222d, c() ^ this.f20224f);
        }
        this.f20226h = true;
    }

    private void f() {
        int b10 = b();
        this.f20224f = b10;
        byte[] bArr = this.f20221c;
        bArr[0] = (byte) b10;
        bArr[1] = (byte) (b10 >> 8);
        bArr[2] = (byte) (b10 >> 16);
        bArr[3] = (byte) (b10 >> 24);
        this.f20223e = h(this.f20223e, d() ^ this.f20222d[0]);
        this.f20222d = h(this.f20222d, c());
    }

    private void g(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.f20219a = bArr;
        this.f20220b = bArr2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f20223e;
            if (i10 < iArr.length) {
                byte[] bArr3 = this.f20219a;
                int i12 = i11 + 3;
                int i13 = i11 + 2;
                int i14 = i11 + 1;
                iArr[i10] = (bArr3[i11] & 255) | (bArr3[i12] << 24) | ((bArr3[i13] << 16) & 16711680) | ((bArr3[i14] << 8) & 65280);
                int[] iArr2 = this.f20222d;
                byte[] bArr4 = this.f20220b;
                iArr2[i10] = (bArr4[i11] & 255) | (bArr4[i12] << 24) | ((bArr4[i13] << 16) & 16711680) | ((bArr4[i14] << 8) & 65280);
                i11 += 4;
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
        iArr[3] = i10;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.h0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.f1) {
            zh.f1 f1Var = (zh.f1) iVar;
            byte[] a10 = f1Var.a();
            if (a10 == null || a10.length != 12) {
                throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
            }
            if (!(f1Var.b() instanceof zh.b1)) {
                throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
            }
            zh.b1 b1Var = (zh.b1) f1Var.b();
            this.f20220b = new byte[b1Var.a().length];
            this.f20219a = new byte[b1Var.a().length];
            this.f20222d = new int[4];
            this.f20223e = new int[4];
            this.f20221c = new byte[4];
            System.arraycopy(a10, 0, this.f20220b, 0, a10.length);
            System.arraycopy(b1Var.a(), 0, this.f20219a, 0, b1Var.a().length);
            reset();
            return;
        }
        throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f20226h) {
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
        this.f20225g = 4;
        g(this.f20219a, this.f20220b);
        e();
    }
}
