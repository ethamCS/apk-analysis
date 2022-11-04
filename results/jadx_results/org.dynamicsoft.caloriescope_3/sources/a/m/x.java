package a.m;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
class x {

    /* renamed from: a */
    private static boolean f397a = true;

    public static w a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new v(viewGroup) : u.a(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z) {
        if (f397a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f397a = false;
            }
        }
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            a(viewGroup, z);
        } else {
            y.a(viewGroup, z);
        }
    }
}
