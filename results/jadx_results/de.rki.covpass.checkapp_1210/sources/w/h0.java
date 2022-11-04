package w;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class h0 {
    public static h0 a(Executor executor, Handler handler) {
        return new a(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
