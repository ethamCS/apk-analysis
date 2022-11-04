package vh;

import org.bouncycastle.crypto.a0;
import zh.f1;
/* loaded from: classes3.dex */
public class x implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private byte[] f24359a;

    /* renamed from: b */
    private byte[] f24360b;

    /* renamed from: c */
    private byte[] f24361c;

    /* renamed from: d */
    private byte[] f24362d;

    /* renamed from: e */
    private org.bouncycastle.crypto.e f24363e;

    /* renamed from: f */
    private int f24364f;

    /* renamed from: g */
    private int f24365g;

    /* renamed from: h */
    private boolean f24366h;

    /* renamed from: i */
    private boolean f24367i;

    public x(org.bouncycastle.crypto.e eVar, boolean z10) {
        this.f24363e = eVar;
        this.f24367i = z10;
        int b10 = eVar.b();
        this.f24365g = b10;
        this.f24359a = new byte[b10];
        this.f24360b = new byte[b10];
        this.f24361c = new byte[b10];
        this.f24362d = new byte[b10];
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f24365g;
        if (i10 + i12 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            int i13 = 0;
            this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
            for (int i14 = 0; i14 < this.f24365g; i14++) {
                bArr2[i11 + i14] = g(bArr[i10 + i14], i14);
            }
            while (true) {
                int i15 = this.f24365g;
                if (i13 >= i15) {
                    return i15;
                }
                this.f24360b[i13] = bArr[i10 + i13];
                i13++;
            }
        } else {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        }
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13 = this.f24365g;
        if (i10 + i13 <= bArr.length) {
            if (i11 + i13 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            int i14 = this.f24364f;
            if (i14 == 0) {
                for (int i15 = 0; i15 < this.f24365g; i15++) {
                    this.f24360b[i15] = bArr[i10 + i15];
                }
                this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
                this.f24364f += this.f24365g;
                return 0;
            } else if (i14 != i13) {
                if (i14 >= i13 + 2) {
                    System.arraycopy(bArr, i10, this.f24362d, 0, i13);
                    bArr2[i11 + 0] = g(this.f24362d[0], this.f24365g - 2);
                    bArr2[i11 + 1] = g(this.f24362d[1], this.f24365g - 1);
                    System.arraycopy(this.f24362d, 0, this.f24360b, this.f24365g - 2, 2);
                    this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
                    int i16 = 0;
                    while (true) {
                        i12 = this.f24365g;
                        if (i16 >= i12 - 2) {
                            break;
                        }
                        bArr2[i11 + i16 + 2] = g(this.f24362d[i16 + 2], i16);
                        i16++;
                    }
                    System.arraycopy(this.f24362d, 2, this.f24360b, 0, i12 - 2);
                }
                return this.f24365g;
            } else {
                System.arraycopy(bArr, i10, this.f24362d, 0, i13);
                byte[] bArr3 = this.f24360b;
                System.arraycopy(bArr3, 2, bArr3, 0, this.f24365g - 2);
                byte[] bArr4 = this.f24360b;
                int i17 = this.f24365g;
                byte[] bArr5 = this.f24362d;
                bArr4[i17 - 2] = bArr5[0];
                bArr4[i17 - 1] = bArr5[1];
                this.f24363e.a(bArr4, 0, this.f24361c, 0);
                int i18 = 0;
                while (true) {
                    int i19 = this.f24365g;
                    if (i18 >= i19 - 2) {
                        System.arraycopy(this.f24362d, 2, this.f24360b, 0, i19 - 2);
                        this.f24364f += 2;
                        return this.f24365g - 2;
                    }
                    bArr2[i11 + i18] = g(this.f24362d[i18 + 2], i18);
                    i18++;
                }
            }
        } else {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        }
    }

    private int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f24365g;
        if (i10 + i12 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            int i13 = 0;
            this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
            for (int i14 = 0; i14 < this.f24365g; i14++) {
                bArr2[i11 + i14] = g(bArr[i10 + i14], i14);
            }
            while (true) {
                int i15 = this.f24365g;
                if (i13 >= i15) {
                    return i15;
                }
                this.f24360b[i13] = bArr2[i11 + i13];
                i13++;
            }
        } else {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        }
    }

    private int f(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int i14 = this.f24365g;
        if (i10 + i14 <= bArr.length) {
            int i15 = this.f24364f;
            if (i15 != 0) {
                if (i15 >= i14 + 2) {
                    if (i14 + i11 > bArr2.length) {
                        throw new a0("output buffer too short");
                    }
                    this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
                    int i16 = 0;
                    while (true) {
                        i12 = this.f24365g;
                        if (i16 >= i12) {
                            break;
                        }
                        bArr2[i11 + i16] = g(bArr[i10 + i16], i16);
                        i16++;
                    }
                    System.arraycopy(bArr2, i11, this.f24360b, 0, i12);
                }
                return this.f24365g;
            } else if ((i14 * 2) + i11 + 2 > bArr2.length) {
                throw new a0("output buffer too short");
            } else {
                this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
                int i17 = 0;
                while (true) {
                    i13 = this.f24365g;
                    if (i17 >= i13) {
                        break;
                    }
                    bArr2[i11 + i17] = g(this.f24359a[i17], i17);
                    i17++;
                }
                System.arraycopy(bArr2, i11, this.f24360b, 0, i13);
                this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
                int i18 = this.f24365g;
                bArr2[i11 + i18] = g(this.f24359a[i18 - 2], 0);
                int i19 = this.f24365g;
                bArr2[i11 + i19 + 1] = g(this.f24359a[i19 - 1], 1);
                System.arraycopy(bArr2, i11 + 2, this.f24360b, 0, this.f24365g);
                this.f24363e.a(this.f24360b, 0, this.f24361c, 0);
                int i20 = 0;
                while (true) {
                    int i21 = this.f24365g;
                    if (i20 >= i21) {
                        System.arraycopy(bArr2, i11 + i21 + 2, this.f24360b, 0, i21);
                        int i22 = this.f24364f;
                        int i23 = this.f24365g;
                        this.f24364f = i22 + (i23 * 2) + 2;
                        return (i23 * 2) + 2;
                    }
                    bArr2[i21 + i11 + 2 + i20] = g(bArr[i10 + i20], i20);
                    i20++;
                }
            }
        } else {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        }
    }

    private byte g(byte b10, int i10) {
        return (byte) (b10 ^ this.f24361c[i10]);
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f24367i ? this.f24366h ? f(bArr, i10, bArr2, i11) : d(bArr, i10, bArr2, i11) : this.f24366h ? e(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24363e.b();
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        StringBuilder sb2;
        String str;
        if (this.f24367i) {
            sb2 = new StringBuilder();
            sb2.append(this.f24363e.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f24363e.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f24366h = z10;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            int length = a10.length;
            byte[] bArr = this.f24359a;
            if (length < bArr.length) {
                System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
                int i10 = 0;
                while (true) {
                    byte[] bArr2 = this.f24359a;
                    if (i10 >= bArr2.length - a10.length) {
                        break;
                    }
                    bArr2[i10] = 0;
                    i10++;
                }
            } else {
                System.arraycopy(a10, 0, bArr, 0, bArr.length);
            }
            reset();
            eVar = this.f24363e;
            iVar = f1Var.b();
        } else {
            reset();
            eVar = this.f24363e;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f24364f = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f24360b;
            if (i10 == bArr.length) {
                this.f24363e.reset();
                return;
            }
            if (this.f24367i) {
                bArr[i10] = 0;
            } else {
                bArr[i10] = this.f24359a[i10];
            }
            i10++;
        }
    }
}
