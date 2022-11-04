package ad;

import ad.j0;
import he.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oe.n1;
import oe.q1;
import xc.a1;
import xc.e1;
import xc.f1;
/* loaded from: classes.dex */
public abstract class d extends k implements e1 {
    private List<? extends f1> U3;
    private final c V3 = new c();

    /* renamed from: y */
    private final xc.u f289y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<pe.g, oe.m0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            d.this = r1;
        }

        /* renamed from: b */
        public final oe.m0 invoke(pe.g gVar) {
            xc.h f10 = gVar.f(d.this);
            if (f10 != null) {
                return f10.u();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.l<q1, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            d.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
            if (((r5 instanceof xc.f1) && !hc.t.a(((xc.f1) r5).b(), r0)) != false) goto L12;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(oe.q1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                hc.t.d(r5, r0)
                boolean r0 = oe.g0.a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L2d
                ad.d r0 = ad.d.this
                oe.e1 r5 = r5.W0()
                xc.h r5 = r5.z()
                boolean r3 = r5 instanceof xc.f1
                if (r3 == 0) goto L29
                xc.f1 r5 = (xc.f1) r5
                xc.m r5 = r5.b()
                boolean r5 = hc.t.a(r5, r0)
                if (r5 != 0) goto L29
                r5 = r1
                goto L2a
            L29:
                r5 = r2
            L2a:
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r1 = r2
            L2e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ad.d.b.invoke(oe.q1):java.lang.Boolean");
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements oe.e1 {
        c() {
            d.this = r1;
        }

        @Override // oe.e1
        public oe.e1 a(pe.g gVar) {
            hc.t.e(gVar, "kotlinTypeRefiner");
            return this;
        }

        /* renamed from: d */
        public e1 z() {
            return d.this;
        }

        @Override // oe.e1
        public List<f1> getParameters() {
            return d.this.V0();
        }

        @Override // oe.e1
        public Collection<oe.e0> l() {
            Collection<oe.e0> l10 = z().L().W0().l();
            hc.t.d(l10, "declarationDescriptor.un…pe.constructor.supertypes");
            return l10;
        }

        public String toString() {
            return "[typealias " + z().getName().b() + ']';
        }

        @Override // oe.e1
        public uc.h x() {
            return ee.a.f(z());
        }

        @Override // oe.e1
        public boolean y() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xc.m mVar, yc.g gVar, wd.f fVar, a1 a1Var, xc.u uVar) {
        super(mVar, gVar, fVar, a1Var);
        hc.t.e(mVar, "containingDeclaration");
        hc.t.e(gVar, "annotations");
        hc.t.e(fVar, "name");
        hc.t.e(a1Var, "sourceElement");
        hc.t.e(uVar, "visibilityImpl");
        this.f289y = uVar;
    }

    @Override // xc.i
    public List<f1> A() {
        List list = this.U3;
        if (list == null) {
            hc.t.s("declaredTypeParametersImpl");
            return null;
        }
        return list;
    }

    @Override // xc.d0
    public boolean H() {
        return false;
    }

    @Override // xc.d0
    public boolean L0() {
        return false;
    }

    protected abstract ne.n M();

    public final oe.m0 M0() {
        he.h hVar;
        xc.e q10 = q();
        if (q10 == null || (hVar = q10.I0()) == null) {
            hVar = h.b.f11873a;
        }
        oe.m0 u10 = n1.u(this, hVar, new a());
        hc.t.d(u10, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return u10;
    }

    /* renamed from: T0 */
    public e1 z0() {
        xc.p a10 = super.a();
        hc.t.c(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (e1) a10;
    }

    public final Collection<i0> U0() {
        List h10;
        xc.e q10 = q();
        if (q10 == null) {
            h10 = ub.u.h();
            return h10;
        }
        Collection<xc.d> k10 = q10.k();
        hc.t.d(k10, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (xc.d dVar : k10) {
            j0.a aVar = j0.Companion;
            ne.n M = M();
            hc.t.d(dVar, "it");
            i0 b10 = aVar.b(M, this, dVar);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    protected abstract List<f1> V0();

    public final void W0(List<? extends f1> list) {
        hc.t.e(list, "declaredTypeParameters");
        this.U3 = list;
    }

    @Override // xc.q, xc.d0
    public xc.u g() {
        return this.f289y;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        hc.t.e(oVar, "visitor");
        return oVar.f(this, d10);
    }

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.i
    public boolean m0() {
        return n1.c(L(), new b());
    }

    @Override // xc.h
    public oe.e1 r() {
        return this.V3;
    }

    @Override // ad.j
    public String toString() {
        return "typealias " + getName().b();
    }
}
