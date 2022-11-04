package o7;

import android.os.Looper;
/* loaded from: classes.dex */
public class s {
    public static void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
