package a.a.k.a;

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
    private static final ThreadLocal<TypedValue> f0a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0000a>> f1b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2c = new Object();

    /* renamed from: a.a.k.a.a$a */
    /* loaded from: classes.dex */
    public static class C0000a {

        /* renamed from: a */
        final ColorStateList f3a;

        /* renamed from: b */
        final Configuration f4b;

        C0000a(ColorStateList colorStateList, Configuration configuration) {
            this.f3a = colorStateList;
            this.f4b = configuration;
        }
    }

    private static ColorStateList a(Context context, int i) {
        C0000a c0000a;
        synchronized (f2c) {
            SparseArray<C0000a> sparseArray = f1b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0000a = sparseArray.get(i)) != null) {
                if (c0000a.f4b.equals(context.getResources().getConfiguration())) {
                    return c0000a.f3a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static TypedValue a() {
        TypedValue typedValue = f0a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f0a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2c) {
            SparseArray<C0000a> sparseArray = f1b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f1b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0000a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a2 = a(context, i);
        if (a2 != null) {
            return a2;
        }
        ColorStateList d = d(context, i);
        if (d == null) {
            return a.g.d.a.b(context, i);
        }
        a(context, i, d);
        return d;
    }

    public static Drawable c(Context context, int i) {
        return m0.a().a(context, i);
    }

    private static ColorStateList d(Context context, int i) {
        if (e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return a.g.d.c.a.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a2 = a();
        resources.getValue(i, a2, true);
        int i2 = a2.type;
        return i2 >= 28 && i2 <= 31;
    }
}
