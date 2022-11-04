package hb;

import hc.l;
import hc.q0;
import hc.t;
import io.ktor.utils.io.s;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B\u001b\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\"\u0010\u000b\u001a\u00020\u00072\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u000eH\u0096\u0002J\u001c\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\"\u0010\u0011\u001a\u00020\u00072\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\tH\u0016J\"\u0010\u0012\u001a\u00020\u00072\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\tH\u0016J\u001d\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002J\"\u0010\u0014\u001a\u00020\u00072\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\tH\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lhb/g;", BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "elements", "addAll", "Ltb/e0;", "clear", BuildConfig.FLAVOR, "iterator", "f", "removeAll", "retainAll", "d", "containsAll", "isEmpty", BuildConfig.FLAVOR, "e", "()I", "size", "Lio/ktor/util/collections/c;", "delegate", "<init>", "(Lio/ktor/util/collections/c;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g<Key, Value> implements Set<Map.Entry<Key, Value>>, ic.e {

    /* renamed from: c */
    private final io.ktor.util.collections.c<Key, Value> f11726c;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"hb/g$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "b", "Ltb/e0;", "remove", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements Iterator<Map.Entry<Key, Value>>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<Map.Entry<Key, Value>> f11727c;

        /* renamed from: d */
        final /* synthetic */ g<Key, Value> f11728d;

        a(g<Key, Value> gVar) {
            this.f11728d = gVar;
            this.f11727c = ((g) gVar).f11726c.t();
        }

        /* renamed from: b */
        public Map.Entry<Key, Value> next() {
            return this.f11727c.next();
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
            return this.f11727c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f11727c.remove();
        }
    }

    public g(io.ktor.util.collections.c<Key, Value> cVar) {
        t.e(cVar, "delegate");
        this.f11726c = cVar;
        s.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<Key, Value>> collection) {
        t.e(collection, "elements");
        while (true) {
            boolean z10 = false;
            for (Map.Entry<Key, Value> entry : collection) {
                if (add(entry) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* renamed from: b */
    public boolean add(Map.Entry<Key, Value> entry) {
        t.e(entry, "element");
        return !t.a(this.f11726c.put(entry.getKey(), entry.getValue()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f11726c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!q0.k(obj)) {
            return false;
        }
        return d((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean d(Map.Entry<Key, Value> entry) {
        t.e(entry, "element");
        return t.a(this.f11726c.get(entry.getKey()), entry.getValue());
    }

    public int e() {
        return this.f11726c.size();
    }

    public boolean f(Map.Entry<Key, Value> entry) {
        t.e(entry, "element");
        return this.f11726c.remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f11726c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<Map.Entry<Key, Value>> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!q0.k(obj)) {
            return false;
        }
        return f((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove((Map.Entry) it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        java.util.Iterator<Map.Entry<Key, Value>> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                z10 = true;
                it.remove();
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return l.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        t.e(tArr, "array");
        return (T[]) l.b(this, tArr);
    }
}
