package he;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.u;
import xc.e1;
/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: a */
    private final h f11867a;

    public f(h hVar) {
        t.e(hVar, "workerScope");
        this.f11867a = hVar;
    }

    @Override // he.i, he.h
    public Set<wd.f> c() {
        return this.f11867a.c();
    }

    @Override // he.i, he.h
    public Set<wd.f> d() {
        return this.f11867a.d();
    }

    @Override // he.i, he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        xc.h f10 = this.f11867a.f(fVar, bVar);
        if (f10 != null) {
            xc.e eVar = f10 instanceof xc.e ? (xc.e) f10 : null;
            if (eVar != null) {
                return eVar;
            }
            if (!(f10 instanceof e1)) {
                return null;
            }
            return (e1) f10;
        }
        return null;
    }

    @Override // he.i, he.h
    public Set<wd.f> g() {
        return this.f11867a.g();
    }

    /* renamed from: h */
    public List<xc.h> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List<xc.h> h10;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        d n10 = dVar.n(d.Companion.c());
        if (n10 == null) {
            h10 = u.h();
            return h10;
        }
        Collection<xc.m> e10 = this.f11867a.e(n10, lVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : e10) {
            if (obj instanceof xc.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f11867a;
    }
}
