package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private final ImageView f1443a;

    /* renamed from: b */
    private y0 f1444b;

    /* renamed from: c */
    private y0 f1445c;

    /* renamed from: d */
    private y0 f1446d;

    /* renamed from: e */
    private int f1447e = 0;

    public p(ImageView imageView) {
        this.f1443a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1446d == null) {
            this.f1446d = new y0();
        }
        y0 y0Var = this.f1446d;
        y0Var.a();
        ColorStateList a10 = androidx.core.widget.f.a(this.f1443a);
        if (a10 != null) {
            y0Var.f1573d = true;
            y0Var.f1570a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.f.b(this.f1443a);
        if (b10 != null) {
            y0Var.f1572c = true;
            y0Var.f1571b = b10;
        }
        if (y0Var.f1573d || y0Var.f1572c) {
            j.i(drawable, y0Var, this.f1443a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean l() {
        return this.f1444b != null;
    }

    public void b() {
        if (this.f1443a.getDrawable() != null) {
            this.f1443a.getDrawable().setLevel(this.f1447e);
        }
    }

    public void c() {
        Drawable drawable = this.f1443a.getDrawable();
        if (drawable != null) {
            h0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            y0 y0Var = this.f1445c;
            if (y0Var != null) {
                j.i(drawable, y0Var, this.f1443a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f1444b;
            if (y0Var2 == null) {
                return;
            }
            j.i(drawable, y0Var2, this.f1443a.getDrawableState());
        }
    }

    public ColorStateList d() {
        y0 y0Var = this.f1445c;
        if (y0Var != null) {
            return y0Var.f1570a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        y0 y0Var = this.f1445c;
        if (y0Var != null) {
            return y0Var.f1571b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f1443a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1443a.getContext();
        int[] iArr = e.j.P;
        a1 v10 = a1.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1443a;
        androidx.core.view.y.m0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1443a.getDrawable();
            if (drawable == null && (n10 = v10.n(e.j.Q, -1)) != -1 && (drawable = g.a.b(this.f1443a.getContext(), n10)) != null) {
                this.f1443a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h0.b(drawable);
            }
            int i11 = e.j.R;
            if (v10.s(i11)) {
                androidx.core.widget.f.c(this.f1443a, v10.c(i11));
            }
            int i12 = e.j.S;
            if (v10.s(i12)) {
                androidx.core.widget.f.d(this.f1443a, h0.e(v10.k(i12, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    public void h(Drawable drawable) {
        this.f1447e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = g.a.b(this.f1443a.getContext(), i10);
            if (b10 != null) {
                h0.b(b10);
            }
            this.f1443a.setImageDrawable(b10);
        } else {
            this.f1443a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f1445c == null) {
            this.f1445c = new y0();
        }
        y0 y0Var = this.f1445c;
        y0Var.f1570a = colorStateList;
        y0Var.f1573d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f1445c == null) {
            this.f1445c = new y0();
        }
        y0 y0Var = this.f1445c;
        y0Var.f1571b = mode;
        y0Var.f1572c = true;
        c();
    }
}
