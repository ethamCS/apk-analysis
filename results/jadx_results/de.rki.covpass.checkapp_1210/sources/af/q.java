package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u000b"}, d2 = {"Laf/q;", "T", "Laf/h;", BuildConfig.FLAVOR, "iterator", "sequence", "Lkotlin/Function1;", BuildConfig.FLAVOR, "predicate", "<init>", "(Laf/h;Lgc/l;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class q<T> implements h<T> {

    /* renamed from: a */
    private final h<T> f509a;

    /* renamed from: b */
    private final gc.l<T, Boolean> f510b;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\b"}, d2 = {"af/q$a", BuildConfig.FLAVOR, "Ltb/e0;", "b", "next", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<T> f511c;

        /* renamed from: d */
        private int f512d = -1;

        /* renamed from: q */
        private T f513q;

        /* renamed from: x */
        final /* synthetic */ q<T> f514x;

        a(q<T> qVar) {
            this.f514x = qVar;
            this.f511c = ((q) qVar).f509a.iterator();
        }

        private final void b() {
            if (this.f511c.hasNext()) {
                T next = this.f511c.next();
                if (((Boolean) ((q) this.f514x).f510b.invoke(next)).booleanValue()) {
                    this.f512d = 1;
                    this.f513q = next;
                    return;
                }
            }
            this.f512d = 0;
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
            if (this.f512d == -1) {
                b();
            }
            return this.f512d == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (this.f512d == -1) {
                b();
            }
            if (this.f512d != 0) {
                T t10 = this.f513q;
                this.f513q = null;
                this.f512d = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(h<? extends T> hVar, gc.l<? super T, Boolean> lVar) {
        t.e(hVar, "sequence");
        t.e(lVar, "predicate");
        this.f509a = hVar;
        this.f510b = lVar;
    }

    @Override // af.h
    public java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
