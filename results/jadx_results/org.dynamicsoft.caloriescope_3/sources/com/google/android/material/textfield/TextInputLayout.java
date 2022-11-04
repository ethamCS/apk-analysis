package com.google.android.material.textfield;

import a.g.l.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import b.a.a.a.b0.k;
import b.a.a.a.j;
import b.a.a.a.k;
import b.a.a.a.l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m;
import com.google.android.material.internal.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private static final int s0 = k.Widget_Design_TextInputLayout;
    private int A;
    private int B;
    private final Rect C;
    private final Rect D;
    private final RectF E;
    private Typeface F;
    private final CheckableImageButton G;
    private ColorStateList H;
    private boolean I;
    private PorterDuff.Mode J;
    private boolean K;
    private Drawable L;
    private View.OnLongClickListener M;
    private final LinkedHashSet<f> N;
    private int O;
    private final SparseArray<com.google.android.material.textfield.e> P;
    private final CheckableImageButton Q;
    private final LinkedHashSet<g> R;
    private ColorStateList S;
    private boolean T;
    private PorterDuff.Mode U;
    private boolean V;
    private Drawable W;
    private Drawable a0;

    /* renamed from: b */
    private final FrameLayout f1566b;
    private final CheckableImageButton b0;

    /* renamed from: c */
    private final FrameLayout f1567c;
    private View.OnLongClickListener c0;
    EditText d;
    private ColorStateList d0;
    private CharSequence e;
    private ColorStateList e0;
    private final com.google.android.material.textfield.f f;
    private final int f0;
    boolean g;
    private final int g0;
    private int h;
    private int h0;
    private boolean i;
    private int i0;
    private TextView j;
    private final int j0;
    private int k;
    private final int k0;
    private int l;
    private final int l0;
    private ColorStateList m;
    private boolean m0;
    private ColorStateList n;
    final com.google.android.material.internal.a n0;
    private boolean o;
    private boolean o0;
    private CharSequence p;
    private ValueAnimator p0;
    private boolean q;
    private boolean q0;
    private b.a.a.a.b0.g r;
    private boolean r0;
    private b.a.a.a.b0.g s;
    private b.a.a.a.b0.k t;
    private final int u;
    private int v;
    private final int w;
    private int x;
    private final int y;
    private final int z;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.a(!textInputLayout.r0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.g) {
                textInputLayout2.a(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.Q.performClick();
            TextInputLayout.this.Q.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.n0.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.g.l.a {
        private final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            EditText editText = this.d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.g(text);
            } else if (z2) {
                cVar.g(hint);
            }
            if (z2) {
                cVar.d(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.n(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.c(error);
                cVar.e(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    /* loaded from: classes.dex */
    public static class h extends a.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        CharSequence d;
        boolean e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e = parcel.readInt() != 1 ? false : true;
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.d) + "}";
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.a.b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(m.b(context, attributeSet, i, s0), attributeSet, i);
        int i2;
        this.f = new com.google.android.material.textfield.f(this);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        this.N = new LinkedHashSet<>();
        this.O = 0;
        this.P = new SparseArray<>();
        this.R = new LinkedHashSet<>();
        this.n0 = new com.google.android.material.internal.a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1566b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f1566b);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f1567c = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        this.f1566b.addView(this.f1567c);
        this.n0.b(b.a.a.a.m.a.f1208a);
        this.n0.a(b.a.a.a.m.a.f1208a);
        this.n0.b(8388659);
        w0 d2 = m.d(context2, attributeSet, l.TextInputLayout, i, s0, l.TextInputLayout_counterTextAppearance, l.TextInputLayout_counterOverflowTextAppearance, l.TextInputLayout_errorTextAppearance, l.TextInputLayout_helperTextTextAppearance, l.TextInputLayout_hintTextAppearance);
        this.o = d2.a(l.TextInputLayout_hintEnabled, true);
        setHint(d2.e(l.TextInputLayout_android_hint));
        this.o0 = d2.a(l.TextInputLayout_hintAnimationEnabled, true);
        this.t = b.a.a.a.b0.k.a(context2, attributeSet, i, s0).a();
        this.u = context2.getResources().getDimensionPixelOffset(b.a.a.a.d.mtrl_textinput_box_label_cutout_padding);
        this.w = d2.b(l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.y = d2.c(l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(b.a.a.a.d.mtrl_textinput_box_stroke_width_default));
        this.z = d2.c(l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(b.a.a.a.d.mtrl_textinput_box_stroke_width_focused));
        this.x = this.y;
        float a2 = d2.a(l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float a3 = d2.a(l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float a4 = d2.a(l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float a5 = d2.a(l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        k.b m = this.t.m();
        if (a2 >= 0.0f) {
            m.d(a2);
        }
        if (a3 >= 0.0f) {
            m.e(a3);
        }
        if (a4 >= 0.0f) {
            m.c(a4);
        }
        if (a5 >= 0.0f) {
            m.b(a5);
        }
        this.t = m.a();
        ColorStateList a6 = b.a.a.a.y.c.a(context2, d2, l.TextInputLayout_boxBackgroundColor);
        if (a6 != null) {
            int defaultColor = a6.getDefaultColor();
            this.i0 = defaultColor;
            this.B = defaultColor;
            if (a6.isStateful()) {
                this.j0 = a6.getColorForState(new int[]{-16842910}, -1);
                i2 = a6.getColorForState(new int[]{16843623}, -1);
            } else {
                ColorStateList b2 = a.a.k.a.a.b(context2, b.a.a.a.c.mtrl_filled_background_color);
                this.j0 = b2.getColorForState(new int[]{-16842910}, -1);
                i2 = b2.getColorForState(new int[]{16843623}, -1);
            }
            this.k0 = i2;
        } else {
            this.B = 0;
            this.i0 = 0;
            this.j0 = 0;
            this.k0 = 0;
        }
        if (d2.g(l.TextInputLayout_android_textColorHint)) {
            ColorStateList a7 = d2.a(l.TextInputLayout_android_textColorHint);
            this.e0 = a7;
            this.d0 = a7;
        }
        ColorStateList a8 = b.a.a.a.y.c.a(context2, d2, l.TextInputLayout_boxStrokeColor);
        if (a8 == null || !a8.isStateful()) {
            this.h0 = d2.a(l.TextInputLayout_boxStrokeColor, 0);
            this.f0 = a.g.d.a.a(context2, b.a.a.a.c.mtrl_textinput_default_box_stroke_color);
            this.l0 = a.g.d.a.a(context2, b.a.a.a.c.mtrl_textinput_disabled_color);
            this.g0 = a.g.d.a.a(context2, b.a.a.a.c.mtrl_textinput_hovered_box_stroke_color);
        } else {
            this.f0 = a8.getDefaultColor();
            this.l0 = a8.getColorForState(new int[]{-16842910}, -1);
            this.g0 = a8.getColorForState(new int[]{16843623}, -1);
            this.h0 = a8.getColorForState(new int[]{16842908}, -1);
        }
        if (d2.g(l.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(d2.g(l.TextInputLayout_hintTextAppearance, 0));
        }
        int g2 = d2.g(l.TextInputLayout_errorTextAppearance, 0);
        boolean a9 = d2.a(l.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b.a.a.a.h.design_text_input_end_icon, (ViewGroup) this.f1566b, false);
        this.b0 = checkableImageButton;
        this.f1566b.addView(checkableImageButton);
        this.b0.setVisibility(8);
        if (d2.g(l.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(d2.b(l.TextInputLayout_errorIconDrawable));
        }
        if (d2.g(l.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(b.a.a.a.y.c.a(context2, d2, l.TextInputLayout_errorIconTint));
        }
        if (d2.g(l.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(n.a(d2.d(l.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null));
        }
        this.b0.setContentDescription(getResources().getText(j.error_icon_content_description));
        u.h(this.b0, 2);
        this.b0.setClickable(false);
        this.b0.setPressable(false);
        this.b0.setFocusable(false);
        int g3 = d2.g(l.TextInputLayout_helperTextTextAppearance, 0);
        boolean a10 = d2.a(l.TextInputLayout_helperTextEnabled, false);
        CharSequence e2 = d2.e(l.TextInputLayout_helperText);
        boolean a11 = d2.a(l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(d2.d(l.TextInputLayout_counterMaxLength, -1));
        this.l = d2.g(l.TextInputLayout_counterTextAppearance, 0);
        this.k = d2.g(l.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b.a.a.a.h.design_text_input_start_icon, (ViewGroup) this.f1566b, false);
        this.G = checkableImageButton2;
        this.f1566b.addView(checkableImageButton2);
        this.G.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (d2.g(l.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(d2.b(l.TextInputLayout_startIconDrawable));
            if (d2.g(l.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(d2.e(l.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(d2.a(l.TextInputLayout_startIconCheckable, true));
        }
        if (d2.g(l.TextInputLayout_startIconTint)) {
            setStartIconTintList(b.a.a.a.y.c.a(context2, d2, l.TextInputLayout_startIconTint));
        }
        if (d2.g(l.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(n.a(d2.d(l.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null));
        }
        setHelperTextEnabled(a10);
        setHelperText(e2);
        setHelperTextTextAppearance(g3);
        setErrorEnabled(a9);
        setErrorTextAppearance(g2);
        setCounterTextAppearance(this.l);
        setCounterOverflowTextAppearance(this.k);
        if (d2.g(l.TextInputLayout_errorTextColor)) {
            setErrorTextColor(d2.a(l.TextInputLayout_errorTextColor));
        }
        if (d2.g(l.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(d2.a(l.TextInputLayout_helperTextTextColor));
        }
        if (d2.g(l.TextInputLayout_hintTextColor)) {
            setHintTextColor(d2.a(l.TextInputLayout_hintTextColor));
        }
        if (d2.g(l.TextInputLayout_counterTextColor)) {
            setCounterTextColor(d2.a(l.TextInputLayout_counterTextColor));
        }
        if (d2.g(l.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(d2.a(l.TextInputLayout_counterOverflowTextColor));
        }
        setCounterEnabled(a11);
        setBoxBackgroundMode(d2.d(l.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(b.a.a.a.h.design_text_input_end_icon, (ViewGroup) this.f1567c, false);
        this.Q = checkableImageButton3;
        this.f1567c.addView(checkableImageButton3);
        this.Q.setVisibility(8);
        this.P.append(-1, new com.google.android.material.textfield.b(this));
        this.P.append(0, new com.google.android.material.textfield.g(this));
        this.P.append(1, new com.google.android.material.textfield.h(this));
        this.P.append(2, new com.google.android.material.textfield.a(this));
        this.P.append(3, new com.google.android.material.textfield.d(this));
        if (d2.g(l.TextInputLayout_endIconMode)) {
            setEndIconMode(d2.d(l.TextInputLayout_endIconMode, 0));
            if (d2.g(l.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(d2.b(l.TextInputLayout_endIconDrawable));
            }
            if (d2.g(l.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(d2.e(l.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(d2.a(l.TextInputLayout_endIconCheckable, true));
        } else if (d2.g(l.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(d2.a(l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(d2.b(l.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(d2.e(l.TextInputLayout_passwordToggleContentDescription));
            if (d2.g(l.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(b.a.a.a.y.c.a(context2, d2, l.TextInputLayout_passwordToggleTint));
            }
            if (d2.g(l.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(n.a(d2.d(l.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null));
            }
        }
        if (!d2.g(l.TextInputLayout_passwordToggleEnabled)) {
            if (d2.g(l.TextInputLayout_endIconTint)) {
                setEndIconTintList(b.a.a.a.y.c.a(context2, d2, l.TextInputLayout_endIconTint));
            }
            if (d2.g(l.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(n.a(d2.d(l.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null));
            }
        }
        d2.a();
        u.h(this, 2);
    }

    private void A() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.j;
        if (textView != null) {
            a(textView, this.i ? this.k : this.l);
            if (!this.i && (colorStateList2 = this.m) != null) {
                this.j.setTextColor(colorStateList2);
            }
            if (!this.i || (colorStateList = this.n) == null) {
                return;
            }
            this.j.setTextColor(colorStateList);
        }
    }

    private boolean B() {
        int max;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(this.Q.getMeasuredHeight(), this.G.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private boolean C() {
        boolean z;
        if (this.d == null) {
            return false;
        }
        boolean z2 = true;
        if (!t() || !d() || this.G.getMeasuredWidth() <= 0) {
            if (this.L != null) {
                Drawable[] a2 = i.a(this.d);
                i.a(this.d, null, a2[1], a2[2], a2[3]);
                this.L = null;
                z = true;
            }
            z = false;
        } else {
            if (this.L == null) {
                this.L = new ColorDrawable();
                this.L.setBounds(0, 0, (this.G.getMeasuredWidth() - this.d.getPaddingLeft()) + a.g.l.f.a((ViewGroup.MarginLayoutParams) this.G.getLayoutParams()), 1);
            }
            Drawable[] a3 = i.a(this.d);
            Drawable drawable = a3[0];
            Drawable drawable2 = this.L;
            if (drawable != drawable2) {
                i.a(this.d, drawable2, a3[1], a3[2], a3[3]);
                z = true;
            }
            z = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.W == null) {
                this.W = new ColorDrawable();
                this.W.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.d.getPaddingRight()) + a.g.l.f.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            Drawable[] a4 = i.a(this.d);
            Drawable drawable3 = a4[2];
            Drawable drawable4 = this.W;
            if (drawable3 != drawable4) {
                this.a0 = a4[2];
                i.a(this.d, a4[0], a4[1], drawable4, a4[3]);
            } else {
                z2 = z;
            }
        } else if (this.W == null) {
            return z;
        } else {
            Drawable[] a5 = i.a(this.d);
            if (a5[2] == this.W) {
                i.a(this.d, a5[0], a5[1], this.a0, a5[3]);
            } else {
                z2 = z;
            }
            this.W = null;
        }
        return z2;
    }

    private void D() {
        if (this.v != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1566b.getLayoutParams();
            int m = m();
            if (m == layoutParams.topMargin) {
                return;
            }
            layoutParams.topMargin = m;
            this.f1566b.requestLayout();
        }
    }

    private int a(Rect rect, float f2) {
        return u() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.d.getCompoundPaddingTop();
    }

    private int a(Rect rect, Rect rect2, float f2) {
        return this.v == 1 ? (int) (rect2.top + f2) : rect.bottom - this.d.getCompoundPaddingBottom();
    }

    private Rect a(Rect rect) {
        int i;
        int i2;
        int i3;
        EditText editText = this.d;
        if (editText != null) {
            Rect rect2 = this.D;
            rect2.bottom = rect.bottom;
            int i4 = this.v;
            if (i4 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = rect.top + this.w;
            } else if (i4 == 2) {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m();
                i2 = rect.right;
                i3 = this.d.getPaddingRight();
                rect2.right = i2 - i3;
                return rect2;
            } else {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = getPaddingTop();
            }
            rect2.top = i;
            i2 = rect.right;
            i3 = this.d.getCompoundPaddingRight();
            rect2.right = i2 - i3;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private static void a(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? j.character_counter_overflowed_content_description : j.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void a(Canvas canvas) {
        b.a.a.a.b0.g gVar = this.s;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.x;
            this.s.draw(canvas);
        }
    }

    private void a(RectF rectF) {
        float f2 = rectF.left;
        int i = this.u;
        rectF.left = f2 - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    private static void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    private static void a(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    private static void a(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean y = u.y(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (y || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(y);
        checkableImageButton.setPressable(y);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        u.h(checkableImageButton, i);
    }

    private void a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.a.a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void a(boolean z, boolean z2) {
        ColorStateList colorStateList;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.d;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean c2 = this.f.c();
        ColorStateList colorStateList2 = this.d0;
        if (colorStateList2 != null) {
            this.n0.a(colorStateList2);
            this.n0.b(this.d0);
        }
        if (!isEnabled) {
            this.n0.a(ColorStateList.valueOf(this.l0));
            this.n0.b(ColorStateList.valueOf(this.l0));
        } else if (c2) {
            this.n0.a(this.f.f());
        } else {
            if (this.i && (textView = this.j) != null) {
                aVar = this.n0;
                colorStateList = textView.getTextColors();
            } else if (z3 && (colorStateList = this.e0) != null) {
                aVar = this.n0;
            }
            aVar.a(colorStateList);
        }
        if (z4 || (isEnabled() && (z3 || c2))) {
            if (!z2 && !this.m0) {
                return;
            }
            b(z);
        } else if (!z2 && this.m0) {
        } else {
            c(z);
        }
    }

    private Rect b(Rect rect) {
        if (this.d != null) {
            Rect rect2 = this.D;
            float e2 = this.n0.e();
            rect2.left = rect.left + this.d.getCompoundPaddingLeft();
            rect2.top = a(rect, e2);
            rect2.right = rect.right - this.d.getCompoundPaddingRight();
            rect2.bottom = a(rect, rect2, e2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void b(int i) {
        Iterator<g> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    private void b(Canvas canvas) {
        if (this.o) {
            this.n0.a(canvas);
        }
    }

    private static void b(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    private void b(boolean z) {
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p0.cancel();
        }
        if (!z || !this.o0) {
            this.n0.b(1.0f);
        } else {
            a(1.0f);
        }
        this.m0 = false;
        if (q()) {
            w();
        }
    }

    private void c(Rect rect) {
        b.a.a.a.b0.g gVar = this.s;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.z, rect.right, i);
        }
    }

    private void c(boolean z) {
        ValueAnimator valueAnimator = this.p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p0.cancel();
        }
        if (!z || !this.o0) {
            this.n0.b(0.0f);
        } else {
            a(0.0f);
        }
        if (q() && ((com.google.android.material.textfield.c) this.r).s()) {
            p();
        }
        this.m0 = true;
    }

    private void d(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            i();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.i(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.b(mutate, this.f.e());
        this.Q.setImageDrawable(mutate);
    }

    private void g() {
        b.a.a.a.b0.g gVar = this.r;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.t);
        if (n()) {
            this.r.a(this.x, this.A);
        }
        int l = l();
        this.B = l;
        this.r.a(ColorStateList.valueOf(l));
        if (this.O == 3) {
            this.d.getBackground().invalidateSelf();
        }
        h();
        invalidate();
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.P.get(this.O);
        return eVar != null ? eVar : this.P.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.b0.getVisibility() == 0) {
            return this.b0;
        }
        if (s() && a()) {
            return this.Q;
        }
        return null;
    }

    private void h() {
        if (this.s == null) {
            return;
        }
        if (o()) {
            this.s.a(ColorStateList.valueOf(this.A));
        }
        invalidate();
    }

    private void i() {
        a(this.Q, this.T, this.S, this.V, this.U);
    }

    private void j() {
        a(this.G, this.I, this.H, this.K, this.J);
    }

    private void k() {
        int i = this.v;
        if (i == 0) {
            this.r = null;
        } else if (i == 1) {
            this.r = new b.a.a.a.b0.g(this.t);
            this.s = new b.a.a.a.b0.g();
            return;
        } else if (i != 2) {
            throw new IllegalArgumentException(this.v + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.r = (!this.o || (this.r instanceof com.google.android.material.textfield.c)) ? new b.a.a.a.b0.g(this.t) : new com.google.android.material.textfield.c(this.t);
        }
        this.s = null;
    }

    private int l() {
        return this.v == 1 ? b.a.a.a.s.a.a(b.a.a.a.s.a.a(this, b.a.a.a.b.colorSurface, 0), this.B) : this.B;
    }

    private int m() {
        float c2;
        if (!this.o) {
            return 0;
        }
        int i = this.v;
        if (i == 0 || i == 1) {
            c2 = this.n0.c();
        } else if (i != 2) {
            return 0;
        } else {
            c2 = this.n0.c() / 2.0f;
        }
        return (int) c2;
    }

    private boolean n() {
        return this.v == 2 && o();
    }

    private boolean o() {
        return this.x > -1 && this.A != 0;
    }

    private void p() {
        if (q()) {
            ((com.google.android.material.textfield.c) this.r).t();
        }
    }

    private boolean q() {
        return this.o && !TextUtils.isEmpty(this.p) && (this.r instanceof com.google.android.material.textfield.c);
    }

    private void r() {
        Iterator<f> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private boolean s() {
        return this.O != 0;
    }

    private void setEditText(EditText editText) {
        if (this.d == null) {
            if (this.O != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.d = editText;
            v();
            setTextInputAccessibilityDelegate(new e(this));
            this.n0.b(this.d.getTypeface());
            this.n0.a(this.d.getTextSize());
            int gravity = this.d.getGravity();
            this.n0.b((gravity & (-113)) | 48);
            this.n0.c(gravity);
            this.d.addTextChangedListener(new a());
            if (this.d0 == null) {
                this.d0 = this.d.getHintTextColors();
            }
            if (this.o) {
                if (TextUtils.isEmpty(this.p)) {
                    CharSequence hint = this.d.getHint();
                    this.e = hint;
                    setHint(hint);
                    this.d.setHint((CharSequence) null);
                }
                this.q = true;
            }
            if (this.j != null) {
                a(this.d.getText().length());
            }
            e();
            this.f.a();
            this.G.bringToFront();
            this.f1567c.bringToFront();
            this.b0.bringToFront();
            r();
            a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.b0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f1567c;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (!s()) {
            C();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.p)) {
            this.p = charSequence;
            this.n0.a(charSequence);
            if (this.m0) {
                return;
            }
            w();
        }
    }

    private boolean t() {
        return getStartIconDrawable() != null;
    }

    private boolean u() {
        return this.v == 1 && (Build.VERSION.SDK_INT < 16 || this.d.getMinLines() <= 1);
    }

    private void v() {
        k();
        x();
        f();
        if (this.v != 0) {
            D();
        }
    }

    private void w() {
        if (!q()) {
            return;
        }
        RectF rectF = this.E;
        this.n0.a(rectF);
        a(rectF);
        rectF.offset(-getPaddingLeft(), 0.0f);
        ((com.google.android.material.textfield.c) this.r).a(rectF);
    }

    private void x() {
        if (y()) {
            u.a(this.d, this.r);
        }
    }

    private boolean y() {
        EditText editText = this.d;
        return (editText == null || this.r == null || editText.getBackground() != null || this.v == 0) ? false : true;
    }

    private void z() {
        if (this.j != null) {
            EditText editText = this.d;
            a(editText == null ? 0 : editText.getText().length());
        }
    }

    void a(float f2) {
        if (this.n0.f() == f2) {
            return;
        }
        if (this.p0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.p0 = valueAnimator;
            valueAnimator.setInterpolator(b.a.a.a.m.a.f1209b);
            this.p0.setDuration(167L);
            this.p0.addUpdateListener(new d());
        }
        this.p0.setFloatValues(this.n0.f(), f2);
        this.p0.start();
    }

    void a(int i) {
        boolean z = this.i;
        if (this.h == -1) {
            this.j.setText(String.valueOf(i));
            this.j.setContentDescription(null);
            this.i = false;
        } else {
            if (u.d(this.j) == 1) {
                u.g(this.j, 0);
            }
            this.i = i > this.h;
            a(getContext(), this.j, i, this.h, this.i);
            if (z != this.i) {
                A();
                if (this.i) {
                    u.g(this.j, 1);
                }
            }
            this.j.setText(getContext().getString(j.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.h)));
        }
        if (this.d == null || z == this.i) {
            return;
        }
        a(false);
        f();
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.i.d(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = b.a.a.a.k.TextAppearance_AppCompat_Caption
            androidx.core.widget.i.d(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = b.a.a.a.c.design_error
            int r4 = a.g.d.a.a(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.a(android.widget.TextView, int):void");
    }

    public void a(f fVar) {
        this.N.add(fVar);
        if (this.d != null) {
            fVar.a(this);
        }
    }

    public void a(g gVar) {
        this.R.add(gVar);
    }

    public void a(boolean z) {
        a(z, false);
    }

    public boolean a() {
        return this.f1567c.getVisibility() == 0 && this.Q.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f1566b.addView(view, layoutParams2);
        this.f1566b.setLayoutParams(layoutParams);
        D();
        setEditText((EditText) view);
    }

    public boolean b() {
        return this.f.l();
    }

    public boolean c() {
        return this.q;
    }

    public boolean d() {
        return this.G.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.e == null || (editText = this.d) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.q;
        this.q = false;
        CharSequence hint = editText.getHint();
        this.d.setHint(this.e);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.d.setHint(hint);
            this.q = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.r0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        b(canvas);
        a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.q0) {
            return;
        }
        boolean z = true;
        this.q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.n0;
        boolean a2 = aVar != null ? aVar.a(drawableState) | false : false;
        if (!u.D(this) || !isEnabled()) {
            z = false;
        }
        a(z);
        e();
        f();
        if (a2) {
            invalidate();
        }
        this.q0 = false;
    }

    public void e() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.d;
        if (editText == null || this.v != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.f.c()) {
            currentTextColor = this.f.e();
        } else if (!this.i || (textView = this.j) == null) {
            androidx.core.graphics.drawable.a.b(background);
            this.d.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.j.a(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void f() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.r == null || this.v == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.d) != null && editText.isHovered());
        this.A = !isEnabled() ? this.l0 : this.f.c() ? this.f.e() : (!this.i || (textView = this.j) == null) ? z2 ? this.h0 : z3 ? this.g0 : this.f0 : textView.getCurrentTextColor();
        d(this.f.c() && getEndIconDelegate().b());
        if (getErrorIconDrawable() != null && this.f.k() && this.f.c()) {
            z = true;
        }
        setErrorIconVisible(z);
        this.x = ((z3 || z2) && isEnabled()) ? this.z : this.y;
        if (this.v == 1) {
            this.B = !isEnabled() ? this.j0 : z3 ? this.k0 : this.i0;
        }
        g();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m() : super.getBaseline();
    }

    public b.a.a.a.b0.g getBoxBackground() {
        int i = this.v;
        if (i == 1 || i == 2) {
            return this.r;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.B;
    }

    public int getBoxBackgroundMode() {
        return this.v;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.r.b();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.r.c();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.r.n();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.r.m();
    }

    public int getBoxStrokeColor() {
        return this.h0;
    }

    public int getCounterMaxLength() {
        return this.h;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.g || !this.i || (textView = this.j) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.m;
    }

    public ColorStateList getCounterTextColor() {
        return this.m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.d0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.Q.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.Q.getDrawable();
    }

    public int getEndIconMode() {
        return this.O;
    }

    public CheckableImageButton getEndIconView() {
        return this.Q;
    }

    public CharSequence getError() {
        if (this.f.k()) {
            return this.f.d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f.e();
    }

    public Drawable getErrorIconDrawable() {
        return this.b0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f.e();
    }

    public CharSequence getHelperText() {
        if (this.f.l()) {
            return this.f.g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f.h();
    }

    public CharSequence getHint() {
        if (this.o) {
            return this.p;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.n0.c();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.n0.d();
    }

    public ColorStateList getHintTextColor() {
        return this.e0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.Q.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.Q.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.G.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.G.getDrawable();
    }

    public Typeface getTypeface() {
        return this.F;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            Rect rect = this.C;
            com.google.android.material.internal.b.a(this, editText, rect);
            c(rect);
            if (!this.o) {
                return;
            }
            this.n0.a(a(rect));
            this.n0.b(b(rect));
            this.n0.i();
            if (!q() || this.m0) {
                return;
            }
            w();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean B = B();
        boolean C = C();
        if (B || C) {
            this.d.post(new c());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.d());
        setError(hVar.d);
        if (hVar.e) {
            this.Q.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f.c()) {
            hVar.d = getError();
        }
        hVar.e = s() && this.Q.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.B != i) {
            this.B = i;
            this.i0 = i;
            g();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(a.g.d.a.a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.v) {
            return;
        }
        this.v = i;
        if (this.d == null) {
            return;
        }
        v();
    }

    public void setBoxStrokeColor(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            f();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.g != z) {
            if (z) {
                z zVar = new z(getContext());
                this.j = zVar;
                zVar.setId(b.a.a.a.f.textinput_counter);
                Typeface typeface = this.F;
                if (typeface != null) {
                    this.j.setTypeface(typeface);
                }
                this.j.setMaxLines(1);
                this.f.a(this.j, 2);
                A();
                z();
            } else {
                this.f.b(this.j, 2);
                this.j = null;
            }
            this.g = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.h != i) {
            if (i <= 0) {
                i = -1;
            }
            this.h = i;
            if (!this.g) {
                return;
            }
            z();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.k != i) {
            this.k = i;
            A();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            A();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.l != i) {
            this.l = i;
            A();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            A();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.d0 = colorStateList;
        this.e0 = colorStateList;
        if (this.d != null) {
            a(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        a(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.Q.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.Q.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.Q.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? a.a.k.a.a.c(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.O;
        this.O = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().a(this.v)) {
            getEndIconDelegate().a();
            i();
            b(i2);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.v + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        a(this.Q, onClickListener, this.c0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c0 = onLongClickListener;
        b(this.Q, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (a() != z) {
            this.Q.setVisibility(z ? 0 : 4);
            C();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f.k()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.a(charSequence);
        } else {
            this.f.i();
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f.a(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? a.a.k.a.a.c(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.b0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f.k());
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        }
        if (this.b0.getDrawable() != drawable) {
            this.b0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            androidx.core.graphics.drawable.a.a(drawable, mode);
        }
        if (this.b0.getDrawable() != drawable) {
            this.b0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f.b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f.a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (!b()) {
                return;
            }
            setHelperTextEnabled(false);
            return;
        }
        if (!b()) {
            setHelperTextEnabled(true);
        }
        this.f.b(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f.b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f.b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f.c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.o0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (!z) {
                this.q = false;
                if (!TextUtils.isEmpty(this.p) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.p);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.p)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.q = true;
            }
            if (this.d == null) {
                return;
            }
            D();
        }
    }

    public void setHintTextAppearance(int i) {
        this.n0.a(i);
        this.e0 = this.n0.b();
        if (this.d != null) {
            a(false);
            D();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.e0 != colorStateList) {
            if (this.d0 == null) {
                this.n0.a(colorStateList);
            }
            this.e0 = colorStateList;
            if (this.d == null) {
                return;
            }
            a(false);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.Q.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? a.a.k.a.a.c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.O != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.S = colorStateList;
        this.T = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.U = mode;
        this.V = true;
        i();
    }

    public void setStartIconCheckable(boolean z) {
        this.G.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.G.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? a.a.k.a.a.c(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.G.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            j();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        a(this.G, onClickListener, this.M);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M = onLongClickListener;
        b(this.G, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.I = true;
            j();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.J != mode) {
            this.J = mode;
            this.K = true;
            j();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (d() != z) {
            this.G.setVisibility(z ? 0 : 8);
            C();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.d;
        if (editText != null) {
            u.a(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.F) {
            this.F = typeface;
            this.n0.b(typeface);
            this.f.a(typeface);
            TextView textView = this.j;
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface);
        }
    }
}
