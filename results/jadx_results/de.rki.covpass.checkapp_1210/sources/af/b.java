package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002¨\u0006\r"}, d2 = {"Laf/b;", "T", "Laf/h;", "Laf/c;", BuildConfig.FLAVOR, "n", "a", BuildConfig.FLAVOR, "iterator", "sequence", "count", "<init>", "(Laf/h;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a */
    private final h<T> f473a;

    /* renamed from: b */
    private final int f474b;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\b"}, d2 = {"af/b$a", BuildConfig.FLAVOR, "Ltb/e0;", "b", "next", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<T> f475c;

        /* renamed from: d */
        private int f476d;

        a(b<T> bVar) {
            this.f475c = ((b) bVar).f473a.iterator();
            this.f476d = ((b) bVar).f474b;
        }

        private final void b() {
            while (this.f476d > 0 && this.f475c.hasNext()) {
                this.f475c.next();
                this.f476d--;
            }
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
            b();
            return this.f475c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            b();
            return this.f475c.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> hVar, int i10) {
        t.e(hVar, "sequence");
        this.f473a = hVar;
        this.f474b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // af.c
    public h<T> a(int i10) {
        int i11 = this.f474b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f473a, i11);
    }

    @Override // af.h
    public java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
