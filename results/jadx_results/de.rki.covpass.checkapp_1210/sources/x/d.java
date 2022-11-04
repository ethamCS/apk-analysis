package x;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements Executor {

    /* renamed from: d */
    private static volatile Executor f25333d;

    /* renamed from: c */
    private final ExecutorService f25334c = Executors.newSingleThreadExecutor(new a());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        a() {
            d.this = r1;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    public static Executor a() {
        if (f25333d != null) {
            return f25333d;
        }
        synchronized (d.class) {
            if (f25333d == null) {
                f25333d = new d();
            }
        }
        return f25333d;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25334c.execute(runnable);
    }
}
