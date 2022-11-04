package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.l1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/k1;", "Ltb/e0;", "v1", BuildConfig.FLAVOR, "now", "Lkotlinx/coroutines/l1$b;", "delayedTask", "u1", "Ljava/lang/Thread;", "t1", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class m1 extends k1 {
    protected abstract Thread t1();

    public void u1(long j10, l1.b bVar) {
        v0.W3.E1(j10, bVar);
    }

    public final void v1() {
        Thread t12 = t1();
        if (Thread.currentThread() != t12) {
            c.a();
            LockSupport.unpark(t12);
        }
    }
}
