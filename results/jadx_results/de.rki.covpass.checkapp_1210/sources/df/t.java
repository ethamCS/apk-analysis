package df;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010 \u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001f¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0014R\u0014\u0010\u0013\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Ldf/t;", "E", "Ldf/a;", BuildConfig.FLAVOR, "element", "Lkotlinx/coroutines/internal/l0;", "R", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "O", BuildConfig.FLAVOR, "wasClosed", "Ltb/e0;", "K", "Ldf/z;", "receive", "G", "H", "()Z", "isBufferAlwaysEmpty", "I", "isBufferEmpty", "s", "isBufferAlwaysFull", "t", "isBufferFull", BuildConfig.FLAVOR, "i", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class t<E> extends a<E> {

    /* renamed from: x */
    private final ReentrantLock f8932x = new ReentrantLock();

    /* renamed from: y */
    private Object f8933y = b.f8903a;

    public t(gc.l<? super E, tb.e0> lVar) {
        super(lVar);
    }

    private final l0 R(Object obj) {
        gc.l<E, tb.e0> lVar;
        Object obj2 = this.f8933y;
        l0 l0Var = null;
        if (obj2 != b.f8903a && (lVar = this.f8910c) != null) {
            l0Var = kotlinx.coroutines.internal.v.d(lVar, obj2, null, 2, null);
        }
        this.f8933y = obj;
        return l0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.a
    public boolean G(z<? super E> zVar) {
        ReentrantLock reentrantLock = this.f8932x;
        reentrantLock.lock();
        try {
            return super.G(zVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // df.a
    protected final boolean H() {
        return false;
    }

    @Override // df.a
    protected final boolean I() {
        ReentrantLock reentrantLock = this.f8932x;
        reentrantLock.lock();
        try {
            return this.f8933y == b.f8903a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.a
    public void K(boolean z10) {
        ReentrantLock reentrantLock = this.f8932x;
        reentrantLock.lock();
        try {
            l0 R = R(b.f8903a);
            tb.e0 e0Var = tb.e0.f22152a;
            reentrantLock.unlock();
            super.K(z10);
            if (R != null) {
                throw R;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // df.a
    protected Object O() {
        ReentrantLock reentrantLock = this.f8932x;
        reentrantLock.lock();
        try {
            Object obj = this.f8933y;
            kotlinx.coroutines.internal.b0 b0Var = b.f8903a;
            if (obj != b0Var) {
                this.f8933y = b0Var;
                tb.e0 e0Var = tb.e0.f22152a;
                return obj;
            }
            Object k10 = k();
            if (k10 == null) {
                k10 = b.f8906d;
            }
            return k10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // df.c
    protected String i() {
        ReentrantLock reentrantLock = this.f8932x;
        reentrantLock.lock();
        try {
            return "(value=" + this.f8933y + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // df.c
    protected final boolean s() {
        return false;
    }

    @Override // df.c
    protected final boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.c
    public Object v(E e10) {
        b0<E> A;
        ReentrantLock reentrantLock = this.f8932x;
        reentrantLock.lock();
        try {
            q<?> k10 = k();
            if (k10 != null) {
                return k10;
            }
            if (this.f8933y == b.f8903a) {
                do {
                    A = A();
                    if (A != null) {
                        if (A instanceof q) {
                            return A;
                        }
                        hc.t.b(A);
                    }
                } while (A.e(e10, null) == null);
                tb.e0 e0Var = tb.e0.f22152a;
                reentrantLock.unlock();
                A.b(e10);
                return A.c();
            }
            l0 R = R(e10);
            if (R != null) {
                throw R;
            }
            return b.f8904b;
        } finally {
            reentrantLock.unlock();
        }
    }
}
