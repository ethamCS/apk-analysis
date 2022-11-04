package v1;

import android.os.Handler;
import android.os.Looper;
import u1.q;
/* loaded from: classes.dex */
public class a implements q {

    /* renamed from: a */
    private final Handler f23838a = androidx.core.os.g.a(Looper.getMainLooper());

    @Override // u1.q
    public void a(long j10, Runnable runnable) {
        this.f23838a.postDelayed(runnable, j10);
    }

    @Override // u1.q
    public void b(Runnable runnable) {
        this.f23838a.removeCallbacks(runnable);
    }
}
