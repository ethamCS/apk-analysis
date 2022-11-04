package dd;

import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class w extends p implements nd.u {

    /* renamed from: a */
    private final wd.c f8516a;

    public w(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        this.f8516a = cVar;
    }

    @Override // nd.u
    public Collection<nd.g> G(gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        hc.t.e(lVar, "nameFilter");
        h10 = ub.u.h();
        return h10;
    }

    /* renamed from: X */
    public List<nd.a> j() {
        List<nd.a> h10;
        h10 = ub.u.h();
        return h10;
    }

    @Override // nd.u
    public wd.c d() {
        return this.f8516a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && hc.t.a(d(), ((w) obj).d());
    }

    @Override // nd.d
    public nd.a h(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        return null;
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // nd.u
    public Collection<nd.u> r() {
        List h10;
        h10 = ub.u.h();
        return h10;
    }

    public String toString() {
        return w.class.getName() + ": " + d();
    }

    @Override // nd.d
    public boolean v() {
        return false;
    }
}
