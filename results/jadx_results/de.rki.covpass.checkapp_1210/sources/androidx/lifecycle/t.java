package androidx.lifecycle;

import kotlin.Metadata;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.y2;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/m;", "Landroidx/lifecycle/p;", "a", "(Landroidx/lifecycle/m;)Landroidx/lifecycle/p;", "coroutineScope", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t {
    public static final p a(m mVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        hc.t.e(mVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) mVar.f4337a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(mVar, y2.b(null, 1, null).B(g1.c().h1()));
        } while (!mVar.f4337a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.i();
        return lifecycleCoroutineScopeImpl;
    }
}
