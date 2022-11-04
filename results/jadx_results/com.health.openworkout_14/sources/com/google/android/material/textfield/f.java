package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import b.g.l.t;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final Context f3317a;

    /* renamed from: b */
    private final TextInputLayout f3318b;

    /* renamed from: c */
    private LinearLayout f3319c;

    /* renamed from: d */
    private int f3320d;

    /* renamed from: e */
    private FrameLayout f3321e;

    /* renamed from: f */
    private int f3322f;

    /* renamed from: g */
    private Animator f3323g;

    /* renamed from: h */
    private final float f3324h;
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private CharSequence n;
    private int o;
    private ColorStateList p;
    private CharSequence q;
    private boolean r;
    private TextView s;
    private int t;
    private ColorStateList u;
    private Typeface v;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f3325a;

        /* renamed from: b */
        final /* synthetic */ TextView f3326b;

        /* renamed from: c */
        final /* synthetic */ int f3327c;

        /* renamed from: d */
        final /* synthetic */ TextView f3328d;

        a(int i, TextView textView, int i2, TextView textView2) {
            f.this = r1;
            this.f3325a = i;
            this.f3326b = textView;
            this.f3327c = i2;
            this.f3328d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.i = this.f3325a;
            f.this.f3323g = null;
            TextView textView = this.f3326b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f3327c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f3328d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f3328d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f3328d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3317a = context;
        this.f3318b = textInputLayout;
        this.f3324h = context.getResources().getDimensionPixelSize(d.a.a.a.d.i_res_0x7f07008e);
    }

    private void H(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void J(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean K(TextView textView, CharSequence charSequence) {
        return t.O(this.f3318b) && this.f3318b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void N(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3323g = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.r, this.s, 2, i, i2);
            h(arrayList, this.l, this.m, 1, i, i2);
            d.a.a.a.l.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, l(i), i, l(i2)));
            animatorSet.start();
        } else {
            z(i, i2);
        }
        this.f3318b.k0();
        this.f3318b.o0(z);
        this.f3318b.y0();
    }

    private boolean f() {
        return (this.f3319c == null || this.f3318b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i != i3 && i != i2) {
            return;
        }
        list.add(i(textView, i3 == i));
        if (i3 != i) {
            return;
        }
        list.add(j(textView));
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(d.a.a.a.l.a.f3640a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f3324h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(d.a.a.a.l.a.f3643d);
        return ofFloat;
    }

    private TextView l(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.s;
            }
            return null;
        }
        return this.m;
    }

    private boolean u(int i) {
        return i == 1 && this.m != null && !TextUtils.isEmpty(this.k);
    }

    private void z(int i, int i2) {
        TextView l;
        TextView l2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (l2 = l(i2)) != null) {
            l2.setVisibility(0);
            l2.setAlpha(1.0f);
        }
        if (i != 0 && (l = l(i)) != null) {
            l.setVisibility(4);
            if (i == 1) {
                l.setText((CharSequence) null);
            }
        }
        this.i = i2;
    }

    public void A(CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void B(boolean z) {
        if (this.l == z) {
            return;
        }
        g();
        if (z) {
            z zVar = new z(this.f3317a);
            this.m = zVar;
            zVar.setId(d.a.a.a.f.y_res_0x7f0901ce);
            if (Build.VERSION.SDK_INT >= 17) {
                this.m.setTextAlignment(5);
            }
            Typeface typeface = this.v;
            if (typeface != null) {
                this.m.setTypeface(typeface);
            }
            C(this.o);
            D(this.p);
            A(this.n);
            this.m.setVisibility(4);
            t.k0(this.m, 1);
            d(this.m, 0);
        } else {
            s();
            y(this.m, 0);
            this.m = null;
            this.f3318b.k0();
            this.f3318b.y0();
        }
        this.l = z;
    }

    public void C(int i) {
        this.o = i;
        TextView textView = this.m;
        if (textView != null) {
            this.f3318b.Y(textView, i);
        }
    }

    public void D(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void E(int i) {
        this.t = i;
        TextView textView = this.s;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i);
        }
    }

    public void F(boolean z) {
        if (this.r == z) {
            return;
        }
        g();
        if (z) {
            z zVar = new z(this.f3317a);
            this.s = zVar;
            zVar.setId(d.a.a.a.f.z_res_0x7f0901cf);
            if (Build.VERSION.SDK_INT >= 17) {
                this.s.setTextAlignment(5);
            }
            Typeface typeface = this.v;
            if (typeface != null) {
                this.s.setTypeface(typeface);
            }
            this.s.setVisibility(4);
            t.k0(this.s, 1);
            E(this.t);
            G(this.u);
            d(this.s, 1);
        } else {
            t();
            y(this.s, 1);
            this.s = null;
            this.f3318b.k0();
            this.f3318b.y0();
        }
        this.r = z;
    }

    public void G(ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void I(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            H(this.m, typeface);
            H(this.s, typeface);
        }
    }

    public void L(CharSequence charSequence) {
        g();
        this.k = charSequence;
        this.m.setText(charSequence);
        int i = this.i;
        if (i != 1) {
            this.j = 1;
        }
        N(i, this.j, K(this.m, charSequence));
    }

    public void M(CharSequence charSequence) {
        g();
        this.q = charSequence;
        this.s.setText(charSequence);
        int i = this.i;
        if (i != 2) {
            this.j = 2;
        }
        N(i, this.j, K(this.s, charSequence));
    }

    public void d(TextView textView, int i) {
        if (this.f3319c == null && this.f3321e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f3317a);
            this.f3319c = linearLayout;
            linearLayout.setOrientation(0);
            this.f3318b.addView(this.f3319c, -1, -2);
            this.f3321e = new FrameLayout(this.f3317a);
            this.f3319c.addView(this.f3321e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f3318b.getEditText() != null) {
                e();
            }
        }
        if (v(i)) {
            this.f3321e.setVisibility(0);
            this.f3321e.addView(textView);
            this.f3322f++;
        } else {
            this.f3319c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3319c.setVisibility(0);
        this.f3320d++;
    }

    public void e() {
        if (f()) {
            t.u0(this.f3319c, t.D(this.f3318b.getEditText()), 0, t.C(this.f3318b.getEditText()), 0);
        }
    }

    void g() {
        Animator animator = this.f3323g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean k() {
        return u(this.j);
    }

    public CharSequence m() {
        return this.n;
    }

    public CharSequence n() {
        return this.k;
    }

    public int o() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence q() {
        return this.q;
    }

    public int r() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void s() {
        this.k = null;
        g();
        if (this.i == 1) {
            this.j = (!this.r || TextUtils.isEmpty(this.q)) ? 0 : 2;
        }
        N(this.i, this.j, K(this.m, null));
    }

    void t() {
        g();
        int i = this.i;
        if (i == 2) {
            this.j = 0;
        }
        N(i, this.j, K(this.s, null));
    }

    boolean v(int i) {
        return i == 0 || i == 1;
    }

    public boolean w() {
        return this.l;
    }

    public boolean x() {
        return this.r;
    }

    public void y(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f3319c == null) {
            return;
        }
        if (!v(i) || (frameLayout = this.f3321e) == null) {
            this.f3319c.removeView(textView);
        } else {
            int i2 = this.f3322f - 1;
            this.f3322f = i2;
            J(frameLayout, i2);
            this.f3321e.removeView(textView);
        }
        int i3 = this.f3320d - 1;
        this.f3320d = i3;
        J(this.f3319c, i3);
    }
}
