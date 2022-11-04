package oe;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public final class u0 extends e {
    private final he.h U3;

    /* renamed from: y */
    private final e1 f18049y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(pe.n nVar, boolean z10, e1 e1Var) {
        super(nVar, z10);
        hc.t.e(nVar, "originalTypeVariable");
        hc.t.e(e1Var, "constructor");
        this.f18049y = e1Var;
        this.U3 = nVar.x().i().z();
    }

    @Override // oe.e0
    public e1 W0() {
        return this.f18049y;
    }

    @Override // oe.e
    public e g1(boolean z10) {
        return new u0(f1(), z10, W0());
    }

    @Override // oe.m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(f1());
        sb2.append(X0() ? "?" : BuildConfig.FLAVOR);
        return sb2.toString();
    }

    @Override // oe.e, oe.e0
    public he.h z() {
        return this.U3;
    }
}
