package he;

import hc.t;
import java.util.Collection;
import java.util.Set;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public abstract class a implements h {
    @Override // he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return i().a(fVar, bVar);
    }

    @Override // he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return i().b(fVar, bVar);
    }

    @Override // he.h
    public Set<wd.f> c() {
        return i().c();
    }

    @Override // he.h
    public Set<wd.f> d() {
        return i().d();
    }

    @Override // he.k
    public Collection<xc.m> e(d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        return i().e(dVar, lVar);
    }

    @Override // he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return i().f(fVar, bVar);
    }

    @Override // he.h
    public Set<wd.f> g() {
        return i().g();
    }

    public final h h() {
        if (i() instanceof a) {
            h i10 = i();
            t.c(i10, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((a) i10).h();
        }
        return i();
    }

    protected abstract h i();
}
