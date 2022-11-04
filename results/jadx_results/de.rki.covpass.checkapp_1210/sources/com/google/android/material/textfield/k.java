package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.c0;
import androidx.core.view.y;
import b5.l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.o;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class k extends LinearLayout {
    private PorterDuff.Mode U3;
    private View.OnLongClickListener V3;
    private boolean W3;

    /* renamed from: c */
    private final TextInputLayout f7726c;

    /* renamed from: d */
    private final TextView f7727d;

    /* renamed from: q */
    private CharSequence f7728q;

    /* renamed from: x */
    private final CheckableImageButton f7729x;

    /* renamed from: y */
    private ColorStateList f7730y;

    public k(TextInputLayout textInputLayout, a1 a1Var) {
        super(textInputLayout.getContext());
        this.f7726c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b5.h.e_res_0x7f0c0039, (ViewGroup) this, false);
        this.f7729x = checkableImageButton;
        c0 c0Var = new c0(getContext());
        this.f7727d = c0Var;
        g(a1Var);
        f(a1Var);
        addView(checkableImageButton);
        addView(c0Var);
    }

    private void f(a1 a1Var) {
        this.f7727d.setVisibility(8);
        this.f7727d.setId(b5.f.Q_res_0x7f090278);
        this.f7727d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        y.q0(this.f7727d, 1);
        l(a1Var.n(l.f5516a7, 0));
        int i10 = l.f5525b7;
        if (a1Var.s(i10)) {
            m(a1Var.c(i10));
        }
        k(a1Var.p(l.Z6));
    }

    private void g(a1 a1Var) {
        if (q5.c.g(getContext())) {
            androidx.core.view.h.c((ViewGroup.MarginLayoutParams) this.f7729x.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        int i10 = l.f5561f7;
        if (a1Var.s(i10)) {
            this.f7730y = q5.c.b(getContext(), a1Var, i10);
        }
        int i11 = l.f5570g7;
        if (a1Var.s(i11)) {
            this.U3 = o.f(a1Var.k(i11, -1), null);
        }
        int i12 = l.f5552e7;
        if (a1Var.s(i12)) {
            p(a1Var.g(i12));
            int i13 = l.f5543d7;
            if (a1Var.s(i13)) {
                o(a1Var.p(i13));
            }
            n(a1Var.a(l.f5534c7, true));
        }
    }

    private void x() {
        int i10 = 8;
        int i11 = (this.f7728q == null || this.W3) ? 8 : 0;
        if (this.f7729x.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f7727d.setVisibility(i11);
        this.f7726c.q0();
    }

    public CharSequence a() {
        return this.f7728q;
    }

    public ColorStateList b() {
        return this.f7727d.getTextColors();
    }

    public TextView c() {
        return this.f7727d;
    }

    public CharSequence d() {
        return this.f7729x.getContentDescription();
    }

    public Drawable e() {
        return this.f7729x.getDrawable();
    }

    boolean h() {
        return this.f7729x.getVisibility() == 0;
    }

    public void i(boolean z10) {
        this.W3 = z10;
        x();
    }

    public void j() {
        f.c(this.f7726c, this.f7729x, this.f7730y);
    }

    public void k(CharSequence charSequence) {
        this.f7728q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7727d.setText(charSequence);
        x();
    }

    public void l(int i10) {
        androidx.core.widget.j.o(this.f7727d, i10);
    }

    public void m(ColorStateList colorStateList) {
        this.f7727d.setTextColor(colorStateList);
    }

    public void n(boolean z10) {
        this.f7729x.setCheckable(z10);
    }

    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f7729x.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        w();
    }

    public void p(Drawable drawable) {
        this.f7729x.setImageDrawable(drawable);
        if (drawable != null) {
            f.a(this.f7726c, this.f7729x, this.f7730y, this.U3);
            u(true);
            j();
            return;
        }
        u(false);
        q(null);
        r(null);
        o(null);
    }

    public void q(View.OnClickListener onClickListener) {
        f.e(this.f7729x, onClickListener, this.V3);
    }

    public void r(View.OnLongClickListener onLongClickListener) {
        this.V3 = onLongClickListener;
        f.f(this.f7729x, onLongClickListener);
    }

    public void s(ColorStateList colorStateList) {
        if (this.f7730y != colorStateList) {
            this.f7730y = colorStateList;
            f.a(this.f7726c, this.f7729x, colorStateList, this.U3);
        }
    }

    public void t(PorterDuff.Mode mode) {
        if (this.U3 != mode) {
            this.U3 = mode;
            f.a(this.f7726c, this.f7729x, this.f7730y, mode);
        }
    }

    public void u(boolean z10) {
        if (h() != z10) {
            this.f7729x.setVisibility(z10 ? 0 : 8);
            w();
            x();
        }
    }

    public void v(androidx.core.view.accessibility.d dVar) {
        View view;
        if (this.f7727d.getVisibility() == 0) {
            dVar.i0(this.f7727d);
            view = this.f7727d;
        } else {
            view = this.f7729x;
        }
        dVar.v0(view);
    }

    void w() {
        EditText editText = this.f7726c.f7621y;
        if (editText == null) {
            return;
        }
        y.B0(this.f7727d, h() ? 0 : y.G(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(b5.d.f5479x), editText.getCompoundPaddingBottom());
    }
}
