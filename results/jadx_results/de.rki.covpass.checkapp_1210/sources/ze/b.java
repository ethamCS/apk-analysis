package ze;
/* loaded from: classes3.dex */
public final class b<K, V> {

    /* renamed from: c */
    private static final b<Object, Object> f26714c = new b<>(d.a(), 0);

    /* renamed from: a */
    private final d<a<e<K, V>>> f26715a;

    /* renamed from: b */
    private final int f26716b;

    private b(d<a<e<K, V>>> dVar, int i10) {
        this.f26715a = dVar;
        this.f26716b = i10;
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i10 != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public static <K, V> b<K, V> b() {
        b<K, V> bVar = (b<K, V>) f26714c;
        if (bVar == null) {
            a(0);
        }
        return bVar;
    }

    private a<e<K, V>> d(int i10) {
        a<e<K, V>> b10 = this.f26715a.b(i10);
        return b10 == null ? a.b() : b10;
    }

    private static <K, V> int e(a<e<K, V>> aVar, Object obj) {
        int i10 = 0;
        while (aVar != null && aVar.size() > 0) {
            if (aVar.f26710c.f26725c.equals(obj)) {
                return i10;
            }
            aVar = aVar.f26711d;
            i10++;
        }
        return -1;
    }

    public V c(Object obj) {
        for (a d10 = d(obj.hashCode()); d10 != null && d10.size() > 0; d10 = d10.f26711d) {
            e eVar = (e) d10.f26710c;
            if (eVar.f26725c.equals(obj)) {
                return eVar.f26726d;
            }
        }
        return null;
    }

    public b<K, V> f(K k10, V v10) {
        a<e<K, V>> d10 = d(k10.hashCode());
        int size = d10.size();
        int e10 = e(d10, k10);
        if (e10 != -1) {
            d10 = d10.d(e10);
        }
        a<e<K, V>> f10 = d10.f(new e<>(k10, v10));
        return new b<>(this.f26715a.c(k10.hashCode(), f10), (this.f26716b - size) + f10.size());
    }
}
