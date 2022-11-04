package d.a.a.a.a0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.p;
/* loaded from: classes.dex */
public class h {
    public static d a(int i) {
        return i != 0 ? i != 1 ? b() : new e() : new j();
    }

    public static d b() {
        return new j();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).U(f2);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.O()) {
            gVar.Y(p.c(view));
        }
    }
}
