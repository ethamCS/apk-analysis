package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/h;", "T", "Lkotlinx/coroutines/a;", BuildConfig.FLAVOR, "state", "Ltb/e0;", "C", "l1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "q", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/k1;", "x", "Lkotlinx/coroutines/k1;", "eventLoop", BuildConfig.FLAVOR, "o0", "()Z", "isScopedCoroutine", "Lxb/g;", "parentContext", "<init>", "(Lxb/g;Ljava/lang/Thread;Lkotlinx/coroutines/k1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h<T> extends a<T> {

    /* renamed from: q */
    private final Thread f15394q;

    /* renamed from: x */
    private final k1 f15395x;

    public h(xb.g gVar, Thread thread, k1 k1Var) {
        super(gVar, true, true);
        this.f15394q = thread;
        this.f15395x = k1Var;
    }

    @Override // kotlinx.coroutines.i2
    public void C(Object obj) {
        if (!hc.t.a(Thread.currentThread(), this.f15394q)) {
            Thread thread = this.f15394q;
            c.a();
            LockSupport.unpark(thread);
        }
    }

    public final T l1() {
        c.a();
        try {
            k1 k1Var = this.f15395x;
            d0 d0Var = null;
            if (k1Var != null) {
                k1.n1(k1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                k1 k1Var2 = this.f15395x;
                long q12 = k1Var2 != null ? k1Var2.q1() : Long.MAX_VALUE;
                if (p()) {
                    k1 k1Var3 = this.f15395x;
                    if (k1Var3 != null) {
                        k1.i1(k1Var3, false, 1, null);
                    }
                    c.a();
                    T t10 = (T) j2.h(k0());
                    if (t10 instanceof d0) {
                        d0Var = (d0) t10;
                    }
                    if (d0Var != null) {
                        throw d0Var.f15325a;
                    }
                    return t10;
                }
                c.a();
                LockSupport.parkNanos(this, q12);
            }
            InterruptedException interruptedException = new InterruptedException();
            F(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            c.a();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.i2
    protected boolean o0() {
        return true;
    }
}
