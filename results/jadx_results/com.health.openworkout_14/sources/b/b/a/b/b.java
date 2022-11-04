package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    c<K, V> f2099b;

    /* renamed from: c */
    private c<K, V> f2100c;

    /* renamed from: d */
    private WeakHashMap<f<K, V>, Boolean> f2101d = new WeakHashMap<>();

    /* renamed from: e */
    private int f2102e = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2106e;
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2105d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.b.a.b.b$b */
    /* loaded from: classes.dex */
    public static class C0039b<K, V> extends e<K, V> {
        C0039b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2105d;
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2106e;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f2103b;

        /* renamed from: c */
        final V f2104c;

        /* renamed from: d */
        c<K, V> f2105d;

        /* renamed from: e */
        c<K, V> f2106e;

        c(K k, V v) {
            this.f2103b = k;
            this.f2104c = v;
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
            return this.f2103b.equals(cVar.f2103b) && this.f2104c.equals(cVar.f2104c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2103b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2104c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2103b.hashCode() ^ this.f2104c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2103b + "=" + this.f2104c;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        private c<K, V> f2107b;

        /* renamed from: c */
        private boolean f2108c = true;

        d() {
            b.this = r1;
        }

        @Override // b.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2107b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2106e;
                this.f2107b = cVar3;
                this.f2108c = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f2108c) {
                this.f2108c = false;
                cVar = b.this.f2099b;
            } else {
                c<K, V> cVar2 = this.f2107b;
                cVar = cVar2 != null ? cVar2.f2105d : null;
            }
            this.f2107b = cVar;
            return this.f2107b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2108c) {
                return b.this.f2099b != null;
            }
            c<K, V> cVar = this.f2107b;
            return (cVar == null || cVar.f2105d == null) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        c<K, V> f2110b;

        /* renamed from: c */
        c<K, V> f2111c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2110b = cVar2;
            this.f2111c = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f2111c;
            c<K, V> cVar2 = this.f2110b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // b.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f2110b == cVar && cVar == this.f2111c) {
                this.f2111c = null;
                this.f2110b = null;
            }
            c<K, V> cVar2 = this.f2110b;
            if (cVar2 == cVar) {
                this.f2110b = b(cVar2);
            }
            if (this.f2111c == cVar) {
                this.f2111c = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2111c;
            this.f2111c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2111c != null;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0039b c0039b = new C0039b(this.f2100c, this.f2099b);
        this.f2101d.put(c0039b, Boolean.FALSE);
        return c0039b;
    }

    public Map.Entry<K, V> b() {
        return this.f2099b;
    }

    protected c<K, V> c(K k) {
        c<K, V> cVar = this.f2099b;
        while (cVar != null && !cVar.f2103b.equals(k)) {
            cVar = cVar.f2105d;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f2101d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f2100c;
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

    public c<K, V> f(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f2102e++;
        c<K, V> cVar2 = this.f2100c;
        if (cVar2 == null) {
            this.f2099b = cVar;
        } else {
            cVar2.f2105d = cVar;
            cVar.f2106e = cVar2;
        }
        this.f2100c = cVar;
        return cVar;
    }

    public V g(K k, V v) {
        c<K, V> c2 = c(k);
        if (c2 != null) {
            return c2.f2104c;
        }
        f(k, v);
        return null;
    }

    public V h(K k) {
        c<K, V> c2 = c(k);
        if (c2 == null) {
            return null;
        }
        this.f2102e--;
        if (!this.f2101d.isEmpty()) {
            for (f<K, V> fVar : this.f2101d.keySet()) {
                fVar.a(c2);
            }
        }
        c<K, V> cVar = c2.f2106e;
        c<K, V> cVar2 = c2.f2105d;
        if (cVar != null) {
            cVar.f2105d = cVar2;
        } else {
            this.f2099b = cVar2;
        }
        c<K, V> cVar3 = c2.f2105d;
        if (cVar3 != null) {
            cVar3.f2106e = cVar;
        } else {
            this.f2100c = cVar;
        }
        c2.f2105d = null;
        c2.f2106e = null;
        return c2.f2104c;
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
        a aVar = new a(this.f2099b, this.f2100c);
        this.f2101d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f2102e;
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
