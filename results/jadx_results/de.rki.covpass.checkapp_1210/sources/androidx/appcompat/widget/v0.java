package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1549a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1550b = {-16842910};

    /* renamed from: c */
    static final int[] f1551c = {16842908};

    /* renamed from: d */
    static final int[] f1552d = {16843518};

    /* renamed from: e */
    static final int[] f1553e = {16842919};

    /* renamed from: f */
    static final int[] f1554f = {16842912};

    /* renamed from: g */
    static final int[] f1555g = {16842913};

    /* renamed from: h */
    static final int[] f1556h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1557i = new int[0];

    /* renamed from: j */
    private static final int[] f1558j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.j.f9330y0);
        try {
            if (!obtainStyledAttributes.hasValue(e.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList e10 = e(context, i10);
        if (e10 == null || !e10.isStateful()) {
            TypedValue f10 = f();
            context.getTheme().resolveAttribute(16842803, f10, true);
            return d(context, i10, f10.getFloat());
        }
        return e10.getColorForState(f1550b, e10.getDefaultColor());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1558j;
        iArr[0] = i10;
        a1 u10 = a1.u(context, null, iArr);
        try {
            return u10.b(0, 0);
        } finally {
            u10.w();
        }
    }

    static int d(Context context, int i10, float f10) {
        int c10 = c(context, i10);
        return androidx.core.graphics.a.j(c10, Math.round(Color.alpha(c10) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f1558j;
        iArr[0] = i10;
        a1 u10 = a1.u(context, null, iArr);
        try {
            return u10.c(0);
        } finally {
            u10.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f1549a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
