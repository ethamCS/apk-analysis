package oe;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public abstract class e extends m0 {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private final pe.n f17949d;

    /* renamed from: q */
    private final boolean f17950q;

    /* renamed from: x */
    private final he.h f17951x;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(pe.n nVar, boolean z10) {
        hc.t.e(nVar, "originalTypeVariable");
        this.f17949d = nVar;
        this.f17950q = z10;
        this.f17951x = qe.k.b(qe.g.STUB_TYPE_SCOPE, nVar.toString());
    }

    @Override // oe.e0
    public List<g1> U0() {
        List<g1> h10;
        h10 = ub.u.h();
        return h10;
    }

    @Override // oe.e0
    public a1 V0() {
        return a1.Companion.h();
    }

    @Override // oe.e0
    public boolean X0() {
        return this.f17950q;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        return z10 == X0() ? this : g1(z10);
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return this;
    }

    public final pe.n f1() {
        return this.f17949d;
    }

    public abstract e g1(boolean z10);

    /* renamed from: h1 */
    public e b1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // oe.e0
    public he.h z() {
        return this.f17951x;
    }
}
