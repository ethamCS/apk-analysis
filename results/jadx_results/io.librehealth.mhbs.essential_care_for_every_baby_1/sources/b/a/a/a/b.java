package b.a.a.a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    c<K, V> f307a;

    /* renamed from: b */
    private c<K, V> f308b;

    /* renamed from: c */
    private WeakHashMap<f<K, V>, Boolean> f309c = new WeakHashMap<>();

    /* renamed from: d */
    private int f310d = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.a.a.a.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f314d;
        }

        @Override // b.a.a.a.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f313c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.a.b$b */
    /* loaded from: classes.dex */
    public static class C0016b<K, V> extends e<K, V> {
        C0016b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.a.a.a.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f313c;
        }

        @Override // b.a.a.a.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f314d;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f311a;

        /* renamed from: b */
        final V f312b;

        /* renamed from: c */
        c<K, V> f313c;

        /* renamed from: d */
        c<K, V> f314d;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f311a.equals(cVar.f311a) && this.f312b.equals(cVar.f312b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f311a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f312b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f311a.hashCode() ^ this.f312b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f311a + "=" + this.f312b;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        private c<K, V> f315a;

        /* renamed from: b */
        private boolean f316b = true;

        d() {
            b.this = r1;
        }

        @Override // b.a.a.a.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f315a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f314d;
                this.f315a = cVar3;
                this.f316b = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f316b) {
                this.f316b = false;
                cVar = b.this.f307a;
            } else {
                c<K, V> cVar2 = this.f315a;
                cVar = cVar2 != null ? cVar2.f313c : null;
            }
            this.f315a = cVar;
            return this.f315a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f316b) {
                return b.this.f307a != null;
            }
            c<K, V> cVar = this.f315a;
            return (cVar == null || cVar.f313c == null) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        c<K, V> f318a;

        /* renamed from: b */
        c<K, V> f319b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f318a = cVar2;
            this.f319b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f319b;
            c<K, V> cVar2 = this.f318a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // b.a.a.a.b.f
        public void a(c<K, V> cVar) {
            if (this.f318a == cVar && cVar == this.f319b) {
                this.f319b = null;
                this.f318a = null;
            }
            c<K, V> cVar2 = this.f318a;
            if (cVar2 == cVar) {
                this.f318a = b(cVar2);
            }
            if (this.f319b == cVar) {
                this.f319b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f319b;
            this.f319b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f319b != null;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0016b c0016b = new C0016b(this.f308b, this.f307a);
        this.f309c.put(c0016b, Boolean.FALSE);
        return c0016b;
    }

    public Map.Entry<K, V> b() {
        return this.f307a;
    }

    protected c<K, V> c(K k) {
        c<K, V> cVar = this.f307a;
        while (cVar != null && !cVar.f311a.equals(k)) {
            cVar = cVar.f313c;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f309c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f308b;
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

    public V f(K k) {
        c<K, V> c2 = c(k);
        if (c2 == null) {
            return null;
        }
        this.f310d--;
        if (!this.f309c.isEmpty()) {
            for (f<K, V> fVar : this.f309c.keySet()) {
                fVar.a(c2);
            }
        }
        c<K, V> cVar = c2.f314d;
        c<K, V> cVar2 = c2.f313c;
        if (cVar != null) {
            cVar.f313c = cVar2;
        } else {
            this.f307a = cVar2;
        }
        c<K, V> cVar3 = c2.f313c;
        if (cVar3 != null) {
            cVar3.f314d = cVar;
        } else {
            this.f308b = cVar;
        }
        c2.f313c = null;
        c2.f314d = null;
        return c2.f312b;
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
        a aVar = new a(this.f307a, this.f308b);
        this.f309c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f310d;
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
