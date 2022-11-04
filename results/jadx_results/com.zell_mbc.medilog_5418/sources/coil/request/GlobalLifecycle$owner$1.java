package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
/* compiled from: GlobalLifecycle.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/Lifecycle;", "getLifecycle"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes2.dex */
final class GlobalLifecycle$owner$1 implements LifecycleOwner {
    public static final GlobalLifecycle$owner$1 INSTANCE = new GlobalLifecycle$owner$1();

    GlobalLifecycle$owner$1() {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return GlobalLifecycle.INSTANCE;
    }
}
