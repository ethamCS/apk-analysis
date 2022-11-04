package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.h0;
import androidx.core.view.y;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q1.p;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: u5 */
    private static final int f7572u5 = b5.k.f5493l;
    private int A4;
    private int B4;
    private int C4;
    private int D4;
    private int E4;
    private int F4;
    private int G4;
    private final Rect H4;
    private final Rect I4;
    private final RectF J4;
    private Typeface K4;
    private Drawable L4;
    private int M4;
    private final LinkedHashSet<f> N4;
    private int O4;
    private final SparseArray<com.google.android.material.textfield.e> P4;
    private final CheckableImageButton Q4;
    private final LinkedHashSet<g> R4;
    private ColorStateList S4;
    private PorterDuff.Mode T4;
    private CharSequence U3;
    private Drawable U4;
    private int V3;
    private int V4;
    private int W3;
    private Drawable W4;
    private int X3;
    private View.OnLongClickListener X4;
    private int Y3;
    private View.OnLongClickListener Y4;
    private final com.google.android.material.textfield.g Z3;
    private final CheckableImageButton Z4;

    /* renamed from: a4 */
    boolean f7573a4;

    /* renamed from: a5 */
    private ColorStateList f7574a5;

    /* renamed from: b4 */
    private int f7575b4;

    /* renamed from: b5 */
    private PorterDuff.Mode f7576b5;

    /* renamed from: c */
    private final FrameLayout f7577c;

    /* renamed from: c4 */
    private boolean f7578c4;

    /* renamed from: c5 */
    private ColorStateList f7579c5;

    /* renamed from: d */
    private final k f7580d;

    /* renamed from: d4 */
    private TextView f7581d4;

    /* renamed from: d5 */
    private ColorStateList f7582d5;

    /* renamed from: e4 */
    private int f7583e4;

    /* renamed from: e5 */
    private int f7584e5;

    /* renamed from: f4 */
    private int f7585f4;

    /* renamed from: f5 */
    private int f7586f5;

    /* renamed from: g4 */
    private CharSequence f7587g4;

    /* renamed from: g5 */
    private int f7588g5;

    /* renamed from: h4 */
    private boolean f7589h4;

    /* renamed from: h5 */
    private ColorStateList f7590h5;

    /* renamed from: i4 */
    private TextView f7591i4;

    /* renamed from: i5 */
    private int f7592i5;

    /* renamed from: j4 */
    private ColorStateList f7593j4;

    /* renamed from: j5 */
    private int f7594j5;

    /* renamed from: k4 */
    private int f7595k4;

    /* renamed from: k5 */
    private int f7596k5;

    /* renamed from: l4 */
    private q1.d f7597l4;

    /* renamed from: l5 */
    private int f7598l5;

    /* renamed from: m4 */
    private q1.d f7599m4;

    /* renamed from: m5 */
    private int f7600m5;

    /* renamed from: n4 */
    private ColorStateList f7601n4;

    /* renamed from: n5 */
    private boolean f7602n5;

    /* renamed from: o4 */
    private ColorStateList f7603o4;

    /* renamed from: o5 */
    final com.google.android.material.internal.b f7604o5;

    /* renamed from: p4 */
    private CharSequence f7605p4;

    /* renamed from: p5 */
    private boolean f7606p5;

    /* renamed from: q */
    private final LinearLayout f7607q;

    /* renamed from: q4 */
    private final TextView f7608q4;

    /* renamed from: q5 */
    private boolean f7609q5;

    /* renamed from: r4 */
    private boolean f7610r4;

    /* renamed from: r5 */
    private ValueAnimator f7611r5;

    /* renamed from: s4 */
    private CharSequence f7612s4;

    /* renamed from: s5 */
    private boolean f7613s5;

    /* renamed from: t4 */
    private boolean f7614t4;

    /* renamed from: t5 */
    private boolean f7615t5;

    /* renamed from: u4 */
    private t5.g f7616u4;

    /* renamed from: v4 */
    private t5.g f7617v4;

    /* renamed from: w4 */
    private t5.g f7618w4;

    /* renamed from: x */
    private final FrameLayout f7619x;

    /* renamed from: x4 */
    private t5.k f7620x4;

    /* renamed from: y */
    EditText f7621y;

    /* renamed from: y4 */
    private boolean f7622y4;

    /* renamed from: z4 */
    private final int f7623z4;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w0(!textInputLayout.f7615t5);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f7573a4) {
                textInputLayout2.m0(editable.length());
            }
            if (TextInputLayout.this.f7589h4) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.Q4.performClick();
            TextInputLayout.this.Q4.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f7621y.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f7604o5.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: d */
        private final TextInputLayout f7628d;

        public e(TextInputLayout textInputLayout) {
            this.f7628d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
            if (r2 != null) goto L25;
         */
        @Override // androidx.core.view.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(android.view.View r13, androidx.core.view.accessibility.d r14) {
            /*
                r12 = this;
                super.g(r13, r14)
                com.google.android.material.textfield.TextInputLayout r13 = r12.f7628d
                android.widget.EditText r13 = r13.getEditText()
                if (r13 == 0) goto L10
                android.text.Editable r13 = r13.getText()
                goto L11
            L10:
                r13 = 0
            L11:
                com.google.android.material.textfield.TextInputLayout r0 = r12.f7628d
                java.lang.CharSequence r0 = r0.getHint()
                com.google.android.material.textfield.TextInputLayout r1 = r12.f7628d
                java.lang.CharSequence r1 = r1.getError()
                com.google.android.material.textfield.TextInputLayout r2 = r12.f7628d
                java.lang.CharSequence r2 = r2.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r3 = r12.f7628d
                int r3 = r3.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r4 = r12.f7628d
                java.lang.CharSequence r4 = r4.getCounterOverflowDescription()
                boolean r5 = android.text.TextUtils.isEmpty(r13)
                r6 = 1
                r5 = r5 ^ r6
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                r7 = r7 ^ r6
                com.google.android.material.textfield.TextInputLayout r8 = r12.f7628d
                boolean r8 = r8.N()
                r8 = r8 ^ r6
                boolean r9 = android.text.TextUtils.isEmpty(r1)
                r9 = r9 ^ r6
                if (r9 != 0) goto L51
                boolean r10 = android.text.TextUtils.isEmpty(r4)
                if (r10 != 0) goto L4f
                goto L51
            L4f:
                r10 = 0
                goto L52
            L51:
                r10 = r6
            L52:
                if (r7 == 0) goto L59
                java.lang.String r0 = r0.toString()
                goto L5b
            L59:
                java.lang.String r0 = ""
            L5b:
                com.google.android.material.textfield.TextInputLayout r7 = r12.f7628d
                com.google.android.material.textfield.k r7 = com.google.android.material.textfield.TextInputLayout.e(r7)
                r7.v(r14)
                java.lang.String r7 = ", "
                if (r5 == 0) goto L6c
                r14.u0(r13)
                goto L91
            L6c:
                boolean r11 = android.text.TextUtils.isEmpty(r0)
                if (r11 != 0) goto L8c
                r14.u0(r0)
                if (r8 == 0) goto L91
                if (r2 == 0) goto L91
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r0)
                r8.append(r7)
                r8.append(r2)
                java.lang.String r2 = r8.toString()
                goto L8e
            L8c:
                if (r2 == 0) goto L91
            L8e:
                r14.u0(r2)
            L91:
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto Lbd
                int r2 = android.os.Build.VERSION.SDK_INT
                r8 = 26
                if (r2 < r8) goto La1
                r14.h0(r0)
                goto Lb8
            La1:
                if (r5 == 0) goto Lb5
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                r2.append(r7)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            Lb5:
                r14.u0(r0)
            Lb8:
                r0 = r5 ^ 1
                r14.r0(r0)
            Lbd:
                if (r13 == 0) goto Lc6
                int r13 = r13.length()
                if (r13 != r3) goto Lc6
                goto Lc7
            Lc6:
                r3 = -1
            Lc7:
                r14.j0(r3)
                if (r10 == 0) goto Ld3
                if (r9 == 0) goto Lcf
                goto Ld0
            Lcf:
                r1 = r4
            Ld0:
                r14.d0(r1)
            Ld3:
                com.google.android.material.textfield.TextInputLayout r13 = r12.f7628d
                com.google.android.material.textfield.g r13 = com.google.android.material.textfield.TextInputLayout.f(r13)
                android.view.View r13 = r13.s()
                if (r13 == 0) goto Le2
                r14.i0(r13)
            Le2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.g(android.view.View, androidx.core.view.accessibility.d):void");
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    /* loaded from: classes.dex */
    public static class h extends v0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        CharSequence U3;
        CharSequence V3;

        /* renamed from: q */
        CharSequence f7629q;

        /* renamed from: x */
        boolean f7630x;

        /* renamed from: y */
        CharSequence f7631y;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<h> {
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
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7629q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7630x = parcel.readInt() != 1 ? false : true;
            this.f7631y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.U3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.V3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f7629q) + " hint=" + ((Object) this.f7631y) + " helperText=" + ((Object) this.U3) + " placeholderText=" + ((Object) this.V3) + "}";
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f7629q, parcel, i10);
            parcel.writeInt(this.f7630x ? 1 : 0);
            TextUtils.writeToParcel(this.f7631y, parcel, i10);
            TextUtils.writeToParcel(this.U3, parcel, i10);
            TextUtils.writeToParcel(this.V3, parcel, i10);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.M_res_0x7f0303fe);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private boolean A() {
        return this.f7610r4 && !TextUtils.isEmpty(this.f7612s4) && (this.f7616u4 instanceof com.google.android.material.textfield.c);
    }

    public void A0(int i10) {
        if (i10 != 0 || this.f7602n5) {
            J();
        } else {
            h0();
        }
    }

    private void B() {
        Iterator<f> it = this.N4.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f7590h5.getDefaultColor();
        int colorForState = this.f7590h5.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f7590h5.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.F4 = colorForState2;
        } else if (z11) {
            this.F4 = colorForState;
        } else {
            this.F4 = defaultColor;
        }
    }

    private void C(int i10) {
        Iterator<g> it = this.R4.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10);
        }
    }

    private void C0() {
        if (this.f7621y == null) {
            return;
        }
        y.B0(this.f7608q4, getContext().getResources().getDimensionPixelSize(b5.d.f5479x), this.f7621y.getPaddingTop(), (K() || L()) ? 0 : y.F(this.f7621y), this.f7621y.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        t5.g gVar;
        if (this.f7618w4 == null || (gVar = this.f7617v4) == null) {
            return;
        }
        gVar.draw(canvas);
        if (!this.f7621y.isFocused()) {
            return;
        }
        Rect bounds = this.f7618w4.getBounds();
        Rect bounds2 = this.f7617v4.getBounds();
        float x10 = this.f7604o5.x();
        int centerX = bounds2.centerX();
        bounds.left = c5.a.c(centerX, bounds2.left, x10);
        bounds.right = c5.a.c(centerX, bounds2.right, x10);
        this.f7618w4.draw(canvas);
    }

    private void D0() {
        int visibility = this.f7608q4.getVisibility();
        boolean z10 = false;
        int i10 = (this.f7605p4 == null || N()) ? 8 : 0;
        if (visibility != i10) {
            com.google.android.material.textfield.e endIconDelegate = getEndIconDelegate();
            if (i10 == 0) {
                z10 = true;
            }
            endIconDelegate.c(z10);
        }
        t0();
        this.f7608q4.setVisibility(i10);
        q0();
    }

    private void E(Canvas canvas) {
        if (this.f7610r4) {
            this.f7604o5.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f7611r5;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7611r5.cancel();
        }
        if (!z10 || !this.f7609q5) {
            this.f7604o5.d0(0.0f);
        } else {
            k(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.c) this.f7616u4).m0()) {
            x();
        }
        this.f7602n5 = true;
        J();
        this.f7580d.i(true);
        D0();
    }

    private int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f7621y.getCompoundPaddingLeft();
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f7621y.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean I() {
        return this.O4 != 0;
    }

    private void J() {
        TextView textView = this.f7591i4;
        if (textView == null || !this.f7589h4) {
            return;
        }
        textView.setText((CharSequence) null);
        p.a(this.f7577c, this.f7599m4);
        this.f7591i4.setVisibility(4);
    }

    private boolean L() {
        return this.Z4.getVisibility() == 0;
    }

    private boolean P() {
        return this.A4 == 1 && this.f7621y.getMinLines() <= 1;
    }

    private void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.A4 != 0) {
            v0();
        }
    }

    private void R() {
        if (!A()) {
            return;
        }
        RectF rectF = this.J4;
        this.f7604o5.o(rectF, this.f7621y.getWidth(), this.f7621y.getGravity());
        n(rectF);
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.C4);
        ((com.google.android.material.textfield.c) this.f7616u4).p0(rectF);
    }

    private void S() {
        if (!A() || this.f7602n5) {
            return;
        }
        x();
        R();
    }

    private static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    private void X() {
        TextView textView = this.f7591i4;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            y.s0(this.f7621y, this.f7616u4);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean N = y.N(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        boolean z11 = onLongClickListener != null;
        if (N || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(N);
        checkableImageButton.setPressable(N);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i10 = 2;
        }
        y.y0(checkableImageButton, i10);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        return (this.Z4.getVisibility() == 0 || ((I() && K()) || this.f7605p4 != null)) && this.f7607q.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f7580d.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        EditText editText = this.f7621y;
        return (editText == null || this.f7616u4 == null || editText.getBackground() != null || this.A4 == 0) ? false : true;
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.P4.get(this.O4);
        return eVar != null ? eVar : this.P4.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.Z4.getVisibility() == 0) {
            return this.Z4;
        }
        if (I() && K()) {
            return this.Q4;
        }
        return null;
    }

    private void h0() {
        if (this.f7591i4 == null || !this.f7589h4 || TextUtils.isEmpty(this.f7587g4)) {
            return;
        }
        this.f7591i4.setText(this.f7587g4);
        p.a(this.f7577c, this.f7597l4);
        this.f7591i4.setVisibility(0);
        this.f7591i4.bringToFront();
        announceForAccessibility(this.f7587g4);
    }

    private void i() {
        TextView textView = this.f7591i4;
        if (textView != null) {
            this.f7577c.addView(textView);
            this.f7591i4.setVisibility(0);
        }
    }

    private void i0(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            com.google.android.material.textfield.f.a(this, this.Q4, this.S4, this.T4);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.Z3.p());
        this.Q4.setImageDrawable(mutate);
    }

    private void j() {
        EditText editText;
        int G;
        int dimensionPixelSize;
        int F;
        Resources resources;
        int i10;
        if (this.f7621y == null || this.A4 != 1) {
            return;
        }
        if (q5.c.h(getContext())) {
            editText = this.f7621y;
            G = y.G(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(b5.d.f5473r);
            F = y.F(this.f7621y);
            resources = getResources();
            i10 = b5.d.f5472q;
        } else if (!q5.c.g(getContext())) {
            return;
        } else {
            editText = this.f7621y;
            G = y.G(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(b5.d.f5471p);
            F = y.F(this.f7621y);
            resources = getResources();
            i10 = b5.d.o_res_0x7f06017b;
        }
        y.B0(editText, G, dimensionPixelSize, F, resources.getDimensionPixelSize(i10));
    }

    private void j0() {
        Resources resources;
        int i10;
        if (this.A4 == 1) {
            if (q5.c.h(getContext())) {
                resources = getResources();
                i10 = b5.d.f5475t;
            } else if (!q5.c.g(getContext())) {
                return;
            } else {
                resources = getResources();
                i10 = b5.d.f5474s;
            }
            this.B4 = resources.getDimensionPixelSize(i10);
        }
    }

    private void k0(Rect rect) {
        t5.g gVar = this.f7617v4;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.D4, rect.right, i10);
        }
        t5.g gVar2 = this.f7618w4;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.E4, rect.right, i11);
        }
    }

    private void l() {
        t5.g gVar = this.f7616u4;
        if (gVar == null) {
            return;
        }
        t5.k E = gVar.E();
        t5.k kVar = this.f7620x4;
        if (E != kVar) {
            this.f7616u4.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.f7616u4.f0(this.C4, this.F4);
        }
        int p10 = p();
        this.G4 = p10;
        this.f7616u4.Z(ColorStateList.valueOf(p10));
        if (this.O4 == 3) {
            this.f7621y.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void l0() {
        if (this.f7581d4 != null) {
            EditText editText = this.f7621y;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        if (this.f7617v4 == null || this.f7618w4 == null) {
            return;
        }
        if (w()) {
            this.f7617v4.Z(ColorStateList.valueOf(this.f7621y.isFocused() ? this.f7584e5 : this.F4));
            this.f7618w4.Z(ColorStateList.valueOf(this.F4));
        }
        invalidate();
    }

    private void n(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f7623z4;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private static void n0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? b5.j.c_res_0x7f1000e0 : b5.j.b_res_0x7f1000df, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void o() {
        int i10 = this.A4;
        if (i10 == 0) {
            this.f7616u4 = null;
        } else if (i10 == 1) {
            this.f7616u4 = new t5.g(this.f7620x4);
            this.f7617v4 = new t5.g();
            this.f7618w4 = new t5.g();
            return;
        } else if (i10 != 2) {
            throw new IllegalArgumentException(this.A4 + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.f7616u4 = (!this.f7610r4 || (this.f7616u4 instanceof com.google.android.material.textfield.c)) ? new t5.g(this.f7620x4) : new com.google.android.material.textfield.c(this.f7620x4);
        }
        this.f7617v4 = null;
        this.f7618w4 = null;
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f7581d4;
        if (textView != null) {
            d0(textView, this.f7578c4 ? this.f7583e4 : this.f7585f4);
            if (!this.f7578c4 && (colorStateList2 = this.f7601n4) != null) {
                this.f7581d4.setTextColor(colorStateList2);
            }
            if (!this.f7578c4 || (colorStateList = this.f7603o4) == null) {
                return;
            }
            this.f7581d4.setTextColor(colorStateList);
        }
    }

    private int p() {
        return this.A4 == 1 ? i5.a.g(i5.a.e(this, b5.b.m_res_0x7f0300fb, 0), this.G4) : this.G4;
    }

    private void p0() {
        if (this.O4 == 3 && this.A4 == 2) {
            ((com.google.android.material.textfield.d) this.P4.get(3)).O((AutoCompleteTextView) this.f7621y);
        }
    }

    private Rect q(Rect rect) {
        int i10;
        int i11;
        if (this.f7621y != null) {
            Rect rect2 = this.I4;
            boolean e10 = o.e(this);
            rect2.bottom = rect.bottom;
            int i12 = this.A4;
            if (i12 == 1) {
                rect2.left = G(rect.left, e10);
                i10 = rect.top + this.B4;
            } else if (i12 == 2) {
                rect2.left = rect.left + this.f7621y.getPaddingLeft();
                rect2.top = rect.top - u();
                i11 = rect.right - this.f7621y.getPaddingRight();
                rect2.right = i11;
                return rect2;
            } else {
                rect2.left = G(rect.left, e10);
                i10 = getPaddingTop();
            }
            rect2.top = i10;
            i11 = H(rect.right, e10);
            rect2.right = i11;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int r(Rect rect, Rect rect2, float f10) {
        return P() ? (int) (rect2.top + f10) : rect.bottom - this.f7621y.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f10) {
        return P() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f7621y.getCompoundPaddingTop();
    }

    private boolean s0() {
        int max;
        if (this.f7621y != null && this.f7621y.getMeasuredHeight() < (max = Math.max(this.f7607q.getMeasuredHeight(), this.f7580d.getMeasuredHeight()))) {
            this.f7621y.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private void setEditText(EditText editText) {
        if (this.f7621y == null) {
            if (this.O4 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f7621y = editText;
            int i10 = this.V3;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.X3);
            }
            int i11 = this.W3;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.Y3);
            }
            Q();
            setTextInputAccessibilityDelegate(new e(this));
            this.f7604o5.j0(this.f7621y.getTypeface());
            this.f7604o5.b0(this.f7621y.getTextSize());
            this.f7604o5.X(this.f7621y.getLetterSpacing());
            int gravity = this.f7621y.getGravity();
            this.f7604o5.S((gravity & (-113)) | 48);
            this.f7604o5.a0(gravity);
            this.f7621y.addTextChangedListener(new a());
            if (this.f7579c5 == null) {
                this.f7579c5 = this.f7621y.getHintTextColors();
            }
            if (this.f7610r4) {
                if (TextUtils.isEmpty(this.f7612s4)) {
                    CharSequence hint = this.f7621y.getHint();
                    this.U3 = hint;
                    setHint(hint);
                    this.f7621y.setHint((CharSequence) null);
                }
                this.f7614t4 = true;
            }
            if (this.f7581d4 != null) {
                m0(this.f7621y.getText().length());
            }
            r0();
            this.Z3.f();
            this.f7580d.bringToFront();
            this.f7607q.bringToFront();
            this.f7619x.bringToFront();
            this.Z4.bringToFront();
            B();
            C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f7612s4)) {
            this.f7612s4 = charSequence;
            this.f7604o5.h0(charSequence);
            if (this.f7602n5) {
                return;
            }
            R();
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f7589h4 == z10) {
            return;
        }
        if (z10) {
            i();
        } else {
            X();
            this.f7591i4 = null;
        }
        this.f7589h4 = z10;
    }

    private Rect t(Rect rect) {
        if (this.f7621y != null) {
            Rect rect2 = this.I4;
            float w9 = this.f7604o5.w();
            rect2.left = rect.left + this.f7621y.getCompoundPaddingLeft();
            rect2.top = s(rect, w9);
            rect2.right = rect.right - this.f7621y.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, w9);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        int i10 = 8;
        this.f7619x.setVisibility((this.Q4.getVisibility() != 0 || L()) ? 8 : 0);
        boolean z10 = K() || L() || !((this.f7605p4 == null || N()) ? true : false);
        LinearLayout linearLayout = this.f7607q;
        if (z10) {
            i10 = 0;
        }
        linearLayout.setVisibility(i10);
    }

    private int u() {
        float q10;
        if (!this.f7610r4) {
            return 0;
        }
        int i10 = this.A4;
        if (i10 == 0) {
            q10 = this.f7604o5.q();
        } else if (i10 != 2) {
            return 0;
        } else {
            q10 = this.f7604o5.q() / 2.0f;
        }
        return (int) q10;
    }

    private void u0() {
        int i10 = 0;
        boolean z10 = getErrorIconDrawable() != null && this.Z3.z() && this.Z3.l();
        CheckableImageButton checkableImageButton = this.Z4;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        t0();
        C0();
        if (!I()) {
            q0();
        }
    }

    private boolean v() {
        return this.A4 == 2 && w();
    }

    private void v0() {
        if (this.A4 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7577c.getLayoutParams();
            int u10 = u();
            if (u10 == layoutParams.topMargin) {
                return;
            }
            layoutParams.topMargin = u10;
            this.f7577c.requestLayout();
        }
    }

    private boolean w() {
        return this.C4 > -1 && this.F4 != 0;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.c) this.f7616u4).n0();
        }
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        com.google.android.material.internal.b bVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f7621y;
        boolean z12 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f7621y;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean l10 = this.Z3.l();
        ColorStateList colorStateList2 = this.f7579c5;
        if (colorStateList2 != null) {
            this.f7604o5.R(colorStateList2);
            this.f7604o5.Z(this.f7579c5);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f7579c5;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f7600m5) : this.f7600m5;
            this.f7604o5.R(ColorStateList.valueOf(colorForState));
            this.f7604o5.Z(ColorStateList.valueOf(colorForState));
        } else if (l10) {
            this.f7604o5.R(this.Z3.q());
        } else {
            if (this.f7578c4 && (textView = this.f7581d4) != null) {
                bVar = this.f7604o5;
                colorStateList = textView.getTextColors();
            } else if (z13 && (colorStateList = this.f7582d5) != null) {
                bVar = this.f7604o5;
            }
            bVar.R(colorStateList);
        }
        if (z12 || !this.f7606p5 || (isEnabled() && z13)) {
            if (!z11 && !this.f7602n5) {
                return;
            }
            y(z10);
        } else if (!z11 && this.f7602n5) {
        } else {
            F(z10);
        }
    }

    private void y(boolean z10) {
        ValueAnimator valueAnimator = this.f7611r5;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7611r5.cancel();
        }
        if (!z10 || !this.f7609q5) {
            this.f7604o5.d0(1.0f);
        } else {
            k(1.0f);
        }
        this.f7602n5 = false;
        if (A()) {
            R();
        }
        z0();
        this.f7580d.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.f7591i4 == null || (editText = this.f7621y) == null) {
            return;
        }
        this.f7591i4.setGravity(editText.getGravity());
        this.f7591i4.setPadding(this.f7621y.getCompoundPaddingLeft(), this.f7621y.getCompoundPaddingTop(), this.f7621y.getCompoundPaddingRight(), this.f7621y.getCompoundPaddingBottom());
    }

    private q1.d z() {
        q1.d dVar = new q1.d();
        dVar.b0(87L);
        dVar.d0(c5.a.f6267a);
        return dVar;
    }

    private void z0() {
        EditText editText = this.f7621y;
        A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E0() {
        /*
            r5 = this;
            t5.g r0 = r5.f7616u4
            if (r0 == 0) goto Lcf
            int r0 = r5.A4
            if (r0 != 0) goto La
            goto Lcf
        La:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r5.f7621y
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L30
            android.widget.EditText r3 = r5.f7621y
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L3c
            int r3 = r5.f7600m5
        L39:
            r5.F4 = r3
            goto L72
        L3c:
            com.google.android.material.textfield.g r3 = r5.Z3
            boolean r3 = r3.l()
            if (r3 == 0) goto L53
            android.content.res.ColorStateList r3 = r5.f7590h5
            if (r3 == 0) goto L4c
        L48:
            r5.B0(r0, r1)
            goto L72
        L4c:
            com.google.android.material.textfield.g r3 = r5.Z3
            int r3 = r3.p()
            goto L39
        L53:
            boolean r3 = r5.f7578c4
            if (r3 == 0) goto L65
            android.widget.TextView r3 = r5.f7581d4
            if (r3 == 0) goto L65
            android.content.res.ColorStateList r4 = r5.f7590h5
            if (r4 == 0) goto L60
            goto L48
        L60:
            int r3 = r3.getCurrentTextColor()
            goto L39
        L65:
            if (r0 == 0) goto L6a
            int r3 = r5.f7588g5
            goto L39
        L6a:
            if (r1 == 0) goto L6f
            int r3 = r5.f7586f5
            goto L39
        L6f:
            int r3 = r5.f7584e5
            goto L39
        L72:
            r5.u0()
            r5.V()
            r5.W()
            r5.U()
            com.google.android.material.textfield.e r3 = r5.getEndIconDelegate()
            boolean r3 = r3.d()
            if (r3 == 0) goto L91
            com.google.android.material.textfield.g r3 = r5.Z3
            boolean r3 = r3.l()
            r5.i0(r3)
        L91:
            int r3 = r5.A4
            r4 = 2
            if (r3 != r4) goto Lae
            int r3 = r5.C4
            if (r0 == 0) goto La3
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto La3
            int r4 = r5.E4
            goto La5
        La3:
            int r4 = r5.D4
        La5:
            r5.C4 = r4
            int r4 = r5.C4
            if (r4 == r3) goto Lae
            r5.S()
        Lae:
            int r3 = r5.A4
            if (r3 != r2) goto Lcc
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto Lbd
            int r0 = r5.f7594j5
        Lba:
            r5.G4 = r0
            goto Lcc
        Lbd:
            if (r1 == 0) goto Lc4
            if (r0 != 0) goto Lc4
            int r0 = r5.f7598l5
            goto Lba
        Lc4:
            if (r0 == 0) goto Lc9
            int r0 = r5.f7596k5
            goto Lba
        Lc9:
            int r0 = r5.f7592i5
            goto Lba
        Lcc:
            r5.l()
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E0():void");
    }

    public boolean K() {
        return this.f7619x.getVisibility() == 0 && this.Q4.getVisibility() == 0;
    }

    public boolean M() {
        return this.Z3.A();
    }

    final boolean N() {
        return this.f7602n5;
    }

    public boolean O() {
        return this.f7614t4;
    }

    public void U() {
        com.google.android.material.textfield.f.c(this, this.Q4, this.S4);
    }

    public void V() {
        com.google.android.material.textfield.f.c(this, this.Z4, this.f7574a5);
    }

    public void W() {
        this.f7580d.j();
    }

    public void Y(float f10, float f11, float f12, float f13) {
        boolean e10 = o.e(this);
        this.f7622y4 = e10;
        float f14 = e10 ? f11 : f10;
        if (!e10) {
            f10 = f11;
        }
        float f15 = e10 ? f13 : f12;
        if (!e10) {
            f12 = f13;
        }
        t5.g gVar = this.f7616u4;
        if (gVar != null && gVar.H() == f14 && this.f7616u4.I() == f10 && this.f7616u4.s() == f15 && this.f7616u4.t() == f12) {
            return;
        }
        this.f7620x4 = this.f7620x4.v().A(f14).E(f10).s(f15).w(f12).m();
        l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f7577c.addView(view, layoutParams2);
        this.f7577c.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    public void d0(TextView textView, int i10) {
        boolean z10 = true;
        try {
            androidx.core.widget.j.o(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            androidx.core.widget.j.o(textView, b5.k.c_res_0x7f1101b7);
            textView.setTextColor(androidx.core.content.a.b(getContext(), b5.c.a_res_0x7f05008d));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f7621y;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.U3 != null) {
            boolean z10 = this.f7614t4;
            this.f7614t4 = false;
            CharSequence hint = editText.getHint();
            this.f7621y.setHint(this.U3);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f7621y.setHint(hint);
                this.f7614t4 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f7577c.getChildCount());
        for (int i11 = 0; i11 < this.f7577c.getChildCount(); i11++) {
            View childAt = this.f7577c.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f7621y) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f7615t5 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f7615t5 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f7613s5) {
            return;
        }
        boolean z10 = true;
        this.f7613s5 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f7604o5;
        boolean g02 = bVar != null ? bVar.g0(drawableState) | false : false;
        if (this.f7621y != null) {
            if (!y.S(this) || !isEnabled()) {
                z10 = false;
            }
            w0(z10);
        }
        r0();
        E0();
        if (g02) {
            invalidate();
        }
        this.f7613s5 = false;
    }

    public void g(f fVar) {
        this.N4.add(fVar);
        if (this.f7621y != null) {
            fVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f7621y;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    public t5.g getBoxBackground() {
        int i10 = this.A4;
        if (i10 == 1 || i10 == 2) {
            return this.f7616u4;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.G4;
    }

    public int getBoxBackgroundMode() {
        return this.A4;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.B4;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (o.e(this) ? this.f7620x4.j() : this.f7620x4.l()).a(this.J4);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (o.e(this) ? this.f7620x4.l() : this.f7620x4.j()).a(this.J4);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (o.e(this) ? this.f7620x4.r() : this.f7620x4.t()).a(this.J4);
    }

    public float getBoxCornerRadiusTopStart() {
        return (o.e(this) ? this.f7620x4.t() : this.f7620x4.r()).a(this.J4);
    }

    public int getBoxStrokeColor() {
        return this.f7588g5;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f7590h5;
    }

    public int getBoxStrokeWidth() {
        return this.D4;
    }

    public int getBoxStrokeWidthFocused() {
        return this.E4;
    }

    public int getCounterMaxLength() {
        return this.f7575b4;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f7573a4 || !this.f7578c4 || (textView = this.f7581d4) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f7601n4;
    }

    public ColorStateList getCounterTextColor() {
        return this.f7601n4;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f7579c5;
    }

    public EditText getEditText() {
        return this.f7621y;
    }

    public CharSequence getEndIconContentDescription() {
        return this.Q4.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.Q4.getDrawable();
    }

    public int getEndIconMode() {
        return this.O4;
    }

    public CheckableImageButton getEndIconView() {
        return this.Q4;
    }

    public CharSequence getError() {
        if (this.Z3.z()) {
            return this.Z3.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.Z3.n();
    }

    public int getErrorCurrentTextColors() {
        return this.Z3.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.Z4.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.Z3.p();
    }

    public CharSequence getHelperText() {
        if (this.Z3.A()) {
            return this.Z3.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.Z3.t();
    }

    public CharSequence getHint() {
        if (this.f7610r4) {
            return this.f7612s4;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f7604o5.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f7604o5.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f7582d5;
    }

    public int getMaxEms() {
        return this.W3;
    }

    public int getMaxWidth() {
        return this.Y3;
    }

    public int getMinEms() {
        return this.V3;
    }

    public int getMinWidth() {
        return this.X3;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.Q4.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.Q4.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f7589h4) {
            return this.f7587g4;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f7595k4;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f7593j4;
    }

    public CharSequence getPrefixText() {
        return this.f7580d.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f7580d.b();
    }

    public TextView getPrefixTextView() {
        return this.f7580d.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7580d.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f7580d.e();
    }

    public CharSequence getSuffixText() {
        return this.f7605p4;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f7608q4.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f7608q4;
    }

    public Typeface getTypeface() {
        return this.K4;
    }

    public void h(g gVar) {
        this.R4.add(gVar);
    }

    void k(float f10) {
        if (this.f7604o5.x() == f10) {
            return;
        }
        if (this.f7611r5 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7611r5 = valueAnimator;
            valueAnimator.setInterpolator(c5.a.f6268b);
            this.f7611r5.setDuration(167L);
            this.f7611r5.addUpdateListener(new d());
        }
        this.f7611r5.setFloatValues(this.f7604o5.x(), f10);
        this.f7611r5.start();
    }

    void m0(int i10) {
        boolean z10 = this.f7578c4;
        int i11 = this.f7575b4;
        if (i11 == -1) {
            this.f7581d4.setText(String.valueOf(i10));
            this.f7581d4.setContentDescription(null);
            this.f7578c4 = false;
        } else {
            this.f7578c4 = i10 > i11;
            n0(getContext(), this.f7581d4, i10, this.f7575b4, this.f7578c4);
            if (z10 != this.f7578c4) {
                o0();
            }
            this.f7581d4.setText(androidx.core.text.a.c().j(getContext().getString(b5.j.d_res_0x7f1000e1, Integer.valueOf(i10), Integer.valueOf(this.f7575b4))));
        }
        if (this.f7621y == null || z10 == this.f7578c4) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7604o5.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f7621y;
        if (editText != null) {
            Rect rect = this.H4;
            com.google.android.material.internal.c.a(this, editText, rect);
            k0(rect);
            if (!this.f7610r4) {
                return;
            }
            this.f7604o5.b0(this.f7621y.getTextSize());
            int gravity = this.f7621y.getGravity();
            this.f7604o5.S((gravity & (-113)) | 48);
            this.f7604o5.a0(gravity);
            this.f7604o5.O(q(rect));
            this.f7604o5.W(t(rect));
            this.f7604o5.K();
            if (!A() || this.f7602n5) {
                return;
            }
            R();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean s02 = s0();
        boolean q02 = q0();
        if (s02 || q02) {
            this.f7621y.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f7629q);
        if (hVar.f7630x) {
            this.Q4.post(new b());
        }
        setHint(hVar.f7631y);
        setHelperText(hVar.U3);
        setPlaceholderText(hVar.V3);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.f7622y4;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float a10 = this.f7620x4.r().a(this.J4);
            float a11 = this.f7620x4.t().a(this.J4);
            float a12 = this.f7620x4.j().a(this.J4);
            float a13 = this.f7620x4.l().a(this.J4);
            float f10 = z10 ? a10 : a11;
            if (z10) {
                a10 = a11;
            }
            float f11 = z10 ? a12 : a13;
            if (z10) {
                a12 = a13;
            }
            Y(f10, a10, f11, a12);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.Z3.l()) {
            hVar.f7629q = getError();
        }
        hVar.f7630x = I() && this.Q4.isChecked();
        hVar.f7631y = getHint();
        hVar.U3 = getHelperText();
        hVar.V3 = getPlaceholderText();
        return hVar;
    }

    public boolean q0() {
        boolean z10;
        if (this.f7621y == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f7580d.getMeasuredWidth() - this.f7621y.getPaddingLeft();
            if (this.L4 == null || this.M4 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.L4 = colorDrawable;
                this.M4 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = androidx.core.widget.j.a(this.f7621y);
            Drawable drawable = a10[0];
            Drawable drawable2 = this.L4;
            if (drawable != drawable2) {
                androidx.core.widget.j.j(this.f7621y, drawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.L4 != null) {
                Drawable[] a11 = androidx.core.widget.j.a(this.f7621y);
                androidx.core.widget.j.j(this.f7621y, null, a11[1], a11[2], a11[3]);
                this.L4 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f7608q4.getMeasuredWidth() - this.f7621y.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + androidx.core.view.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a12 = androidx.core.widget.j.a(this.f7621y);
            Drawable drawable3 = this.U4;
            if (drawable3 == null || this.V4 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.U4 = colorDrawable2;
                    this.V4 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a12[2];
                Drawable drawable5 = this.U4;
                if (drawable4 != drawable5) {
                    this.W4 = a12[2];
                    androidx.core.widget.j.j(this.f7621y, a12[0], a12[1], drawable5, a12[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.V4 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.j.j(this.f7621y, a12[0], a12[1], this.U4, a12[3]);
            }
        } else if (this.U4 == null) {
            return z10;
        } else {
            Drawable[] a13 = androidx.core.widget.j.a(this.f7621y);
            if (a13[2] == this.U4) {
                androidx.core.widget.j.j(this.f7621y, a13[0], a13[1], this.W4, a13[3]);
            } else {
                z11 = z10;
            }
            this.U4 = null;
        }
        return z11;
    }

    public void r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f7621y;
        if (editText == null || this.A4 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (h0.a(background)) {
            background = background.mutate();
        }
        if (this.Z3.l()) {
            currentTextColor = this.Z3.p();
        } else if (!this.f7578c4 || (textView = this.f7581d4) == null) {
            androidx.core.graphics.drawable.a.c(background);
            this.f7621y.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.j.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.G4 != i10) {
            this.G4 = i10;
            this.f7592i5 = i10;
            this.f7596k5 = i10;
            this.f7598l5 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f7592i5 = defaultColor;
        this.G4 = defaultColor;
        this.f7594j5 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7596k5 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7598l5 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.A4) {
            return;
        }
        this.A4 = i10;
        if (this.f7621y == null) {
            return;
        }
        Q();
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.B4 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f7588g5 != i10) {
            this.f7588g5 = i10;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f7588g5 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E0();
        }
        this.f7584e5 = colorStateList.getDefaultColor();
        this.f7600m5 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7586f5 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7588g5 = defaultColor;
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f7590h5 != colorStateList) {
            this.f7590h5 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.D4 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.E4 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f7573a4 != z10) {
            if (z10) {
                c0 c0Var = new c0(getContext());
                this.f7581d4 = c0Var;
                c0Var.setId(b5.f.M_res_0x7f090274);
                Typeface typeface = this.K4;
                if (typeface != null) {
                    this.f7581d4.setTypeface(typeface);
                }
                this.f7581d4.setMaxLines(1);
                this.Z3.e(this.f7581d4, 2);
                androidx.core.view.h.d((ViewGroup.MarginLayoutParams) this.f7581d4.getLayoutParams(), getResources().getDimensionPixelOffset(b5.d.f5470e0));
                o0();
                l0();
            } else {
                this.Z3.B(this.f7581d4, 2);
                this.f7581d4 = null;
            }
            this.f7573a4 = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f7575b4 != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f7575b4 = i10;
            if (!this.f7573a4) {
                return;
            }
            l0();
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f7583e4 != i10) {
            this.f7583e4 = i10;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f7603o4 != colorStateList) {
            this.f7603o4 = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f7585f4 != i10) {
            this.f7585f4 = i10;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f7601n4 != colorStateList) {
            this.f7601n4 = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f7579c5 = colorStateList;
        this.f7582d5 = colorStateList;
        if (this.f7621y != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.Q4.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.Q4.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.Q4.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.Q4.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.f.a(this, this.Q4, this.S4, this.T4);
            U();
        }
    }

    public void setEndIconMode(int i10) {
        int i11 = this.O4;
        if (i11 == i10) {
            return;
        }
        this.O4 = i10;
        C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.A4)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.f.a(this, this.Q4, this.S4, this.T4);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.A4 + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.Q4, onClickListener, this.X4);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.X4 = onLongClickListener;
        c0(this.Q4, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.S4 != colorStateList) {
            this.S4 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.Q4, colorStateList, this.T4);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.T4 != mode) {
            this.T4 = mode;
            com.google.android.material.textfield.f.a(this, this.Q4, this.S4, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (K() != z10) {
            this.Q4.setVisibility(z10 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.Z3.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.Z3.O(charSequence);
        } else {
            this.Z3.v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.Z3.D(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.Z3.E(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
        V();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.Z4.setImageDrawable(drawable);
        u0();
        com.google.android.material.textfield.f.a(this, this.Z4, this.f7574a5, this.f7576b5);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.Z4, onClickListener, this.Y4);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.Y4 = onLongClickListener;
        c0(this.Z4, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f7574a5 != colorStateList) {
            this.f7574a5 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.Z4, colorStateList, this.f7576b5);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f7576b5 != mode) {
            this.f7576b5 = mode;
            com.google.android.material.textfield.f.a(this, this.Z4, this.f7574a5, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.Z3.F(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.Z3.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f7606p5 != z10) {
            this.f7606p5 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (!M()) {
                return;
            }
            setHelperTextEnabled(false);
            return;
        }
        if (!M()) {
            setHelperTextEnabled(true);
        }
        this.Z3.P(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.Z3.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.Z3.I(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.Z3.H(i10);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f7610r4) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f7609q5 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f7610r4) {
            this.f7610r4 = z10;
            if (!z10) {
                this.f7614t4 = false;
                if (!TextUtils.isEmpty(this.f7612s4) && TextUtils.isEmpty(this.f7621y.getHint())) {
                    this.f7621y.setHint(this.f7612s4);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f7621y.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f7612s4)) {
                        setHint(hint);
                    }
                    this.f7621y.setHint((CharSequence) null);
                }
                this.f7614t4 = true;
            }
            if (this.f7621y == null) {
                return;
            }
            v0();
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f7604o5.P(i10);
        this.f7582d5 = this.f7604o5.p();
        if (this.f7621y != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7582d5 != colorStateList) {
            if (this.f7579c5 == null) {
                this.f7604o5.R(colorStateList);
            }
            this.f7582d5 = colorStateList;
            if (this.f7621y == null) {
                return;
            }
            w0(false);
        }
    }

    public void setMaxEms(int i10) {
        this.W3 = i10;
        EditText editText = this.f7621y;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.Y3 = i10;
        EditText editText = this.f7621y;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.V3 = i10;
        EditText editText = this.f7621y;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.X3 = i10;
        EditText editText = this.f7621y;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.Q4.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.Q4.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.O4 != 1) {
            setEndIconMode(1);
        } else if (z10) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.S4 = colorStateList;
        com.google.android.material.textfield.f.a(this, this.Q4, colorStateList, this.T4);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.T4 = mode;
        com.google.android.material.textfield.f.a(this, this.Q4, this.S4, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f7591i4 == null) {
            c0 c0Var = new c0(getContext());
            this.f7591i4 = c0Var;
            c0Var.setId(b5.f.P_res_0x7f090277);
            y.y0(this.f7591i4, 2);
            q1.d z10 = z();
            this.f7597l4 = z10;
            z10.g0(67L);
            this.f7599m4 = z();
            setPlaceholderTextAppearance(this.f7595k4);
            setPlaceholderTextColor(this.f7593j4);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f7589h4) {
                setPlaceholderTextEnabled(true);
            }
            this.f7587g4 = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f7595k4 = i10;
        TextView textView = this.f7591i4;
        if (textView != null) {
            androidx.core.widget.j.o(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f7593j4 != colorStateList) {
            this.f7593j4 = colorStateList;
            TextView textView = this.f7591i4;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f7580d.k(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f7580d.l(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f7580d.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f7580d.n(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f7580d.o(charSequence);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7580d.p(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f7580d.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7580d.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f7580d.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f7580d.t(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f7580d.u(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f7605p4 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7608q4.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i10) {
        androidx.core.widget.j.o(this.f7608q4, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f7608q4.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f7621y;
        if (editText != null) {
            y.o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.K4) {
            this.K4 = typeface;
            this.f7604o5.j0(typeface);
            this.Z3.L(typeface);
            TextView textView = this.f7581d4;
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface);
        }
    }

    public void w0(boolean z10) {
        x0(z10, false);
    }
}
