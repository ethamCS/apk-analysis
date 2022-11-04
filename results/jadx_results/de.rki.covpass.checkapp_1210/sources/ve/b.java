package ve;

import java.util.List;
import ve.g;
import xc.y;
/* loaded from: classes3.dex */
public abstract class b {
    public final g a(y yVar) {
        hc.t.e(yVar, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(yVar)) {
                return hVar.a(yVar);
            }
        }
        return g.a.f24028b;
    }

    public abstract List<h> b();
}
