package rh;

import ak.m;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.i;
import zh.q0;
/* loaded from: classes3.dex */
public class b extends a {
    public b(e eVar) {
        super(eVar);
        if (eVar.b() == 16) {
            if (!m.c("org.bouncycastle.fpe.disable") && !m.c("org.bouncycastle.fpe.disable_ff1")) {
                return;
            }
            throw new UnsupportedOperationException("FF1 encryption disabled");
        }
        throw new IllegalArgumentException("base cipher needs to be 128 bits");
    }

    @Override // rh.a
    protected int a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f21213c.b() > 256 ? a.f(d.o(this.f21211a, this.f21213c.b(), this.f21213c.c(), a.g(bArr), i10, i11 / 2)) : d.n(this.f21211a, this.f21213c.b(), this.f21213c.c(), bArr, i10, i11), 0, bArr2, i12, i11);
        return i11;
    }

    @Override // rh.a
    protected int b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f21213c.b() > 256 ? a.f(d.u(this.f21211a, this.f21213c.b(), this.f21213c.c(), a.g(bArr), i10, i11 / 2)) : d.t(this.f21211a, this.f21213c.b(), this.f21213c.c(), bArr, i10, i11), 0, bArr2, i12, i11);
        return i11;
    }

    @Override // rh.a
    public String c() {
        return "FF1";
    }

    @Override // rh.a
    public void d(boolean z10, i iVar) {
        this.f21212b = z10;
        q0 q0Var = (q0) iVar;
        this.f21213c = q0Var;
        this.f21211a.init(!q0Var.d(), this.f21213c.a());
    }
}
