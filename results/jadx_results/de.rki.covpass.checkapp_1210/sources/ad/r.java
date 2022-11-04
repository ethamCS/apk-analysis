package ad;

import he.b;
import he.h;
import java.util.ArrayList;
import java.util.List;
import xc.o0;
import xc.q0;
/* loaded from: classes.dex */
public class r extends j implements q0 {
    static final /* synthetic */ oc.k<Object>[] W3 = {hc.k0.g(new hc.e0(hc.k0.b(r.class), "fragments", "getFragments()Ljava/util/List;")), hc.k0.g(new hc.e0(hc.k0.b(r.class), "empty", "getEmpty()Z"))};
    private final ne.i U3;
    private final he.h V3;

    /* renamed from: q */
    private final x f393q;

    /* renamed from: x */
    private final wd.c f394x;

    /* renamed from: y */
    private final ne.i f395y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            r.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(o0.b(r.this.p0().Z0(), r.this.d()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<List<? extends xc.l0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            r.this = r1;
        }

        @Override // gc.a
        public final List<? extends xc.l0> invoke() {
            return o0.c(r.this.p0().Z0(), r.this.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<he.h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            r.this = r1;
        }

        /* renamed from: b */
        public final he.h invoke() {
            int s10;
            List p02;
            if (r.this.isEmpty()) {
                return h.b.f11873a;
            }
            List<xc.l0> f02 = r.this.f0();
            s10 = ub.v.s(f02, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (xc.l0 l0Var : f02) {
                arrayList.add(l0Var.z());
            }
            p02 = ub.c0.p0(arrayList, new h0(r.this.p0(), r.this.d()));
            b.a aVar = he.b.Companion;
            return aVar.a("package view scope for " + r.this.d() + " in " + r.this.p0().getName(), p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, wd.c cVar, ne.n nVar) {
        super(yc.g.Companion.b(), cVar.h());
        hc.t.e(xVar, "module");
        hc.t.e(cVar, "fqName");
        hc.t.e(nVar, "storageManager");
        this.f393q = xVar;
        this.f394x = cVar;
        this.f395y = nVar.d(new b());
        this.U3 = nVar.d(new a());
        this.V3 = new he.g(nVar, new c());
    }

    protected final boolean M0() {
        return ((Boolean) ne.m.a(this.U3, this, W3[1])).booleanValue();
    }

    /* renamed from: T0 */
    public x p0() {
        return this.f393q;
    }

    @Override // xc.q0
    public wd.c d() {
        return this.f394x;
    }

    public boolean equals(Object obj) {
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        return q0Var != null && hc.t.a(d(), q0Var.d()) && hc.t.a(p0(), q0Var.p0());
    }

    @Override // xc.q0
    public List<xc.l0> f0() {
        return (List) ne.m.a(this.f395y, this, W3[0]);
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        hc.t.e(oVar, "visitor");
        return oVar.h(this, d10);
    }

    public int hashCode() {
        return (p0().hashCode() * 31) + d().hashCode();
    }

    @Override // xc.q0
    public boolean isEmpty() {
        return M0();
    }

    @Override // xc.q0
    public he.h z() {
        return this.V3;
    }

    /* renamed from: z0 */
    public q0 b() {
        if (d().d()) {
            return null;
        }
        x p02 = p0();
        wd.c e10 = d().e();
        hc.t.d(e10, "fqName.parent()");
        return p02.F(e10);
    }
}
