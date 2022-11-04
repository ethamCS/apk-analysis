package ad;

import he.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.y0;
import xc.q0;
/* loaded from: classes.dex */
public class h0 extends he.i {

    /* renamed from: a */
    private final xc.h0 f312a;

    /* renamed from: b */
    private final wd.c f313b;

    public h0(xc.h0 h0Var, wd.c cVar) {
        hc.t.e(h0Var, "moduleDescriptor");
        hc.t.e(cVar, "fqName");
        this.f312a = h0Var;
        this.f313b = cVar;
    }

    @Override // he.i, he.k
    public Collection<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        List h11;
        hc.t.e(dVar, "kindFilter");
        hc.t.e(lVar, "nameFilter");
        if (!dVar.a(he.d.Companion.f())) {
            h11 = ub.u.h();
            return h11;
        } else if (this.f313b.d() && dVar.l().contains(c.b.f11833a)) {
            h10 = ub.u.h();
            return h10;
        } else {
            Collection<wd.c> t10 = this.f312a.t(this.f313b, lVar);
            ArrayList arrayList = new ArrayList(t10.size());
            for (wd.c cVar : t10) {
                wd.f g10 = cVar.g();
                hc.t.d(g10, "subFqName.shortName()");
                if (lVar.invoke(g10).booleanValue()) {
                    ye.a.a(arrayList, h(g10));
                }
            }
            return arrayList;
        }
    }

    @Override // he.i, he.h
    public Set<wd.f> g() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    protected final q0 h(wd.f fVar) {
        hc.t.e(fVar, "name");
        if (fVar.l()) {
            return null;
        }
        xc.h0 h0Var = this.f312a;
        wd.c c10 = this.f313b.c(fVar);
        hc.t.d(c10, "fqName.child(name)");
        q0 F = h0Var.F(c10);
        if (!F.isEmpty()) {
            return F;
        }
        return null;
    }

    public String toString() {
        return "subpackages of " + this.f313b + " from " + this.f312a;
    }
}
