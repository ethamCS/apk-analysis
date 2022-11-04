package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/b3;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/k1;", "a", "()Lkotlinx/coroutines/k1;", "Ltb/e0;", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/k1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: a */
    public static final b3 f15314a = new b3();

    /* renamed from: b */
    private static final ThreadLocal<k1> f15315b = new ThreadLocal<>();

    private b3() {
    }

    public final k1 a() {
        return f15315b.get();
    }

    public final k1 b() {
        ThreadLocal<k1> threadLocal = f15315b;
        k1 k1Var = threadLocal.get();
        if (k1Var == null) {
            k1 a10 = n1.a();
            threadLocal.set(a10);
            return a10;
        }
        return k1Var;
    }

    public final void c() {
        f15315b.set(null);
    }

    public final void d(k1 k1Var) {
        f15315b.set(k1Var);
    }
}
