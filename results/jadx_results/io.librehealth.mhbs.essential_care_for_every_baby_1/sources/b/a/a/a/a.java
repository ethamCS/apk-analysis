package b.a.a.a;

import b.a.a.a.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e */
    private HashMap<K, b.c<K, V>> f306e = new HashMap<>();

    @Override // b.a.a.a.b
    protected b.c<K, V> c(K k) {
        return this.f306e.get(k);
    }

    public boolean contains(K k) {
        return this.f306e.containsKey(k);
    }

    @Override // b.a.a.a.b
    public V f(K k) {
        V v = (V) super.f(k);
        this.f306e.remove(k);
        return v;
    }
}
