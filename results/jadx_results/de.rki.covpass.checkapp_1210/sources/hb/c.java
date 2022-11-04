package hb;

import hc.l;
import hc.t;
import io.ktor.utils.io.s;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lhb/c;", BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "contains", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "elements", "containsAll", "isEmpty", "add", "addAll", "Ltb/e0;", "clear", BuildConfig.FLAVOR, "iterator", "remove", "removeAll", "retainAll", BuildConfig.FLAVOR, "b", "()I", "size", "Lio/ktor/util/collections/c;", "delegate", "<init>", "(Lio/ktor/util/collections/c;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c<Key, Value> implements Collection<Value>, ic.b {

    /* renamed from: c */
    private final io.ktor.util.collections.c<Key, Value> f11701c;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"hb/c$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "next", "()Ljava/lang/Object;", "Ltb/e0;", "remove", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements Iterator<Value>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<Map.Entry<Key, Value>> f11702c;

        /* renamed from: d */
        final /* synthetic */ c<Key, Value> f11703d;

        a(c<Key, Value> cVar) {
            this.f11703d = cVar;
            this.f11702c = ((c) cVar).f11701c.t();
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
            return this.f11702c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Value next() {
            return this.f11702c.next().getValue();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f11702c.remove();
        }
    }

    public c(io.ktor.util.collections.c<Key, Value> cVar) {
        t.e(cVar, "delegate");
        this.f11701c = cVar;
        s.a(this);
    }

    @Override // java.util.Collection
    public boolean add(Value value) {
        t.e(value, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Value> collection) {
        t.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.f11701c.size();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f11701c.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f11701c.containsValue(obj);
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f11701c.size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<Value> iterator() {
        return new a(this);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        java.util.Iterator<Value> it = iterator();
        while (it.hasNext()) {
            if (!t.a(it.next(), obj)) {
                z10 = true;
                it.remove();
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        java.util.Iterator<Value> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                z10 = true;
                it.remove();
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        throw new IllegalStateException("Common concurrent map doesn't support this operation yet.".toString());
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return l.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        t.e(tArr, "array");
        return (T[]) l.b(this, tArr);
    }
}
