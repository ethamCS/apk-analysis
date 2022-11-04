package d2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class g implements Executor {

    /* renamed from: d */
    private final Executor f8221d;

    /* renamed from: x */
    private volatile Runnable f8223x;

    /* renamed from: c */
    private final ArrayDeque<a> f8220c = new ArrayDeque<>();

    /* renamed from: q */
    private final Object f8222q = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: c */
        final g f8224c;

        /* renamed from: d */
        final Runnable f8225d;

        a(g gVar, Runnable runnable) {
            this.f8224c = gVar;
            this.f8225d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8225d.run();
            } finally {
                this.f8224c.b();
            }
        }
    }

    public g(Executor executor) {
        this.f8221d = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f8222q) {
            z10 = !this.f8220c.isEmpty();
        }
        return z10;
    }

    void b() {
        synchronized (this.f8222q) {
            a poll = this.f8220c.poll();
            this.f8223x = poll;
            if (poll != null) {
                this.f8221d.execute(this.f8223x);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f8222q) {
            this.f8220c.add(new a(this, runnable));
            if (this.f8223x == null) {
                b();
            }
        }
    }
}
