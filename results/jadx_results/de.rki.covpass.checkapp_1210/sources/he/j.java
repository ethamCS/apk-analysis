package he;

import hc.t;
import java.util.HashSet;
import java.util.Set;
import ub.z;
/* loaded from: classes3.dex */
public final class j {
    public static final Set<wd.f> a(Iterable<? extends h> iterable) {
        t.e(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (h hVar : iterable) {
            Set<wd.f> g10 = hVar.g();
            if (g10 == null) {
                return null;
            }
            z.x(hashSet, g10);
        }
        return hashSet;
    }
}
