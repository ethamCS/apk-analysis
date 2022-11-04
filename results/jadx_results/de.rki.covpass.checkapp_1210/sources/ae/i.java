package ae;

import hc.t;
import java.util.Collection;
/* loaded from: classes3.dex */
public abstract class i {
    public abstract void a(xc.b bVar);

    public abstract void b(xc.b bVar, xc.b bVar2);

    public abstract void c(xc.b bVar, xc.b bVar2);

    public void d(xc.b bVar, Collection<? extends xc.b> collection) {
        t.e(bVar, "member");
        t.e(collection, "overridden");
        bVar.t0(collection);
    }
}
