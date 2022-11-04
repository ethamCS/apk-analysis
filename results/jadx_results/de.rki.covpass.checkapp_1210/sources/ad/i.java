package ad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import xc.o0;
import xc.p0;
/* loaded from: classes.dex */
public final class i implements p0 {

    /* renamed from: a */
    private final List<xc.m0> f314a;

    /* renamed from: b */
    private final String f315b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends xc.m0> list, String str) {
        Set J0;
        hc.t.e(list, "providers");
        hc.t.e(str, "debugName");
        this.f314a = list;
        this.f315b = str;
        list.size();
        J0 = ub.c0.J0(list);
        J0.size();
    }

    @Override // xc.m0
    public List<xc.l0> a(wd.c cVar) {
        List<xc.l0> F0;
        hc.t.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (xc.m0 m0Var : this.f314a) {
            o0.a(m0Var, cVar, arrayList);
        }
        F0 = ub.c0.F0(arrayList);
        return F0;
    }

    @Override // xc.p0
    public void b(wd.c cVar, Collection<xc.l0> collection) {
        hc.t.e(cVar, "fqName");
        hc.t.e(collection, "packageFragments");
        for (xc.m0 m0Var : this.f314a) {
            o0.a(m0Var, cVar, collection);
        }
    }

    @Override // xc.p0
    public boolean c(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        List<xc.m0> list = this.f314a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (xc.m0 m0Var : list) {
                if (!o0.b(m0Var, cVar)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // xc.m0
    public Collection<wd.c> t(wd.c cVar, gc.l<? super wd.f, Boolean> lVar) {
        hc.t.e(cVar, "fqName");
        hc.t.e(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (xc.m0 m0Var : this.f314a) {
            hashSet.addAll(m0Var.t(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f315b;
    }
}
