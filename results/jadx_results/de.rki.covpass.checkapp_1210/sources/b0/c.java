package b0;

import android.os.Build;
import w.k0;
import w.o0;
import w.x1;
/* loaded from: classes.dex */
public final class c implements x1 {
    private static boolean a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        return b() || a();
    }

    public boolean c(o0.a<?> aVar) {
        return aVar != k0.f24491h;
    }
}
