package vh;

import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class l extends g0 {

    /* renamed from: b */
    private int f24226b;

    /* renamed from: c */
    private int f24227c;

    /* renamed from: d */
    private byte[] f24228d;

    /* renamed from: e */
    private byte[] f24229e;

    /* renamed from: f */
    private byte[] f24230f;

    /* renamed from: g */
    private org.bouncycastle.crypto.e f24231g;

    /* renamed from: h */
    private int f24232h;

    /* renamed from: i */
    private boolean f24233i = false;

    public l(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        int b10 = eVar.b();
        this.f24227c = b10;
        this.f24231g = eVar;
        this.f24230f = new byte[b10];
    }

    private void e() {
        byte[] a10 = q.a(this.f24228d, this.f24226b - this.f24227c);
        System.arraycopy(a10, 0, this.f24228d, 0, a10.length);
        System.arraycopy(this.f24230f, 0, this.f24228d, a10.length, this.f24226b - a10.length);
    }

    private void f() {
        this.f24231g.a(q.b(this.f24228d, this.f24227c), 0, this.f24230f, 0);
    }

    private void g() {
        int i10 = this.f24226b;
        this.f24228d = new byte[i10];
        this.f24229e = new byte[i10];
    }

    private void h() {
        this.f24226b = this.f24227c * 2;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f24227c, bArr2, i11);
        return this.f24227c;
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24227c;
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        if (this.f24232h == 0) {
            f();
        }
        byte[] bArr = this.f24230f;
        int i10 = this.f24232h;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        int i11 = i10 + 1;
        this.f24232h = i11;
        if (i11 == b()) {
            this.f24232h = 0;
            e();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24231g.getAlgorithmName() + "/OFB";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (!(iVar instanceof f1)) {
            h();
            g();
            byte[] bArr = this.f24229e;
            System.arraycopy(bArr, 0, this.f24228d, 0, bArr.length);
            if (iVar != null) {
                eVar = this.f24231g;
                eVar.init(true, iVar);
            }
            this.f24233i = true;
        }
        f1 f1Var = (f1) iVar;
        byte[] a10 = f1Var.a();
        if (a10.length < this.f24227c) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f24226b = a10.length;
        g();
        byte[] h10 = ak.a.h(a10);
        this.f24229e = h10;
        System.arraycopy(h10, 0, this.f24228d, 0, h10.length);
        if (f1Var.b() != null) {
            eVar = this.f24231g;
            iVar = f1Var.b();
            eVar.init(true, iVar);
        }
        this.f24233i = true;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f24233i) {
            byte[] bArr = this.f24229e;
            System.arraycopy(bArr, 0, this.f24228d, 0, bArr.length);
            ak.a.g(this.f24230f);
            this.f24232h = 0;
            this.f24231g.reset();
        }
    }
}
