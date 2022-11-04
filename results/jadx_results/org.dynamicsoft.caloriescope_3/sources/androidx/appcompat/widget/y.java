package androidx.appcompat.widget;

import a.g.d.c.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a */
    private final TextView f780a;

    /* renamed from: b */
    private u0 f781b;

    /* renamed from: c */
    private u0 f782c;
    private u0 d;
    private u0 e;
    private u0 f;
    private u0 g;
    private u0 h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* loaded from: classes.dex */
    public static class a extends f.a {

        /* renamed from: a */
        private final WeakReference<y> f783a;

        /* renamed from: b */
        private final int f784b;

        /* renamed from: c */
        private final int f785c;

        /* renamed from: androidx.appcompat.widget.y$a$a */
        /* loaded from: classes.dex */
        private class RunnableC0035a implements Runnable {

            /* renamed from: b */
            private final WeakReference<y> f786b;

            /* renamed from: c */
            private final Typeface f787c;

            RunnableC0035a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f786b = weakReference;
                this.f787c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                y yVar = this.f786b.get();
                if (yVar == null) {
                    return;
                }
                yVar.a(this.f787c);
            }
        }

        a(y yVar, int i, int i2) {
            this.f783a = new WeakReference<>(yVar);
            this.f784b = i;
            this.f785c = i2;
        }

        @Override // a.g.d.c.f.a
        public void a(int i) {
        }

        @Override // a.g.d.c.f.a
        public void a(Typeface typeface) {
            int i;
            y yVar = this.f783a.get();
            if (yVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f784b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f785c & 2) != 0);
            }
            yVar.a(new RunnableC0035a(this, this.f783a, typeface));
        }
    }

    public y(TextView textView) {
        this.f780a = textView;
        this.i = new a0(this.f780a);
    }

    private static u0 a(Context context, j jVar, int i) {
        ColorStateList b2 = jVar.b(context, i);
        if (b2 != null) {
            u0 u0Var = new u0();
            u0Var.d = true;
            u0Var.f751a = b2;
            return u0Var;
        }
        return null;
    }

    private void a(Context context, w0 w0Var) {
        String d;
        Typeface typeface;
        Typeface typeface2;
        this.j = w0Var.d(a.a.j.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int d2 = w0Var.d(a.a.j.TextAppearance_android_textFontWeight, -1);
            this.k = d2;
            if (d2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!w0Var.g(a.a.j.TextAppearance_android_fontFamily) && !w0Var.g(a.a.j.TextAppearance_fontFamily)) {
            if (!w0Var.g(a.a.j.TextAppearance_android_typeface)) {
                return;
            }
            this.m = false;
            int d3 = w0Var.d(a.a.j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (d3 != 3) {
                return;
            } else {
                typeface2 = Typeface.MONOSPACE;
            }
            this.l = typeface2;
            return;
        }
        this.l = null;
        int i = w0Var.g(a.a.j.TextAppearance_fontFamily) ? a.a.j.TextAppearance_fontFamily : a.a.j.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface a2 = w0Var.a(i, this.j, new a(this, i2, i3));
                if (a2 != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        a2 = Typeface.create(Typeface.create(a2, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = a2;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (d = w0Var.d(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typeface = Typeface.create(d, this.j);
        } else {
            Typeface create = Typeface.create(d, 0);
            int i4 = this.k;
            if ((this.j & 2) != 0) {
                z = true;
            }
            typeface = Typeface.create(create, i4, z);
        }
        this.l = typeface;
    }

    private void a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f780a.getCompoundDrawablesRelative();
            TextView textView = this.f780a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f780a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f780a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f780a.getCompoundDrawables();
            TextView textView3 = this.f780a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.a(drawable, u0Var, this.f780a.getDrawableState());
    }

    private void b(int i, float f) {
        this.i.a(i, f);
    }

    private void l() {
        u0 u0Var = this.h;
        this.f781b = u0Var;
        this.f782c = u0Var;
        this.d = u0Var;
        this.e = u0Var;
        this.f = u0Var;
        this.g = u0Var;
    }

    public void a() {
        if (this.f781b != null || this.f782c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.f780a.getCompoundDrawables();
            a(compoundDrawables[0], this.f781b);
            a(compoundDrawables[1], this.f782c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f780a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public void a(int i) {
        this.i.b(i);
    }

    public void a(int i, float f) {
        if (androidx.core.widget.b.f865a || j()) {
            return;
        }
        b(i, f);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.i.a(i, i2, i3, i4);
    }

    public void a(Context context, int i) {
        String d;
        ColorStateList a2;
        w0 a3 = w0.a(context, i, a.a.j.TextAppearance);
        if (a3.g(a.a.j.TextAppearance_textAllCaps)) {
            a(a3.a(a.a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a3.g(a.a.j.TextAppearance_android_textColor) && (a2 = a3.a(a.a.j.TextAppearance_android_textColor)) != null) {
            this.f780a.setTextColor(a2);
        }
        if (a3.g(a.a.j.TextAppearance_android_textSize) && a3.c(a.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.f780a.setTextSize(0, 0.0f);
        }
        a(context, a3);
        if (Build.VERSION.SDK_INT >= 26 && a3.g(a.a.j.TextAppearance_fontVariationSettings) && (d = a3.d(a.a.j.TextAppearance_fontVariationSettings)) != null) {
            this.f780a.setFontVariationSettings(d);
        }
        a3.a();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f780a.setTypeface(typeface, this.j);
        }
    }

    public void a(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f751a = colorStateList;
        u0Var.d = colorStateList != null;
        l();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f752b = mode;
        u0Var.f753c = mode != null;
        l();
    }

    public void a(Typeface typeface) {
        if (this.m) {
            this.f780a.setTypeface(typeface);
            this.l = typeface;
        }
    }

    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        j jVar;
        int i2;
        Context context = this.f780a.getContext();
        j b2 = j.b();
        w0 a2 = w0.a(context, attributeSet, a.a.j.AppCompatTextHelper, i, 0);
        int g = a2.g(a.a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.g(a.a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f781b = a(context, b2, a2.g(a.a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.g(a.a.j.AppCompatTextHelper_android_drawableTop)) {
            this.f782c = a(context, b2, a2.g(a.a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.g(a.a.j.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, b2, a2.g(a.a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.g(a.a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, b2, a2.g(a.a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.g(a.a.j.AppCompatTextHelper_android_drawableStart)) {
                this.f = a(context, b2, a2.g(a.a.j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.g(a.a.j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = a(context, b2, a2.g(a.a.j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.a();
        boolean z3 = this.f780a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            w0 a3 = w0.a(context, g, a.a.j.TextAppearance);
            if (z3 || !a3.g(a.a.j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = a3.a(a.a.j.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = a3.g(a.a.j.TextAppearance_android_textColor) ? a3.a(a.a.j.TextAppearance_android_textColor) : null;
                colorStateList3 = a3.g(a.a.j.TextAppearance_android_textColorHint) ? a3.a(a.a.j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = a3.g(a.a.j.TextAppearance_android_textColorLink) ? a3.a(a.a.j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str2 = a3.g(a.a.j.TextAppearance_textLocale) ? a3.d(a.a.j.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !a3.g(a.a.j.TextAppearance_fontVariationSettings)) ? null : a3.d(a.a.j.TextAppearance_fontVariationSettings);
            a3.a();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            colorStateList2 = null;
            z2 = false;
            z = false;
            colorStateList = null;
        }
        w0 a4 = w0.a(context, attributeSet, a.a.j.TextAppearance, i, 0);
        if (!z3 && a4.g(a.a.j.TextAppearance_textAllCaps)) {
            z2 = a4.a(a.a.j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.g(a.a.j.TextAppearance_android_textColor)) {
                colorStateList = a4.a(a.a.j.TextAppearance_android_textColor);
            }
            if (a4.g(a.a.j.TextAppearance_android_textColorHint)) {
                colorStateList3 = a4.a(a.a.j.TextAppearance_android_textColorHint);
            }
            if (a4.g(a.a.j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.a(a.a.j.TextAppearance_android_textColorLink);
            }
        }
        if (a4.g(a.a.j.TextAppearance_textLocale)) {
            str2 = a4.d(a.a.j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && a4.g(a.a.j.TextAppearance_fontVariationSettings)) {
            str = a4.d(a.a.j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT < 28 || !a4.g(a.a.j.TextAppearance_android_textSize) || a4.c(a.a.j.TextAppearance_android_textSize, -1) != 0) {
            jVar = b2;
        } else {
            jVar = b2;
            this.f780a.setTextSize(0, 0.0f);
        }
        a(context, a4);
        a4.a();
        if (colorStateList != null) {
            this.f780a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.f780a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f780a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            a(z2);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f780a.setTypeface(typeface, this.j);
            } else {
                this.f780a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f780a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                this.f780a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i3 >= 21) {
                this.f780a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.i.a(attributeSet, i);
        if (androidx.core.widget.b.f865a && this.i.f() != 0) {
            int[] e = this.i.e();
            if (e.length > 0) {
                if (this.f780a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f780a.setAutoSizeTextTypeUniformWithConfiguration(this.i.c(), this.i.b(), this.i.d(), 0);
                } else {
                    this.f780a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        w0 a5 = w0.a(context, attributeSet, a.a.j.AppCompatTextView);
        int g2 = a5.g(a.a.j.AppCompatTextView_drawableLeftCompat, -1);
        j jVar2 = jVar;
        Drawable a6 = g2 != -1 ? jVar2.a(context, g2) : null;
        int g3 = a5.g(a.a.j.AppCompatTextView_drawableTopCompat, -1);
        Drawable a7 = g3 != -1 ? jVar2.a(context, g3) : null;
        int g4 = a5.g(a.a.j.AppCompatTextView_drawableRightCompat, -1);
        Drawable a8 = g4 != -1 ? jVar2.a(context, g4) : null;
        int g5 = a5.g(a.a.j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable a9 = g5 != -1 ? jVar2.a(context, g5) : null;
        int g6 = a5.g(a.a.j.AppCompatTextView_drawableStartCompat, -1);
        Drawable a10 = g6 != -1 ? jVar2.a(context, g6) : null;
        int g7 = a5.g(a.a.j.AppCompatTextView_drawableEndCompat, -1);
        a(a6, a7, a8, a9, a10, g7 != -1 ? jVar2.a(context, g7) : null);
        if (a5.g(a.a.j.AppCompatTextView_drawableTint)) {
            androidx.core.widget.i.a(this.f780a, a5.a(a.a.j.AppCompatTextView_drawableTint));
        }
        if (a5.g(a.a.j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            androidx.core.widget.i.a(this.f780a, e0.a(a5.d(a.a.j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i2 = -1;
        }
        int c2 = a5.c(a.a.j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int c3 = a5.c(a.a.j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int c4 = a5.c(a.a.j.AppCompatTextView_lineHeight, i2);
        a5.a();
        if (c2 != i2) {
            androidx.core.widget.i.a(this.f780a, c2);
        }
        if (c3 != i2) {
            androidx.core.widget.i.b(this.f780a, c3);
        }
        if (c4 != i2) {
            androidx.core.widget.i.c(this.f780a, c4);
        }
    }

    public void a(Runnable runnable) {
        this.f780a.post(runnable);
    }

    public void a(boolean z) {
        this.f780a.setAllCaps(z);
    }

    public void a(boolean z, int i, int i2, int i3, int i4) {
        if (!androidx.core.widget.b.f865a) {
            b();
        }
    }

    public void a(int[] iArr, int i) {
        this.i.a(iArr, i);
    }

    public void b() {
        this.i.a();
    }

    public int c() {
        return this.i.b();
    }

    public int d() {
        return this.i.c();
    }

    public int e() {
        return this.i.d();
    }

    public int[] f() {
        return this.i.e();
    }

    public int g() {
        return this.i.f();
    }

    public ColorStateList h() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f751a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f752b;
        }
        return null;
    }

    public boolean j() {
        return this.i.g();
    }

    public void k() {
        a();
    }
}
