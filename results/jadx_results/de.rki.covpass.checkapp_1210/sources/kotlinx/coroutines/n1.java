package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/k1;", "a", BuildConfig.FLAVOR, "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n1 {
    public static final k1 a() {
        return new i(Thread.currentThread());
    }

    public static final long b() {
        k1 a10 = b3.f15314a.a();
        if (a10 != null) {
            return a10.q1();
        }
        return Long.MAX_VALUE;
    }
}
