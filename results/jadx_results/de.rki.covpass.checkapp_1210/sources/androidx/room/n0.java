package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n0 implements Executor {

    /* renamed from: c */
    private final Executor f4969c;

    /* renamed from: d */
    private final ArrayDeque<Runnable> f4970d = new ArrayDeque<>();

    /* renamed from: q */
    private Runnable f4971q;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Runnable f4972c;

        a(Runnable runnable) {
            n0.this = r1;
            this.f4972c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4972c.run();
            } finally {
                n0.this.a();
            }
        }
    }

    public n0(Executor executor) {
        this.f4969c = executor;
    }

    synchronized void a() {
        Runnable poll = this.f4970d.poll();
        this.f4971q = poll;
        if (poll != null) {
            this.f4969c.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f4970d.offer(new a(runnable));
        if (this.f4971q == null) {
            a();
        }
    }
}
