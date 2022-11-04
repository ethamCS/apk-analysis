package b.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<K, V> extends d<K, V> implements Map<K, V> {
    c<K, V> h;

    /* renamed from: b.b.a$a */
    /* loaded from: classes.dex */
    public class C0017a extends c<K, V> {
        C0017a() {
            a.this = r1;
        }

        @Override // b.b.c
        protected void a() {
            a.this.clear();
        }

        @Override // b.b.c
        protected Object b(int i, int i2) {
            return a.this.f341b[(i << 1) + i2];
        }

        @Override // b.b.c
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // b.b.c
        protected int d() {
            return a.this.f342c;
        }

        @Override // b.b.c
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // b.b.c
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // b.b.c
        protected void g(K k, V v) {
            a.this.put(k, v);
        }

        @Override // b.b.c
        protected void h(int i) {
            a.this.j(i);
        }

        @Override // b.b.c
        protected V i(int i, V v) {
            return a.this.k(i, v);
        }
    }

    private c<K, V> m() {
        if (this.h == null) {
            this.h = new C0017a();
        }
        return this.h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f342c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
