package ve;

import java.util.Iterator;
/* loaded from: classes3.dex */
public abstract class a<K, V> implements Iterable<V>, ic.a {

    /* renamed from: ve.a$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0429a<K, V, T extends V> {

        /* renamed from: a */
        private final oc.d<? extends K> f24020a;

        /* renamed from: b */
        private final int f24021b;

        public AbstractC0429a(oc.d<? extends K> dVar, int i10) {
            hc.t.e(dVar, "key");
            this.f24020a = dVar;
            this.f24021b = i10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T extends V, java.lang.Object] */
        public final T c(a<K, V> aVar) {
            hc.t.e(aVar, "thisRef");
            return aVar.a().get(this.f24021b);
        }
    }

    protected abstract c<V> a();

    public abstract s<K, V> b();

    public final boolean isEmpty() {
        return a().a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
