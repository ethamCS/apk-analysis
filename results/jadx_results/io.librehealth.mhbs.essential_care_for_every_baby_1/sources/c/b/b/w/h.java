package c.b.b.w;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> h = new a();

    /* renamed from: a */
    Comparator<? super K> f497a;

    /* renamed from: b */
    e<K, V> f498b;

    /* renamed from: c */
    int f499c;

    /* renamed from: d */
    int f500d;

    /* renamed from: e */
    final e<K, V> f501e;
    private h<K, V>.b f;
    private h<K, V>.c g;

    /* loaded from: classes.dex */
    static class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
            h.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c2;
            if ((obj instanceof Map.Entry) && (c2 = h.this.c((Map.Entry) obj)) != null) {
                h.this.f(c2, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f499c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes.dex */
        class a extends h<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f;
            }
        }

        c() {
            h.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f499c;
        }
    }

    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a */
        e<K, V> f504a;

        /* renamed from: b */
        e<K, V> f505b = null;

        /* renamed from: c */
        int f506c;

        d() {
            h.this = r2;
            this.f504a = r2.f501e.f511d;
            this.f506c = r2.f500d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f504a;
            h hVar = h.this;
            if (eVar != hVar.f501e) {
                if (hVar.f500d != this.f506c) {
                    throw new ConcurrentModificationException();
                }
                this.f504a = eVar.f511d;
                this.f505b = eVar;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f504a != h.this.f501e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f505b;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f505b = null;
                this.f506c = h.this.f500d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        e<K, V> f508a;

        /* renamed from: b */
        e<K, V> f509b;

        /* renamed from: c */
        e<K, V> f510c;

        /* renamed from: d */
        e<K, V> f511d;

        /* renamed from: e */
        e<K, V> f512e;
        final K f;
        V g;
        int h;

        e() {
            this.f = null;
            this.f512e = this;
            this.f511d = this;
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f508a = eVar;
            this.f = k;
            this.h = 1;
            this.f511d = eVar2;
            this.f512e = eVar3;
            eVar3.f511d = this;
            eVar2.f512e = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f509b; eVar2 != null; eVar2 = eVar2.f509b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f510c; eVar2 != null; eVar2 = eVar2.f510c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.g;
                Object value = entry.getValue();
                if (v == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        public String toString() {
            return this.f + "=" + this.g;
        }
    }

    public h() {
        this(h);
    }

    public h(Comparator<? super K> comparator) {
        this.f499c = 0;
        this.f500d = 0;
        this.f501e = new e<>();
        this.f497a = comparator == null ? h : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f509b;
            e<K, V> eVar3 = eVar.f510c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.h : 0;
            int i3 = eVar3 != null ? eVar3.h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f509b;
                e<K, V> eVar5 = eVar3.f510c;
                int i5 = eVar5 != null ? eVar5.h : 0;
                if (eVar4 != null) {
                    i = eVar4.h;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    j(eVar3);
                }
                i(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f509b;
                e<K, V> eVar7 = eVar2.f510c;
                int i7 = eVar7 != null ? eVar7.h : 0;
                if (eVar6 != null) {
                    i = eVar6.h;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    i(eVar2);
                }
                j(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f508a;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f508a;
        eVar.f508a = null;
        if (eVar2 != null) {
            eVar2.f508a = eVar3;
        }
        if (eVar3 == null) {
            this.f498b = eVar2;
        } else if (eVar3.f509b == eVar) {
            eVar3.f509b = eVar2;
        } else {
            eVar3.f510c = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f509b;
        e<K, V> eVar3 = eVar.f510c;
        e<K, V> eVar4 = eVar3.f509b;
        e<K, V> eVar5 = eVar3.f510c;
        eVar.f510c = eVar4;
        if (eVar4 != null) {
            eVar4.f508a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f509b = eVar;
        eVar.f508a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.h : 0, eVar4 != null ? eVar4.h : 0) + 1;
        eVar.h = max;
        if (eVar5 != null) {
            i = eVar5.h;
        }
        eVar3.h = Math.max(max, i) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f509b;
        e<K, V> eVar3 = eVar.f510c;
        e<K, V> eVar4 = eVar2.f509b;
        e<K, V> eVar5 = eVar2.f510c;
        eVar.f509b = eVar5;
        if (eVar5 != null) {
            eVar5.f508a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f510c = eVar;
        eVar.f508a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.h : 0, eVar5 != null ? eVar5.h : 0) + 1;
        eVar.h = max;
        if (eVar4 != null) {
            i = eVar4.h;
        }
        eVar2.h = Math.max(max, i) + 1;
    }

    e<K, V> b(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f497a;
        e<K, V> eVar2 = this.f498b;
        if (eVar2 != null) {
            Comparable comparable = comparator == h ? (Comparable) k : null;
            while (true) {
                Object obj = (K) eVar2.f;
                i = comparable != null ? comparable.compareTo(obj) : comparator.compare(k, obj);
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.f509b : eVar2.f510c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f501e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f512e);
            if (i < 0) {
                eVar2.f509b = eVar;
            } else {
                eVar2.f510c = eVar;
            }
            e(eVar2, true);
        } else if (comparator == h && !(k instanceof Comparable)) {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        } else {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f512e);
            this.f498b = eVar;
        }
        this.f499c++;
        this.f500d++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.g, entry.getValue())) {
            return d2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f498b = null;
        this.f499c = 0;
        this.f500d++;
        e<K, V> eVar = this.f501e;
        eVar.f512e = eVar;
        eVar.f511d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.f512e;
            eVar2.f511d = eVar.f511d;
            eVar.f511d.f512e = eVar2;
        }
        e<K, V> eVar3 = eVar.f509b;
        e<K, V> eVar4 = eVar.f510c;
        e<K, V> eVar5 = eVar.f508a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f509b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f510c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f499c--;
            this.f500d++;
            return;
        }
        e<K, V> b2 = eVar3.h > eVar4.h ? eVar3.b() : eVar4.a();
        f(b2, false);
        e<K, V> eVar6 = eVar.f509b;
        if (eVar6 != null) {
            i = eVar6.h;
            b2.f509b = eVar6;
            eVar6.f508a = b2;
            eVar.f509b = null;
        } else {
            i = 0;
        }
        e<K, V> eVar7 = eVar.f510c;
        if (eVar7 != null) {
            i2 = eVar7.h;
            b2.f510c = eVar7;
            eVar7.f508a = b2;
            eVar.f510c = null;
        }
        b2.h = Math.max(i, i2) + 1;
        h(eVar, b2);
    }

    e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> b2 = b(k, true);
            V v2 = b2.g;
            b2.g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g = g(obj);
        if (g != null) {
            return g.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f499c;
    }
}
