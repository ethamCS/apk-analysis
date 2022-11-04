package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    c<K, V> f57b;

    /* renamed from: c */
    private c<K, V> f58c;
    private WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    private int e = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // a.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.a.b.b$b */
    /* loaded from: classes.dex */
    public static class C0004b<K, V> extends e<K, V> {
        C0004b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // a.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f59b;

        /* renamed from: c */
        final V f60c;
        c<K, V> d;
        c<K, V> e;

        c(K k, V v) {
            this.f59b = k;
            this.f60c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f59b.equals(cVar.f59b) && this.f60c.equals(cVar.f60c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f59b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f60c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f59b.hashCode() ^ this.f60c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f59b + "=" + this.f60c;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        private c<K, V> f61b;

        /* renamed from: c */
        private boolean f62c = true;

        d() {
            b.this = r1;
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f61b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.f61b = cVar3;
                this.f62c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62c) {
                return b.this.f57b != null;
            }
            c<K, V> cVar = this.f61b;
            return (cVar == null || cVar.d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f62c) {
                this.f62c = false;
                cVar = b.this.f57b;
            } else {
                c<K, V> cVar2 = this.f61b;
                cVar = cVar2 != null ? cVar2.d : null;
            }
            this.f61b = cVar;
            return this.f61b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        c<K, V> f63b;

        /* renamed from: c */
        c<K, V> f64c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f63b = cVar2;
            this.f64c = cVar;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.f64c;
            c<K, V> cVar2 = this.f63b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f63b == cVar && cVar == this.f64c) {
                this.f64c = null;
                this.f63b = null;
            }
            c<K, V> cVar2 = this.f63b;
            if (cVar2 == cVar) {
                this.f63b = b(cVar2);
            }
            if (this.f64c == cVar) {
                this.f64c = a();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f64c;
            this.f64c = a();
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    protected c<K, V> a(K k) {
        c<K, V> cVar = this.f57b;
        while (cVar != null && !cVar.f59b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.f58c;
        if (cVar2 == null) {
            this.f57b = cVar;
        } else {
            cVar2.d = cVar;
            cVar.e = cVar2;
        }
        this.f58c = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0004b c0004b = new C0004b(this.f58c, this.f57b);
        this.d.put(c0004b, false);
        return c0004b;
    }

    public V b(K k, V v) {
        c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f60c;
        }
        a(k, v);
        return null;
    }

    public Map.Entry<K, V> b() {
        return this.f57b;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.d.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f58c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f57b, this.f58c);
        this.d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f<K, V> fVar : this.d.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.e;
        if (cVar != null) {
            cVar.d = a2.d;
        } else {
            this.f57b = a2.d;
        }
        c<K, V> cVar2 = a2.d;
        if (cVar2 != null) {
            cVar2.e = a2.e;
        } else {
            this.f58c = a2.e;
        }
        a2.d = null;
        a2.e = null;
        return a2.f60c;
    }

    public int size() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
