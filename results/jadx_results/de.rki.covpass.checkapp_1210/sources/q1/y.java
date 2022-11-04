package q1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
class y {

    /* renamed from: a */
    private static boolean f19485a = true;

    public static x a(ViewGroup viewGroup) {
        return new w(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f19485a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f19485a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            b(viewGroup, z10);
        }
    }
}
