package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.z0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001J\b\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/k;", "Lkotlinx/coroutines/l0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/z0;", BuildConfig.FLAVOR, "i1", "block", "h1", BuildConfig.FLAVOR, "timeMillis", "Lkotlinx/coroutines/p;", "Ltb/e0;", "continuation", "b", "run", "Lxb/g;", "context", "u0", "O0", "q", "Lkotlinx/coroutines/l0;", "dispatcher", BuildConfig.FLAVOR, "x", "I", "parallelism", "runningWorkers", "Lkotlinx/coroutines/internal/p;", "U3", "Lkotlinx/coroutines/internal/p;", "queue", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/SynchronizedObject;", "V3", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/l0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class k extends kotlinx.coroutines.l0 implements Runnable, z0 {
    private final p<Runnable> U3;
    private final Object V3;

    /* renamed from: q */
    private final kotlinx.coroutines.l0 f15433q;
    private volatile int runningWorkers;

    /* renamed from: x */
    private final int f15434x;

    /* renamed from: y */
    private final /* synthetic */ z0 f15435y;

    public k(kotlinx.coroutines.l0 l0Var, int i10) {
        this.f15433q = l0Var;
        this.f15434x = i10;
        z0 z0Var = l0Var instanceof z0 ? (z0) l0Var : null;
        this.f15435y = z0Var == null ? w0.a() : z0Var;
        this.U3 = new p<>(false);
        this.V3 = new Object();
    }

    private final boolean h1(Runnable runnable) {
        this.U3.a(runnable);
        return this.runningWorkers >= this.f15434x;
    }

    private final boolean i1() {
        synchronized (this.V3) {
            if (this.runningWorkers >= this.f15434x) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.l0
    public void O0(xb.g gVar, Runnable runnable) {
        if (h1(runnable) || !i1()) {
            return;
        }
        this.f15433q.O0(this, this);
    }

    @Override // kotlinx.coroutines.z0
    public void b(long j10, kotlinx.coroutines.p<? super tb.e0> pVar) {
        this.f15435y.b(j10, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        r1 = r4.V3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.U3.c() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4.runningWorkers++;
        r2 = tb.e0.f22152a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.p<java.lang.Runnable> r2 = r4.U3
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            xb.h r3 = xb.h.f25516c
            kotlinx.coroutines.o0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.l0 r2 = r4.f15433q
            boolean r2 = r2.R0(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.l0 r0 = r4.f15433q
            r0.u0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.V3
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.p<java.lang.Runnable> r2 = r4.U3     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            tb.e0 r2 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.k.run():void");
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        if (h1(runnable) || !i1()) {
            return;
        }
        this.f15433q.u0(this, this);
    }
}
