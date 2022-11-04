package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private final ImageView f714a;

    /* renamed from: b */
    private u0 f715b;

    /* renamed from: c */
    private u0 f716c;
    private u0 d;

    public n(ImageView imageView) {
        this.f714a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new u0();
        }
        u0 u0Var = this.d;
        u0Var.a();
        ColorStateList a2 = androidx.core.widget.e.a(this.f714a);
        if (a2 != null) {
            u0Var.d = true;
            u0Var.f751a = a2;
        }
        PorterDuff.Mode b2 = androidx.core.widget.e.b(this.f714a);
        if (b2 != null) {
            u0Var.f753c = true;
            u0Var.f752b = b2;
        }
        if (u0Var.d || u0Var.f753c) {
            j.a(drawable, u0Var, this.f714a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f715b != null : i == 21;
    }

    public void a() {
        Drawable drawable = this.f714a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f716c;
            if (u0Var != null) {
                j.a(drawable, u0Var, this.f714a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f715b;
            if (u0Var2 == null) {
                return;
            }
            j.a(drawable, u0Var2, this.f714a.getDrawableState());
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable c2 = a.a.k.a.a.c(this.f714a.getContext(), i);
            if (c2 != null) {
                e0.b(c2);
            }
            this.f714a.setImageDrawable(c2);
        } else {
            this.f714a.setImageDrawable(null);
        }
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (this.f716c == null) {
            this.f716c = new u0();
        }
        u0 u0Var = this.f716c;
        u0Var.f751a = colorStateList;
        u0Var.d = true;
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.f716c == null) {
            this.f716c = new u0();
        }
        u0 u0Var = this.f716c;
        u0Var.f752b = mode;
        u0Var.f753c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int g;
        w0 a2 = w0.a(this.f714a.getContext(), attributeSet, a.a.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f714a.getDrawable();
            if (drawable == null && (g = a2.g(a.a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = a.a.k.a.a.c(this.f714a.getContext(), g)) != null) {
                this.f714a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (a2.g(a.a.j.AppCompatImageView_tint)) {
                androidx.core.widget.e.a(this.f714a, a2.a(a.a.j.AppCompatImageView_tint));
            }
            if (a2.g(a.a.j.AppCompatImageView_tintMode)) {
                androidx.core.widget.e.a(this.f714a, e0.a(a2.d(a.a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    public ColorStateList b() {
        u0 u0Var = this.f716c;
        if (u0Var != null) {
            return u0Var.f751a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        u0 u0Var = this.f716c;
        if (u0Var != null) {
            return u0Var.f752b;
        }
        return null;
    }

    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f714a.getBackground() instanceof RippleDrawable);
    }
}
