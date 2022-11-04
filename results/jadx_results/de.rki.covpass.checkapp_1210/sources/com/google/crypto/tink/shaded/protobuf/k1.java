package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.v;
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
/* loaded from: classes.dex */
public class k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Map<K, V> U3;
    private volatile k1<K, V>.c V3;

    /* renamed from: c */
    private final int f7919c;

    /* renamed from: d */
    private List<k1<K, V>.e> f7920d;

    /* renamed from: q */
    private Map<K, V> f7921q;

    /* renamed from: x */
    private boolean f7922x;

    /* renamed from: y */
    private volatile k1<K, V>.g f7923y;

    /* loaded from: classes.dex */
    public class a extends k1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> k10 = k(i10);
                    if (((v.b) k10.getKey()).e()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                Iterator it = n().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((v.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: c */
        private int f7924c;

        /* renamed from: d */
        private Iterator<Map.Entry<K, V>> f7925d;

        private b() {
            k1.this = r1;
            this.f7924c = r1.f7920d.size();
        }

        /* synthetic */ b(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f7925d == null) {
                this.f7925d = k1.this.U3.entrySet().iterator();
            }
            return this.f7925d;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (b().hasNext()) {
                entry = b().next();
            } else {
                List list = k1.this.f7920d;
                int i10 = this.f7924c - 1;
                this.f7924c = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
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
            int i10 = this.f7924c;
            return (i10 > 0 && i10 <= k1.this.f7920d.size()) || b().hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends k1<K, V>.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private c() {
            super(r2, null);
            k1.this = r2;
        }

        /* synthetic */ c(k1 k1Var, a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new b(k1.this, null);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private static final java.util.Iterator<Object> f7928a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f7929b = new b();

        /* loaded from: classes.dex */
        class a implements java.util.Iterator<Object>, j$.util.Iterator {
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

        /* loaded from: classes.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<Object> iterator() {
                return d.f7928a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f7929b;
        }
    }

    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<k1<K, V>.e> {

        /* renamed from: c */
        private final K f7930c;

        /* renamed from: d */
        private V f7931d;

        e(K k10, V v10) {
            k1.this = r1;
            this.f7930c = k10;
            this.f7931d = v10;
        }

        e(k1 k1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(k1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public K getKey() {
            return this.f7930c;
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
            return b(this.f7930c, entry.getKey()) && b(this.f7931d, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7931d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f7930c;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f7931d;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            k1.this.h();
            V v11 = this.f7931d;
            this.f7931d = v10;
            return v11;
        }

        public String toString() {
            return this.f7930c + "=" + this.f7931d;
        }
    }

    /* loaded from: classes.dex */
    private class f implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: c */
        private int f7933c;

        /* renamed from: d */
        private boolean f7934d;

        /* renamed from: q */
        private java.util.Iterator<Map.Entry<K, V>> f7935q;

        private f() {
            k1.this = r1;
            this.f7933c = -1;
        }

        /* synthetic */ f(k1 k1Var, a aVar) {
            this();
        }

        private java.util.Iterator<Map.Entry<K, V>> b() {
            if (this.f7935q == null) {
                this.f7935q = k1.this.f7921q.entrySet().iterator();
            }
            return this.f7935q;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f7934d = true;
            int i10 = this.f7933c + 1;
            this.f7933c = i10;
            return i10 < k1.this.f7920d.size() ? (Map.Entry<K, V>) k1.this.f7920d.get(this.f7933c) : b().next();
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
            if (this.f7933c + 1 >= k1.this.f7920d.size()) {
                return !k1.this.f7921q.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (this.f7934d) {
                this.f7934d = false;
                k1.this.h();
                if (this.f7933c >= k1.this.f7920d.size()) {
                    b().remove();
                    return;
                }
                k1 k1Var = k1.this;
                int i10 = this.f7933c;
                this.f7933c = i10 - 1;
                k1Var.t(i10);
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
            k1.this = r1;
        }

        /* synthetic */ g(k1 k1Var, a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                k1.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new f(k1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                k1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k1.this.size();
        }
    }

    private k1(int i10) {
        this.f7919c = i10;
        this.f7920d = Collections.emptyList();
        this.f7921q = Collections.emptyMap();
        this.U3 = Collections.emptyMap();
    }

    /* synthetic */ k1(int i10, a aVar) {
        this(i10);
    }

    private int g(K k10) {
        int size = this.f7920d.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f7920d.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f7920d.get(i11).getKey());
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

    public void h() {
        if (!this.f7922x) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void j() {
        h();
        if (!this.f7920d.isEmpty() || (this.f7920d instanceof ArrayList)) {
            return;
        }
        this.f7920d = new ArrayList(this.f7919c);
    }

    private SortedMap<K, V> o() {
        h();
        if (this.f7921q.isEmpty() && !(this.f7921q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7921q = treeMap;
            this.U3 = treeMap.descendingMap();
        }
        return (SortedMap) this.f7921q;
    }

    public static <FieldDescriptorType extends v.b<FieldDescriptorType>> k1<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    public V t(int i10) {
        h();
        V value = this.f7920d.remove(i10).getValue();
        if (!this.f7921q.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f7920d.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f7920d.isEmpty()) {
            this.f7920d.clear();
        }
        if (!this.f7921q.isEmpty()) {
            this.f7921q.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f7921q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f7923y == null) {
            this.f7923y = new g(this, null);
        }
        return this.f7923y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return super.equals(obj);
        }
        k1 k1Var = (k1) obj;
        int size = size();
        if (size != k1Var.size()) {
            return false;
        }
        int l10 = l();
        if (l10 != k1Var.l()) {
            return entrySet().equals(k1Var.entrySet());
        }
        for (int i10 = 0; i10 < l10; i10++) {
            if (!k(i10).equals(k1Var.k(i10))) {
                return false;
            }
        }
        if (l10 == size) {
            return true;
        }
        return this.f7921q.equals(k1Var.f7921q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g10 = g(comparable);
        return g10 >= 0 ? this.f7920d.get(g10).getValue() : this.f7921q.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f7920d.get(i11).hashCode();
        }
        return m() > 0 ? i10 + this.f7921q.hashCode() : i10;
    }

    public Set<Map.Entry<K, V>> i() {
        if (this.V3 == null) {
            this.V3 = new c(this, null);
        }
        return this.V3;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f7920d.get(i10);
    }

    public int l() {
        return this.f7920d.size();
    }

    public int m() {
        return this.f7921q.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f7921q.isEmpty() ? d.b() : this.f7921q.entrySet();
    }

    public boolean p() {
        return this.f7922x;
    }

    public void q() {
        if (!this.f7922x) {
            this.f7921q = this.f7921q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7921q);
            this.U3 = this.U3.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.U3);
            this.f7922x = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int g10 = g(comparable);
        if (g10 >= 0) {
            return (V) t(g10);
        }
        if (!this.f7921q.isEmpty()) {
            return this.f7921q.remove(comparable);
        }
        return null;
    }

    /* renamed from: s */
    public V put(K k10, V v10) {
        h();
        int g10 = g(k10);
        if (g10 >= 0) {
            return this.f7920d.get(g10).setValue(v10);
        }
        j();
        int i10 = -(g10 + 1);
        if (i10 >= this.f7919c) {
            return o().put(k10, v10);
        }
        int size = this.f7920d.size();
        int i11 = this.f7919c;
        if (size == i11) {
            k1<K, V>.e remove = this.f7920d.remove(i11 - 1);
            o().put((K) remove.getKey(), remove.getValue());
        }
        this.f7920d.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7920d.size() + this.f7921q.size();
    }
}
