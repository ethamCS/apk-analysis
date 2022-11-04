package qh;
/* loaded from: classes3.dex */
public class l0 implements org.bouncycastle.crypto.i0 {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f20063a;

    /* renamed from: b */
    private boolean f20064b;

    /* renamed from: c */
    private zh.b1 f20065c;

    /* renamed from: d */
    private boolean f20066d;

    /* renamed from: e */
    private byte[] f20067e;

    public l0(org.bouncycastle.crypto.e eVar) {
        this(eVar, false);
    }

    public l0(org.bouncycastle.crypto.e eVar, boolean z10) {
        this.f20067e = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.f20063a = eVar;
        this.f20064b = !z10;
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        if (!this.f20066d) {
            int i12 = i11 / 8;
            if (i12 * 8 != i11) {
                throw new org.bouncycastle.crypto.u("unwrap data must be a multiple of 8 bytes");
            }
            byte[] bArr2 = this.f20067e;
            byte[] bArr3 = new byte[i11 - bArr2.length];
            byte[] bArr4 = new byte[bArr2.length];
            byte[] bArr5 = new byte[bArr2.length + 8];
            System.arraycopy(bArr, i10, bArr4, 0, bArr2.length);
            byte[] bArr6 = this.f20067e;
            System.arraycopy(bArr, i10 + bArr6.length, bArr3, 0, i11 - bArr6.length);
            this.f20063a.init(!this.f20064b, this.f20065c);
            int i13 = i12 - 1;
            for (int i14 = 5; i14 >= 0; i14--) {
                for (int i15 = i13; i15 >= 1; i15--) {
                    System.arraycopy(bArr4, 0, bArr5, 0, this.f20067e.length);
                    int i16 = (i15 - 1) * 8;
                    System.arraycopy(bArr3, i16, bArr5, this.f20067e.length, 8);
                    int i17 = (i13 * i14) + i15;
                    int i18 = 1;
                    while (i17 != 0) {
                        int length = this.f20067e.length - i18;
                        bArr5[length] = (byte) (((byte) i17) ^ bArr5[length]);
                        i17 >>>= 8;
                        i18++;
                    }
                    this.f20063a.a(bArr5, 0, bArr5, 0);
                    System.arraycopy(bArr5, 0, bArr4, 0, 8);
                    System.arraycopy(bArr5, 8, bArr3, i16, 8);
                }
            }
            if (!ak.a.u(bArr4, this.f20067e)) {
                throw new org.bouncycastle.crypto.u("checksum failed");
            }
            return bArr3;
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        if (this.f20066d) {
            int i12 = i11 / 8;
            if (i12 * 8 != i11) {
                throw new org.bouncycastle.crypto.o("wrap data must be a multiple of 8 bytes");
            }
            byte[] bArr2 = this.f20067e;
            byte[] bArr3 = new byte[bArr2.length + i11];
            byte[] bArr4 = new byte[bArr2.length + 8];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, i10, bArr3, this.f20067e.length, i11);
            this.f20063a.init(this.f20064b, this.f20065c);
            for (int i13 = 0; i13 != 6; i13++) {
                for (int i14 = 1; i14 <= i12; i14++) {
                    System.arraycopy(bArr3, 0, bArr4, 0, this.f20067e.length);
                    int i15 = i14 * 8;
                    System.arraycopy(bArr3, i15, bArr4, this.f20067e.length, 8);
                    this.f20063a.a(bArr4, 0, bArr4, 0);
                    int i16 = (i12 * i13) + i14;
                    int i17 = 1;
                    while (i16 != 0) {
                        int length = this.f20067e.length - i17;
                        bArr4[length] = (byte) (((byte) i16) ^ bArr4[length]);
                        i16 >>>= 8;
                        i17++;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, 8);
                    System.arraycopy(bArr4, 8, bArr3, i15, 8);
                }
            }
            return bArr3;
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return this.f20063a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f20066d = z10;
        if (iVar instanceof zh.g1) {
            iVar = ((zh.g1) iVar).a();
        }
        if (iVar instanceof zh.b1) {
            this.f20065c = (zh.b1) iVar;
        } else if (!(iVar instanceof zh.f1)) {
        } else {
            zh.f1 f1Var = (zh.f1) iVar;
            this.f20067e = f1Var.a();
            this.f20065c = (zh.b1) f1Var.b();
            if (this.f20067e.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }
}
