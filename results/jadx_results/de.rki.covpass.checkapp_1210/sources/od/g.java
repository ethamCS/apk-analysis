package od;

import hc.t;
import oe.a1;
import oe.e0;
import oe.f0;
import oe.j0;
import oe.m0;
import oe.n1;
import oe.p1;
import oe.q1;
import oe.y;
/* loaded from: classes.dex */
public final class g extends oe.r implements j0 {

    /* renamed from: d */
    private final m0 f17841d;

    public g(m0 m0Var) {
        t.e(m0Var, "delegate");
        this.f17841d = m0Var;
    }

    private final m0 i1(m0 m0Var) {
        m0 d12 = m0Var.d1(false);
        return !te.a.q(m0Var) ? d12 : new g(d12);
    }

    @Override // oe.r, oe.e0
    public boolean X0() {
        return false;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        return z10 ? f1().d1(true) : this;
    }

    @Override // oe.r
    protected m0 f1() {
        return this.f17841d;
    }

    /* renamed from: j1 */
    public g e1(a1 a1Var) {
        t.e(a1Var, "newAttributes");
        return new g(f1().e1(a1Var));
    }

    /* renamed from: k1 */
    public g h1(m0 m0Var) {
        t.e(m0Var, "delegate");
        return new g(m0Var);
    }

    @Override // oe.n
    public e0 y0(e0 e0Var) {
        t.e(e0Var, "replacement");
        q1 Z0 = e0Var.Z0();
        if (te.a.q(Z0) || n1.l(Z0)) {
            if (Z0 instanceof m0) {
                return i1((m0) Z0);
            }
            if (Z0 instanceof y) {
                y yVar = (y) Z0;
                return p1.d(f0.d(i1(yVar.e1()), i1(yVar.f1())), p1.a(Z0));
            }
            throw new IllegalStateException(("Incorrect type: " + Z0).toString());
        }
        return Z0;
    }

    @Override // oe.n
    public boolean z0() {
        return true;
    }
}
