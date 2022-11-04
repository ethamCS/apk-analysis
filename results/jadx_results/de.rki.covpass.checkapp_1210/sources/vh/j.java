package vh;

import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class j extends g0 {

    /* renamed from: b */
    private final int f24207b;

    /* renamed from: c */
    private int f24208c;

    /* renamed from: d */
    private int f24209d;

    /* renamed from: e */
    private byte[] f24210e;

    /* renamed from: f */
    private byte[] f24211f;

    /* renamed from: g */
    private org.bouncycastle.crypto.e f24212g;

    /* renamed from: h */
    private boolean f24213h;

    /* renamed from: i */
    private boolean f24214i;

    /* renamed from: j */
    private byte[] f24215j;

    /* renamed from: k */
    private byte[] f24216k;

    /* renamed from: l */
    private int f24217l;

    public j(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.b() * 8);
    }

    public j(org.bouncycastle.crypto.e eVar, int i10) {
        super(eVar);
        this.f24214i = false;
        if (i10 < 0 || i10 > eVar.b() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (eVar.b() * 8));
        }
        this.f24209d = eVar.b();
        this.f24212g = eVar;
        this.f24207b = i10 / 8;
        this.f24216k = new byte[b()];
    }

    private void g() {
        int i10 = this.f24208c;
        this.f24210e = new byte[i10];
        this.f24211f = new byte[i10];
    }

    private void h() {
        this.f24208c = this.f24209d * 2;
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, b(), bArr2, i11);
        return b();
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24207b;
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        if (this.f24217l == 0) {
            this.f24215j = e();
        }
        byte[] bArr = this.f24215j;
        int i10 = this.f24217l;
        byte b11 = (byte) (bArr[i10] ^ b10);
        byte[] bArr2 = this.f24216k;
        int i11 = i10 + 1;
        this.f24217l = i11;
        if (this.f24213h) {
            b10 = b11;
        }
        bArr2[i10] = b10;
        if (i11 == b()) {
            this.f24217l = 0;
            f(this.f24216k);
        }
        return b11;
    }

    byte[] e() {
        byte[] b10 = q.b(this.f24210e, this.f24209d);
        byte[] bArr = new byte[b10.length];
        this.f24212g.a(b10, 0, bArr, 0);
        return q.b(bArr, this.f24207b);
    }

    void f(byte[] bArr) {
        byte[] a10 = q.a(this.f24210e, this.f24208c - this.f24207b);
        System.arraycopy(a10, 0, this.f24210e, 0, a10.length);
        System.arraycopy(bArr, 0, this.f24210e, a10.length, this.f24208c - a10.length);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24212g.getAlgorithmName() + "/CFB" + (this.f24209d * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f24213h = z10;
        if (!(iVar instanceof f1)) {
            h();
            g();
            byte[] bArr = this.f24211f;
            System.arraycopy(bArr, 0, this.f24210e, 0, bArr.length);
            if (iVar != null) {
                eVar = this.f24212g;
                eVar.init(true, iVar);
            }
            this.f24214i = true;
        }
        f1 f1Var = (f1) iVar;
        byte[] a10 = f1Var.a();
        if (a10.length < this.f24209d) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f24208c = a10.length;
        g();
        byte[] h10 = ak.a.h(a10);
        this.f24211f = h10;
        System.arraycopy(h10, 0, this.f24210e, 0, h10.length);
        if (f1Var.b() != null) {
            eVar = this.f24212g;
            iVar = f1Var.b();
            eVar.init(true, iVar);
        }
        this.f24214i = true;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f24217l = 0;
        ak.a.g(this.f24216k);
        ak.a.g(this.f24215j);
        if (this.f24214i) {
            byte[] bArr = this.f24211f;
            System.arraycopy(bArr, 0, this.f24210e, 0, bArr.length);
            this.f24212g.reset();
        }
    }
}
