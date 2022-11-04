package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/z0;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lxb/g;", "context", BuildConfig.FLAVOR, "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "j1", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Ltb/e0;", "h1", "u0", "Lkotlinx/coroutines/p;", "continuation", "b", "close", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "Ljava/util/concurrent/Executor;", "x", "Ljava/util/concurrent/Executor;", "i1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r1 extends q1 implements z0 {

    /* renamed from: x */
    private final Executor f15504x;

    public r1(Executor executor) {
        this.f15504x = executor;
        kotlinx.coroutines.internal.d.a(i1());
    }

    private final void h1(xb.g gVar, RejectedExecutionException rejectedExecutionException) {
        e2.d(gVar, p1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> j1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, xb.g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            h1(gVar, e10);
            return null;
        }
    }

    @Override // kotlinx.coroutines.z0
    public void b(long j10, p<? super tb.e0> pVar) {
        Executor i12 = i1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = i12 instanceof ScheduledExecutorService ? (ScheduledExecutorService) i12 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = j1(scheduledExecutorService, new u2(this, pVar), pVar.b(), j10);
        }
        if (scheduledFuture != null) {
            e2.f(pVar, scheduledFuture);
        } else {
            v0.W3.b(j10, pVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor i12 = i1();
        ExecutorService executorService = i12 instanceof ExecutorService ? (ExecutorService) i12 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof r1) && ((r1) obj).i1() == i1();
    }

    public int hashCode() {
        return System.identityHashCode(i1());
    }

    public Executor i1() {
        return this.f15504x;
    }

    @Override // kotlinx.coroutines.l0
    public String toString() {
        return i1().toString();
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        try {
            Executor i12 = i1();
            c.a();
            i12.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            h1(gVar, e10);
            g1.b().u0(gVar, runnable);
        }
    }
}
