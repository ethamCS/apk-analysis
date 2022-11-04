package androidx.appcompat.widget;

import android.content.Context;
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
    private final ImageView f572a;

    /* renamed from: b */
    private u0 f573b;

    /* renamed from: c */
    private u0 f574c;

    /* renamed from: d */
    private u0 f575d;

    public n(ImageView imageView) {
        this.f572a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f575d == null) {
            this.f575d = new u0();
        }
        u0 u0Var = this.f575d;
        u0Var.a();
        ColorStateList a2 = androidx.core.widget.e.a(this.f572a);
        if (a2 != null) {
            u0Var.f636d = true;
            u0Var.f633a = a2;
        }
        PorterDuff.Mode b2 = androidx.core.widget.e.b(this.f572a);
        if (b2 != null) {
            u0Var.f635c = true;
            u0Var.f634b = b2;
        }
        if (u0Var.f636d || u0Var.f635c) {
            j.i(drawable, u0Var, this.f572a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f573b != null : i == 21;
    }

    public void b() {
        Drawable drawable = this.f572a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f574c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.f572a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f573b;
            if (u0Var2 == null) {
                return;
            }
            j.i(drawable, u0Var2, this.f572a.getDrawableState());
        }
    }

    public ColorStateList c() {
        u0 u0Var = this.f574c;
        if (u0Var != null) {
            return u0Var.f633a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        u0 u0Var = this.f574c;
        if (u0Var != null) {
            return u0Var.f634b;
        }
        return null;
    }

    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f572a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f572a.getContext();
        int[] iArr = b.a.j.M;
        w0 v = w0.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f572a;
        b.g.l.t.g0(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable = this.f572a.getDrawable();
            if (drawable == null && (n = v.n(b.a.j.N, -1)) != -1 && (drawable = b.a.k.a.a.d(this.f572a.getContext(), n)) != null) {
                this.f572a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i2 = b.a.j.O;
            if (v.s(i2)) {
                androidx.core.widget.e.c(this.f572a, v.c(i2));
            }
            int i3 = b.a.j.P;
            if (v.s(i3)) {
                androidx.core.widget.e.d(this.f572a, e0.e(v.k(i3, -1), null));
            }
        } finally {
            v.w();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d2 = b.a.k.a.a.d(this.f572a.getContext(), i);
            if (d2 != null) {
                e0.b(d2);
            }
            this.f572a.setImageDrawable(d2);
        } else {
            this.f572a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f574c == null) {
            this.f574c = new u0();
        }
        u0 u0Var = this.f574c;
        u0Var.f633a = colorStateList;
        u0Var.f636d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f574c == null) {
            this.f574c = new u0();
        }
        u0 u0Var = this.f574c;
        u0Var.f634b = mode;
        u0Var.f635c = true;
        b();
    }
}
