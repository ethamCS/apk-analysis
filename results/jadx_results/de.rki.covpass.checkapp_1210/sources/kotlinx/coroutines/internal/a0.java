package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u001c\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {BuildConfig.FLAVOR, "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "b", "stackTraceRecoveryClassName", "Lzb/e;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a */
    private static final String f15406a;

    /* renamed from: b */
    private static final String f15407b;

    static {
        Object obj;
        Object obj2;
        try {
            s.a aVar = tb.s.Companion;
            obj = tb.s.c(Class.forName("zb.a").getCanonicalName());
        } catch (Throwable th2) {
            s.a aVar2 = tb.s.Companion;
            obj = tb.s.c(tb.t.a(th2));
        }
        if (tb.s.g(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f15406a = (String) obj;
        try {
            s.a aVar3 = tb.s.Companion;
            obj2 = tb.s.c(a0.class.getCanonicalName());
        } catch (Throwable th3) {
            s.a aVar4 = tb.s.Companion;
            obj2 = tb.s.c(tb.t.a(th3));
        }
        if (tb.s.g(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f15407b = (String) obj2;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
