package uc;

import hc.t;
import java.util.Set;
import ub.c0;
/* loaded from: classes.dex */
public final class d {
    public static final boolean a(c cVar, xc.e eVar) {
        boolean N;
        t.e(cVar, "<this>");
        t.e(eVar, "classDescriptor");
        if (ae.d.x(eVar)) {
            Set<wd.b> b10 = cVar.b();
            wd.b g10 = ee.a.g(eVar);
            N = c0.N(b10, g10 != null ? g10.g() : null);
            if (N) {
                return true;
            }
        }
        return false;
    }
}
