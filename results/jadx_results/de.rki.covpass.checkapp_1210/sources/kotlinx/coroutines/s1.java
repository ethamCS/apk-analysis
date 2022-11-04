package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003*\f\b\u0007\u0010\u0005\"\u00020\u00042\u00020\u0004¨\u0006\u0006"}, d2 = {"Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/l0;", "a", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/l0;", "Lkotlinx/coroutines/q1;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s1 {
    public static final l0 a(Executor executor) {
        l0 l0Var;
        f1 f1Var = executor instanceof f1 ? (f1) executor : null;
        return (f1Var == null || (l0Var = f1Var.f15337c) == null) ? new r1(executor) : l0Var;
    }
}
