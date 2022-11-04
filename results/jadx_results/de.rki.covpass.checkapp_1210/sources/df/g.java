package df;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020/\u0012 \u00103\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u000101j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`2¢\u0006\u0004\b4\u00105J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0014\u0010)\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010-\u001a\u00020*8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00066"}, d2 = {"Ldf/g;", "E", "Ldf/a;", BuildConfig.FLAVOR, "currentSize", "Lkotlinx/coroutines/internal/b0;", "T", "(I)Lkotlinx/coroutines/internal/b0;", "element", "Ltb/e0;", "R", "(ILjava/lang/Object;)V", "S", "(I)V", BuildConfig.FLAVOR, "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ldf/d0;", "send", "h", "(Ldf/d0;)Ljava/lang/Object;", "O", "()Ljava/lang/Object;", "Ldf/z;", "receive", BuildConfig.FLAVOR, "G", "(Ldf/z;)Z", "wasClosed", "K", "(Z)V", "H", "()Z", "isBufferAlwaysEmpty", "I", "isBufferEmpty", "s", "isBufferAlwaysFull", "t", "isBufferFull", "J", "isClosedForReceive", BuildConfig.FLAVOR, "i", "()Ljava/lang/String;", "bufferDebugString", "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILdf/h;Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class g<E> extends df.a<E> {
    private final ReentrantLock U3;
    private Object[] V3;
    private int W3;
    private volatile /* synthetic */ int size;

    /* renamed from: x */
    private final int f8916x;

    /* renamed from: y */
    private final h f8917y;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8918a;

        static {
            int[] iArr = new int[h.values().length];
            iArr[h.SUSPEND.ordinal()] = 1;
            iArr[h.DROP_LATEST.ordinal()] = 2;
            iArr[h.DROP_OLDEST.ordinal()] = 3;
            f8918a = iArr;
        }
    }

    public g(int i10, h hVar, gc.l<? super E, tb.e0> lVar) {
        super(lVar);
        this.f8916x = i10;
        this.f8917y = hVar;
        if (!(i10 < 1 ? false : true)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        this.U3 = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i10, 8)];
        ub.l.m(objArr, b.f8903a, 0, 0, 6, null);
        this.V3 = objArr;
        this.size = 0;
    }

    private final void R(int i10, E e10) {
        if (i10 < this.f8916x) {
            S(i10);
            Object[] objArr = this.V3;
            objArr[(this.W3 + i10) % objArr.length] = e10;
            return;
        }
        Object[] objArr2 = this.V3;
        int i11 = this.W3;
        objArr2[i11 % objArr2.length] = null;
        objArr2[(i10 + i11) % objArr2.length] = e10;
        this.W3 = (i11 + 1) % objArr2.length;
    }

    private final void S(int i10) {
        Object[] objArr = this.V3;
        if (i10 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f8916x);
            Object[] objArr2 = new Object[min];
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr3 = this.V3;
                objArr2[i11] = objArr3[(this.W3 + i11) % objArr3.length];
            }
            ub.l.l(objArr2, b.f8903a, i10, min);
            this.V3 = objArr2;
            this.W3 = 0;
        }
    }

    private final kotlinx.coroutines.internal.b0 T(int i10) {
        if (i10 < this.f8916x) {
            this.size = i10 + 1;
            return null;
        }
        int i11 = a.f8918a[this.f8917y.ordinal()];
        if (i11 == 1) {
            return b.f8905c;
        }
        if (i11 == 2) {
            return b.f8904b;
        }
        if (i11 != 3) {
            throw new tb.p();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.a
    public boolean G(z<? super E> zVar) {
        ReentrantLock reentrantLock = this.U3;
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
        return this.size == 0;
    }

    @Override // df.a
    public boolean J() {
        ReentrantLock reentrantLock = this.U3;
        reentrantLock.lock();
        try {
            return super.J();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.a
    public void K(boolean z10) {
        gc.l<E, tb.e0> lVar = this.f8910c;
        ReentrantLock reentrantLock = this.U3;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            l0 l0Var = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.V3[this.W3];
                if (lVar != null && obj != b.f8903a) {
                    l0Var = kotlinx.coroutines.internal.v.c(lVar, obj, l0Var);
                }
                Object[] objArr = this.V3;
                int i12 = this.W3;
                objArr[i12] = b.f8903a;
                this.W3 = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            tb.e0 e0Var = tb.e0.f22152a;
            reentrantLock.unlock();
            super.K(z10);
            if (l0Var != null) {
                throw l0Var;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // df.a
    protected Object O() {
        ReentrantLock reentrantLock = this.U3;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object k10 = k();
                if (k10 == null) {
                    k10 = b.f8906d;
                }
                return k10;
            }
            Object[] objArr = this.V3;
            int i11 = this.W3;
            Object obj = objArr[i11];
            d0 d0Var = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object obj2 = b.f8906d;
            boolean z10 = false;
            if (i10 == this.f8916x) {
                d0 d0Var2 = null;
                while (true) {
                    d0 B = B();
                    if (B == null) {
                        d0Var = d0Var2;
                        break;
                    }
                    hc.t.b(B);
                    if (B.J(null) != null) {
                        obj2 = B.H();
                        z10 = true;
                        d0Var = B;
                        break;
                    }
                    B.K();
                    d0Var2 = B;
                }
            }
            if (obj2 != b.f8906d && !(obj2 instanceof q)) {
                this.size = i10;
                Object[] objArr2 = this.V3;
                objArr2[(this.W3 + i10) % objArr2.length] = obj2;
            }
            this.W3 = (this.W3 + 1) % this.V3.length;
            tb.e0 e0Var = tb.e0.f22152a;
            if (z10) {
                hc.t.b(d0Var);
                d0Var.G();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.c
    public Object h(d0 d0Var) {
        ReentrantLock reentrantLock = this.U3;
        reentrantLock.lock();
        try {
            return super.h(d0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // df.c
    protected String i() {
        return "(buffer:capacity=" + this.f8916x + ",size=" + this.size + ')';
    }

    @Override // df.c
    protected final boolean s() {
        return false;
    }

    @Override // df.c
    protected final boolean t() {
        return this.size == this.f8916x && this.f8917y == h.SUSPEND;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.c
    public Object v(E e10) {
        b0<E> A;
        ReentrantLock reentrantLock = this.U3;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            q<?> k10 = k();
            if (k10 != null) {
                return k10;
            }
            kotlinx.coroutines.internal.b0 T = T(i10);
            if (T != null) {
                return T;
            }
            if (i10 == 0) {
                do {
                    A = A();
                    if (A != null) {
                        if (A instanceof q) {
                            this.size = i10;
                            return A;
                        }
                        hc.t.b(A);
                    }
                } while (A.e(e10, null) == null);
                this.size = i10;
                tb.e0 e0Var = tb.e0.f22152a;
                reentrantLock.unlock();
                A.b(e10);
                return A.c();
            }
            R(i10, e10);
            return b.f8904b;
        } finally {
            reentrantLock.unlock();
        }
    }
}
