package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f741a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f742b = {-16842910};

    /* renamed from: c */
    static final int[] f743c = {16842908};
    static final int[] d = {16842919};
    static final int[] e = {16842912};
    static final int[] f = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList c2 = c(context, i);
        if (c2 == null || !c2.isStateful()) {
            TypedValue a2 = a();
            context.getTheme().resolveAttribute(16842803, a2, true);
            return a(context, i, a2.getFloat());
        }
        return c2.getColorForState(f742b, c2.getDefaultColor());
    }

    static int a(Context context, int i, float f2) {
        int b2 = b(context, i);
        return a.g.e.a.c(b2, Math.round(Color.alpha(b2) * f2));
    }

    private static TypedValue a() {
        TypedValue typedValue = f741a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f741a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 a2 = w0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 a2 = w0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0);
        } finally {
            a2.a();
        }
    }
}
