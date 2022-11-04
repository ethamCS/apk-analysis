package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\f"}, d2 = {"Laf/e;", "T", "Laf/h;", BuildConfig.FLAVOR, "iterator", "sequence", BuildConfig.FLAVOR, "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Laf/h;ZLgc/l;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class e<T> implements h<T> {

    /* renamed from: a */
    private final h<T> f478a;

    /* renamed from: b */
    private final boolean f479b;

    /* renamed from: c */
    private final gc.l<T, Boolean> f480c;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\b"}, d2 = {"af/e$a", BuildConfig.FLAVOR, "Ltb/e0;", "b", "next", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<T> f481c;

        /* renamed from: d */
        private int f482d = -1;

        /* renamed from: q */
        private T f483q;

        /* renamed from: x */
        final /* synthetic */ e<T> f484x;

        a(e<T> eVar) {
            this.f484x = eVar;
            this.f481c = ((e) eVar).f478a.iterator();
        }

        private final void b() {
            int i10;
            while (true) {
                if (!this.f481c.hasNext()) {
                    i10 = 0;
                    break;
                }
                T next = this.f481c.next();
                if (((Boolean) ((e) this.f484x).f480c.invoke(next)).booleanValue() == ((e) this.f484x).f479b) {
                    this.f483q = next;
                    i10 = 1;
                    break;
                }
            }
            this.f482d = i10;
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
            if (this.f482d == -1) {
                b();
            }
            return this.f482d == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (this.f482d == -1) {
                b();
            }
            if (this.f482d != 0) {
                T t10 = this.f483q;
                this.f483q = null;
                this.f482d = -1;
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
    public e(h<? extends T> hVar, boolean z10, gc.l<? super T, Boolean> lVar) {
        t.e(hVar, "sequence");
        t.e(lVar, "predicate");
        this.f478a = hVar;
        this.f479b = z10;
        this.f480c = lVar;
    }

    @Override // af.h
    public java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
