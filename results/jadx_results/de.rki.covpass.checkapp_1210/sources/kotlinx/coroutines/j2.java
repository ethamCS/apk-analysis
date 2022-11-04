package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0017\u0012\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, d2 = {BuildConfig.FLAVOR, "g", "h", "Lkotlinx/coroutines/internal/b0;", "a", "Lkotlinx/coroutines/internal/b0;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "e", "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/j1;", "f", "Lkotlinx/coroutines/j1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a */
    private static final kotlinx.coroutines.internal.b0 f15468a = new kotlinx.coroutines.internal.b0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final kotlinx.coroutines.internal.b0 f15469b = new kotlinx.coroutines.internal.b0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final kotlinx.coroutines.internal.b0 f15470c = new kotlinx.coroutines.internal.b0("COMPLETING_RETRY");

    /* renamed from: d */
    private static final kotlinx.coroutines.internal.b0 f15471d = new kotlinx.coroutines.internal.b0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final kotlinx.coroutines.internal.b0 f15472e = new kotlinx.coroutines.internal.b0("SEALED");

    /* renamed from: f */
    private static final j1 f15473f = new j1(false);

    /* renamed from: g */
    private static final j1 f15474g = new j1(true);

    public static final Object g(Object obj) {
        return obj instanceof v1 ? new w1((v1) obj) : obj;
    }

    public static final Object h(Object obj) {
        v1 v1Var;
        w1 w1Var = obj instanceof w1 ? (w1) obj : null;
        return (w1Var == null || (v1Var = w1Var.f15580a) == null) ? obj : v1Var;
    }
}
