package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002¨\u0006\f"}, d2 = {"Laf/f;", "T", "R", "E", "Laf/h;", BuildConfig.FLAVOR, "iterator", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Laf/h;Lgc/l;Lgc/l;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a */
    private final h<T> f485a;

    /* renamed from: b */
    private final gc.l<T, R> f486b;

    /* renamed from: c */
    private final gc.l<R, Iterator<E>> f487c;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0007"}, d2 = {"af/f$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "next", "()Ljava/lang/Object;", "hasNext", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<E>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<T> f488c;

        /* renamed from: d */
        private Iterator<? extends E> f489d;

        /* renamed from: q */
        final /* synthetic */ f<T, R, E> f490q;

        a(f<T, R, E> fVar) {
            this.f490q = fVar;
            this.f488c = ((f) fVar).f485a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean b() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f489d
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f489d = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f489d
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f488c
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f488c
                java.lang.Object r0 = r0.next()
                af.f<T, R, E> r3 = r5.f490q
                gc.l r3 = af.f.b(r3)
                af.f<T, R, E> r4 = r5.f490q
                gc.l r4 = af.f.d(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f489d = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: af.f.a.b():boolean");
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
            return b();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public E next() {
            if (b()) {
                java.util.Iterator<? extends E> it = this.f489d;
                t.b(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> hVar, gc.l<? super T, ? extends R> lVar, gc.l<? super R, ? extends java.util.Iterator<? extends E>> lVar2) {
        t.e(hVar, "sequence");
        t.e(lVar, "transformer");
        t.e(lVar2, "iterator");
        this.f485a = hVar;
        this.f486b = lVar;
        this.f487c = lVar2;
    }

    @Override // af.h
    public java.util.Iterator<E> iterator() {
        return new a(this);
    }
}
