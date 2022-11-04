package ae;

import hc.t;
import java.util.Collection;
/* loaded from: classes3.dex */
public final class p {
    public static final xc.b a(Collection<? extends xc.b> collection) {
        Integer d10;
        t.e(collection, "descriptors");
        collection.isEmpty();
        xc.b bVar = null;
        for (xc.b bVar2 : collection) {
            if (bVar == null || ((d10 = xc.t.d(bVar.g(), bVar2.g())) != null && d10.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        t.b(bVar);
        return bVar;
    }
}
