package uh;

import nh.f0;
import org.bouncycastle.crypto.y;
import zh.b1;
import zh.p1;
/* loaded from: classes3.dex */
public class o implements y {

    /* renamed from: a */
    private f0 f23767a;

    public o(int i10, int i11) {
        this.f23767a = new f0(i10, i11);
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        return this.f23767a.g(bArr, i10);
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "Skein-MAC-" + (this.f23767a.h() * 8) + "-" + (this.f23767a.i() * 8);
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23767a.i();
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        p1 p1Var;
        if (iVar instanceof p1) {
            p1Var = (p1) iVar;
        } else if (!(iVar instanceof b1)) {
            throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + iVar.getClass().getName());
        } else {
            p1Var = new p1.b().c(((b1) iVar).a()).a();
        }
        if (p1Var.a() != null) {
            this.f23767a.j(p1Var);
            return;
        }
        throw new IllegalArgumentException("Skein MAC requires a key parameter.");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23767a.n();
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23767a.s(b10);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        this.f23767a.t(bArr, i10, i11);
    }
}
