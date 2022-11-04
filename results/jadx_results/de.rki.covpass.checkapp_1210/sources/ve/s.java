package ve;

import hc.v;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public abstract class s<K, V> {

    /* renamed from: a */
    private final ConcurrentHashMap<oc.d<? extends K>, Integer> f24092a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AtomicInteger f24093b = new AtomicInteger(0);

    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.l<oc.d<? extends K>, Integer> {

        /* renamed from: c */
        final /* synthetic */ s<K, V> f24094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<K, V> sVar) {
            super(1);
            this.f24094c = sVar;
        }

        /* renamed from: b */
        public final Integer invoke(oc.d<? extends K> dVar) {
            hc.t.e(dVar, "it");
            return Integer.valueOf(((s) this.f24094c).f24093b.getAndIncrement());
        }
    }

    public abstract <T extends K> int b(ConcurrentHashMap<oc.d<? extends K>, Integer> concurrentHashMap, oc.d<T> dVar, gc.l<? super oc.d<? extends K>, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> n<K, V, T> c(oc.d<KK> dVar) {
        hc.t.e(dVar, "kClass");
        return new n<>(dVar, d(dVar));
    }

    public final <T extends K> int d(oc.d<T> dVar) {
        hc.t.e(dVar, "kClass");
        return b(this.f24092a, dVar, new a(this));
    }

    public final Collection<Integer> e() {
        Collection<Integer> values = this.f24092a.values();
        hc.t.d(values, "idPerType.values");
        return values;
    }
}
