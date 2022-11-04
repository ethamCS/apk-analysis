package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
/* loaded from: classes.dex */
final class m {
    private static boolean k;
    private static Constructor<StaticLayout> l;
    private static Object m;

    /* renamed from: a */
    private CharSequence f3216a;

    /* renamed from: b */
    private final TextPaint f3217b;

    /* renamed from: c */
    private final int f3218c;

    /* renamed from: e */
    private int f3220e;
    private boolean i;

    /* renamed from: d */
    private int f3219d = 0;

    /* renamed from: f */
    private Layout.Alignment f3221f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f3222g = Integer.MAX_VALUE;

    /* renamed from: h */
    private boolean f3223h = true;
    private TextUtils.TruncateAt j = null;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private m(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f3216a = charSequence;
        this.f3217b = textPaint;
        this.f3218c = i;
        this.f3220e = charSequence.length();
    }

    private void b() {
        Class<?> cls;
        int i = Build.VERSION.SDK_INT;
        if (k) {
            return;
        }
        try {
            boolean z = this.i && i >= 23;
            if (i >= 18) {
                cls = TextDirectionHeuristic.class;
                m = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = m.class.getClassLoader();
                String str = this.i ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                m = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            l = declaredConstructor;
            declaredConstructor.setAccessible(true);
            k = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public static m c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new m(charSequence, textPaint, i);
    }

    public StaticLayout a() {
        if (this.f3216a == null) {
            this.f3216a = "";
        }
        int max = Math.max(0, this.f3218c);
        CharSequence charSequence = this.f3216a;
        if (this.f3222g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f3217b, max, this.j);
        }
        int min = Math.min(charSequence.length(), this.f3220e);
        this.f3220e = min;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                Constructor<StaticLayout> constructor = l;
                b.g.k.h.c(constructor);
                Object obj = m;
                b.g.k.h.c(obj);
                return constructor.newInstance(charSequence, Integer.valueOf(this.f3219d), Integer.valueOf(this.f3220e), this.f3217b, Integer.valueOf(max), this.f3221f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f3223h), null, Integer.valueOf(max), Integer.valueOf(this.f3222g));
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        if (this.i) {
            this.f3221f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f3219d, min, this.f3217b, max);
        obtain.setAlignment(this.f3221f);
        obtain.setIncludePad(this.f3223h);
        obtain.setTextDirection(this.i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.j;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f3222g);
        return obtain.build();
    }

    public m d(Layout.Alignment alignment) {
        this.f3221f = alignment;
        return this;
    }

    public m e(TextUtils.TruncateAt truncateAt) {
        this.j = truncateAt;
        return this;
    }

    public m f(boolean z) {
        this.f3223h = z;
        return this;
    }

    public m g(boolean z) {
        this.i = z;
        return this;
    }

    public m h(int i) {
        this.f3222g = i;
        return this;
    }
}
