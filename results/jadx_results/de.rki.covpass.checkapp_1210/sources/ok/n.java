package ok;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes3.dex */
public class n<T> implements List<T>, Serializable {

    /* renamed from: c */
    m<T> f18626c;

    /* loaded from: classes3.dex */
    public class a implements ListIterator<T>, Iterator {

        /* renamed from: c */
        int f18627c = 0;

        public a() {
            n.this = r1;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            n.this.f18626c.h(t10);
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
            return this.f18627c < n.this.f18626c.f18623d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f18627c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public T next() {
            T[] tArr = n.this.f18626c.f18622c;
            int i10 = this.f18627c;
            this.f18627c = i10 + 1;
            return tArr[i10];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f18627c;
        }

        @Override // java.util.ListIterator
        public T previous() {
            T[] tArr = n.this.f18626c.f18622c;
            int i10 = this.f18627c - 1;
            this.f18627c = i10;
            return tArr[i10];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f18627c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new RuntimeException("Not all list operations are supposed.");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            n.this.f18626c.f18622c[this.f18627c - 1] = t10;
        }
    }

    public n(m<T> mVar) {
        this.f18626c = mVar;
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        throw new RuntimeException("Not all list operations are supposed.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        this.f18626c.h(t10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        throw new RuntimeException("Not all list operations are supposed.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        java.util.Iterator<? extends T> it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            this.f18626c.h(it.next());
        }
        return hasNext;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f18626c.k();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f18626c.b(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i10) {
        return this.f18626c.f18622c[i10];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f18626c.f(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f18626c.g() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new a();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f18626c.f18623d - 1; i10 >= 0; i10--) {
            if (this.f18626c.f18622c[i10].equals(obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new a();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.util.List
    public T remove(int i10) {
        throw new RuntimeException("Not all list operations are supposed.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new RuntimeException("Not all list operations are supposed.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new RuntimeException("Not all list operations are supposed.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new RuntimeException("Not all list operations are supposed.");
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        this.f18626c.f18622c[i10] = t10;
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f18626c.f18623d;
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m<T> mVar = this.f18626c;
        int i10 = mVar.f18623d;
        Object[] objArr = new Object[i10];
        System.arraycopy(mVar.f18622c, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.List, java.util.Collection
    public <A> A[] toArray(A[] aArr) {
        m<T> mVar = this.f18626c;
        System.arraycopy(mVar.f18622c, 0, aArr, 0, mVar.f18623d);
        return aArr;
    }
}
