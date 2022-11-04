package uh;

import org.bouncycastle.crypto.y;
import zh.b1;
import zh.f1;
import zh.h1;
/* loaded from: classes3.dex */
public class f implements y {

    /* renamed from: a */
    private int f23698a = 8;

    /* renamed from: b */
    private int f23699b = 4;

    /* renamed from: f */
    private boolean f23703f = true;

    /* renamed from: g */
    private int[] f23704g = null;

    /* renamed from: h */
    private byte[] f23705h = null;

    /* renamed from: i */
    private byte[] f23706i = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    /* renamed from: e */
    private byte[] f23702e = new byte[8];

    /* renamed from: d */
    private byte[] f23701d = new byte[8];

    /* renamed from: c */
    private int f23700c = 0;

    private byte[] a(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i10];
        System.arraycopy(bArr, i10, bArr3, 0, bArr2.length);
        for (int i11 = 0; i11 != bArr2.length; i11++) {
            bArr3[i11] = (byte) (bArr3[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }

    private int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & (-16777216)) + ((bArr[i10 + 2] << 16) & 16711680) + ((bArr[i10 + 1] << 8) & 65280) + (bArr[i10] & 255);
    }

    private int[] c(byte[] bArr) {
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i10 = 0; i10 != 8; i10++) {
                iArr[i10] = b(bArr, i10 * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    private void d(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = 0;
            while (i13 < 8) {
                i13++;
                int i14 = b10;
                b10 = b11 ^ e(b10, iArr[i13]);
                b11 = i14;
            }
        }
        f(b10, bArr2, i11);
        f(b11, bArr2, i11 + 4);
    }

    private int e(int i10, int i11) {
        int i12 = i11 + i10;
        byte[] bArr = this.f23706i;
        int i13 = (bArr[((i12 >> 0) & 15) + 0] << 0) + (bArr[((i12 >> 4) & 15) + 16] << 4) + (bArr[((i12 >> 8) & 15) + 32] << 8) + (bArr[((i12 >> 12) & 15) + 48] << 12) + (bArr[((i12 >> 16) & 15) + 64] << 16) + (bArr[((i12 >> 20) & 15) + 80] << 20) + (bArr[((i12 >> 24) & 15) + 96] << 24) + (bArr[((i12 >> 28) & 15) + 112] << 28);
        return (i13 << 11) | (i13 >>> 21);
    }

    private void f(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    private void g(org.bouncycastle.crypto.i iVar) {
        if (iVar == null) {
            return;
        }
        org.bouncycastle.crypto.i iVar2 = null;
        if (iVar instanceof h1) {
            h1 h1Var = (h1) iVar;
            System.arraycopy(h1Var.b(), 0, this.f23706i, 0, h1Var.b().length);
            iVar2 = h1Var.a();
        } else if (iVar instanceof b1) {
            this.f23704g = c(((b1) iVar).a());
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + iVar.getClass().getName());
        } else {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            byte[] bArr = this.f23702e;
            System.arraycopy(a10, 0, bArr, 0, bArr.length);
            this.f23705h = f1Var.a();
            iVar2 = f1Var.b();
        }
        g(iVar2);
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        while (true) {
            int i11 = this.f23700c;
            if (i11 >= this.f23698a) {
                break;
            }
            this.f23701d[i11] = 0;
            this.f23700c = i11 + 1;
        }
        byte[] bArr2 = this.f23701d;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.f23702e.length);
        if (this.f23703f) {
            this.f23703f = false;
        } else {
            bArr3 = a(this.f23701d, 0, this.f23702e);
        }
        d(this.f23704g, bArr3, 0, this.f23702e, 0);
        byte[] bArr4 = this.f23702e;
        int i12 = this.f23699b;
        System.arraycopy(bArr4, (bArr4.length / 2) - i12, bArr, i10, i12);
        reset();
        return this.f23699b;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23699b;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        reset();
        this.f23701d = new byte[this.f23698a];
        this.f23705h = null;
        g(iVar);
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f23701d;
            if (i10 >= bArr.length) {
                this.f23700c = 0;
                this.f23703f = true;
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        int i10 = this.f23700c;
        byte[] bArr = this.f23701d;
        if (i10 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.f23702e.length);
            if (this.f23703f) {
                this.f23703f = false;
                byte[] bArr3 = this.f23705h;
                if (bArr3 != null) {
                    bArr2 = a(this.f23701d, 0, bArr3);
                }
            } else {
                bArr2 = a(this.f23701d, 0, this.f23702e);
            }
            d(this.f23704g, bArr2, 0, this.f23702e, 0);
            this.f23700c = 0;
        }
        byte[] bArr4 = this.f23701d;
        int i11 = this.f23700c;
        this.f23700c = i11 + 1;
        bArr4[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int i12 = this.f23698a;
            int i13 = this.f23700c;
            int i14 = i12 - i13;
            if (i11 > i14) {
                System.arraycopy(bArr, i10, this.f23701d, i13, i14);
                byte[] bArr2 = this.f23701d;
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, this.f23702e.length);
                if (this.f23703f) {
                    this.f23703f = false;
                    byte[] bArr4 = this.f23705h;
                    if (bArr4 != null) {
                        bArr3 = a(this.f23701d, 0, bArr4);
                    }
                } else {
                    bArr3 = a(this.f23701d, 0, this.f23702e);
                }
                d(this.f23704g, bArr3, 0, this.f23702e, 0);
                this.f23700c = 0;
                while (true) {
                    i11 -= i14;
                    i10 += i14;
                    if (i11 <= this.f23698a) {
                        break;
                    }
                    d(this.f23704g, a(bArr, i10, this.f23702e), 0, this.f23702e, 0);
                    i14 = this.f23698a;
                }
            }
            System.arraycopy(bArr, i10, this.f23701d, this.f23700c, i11);
            this.f23700c += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
