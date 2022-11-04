package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final View f666a;
    private u0 d;
    private u0 e;
    private u0 f;

    /* renamed from: c */
    private int f668c = -1;

    /* renamed from: b */
    private final j f667b = j.b();

    public e(View view) {
        this.f666a = view;
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new u0();
        }
        u0 u0Var = this.f;
        u0Var.a();
        ColorStateList g = a.g.l.u.g(this.f666a);
        if (g != null) {
            u0Var.d = true;
            u0Var.f751a = g;
        }
        PorterDuff.Mode h = a.g.l.u.h(this.f666a);
        if (h != null) {
            u0Var.f753c = true;
            u0Var.f752b = h;
        }
        if (u0Var.d || u0Var.f753c) {
            j.a(drawable, u0Var, this.f666a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    public void a() {
        Drawable background = this.f666a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            u0 u0Var = this.e;
            if (u0Var != null) {
                j.a(background, u0Var, this.f666a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.d;
            if (u0Var2 == null) {
                return;
            }
            j.a(background, u0Var2, this.f666a.getDrawableState());
        }
    }

    public void a(int i) {
        this.f668c = i;
        j jVar = this.f667b;
        a(jVar != null ? jVar.b(this.f666a.getContext(), i) : null);
        a();
    }

    void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new u0();
            }
            u0 u0Var = this.d;
            u0Var.f751a = colorStateList;
            u0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.f752b = mode;
        u0Var.f753c = true;
        a();
    }

    public void a(Drawable drawable) {
        this.f668c = -1;
        a((ColorStateList) null);
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        w0 a2 = w0.a(this.f666a.getContext(), attributeSet, a.a.j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.g(a.a.j.ViewBackgroundHelper_android_background)) {
                this.f668c = a2.g(a.a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f667b.b(this.f666a.getContext(), this.f668c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.g(a.a.j.ViewBackgroundHelper_backgroundTint)) {
                a.g.l.u.a(this.f666a, a2.a(a.a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(a.a.j.ViewBackgroundHelper_backgroundTintMode)) {
                a.g.l.u.a(this.f666a, e0.a(a2.d(a.a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    public ColorStateList b() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.f751a;
        }
        return null;
    }

    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.f751a = colorStateList;
        u0Var.d = true;
        a();
    }

    public PorterDuff.Mode c() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.f752b;
        }
        return null;
    }
}
