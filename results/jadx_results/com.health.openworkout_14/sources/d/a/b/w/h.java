package d.a.b.w;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> i = new a();

    /* renamed from: b */
    Comparator<? super K> f3784b;

    /* renamed from: c */
    e<K, V> f3785c;

    /* renamed from: d */
    int f3786d;

    /* renamed from: e */
    int f3787e;

    /* renamed from: f */
    final e<K, V> f3788f;

    /* renamed from: g */
    private h<K, V>.b f3789g;

    /* renamed from: h */
    private h<K, V>.c f3790h;

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
            return (obj instanceof Map.Entry) && h.this.f((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> f2;
            if ((obj instanceof Map.Entry) && (f2 = h.this.f((Map.Entry) obj)) != null) {
                h.this.i(f2, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f3786d;
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
                return a().f3802g;
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
            return h.this.j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f3786d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b */
        e<K, V> f3793b;

        /* renamed from: c */
        e<K, V> f3794c = null;

        /* renamed from: d */
        int f3795d;

        d() {
            h.this = r2;
            this.f3793b = r2.f3788f.f3800e;
            this.f3795d = r2.f3787e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f3793b;
            h hVar = h.this;
            if (eVar != hVar.f3788f) {
                if (hVar.f3787e != this.f3795d) {
                    throw new ConcurrentModificationException();
                }
                this.f3793b = eVar.f3800e;
                this.f3794c = eVar;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3793b != h.this.f3788f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f3794c;
            if (eVar != null) {
                h.this.i(eVar, true);
                this.f3794c = null;
                this.f3795d = h.this.f3787e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        e<K, V> f3797b;

        /* renamed from: c */
        e<K, V> f3798c;

        /* renamed from: d */
        e<K, V> f3799d;

        /* renamed from: e */
        e<K, V> f3800e;

        /* renamed from: f */
        e<K, V> f3801f;

        /* renamed from: g */
        final K f3802g;

        /* renamed from: h */
        V f3803h;
        int i;

        e() {
            this.f3802g = null;
            this.f3801f = this;
            this.f3800e = this;
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f3797b = eVar;
            this.f3802g = k;
            this.i = 1;
            this.f3800e = eVar2;
            this.f3801f = eVar3;
            eVar3.f3800e = this;
            eVar2.f3801f = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f3798c; eVar2 != null; eVar2 = eVar2.f3798c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f3799d; eVar2 != null; eVar2 = eVar2.f3799d) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f3802g;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f3803h;
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
            return this.f3802g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3803h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f3802g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f3803h;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f3803h;
            this.f3803h = v;
            return v2;
        }

        public String toString() {
            return this.f3802g + "=" + this.f3803h;
        }
    }

    public h() {
        this(i);
    }

    public h(Comparator<? super K> comparator) {
        this.f3786d = 0;
        this.f3787e = 0;
        this.f3788f = new e<>();
        this.f3784b = comparator == null ? i : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void h(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f3798c;
            e<K, V> eVar3 = eVar.f3799d;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.i : 0;
            int i4 = eVar3 != null ? eVar3.i : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f3798c;
                e<K, V> eVar5 = eVar3.f3799d;
                int i6 = eVar5 != null ? eVar5.i : 0;
                if (eVar4 != null) {
                    i2 = eVar4.i;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m(eVar3);
                }
                l(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f3798c;
                e<K, V> eVar7 = eVar2.f3799d;
                int i8 = eVar7 != null ? eVar7.i : 0;
                if (eVar6 != null) {
                    i2 = eVar6.i;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    l(eVar2);
                }
                m(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.i = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.i = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f3797b;
        }
    }

    private void k(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f3797b;
        eVar.f3797b = null;
        if (eVar2 != null) {
            eVar2.f3797b = eVar3;
        }
        if (eVar3 == null) {
            this.f3785c = eVar2;
        } else if (eVar3.f3798c == eVar) {
            eVar3.f3798c = eVar2;
        } else {
            eVar3.f3799d = eVar2;
        }
    }

    private void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3798c;
        e<K, V> eVar3 = eVar.f3799d;
        e<K, V> eVar4 = eVar3.f3798c;
        e<K, V> eVar5 = eVar3.f3799d;
        eVar.f3799d = eVar4;
        if (eVar4 != null) {
            eVar4.f3797b = eVar;
        }
        k(eVar, eVar3);
        eVar3.f3798c = eVar;
        eVar.f3797b = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = max;
        if (eVar5 != null) {
            i2 = eVar5.i;
        }
        eVar3.i = Math.max(max, i2) + 1;
    }

    private void m(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3798c;
        e<K, V> eVar3 = eVar.f3799d;
        e<K, V> eVar4 = eVar2.f3798c;
        e<K, V> eVar5 = eVar2.f3799d;
        eVar.f3798c = eVar5;
        if (eVar5 != null) {
            eVar5.f3797b = eVar;
        }
        k(eVar, eVar2);
        eVar2.f3799d = eVar;
        eVar.f3797b = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = max;
        if (eVar4 != null) {
            i2 = eVar4.i;
        }
        eVar2.i = Math.max(max, i2) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f3785c = null;
        this.f3786d = 0;
        this.f3787e++;
        e<K, V> eVar = this.f3788f;
        eVar.f3801f = eVar;
        eVar.f3800e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return g(obj) != null;
    }

    e<K, V> e(K k, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f3784b;
        e<K, V> eVar2 = this.f3785c;
        if (eVar2 != null) {
            Comparable comparable = comparator == i ? (Comparable) k : null;
            while (true) {
                Object obj = (K) eVar2.f3802g;
                i2 = comparable != null ? comparable.compareTo(obj) : comparator.compare(k, obj);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f3798c : eVar2.f3799d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f3788f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f3801f);
            if (i2 < 0) {
                eVar2.f3798c = eVar;
            } else {
                eVar2.f3799d = eVar;
            }
            h(eVar2, true);
        } else if (comparator == i && !(k instanceof Comparable)) {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        } else {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f3801f);
            this.f3785c = eVar;
        }
        this.f3786d++;
        this.f3787e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f3789g;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f3789g = bVar2;
        return bVar2;
    }

    e<K, V> f(Map.Entry<?, ?> entry) {
        e<K, V> g2 = g(entry.getKey());
        if (g2 != null && a(g2.f3803h, entry.getValue())) {
            return g2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> g(Object obj) {
        if (obj != 0) {
            try {
                return e(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> g2 = g(obj);
        if (g2 != null) {
            return g2.f3803h;
        }
        return null;
    }

    void i(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f3801f;
            eVar2.f3800e = eVar.f3800e;
            eVar.f3800e.f3801f = eVar2;
        }
        e<K, V> eVar3 = eVar.f3798c;
        e<K, V> eVar4 = eVar.f3799d;
        e<K, V> eVar5 = eVar.f3797b;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                k(eVar, eVar3);
                eVar.f3798c = null;
            } else if (eVar4 != null) {
                k(eVar, eVar4);
                eVar.f3799d = null;
            } else {
                k(eVar, null);
            }
            h(eVar5, false);
            this.f3786d--;
            this.f3787e++;
            return;
        }
        e<K, V> b2 = eVar3.i > eVar4.i ? eVar3.b() : eVar4.a();
        i(b2, false);
        e<K, V> eVar6 = eVar.f3798c;
        if (eVar6 != null) {
            i2 = eVar6.i;
            b2.f3798c = eVar6;
            eVar6.f3797b = b2;
            eVar.f3798c = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f3799d;
        if (eVar7 != null) {
            i3 = eVar7.i;
            b2.f3799d = eVar7;
            eVar7.f3797b = b2;
            eVar.f3799d = null;
        }
        b2.i = Math.max(i2, i3) + 1;
        k(eVar, b2);
    }

    e<K, V> j(Object obj) {
        e<K, V> g2 = g(obj);
        if (g2 != null) {
            i(g2, true);
        }
        return g2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.f3790h;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f3790h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        e<K, V> e2 = e(k, true);
        V v2 = e2.f3803h;
        e2.f3803h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> j = j(obj);
        if (j != null) {
            return j.f3803h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3786d;
    }
}
