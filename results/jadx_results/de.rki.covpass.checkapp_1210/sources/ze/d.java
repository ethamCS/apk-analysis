package ze;
/* loaded from: classes3.dex */
final class d<V> {

    /* renamed from: b */
    private static final d<Object> f26723b = new d<>(c.f26717f);

    /* renamed from: a */
    private final c<V> f26724a;

    private d(c<V> cVar) {
        this.f26724a = cVar;
    }

    public static <V> d<V> a() {
        return (d<V>) f26723b;
    }

    private d<V> d(c<V> cVar) {
        return cVar == this.f26724a ? this : new d<>(cVar);
    }

    public V b(int i10) {
        return this.f26724a.a(i10);
    }

    public d<V> c(int i10, V v10) {
        return d(this.f26724a.b(i10, v10));
    }
}
