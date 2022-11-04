package od;

import hc.t;
import java.util.Iterator;
import java.util.List;
import ub.u;
import yc.g;
/* loaded from: classes.dex */
public final class c implements yc.g {

    /* renamed from: c */
    private final wd.c f17826c;

    public c(wd.c cVar) {
        t.e(cVar, "fqNameToMatch");
        this.f17826c = cVar;
    }

    @Override // yc.g
    public boolean B(wd.c cVar) {
        return g.b.b(this, cVar);
    }

    /* renamed from: a */
    public b h(wd.c cVar) {
        t.e(cVar, "fqName");
        if (t.a(cVar, this.f17826c)) {
            return b.f17825a;
        }
        return null;
    }

    @Override // yc.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<yc.c> iterator() {
        List h10;
        h10 = u.h();
        return h10.iterator();
    }
}
