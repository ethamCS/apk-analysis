package androidx.camera.core;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
class o implements Executor {

    /* renamed from: q */
    private static final ThreadFactory f2418q = new a();

    /* renamed from: c */
    private final Object f2419c = new Object();

    /* renamed from: d */
    private ThreadPoolExecutor f2420d = b();

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2421a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f2421a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2418q);
        threadPoolExecutor.setRejectedExecutionHandler(n.f2411a);
        return threadPoolExecutor;
    }

    public void c(w.a0 a0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        androidx.core.util.h.g(a0Var);
        synchronized (this.f2419c) {
            if (this.f2420d.isShutdown()) {
                this.f2420d = b();
            }
            threadPoolExecutor = this.f2420d;
        }
        int max = Math.max(1, a0Var.c().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        androidx.core.util.h.g(runnable);
        synchronized (this.f2419c) {
            this.f2420d.execute(runnable);
        }
    }
}
