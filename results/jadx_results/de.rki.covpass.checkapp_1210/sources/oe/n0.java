package oe;

import java.util.List;
/* loaded from: classes3.dex */
public final class n0 extends m0 {
    private final gc.l<pe.g, m0> U3;

    /* renamed from: d */
    private final e1 f18020d;

    /* renamed from: q */
    private final List<g1> f18021q;

    /* renamed from: x */
    private final boolean f18022x;

    /* renamed from: y */
    private final he.h f18023y;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(e1 e1Var, List<? extends g1> list, boolean z10, he.h hVar, gc.l<? super pe.g, ? extends m0> lVar) {
        hc.t.e(e1Var, "constructor");
        hc.t.e(list, "arguments");
        hc.t.e(hVar, "memberScope");
        hc.t.e(lVar, "refinedTypeFactory");
        this.f18020d = e1Var;
        this.f18021q = list;
        this.f18022x = z10;
        this.f18023y = hVar;
        this.U3 = lVar;
        if (!(z() instanceof qe.f) || (z() instanceof qe.l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + z() + '\n' + W0());
    }

    @Override // oe.e0
    public List<g1> U0() {
        return this.f18021q;
    }

    @Override // oe.e0
    public a1 V0() {
        return a1.Companion.h();
    }

    @Override // oe.e0
    public e1 W0() {
        return this.f18020d;
    }

    @Override // oe.e0
    public boolean X0() {
        return this.f18022x;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        return z10 == X0() ? this : z10 ? new k0(this) : new i0(this);
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return a1Var.isEmpty() ? this : new o0(this, a1Var);
    }

    /* renamed from: f1 */
    public m0 b1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        m0 invoke = this.U3.invoke(gVar);
        return invoke == null ? this : invoke;
    }

    @Override // oe.e0
    public he.h z() {
        return this.f18023y;
    }
}
