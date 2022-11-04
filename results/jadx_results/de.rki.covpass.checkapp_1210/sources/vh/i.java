package vh;

import zh.f1;
/* loaded from: classes3.dex */
public class i implements org.bouncycastle.crypto.e {

    /* renamed from: a */
    private int f24200a;

    /* renamed from: b */
    private int f24201b;

    /* renamed from: c */
    private byte[] f24202c;

    /* renamed from: d */
    private byte[] f24203d;

    /* renamed from: e */
    private org.bouncycastle.crypto.e f24204e;

    /* renamed from: f */
    private boolean f24205f = false;

    /* renamed from: g */
    private boolean f24206g;

    public i(org.bouncycastle.crypto.e eVar) {
        this.f24201b = eVar.b();
        this.f24204e = eVar;
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] b10 = q.b(this.f24202c, this.f24201b);
        byte[] c10 = q.c(bArr, this.f24201b, i10);
        byte[] bArr3 = new byte[c10.length];
        this.f24204e.a(c10, 0, bArr3, 0);
        byte[] d10 = q.d(bArr3, b10);
        System.arraycopy(d10, 0, bArr2, i11, d10.length);
        if (bArr2.length > i11 + d10.length) {
            e(c10);
        }
        return d10.length;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] d10 = q.d(q.c(bArr, this.f24201b, i10), q.b(this.f24202c, this.f24201b));
        int length = d10.length;
        byte[] bArr3 = new byte[length];
        this.f24204e.a(d10, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i11, length);
        if (bArr2.length > i11 + d10.length) {
            e(bArr3);
        }
        return length;
    }

    private void e(byte[] bArr) {
        byte[] a10 = q.a(this.f24202c, this.f24200a - this.f24201b);
        System.arraycopy(a10, 0, this.f24202c, 0, a10.length);
        System.arraycopy(bArr, 0, this.f24202c, a10.length, this.f24200a - a10.length);
    }

    private void f() {
        int i10 = this.f24200a;
        this.f24202c = new byte[i10];
        this.f24203d = new byte[i10];
    }

    private void g() {
        this.f24200a = this.f24201b;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f24206g ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24201b;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24204e.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f24206g = z10;
        if (!(iVar instanceof f1)) {
            g();
            f();
            byte[] bArr = this.f24203d;
            System.arraycopy(bArr, 0, this.f24202c, 0, bArr.length);
            if (iVar != null) {
                eVar = this.f24204e;
                eVar.init(z10, iVar);
            }
            this.f24205f = true;
        }
        f1 f1Var = (f1) iVar;
        byte[] a10 = f1Var.a();
        if (a10.length < this.f24201b) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f24200a = a10.length;
        f();
        byte[] h10 = ak.a.h(a10);
        this.f24203d = h10;
        System.arraycopy(h10, 0, this.f24202c, 0, h10.length);
        if (f1Var.b() != null) {
            eVar = this.f24204e;
            iVar = f1Var.b();
            eVar.init(z10, iVar);
        }
        this.f24205f = true;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f24205f) {
            byte[] bArr = this.f24203d;
            System.arraycopy(bArr, 0, this.f24202c, 0, bArr.length);
            this.f24204e.reset();
        }
    }
}
