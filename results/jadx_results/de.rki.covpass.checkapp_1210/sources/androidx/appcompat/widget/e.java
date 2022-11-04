package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final View f1300a;

    /* renamed from: d */
    private y0 f1303d;

    /* renamed from: e */
    private y0 f1304e;

    /* renamed from: f */
    private y0 f1305f;

    /* renamed from: c */
    private int f1302c = -1;

    /* renamed from: b */
    private final j f1301b = j.b();

    public e(View view) {
        this.f1300a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1305f == null) {
            this.f1305f = new y0();
        }
        y0 y0Var = this.f1305f;
        y0Var.a();
        ColorStateList s10 = androidx.core.view.y.s(this.f1300a);
        if (s10 != null) {
            y0Var.f1573d = true;
            y0Var.f1570a = s10;
        }
        PorterDuff.Mode t10 = androidx.core.view.y.t(this.f1300a);
        if (t10 != null) {
            y0Var.f1572c = true;
            y0Var.f1571b = t10;
        }
        if (y0Var.f1573d || y0Var.f1572c) {
            j.i(drawable, y0Var, this.f1300a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        return this.f1303d != null;
    }

    public void b() {
        Drawable background = this.f1300a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            y0 y0Var = this.f1304e;
            if (y0Var != null) {
                j.i(background, y0Var, this.f1300a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f1303d;
            if (y0Var2 == null) {
                return;
            }
            j.i(background, y0Var2, this.f1300a.getDrawableState());
        }
    }

    public ColorStateList c() {
        y0 y0Var = this.f1304e;
        if (y0Var != null) {
            return y0Var.f1570a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        y0 y0Var = this.f1304e;
        if (y0Var != null) {
            return y0Var.f1571b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1300a.getContext();
        int[] iArr = e.j.K3;
        a1 v10 = a1.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1300a;
        androidx.core.view.y.m0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = e.j.L3;
            if (v10.s(i11)) {
                this.f1302c = v10.n(i11, -1);
                ColorStateList f10 = this.f1301b.f(this.f1300a.getContext(), this.f1302c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = e.j.M3;
            if (v10.s(i12)) {
                androidx.core.view.y.t0(this.f1300a, v10.c(i12));
            }
            int i13 = e.j.N3;
            if (v10.s(i13)) {
                androidx.core.view.y.u0(this.f1300a, h0.e(v10.k(i13, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    public void f(Drawable drawable) {
        this.f1302c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f1302c = i10;
        j jVar = this.f1301b;
        h(jVar != null ? jVar.f(this.f1300a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1303d == null) {
                this.f1303d = new y0();
            }
            y0 y0Var = this.f1303d;
            y0Var.f1570a = colorStateList;
            y0Var.f1573d = true;
        } else {
            this.f1303d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1304e == null) {
            this.f1304e = new y0();
        }
        y0 y0Var = this.f1304e;
        y0Var.f1570a = colorStateList;
        y0Var.f1573d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1304e == null) {
            this.f1304e = new y0();
        }
        y0 y0Var = this.f1304e;
        y0Var.f1571b = mode;
        y0Var.f1572c = true;
        b();
    }
}
