package ve;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public final class o<T> extends c<T> {

    /* renamed from: c */
    private final T f24048c;

    /* renamed from: d */
    private final int f24049d;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private boolean f24050c = true;

        /* renamed from: d */
        final /* synthetic */ o<T> f24051d;

        a(o<T> oVar) {
            this.f24051d = oVar;
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
            return this.f24050c;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (this.f24050c) {
                this.f24050c = false;
                return this.f24051d.e();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(T t10, int i10) {
        super(null);
        hc.t.e(t10, "value");
        this.f24048c = t10;
        this.f24049d = i10;
    }

    @Override // ve.c
    public int a() {
        return 1;
    }

    @Override // ve.c
    public void b(int i10, T t10) {
        hc.t.e(t10, "value");
        throw new IllegalStateException();
    }

    public final int d() {
        return this.f24049d;
    }

    public final T e() {
        return this.f24048c;
    }

    @Override // ve.c
    public T get(int i10) {
        if (i10 == this.f24049d) {
            return this.f24048c;
        }
        return null;
    }

    @Override // ve.c, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
