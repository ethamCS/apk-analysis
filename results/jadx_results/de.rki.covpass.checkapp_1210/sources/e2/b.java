package e2;

import android.os.Handler;
import android.os.Looper;
import d2.g;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class b implements e2.a {

    /* renamed from: a */
    private final g f9346a;

    /* renamed from: b */
    private final Handler f9347b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f9348c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Executor {
        a() {
            b.this = r1;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f9346a = new g(executor);
    }

    @Override // e2.a
    public Executor a() {
        return this.f9348c;
    }

    @Override // e2.a
    public void b(Runnable runnable) {
        this.f9346a.execute(runnable);
    }

    @Override // e2.a
    public g c() {
        return this.f9346a;
    }

    public void d(Runnable runnable) {
        this.f9347b.post(runnable);
    }
}
