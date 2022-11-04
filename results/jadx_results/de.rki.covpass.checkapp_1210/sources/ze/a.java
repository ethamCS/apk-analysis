package ze;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a<E> implements Iterable<E> {

    /* renamed from: x */
    private static final a<Object> f26709x = new a<>();

    /* renamed from: c */
    final E f26710c;

    /* renamed from: d */
    final a<E> f26711d;

    /* renamed from: q */
    private final int f26712q;

    /* renamed from: ze.a$a */
    /* loaded from: classes3.dex */
    public static class C0479a<E> implements Iterator<E>, j$.util.Iterator {

        /* renamed from: c */
        private a<E> f26713c;

        public C0479a(a<E> aVar) {
            this.f26713c = aVar;
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
            return ((a) this.f26713c).f26712q > 0;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public E next() {
            a<E> aVar = this.f26713c;
            E e10 = aVar.f26710c;
            this.f26713c = aVar.f26711d;
            return e10;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private a() {
        this.f26712q = 0;
        this.f26710c = null;
        this.f26711d = null;
    }

    private a(E e10, a<E> aVar) {
        this.f26710c = e10;
        this.f26711d = aVar;
        this.f26712q = aVar.f26712q + 1;
    }

    public static <E> a<E> b() {
        return (a<E>) f26709x;
    }

    private java.util.Iterator<E> c(int i10) {
        return new C0479a(i(i10));
    }

    private a<E> e(Object obj) {
        if (this.f26712q == 0) {
            return this;
        }
        if (this.f26710c.equals(obj)) {
            return this.f26711d;
        }
        a<E> e10 = this.f26711d.e(obj);
        return e10 == this.f26711d ? this : new a<>(this.f26710c, e10);
    }

    private a<E> i(int i10) {
        if (i10 < 0 || i10 > this.f26712q) {
            throw new IndexOutOfBoundsException();
        }
        return i10 == 0 ? this : this.f26711d.i(i10 - 1);
    }

    public a<E> d(int i10) {
        return e(get(i10));
    }

    public a<E> f(E e10) {
        return new a<>(e10, this);
    }

    public E get(int i10) {
        if (i10 < 0 || i10 > this.f26712q) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return c(i10).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i10);
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return c(0);
    }

    public int size() {
        return this.f26712q;
    }
}
