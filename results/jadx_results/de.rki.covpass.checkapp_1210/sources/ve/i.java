package ve;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public final class i extends c {

    /* renamed from: c */
    public static final i f24039c = new i();

    /* loaded from: classes3.dex */
    public static final class a implements Iterator, ic.a, j$.util.Iterator {
        a() {
        }

        /* renamed from: b */
        public Void next() {
            throw new NoSuchElementException();
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
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // ve.c
    public int a() {
        return 0;
    }

    /* renamed from: d */
    public Void get(int i10) {
        return null;
    }

    /* renamed from: e */
    public void b(int i10, Void r22) {
        hc.t.e(r22, "value");
        throw new IllegalStateException();
    }

    @Override // ve.c, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new a();
    }
}
