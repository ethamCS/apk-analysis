package qh;
/* loaded from: classes3.dex */
public class m0 implements org.bouncycastle.crypto.i0 {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f20068a;

    /* renamed from: b */
    private zh.b1 f20069b;

    /* renamed from: c */
    private boolean f20070c;

    /* renamed from: d */
    private byte[] f20071d;

    /* renamed from: e */
    private byte[] f20072e;

    /* renamed from: f */
    private byte[] f20073f = null;

    public m0(org.bouncycastle.crypto.e eVar) {
        byte[] bArr = {-90, 89, 89, -90};
        this.f20071d = bArr;
        this.f20072e = bArr;
        this.f20068a = eVar;
    }

    private byte[] c(byte[] bArr) {
        int length = bArr.length;
        int i10 = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i10];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i10 != 0) {
            System.arraycopy(new byte[i10], 0, bArr2, length, i10);
        }
        return bArr2;
    }

    private byte[] d(byte[] bArr, int i10, int i11) {
        int i12 = i11 - 8;
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i10, bArr3, 0, 8);
        System.arraycopy(bArr, i10 + 8, bArr2, 0, i12);
        this.f20068a.init(false, this.f20069b);
        int i13 = (i11 / 8) - 1;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i13; i15 >= 1; i15--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i16 = (i15 - 1) * 8;
                System.arraycopy(bArr2, i16, bArr4, 8, 8);
                int i17 = (i13 * i14) + i15;
                int i18 = 1;
                while (i17 != 0) {
                    int i19 = 8 - i18;
                    bArr4[i19] = (byte) (((byte) i17) ^ bArr4[i19]);
                    i17 >>>= 8;
                    i18++;
                }
                this.f20068a.a(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i16, 8);
            }
        }
        this.f20073f = bArr3;
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        if (!this.f20070c) {
            int i12 = i11 / 8;
            if (i12 * 8 != i11) {
                throw new org.bouncycastle.crypto.u("unwrap data must be a multiple of 8 bytes");
            }
            if (i12 <= 1) {
                throw new org.bouncycastle.crypto.u("unwrap data must be at least 16 bytes");
            }
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr, i10, bArr3, 0, i11);
            byte[] bArr4 = new byte[i11];
            if (i12 == 2) {
                this.f20068a.init(false, this.f20069b);
                int i13 = 0;
                while (i13 < i11) {
                    this.f20068a.a(bArr3, i13, bArr4, i13);
                    i13 += this.f20068a.b();
                }
                byte[] bArr5 = new byte[8];
                this.f20073f = bArr5;
                System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
                byte[] bArr6 = this.f20073f;
                int length = i11 - bArr6.length;
                bArr2 = new byte[length];
                System.arraycopy(bArr4, bArr6.length, bArr2, 0, length);
            } else {
                bArr2 = d(bArr, i10, i11);
            }
            int i14 = 4;
            byte[] bArr7 = new byte[4];
            byte[] bArr8 = new byte[4];
            System.arraycopy(this.f20073f, 0, bArr7, 0, 4);
            System.arraycopy(this.f20073f, 4, bArr8, 0, 4);
            int a10 = ak.l.a(bArr8, 0);
            boolean u10 = ak.a.u(bArr7, this.f20072e);
            int length2 = bArr2.length;
            if (a10 <= length2 - 8) {
                u10 = false;
            }
            if (a10 > length2) {
                u10 = false;
            }
            int i15 = length2 - a10;
            if (i15 >= 8 || i15 < 0) {
                u10 = false;
            } else {
                i14 = i15;
            }
            byte[] bArr9 = new byte[i14];
            System.arraycopy(bArr2, bArr2.length - i14, bArr9, 0, i14);
            if (!ak.a.u(bArr9, new byte[i14])) {
                u10 = false;
            }
            if (!u10) {
                throw new org.bouncycastle.crypto.u("checksum failed");
            }
            byte[] bArr10 = new byte[a10];
            System.arraycopy(bArr2, 0, bArr10, 0, a10);
            return bArr10;
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public byte[] b(byte[] bArr, int i10, int i11) {
        if (this.f20070c) {
            byte[] bArr2 = new byte[8];
            byte[] h10 = ak.l.h(i11);
            byte[] bArr3 = this.f20072e;
            int i12 = 0;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            System.arraycopy(h10, 0, bArr2, this.f20072e.length, h10.length);
            byte[] bArr4 = new byte[i11];
            System.arraycopy(bArr, i10, bArr4, 0, i11);
            byte[] c10 = c(bArr4);
            if (c10.length != 8) {
                l0 l0Var = new l0(this.f20068a);
                l0Var.init(true, new zh.f1(this.f20069b, bArr2));
                return l0Var.b(c10, 0, c10.length);
            }
            int length = c10.length + 8;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr2, 0, bArr5, 0, 8);
            System.arraycopy(c10, 0, bArr5, 8, c10.length);
            this.f20068a.init(true, this.f20069b);
            while (i12 < length) {
                this.f20068a.a(bArr5, i12, bArr5, i12);
                i12 += this.f20068a.b();
            }
            return bArr5;
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // org.bouncycastle.crypto.i0
    public String getAlgorithmName() {
        return this.f20068a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f20070c = z10;
        if (iVar instanceof zh.g1) {
            iVar = ((zh.g1) iVar).a();
        }
        if (iVar instanceof zh.b1) {
            this.f20069b = (zh.b1) iVar;
            this.f20072e = this.f20071d;
        } else if (!(iVar instanceof zh.f1)) {
        } else {
            zh.f1 f1Var = (zh.f1) iVar;
            this.f20072e = f1Var.a();
            this.f20069b = (zh.b1) f1Var.b();
            if (this.f20072e.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }
}
