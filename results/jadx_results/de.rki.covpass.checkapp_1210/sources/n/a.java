package n;

import java.util.HashMap;
import java.util.Map;
import n.b;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: y */
    private HashMap<K, b.c<K, V>> f16735y = new HashMap<>();

    @Override // n.b
    protected b.c<K, V> c(K k10) {
        return this.f16735y.get(k10);
    }

    public boolean contains(K k10) {
        return this.f16735y.containsKey(k10);
    }

    @Override // n.b
    public V i(K k10, V v10) {
        b.c<K, V> c10 = c(k10);
        if (c10 != null) {
            return c10.f16741d;
        }
        this.f16735y.put(k10, f(k10, v10));
        return null;
    }

    @Override // n.b
    public V k(K k10) {
        V v10 = (V) super.k(k10);
        this.f16735y.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> l(K k10) {
        if (contains(k10)) {
            return this.f16735y.get(k10).f16743x;
        }
        return null;
    }
}
