package t5;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.o;
/* loaded from: classes.dex */
public class h {
    public static d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new e() : new j();
    }

    public static d b() {
        return new j();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).Y(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.Q()) {
            gVar.c0(o.d(view));
        }
    }
}
