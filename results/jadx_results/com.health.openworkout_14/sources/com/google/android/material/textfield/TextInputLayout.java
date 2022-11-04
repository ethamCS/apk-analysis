package com.google.android.material.textfield;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.z;
import b.g.l.t;
import com.google.android.material.internal.CheckableImageButton;
import d.a.a.a.a0.k;
import d.a.a.a.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private static final int J0 = j.i;
    private CharSequence A;
    private int A0;
    private boolean B;
    private int B0;
    private d.a.a.a.a0.g C;
    private int C0;
    private d.a.a.a.a0.g D;
    private boolean D0;
    private k E;
    final com.google.android.material.internal.a E0;
    private final int F;
    private boolean F0;
    private int G;
    private ValueAnimator G0;
    private final int H;
    private boolean H0;
    private int I;
    private boolean I0;
    private int J;
    private int K;
    private int L;
    private int M;
    private final Rect N;
    private final Rect O;
    private final RectF P;
    private Typeface Q;
    private final CheckableImageButton R;
    private ColorStateList S;
    private boolean T;
    private PorterDuff.Mode U;
    private boolean V;
    private Drawable W;
    private int a0;

    /* renamed from: b */
    private final FrameLayout f3268b;
    private View.OnLongClickListener b0;

    /* renamed from: c */
    private final LinearLayout f3269c;
    private final LinkedHashSet<f> c0;

    /* renamed from: d */
    private final LinearLayout f3270d;
    private int d0;

    /* renamed from: e */
    private final FrameLayout f3271e;
    private final SparseArray<com.google.android.material.textfield.e> e0;

    /* renamed from: f */
    EditText f3272f;
    private final CheckableImageButton f0;

    /* renamed from: g */
    private CharSequence f3273g;
    private final LinkedHashSet<g> g0;

    /* renamed from: h */
    private final com.google.android.material.textfield.f f3274h;
    private ColorStateList h0;
    boolean i;
    private boolean i0;
    private int j;
    private PorterDuff.Mode j0;
    private boolean k;
    private boolean k0;
    private TextView l;
    private Drawable l0;
    private int m;
    private int m0;
    private int n;
    private Drawable n0;
    private CharSequence o;
    private View.OnLongClickListener o0;
    private boolean p;
    private View.OnLongClickListener p0;
    private TextView q;
    private final CheckableImageButton q0;
    private ColorStateList r;
    private ColorStateList r0;
    private int s;
    private ColorStateList s0;
    private ColorStateList t;
    private ColorStateList t0;
    private ColorStateList u;
    private int u0;
    private CharSequence v;
    private int v0;
    private final TextView w;
    private int w0;
    private CharSequence x;
    private ColorStateList x0;
    private final TextView y;
    private int y0;
    private boolean z;
    private int z0;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.o0(!textInputLayout.I0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.i) {
                textInputLayout2.g0(editable.length());
            }
            if (TextInputLayout.this.p) {
                TextInputLayout.this.s0(editable.length());
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
            TextInputLayout.this.f0.performClick();
            TextInputLayout.this.f0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f3272f.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.E0.V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends b.g.l.a {

        /* renamed from: d */
        private final TextInputLayout f3279d;

        public e(TextInputLayout textInputLayout) {
            this.f3279d = textInputLayout;
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f3279d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f3279d.getHint();
            CharSequence helperText = this.f3279d.getHelperText();
            CharSequence error = this.f3279d.getError();
            int counterMaxLength = this.f3279d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f3279d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : "");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            sb3.append((Object) helperText);
            String sb4 = sb3.toString();
            if (z) {
                cVar.x0(text);
            } else if (!TextUtils.isEmpty(sb4)) {
                cVar.x0(sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.l0(sb4);
                } else {
                    if (z) {
                        sb4 = ((Object) text) + ", " + sb4;
                    }
                    cVar.x0(sb4);
                }
                cVar.u0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.m0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.h0(error);
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
    public static class h extends b.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d */
        CharSequence f3280d;

        /* renamed from: e */
        boolean f3281e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3280d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3281e = parcel.readInt() != 1 ? false : true;
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3280d) + "}";
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f3280d, parcel, i);
            parcel.writeInt(this.f3281e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.a.a.b.C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A() {
        Iterator<f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B(int i) {
        Iterator<g> it = this.g0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    private void C(Canvas canvas) {
        d.a.a.a.a0.g gVar = this.D;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.I;
            this.D.draw(canvas);
        }
    }

    private void D(Canvas canvas) {
        if (this.z) {
            this.E0.j(canvas);
        }
    }

    private void E(boolean z) {
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.G0.cancel();
        }
        if (!z || !this.F0) {
            this.E0.V(0.0f);
        } else {
            h(0.0f);
        }
        if (z() && ((com.google.android.material.textfield.c) this.C).i0()) {
            x();
        }
        this.D0 = true;
        I();
        u0();
        x0();
    }

    private int F(int i, boolean z) {
        int compoundPaddingLeft = i + this.f3272f.getCompoundPaddingLeft();
        return (this.v == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.w.getMeasuredWidth()) + this.w.getPaddingLeft();
    }

    private int G(int i, boolean z) {
        int compoundPaddingRight = i - this.f3272f.getCompoundPaddingRight();
        return (this.v == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.w.getMeasuredWidth() - this.w.getPaddingRight());
    }

    private boolean H() {
        return this.d0 != 0;
    }

    private void I() {
        TextView textView = this.q;
        if (textView == null || !this.p) {
            return;
        }
        textView.setText((CharSequence) null);
        this.q.setVisibility(4);
    }

    private boolean K() {
        return this.q0.getVisibility() == 0;
    }

    private boolean O() {
        return this.G == 1 && (Build.VERSION.SDK_INT < 16 || this.f3272f.getMinLines() <= 1);
    }

    private void Q() {
        o();
        U();
        y0();
        if (this.G != 0) {
            n0();
        }
    }

    private void R() {
        if (!z()) {
            return;
        }
        RectF rectF = this.P;
        this.E0.m(rectF, this.f3272f.getWidth(), this.f3272f.getGravity());
        k(rectF);
        rectF.offset(-getPaddingLeft(), -getPaddingTop());
        ((com.google.android.material.textfield.c) this.C).o0(rectF);
    }

    private static void S(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                S((ViewGroup) childAt, z);
            }
        }
    }

    private void T() {
        TextView textView = this.q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void U() {
        if (b0()) {
            t.l0(this.f3272f, this.C);
        }
    }

    private static void V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean J = t.J(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (J || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(J);
        checkableImageButton.setPressable(J);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        t.r0(checkableImageButton, i);
    }

    private static void W(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        V(checkableImageButton, onLongClickListener);
    }

    private static void X(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        V(checkableImageButton, onLongClickListener);
    }

    private boolean Z() {
        return (this.q0.getVisibility() == 0 || ((H() && J()) || this.x != null)) && this.f3270d.getMeasuredWidth() > 0;
    }

    private boolean a0() {
        return !(getStartIconDrawable() == null && this.v == null) && this.f3269c.getMeasuredWidth() > 0;
    }

    private boolean b0() {
        EditText editText = this.f3272f;
        return (editText == null || this.C == null || editText.getBackground() != null || this.G == 0) ? false : true;
    }

    private void c0() {
        TextView textView = this.q;
        if (textView == null || !this.p) {
            return;
        }
        textView.setText(this.o);
        this.q.setVisibility(0);
        this.q.bringToFront();
    }

    private void d0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            l();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f3274h.o());
        this.f0.setImageDrawable(mutate);
    }

    private void e0(Rect rect) {
        d.a.a.a.a0.g gVar = this.D;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.K, rect.right, i);
        }
    }

    private void f0() {
        if (this.l != null) {
            EditText editText = this.f3272f;
            g0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void g() {
        TextView textView = this.q;
        if (textView != null) {
            this.f3268b.addView(textView);
            this.q.setVisibility(0);
        }
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.e0.get(this.d0);
        return eVar != null ? eVar : this.e0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.q0.getVisibility() == 0) {
            return this.q0;
        }
        if (H() && J()) {
            return this.f0;
        }
        return null;
    }

    private static void h0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? d.a.a.a.i.b_res_0x7f100027 : d.a.a.a.i.a_res_0x7f100026, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void i() {
        d.a.a.a.a0.g gVar = this.C;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.E);
        if (v()) {
            this.C.b0(this.I, this.L);
        }
        int p = p();
        this.M = p;
        this.C.V(ColorStateList.valueOf(p));
        if (this.d0 == 3) {
            this.f3272f.getBackground().invalidateSelf();
        }
        j();
        invalidate();
    }

    private void i0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.l;
        if (textView != null) {
            Y(textView, this.k ? this.m : this.n);
            if (!this.k && (colorStateList2 = this.t) != null) {
                this.l.setTextColor(colorStateList2);
            }
            if (!this.k || (colorStateList = this.u) == null) {
                return;
            }
            this.l.setTextColor(colorStateList);
        }
    }

    private void j() {
        if (this.D == null) {
            return;
        }
        if (w()) {
            this.D.V(ColorStateList.valueOf(this.L));
        }
        invalidate();
    }

    private boolean j0() {
        boolean z;
        if (this.f3272f == null) {
            return false;
        }
        boolean z2 = true;
        if (a0()) {
            int measuredWidth = this.f3269c.getMeasuredWidth() - this.f3272f.getPaddingLeft();
            if (this.W == null || this.a0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.W = colorDrawable;
                this.a0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a2 = androidx.core.widget.i.a(this.f3272f);
            Drawable drawable = a2[0];
            Drawable drawable2 = this.W;
            if (drawable != drawable2) {
                androidx.core.widget.i.i(this.f3272f, drawable2, a2[1], a2[2], a2[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.W != null) {
                Drawable[] a3 = androidx.core.widget.i.a(this.f3272f);
                androidx.core.widget.i.i(this.f3272f, null, a3[1], a3[2], a3[3]);
                this.W = null;
                z = true;
            }
            z = false;
        }
        if (Z()) {
            int measuredWidth2 = this.y.getMeasuredWidth() - this.f3272f.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + b.g.l.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a4 = androidx.core.widget.i.a(this.f3272f);
            Drawable drawable3 = this.l0;
            if (drawable3 == null || this.m0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.l0 = colorDrawable2;
                    this.m0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a4[2];
                Drawable drawable5 = this.l0;
                if (drawable4 != drawable5) {
                    this.n0 = a4[2];
                    androidx.core.widget.i.i(this.f3272f, a4[0], a4[1], drawable5, a4[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.m0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.i.i(this.f3272f, a4[0], a4[1], this.l0, a4[3]);
            }
        } else if (this.l0 == null) {
            return z;
        } else {
            Drawable[] a5 = androidx.core.widget.i.a(this.f3272f);
            if (a5[2] == this.l0) {
                androidx.core.widget.i.i(this.f3272f, a5[0], a5[1], this.n0, a5[3]);
            } else {
                z2 = z;
            }
            this.l0 = null;
        }
        return z2;
    }

    private void k(RectF rectF) {
        float f2 = rectF.left;
        int i = this.F;
        rectF.left = f2 - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    private void l() {
        m(this.f0, this.i0, this.h0, this.k0, this.j0);
    }

    private boolean l0() {
        int max;
        if (this.f3272f != null && this.f3272f.getMeasuredHeight() < (max = Math.max(this.f3270d.getMeasuredHeight(), this.f3269c.getMeasuredHeight()))) {
            this.f3272f.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private void m(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void m0(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        androidx.core.graphics.drawable.a.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private void n() {
        m(this.R, this.T, this.S, this.V, this.U);
    }

    private void n0() {
        if (this.G != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3268b.getLayoutParams();
            int u = u();
            if (u == layoutParams.topMargin) {
                return;
            }
            layoutParams.topMargin = u;
            this.f3268b.requestLayout();
        }
    }

    private void o() {
        int i = this.G;
        if (i == 0) {
            this.C = null;
        } else if (i == 1) {
            this.C = new d.a.a.a.a0.g(this.E);
            this.D = new d.a.a.a.a0.g();
            return;
        } else if (i != 2) {
            throw new IllegalArgumentException(this.G + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.C = (!this.z || (this.C instanceof com.google.android.material.textfield.c)) ? new d.a.a.a.a0.g(this.E) : new com.google.android.material.textfield.c(this.E);
        }
        this.D = null;
    }

    private int p() {
        return this.G == 1 ? d.a.a.a.q.a.e(d.a.a.a.q.a.d(this, d.a.a.a.b.l_res_0x7f0400c4, 0), this.M) : this.M;
    }

    private void p0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3272f;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f3272f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f3274h.k();
        ColorStateList colorStateList2 = this.s0;
        if (colorStateList2 != null) {
            this.E0.K(colorStateList2);
            this.E0.R(this.s0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.s0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.C0) : this.C0;
            this.E0.K(ColorStateList.valueOf(colorForState));
            this.E0.R(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.E0.K(this.f3274h.p());
        } else {
            if (this.k && (textView = this.l) != null) {
                aVar = this.E0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.t0) != null) {
                aVar = this.E0;
            }
            aVar.K(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || k))) {
            if (!z2 && !this.D0) {
                return;
            }
            y(z);
        } else if (!z2 && this.D0) {
        } else {
            E(z);
        }
    }

    private Rect q(Rect rect) {
        int i;
        int i2;
        if (this.f3272f != null) {
            Rect rect2 = this.O;
            boolean z = t.y(this) == 1;
            rect2.bottom = rect.bottom;
            int i3 = this.G;
            if (i3 == 1) {
                rect2.left = F(rect.left, z);
                i = rect.top + this.H;
            } else if (i3 == 2) {
                rect2.left = rect.left + this.f3272f.getPaddingLeft();
                rect2.top = rect.top - u();
                i2 = rect.right - this.f3272f.getPaddingRight();
                rect2.right = i2;
                return rect2;
            } else {
                rect2.left = F(rect.left, z);
                i = getPaddingTop();
            }
            rect2.top = i;
            i2 = G(rect.right, z);
            rect2.right = i2;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void q0() {
        EditText editText;
        if (this.q == null || (editText = this.f3272f) == null) {
            return;
        }
        this.q.setGravity(editText.getGravity());
        this.q.setPadding(this.f3272f.getCompoundPaddingLeft(), this.f3272f.getCompoundPaddingTop(), this.f3272f.getCompoundPaddingRight(), this.f3272f.getCompoundPaddingBottom());
    }

    private int r(Rect rect, Rect rect2, float f2) {
        return O() ? (int) (rect2.top + f2) : rect.bottom - this.f3272f.getCompoundPaddingBottom();
    }

    private void r0() {
        EditText editText = this.f3272f;
        s0(editText == null ? 0 : editText.getText().length());
    }

    private int s(Rect rect, float f2) {
        return O() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f3272f.getCompoundPaddingTop();
    }

    public void s0(int i) {
        if (i != 0 || this.D0) {
            I();
        } else {
            c0();
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3272f == null) {
            if (this.d0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3272f = editText;
            Q();
            setTextInputAccessibilityDelegate(new e(this));
            this.E0.b0(this.f3272f.getTypeface());
            this.E0.T(this.f3272f.getTextSize());
            int gravity = this.f3272f.getGravity();
            this.E0.L((gravity & (-113)) | 48);
            this.E0.S(gravity);
            this.f3272f.addTextChangedListener(new a());
            if (this.s0 == null) {
                this.s0 = this.f3272f.getHintTextColors();
            }
            if (this.z) {
                if (TextUtils.isEmpty(this.A)) {
                    CharSequence hint = this.f3272f.getHint();
                    this.f3273g = hint;
                    setHint(hint);
                    this.f3272f.setHint((CharSequence) null);
                }
                this.B = true;
            }
            if (this.l != null) {
                g0(this.f3272f.getText().length());
            }
            k0();
            this.f3274h.e();
            this.f3269c.bringToFront();
            this.f3270d.bringToFront();
            this.f3271e.bringToFront();
            this.q0.bringToFront();
            A();
            t0();
            w0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            p0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.q0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f3271e;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        w0();
        if (!H()) {
            j0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A)) {
            this.A = charSequence;
            this.E0.Z(charSequence);
            if (this.D0) {
                return;
            }
            R();
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.p == z) {
            return;
        }
        if (z) {
            z zVar = new z(getContext());
            this.q = zVar;
            zVar.setId(d.a.a.a.f.A_res_0x7f0901d0);
            t.k0(this.q, 1);
            setPlaceholderTextAppearance(this.s);
            setPlaceholderTextColor(this.r);
            g();
        } else {
            T();
            this.q = null;
        }
        this.p = z;
    }

    private Rect t(Rect rect) {
        if (this.f3272f != null) {
            Rect rect2 = this.O;
            float u = this.E0.u();
            rect2.left = rect.left + this.f3272f.getCompoundPaddingLeft();
            rect2.top = s(rect, u);
            rect2.right = rect.right - this.f3272f.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, u);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        if (this.f3272f == null) {
            return;
        }
        t.u0(this.w, P() ? 0 : t.D(this.f3272f), this.f3272f.getCompoundPaddingTop(), 0, this.f3272f.getCompoundPaddingBottom());
    }

    private int u() {
        float o;
        if (!this.z) {
            return 0;
        }
        int i = this.G;
        if (i == 0 || i == 1) {
            o = this.E0.o();
        } else if (i != 2) {
            return 0;
        } else {
            o = this.E0.o() / 2.0f;
        }
        return (int) o;
    }

    private void u0() {
        this.w.setVisibility((this.v == null || M()) ? 8 : 0);
        j0();
    }

    private boolean v() {
        return this.G == 2 && w();
    }

    private void v0(boolean z, boolean z2) {
        int defaultColor = this.x0.getDefaultColor();
        int colorForState = this.x0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.x0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.L = colorForState2;
        } else if (z2) {
            this.L = colorForState;
        } else {
            this.L = defaultColor;
        }
    }

    private boolean w() {
        return this.I > -1 && this.L != 0;
    }

    private void w0() {
        if (this.f3272f == null) {
            return;
        }
        t.u0(this.y, 0, this.f3272f.getPaddingTop(), (J() || K()) ? 0 : t.C(this.f3272f), this.f3272f.getPaddingBottom());
    }

    private void x() {
        if (z()) {
            ((com.google.android.material.textfield.c) this.C).l0();
        }
    }

    private void x0() {
        int visibility = this.y.getVisibility();
        int i = 0;
        boolean z = this.x != null && !M();
        TextView textView = this.y;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.y.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        j0();
    }

    private void y(boolean z) {
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.G0.cancel();
        }
        if (!z || !this.F0) {
            this.E0.V(1.0f);
        } else {
            h(1.0f);
        }
        this.D0 = false;
        if (z()) {
            R();
        }
        r0();
        u0();
        x0();
    }

    private boolean z() {
        return this.z && !TextUtils.isEmpty(this.A) && (this.C instanceof com.google.android.material.textfield.c);
    }

    public boolean J() {
        return this.f3271e.getVisibility() == 0 && this.f0.getVisibility() == 0;
    }

    public boolean L() {
        return this.f3274h.x();
    }

    final boolean M() {
        return this.D0;
    }

    public boolean N() {
        return this.B;
    }

    public boolean P() {
        return this.R.getVisibility() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.i.n(r3, r4)     // Catch: java.lang.Exception -> L1b
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
            int r4 = d.a.a.a.j.a_res_0x7f110156
            androidx.core.widget.i.n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = d.a.a.a.c.a_res_0x7f060051
            int r4 = b.g.d.a.b(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Y(android.widget.TextView, int):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f3268b.addView(view, layoutParams2);
        this.f3268b.setLayoutParams(layoutParams);
        n0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f3273g == null || (editText = this.f3272f) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.B;
        this.B = false;
        CharSequence hint = editText.getHint();
        this.f3272f.setHint(this.f3273g);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f3272f.setHint(hint);
            this.B = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.I0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.H0) {
            return;
        }
        boolean z = true;
        this.H0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.E0;
        boolean Y = aVar != null ? aVar.Y(drawableState) | false : false;
        if (this.f3272f != null) {
            if (!t.O(this) || !isEnabled()) {
                z = false;
            }
            o0(z);
        }
        k0();
        y0();
        if (Y) {
            invalidate();
        }
        this.H0 = false;
    }

    public void e(f fVar) {
        this.c0.add(fVar);
        if (this.f3272f != null) {
            fVar.a(this);
        }
    }

    public void f(g gVar) {
        this.g0.add(gVar);
    }

    void g0(int i) {
        boolean z = this.k;
        int i2 = this.j;
        if (i2 == -1) {
            this.l.setText(String.valueOf(i));
            this.l.setContentDescription(null);
            this.k = false;
        } else {
            this.k = i > i2;
            h0(getContext(), this.l, i, this.j, this.k);
            if (z != this.k) {
                i0();
            }
            this.l.setText(b.g.j.a.c().j(getContext().getString(d.a.a.a.i.c_res_0x7f100028, Integer.valueOf(i), Integer.valueOf(this.j))));
        }
        if (this.f3272f == null || z == this.k) {
            return;
        }
        o0(false);
        y0();
        k0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3272f;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    public d.a.a.a.a0.g getBoxBackground() {
        int i = this.G;
        if (i == 1 || i == 2) {
            return this.C;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.M;
    }

    public int getBoxBackgroundMode() {
        return this.G;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.C.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.C.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.C.G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.C.F();
    }

    public int getBoxStrokeColor() {
        return this.w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.x0;
    }

    public int getBoxStrokeWidth() {
        return this.J;
    }

    public int getBoxStrokeWidthFocused() {
        return this.K;
    }

    public int getCounterMaxLength() {
        return this.j;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.i || !this.k || (textView = this.l) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.t;
    }

    public ColorStateList getCounterTextColor() {
        return this.t;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.s0;
    }

    public EditText getEditText() {
        return this.f3272f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f0.getDrawable();
    }

    public int getEndIconMode() {
        return this.d0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f0;
    }

    public CharSequence getError() {
        if (this.f3274h.w()) {
            return this.f3274h.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3274h.m();
    }

    public int getErrorCurrentTextColors() {
        return this.f3274h.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.q0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f3274h.o();
    }

    public CharSequence getHelperText() {
        if (this.f3274h.x()) {
            return this.f3274h.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f3274h.r();
    }

    public CharSequence getHint() {
        if (this.z) {
            return this.A;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.E0.o();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.E0.r();
    }

    public ColorStateList getHintTextColor() {
        return this.t0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.p) {
            return this.o;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.s;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.r;
    }

    public CharSequence getPrefixText() {
        return this.v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.w.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.w;
    }

    public CharSequence getStartIconContentDescription() {
        return this.R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.R.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.x;
    }

    public ColorStateList getSuffixTextColor() {
        return this.y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.y;
    }

    public Typeface getTypeface() {
        return this.Q;
    }

    void h(float f2) {
        if (this.E0.v() == f2) {
            return;
        }
        if (this.G0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.G0 = valueAnimator;
            valueAnimator.setInterpolator(d.a.a.a.l.a.f3641b);
            this.G0.setDuration(167L);
            this.G0.addUpdateListener(new d());
        }
        this.G0.setFloatValues(this.E0.v(), f2);
        this.G0.start();
    }

    public void k0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f3272f;
        if (editText == null || this.G != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.f3274h.k()) {
            currentTextColor = this.f3274h.o();
        } else if (!this.k || (textView = this.l) == null) {
            androidx.core.graphics.drawable.a.c(background);
            this.f3272f.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.j.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void o0(boolean z) {
        p0(z, false);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f3272f;
        if (editText != null) {
            Rect rect = this.N;
            com.google.android.material.internal.c.a(this, editText, rect);
            e0(rect);
            if (!this.z) {
                return;
            }
            this.E0.T(this.f3272f.getTextSize());
            int gravity = this.f3272f.getGravity();
            this.E0.L((gravity & (-113)) | 48);
            this.E0.S(gravity);
            this.E0.H(q(rect));
            this.E0.P(t(rect));
            this.E0.E();
            if (!z() || this.D0) {
                return;
            }
            R();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean l0 = l0();
        boolean j0 = j0();
        if (l0 || j0) {
            this.f3272f.post(new c());
        }
        q0();
        t0();
        w0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f3280d);
        if (hVar.f3281e) {
            this.f0.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f3274h.k()) {
            hVar.f3280d = getError();
        }
        hVar.f3281e = H() && this.f0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.M != i) {
            this.M = i;
            this.y0 = i;
            this.A0 = i;
            this.B0 = i;
            i();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.g.d.a.b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.y0 = defaultColor;
        this.M = defaultColor;
        this.z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        i();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        if (this.f3272f == null) {
            return;
        }
        Q();
    }

    public void setBoxStrokeColor(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            y0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.w0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            y0();
        }
        this.u0 = colorStateList.getDefaultColor();
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.v0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.w0 = defaultColor;
        y0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            y0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.J = i;
        y0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.K = i;
        y0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.i != z) {
            if (z) {
                z zVar = new z(getContext());
                this.l = zVar;
                zVar.setId(d.a.a.a.f.x_res_0x7f0901cd);
                Typeface typeface = this.Q;
                if (typeface != null) {
                    this.l.setTypeface(typeface);
                }
                this.l.setMaxLines(1);
                this.f3274h.d(this.l, 2);
                b.g.l.h.c((ViewGroup.MarginLayoutParams) this.l.getLayoutParams(), getResources().getDimensionPixelOffset(d.a.a.a.d.F));
                i0();
                f0();
            } else {
                this.f3274h.y(this.l, 2);
                this.l = null;
            }
            this.i = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.j != i) {
            if (i <= 0) {
                i = -1;
            }
            this.j = i;
            if (!this.i) {
                return;
            }
            f0();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.m != i) {
            this.m = i;
            i0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            i0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.n != i) {
            this.n = i;
            i0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            i0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.s0 = colorStateList;
        this.t0 = colorStateList;
        if (this.f3272f != null) {
            o0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        S(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.d0;
        this.d0 = i;
        B(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.G)) {
            getEndIconDelegate().a();
            l();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.G + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        W(this.f0, onClickListener, this.o0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.o0 = onLongClickListener;
        X(this.f0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.h0 != colorStateList) {
            this.h0 = colorStateList;
            this.i0 = true;
            l();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.j0 != mode) {
            this.j0 = mode;
            this.k0 = true;
            l();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (J() != z) {
            this.f0.setVisibility(z ? 0 : 8);
            w0();
            j0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f3274h.w()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f3274h.L(charSequence);
        } else {
            this.f3274h.s();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f3274h.A(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f3274h.B(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.q0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f3274h.w());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        W(this.q0, onClickListener, this.p0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.p0 = onLongClickListener;
        X(this.q0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        Drawable drawable = this.q0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.q0.getDrawable() != drawable) {
            this.q0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.q0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.q0.getDrawable() != drawable) {
            this.q0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f3274h.C(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f3274h.D(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (!L()) {
                return;
            }
            setHelperTextEnabled(false);
            return;
        }
        if (!L()) {
            setHelperTextEnabled(true);
        }
        this.f3274h.M(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f3274h.G(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f3274h.F(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f3274h.E(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.z) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.F0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.z) {
            this.z = z;
            if (!z) {
                this.B = false;
                if (!TextUtils.isEmpty(this.A) && TextUtils.isEmpty(this.f3272f.getHint())) {
                    this.f3272f.setHint(this.A);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f3272f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A)) {
                        setHint(hint);
                    }
                    this.f3272f.setHint((CharSequence) null);
                }
                this.B = true;
            }
            if (this.f3272f == null) {
                return;
            }
            n0();
        }
    }

    public void setHintTextAppearance(int i) {
        this.E0.I(i);
        this.t0 = this.E0.n();
        if (this.f3272f != null) {
            o0(false);
            n0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            if (this.s0 == null) {
                this.E0.K(colorStateList);
            }
            this.t0 = colorStateList;
            if (this.f3272f == null) {
                return;
            }
            o0(false);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.d0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.h0 = colorStateList;
        this.i0 = true;
        l();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.j0 = mode;
        this.k0 = true;
        l();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.p || !TextUtils.isEmpty(charSequence)) {
            if (!this.p) {
                setPlaceholderTextEnabled(true);
            }
            this.o = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        r0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.s = i;
        TextView textView = this.q;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            TextView textView = this.q;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.w.setText(charSequence);
        u0();
    }

    public void setPrefixTextAppearance(int i) {
        androidx.core.widget.i.n(this.w, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.w.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.R.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.R.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.R.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            n();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        W(this.R, onClickListener, this.b0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b0 = onLongClickListener;
        X(this.R, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            n();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            n();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (P() != z) {
            this.R.setVisibility(z ? 0 : 8);
            t0();
            j0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.y.setText(charSequence);
        x0();
    }

    public void setSuffixTextAppearance(int i) {
        androidx.core.widget.i.n(this.y, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f3272f;
        if (editText != null) {
            t.i0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.Q) {
            this.Q = typeface;
            this.E0.b0(typeface);
            this.f3274h.I(typeface);
            TextView textView = this.l;
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y0() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.y0():void");
    }
}
