package b.a.a.a.b0;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes.dex */
public class h {
    public static d a() {
        return new j();
    }

    public static d a(int i) {
        return i != 0 ? i != 1 ? a() : new e() : new j();
    }

    public static void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            a(view, (g) background);
        }
    }

    public static void a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).b(f);
        }
    }

    public static void a(View view, g gVar) {
        if (gVar.q()) {
            gVar.d(com.google.android.material.internal.n.a(view));
        }
    }

    public static f b() {
        return new f();
    }
}
