package com.google.android.material.textfield;

import a.g.l.u;
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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final Context f1593a;

    /* renamed from: b */
    private final TextInputLayout f1594b;

    /* renamed from: c */
    private LinearLayout f1595c;
    private int d;
    private FrameLayout e;
    private int f;
    private Animator g;
    private final float h;
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private int n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f1596a;

        /* renamed from: b */
        final /* synthetic */ TextView f1597b;

        /* renamed from: c */
        final /* synthetic */ int f1598c;
        final /* synthetic */ TextView d;

        a(int i, TextView textView, int i2, TextView textView2) {
            f.this = r1;
            this.f1596a = i;
            this.f1597b = textView;
            this.f1598c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.i = this.f1596a;
            f.this.g = null;
            TextView textView = this.f1597b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f1598c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
                TextView textView2 = this.d;
                if (textView2 == null) {
                    return;
                }
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1593a = context;
        this.f1594b = textInputLayout;
        this.h = context.getResources().getDimensionPixelSize(b.a.a.a.d.design_textinput_caption_translate_y);
    }

    private ObjectAnimator a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(b.a.a.a.m.a.d);
        return ofFloat;
    }

    private ObjectAnimator a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(b.a.a.a.m.a.f1208a);
        return ofFloat;
    }

    private void a(int i, int i2) {
        TextView d;
        TextView d2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (d2 = d(i2)) != null) {
            d2.setVisibility(0);
            d2.setAlpha(1.0f);
        }
        if (i != 0 && (d = d(i)) != null) {
            d.setVisibility(4);
            if (i == 1) {
                d.setText((CharSequence) null);
            }
        }
        this.i = i2;
    }

    private void a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.q, this.r, 2, i, i2);
            a(arrayList, this.l, this.m, 1, i, i2);
            b.a.a.a.m.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, d(i), i, d(i2)));
            animatorSet.start();
        } else {
            a(i, i2);
        }
        this.f1594b.e();
        this.f1594b.a(z);
        this.f1594b.f();
    }

    private void a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i != i3 && i != i2) {
            return;
        }
        list.add(a(textView, i3 == i));
        if (i3 != i) {
            return;
        }
        list.add(a(textView));
    }

    private boolean a(TextView textView, CharSequence charSequence) {
        return u.D(this.f1594b) && this.f1594b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private TextView d(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.r;
            }
            return null;
        }
        return this.m;
    }

    private boolean e(int i) {
        return i == 1 && this.m != null && !TextUtils.isEmpty(this.k);
    }

    private boolean m() {
        return (this.f1595c == null || this.f1594b.getEditText() == null) ? false : true;
    }

    public void a() {
        if (m()) {
            u.a(this.f1595c, u.t(this.f1594b.getEditText()), 0, u.s(this.f1594b.getEditText()), 0);
        }
    }

    public void a(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void a(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            a(this.m, typeface);
            a(this.r, typeface);
        }
    }

    public void a(TextView textView, int i) {
        if (this.f1595c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f1593a);
            this.f1595c = linearLayout;
            linearLayout.setOrientation(0);
            this.f1594b.addView(this.f1595c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f1593a);
            this.e = frameLayout;
            this.f1595c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f1595c.addView(new Space(this.f1593a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f1594b.getEditText() != null) {
                a();
            }
        }
        if (a(i)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.f1595c.addView(textView, i);
        }
        this.f1595c.setVisibility(0);
        this.d++;
    }

    public void a(CharSequence charSequence) {
        b();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        a(this.i, this.j, a(this.m, charSequence));
    }

    public void a(boolean z) {
        if (this.l == z) {
            return;
        }
        b();
        if (z) {
            z zVar = new z(this.f1593a);
            this.m = zVar;
            zVar.setId(b.a.a.a.f.textinput_error);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.m.setTypeface(typeface);
            }
            b(this.n);
            a(this.o);
            this.m.setVisibility(4);
            u.g(this.m, 1);
            a(this.m, 0);
        } else {
            i();
            b(this.m, 0);
            this.m = null;
            this.f1594b.e();
            this.f1594b.f();
        }
        this.l = z;
    }

    boolean a(int i) {
        return i == 0 || i == 1;
    }

    void b() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b(int i) {
        this.n = i;
        TextView textView = this.m;
        if (textView != null) {
            this.f1594b.a(textView, i);
        }
    }

    public void b(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f1595c == null) {
            return;
        }
        if (!a(i) || (frameLayout = this.e) == null) {
            this.f1595c.removeView(textView);
        } else {
            int i2 = this.f - 1;
            this.f = i2;
            a(frameLayout, i2);
            this.e.removeView(textView);
        }
        int i3 = this.d - 1;
        this.d = i3;
        a(this.f1595c, i3);
    }

    public void b(CharSequence charSequence) {
        b();
        this.p = charSequence;
        this.r.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        a(this.i, this.j, a(this.r, charSequence));
    }

    public void b(boolean z) {
        if (this.q == z) {
            return;
        }
        b();
        if (z) {
            z zVar = new z(this.f1593a);
            this.r = zVar;
            zVar.setId(b.a.a.a.f.textinput_helper_text);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            this.r.setVisibility(4);
            u.g(this.r, 1);
            c(this.s);
            b(this.t);
            a(this.r, 1);
        } else {
            j();
            b(this.r, 1);
            this.r = null;
            this.f1594b.e();
            this.f1594b.f();
        }
        this.q = z;
    }

    public void c(int i) {
        this.s = i;
        TextView textView = this.r;
        if (textView != null) {
            i.d(textView, i);
        }
    }

    public boolean c() {
        return e(this.j);
    }

    public CharSequence d() {
        return this.k;
    }

    public int e() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList f() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence g() {
        return this.p;
    }

    public int h() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void i() {
        this.k = null;
        b();
        if (this.i == 1) {
            this.j = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        a(this.i, this.j, a(this.m, (CharSequence) null));
    }

    void j() {
        b();
        if (this.i == 2) {
            this.j = 0;
        }
        a(this.i, this.j, a(this.r, (CharSequence) null));
    }

    public boolean k() {
        return this.l;
    }

    public boolean l() {
        return this.q;
    }
}
