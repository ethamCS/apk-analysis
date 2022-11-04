package hb;

import hc.l;
import hc.t;
import io.ktor.utils.io.s;
import j$.lang.Iterable;
import j$.util.Collection$CC;
import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.a0;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000e\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u000f\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ'\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lhb/i;", "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "index", "value", "Ltb/e0;", "b", "(ILjava/lang/Object;)V", "element", BuildConfig.FLAVOR, "contains", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "elements", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", BuildConfig.FLAVOR, "iterator", "()Ljava/util/Iterator;", "lastIndexOf", BuildConfig.FLAVOR, "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "size", "I", "a", "()I", "<init>", "(I)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i<T> implements List<T>, ic.a, j$.util.List {

    /* renamed from: c */
    private final int f11736c;

    /* renamed from: d */
    /* synthetic */ AtomicReferenceArray f11737d = new AtomicReferenceArray(size());

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"hb/i$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "nextIndex", "()I", "previous", "previousIndex", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, ic.a, Iterator {

        /* renamed from: q */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f11738q = AtomicIntegerFieldUpdater.newUpdater(a.class, "currentIndex");

        /* renamed from: c */
        final /* synthetic */ int f11739c;
        private volatile /* synthetic */ int currentIndex;

        /* renamed from: d */
        final /* synthetic */ i<T> f11740d;

        a(int i10, i<T> iVar) {
            this.f11739c = i10;
            this.f11740d = iVar;
            this.currentIndex = i10;
            s.a(this);
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.currentIndex < this.f11740d.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.currentIndex > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public T next() {
            if (hasNext()) {
                return (T) this.f11740d.f11737d.get(f11738q.getAndIncrement(this));
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            if (hasNext()) {
                return this.currentIndex + 1;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // java.util.ListIterator
        public T previous() {
            if (hasPrevious()) {
                return (T) this.f11740d.f11737d.get(f11738q.getAndDecrement(this));
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            if (hasPrevious()) {
                return this.currentIndex - 1;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(int i10) {
        this.f11736c = i10;
        s.a(this);
    }

    public int a() {
        return this.f11736c;
    }

    @Override // java.util.List, j$.util.List
    public void add(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i10, T t10) {
        this.f11737d.set(i10, t10);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean contains(Object obj) {
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (t.a(this.f11737d.get(i10), obj)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.List, j$.util.AbstractC0491a, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.List, j$.util.List
    public T get(int i10) {
        return (T) this.f11737d.get(i10);
    }

    @Override // java.util.List, j$.util.List
    public int indexOf(Object obj) {
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (t.a(this.f11737d.get(i10), obj)) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List, j$.util.List
    public int lastIndexOf(Object obj) {
        List G;
        G = a0.G(this);
        return G.indexOf(obj);
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<T> listIterator(int i10) {
        return new a(i10, this);
    }

    @Override // java.util.List, j$.util.List
    public T remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.List, j$.util.AbstractC0491a
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // j$.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public T set(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, j$.util.List
    public List<T> subList(int i10, int i11) {
        i iVar = new i(i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            iVar.b(i12 - i10, this.f11737d.get(i12));
        }
        return iVar;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public Object[] toArray() {
        return l.a(this);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public <T> T[] toArray(T[] tArr) {
        t.e(tArr, "array");
        return (T[]) l.b(this, tArr);
    }
}
