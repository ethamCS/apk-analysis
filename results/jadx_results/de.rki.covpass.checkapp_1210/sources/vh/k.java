package vh;

import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class k extends g0 {

    /* renamed from: b */
    private final int f24218b;

    /* renamed from: c */
    private byte[] f24219c;

    /* renamed from: d */
    private byte[] f24220d;

    /* renamed from: e */
    private byte[] f24221e;

    /* renamed from: f */
    private final int f24222f;

    /* renamed from: g */
    private final org.bouncycastle.crypto.e f24223g;

    /* renamed from: h */
    private int f24224h;

    /* renamed from: i */
    private boolean f24225i;

    public k(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.b() * 8);
    }

    public k(org.bouncycastle.crypto.e eVar, int i10) {
        super(eVar);
        this.f24224h = 0;
        if (i10 < 0 || i10 > eVar.b() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (eVar.b() * 8));
        }
        this.f24223g = eVar;
        int b10 = eVar.b();
        this.f24222f = b10;
        this.f24218b = i10 / 8;
        this.f24219c = new byte[b10];
    }

    private byte[] e() {
        byte[] bArr = this.f24219c;
        byte[] bArr2 = new byte[bArr.length];
        this.f24223g.a(bArr, 0, bArr2, 0);
        return q.b(bArr2, this.f24218b);
    }

    private void f() {
        byte[] bArr = this.f24219c;
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + 1);
    }

    private void g() {
        int i10 = this.f24222f;
        this.f24220d = new byte[i10 / 2];
        this.f24219c = new byte[i10];
        this.f24221e = new byte[this.f24218b];
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f24218b, bArr2, i11);
        return this.f24218b;
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24218b;
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        if (this.f24224h == 0) {
            this.f24221e = e();
        }
        byte[] bArr = this.f24221e;
        int i10 = this.f24224h;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        int i11 = i10 + 1;
        this.f24224h = i11;
        if (i11 == this.f24218b) {
            this.f24224h = 0;
            f();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24223g.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (!(iVar instanceof f1)) {
            g();
            if (iVar != null) {
                eVar = this.f24223g;
                eVar.init(true, iVar);
            }
            this.f24225i = true;
        }
        f1 f1Var = (f1) iVar;
        g();
        byte[] h10 = ak.a.h(f1Var.a());
        this.f24220d = h10;
        if (h10.length != this.f24222f / 2) {
            throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
        }
        System.arraycopy(h10, 0, this.f24219c, 0, h10.length);
        for (int length = this.f24220d.length; length < this.f24222f; length++) {
            this.f24219c[length] = 0;
        }
        if (f1Var.b() != null) {
            eVar = this.f24223g;
            iVar = f1Var.b();
            eVar.init(true, iVar);
        }
        this.f24225i = true;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f24225i) {
            byte[] bArr = this.f24220d;
            System.arraycopy(bArr, 0, this.f24219c, 0, bArr.length);
            for (int length = this.f24220d.length; length < this.f24222f; length++) {
                this.f24219c[length] = 0;
            }
            this.f24224h = 0;
            this.f24223g.reset();
        }
    }
}
