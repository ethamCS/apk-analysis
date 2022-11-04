package ne;

import hc.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.e0;
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: b */
    private final Runnable f16972b;

    /* renamed from: c */
    private final gc.l<InterruptedException, e0> f16973c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable runnable, gc.l<? super InterruptedException, e0> lVar) {
        this(new ReentrantLock(), runnable, lVar);
        t.e(runnable, "checkCancelled");
        t.e(lVar, "interruptedExceptionHandler");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Lock lock, Runnable runnable, gc.l<? super InterruptedException, e0> lVar) {
        super(lock);
        t.e(lock, "lock");
        t.e(runnable, "checkCancelled");
        t.e(lVar, "interruptedExceptionHandler");
        this.f16972b = runnable;
        this.f16973c = lVar;
    }

    @Override // ne.d, ne.k
    public void b() {
        while (!c().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f16972b.run();
            } catch (InterruptedException e10) {
                this.f16973c.invoke(e10);
                return;
            }
        }
    }
}
