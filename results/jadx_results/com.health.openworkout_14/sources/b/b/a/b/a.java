package b.b.a.b;

import b.b.a.b.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: f */
    private HashMap<K, b.c<K, V>> f2098f = new HashMap<>();

    @Override // b.b.a.b.b
    protected b.c<K, V> c(K k) {
        return this.f2098f.get(k);
    }

    public boolean contains(K k) {
        return this.f2098f.containsKey(k);
    }

    @Override // b.b.a.b.b
    public V g(K k, V v) {
        b.c<K, V> c2 = c(k);
        if (c2 != null) {
            return c2.f2104c;
        }
        this.f2098f.put(k, f(k, v));
        return null;
    }

    @Override // b.b.a.b.b
    public V h(K k) {
        V v = (V) super.h(k);
        this.f2098f.remove(k);
        return v;
    }

    public Map.Entry<K, V> i(K k) {
        if (contains(k)) {
            return this.f2098f.get(k).f2106e;
        }
        return null;
    }
}
