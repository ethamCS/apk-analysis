package androidx.camera.core.impl.utils;

import android.os.Looper;
/* loaded from: classes.dex */
public final class l {
    public static void a() {
        androidx.core.util.h.j(b(), "Not in application's main thread");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
