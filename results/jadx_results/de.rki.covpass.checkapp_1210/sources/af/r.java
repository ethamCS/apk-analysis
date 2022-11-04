package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Laf/r;", "T", "R", "Laf/h;", BuildConfig.FLAVOR, "iterator", "E", "Lkotlin/Function1;", "d", "(Lgc/l;)Laf/h;", "sequence", "transformer", "<init>", "(Laf/h;Lgc/l;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class r<T, R> implements h<R> {

    /* renamed from: a */
    private final h<T> f515a;

    /* renamed from: b */
    private final gc.l<T, R> f516b;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0006"}, d2 = {"af/r$a", BuildConfig.FLAVOR, "next", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<R>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<T> f517c;

        /* renamed from: d */
        final /* synthetic */ r<T, R> f518d;

        a(r<T, R> rVar) {
            this.f518d = rVar;
            this.f517c = ((r) rVar).f515a.iterator();
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
            return this.f517c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public R next() {
            return (R) ((r) this.f518d).f516b.invoke(this.f517c.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(h<? extends T> hVar, gc.l<? super T, ? extends R> lVar) {
        t.e(hVar, "sequence");
        t.e(lVar, "transformer");
        this.f515a = hVar;
        this.f516b = lVar;
    }

    public final <E> h<E> d(gc.l<? super R, ? extends java.util.Iterator<? extends E>> lVar) {
        t.e(lVar, "iterator");
        return new f(this.f515a, this.f516b, lVar);
    }

    @Override // af.h
    public java.util.Iterator<R> iterator() {
        return new a(this);
    }
}
