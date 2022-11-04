package a.b.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a */
    private final Object f53a = new Object();

    /* renamed from: b */
    private final ExecutorService f54b = Executors.newFixedThreadPool(2, new a(this));

    /* renamed from: c */
    private volatile Handler f55c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f56a = new AtomicInteger(0);

        a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f56a.getAndIncrement())));
            return thread;
        }
    }

    @Override // a.b.a.a.c
    public void a(Runnable runnable) {
        this.f54b.execute(runnable);
    }

    @Override // a.b.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // a.b.a.a.c
    public void b(Runnable runnable) {
        if (this.f55c == null) {
            synchronized (this.f53a) {
                if (this.f55c == null) {
                    this.f55c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f55c.post(runnable);
    }
}
