package yd;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import yd.h;
/* loaded from: classes3.dex */
public class v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: c */
    private final int f26184c;

    /* renamed from: d */
    private List<v<K, V>.c> f26185d;

    /* renamed from: q */
    private Map<K, V> f26186q;

    /* renamed from: x */
    private boolean f26187x;

    /* renamed from: y */
    private volatile v<K, V>.e f26188y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends v<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // yd.v
        public void n() {
            if (!m()) {
                for (int i10 = 0; i10 < j(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> i11 = i(i10);
                    if (((h.b) i11.getKey()).e()) {
                        i11.setValue(Collections.unmodifiableList((List) i11.getValue()));
                    }
                }
                Iterator it = k().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((h.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((h.b) obj, obj2);
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private static final Iterator<Object> f26189a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f26190b = new C0458b();

        /* loaded from: classes3.dex */
        static class a implements Iterator<Object>, j$.util.Iterator {
            a() {
            }

            @Override // j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: yd.v$b$b */
        /* loaded from: classes3.dex */
        static class C0458b implements Iterable<Object> {
            C0458b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<Object> iterator() {
                return b.f26189a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f26190b;
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Comparable<v<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: c */
        private final K f26191c;

        /* renamed from: d */
        private V f26192d;

        c(K k10, V v10) {
            v.this = r1;
            this.f26191c = k10;
            this.f26192d = v10;
        }

        c(v vVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(v<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* renamed from: d */
        public K getKey() {
            return this.f26191c;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f26191c, entry.getKey()) && b(this.f26192d, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f26192d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f26191c;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f26192d;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            v.this.g();
            V v11 = this.f26192d;
            this.f26192d = v10;
            return v11;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f26191c);
            String valueOf2 = String.valueOf(this.f26192d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    private class d implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: c */
        private int f26194c;

        /* renamed from: d */
        private boolean f26195d;

        /* renamed from: q */
        private java.util.Iterator<Map.Entry<K, V>> f26196q;

        private d() {
            v.this = r1;
            this.f26194c = -1;
        }

        /* synthetic */ d(v vVar, a aVar) {
            this();
        }

        private java.util.Iterator<Map.Entry<K, V>> b() {
            if (this.f26196q == null) {
                this.f26196q = v.this.f26186q.entrySet().iterator();
            }
            return this.f26196q;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f26195d = true;
            int i10 = this.f26194c + 1;
            this.f26194c = i10;
            return i10 < v.this.f26185d.size() ? (Map.Entry<K, V>) v.this.f26185d.get(this.f26194c) : b().next();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f26194c + 1 < v.this.f26185d.size() || b().hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (this.f26195d) {
                this.f26195d = false;
                v.this.g();
                if (this.f26194c >= v.this.f26185d.size()) {
                    b().remove();
                    return;
                }
                v vVar = v.this;
                int i10 = this.f26194c;
                this.f26194c = i10 - 1;
                vVar.q(i10);
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
            v.this = r1;
        }

        /* synthetic */ e(v vVar, a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                v.this.p(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = v.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new d(v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                v.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.size();
        }
    }

    private v(int i10) {
        this.f26184c = i10;
        this.f26185d = Collections.emptyList();
        this.f26186q = Collections.emptyMap();
    }

    /* synthetic */ v(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f26185d.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f26185d.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f26185d.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public void g() {
        if (!this.f26187x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void h() {
        g();
        if (!this.f26185d.isEmpty() || (this.f26185d instanceof ArrayList)) {
            return;
        }
        this.f26185d = new ArrayList(this.f26184c);
    }

    private SortedMap<K, V> l() {
        g();
        if (this.f26186q.isEmpty() && !(this.f26186q instanceof TreeMap)) {
            this.f26186q = new TreeMap();
        }
        return (SortedMap) this.f26186q;
    }

    public static <FieldDescriptorType extends h.b<FieldDescriptorType>> v<FieldDescriptorType, Object> o(int i10) {
        return new a(i10);
    }

    public V q(int i10) {
        g();
        V value = this.f26185d.remove(i10).getValue();
        if (!this.f26186q.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = l().entrySet().iterator();
            this.f26185d.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f26185d.isEmpty()) {
            this.f26185d.clear();
        }
        if (!this.f26186q.isEmpty()) {
            this.f26186q.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f26186q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f26188y == null) {
            this.f26188y = new e(this, null);
        }
        return this.f26188y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f26185d.get(f10).getValue() : this.f26186q.get(comparable);
    }

    public Map.Entry<K, V> i(int i10) {
        return this.f26185d.get(i10);
    }

    public int j() {
        return this.f26185d.size();
    }

    public Iterable<Map.Entry<K, V>> k() {
        return this.f26186q.isEmpty() ? b.b() : this.f26186q.entrySet();
    }

    public boolean m() {
        return this.f26187x;
    }

    public void n() {
        if (!this.f26187x) {
            this.f26186q = this.f26186q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f26186q);
            this.f26187x = true;
        }
    }

    public V p(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f26185d.get(f10).setValue(v10);
        }
        h();
        int i10 = -(f10 + 1);
        if (i10 >= this.f26184c) {
            return l().put(k10, v10);
        }
        int size = this.f26185d.size();
        int i11 = this.f26184c;
        if (size == i11) {
            v<K, V>.c remove = this.f26185d.remove(i11 - 1);
            l().put((K) remove.getKey(), remove.getValue());
        }
        this.f26185d.add(i10, new c(k10, v10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) q(f10);
        }
        if (!this.f26186q.isEmpty()) {
            return this.f26186q.remove(comparable);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26185d.size() + this.f26186q.size();
    }
}
