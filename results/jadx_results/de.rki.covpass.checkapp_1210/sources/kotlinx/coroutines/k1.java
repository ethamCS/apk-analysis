package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/l0;", BuildConfig.FLAVOR, "unconfined", BuildConfig.FLAVOR, "j1", "q1", "r1", "s1", "Lkotlinx/coroutines/d1;", "task", "Ltb/e0;", "k1", "m1", "h1", "shutdown", "q", "J", "useCount", "x", "Z", "shared", "Lkotlinx/coroutines/internal/a;", "y", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "l1", "()J", "nextTime", "o1", "()Z", "isUnconfinedLoopActive", "p1", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class k1 extends l0 {

    /* renamed from: q */
    private long f15479q;

    /* renamed from: x */
    private boolean f15480x;

    /* renamed from: y */
    private kotlinx.coroutines.internal.a<d1<?>> f15481y;

    public static /* synthetic */ void i1(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            k1Var.h1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long j1(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void n1(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            k1Var.m1(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void h1(boolean z10) {
        long j12 = this.f15479q - j1(z10);
        this.f15479q = j12;
        if (j12 <= 0 && this.f15480x) {
            shutdown();
        }
    }

    public final void k1(d1<?> d1Var) {
        kotlinx.coroutines.internal.a<d1<?>> aVar = this.f15481y;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f15481y = aVar;
        }
        aVar.a(d1Var);
    }

    public long l1() {
        kotlinx.coroutines.internal.a<d1<?>> aVar = this.f15481y;
        return (aVar != null && !aVar.c()) ? 0L : Long.MAX_VALUE;
    }

    public final void m1(boolean z10) {
        this.f15479q += j1(z10);
        if (!z10) {
            this.f15480x = true;
        }
    }

    public final boolean o1() {
        return this.f15479q >= j1(true);
    }

    public final boolean p1() {
        kotlinx.coroutines.internal.a<d1<?>> aVar = this.f15481y;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }

    public long q1() {
        return !r1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean r1() {
        d1<?> d10;
        kotlinx.coroutines.internal.a<d1<?>> aVar = this.f15481y;
        if (aVar == null || (d10 = aVar.d()) == null) {
            return false;
        }
        d10.run();
        return true;
    }

    public boolean s1() {
        return false;
    }

    public void shutdown() {
    }
}
