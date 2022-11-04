package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f617a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f618b = {-16842910};

    /* renamed from: c */
    static final int[] f619c = {16842908};

    /* renamed from: d */
    static final int[] f620d = {16842919};

    /* renamed from: e */
    static final int[] f621e = {16842912};

    /* renamed from: f */
    static final int[] f622f = new int[0];

    /* renamed from: g */
    private static final int[] f623g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.a.j.u0);
        try {
            if (!obtainStyledAttributes.hasValue(b.a.j.z0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList e2 = e(context, i);
        if (e2 == null || !e2.isStateful()) {
            TypedValue f2 = f();
            context.getTheme().resolveAttribute(16842803, f2, true);
            return d(context, i, f2.getFloat());
        }
        return e2.getColorForState(f618b, e2.getDefaultColor());
    }

    public static int c(Context context, int i) {
        int[] iArr = f623g;
        iArr[0] = i;
        w0 u = w0.u(context, null, iArr);
        try {
            return u.b(0, 0);
        } finally {
            u.w();
        }
    }

    static int d(Context context, int i, float f2) {
        int c2 = c(context, i);
        return b.g.e.a.d(c2, Math.round(Color.alpha(c2) * f2));
    }

    public static ColorStateList e(Context context, int i) {
        int[] iArr = f623g;
        iArr[0] = i;
        w0 u = w0.u(context, null, iArr);
        try {
            return u.c(0);
        } finally {
            u.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f617a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
