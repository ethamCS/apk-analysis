package ye;

import hc.t;
/* loaded from: classes3.dex */
public final class c {
    public static final boolean a(Throwable th2) {
        t.e(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!t.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th2) {
        t.e(th2, "e");
        throw th2;
    }
}
