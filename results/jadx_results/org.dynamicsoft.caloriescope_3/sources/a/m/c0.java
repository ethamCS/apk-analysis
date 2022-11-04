package a.m;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    private static final i0 f340a;

    /* renamed from: b */
    static final Property<View, Float> f341b;

    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            c0.a(view, f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return a.g.l.u.i(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            a.g.l.u.a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f340a = i >= 29 ? new h0() : i >= 23 ? new g0() : i >= 22 ? new f0() : i >= 21 ? new e0() : i >= 19 ? new d0() : new i0();
        f341b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f340a.a(view);
    }

    public static void a(View view, float f) {
        f340a.a(view, f);
    }

    public static void a(View view, int i) {
        f340a.a(view, i);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f340a.a(view, i, i2, i3, i4);
    }

    public static void a(View view, Matrix matrix) {
        f340a.a(view, matrix);
    }

    public static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.c(view);
    }

    public static void b(View view, Matrix matrix) {
        f340a.b(view, matrix);
    }

    public static float c(View view) {
        return f340a.b(view);
    }

    public static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    public static void e(View view) {
        f340a.c(view);
    }
}
