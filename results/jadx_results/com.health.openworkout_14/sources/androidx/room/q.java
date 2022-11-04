package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q implements Executor {

    /* renamed from: a */
    private final Executor f1927a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f1928b = new ArrayDeque<>();

    /* renamed from: c */
    private Runnable f1929c;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Runnable f1930b;

        a(Runnable runnable) {
            q.this = r1;
            this.f1930b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1930b.run();
            } finally {
                q.this.a();
            }
        }
    }

    public q(Executor executor) {
        this.f1927a = executor;
    }

    synchronized void a() {
        Runnable poll = this.f1928b.poll();
        this.f1929c = poll;
        if (poll != null) {
            this.f1927a.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f1928b.offer(new a(runnable));
        if (this.f1929c == null) {
            a();
        }
    }
}
