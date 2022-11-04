package x;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Executor {

    /* renamed from: d */
    private static volatile Executor f25336d;

    /* renamed from: c */
    private final ExecutorService f25337c = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f25338a = new AtomicInteger(0);

        a() {
            e.this = r2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f25338a.getAndIncrement())));
            return thread;
        }
    }

    e() {
    }

    public static Executor a() {
        if (f25336d != null) {
            return f25336d;
        }
        synchronized (e.class) {
            if (f25336d == null) {
                f25336d = new e();
            }
        }
        return f25336d;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25337c.execute(runnable);
    }
}
