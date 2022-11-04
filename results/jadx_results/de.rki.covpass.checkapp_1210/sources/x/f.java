package x;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f25340a;

    private f() {
    }

    public static ScheduledExecutorService a() {
        if (f25340a != null) {
            return f25340a;
        }
        synchronized (f.class) {
            if (f25340a == null) {
                f25340a = new c(new Handler(Looper.getMainLooper()));
            }
        }
        return f25340a;
    }
}
