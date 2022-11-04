package pe;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.g1;
import oe.m0;
import oe.q1;
import xc.f1;
/* loaded from: classes3.dex */
public final class i extends m0 implements se.d {
    private final boolean U3;
    private final boolean V3;

    /* renamed from: d */
    private final se.b f19150d;

    /* renamed from: q */
    private final j f19151q;

    /* renamed from: x */
    private final q1 f19152x;

    /* renamed from: y */
    private final a1 f19153y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(se.b bVar, q1 q1Var, g1 g1Var, f1 f1Var) {
        this(bVar, new j(g1Var, null, null, f1Var, 6, null), q1Var, null, false, false, 56, null);
        hc.t.e(bVar, "captureStatus");
        hc.t.e(g1Var, "projection");
        hc.t.e(f1Var, "typeParameter");
    }

    public i(se.b bVar, j jVar, q1 q1Var, a1 a1Var, boolean z10, boolean z11) {
        hc.t.e(bVar, "captureStatus");
        hc.t.e(jVar, "constructor");
        hc.t.e(a1Var, "attributes");
        this.f19150d = bVar;
        this.f19151q = jVar;
        this.f19152x = q1Var;
        this.f19153y = a1Var;
        this.U3 = z10;
        this.V3 = z11;
    }

    public /* synthetic */ i(se.b bVar, j jVar, q1 q1Var, a1 a1Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jVar, q1Var, (i10 & 8) != 0 ? a1.Companion.h() : a1Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // oe.e0
    public List<g1> U0() {
        List<g1> h10;
        h10 = ub.u.h();
        return h10;
    }

    @Override // oe.e0
    public a1 V0() {
        return this.f19153y;
    }

    @Override // oe.e0
    public boolean X0() {
        return this.U3;
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return new i(this.f19150d, W0(), this.f19152x, a1Var, X0(), this.V3);
    }

    public final se.b f1() {
        return this.f19150d;
    }

    /* renamed from: g1 */
    public j W0() {
        return this.f19151q;
    }

    public final q1 h1() {
        return this.f19152x;
    }

    public final boolean i1() {
        return this.V3;
    }

    /* renamed from: j1 */
    public i d1(boolean z10) {
        return new i(this.f19150d, W0(), this.f19152x, V0(), z10, false, 32, null);
    }

    /* renamed from: k1 */
    public i b1(g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        se.b bVar = this.f19150d;
        j a10 = W0().a(gVar);
        q1 q1Var = this.f19152x;
        return new i(bVar, a10, q1Var != null ? gVar.h(q1Var).Z0() : null, V0(), X0(), false, 32, null);
    }

    @Override // oe.e0
    public he.h z() {
        return qe.k.a(qe.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
