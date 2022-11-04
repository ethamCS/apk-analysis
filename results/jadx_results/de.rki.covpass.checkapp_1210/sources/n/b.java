package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c */
    c<K, V> f16736c;

    /* renamed from: d */
    private c<K, V> f16737d;

    /* renamed from: q */
    private WeakHashMap<f<K, V>, Boolean> f16738q = new WeakHashMap<>();

    /* renamed from: x */
    private int f16739x = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f16743x;
        }

        @Override // n.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f16742q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n.b$b */
    /* loaded from: classes.dex */
    public static class C0253b<K, V> extends e<K, V> {
        C0253b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f16742q;
        }

        @Override // n.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f16743x;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: c */
        final K f16740c;

        /* renamed from: d */
        final V f16741d;

        /* renamed from: q */
        c<K, V> f16742q;

        /* renamed from: x */
        c<K, V> f16743x;

        c(K k10, V v10) {
            this.f16740c = k10;
            this.f16741d = v10;
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
            return this.f16740c.equals(cVar.f16740c) && this.f16741d.equals(cVar.f16741d);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16740c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16741d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f16740c.hashCode() ^ this.f16741d.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f16740c + "=" + this.f16741d;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: c */
        private c<K, V> f16744c;

        /* renamed from: d */
        private boolean f16745d = true;

        d() {
            b.this = r1;
        }

        @Override // n.b.f
        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f16744c;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f16743x;
                this.f16744c = cVar3;
                this.f16745d = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f16745d) {
                this.f16745d = false;
                cVar = b.this.f16736c;
            } else {
                c<K, V> cVar2 = this.f16744c;
                cVar = cVar2 != null ? cVar2.f16742q : null;
            }
            this.f16744c = cVar;
            return this.f16744c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16745d) {
                return b.this.f16736c != null;
            }
            c<K, V> cVar = this.f16744c;
            return (cVar == null || cVar.f16742q == null) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: c */
        c<K, V> f16747c;

        /* renamed from: d */
        c<K, V> f16748d;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f16747c = cVar2;
            this.f16748d = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f16748d;
            c<K, V> cVar2 = this.f16747c;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // n.b.f
        public void b(c<K, V> cVar) {
            if (this.f16747c == cVar && cVar == this.f16748d) {
                this.f16748d = null;
                this.f16747c = null;
            }
            c<K, V> cVar2 = this.f16747c;
            if (cVar2 == cVar) {
                this.f16747c = c(cVar2);
            }
            if (this.f16748d == cVar) {
                this.f16748d = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f16748d;
            this.f16748d = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16748d != null;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0253b c0253b = new C0253b(this.f16737d, this.f16736c);
        this.f16738q.put(c0253b, Boolean.FALSE);
        return c0253b;
    }

    public Map.Entry<K, V> b() {
        return this.f16736c;
    }

    protected c<K, V> c(K k10) {
        c<K, V> cVar = this.f16736c;
        while (cVar != null && !cVar.f16740c.equals(k10)) {
            cVar = cVar.f16742q;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f16738q.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f16737d;
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

    public c<K, V> f(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f16739x++;
        c<K, V> cVar2 = this.f16737d;
        if (cVar2 == null) {
            this.f16736c = cVar;
        } else {
            cVar2.f16742q = cVar;
            cVar.f16743x = cVar2;
        }
        this.f16737d = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    public V i(K k10, V v10) {
        c<K, V> c10 = c(k10);
        if (c10 != null) {
            return c10.f16741d;
        }
        f(k10, v10);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f16736c, this.f16737d);
        this.f16738q.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V k(K k10) {
        c<K, V> c10 = c(k10);
        if (c10 == null) {
            return null;
        }
        this.f16739x--;
        if (!this.f16738q.isEmpty()) {
            for (f<K, V> fVar : this.f16738q.keySet()) {
                fVar.b(c10);
            }
        }
        c<K, V> cVar = c10.f16743x;
        c<K, V> cVar2 = c10.f16742q;
        if (cVar != null) {
            cVar.f16742q = cVar2;
        } else {
            this.f16736c = cVar2;
        }
        c<K, V> cVar3 = c10.f16742q;
        if (cVar3 != null) {
            cVar3.f16743x = cVar;
        } else {
            this.f16737d = cVar;
        }
        c10.f16742q = null;
        c10.f16743x = null;
        return c10.f16741d;
    }

    public int size() {
        return this.f16739x;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
