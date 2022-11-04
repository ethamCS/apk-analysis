package yd;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes3.dex */
public class x extends AbstractList<String> implements RandomAccess, o {

    /* renamed from: c */
    private final o f26200c;

    /* loaded from: classes3.dex */
    class a implements ListIterator<String>, Iterator {

        /* renamed from: c */
        ListIterator<String> f26201c;

        /* renamed from: d */
        final /* synthetic */ int f26202d;

        a(int i10) {
            x.this = r1;
            this.f26202d = i10;
            this.f26201c = r1.f26200c.listIterator(i10);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f26201c.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f26201c.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
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
            return this.f26201c.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26201c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f26201c.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f26201c.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: c */
        java.util.Iterator<String> f26204c;

        b() {
            x.this = r1;
            this.f26204c = r1.f26200c.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f26204c.next();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f26204c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x(o oVar) {
        this.f26200c = oVar;
    }

    /* renamed from: b */
    public String get(int i10) {
        return this.f26200c.get(i10);
    }

    @Override // yd.o
    public o g() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<String> iterator() {
        return new b();
    }

    @Override // yd.o
    public List<?> j() {
        return this.f26200c.j();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26200c.size();
    }

    @Override // yd.o
    public void v(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // yd.o
    public d x(int i10) {
        return this.f26200c.x(i10);
    }
}
