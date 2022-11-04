package ve;

import ve.a;
/* loaded from: classes3.dex */
public final class n<K, V, T extends V> extends a.AbstractC0429a<K, V, T> implements kc.c<a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(oc.d<? extends K> dVar, int i10) {
        super(dVar, i10);
        hc.t.e(dVar, "key");
    }

    /* renamed from: d */
    public T a(a<K, V> aVar, oc.k<?> kVar) {
        hc.t.e(aVar, "thisRef");
        hc.t.e(kVar, "property");
        return c(aVar);
    }
}
