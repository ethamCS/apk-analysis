package androidx.navigation;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class t {
    public static NavController a(Activity activity, int i) {
        NavController c2 = c(androidx.core.app.a.j(activity, i));
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    public static NavController b(View view) {
        NavController c2 = c(view);
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private static NavController c(View view) {
        while (view != null) {
            NavController d2 = d(view);
            if (d2 != null) {
                return d2;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private static NavController d(View view) {
        Object tag = view.getTag(w.a_res_0x7f09012a);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof NavController)) {
            return null;
        }
        return (NavController) tag;
    }

    public static void e(View view, NavController navController) {
        view.setTag(w.a_res_0x7f09012a, navController);
    }
}
