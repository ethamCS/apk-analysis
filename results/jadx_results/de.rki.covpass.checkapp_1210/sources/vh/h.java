package vh;

import org.bouncycastle.crypto.a0;
import zh.f1;
/* loaded from: classes3.dex */
public class h implements a {

    /* renamed from: a */
    private y f24188a;

    /* renamed from: b */
    private boolean f24189b;

    /* renamed from: c */
    private int f24190c;

    /* renamed from: d */
    private org.bouncycastle.crypto.y f24191d;

    /* renamed from: e */
    private byte[] f24192e;

    /* renamed from: f */
    private byte[] f24193f;

    /* renamed from: g */
    private byte[] f24194g;

    /* renamed from: h */
    private int f24195h;

    /* renamed from: i */
    private byte[] f24196i;

    /* renamed from: j */
    private int f24197j;

    /* renamed from: k */
    private boolean f24198k;

    /* renamed from: l */
    private byte[] f24199l;

    public h(org.bouncycastle.crypto.e eVar) {
        this.f24190c = eVar.b();
        uh.c cVar = new uh.c(eVar);
        this.f24191d = cVar;
        this.f24194g = new byte[this.f24190c];
        this.f24193f = new byte[cVar.getMacSize()];
        this.f24192e = new byte[this.f24191d.getMacSize()];
        this.f24188a = new y(eVar);
    }

    private void c() {
        byte[] bArr = new byte[this.f24190c];
        int i10 = 0;
        this.f24191d.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.f24194g;
            if (i10 < bArr2.length) {
                bArr2[i10] = (byte) ((this.f24192e[i10] ^ this.f24193f[i10]) ^ bArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    private void d() {
        if (this.f24198k) {
            return;
        }
        this.f24198k = true;
        this.f24191d.doFinal(this.f24193f, 0);
        int i10 = this.f24190c;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 2;
        this.f24191d.update(bArr, 0, i10);
    }

    private int e(byte b10, byte[] bArr, int i10) {
        int i11;
        byte[] bArr2 = this.f24196i;
        int i12 = this.f24197j;
        int i13 = i12 + 1;
        this.f24197j = i13;
        bArr2[i12] = b10;
        if (i13 == bArr2.length) {
            int length = bArr.length;
            int i14 = this.f24190c;
            if (length < i10 + i14) {
                throw new a0("Output buffer is too short");
            }
            if (this.f24189b) {
                i11 = this.f24188a.a(bArr2, 0, bArr, i10);
                this.f24191d.update(bArr, i10, this.f24190c);
            } else {
                this.f24191d.update(bArr2, 0, i14);
                i11 = this.f24188a.a(this.f24196i, 0, bArr, i10);
            }
            this.f24197j = 0;
            if (!this.f24189b) {
                byte[] bArr3 = this.f24196i;
                System.arraycopy(bArr3, this.f24190c, bArr3, 0, this.f24195h);
                this.f24197j = this.f24195h;
            }
            return i11;
        }
        return 0;
    }

    private void g(boolean z10) {
        this.f24188a.reset();
        this.f24191d.reset();
        this.f24197j = 0;
        ak.a.y(this.f24196i, (byte) 0);
        if (z10) {
            ak.a.y(this.f24194g, (byte) 0);
        }
        int i10 = this.f24190c;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 1;
        this.f24191d.update(bArr, 0, i10);
        this.f24198k = false;
        byte[] bArr2 = this.f24199l;
        if (bArr2 != null) {
            a(bArr2, 0, bArr2.length);
        }
    }

    private boolean h(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24195h; i12++) {
            i11 |= this.f24194g[i12] ^ bArr[i10 + i12];
        }
        return i11 == 0;
    }

    @Override // vh.b
    public void a(byte[] bArr, int i10, int i11) {
        if (!this.f24198k) {
            this.f24191d.update(bArr, i10, i11);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    @Override // vh.b
    public byte[] b() {
        int i10 = this.f24195h;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24194g, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // vh.b
    public int doFinal(byte[] bArr, int i10) {
        d();
        int i11 = this.f24197j;
        byte[] bArr2 = this.f24196i;
        byte[] bArr3 = new byte[bArr2.length];
        this.f24197j = 0;
        if (this.f24189b) {
            int i12 = i10 + i11;
            if (bArr.length < this.f24195h + i12) {
                throw new a0("Output buffer too short");
            }
            this.f24188a.a(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11);
            this.f24191d.update(bArr3, 0, i11);
            c();
            System.arraycopy(this.f24194g, 0, bArr, i12, this.f24195h);
            g(false);
            return i11 + this.f24195h;
        }
        int i13 = this.f24195h;
        if (i11 < i13) {
            throw new org.bouncycastle.crypto.u("data too short");
        }
        if (bArr.length < (i10 + i11) - i13) {
            throw new a0("Output buffer too short");
        }
        if (i11 > i13) {
            this.f24191d.update(bArr2, 0, i11 - i13);
            this.f24188a.a(this.f24196i, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11 - this.f24195h);
        }
        c();
        if (!h(this.f24196i, i11 - this.f24195h)) {
            throw new org.bouncycastle.crypto.u("mac check in EAX failed");
        }
        g(false);
        return i11 - this.f24195h;
    }

    public void f() {
        g(true);
    }

    @Override // vh.b
    public String getAlgorithmName() {
        return this.f24188a.d().getAlgorithmName() + "/EAX";
    }

    @Override // vh.b
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f24197j;
        if (this.f24189b) {
            return i11 + this.f24195h;
        }
        int i12 = this.f24195h;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return 0;
    }

    @Override // vh.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f24188a.d();
    }

    @Override // vh.b
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f24197j;
        if (!this.f24189b) {
            int i12 = this.f24195h;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % this.f24190c);
    }

    @Override // vh.b
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        byte[] bArr;
        this.f24189b = z10;
        if (iVar instanceof zh.a) {
            zh.a aVar = (zh.a) iVar;
            bArr = aVar.d();
            this.f24199l = aVar.a();
            this.f24195h = aVar.c() / 8;
            iVar2 = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        } else {
            f1 f1Var = (f1) iVar;
            bArr = f1Var.a();
            this.f24199l = null;
            this.f24195h = this.f24191d.getMacSize() / 2;
            iVar2 = f1Var.b();
        }
        this.f24196i = new byte[z10 ? this.f24190c : this.f24190c + this.f24195h];
        byte[] bArr2 = new byte[this.f24190c];
        this.f24191d.init(iVar2);
        int i10 = this.f24190c;
        bArr2[i10 - 1] = 0;
        this.f24191d.update(bArr2, 0, i10);
        this.f24191d.update(bArr, 0, bArr.length);
        this.f24191d.doFinal(this.f24192e, 0);
        this.f24188a.init(true, new f1(null, this.f24192e));
        f();
    }

    @Override // vh.b
    public int processByte(byte b10, byte[] bArr, int i10) {
        d();
        return e(b10, bArr, i10);
    }

    @Override // vh.b
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        d();
        if (bArr.length >= i10 + i11) {
            int i13 = 0;
            for (int i14 = 0; i14 != i11; i14++) {
                i13 += e(bArr[i10 + i14], bArr2, i12 + i13);
            }
            return i13;
        }
        throw new org.bouncycastle.crypto.o("Input buffer too short");
    }
}
