package me;

import hc.e0;
import hc.k0;
import hc.t;
import java.util.Iterator;
import java.util.List;
import yc.g;
/* loaded from: classes3.dex */
public class a implements yc.g {

    /* renamed from: d */
    static final /* synthetic */ oc.k<Object>[] f16459d = {k0.g(new e0(k0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: c */
    private final ne.i f16460c;

    public a(ne.n nVar, gc.a<? extends List<? extends yc.c>> aVar) {
        t.e(nVar, "storageManager");
        t.e(aVar, "compute");
        this.f16460c = nVar.d(aVar);
    }

    private final List<yc.c> a() {
        return (List) ne.m.a(this.f16460c, this, f16459d[0]);
    }

    @Override // yc.g
    public boolean B(wd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // yc.g
    public yc.c h(wd.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // yc.g
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<yc.c> iterator() {
        return a().iterator();
    }
}
