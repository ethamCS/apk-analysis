package he;

import hc.t;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ub.u;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public abstract class i implements h {
    @Override // he.h
    public Collection<? extends u0> a(wd.f fVar, fd.b bVar) {
        List h10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        h10 = u.h();
        return h10;
    }

    @Override // he.h
    public Collection<? extends z0> b(wd.f fVar, fd.b bVar) {
        List h10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        h10 = u.h();
        return h10;
    }

    @Override // he.h
    public Set<wd.f> c() {
        Collection<xc.m> e10 = e(d.f11852u, ye.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : e10) {
            if (obj instanceof z0) {
                wd.f name = ((z0) obj).getName();
                t.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // he.h
    public Set<wd.f> d() {
        Collection<xc.m> e10 = e(d.f11853v, ye.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : e10) {
            if (obj instanceof z0) {
                wd.f name = ((z0) obj).getName();
                t.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // he.k
    public Collection<xc.m> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        h10 = u.h();
        return h10;
    }

    @Override // he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return null;
    }

    @Override // he.h
    public Set<wd.f> g() {
        return null;
    }
}
