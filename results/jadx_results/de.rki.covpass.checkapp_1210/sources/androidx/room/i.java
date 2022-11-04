package androidx.room;

import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.s1;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/room/i0;", "Lkotlinx/coroutines/l0;", "a", "b", "(Landroidx/room/i0;)Lkotlinx/coroutines/l0;", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i {
    public static final kotlinx.coroutines.l0 a(i0 i0Var) {
        hc.t.e(i0Var, "<this>");
        Map<String, Object> k10 = i0Var.k();
        hc.t.d(k10, "backingFieldMap");
        Object obj = k10.get("QueryDispatcher");
        if (obj == null) {
            Executor n10 = i0Var.n();
            hc.t.d(n10, "queryExecutor");
            obj = s1.a(n10);
            k10.put("QueryDispatcher", obj);
        }
        hc.t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.l0) obj;
    }

    public static final kotlinx.coroutines.l0 b(i0 i0Var) {
        hc.t.e(i0Var, "<this>");
        Map<String, Object> k10 = i0Var.k();
        hc.t.d(k10, "backingFieldMap");
        Object obj = k10.get("TransactionDispatcher");
        if (obj == null) {
            Executor r10 = i0Var.r();
            hc.t.d(r10, "transactionExecutor");
            obj = s1.a(r10);
            k10.put("TransactionDispatcher", obj);
        }
        hc.t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kotlinx.coroutines.l0) obj;
    }
}
