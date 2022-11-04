package gg;

import java.io.OutputStream;
/* loaded from: classes3.dex */
public class k2 extends y {
    public k2(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // gg.y
    public k2 e() {
        return this;
    }

    @Override // gg.y
    void l(g[] gVarArr) {
        for (g gVar : gVarArr) {
            gVar.b().z().m(this, true);
        }
    }

    @Override // gg.y
    public void w(a0 a0Var, boolean z10) {
        a0Var.z().m(this, z10);
    }

    @Override // gg.y
    public void x(a0[] a0VarArr) {
        for (a0 a0Var : a0VarArr) {
            a0Var.z().m(this, true);
        }
    }
}
