package af;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Laf/i;", "T", "Laf/j;", BuildConfig.FLAVOR, "Lxb/d;", "Ltb/e0;", "j", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "i", BuildConfig.FLAVOR, "hasNext", "next", "value", "d", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "iterator", "f", "(Ljava/util/Iterator;Lxb/d;)Ljava/lang/Object;", "Ltb/s;", "result", "y", "(Ljava/lang/Object;)V", "nextStep", "Lxb/d;", "getNextStep", "()Lxb/d;", "k", "(Lxb/d;)V", "Lxb/g;", "b", "()Lxb/g;", "context", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class i<T> extends j<T> implements Iterator<T>, xb.d<e0>, ic.a, j$.util.Iterator {

    /* renamed from: c */
    private int f496c;

    /* renamed from: d */
    private T f497d;

    /* renamed from: q */
    private Iterator<? extends T> f498q;

    /* renamed from: x */
    private xb.d<? super e0> f499x;

    private final Throwable i() {
        int i10 = this.f496c;
        if (i10 != 4) {
            if (i10 == 5) {
                return new IllegalStateException("Iterator has failed.");
            }
            return new IllegalStateException("Unexpected state of the iterator: " + this.f496c);
        }
        return new NoSuchElementException();
    }

    private final T j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // xb.d
    public xb.g b() {
        return xb.h.f25516c;
    }

    @Override // af.j
    public Object d(T t10, xb.d<? super e0> dVar) {
        Object c10;
        Object c11;
        Object c12;
        this.f497d = t10;
        this.f496c = 3;
        this.f499x = dVar;
        c10 = yb.d.c();
        c11 = yb.d.c();
        if (c10 == c11) {
            zb.h.c(dVar);
        }
        c12 = yb.d.c();
        return c10 == c12 ? c10 : e0.f22152a;
    }

    @Override // af.j
    public Object f(Iterator<? extends T> it, xb.d<? super e0> dVar) {
        Object c10;
        Object c11;
        Object c12;
        if (!it.hasNext()) {
            return e0.f22152a;
        }
        this.f498q = it;
        this.f496c = 2;
        this.f499x = dVar;
        c10 = yb.d.c();
        c11 = yb.d.c();
        if (c10 == c11) {
            zb.h.c(dVar);
        }
        c12 = yb.d.c();
        return c10 == c12 ? c10 : e0.f22152a;
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
        while (true) {
            int i10 = this.f496c;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 != 4) {
                        throw i();
                    }
                    return false;
                }
                java.util.Iterator<? extends T> it = this.f498q;
                t.b(it);
                if (it.hasNext()) {
                    this.f496c = 2;
                    return true;
                }
                this.f498q = null;
            }
            this.f496c = 5;
            xb.d<? super e0> dVar = this.f499x;
            t.b(dVar);
            this.f499x = null;
            s.a aVar = s.Companion;
            dVar.y(s.c(e0.f22152a));
        }
    }

    public final void k(xb.d<? super e0> dVar) {
        this.f499x = dVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        int i10 = this.f496c;
        if (i10 == 0 || i10 == 1) {
            return j();
        }
        if (i10 == 2) {
            this.f496c = 1;
            java.util.Iterator<? extends T> it = this.f498q;
            t.b(it);
            return it.next();
        } else if (i10 != 3) {
            throw i();
        } else {
            this.f496c = 0;
            T t10 = this.f497d;
            this.f497d = null;
            return t10;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // xb.d
    public void y(Object obj) {
        tb.t.b(obj);
        this.f496c = 4;
    }
}
