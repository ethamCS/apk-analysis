package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.core.view.y;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final Context f7688a;

    /* renamed from: b */
    private final TextInputLayout f7689b;

    /* renamed from: c */
    private LinearLayout f7690c;

    /* renamed from: d */
    private int f7691d;

    /* renamed from: e */
    private FrameLayout f7692e;

    /* renamed from: f */
    private Animator f7693f;

    /* renamed from: g */
    private final float f7694g;

    /* renamed from: h */
    private int f7695h;

    /* renamed from: i */
    private int f7696i;

    /* renamed from: j */
    private CharSequence f7697j;

    /* renamed from: k */
    private boolean f7698k;

    /* renamed from: l */
    private TextView f7699l;

    /* renamed from: m */
    private CharSequence f7700m;

    /* renamed from: n */
    private int f7701n;

    /* renamed from: o */
    private ColorStateList f7702o;

    /* renamed from: p */
    private CharSequence f7703p;

    /* renamed from: q */
    private boolean f7704q;

    /* renamed from: r */
    private TextView f7705r;

    /* renamed from: s */
    private int f7706s;

    /* renamed from: t */
    private ColorStateList f7707t;

    /* renamed from: u */
    private Typeface f7708u;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7709a;

        /* renamed from: b */
        final /* synthetic */ TextView f7710b;

        /* renamed from: c */
        final /* synthetic */ int f7711c;

        /* renamed from: d */
        final /* synthetic */ TextView f7712d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            g.this = r1;
            this.f7709a = i10;
            this.f7710b = textView;
            this.f7711c = i11;
            this.f7712d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f7695h = this.f7709a;
            g.this.f7693f = null;
            TextView textView = this.f7710b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f7711c == 1 && g.this.f7699l != null) {
                    g.this.f7699l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f7712d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f7712d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f7712d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends View.AccessibilityDelegate {
        b() {
            g.this = r1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = g.this.f7689b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public g(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7688a = context;
        this.f7689b = textInputLayout;
        this.f7694g = context.getResources().getDimensionPixelSize(b5.d.j_res_0x7f060095);
    }

    private void C(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m11 = m(i11)) != null) {
            m11.setVisibility(0);
            m11.setAlpha(1.0f);
        }
        if (i10 != 0 && (m10 = m(i10)) != null) {
            m10.setVisibility(4);
            if (i10 == 1) {
                m10.setText((CharSequence) null);
            }
        }
        this.f7695h = i11;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        return y.S(this.f7689b) && this.f7689b.isEnabled() && (this.f7696i != this.f7695h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void Q(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7693f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f7704q, this.f7705r, 2, i10, i11);
            i(arrayList, this.f7698k, this.f7699l, 1, i10, i11);
            c5.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            C(i10, i11);
        }
        this.f7689b.r0();
        this.f7689b.w0(z10);
        this.f7689b.E0();
    }

    private boolean g() {
        return (this.f7690c == null || this.f7689b.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 != i12 && i10 != i11) {
            return;
        }
        list.add(j(textView, i12 == i10));
        if (i12 != i10) {
            return;
        }
        list.add(k(textView));
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(c5.a.f6267a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f7694g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(c5.a.f6270d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f7705r;
            }
            return null;
        }
        return this.f7699l;
    }

    private int u(boolean z10, int i10, int i11) {
        return z10 ? this.f7688a.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean x(int i10) {
        return i10 == 1 && this.f7699l != null && !TextUtils.isEmpty(this.f7697j);
    }

    public boolean A() {
        return this.f7704q;
    }

    public void B(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f7690c == null) {
            return;
        }
        if (!y(i10) || (frameLayout = this.f7692e) == null) {
            this.f7690c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f7691d - 1;
        this.f7691d = i11;
        M(this.f7690c, i11);
    }

    public void D(CharSequence charSequence) {
        this.f7700m = charSequence;
        TextView textView = this.f7699l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void E(boolean z10) {
        if (this.f7698k == z10) {
            return;
        }
        h();
        if (z10) {
            c0 c0Var = new c0(this.f7688a);
            this.f7699l = c0Var;
            c0Var.setId(b5.f.N_res_0x7f090275);
            this.f7699l.setTextAlignment(5);
            Typeface typeface = this.f7708u;
            if (typeface != null) {
                this.f7699l.setTypeface(typeface);
            }
            F(this.f7701n);
            G(this.f7702o);
            D(this.f7700m);
            this.f7699l.setVisibility(4);
            y.q0(this.f7699l, 1);
            e(this.f7699l, 0);
        } else {
            v();
            B(this.f7699l, 0);
            this.f7699l = null;
            this.f7689b.r0();
            this.f7689b.E0();
        }
        this.f7698k = z10;
    }

    public void F(int i10) {
        this.f7701n = i10;
        TextView textView = this.f7699l;
        if (textView != null) {
            this.f7689b.d0(textView, i10);
        }
    }

    public void G(ColorStateList colorStateList) {
        this.f7702o = colorStateList;
        TextView textView = this.f7699l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void H(int i10) {
        this.f7706s = i10;
        TextView textView = this.f7705r;
        if (textView != null) {
            androidx.core.widget.j.o(textView, i10);
        }
    }

    public void I(boolean z10) {
        if (this.f7704q == z10) {
            return;
        }
        h();
        if (z10) {
            c0 c0Var = new c0(this.f7688a);
            this.f7705r = c0Var;
            c0Var.setId(b5.f.O_res_0x7f090276);
            this.f7705r.setTextAlignment(5);
            Typeface typeface = this.f7708u;
            if (typeface != null) {
                this.f7705r.setTypeface(typeface);
            }
            this.f7705r.setVisibility(4);
            y.q0(this.f7705r, 1);
            H(this.f7706s);
            J(this.f7707t);
            e(this.f7705r, 1);
            this.f7705r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f7705r, 1);
            this.f7705r = null;
            this.f7689b.r0();
            this.f7689b.E0();
        }
        this.f7704q = z10;
    }

    public void J(ColorStateList colorStateList) {
        this.f7707t = colorStateList;
        TextView textView = this.f7705r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void L(Typeface typeface) {
        if (typeface != this.f7708u) {
            this.f7708u = typeface;
            K(this.f7699l, typeface);
            K(this.f7705r, typeface);
        }
    }

    public void O(CharSequence charSequence) {
        h();
        this.f7697j = charSequence;
        this.f7699l.setText(charSequence);
        int i10 = this.f7695h;
        if (i10 != 1) {
            this.f7696i = 1;
        }
        Q(i10, this.f7696i, N(this.f7699l, charSequence));
    }

    public void P(CharSequence charSequence) {
        h();
        this.f7703p = charSequence;
        this.f7705r.setText(charSequence);
        int i10 = this.f7695h;
        if (i10 != 2) {
            this.f7696i = 2;
        }
        Q(i10, this.f7696i, N(this.f7705r, charSequence));
    }

    public void e(TextView textView, int i10) {
        if (this.f7690c == null && this.f7692e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f7688a);
            this.f7690c = linearLayout;
            linearLayout.setOrientation(0);
            this.f7689b.addView(this.f7690c, -1, -2);
            this.f7692e = new FrameLayout(this.f7688a);
            this.f7690c.addView(this.f7692e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f7689b.getEditText() != null) {
                f();
            }
        }
        if (y(i10)) {
            this.f7692e.setVisibility(0);
            this.f7692e.addView(textView);
        } else {
            this.f7690c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7690c.setVisibility(0);
        this.f7691d++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f7689b.getEditText();
            boolean g10 = q5.c.g(this.f7688a);
            LinearLayout linearLayout = this.f7690c;
            int i10 = b5.d.f5477v;
            y.B0(linearLayout, u(g10, i10, y.G(editText)), u(g10, b5.d.f5478w, this.f7688a.getResources().getDimensionPixelSize(b5.d.f5476u)), u(g10, i10, y.F(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f7693f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean l() {
        return x(this.f7696i);
    }

    public CharSequence n() {
        return this.f7700m;
    }

    public CharSequence o() {
        return this.f7697j;
    }

    public int p() {
        TextView textView = this.f7699l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList q() {
        TextView textView = this.f7699l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence r() {
        return this.f7703p;
    }

    public View s() {
        return this.f7705r;
    }

    public int t() {
        TextView textView = this.f7705r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void v() {
        this.f7697j = null;
        h();
        if (this.f7695h == 1) {
            this.f7696i = (!this.f7704q || TextUtils.isEmpty(this.f7703p)) ? 0 : 2;
        }
        Q(this.f7695h, this.f7696i, N(this.f7699l, BuildConfig.FLAVOR));
    }

    void w() {
        h();
        int i10 = this.f7695h;
        if (i10 == 2) {
            this.f7696i = 0;
        }
        Q(i10, this.f7696i, N(this.f7705r, BuildConfig.FLAVOR));
    }

    boolean y(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public boolean z() {
        return this.f7698k;
    }
}
