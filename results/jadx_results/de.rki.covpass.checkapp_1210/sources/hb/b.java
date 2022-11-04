package hb;

import hc.l;
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
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010\u0012\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lhb/b;", BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "add", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "elements", "addAll", "Ltb/e0;", "clear", BuildConfig.FLAVOR, "iterator", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", BuildConfig.FLAVOR, "b", "()I", "size", "Lio/ktor/util/collections/c;", "delegate", "<init>", "(Lio/ktor/util/collections/c;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b<Key, Value> implements Set<Key>, ic.e {

    /* renamed from: c */
    private final io.ktor.util.collections.c<Key, Value> f11698c;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"hb/b$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "next", "()Ljava/lang/Object;", "Ltb/e0;", "remove", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements Iterator<Key>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<Map.Entry<Key, Value>> f11699c;

        /* renamed from: d */
        final /* synthetic */ b<Key, Value> f11700d;

        a(b<Key, Value> bVar) {
            this.f11700d = bVar;
            this.f11699c = ((b) bVar).f11698c.t();
            s.a(this);
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
            return this.f11699c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Key next() {
            return this.f11699c.next().getKey();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f11699c.remove();
        }
    }

    public b(io.ktor.util.collections.c<Key, Value> cVar) {
        t.e(cVar, "delegate");
        this.f11698c = cVar;
        s.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Key key) {
        t.e(key, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Key> collection) {
        t.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.f11698c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f11698c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f11698c.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<Key> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return (obj == null || this.f11698c.remove(obj) == null) ? false : true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                if (remove(obj) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        java.util.Iterator<Key> it = iterator();
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
        return b();
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
