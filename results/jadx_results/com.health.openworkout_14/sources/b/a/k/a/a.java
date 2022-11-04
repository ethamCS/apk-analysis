package b.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import java.util.WeakHashMap;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1998a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0035a>> f1999b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2000c = new Object();

    /* renamed from: b.a.k.a.a$a */
    /* loaded from: classes.dex */
    public static class C0035a {

        /* renamed from: a */
        final ColorStateList f2001a;

        /* renamed from: b */
        final Configuration f2002b;

        C0035a(ColorStateList colorStateList, Configuration configuration) {
            this.f2001a = colorStateList;
            this.f2002b = configuration;
        }
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2000c) {
            WeakHashMap<Context, SparseArray<C0035a>> weakHashMap = f1999b;
            SparseArray<C0035a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i, new C0035a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i) {
        C0035a c0035a;
        synchronized (f2000c) {
            SparseArray<C0035a> sparseArray = f1999b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0035a = sparseArray.get(i)) != null) {
                if (c0035a.f2002b.equals(context.getResources().getConfiguration())) {
                    return c0035a.f2001a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b2 = b(context, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList f2 = f(context, i);
        if (f2 == null) {
            return b.g.d.a.c(context, i);
        }
        a(context, i, f2);
        return f2;
    }

    public static Drawable d(Context context, int i) {
        return m0.h().j(context, i);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f1998a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList f(Context context, int i) {
        if (g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return b.g.d.c.a.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e2 = e();
        resources.getValue(i, e2, true);
        int i2 = e2.type;
        return i2 >= 28 && i2 <= 31;
    }
}
