package gg;

import java.io.OutputStream;
/* loaded from: classes3.dex */
public class v1 extends k2 {
    public v1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // gg.y
    public v1 d() {
        return this;
    }

    @Override // gg.k2, gg.y
    void l(g[] gVarArr) {
        for (g gVar : gVarArr) {
            gVar.b().w().m(this, true);
        }
    }

    @Override // gg.k2, gg.y
    public void w(a0 a0Var, boolean z10) {
        a0Var.w().m(this, z10);
    }

    @Override // gg.k2, gg.y
    public void x(a0[] a0VarArr) {
        for (a0 a0Var : a0VarArr) {
            a0Var.w().m(this, true);
        }
    }
}
