package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.l1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b&\u0010\u001aJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lkotlinx/coroutines/v0;", "Lkotlinx/coroutines/l1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ltb/e0;", "N1", "Ljava/lang/Thread;", "J1", BuildConfig.FLAVOR, "M1", "I1", "task", "z1", BuildConfig.FLAVOR, "now", "Lkotlinx/coroutines/l1$b;", "delayedTask", "u1", "shutdown", "run", "X3", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", BuildConfig.FLAVOR, "debugStatus", "I", "K1", "()Z", "isShutDown", "L1", "isShutdownRequested", "t1", "()Ljava/lang/Thread;", "thread", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class v0 extends l1 implements Runnable {
    public static final v0 W3;
    private static final long X3;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        v0 v0Var = new v0();
        W3 = v0Var;
        k1.n1(v0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        X3 = timeUnit.toNanos(l10.longValue());
    }

    private v0() {
    }

    private final synchronized void I1() {
        if (!L1()) {
            return;
        }
        debugStatus = 3;
        D1();
        notifyAll();
    }

    private final synchronized Thread J1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean K1() {
        return debugStatus == 4;
    }

    private final boolean L1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean M1() {
        if (L1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void N1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean B1;
        b3.f15314a.d(this);
        c.a();
        try {
            if (!M1()) {
                if (B1) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long q12 = q1();
                if (q12 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = X3 + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        I1();
                        c.a();
                        if (B1()) {
                            return;
                        }
                        t1();
                        return;
                    }
                    q12 = nc.m.e(q12, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (q12 > 0) {
                    if (L1()) {
                        _thread = null;
                        I1();
                        c.a();
                        if (B1()) {
                            return;
                        }
                        t1();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, q12);
                }
            }
        } finally {
            _thread = null;
            I1();
            c.a();
            if (!B1()) {
                t1();
            }
        }
    }

    @Override // kotlinx.coroutines.l1, kotlinx.coroutines.k1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.m1
    protected Thread t1() {
        Thread thread = _thread;
        return thread == null ? J1() : thread;
    }

    @Override // kotlinx.coroutines.m1
    protected void u1(long j10, l1.b bVar) {
        N1();
    }

    @Override // kotlinx.coroutines.l1
    public void z1(Runnable runnable) {
        if (K1()) {
            N1();
        }
        super.z1(runnable);
    }
}
