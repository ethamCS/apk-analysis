package androidx.lifecycle;

import kotlin.Metadata;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.y2;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "Lkotlinx/coroutines/q0;", "a", "(Landroidx/lifecycle/s0;)Lkotlinx/coroutines/q0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t0 {
    public static final kotlinx.coroutines.q0 a(s0 s0Var) {
        hc.t.e(s0Var, "<this>");
        kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) s0Var.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (q0Var != null) {
            return q0Var;
        }
        Object e10 = s0Var.e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new d(y2.b(null, 1, null).B(g1.c().h1())));
        hc.t.d(e10, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (kotlinx.coroutines.q0) e10;
    }
}
