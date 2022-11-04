package y;

import androidx.camera.core.s1;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class g<V> implements x5.a<V> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<V> extends g<V> {

        /* renamed from: c */
        private final Throwable f25712c;

        public a(Throwable th2) {
            this.f25712c = th2;
        }

        @Override // y.g, java.util.concurrent.Future
        public V get() {
            throw new ExecutionException(this.f25712c);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f25712c + "]]";
        }
    }

    /* loaded from: classes.dex */
    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th2) {
            super(th2);
        }

        /* renamed from: d */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c<V> extends g<V> {

        /* renamed from: d */
        static final g<Object> f25713d = new c(null);

        /* renamed from: c */
        private final V f25714c;

        public c(V v10) {
            this.f25714c = v10;
        }

        @Override // y.g, java.util.concurrent.Future
        public V get() {
            return this.f25714c;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f25714c + "]]";
        }
    }

    g() {
    }

    public static <V> x5.a<V> a() {
        return c.f25713d;
    }

    @Override // x5.a
    public void b(Runnable runnable, Executor executor) {
        androidx.core.util.h.g(runnable);
        androidx.core.util.h.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            s1.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        androidx.core.util.h.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
