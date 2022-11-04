package be;

import hc.t;
import he.h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.g1;
import oe.m0;
import org.conscrypt.BuildConfig;
import pe.g;
import qe.k;
import ub.u;
/* loaded from: classes3.dex */
public final class a extends m0 implements se.d {

    /* renamed from: d */
    private final g1 f5976d;

    /* renamed from: q */
    private final b f5977q;

    /* renamed from: x */
    private final boolean f5978x;

    /* renamed from: y */
    private final a1 f5979y;

    public a(g1 g1Var, b bVar, boolean z10, a1 a1Var) {
        t.e(g1Var, "typeProjection");
        t.e(bVar, "constructor");
        t.e(a1Var, "attributes");
        this.f5976d = g1Var;
        this.f5977q = bVar;
        this.f5978x = z10;
        this.f5979y = a1Var;
    }

    public /* synthetic */ a(g1 g1Var, b bVar, boolean z10, a1 a1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g1Var, (i10 & 2) != 0 ? new c(g1Var) : bVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? a1.Companion.h() : a1Var);
    }

    @Override // oe.e0
    public List<g1> U0() {
        List<g1> h10;
        h10 = u.h();
        return h10;
    }

    @Override // oe.e0
    public a1 V0() {
        return this.f5979y;
    }

    @Override // oe.e0
    public boolean X0() {
        return this.f5978x;
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        t.e(a1Var, "newAttributes");
        return new a(this.f5976d, W0(), X0(), a1Var);
    }

    /* renamed from: f1 */
    public b W0() {
        return this.f5977q;
    }

    /* renamed from: g1 */
    public a d1(boolean z10) {
        return z10 == X0() ? this : new a(this.f5976d, W0(), z10, V0());
    }

    /* renamed from: h1 */
    public a b1(g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        g1 a10 = this.f5976d.a(gVar);
        t.d(a10, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(a10, W0(), X0(), V0());
    }

    @Override // oe.m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f5976d);
        sb2.append(')');
        sb2.append(X0() ? "?" : BuildConfig.FLAVOR);
        return sb2.toString();
    }

    @Override // oe.e0
    public h z() {
        return k.a(qe.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
