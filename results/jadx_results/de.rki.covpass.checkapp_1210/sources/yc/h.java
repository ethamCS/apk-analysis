package yc;

import hc.t;
import java.util.Iterator;
import java.util.List;
import yc.g;
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: c */
    private final List<c> f26041c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends c> list) {
        t.e(list, "annotations");
        this.f26041c = list;
    }

    @Override // yc.g
    public boolean B(wd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // yc.g
    public c h(wd.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // yc.g
    public boolean isEmpty() {
        return this.f26041c.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return this.f26041c.iterator();
    }

    public String toString() {
        return this.f26041c.toString();
    }
}
