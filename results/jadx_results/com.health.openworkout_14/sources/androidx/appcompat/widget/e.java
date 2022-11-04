package androidx.appcompat.widget;

import android.content.Context;
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
    private final View f487a;

    /* renamed from: d */
    private u0 f490d;

    /* renamed from: e */
    private u0 f491e;

    /* renamed from: f */
    private u0 f492f;

    /* renamed from: c */
    private int f489c = -1;

    /* renamed from: b */
    private final j f488b = j.b();

    public e(View view) {
        this.f487a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f492f == null) {
            this.f492f = new u0();
        }
        u0 u0Var = this.f492f;
        u0Var.a();
        ColorStateList p = b.g.l.t.p(this.f487a);
        if (p != null) {
            u0Var.f636d = true;
            u0Var.f633a = p;
        }
        PorterDuff.Mode q = b.g.l.t.q(this.f487a);
        if (q != null) {
            u0Var.f635c = true;
            u0Var.f634b = q;
        }
        if (u0Var.f636d || u0Var.f635c) {
            j.i(drawable, u0Var, this.f487a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f490d != null : i == 21;
    }

    public void b() {
        Drawable background = this.f487a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            u0 u0Var = this.f491e;
            if (u0Var != null) {
                j.i(background, u0Var, this.f487a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f490d;
            if (u0Var2 == null) {
                return;
            }
            j.i(background, u0Var2, this.f487a.getDrawableState());
        }
    }

    public ColorStateList c() {
        u0 u0Var = this.f491e;
        if (u0Var != null) {
            return u0Var.f633a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        u0 u0Var = this.f491e;
        if (u0Var != null) {
            return u0Var.f634b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        Context context = this.f487a.getContext();
        int[] iArr = b.a.j.M3;
        w0 v = w0.v(context, attributeSet, iArr, i, 0);
        View view = this.f487a;
        b.g.l.t.g0(view, view.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            int i2 = b.a.j.N3;
            if (v.s(i2)) {
                this.f489c = v.n(i2, -1);
                ColorStateList f2 = this.f488b.f(this.f487a.getContext(), this.f489c);
                if (f2 != null) {
                    h(f2);
                }
            }
            int i3 = b.a.j.O3;
            if (v.s(i3)) {
                b.g.l.t.m0(this.f487a, v.c(i3));
            }
            int i4 = b.a.j.P3;
            if (v.s(i4)) {
                b.g.l.t.n0(this.f487a, e0.e(v.k(i4, -1), null));
            }
        } finally {
            v.w();
        }
    }

    public void f(Drawable drawable) {
        this.f489c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.f489c = i;
        j jVar = this.f488b;
        h(jVar != null ? jVar.f(this.f487a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f490d == null) {
                this.f490d = new u0();
            }
            u0 u0Var = this.f490d;
            u0Var.f633a = colorStateList;
            u0Var.f636d = true;
        } else {
            this.f490d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f491e == null) {
            this.f491e = new u0();
        }
        u0 u0Var = this.f491e;
        u0Var.f633a = colorStateList;
        u0Var.f636d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f491e == null) {
            this.f491e = new u0();
        }
        u0 u0Var = this.f491e;
        u0Var.f634b = mode;
        u0Var.f635c = true;
        b();
    }
}
