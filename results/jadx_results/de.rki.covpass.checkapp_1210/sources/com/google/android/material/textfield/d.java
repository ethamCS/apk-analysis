package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.y;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class d extends com.google.android.material.textfield.e {

    /* renamed from: t */
    private static final boolean f7651t = true;

    /* renamed from: e */
    private final TextWatcher f7652e = new a();

    /* renamed from: f */
    private final View.OnFocusChangeListener f7653f = new e();

    /* renamed from: g */
    private final TextInputLayout.e f7654g = new f(this.f7684a);

    /* renamed from: h */
    private final TextInputLayout.f f7655h = new g();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    private final TextInputLayout.g f7656i = new h();

    /* renamed from: j */
    private final View.OnAttachStateChangeListener f7657j = new i();

    /* renamed from: k */
    private final c.b f7658k = new j();

    /* renamed from: l */
    private boolean f7659l = false;

    /* renamed from: m */
    private boolean f7660m = false;

    /* renamed from: n */
    private long f7661n = Long.MAX_VALUE;

    /* renamed from: o */
    private StateListDrawable f7662o;

    /* renamed from: p */
    private t5.g f7663p;

    /* renamed from: q */
    private AccessibilityManager f7664q;

    /* renamed from: r */
    private ValueAnimator f7665r;

    /* renamed from: s */
    private ValueAnimator f7666s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.google.android.material.internal.l {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* loaded from: classes.dex */
        class RunnableC0111a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ AutoCompleteTextView f7668c;

            RunnableC0111a(AutoCompleteTextView autoCompleteTextView) {
                a.this = r1;
                this.f7668c = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f7668c.isPopupShowing();
                d.this.J(isPopupShowing);
                d.this.f7659l = isPopupShowing;
            }
        }

        a() {
            d.this = r1;
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView C = d.C(d.this.f7684a.getEditText());
            if (d.this.f7664q.isTouchExplorationEnabled() && d.H(C) && !d.this.f7686c.hasFocus()) {
                C.dismissDropDown();
            }
            C.post(new RunnableC0111a(C));
        }
    }

    /* loaded from: classes.dex */
    public class b implements AutoCompleteTextView.OnDismissListener {
        b() {
            d.this = r1;
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.N();
            d.this.J(false);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
            d.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f7686c.setChecked(dVar.f7660m);
            d.this.f7666s.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes.dex */
    public class C0112d implements ValueAnimator.AnimatorUpdateListener {
        C0112d() {
            d.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f7686c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements View.OnFocusChangeListener {
        e() {
            d.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            d.this.f7684a.setEndIconActivated(z10);
            if (!z10) {
                d.this.J(false);
                d.this.f7659l = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends TextInputLayout.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(TextInputLayout textInputLayout) {
            super(textInputLayout);
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            if (!d.H(d.this.f7684a.getEditText())) {
                dVar.X(Spinner.class.getName());
            }
            if (dVar.J()) {
                dVar.h0(null);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView C = d.C(d.this.f7684a.getEditText());
            if (accessibilityEvent.getEventType() != 1 || !d.this.f7664q.isEnabled() || d.H(d.this.f7684a.getEditText())) {
                return;
            }
            d.this.M(C);
            d.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements TextInputLayout.f {
        g() {
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView C = d.C(textInputLayout.getEditText());
            d.this.K(C);
            d.this.y(C);
            d.this.L(C);
            C.setThreshold(0);
            C.removeTextChangedListener(d.this.f7652e);
            C.addTextChangedListener(d.this.f7652e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.H(C) && d.this.f7664q.isTouchExplorationEnabled()) {
                y.y0(d.this.f7686c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f7654g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements TextInputLayout.g {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ AutoCompleteTextView f7677c;

            a(AutoCompleteTextView autoCompleteTextView) {
                h.this = r1;
                this.f7677c = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7677c.removeTextChangedListener(d.this.f7652e);
            }
        }

        h() {
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f7653f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (d.f7651t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i10 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(d.this.f7657j);
                d.this.I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements View.OnAttachStateChangeListener {
        i() {
            d.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            d.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            d.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements c.b {
        j() {
            d.this = r1;
        }

        @Override // androidx.core.view.accessibility.c.b
        public void onTouchExplorationStateChanged(boolean z10) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = d.this.f7684a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || d.H(autoCompleteTextView)) {
                return;
            }
            y.y0(d.this.f7686c, z10 ? 2 : 1);
        }
    }

    /* loaded from: classes.dex */
    class k implements View.OnClickListener {
        k() {
            d.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.M((AutoCompleteTextView) d.this.f7684a.getEditText());
        }
    }

    /* loaded from: classes.dex */
    public class l implements View.OnTouchListener {

        /* renamed from: c */
        final /* synthetic */ AutoCompleteTextView f7682c;

        l(AutoCompleteTextView autoCompleteTextView) {
            d.this = r1;
            this.f7682c = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.G()) {
                    d.this.f7659l = false;
                }
                d.this.M(this.f7682c);
                d.this.N();
            }
            return false;
        }
    }

    public d(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    private void A(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, t5.g gVar) {
        LayerDrawable layerDrawable;
        int d10 = i5.a.d(autoCompleteTextView, b5.b.m_res_0x7f0300fb);
        t5.g gVar2 = new t5.g(gVar.E());
        int h10 = i5.a.h(i10, d10, 0.1f);
        gVar2.Z(new ColorStateList(iArr, new int[]{h10, 0}));
        if (f7651t) {
            gVar2.setTint(d10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h10, d10});
            t5.g gVar3 = new t5.g(gVar.E());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        y.s0(autoCompleteTextView, layerDrawable);
    }

    public void B() {
        TextInputLayout textInputLayout;
        if (this.f7664q == null || (textInputLayout = this.f7684a) == null || !y.R(textInputLayout)) {
            return;
        }
        androidx.core.view.accessibility.c.a(this.f7664q, this.f7658k);
    }

    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator D(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c5.a.f6267a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new C0112d());
        return ofFloat;
    }

    private t5.g E(float f10, float f11, float f12, int i10) {
        t5.k m10 = t5.k.a().A(f10).E(f10).s(f11).w(f11).m();
        t5.g m11 = t5.g.m(this.f7685b, f12);
        m11.setShapeAppearanceModel(m10);
        m11.b0(0, i10, 0, i10);
        return m11;
    }

    private void F() {
        this.f7666s = D(67, 0.0f, 1.0f);
        ValueAnimator D = D(50, 1.0f, 0.0f);
        this.f7665r = D;
        D.addListener(new c());
    }

    public boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f7661n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public void I() {
        AccessibilityManager accessibilityManager = this.f7664q;
        if (accessibilityManager != null) {
            androidx.core.view.accessibility.c.b(accessibilityManager, this.f7658k);
        }
    }

    public void J(boolean z10) {
        if (this.f7660m != z10) {
            this.f7660m = z10;
            this.f7666s.cancel();
            this.f7665r.start();
        }
    }

    public void K(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f7651t) {
            int boxBackgroundMode = this.f7684a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f7663p;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f7662o;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f7653f);
        if (f7651t) {
            autoCompleteTextView.setOnDismissListener(new b());
        }
    }

    public void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f7659l = false;
        }
        if (this.f7659l) {
            this.f7659l = false;
            return;
        }
        if (f7651t) {
            J(!this.f7660m);
        } else {
            this.f7660m = !this.f7660m;
            this.f7686c.toggle();
        }
        if (!this.f7660m) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    public void N() {
        this.f7659l = true;
        this.f7661n = System.currentTimeMillis();
    }

    public void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f7684a.getBoxBackgroundMode();
        t5.g boxBackground = this.f7684a.getBoxBackground();
        int d10 = i5.a.d(autoCompleteTextView, b5.b.f5460i);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, d10, iArr, boxBackground);
        } else if (boxBackgroundMode != 1) {
        } else {
            z(autoCompleteTextView, d10, iArr, boxBackground);
        }
    }

    private void z(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, t5.g gVar) {
        int boxBackgroundColor = this.f7684a.getBoxBackgroundColor();
        int[] iArr2 = {i5.a.h(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f7651t) {
            y.s0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        t5.g gVar2 = new t5.g(gVar.E());
        gVar2.Z(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int G = y.G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = y.F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        y.s0(autoCompleteTextView, layerDrawable);
        y.B0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    public void O(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView) || this.f7684a.getBoxBackgroundMode() != 2 || !(autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            return;
        }
        y(autoCompleteTextView);
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f7685b.getResources().getDimensionPixelOffset(b5.d.Y);
        float dimensionPixelOffset2 = this.f7685b.getResources().getDimensionPixelOffset(b5.d.V);
        int dimensionPixelOffset3 = this.f7685b.getResources().getDimensionPixelOffset(b5.d.W);
        t5.g E = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        t5.g E2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f7663p = E;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f7662o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, E);
        this.f7662o.addState(new int[0], E2);
        int i10 = this.f7687d;
        if (i10 == 0) {
            i10 = f7651t ? b5.e.d_res_0x7f0700bb : b5.e.e_res_0x7f0700bc;
        }
        this.f7684a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f7684a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(b5.j.g_res_0x7f100115));
        this.f7684a.setEndIconOnClickListener(new k());
        this.f7684a.g(this.f7655h);
        this.f7684a.h(this.f7656i);
        F();
        this.f7664q = (AccessibilityManager) this.f7685b.getSystemService("accessibility");
        this.f7684a.addOnAttachStateChangeListener(this.f7657j);
        B();
    }

    @Override // com.google.android.material.textfield.e
    public boolean b(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}
