package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
class h {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        private String f3544a;

        /* renamed from: b */
        private int f3545b;

        /* renamed from: androidx.core.provider.h$a$a */
        /* loaded from: classes.dex */
        private static class C0034a extends Thread {

            /* renamed from: c */
            private final int f3546c;

            C0034a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f3546c = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3546c);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f3544a = str;
            this.f3545b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0034a(runnable, this.f3544a, this.f3545b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<T> implements Runnable {

        /* renamed from: c */
        private Callable<T> f3547c;

        /* renamed from: d */
        private androidx.core.util.a<T> f3548d;

        /* renamed from: q */
        private Handler f3549q;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ androidx.core.util.a f3550c;

            /* renamed from: d */
            final /* synthetic */ Object f3551d;

            a(androidx.core.util.a aVar, Object obj) {
                b.this = r1;
                this.f3550c = aVar;
                this.f3551d = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f3550c.a(this.f3551d);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f3547c = callable;
            this.f3548d = aVar;
            this.f3549q = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f3547c.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f3549q.post(new a(this.f3548d, t10));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
