package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a */
    private final Object f16127a = new Object();

    /* renamed from: b */
    private final ExecutorService f16128b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f16129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f16130a = new AtomicInteger(0);

        a() {
            b.this = r2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f16130a.getAndIncrement())));
            return thread;
        }
    }

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // m.c
    public void a(Runnable runnable) {
        this.f16128b.execute(runnable);
    }

    @Override // m.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // m.c
    public void c(Runnable runnable) {
        if (this.f16129c == null) {
            synchronized (this.f16127a) {
                if (this.f16129c == null) {
                    this.f16129c = d(Looper.getMainLooper());
                }
            }
        }
        this.f16129c.post(runnable);
    }
}
