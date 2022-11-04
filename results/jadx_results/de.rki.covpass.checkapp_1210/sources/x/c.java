package x;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: d */
    private static ThreadLocal<ScheduledExecutorService> f25321d = new a();

    /* renamed from: c */
    private final Handler f25322c;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return x.a.d();
            }
            if (Looper.myLooper() == null) {
                return null;
            }
            return new c(new Handler(Looper.myLooper()));
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f25323a;

        b(Runnable runnable) {
            c.this = r1;
            this.f25323a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f25323a.run();
            return null;
        }
    }

    /* renamed from: x.c$c */
    /* loaded from: classes.dex */
    public static class RunnableScheduledFutureC0446c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: c */
        final AtomicReference<c.a<V>> f25325c = new AtomicReference<>(null);

        /* renamed from: d */
        private final long f25326d;

        /* renamed from: q */
        private final Callable<V> f25327q;

        /* renamed from: x */
        private final x5.a<V> f25328x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x.c$c$a */
        /* loaded from: classes.dex */
        public class a implements c.AbstractC0023c<V> {

            /* renamed from: a */
            final /* synthetic */ Handler f25329a;

            /* renamed from: b */
            final /* synthetic */ Callable f25330b;

            /* renamed from: x.c$c$a$a */
            /* loaded from: classes.dex */
            class RunnableC0447a implements Runnable {
                RunnableC0447a() {
                    a.this = r1;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0446c.this.f25325c.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f25329a.removeCallbacks(RunnableScheduledFutureC0446c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                RunnableScheduledFutureC0446c.this = r1;
                this.f25329a = handler;
                this.f25330b = callable;
            }

            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public Object a(c.a<V> aVar) {
                aVar.a(new RunnableC0447a(), x.a.a());
                RunnableScheduledFutureC0446c.this.f25325c.set(aVar);
                return "HandlerScheduledFuture-" + this.f25330b.toString();
            }
        }

        RunnableScheduledFutureC0446c(Handler handler, long j10, Callable<V> callable) {
            this.f25326d = j10;
            this.f25327q = callable;
            this.f25328x = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        /* renamed from: a */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f25328x.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f25328x.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return this.f25328x.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f25326d - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f25328x.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f25328x.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a<V> andSet = this.f25325c.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f25327q.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }
    }

    public c(Handler handler) {
        this.f25322c = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f25322c + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.f25322c.post(runnable)) {
            return;
        }
        throw a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        RunnableScheduledFutureC0446c runnableScheduledFutureC0446c = new RunnableScheduledFutureC0446c(this.f25322c, uptimeMillis, callable);
        return this.f25322c.postAtTime(runnableScheduledFutureC0446c, uptimeMillis) ? runnableScheduledFutureC0446c : y.f.g(a());
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }
}
