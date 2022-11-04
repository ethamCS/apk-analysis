package cf;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¨\u0006\u0005"}, d2 = {"Landroid/os/Looper;", BuildConfig.FLAVOR, "async", "Landroid/os/Handler;", "a", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    public static final d f6479a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        d dVar = null;
        try {
            s.a aVar = s.Companion;
            obj = s.c(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            s.a aVar2 = s.Companion;
            obj = s.c(t.a(th2));
        }
        if (!s.i(obj)) {
            dVar = obj;
        }
        f6479a = dVar;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        return new Handler(looper);
    }
}
