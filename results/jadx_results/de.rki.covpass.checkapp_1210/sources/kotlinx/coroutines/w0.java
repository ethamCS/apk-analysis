package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/z0;", "b", BuildConfig.FLAVOR, "a", "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/z0;", "()Lkotlinx/coroutines/z0;", "DefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a */
    private static final boolean f15578a = kotlinx.coroutines.internal.c0.e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final z0 f15579b = b();

    public static final z0 a() {
        return f15579b;
    }

    private static final z0 b() {
        if (!f15578a) {
            return v0.W3;
        }
        m2 c10 = g1.c();
        return (kotlinx.coroutines.internal.t.c(c10) || !(c10 instanceof z0)) ? v0.W3 : (z0) c10;
    }
}
