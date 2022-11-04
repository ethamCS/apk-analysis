package a.g.l;

import android.os.Build;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    private final Object f255a;

    private c0(Object obj) {
        this.f255a = obj;
    }

    public static c0 a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c0(obj);
    }

    public static Object a(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var.f255a;
    }

    public c0 a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f255a).consumeSystemWindowInsets());
        }
        return null;
    }

    public c0 a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f255a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f255a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f255a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f255a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f255a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f255a;
        Object obj3 = ((c0) obj).f255a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public boolean f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f255a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f255a).isConsumed();
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f255a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
