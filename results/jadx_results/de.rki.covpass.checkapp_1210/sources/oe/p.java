package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class p extends r implements n, se.e {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private final m0 f18031d;

    /* renamed from: q */
    private final boolean f18032q;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(q1 q1Var) {
            return (q1Var.W0() instanceof pe.n) || (q1Var.W0().z() instanceof xc.f1) || (q1Var instanceof pe.i) || (q1Var instanceof u0);
        }

        public static /* synthetic */ p c(a aVar, q1 q1Var, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.b(q1Var, z10);
        }

        private final boolean d(q1 q1Var, boolean z10) {
            boolean z11 = false;
            if (!a(q1Var)) {
                return false;
            }
            if (q1Var instanceof u0) {
                return n1.l(q1Var);
            }
            xc.h z12 = q1Var.W0().z();
            ad.k0 k0Var = z12 instanceof ad.k0 ? (ad.k0) z12 : null;
            if (k0Var != null && !k0Var.c1()) {
                z11 = true;
            }
            if (z11) {
                return true;
            }
            return (!z10 || !(q1Var.W0().z() instanceof xc.f1)) ? !pe.o.f19170a.a(q1Var) : n1.l(q1Var);
        }

        public final p b(q1 q1Var, boolean z10) {
            hc.t.e(q1Var, "type");
            if (q1Var instanceof p) {
                return (p) q1Var;
            }
            if (!d(q1Var, z10)) {
                return null;
            }
            if (q1Var instanceof y) {
                y yVar = (y) q1Var;
                hc.t.a(yVar.e1().W0(), yVar.f1().W0());
            }
            return new p(b0.c(q1Var).d1(false), z10, null);
        }
    }

    private p(m0 m0Var, boolean z10) {
        this.f18031d = m0Var;
        this.f18032q = z10;
    }

    public /* synthetic */ p(m0 m0Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0Var, z10);
    }

    @Override // oe.r, oe.e0
    public boolean X0() {
        return false;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        return z10 ? f1().d1(z10) : this;
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return new p(f1().e1(a1Var), this.f18032q);
    }

    @Override // oe.r
    protected m0 f1() {
        return this.f18031d;
    }

    public final m0 i1() {
        return this.f18031d;
    }

    /* renamed from: j1 */
    public p h1(m0 m0Var) {
        hc.t.e(m0Var, "delegate");
        return new p(m0Var, this.f18032q);
    }

    @Override // oe.m0
    public String toString() {
        return f1() + " & Any";
    }

    @Override // oe.n
    public e0 y0(e0 e0Var) {
        hc.t.e(e0Var, "replacement");
        return q0.e(e0Var.Z0(), this.f18032q);
    }

    @Override // oe.n
    public boolean z0() {
        return (f1().W0() instanceof pe.n) || (f1().W0().z() instanceof xc.f1);
    }
}
