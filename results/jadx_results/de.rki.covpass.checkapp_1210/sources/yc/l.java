package yc;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: c */
    private final g f26050c;

    /* renamed from: d */
    private final boolean f26051d;

    /* renamed from: q */
    private final gc.l<wd.c, Boolean> f26052q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(g gVar, gc.l<? super wd.c, Boolean> lVar) {
        this(gVar, false, lVar);
        t.e(gVar, "delegate");
        t.e(lVar, "fqNameFilter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(g gVar, boolean z10, gc.l<? super wd.c, Boolean> lVar) {
        t.e(gVar, "delegate");
        t.e(lVar, "fqNameFilter");
        this.f26050c = gVar;
        this.f26051d = z10;
        this.f26052q = lVar;
    }

    private final boolean a(c cVar) {
        wd.c d10 = cVar.d();
        return d10 != null && this.f26052q.invoke(d10).booleanValue();
    }

    @Override // yc.g
    public boolean B(wd.c cVar) {
        t.e(cVar, "fqName");
        if (this.f26052q.invoke(cVar).booleanValue()) {
            return this.f26050c.B(cVar);
        }
        return false;
    }

    @Override // yc.g
    public c h(wd.c cVar) {
        t.e(cVar, "fqName");
        if (this.f26052q.invoke(cVar).booleanValue()) {
            return this.f26050c.h(cVar);
        }
        return null;
    }

    @Override // yc.g
    public boolean isEmpty() {
        boolean z10;
        g<c> gVar = this.f26050c;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            for (c cVar : gVar) {
                if (a(cVar)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return this.f26051d ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        g gVar = this.f26050c;
        ArrayList arrayList = new ArrayList();
        for (c cVar : gVar) {
            if (a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }
}
