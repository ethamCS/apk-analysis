package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    c<ListenableWorker.a> U3;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            Worker.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.U3.p(Worker.this.p());
            } catch (Throwable th2) {
                Worker.this.U3.q(th2);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final x5.a<ListenableWorker.a> n() {
        this.U3 = c.t();
        b().execute(new a());
        return this.U3;
    }

    public abstract ListenableWorker.a p();
}
