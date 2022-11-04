package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002¨\u0006\f"}, d2 = {"Laf/g;", BuildConfig.FLAVOR, "T", "Laf/h;", BuildConfig.FLAVOR, "iterator", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lgc/a;Lgc/l;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class g<T> implements h<T> {

    /* renamed from: a */
    private final gc.a<T> f491a;

    /* renamed from: b */
    private final gc.l<T, T> f492b;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\b"}, d2 = {"af/g$a", BuildConfig.FLAVOR, "Ltb/e0;", "b", "next", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private T f493c;

        /* renamed from: d */
        private int f494d = -2;

        /* renamed from: q */
        final /* synthetic */ g<T> f495q;

        a(g<T> gVar) {
            this.f495q = gVar;
        }

        private final void b() {
            T t10;
            if (this.f494d == -2) {
                t10 = (T) ((g) this.f495q).f491a.invoke();
            } else {
                gc.l lVar = ((g) this.f495q).f492b;
                T t11 = this.f493c;
                t.b(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f493c = t10;
            this.f494d = t10 == null ? 0 : 1;
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
            if (this.f494d < 0) {
                b();
            }
            return this.f494d == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (this.f494d < 0) {
                b();
            }
            if (this.f494d != 0) {
                T t10 = this.f493c;
                t.c(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f494d = -1;
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
    public g(gc.a<? extends T> aVar, gc.l<? super T, ? extends T> lVar) {
        t.e(aVar, "getInitialValue");
        t.e(lVar, "getNextValue");
        this.f491a = aVar;
        this.f492b = lVar;
    }

    @Override // af.h
    public java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
