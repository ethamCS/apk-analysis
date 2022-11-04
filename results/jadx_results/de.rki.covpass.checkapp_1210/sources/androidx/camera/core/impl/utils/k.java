package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    private static volatile Handler f2380a;

    private k() {
    }

    public static Handler a() {
        if (f2380a != null) {
            return f2380a;
        }
        synchronized (k.class) {
            if (f2380a == null) {
                f2380a = androidx.core.os.g.a(Looper.getMainLooper());
            }
        }
        return f2380a;
    }
}
