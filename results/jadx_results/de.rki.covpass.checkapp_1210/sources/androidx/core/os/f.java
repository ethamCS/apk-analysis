package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: c */
        private final Handler f3499c;

        a(Handler handler) {
            this.f3499c = (Handler) androidx.core.util.h.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f3499c.post((Runnable) androidx.core.util.h.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3499c + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
