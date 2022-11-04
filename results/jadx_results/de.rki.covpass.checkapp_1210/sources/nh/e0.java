package nh;

import zh.p1;
/* loaded from: classes3.dex */
public class e0 implements org.bouncycastle.crypto.t, ak.i {

    /* renamed from: a */
    private f0 f17155a;

    public e0(int i10, int i11) {
        this.f17155a = new f0(i10, i11);
        d(null);
    }

    public e0(e0 e0Var) {
        this.f17155a = new f0(e0Var.f17155a);
    }

    @Override // ak.i
    public ak.i a() {
        return new e0(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        this.f17155a.b(((e0) iVar).f17155a);
    }

    public void d(p1 p1Var) {
        this.f17155a.j(p1Var);
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        return this.f17155a.g(bArr, i10);
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "Skein-" + (this.f17155a.h() * 8) + "-" + (this.f17155a.i() * 8);
    }

    @Override // org.bouncycastle.crypto.t
    public int getByteLength() {
        return this.f17155a.h();
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17155a.i();
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17155a.n();
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        this.f17155a.s(b10);
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        this.f17155a.t(bArr, i10, i11);
    }
}
