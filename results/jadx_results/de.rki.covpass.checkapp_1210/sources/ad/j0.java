package ad;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.l1;
import oe.q0;
import oe.r1;
import xc.a1;
import xc.b;
import xc.e1;
import xc.j1;
import xc.x0;
/* loaded from: classes.dex */
public final class j0 extends p implements i0 {

    /* renamed from: t4 */
    private final ne.n f318t4;

    /* renamed from: u4 */
    private final e1 f319u4;

    /* renamed from: v4 */
    private final ne.j f320v4;

    /* renamed from: w4 */
    private xc.d f321w4;

    /* renamed from: x4 */
    static final /* synthetic */ oc.k<Object>[] f317x4 = {hc.k0.g(new hc.e0(hc.k0.b(j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1 c(e1 e1Var) {
            if (e1Var.q() == null) {
                return null;
            }
            return l1.f(e1Var.H0());
        }

        public final i0 b(ne.n nVar, e1 e1Var, xc.d dVar) {
            xc.d c10;
            List<x0> list;
            List<x0> h10;
            int s10;
            hc.t.e(nVar, "storageManager");
            hc.t.e(e1Var, "typeAliasDescriptor");
            hc.t.e(dVar, "constructor");
            l1 c11 = c(e1Var);
            x0 x0Var = null;
            if (c11 == null || (c10 = dVar.c(c11)) == null) {
                return null;
            }
            yc.g j10 = dVar.j();
            b.a h11 = dVar.h();
            hc.t.d(h11, "constructor.kind");
            a1 m10 = e1Var.m();
            hc.t.d(m10, "typeAliasDescriptor.source");
            j0 j0Var = new j0(nVar, e1Var, c10, null, j10, h11, m10, null);
            List<j1> X0 = p.X0(j0Var, dVar.o(), c11);
            if (X0 == null) {
                return null;
            }
            oe.m0 c12 = oe.b0.c(c10.e().Z0());
            oe.m0 u10 = e1Var.u();
            hc.t.d(u10, "typeAliasDescriptor.defaultType");
            oe.m0 j11 = q0.j(c12, u10);
            x0 J = dVar.J();
            if (J != null) {
                x0Var = ae.c.h(j0Var, c11.n(J.getType(), r1.INVARIANT), yc.g.Companion.b());
            }
            x0 x0Var2 = x0Var;
            xc.e q10 = e1Var.q();
            if (q10 != null) {
                List<x0> d02 = dVar.d0();
                hc.t.d(d02, "constructor.contextReceiverParameters");
                s10 = ub.v.s(d02, 10);
                list = new ArrayList<>(s10);
                for (x0 x0Var3 : d02) {
                    list.add(ae.c.c(q10, c11.n(x0Var3.getType(), r1.INVARIANT), yc.g.Companion.b()));
                }
            } else {
                h10 = ub.u.h();
                list = h10;
            }
            j0Var.a1(x0Var2, null, list, e1Var.A(), X0, j11, xc.e0.FINAL, e1Var.g());
            return j0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<j0> {

        /* renamed from: d */
        final /* synthetic */ xc.d f323d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xc.d dVar) {
            super(0);
            j0.this = r1;
            this.f323d = dVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            int s10;
            ne.n M = j0.this.M();
            e1 x12 = j0.this.x1();
            xc.d dVar = this.f323d;
            j0 j0Var = j0.this;
            yc.g j10 = dVar.j();
            b.a h10 = this.f323d.h();
            hc.t.d(h10, "underlyingConstructorDescriptor.kind");
            a1 m10 = j0.this.x1().m();
            hc.t.d(m10, "typeAliasDescriptor.source");
            j0 j0Var2 = new j0(M, x12, dVar, j0Var, j10, h10, m10, null);
            j0 j0Var3 = j0.this;
            xc.d dVar2 = this.f323d;
            l1 c10 = j0.Companion.c(j0Var3.x1());
            x0 x0Var = null;
            if (c10 == null) {
                return null;
            }
            x0 J = dVar2.J();
            if (J != null) {
                x0Var = J.c(c10);
            }
            List<x0> d02 = dVar2.d0();
            hc.t.d(d02, "underlyingConstructorDes…contextReceiverParameters");
            s10 = ub.v.s(d02, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (x0 x0Var2 : d02) {
                arrayList.add(x0Var2.c(c10));
            }
            j0Var2.a1(null, x0Var, arrayList, j0Var3.x1().A(), j0Var3.o(), j0Var3.e(), xc.e0.FINAL, j0Var3.x1().g());
            return j0Var2;
        }
    }

    private j0(ne.n nVar, e1 e1Var, xc.d dVar, i0 i0Var, yc.g gVar, b.a aVar, a1 a1Var) {
        super(e1Var, i0Var, gVar, wd.h.f24819i, aVar, a1Var);
        this.f318t4 = nVar;
        this.f319u4 = e1Var;
        e1(x1().L0());
        this.f320v4 = nVar.f(new b(dVar));
        this.f321w4 = dVar;
    }

    public /* synthetic */ j0(ne.n nVar, e1 e1Var, xc.d dVar, i0 i0Var, yc.g gVar, b.a aVar, a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, e1Var, dVar, i0Var, gVar, aVar, a1Var);
    }

    public final ne.n M() {
        return this.f318t4;
    }

    @Override // xc.l
    public boolean S() {
        return a0().S();
    }

    @Override // xc.l
    public xc.e T() {
        xc.e T = a0().T();
        hc.t.d(T, "underlyingConstructorDescriptor.constructedClass");
        return T;
    }

    @Override // ad.i0
    public xc.d a0() {
        return this.f321w4;
    }

    @Override // ad.p, xc.a
    public oe.e0 e() {
        oe.e0 e10 = super.e();
        hc.t.b(e10);
        return e10;
    }

    /* renamed from: t1 */
    public i0 n0(xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, boolean z10) {
        hc.t.e(mVar, "newOwner");
        hc.t.e(e0Var, "modality");
        hc.t.e(uVar, "visibility");
        hc.t.e(aVar, "kind");
        xc.y b10 = y().g(mVar).t(e0Var).o(uVar).e(aVar).q(z10).b();
        hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) b10;
    }

    /* renamed from: u1 */
    public j0 U0(xc.m mVar, xc.y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        hc.t.e(mVar, "newOwner");
        hc.t.e(aVar, "kind");
        hc.t.e(gVar, "annotations");
        hc.t.e(a1Var, "source");
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2) {
            b.a aVar3 = b.a.SYNTHESIZED;
        }
        return new j0(this.f318t4, x1(), a0(), this, gVar, aVar2, a1Var);
    }

    /* renamed from: v1 */
    public e1 b() {
        return x1();
    }

    /* renamed from: w1 */
    public i0 z0() {
        xc.y z02 = super.z0();
        hc.t.c(z02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) z02;
    }

    public e1 x1() {
        return this.f319u4;
    }

    /* renamed from: y1 */
    public i0 c(l1 l1Var) {
        hc.t.e(l1Var, "substitutor");
        xc.y c10 = super.c(l1Var);
        hc.t.c(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        j0 j0Var = (j0) c10;
        l1 f10 = l1.f(j0Var.e());
        hc.t.d(f10, "create(substitutedTypeAliasConstructor.returnType)");
        xc.d c11 = a0().a().c(f10);
        if (c11 == null) {
            return null;
        }
        j0Var.f321w4 = c11;
        return j0Var;
    }
}
