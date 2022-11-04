package xc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class o0 {
    public static final void a(m0 m0Var, wd.c cVar, Collection<l0> collection) {
        hc.t.e(m0Var, "<this>");
        hc.t.e(cVar, "fqName");
        hc.t.e(collection, "packageFragments");
        if (m0Var instanceof p0) {
            ((p0) m0Var).b(cVar, collection);
        } else {
            collection.addAll(m0Var.a(cVar));
        }
    }

    public static final boolean b(m0 m0Var, wd.c cVar) {
        hc.t.e(m0Var, "<this>");
        hc.t.e(cVar, "fqName");
        return m0Var instanceof p0 ? ((p0) m0Var).c(cVar) : c(m0Var, cVar).isEmpty();
    }

    public static final List<l0> c(m0 m0Var, wd.c cVar) {
        hc.t.e(m0Var, "<this>");
        hc.t.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        a(m0Var, cVar, arrayList);
        return arrayList;
    }
}
