package d2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class m {

    /* renamed from: f */
    private static final String f8241f = u1.k.f("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f8242a;

    /* renamed from: b */
    private final ScheduledExecutorService f8243b;

    /* renamed from: c */
    final Map<String, c> f8244c = new HashMap();

    /* renamed from: d */
    final Map<String, b> f8245d = new HashMap();

    /* renamed from: e */
    final Object f8246e = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        private int f8247a = 0;

        a() {
            m.this = r1;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f8247a);
            this.f8247a = this.f8247a + 1;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: c */
        private final m f8249c;

        /* renamed from: d */
        private final String f8250d;

        c(m mVar, String str) {
            this.f8249c = mVar;
            this.f8250d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f8249c.f8246e) {
                if (this.f8249c.f8244c.remove(this.f8250d) != null) {
                    b remove = this.f8249c.f8245d.remove(this.f8250d);
                    if (remove != null) {
                        remove.b(this.f8250d);
                    }
                } else {
                    u1.k.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f8250d), new Throwable[0]);
                }
            }
        }
    }

    public m() {
        a aVar = new a();
        this.f8242a = aVar;
        this.f8243b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.f8243b.isShutdown()) {
            this.f8243b.shutdownNow();
        }
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f8246e) {
            u1.k.c().a(f8241f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f8244c.put(str, cVar);
            this.f8245d.put(str, bVar);
            this.f8243b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f8246e) {
            if (this.f8244c.remove(str) != null) {
                u1.k.c().a(f8241f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f8245d.remove(str);
            }
        }
    }
}
