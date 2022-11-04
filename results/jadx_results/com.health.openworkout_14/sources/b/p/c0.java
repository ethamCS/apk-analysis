package b.p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    private static final i0 f2702a;

    /* renamed from: b */
    static final Property<View, Float> f2703b;

    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f2) {
            c0.g(view, f2.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return b.g.l.t.r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            b.g.l.t.o0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f2702a = i >= 29 ? new h0() : i >= 23 ? new g0() : i >= 22 ? new f0() : i >= 21 ? new e0() : i >= 19 ? new d0() : new i0();
        f2703b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f2702a.a(view);
    }

    public static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.e(view);
    }

    public static float c(View view) {
        return f2702a.c(view);
    }

    public static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    public static void e(View view) {
        f2702a.d(view);
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        f2702a.e(view, i, i2, i3, i4);
    }

    public static void g(View view, float f2) {
        f2702a.f(view, f2);
    }

    public static void h(View view, int i) {
        f2702a.g(view, i);
    }

    public static void i(View view, Matrix matrix) {
        f2702a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f2702a.i(view, matrix);
    }
}
