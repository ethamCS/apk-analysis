package vh;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.a0;
import zh.f1;
/* loaded from: classes3.dex */
public class d implements vh.a {

    /* renamed from: a */
    private org.bouncycastle.crypto.e f24156a;

    /* renamed from: b */
    private int f24157b;

    /* renamed from: c */
    private boolean f24158c;

    /* renamed from: d */
    private byte[] f24159d;

    /* renamed from: e */
    private byte[] f24160e;

    /* renamed from: f */
    private int f24161f;

    /* renamed from: g */
    private org.bouncycastle.crypto.i f24162g;

    /* renamed from: h */
    private byte[] f24163h;

    /* renamed from: i */
    private a f24164i = new a();

    /* renamed from: j */
    private a f24165j = new a();

    /* loaded from: classes3.dex */
    public class a extends ByteArrayOutputStream {
        public a() {
            d.this = r1;
        }

        public byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public d(org.bouncycastle.crypto.e eVar) {
        this.f24156a = eVar;
        int b10 = eVar.b();
        this.f24157b = b10;
        this.f24163h = new byte[b10];
        if (b10 == 16) {
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    private int c(byte[] bArr, int i10, int i11, byte[] bArr2) {
        uh.a aVar = new uh.a(this.f24156a, this.f24161f * 8);
        aVar.init(this.f24162g);
        byte[] bArr3 = new byte[16];
        if (f()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i12 = 2;
        bArr3[0] = (byte) (bArr3[0] | ((((aVar.getMacSize() - 2) / 2) & 7) << 3));
        byte b10 = bArr3[0];
        byte[] bArr4 = this.f24159d;
        bArr3[0] = (byte) (b10 | (((15 - bArr4.length) - 1) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i13 = i11;
        int i14 = 1;
        while (i13 > 0) {
            bArr3[16 - i14] = (byte) (i13 & 255);
            i13 >>>= 8;
            i14++;
        }
        aVar.update(bArr3, 0, 16);
        if (f()) {
            int d10 = d();
            if (d10 < 65280) {
                aVar.update((byte) (d10 >> 8));
                aVar.update((byte) d10);
            } else {
                aVar.update((byte) -1);
                aVar.update((byte) -2);
                aVar.update((byte) (d10 >> 24));
                aVar.update((byte) (d10 >> 16));
                aVar.update((byte) (d10 >> 8));
                aVar.update((byte) d10);
                i12 = 6;
            }
            byte[] bArr5 = this.f24160e;
            if (bArr5 != null) {
                aVar.update(bArr5, 0, bArr5.length);
            }
            if (this.f24164i.size() > 0) {
                aVar.update(this.f24164i.b(), 0, this.f24164i.size());
            }
            int i15 = (i12 + d10) % 16;
            if (i15 != 0) {
                while (i15 != 16) {
                    aVar.update((byte) 0);
                    i15++;
                }
            }
        }
        aVar.update(bArr, i10, i11);
        return aVar.doFinal(bArr2, 0);
    }

    private int d() {
        int size = this.f24164i.size();
        byte[] bArr = this.f24160e;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int e(boolean z10, int i10) {
        if (!z10 || (i10 >= 32 && i10 <= 128 && (i10 & 15) == 0)) {
            return i10 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    private boolean f() {
        return d() > 0;
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        this.f24164i.write(bArr, i10, i11);
    }

    @Override // vh.b
    public byte[] b() {
        int i10 = this.f24161f;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24163h, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        int h10 = h(this.f24165j.b(), 0, this.f24165j.size(), bArr, i10);
        i();
        return h10;
    }

    public void g(byte b10) {
        this.f24164i.write(b10);
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24156a.getAlgorithmName() + "/CCM";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        int size = i10 + this.f24165j.size();
        if (this.f24158c) {
            return size + this.f24161f;
        }
        int i11 = this.f24161f;
        if (size >= i11) {
            return size - i11;
        }
        return 0;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24156a;
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    public int h(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        if (this.f24162g != null) {
            byte[] bArr3 = this.f24159d;
            int length = 15 - bArr3.length;
            if (length < 4 && i11 >= (1 << (length * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q.");
            }
            byte[] bArr4 = new byte[this.f24157b];
            bArr4[0] = (byte) ((length - 1) & 7);
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            y yVar = new y(this.f24156a);
            yVar.init(this.f24158c, new f1(this.f24162g, bArr4));
            if (!this.f24158c) {
                int i14 = this.f24161f;
                if (i11 < i14) {
                    throw new org.bouncycastle.crypto.u("data too short");
                }
                int i15 = i11 - i14;
                if (bArr2.length < i15 + i12) {
                    throw new a0("Output buffer too short.");
                }
                int i16 = i10 + i15;
                System.arraycopy(bArr, i16, this.f24163h, 0, i14);
                byte[] bArr5 = this.f24163h;
                yVar.a(bArr5, 0, bArr5, 0);
                int i17 = this.f24161f;
                while (true) {
                    byte[] bArr6 = this.f24163h;
                    if (i17 == bArr6.length) {
                        break;
                    }
                    bArr6[i17] = 0;
                    i17++;
                }
                int i18 = i10;
                int i19 = i12;
                while (true) {
                    i13 = this.f24157b;
                    if (i18 >= i16 - i13) {
                        break;
                    }
                    yVar.a(bArr, i18, bArr2, i19);
                    int i20 = this.f24157b;
                    i19 += i20;
                    i18 += i20;
                }
                byte[] bArr7 = new byte[i13];
                int i21 = i15 - (i18 - i10);
                System.arraycopy(bArr, i18, bArr7, 0, i21);
                yVar.a(bArr7, 0, bArr7, 0);
                System.arraycopy(bArr7, 0, bArr2, i19, i21);
                byte[] bArr8 = new byte[this.f24157b];
                c(bArr2, i12, i15, bArr8);
                if (!ak.a.u(this.f24163h, bArr8)) {
                    throw new org.bouncycastle.crypto.u("mac check in CCM failed");
                }
                return i15;
            }
            int i22 = this.f24161f + i11;
            if (bArr2.length < i22 + i12) {
                throw new a0("Output buffer too short.");
            }
            c(bArr, i10, i11, this.f24163h);
            byte[] bArr9 = new byte[this.f24157b];
            yVar.a(this.f24163h, 0, bArr9, 0);
            int i23 = i10;
            int i24 = i12;
            while (true) {
                int i25 = i10 + i11;
                int i26 = this.f24157b;
                if (i23 >= i25 - i26) {
                    byte[] bArr10 = new byte[i26];
                    int i27 = i25 - i23;
                    System.arraycopy(bArr, i23, bArr10, 0, i27);
                    yVar.a(bArr10, 0, bArr10, 0);
                    System.arraycopy(bArr10, 0, bArr2, i24, i27);
                    System.arraycopy(bArr9, 0, bArr2, i12 + i11, this.f24161f);
                    return i22;
                }
                yVar.a(bArr, i23, bArr2, i24);
                int i28 = this.f24157b;
                i24 += i28;
                i23 += i28;
            }
        } else {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
    }

    public void i() {
        this.f24156a.reset();
        this.f24164i.reset();
        this.f24165j.reset();
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        this.f24158c = z10;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            this.f24159d = aVar.d();
            this.f24160e = aVar.a();
            this.f24161f = e(z10, aVar.c());
            iVar2 = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + iVar.getClass().getName());
        } else {
            f1 f1Var = (f1) iVar;
            this.f24159d = f1Var.a();
            this.f24160e = null;
            this.f24161f = e(z10, 64);
            iVar2 = f1Var.b();
        }
        if (iVar2 != null) {
            this.f24162g = iVar2;
        }
        byte[] bArr = this.f24159d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        i();
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        this.f24165j.write(b10);
        return 0;
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length >= i10 + i11) {
            this.f24165j.write(bArr, i10, i11);
            return 0;
        }
        throw new org.bouncycastle.crypto.o("Input buffer too short");
    }
}
