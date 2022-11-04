package vh;

import org.bouncycastle.crypto.a0;
/* loaded from: classes3.dex */
public class w implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private byte[] f24352a;

    /* renamed from: b */
    private byte[] f24353b;

    /* renamed from: c */
    private byte[] f24354c;

    /* renamed from: d */
    private org.bouncycastle.crypto.e f24355d;

    /* renamed from: e */
    private int f24356e;

    /* renamed from: f */
    private int f24357f;

    /* renamed from: g */
    private boolean f24358g;

    public w(org.bouncycastle.crypto.e eVar) {
        this.f24355d = eVar;
        int b10 = eVar.b();
        this.f24357f = b10;
        this.f24352a = new byte[b10];
        this.f24353b = new byte[b10];
        this.f24354c = new byte[b10];
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = this.f24357f;
        if (i10 + i15 <= bArr.length) {
            if (i11 + i15 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            int i16 = this.f24356e;
            int i17 = 2;
            int i18 = 0;
            if (i16 > i15) {
                byte b10 = bArr[i10];
                this.f24353b[i15 - 2] = b10;
                bArr2[i11] = e(b10, i15 - 2);
                byte b11 = bArr[i10 + 1];
                byte[] bArr3 = this.f24353b;
                int i19 = this.f24357f;
                bArr3[i19 - 1] = b11;
                bArr2[i11 + 1] = e(b11, i19 - 1);
                this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                while (i17 < this.f24357f) {
                    byte b12 = bArr[i10 + i17];
                    int i20 = i17 - 2;
                    this.f24353b[i20] = b12;
                    bArr2[i11 + i17] = e(b12, i20);
                    i17++;
                }
            } else {
                if (i16 == 0) {
                    this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                    while (true) {
                        i14 = this.f24357f;
                        if (i18 >= i14) {
                            break;
                        }
                        int i21 = i10 + i18;
                        this.f24353b[i18] = bArr[i21];
                        bArr2[i18] = e(bArr[i21], i18);
                        i18++;
                    }
                    i13 = this.f24356e + i14;
                } else if (i16 == i15) {
                    this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                    byte b13 = bArr[i10];
                    byte b14 = bArr[i10 + 1];
                    bArr2[i11] = e(b13, 0);
                    bArr2[i11 + 1] = e(b14, 1);
                    byte[] bArr4 = this.f24353b;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.f24357f - 2);
                    byte[] bArr5 = this.f24353b;
                    int i22 = this.f24357f;
                    bArr5[i22 - 2] = b13;
                    bArr5[i22 - 1] = b14;
                    this.f24355d.a(bArr5, 0, this.f24354c, 0);
                    while (true) {
                        i12 = this.f24357f;
                        if (i17 >= i12) {
                            break;
                        }
                        byte b15 = bArr[i10 + i17];
                        int i23 = i17 - 2;
                        this.f24353b[i23] = b15;
                        bArr2[i11 + i17] = e(b15, i23);
                        i17++;
                    }
                    i13 = this.f24356e + i12;
                }
                this.f24356e = i13;
            }
            return this.f24357f;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13 = this.f24357f;
        if (i10 + i13 <= bArr.length) {
            if (i11 + i13 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            int i14 = this.f24356e;
            int i15 = 2;
            int i16 = 0;
            if (i14 > i13) {
                byte[] bArr3 = this.f24353b;
                int i17 = i13 - 2;
                byte e10 = e(bArr[i10], i13 - 2);
                bArr2[i11] = e10;
                bArr3[i17] = e10;
                byte[] bArr4 = this.f24353b;
                int i18 = this.f24357f;
                int i19 = i18 - 1;
                byte e11 = e(bArr[i10 + 1], i18 - 1);
                bArr2[i11 + 1] = e11;
                bArr4[i19] = e11;
                this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                while (i15 < this.f24357f) {
                    byte[] bArr5 = this.f24353b;
                    int i20 = i15 - 2;
                    byte e12 = e(bArr[i10 + i15], i20);
                    bArr2[i11 + i15] = e12;
                    bArr5[i20] = e12;
                    i15++;
                }
            } else {
                if (i14 != 0) {
                    if (i14 == i13) {
                        this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                        bArr2[i11] = e(bArr[i10], 0);
                        bArr2[i11 + 1] = e(bArr[i10 + 1], 1);
                        byte[] bArr6 = this.f24353b;
                        System.arraycopy(bArr6, 2, bArr6, 0, this.f24357f - 2);
                        System.arraycopy(bArr2, i11, this.f24353b, this.f24357f - 2, 2);
                        this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                        while (true) {
                            i12 = this.f24357f;
                            if (i15 >= i12) {
                                break;
                            }
                            byte[] bArr7 = this.f24353b;
                            int i21 = i15 - 2;
                            byte e13 = e(bArr[i10 + i15], i21);
                            bArr2[i11 + i15] = e13;
                            bArr7[i21] = e13;
                            i15++;
                        }
                    }
                } else {
                    this.f24355d.a(this.f24353b, 0, this.f24354c, 0);
                    while (true) {
                        i12 = this.f24357f;
                        if (i16 >= i12) {
                            break;
                        }
                        byte[] bArr8 = this.f24353b;
                        byte e14 = e(bArr[i10 + i16], i16);
                        bArr2[i11 + i16] = e14;
                        bArr8[i16] = e14;
                        i16++;
                    }
                }
                this.f24356e += i12;
            }
            return this.f24357f;
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    private byte e(byte b10, int i10) {
        return (byte) (b10 ^ this.f24354c[i10]);
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f24358g ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24355d.b();
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24355d.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f24358g = z10;
        reset();
        this.f24355d.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f24356e = 0;
        byte[] bArr = this.f24352a;
        byte[] bArr2 = this.f24353b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f24355d.reset();
    }
}
