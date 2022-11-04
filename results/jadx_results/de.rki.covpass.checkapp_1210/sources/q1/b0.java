package q1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a */
    private static final h0 f19337a;

    /* renamed from: b */
    static final Property<View, Float> f19338b;

    /* renamed from: c */
    static final Property<View, Rect> f19339c;

    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(b0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            b0.g(view, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return androidx.core.view.y.u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            androidx.core.view.y.v0(view, rect);
        }
    }

    static {
        f19337a = Build.VERSION.SDK_INT >= 29 ? new g0() : new f0();
        f19338b = new a(Float.class, "translationAlpha");
        f19339c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f19337a.a(view);
    }

    public static a0 b(View view) {
        return new z(view);
    }

    public static float c(View view) {
        return f19337a.b(view);
    }

    public static l0 d(View view) {
        return new k0(view);
    }

    public static void e(View view) {
        f19337a.c(view);
    }

    public static void f(View view, int i10, int i11, int i12, int i13) {
        f19337a.d(view, i10, i11, i12, i13);
    }

    public static void g(View view, float f10) {
        f19337a.e(view, f10);
    }

    public static void h(View view, int i10) {
        f19337a.f(view, i10);
    }

    public static void i(View view, Matrix matrix) {
        f19337a.g(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f19337a.h(view, matrix);
    }
}
