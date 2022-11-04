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
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b.g.l.t;
import com.google.android.material.textfield.TextInputLayout;
import d.a.a.a.a0.k;
/* loaded from: classes.dex */
public class d extends com.google.android.material.textfield.e {
    private static final boolean q;

    /* renamed from: d */
    private final TextWatcher f3296d = new a();

    /* renamed from: e */
    private final View.OnFocusChangeListener f3297e = new c();

    /* renamed from: f */
    private final TextInputLayout.e f3298f = new C0080d(this.f3314a);

    /* renamed from: g */
    private final TextInputLayout.f f3299g = new e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    private final TextInputLayout.g f3300h = new f();
    private boolean i = false;
    private boolean j = false;
    private long k = Long.MAX_VALUE;
    private StateListDrawable l;
    private d.a.a.a.a0.g m;
    private AccessibilityManager n;
    private ValueAnimator o;
    private ValueAnimator p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* loaded from: classes.dex */
        class RunnableC0079a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ AutoCompleteTextView f3302b;

            RunnableC0079a(AutoCompleteTextView autoCompleteTextView) {
                a.this = r1;
                this.f3302b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f3302b.isPopupShowing();
                d.this.C(isPopupShowing);
                d.this.i = isPopupShowing;
            }
        }

        a() {
            d.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView x = dVar.x(dVar.f3314a.getEditText());
            x.post(new RunnableC0079a(x));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
            d.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f3316c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnFocusChangeListener {
        c() {
            d.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.f3314a.setEndIconActivated(z);
            if (!z) {
                d.this.C(false);
                d.this.i = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes.dex */
    public class C0080d extends TextInputLayout.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0080d(TextInputLayout textInputLayout) {
            super(textInputLayout);
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            if (d.this.f3314a.getEditText().getKeyListener() == null) {
                cVar.b0(Spinner.class.getName());
            }
            if (cVar.M()) {
                cVar.l0(null);
            }
        }

        @Override // b.g.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView x = dVar.x(dVar.f3314a.getEditText());
            if (accessibilityEvent.getEventType() != 1 || !d.this.n.isTouchExplorationEnabled()) {
                return;
            }
            d.this.F(x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements TextInputLayout.f {
        e() {
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView x = d.this.x(textInputLayout.getEditText());
            d.this.D(x);
            d.this.u(x);
            d.this.E(x);
            x.setThreshold(0);
            x.removeTextChangedListener(d.this.f3296d);
            x.addTextChangedListener(d.this.f3296d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f3298f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements TextInputLayout.g {
        f() {
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.removeTextChangedListener(d.this.f3296d);
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f3297e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (!d.q) {
                return;
            }
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnClickListener {
        g() {
            d.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.F((AutoCompleteTextView) d.this.f3314a.getEditText());
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ AutoCompleteTextView f3310b;

        h(AutoCompleteTextView autoCompleteTextView) {
            d.this = r1;
            this.f3310b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.B()) {
                    d.this.i = false;
                }
                d.this.F(this.f3310b);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        i() {
            d.this = r1;
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.i = true;
            d.this.k = System.currentTimeMillis();
            d.this.C(false);
        }
    }

    /* loaded from: classes.dex */
    public class j extends AnimatorListenerAdapter {
        j() {
            d.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f3316c.setChecked(dVar.j);
            d.this.p.start();
        }
    }

    static {
        q = Build.VERSION.SDK_INT >= 21;
    }

    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private void A() {
        this.p = y(67, 0.0f, 1.0f);
        ValueAnimator y = y(50, 1.0f, 0.0f);
        this.o = y;
        y.addListener(new j());
    }

    public boolean B() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public void C(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }

    public void D(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (q) {
            int boxBackgroundMode = this.f3314a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.m;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.l;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void E(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f3297e);
        if (q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (B()) {
            this.i = false;
        }
        if (this.i) {
            this.i = false;
            return;
        }
        if (q) {
            C(!this.j);
        } else {
            this.j = !this.j;
            this.f3316c.toggle();
        }
        if (!this.j) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    public void u(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f3314a.getBoxBackgroundMode();
        d.a.a.a.a0.g boxBackground = this.f3314a.getBoxBackground();
        int c2 = d.a.a.a.q.a.c(autoCompleteTextView, d.a.a.a.b.f3625h);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            w(autoCompleteTextView, c2, iArr, boxBackground);
        } else if (boxBackgroundMode != 1) {
        } else {
            v(autoCompleteTextView, c2, iArr, boxBackground);
        }
    }

    private void v(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, d.a.a.a.a0.g gVar) {
        int boxBackgroundColor = this.f3314a.getBoxBackgroundColor();
        int[] iArr2 = {d.a.a.a.q.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (q) {
            t.l0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        d.a.a.a.a0.g gVar2 = new d.a.a.a.a0.g(gVar.C());
        gVar2.V(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int D = t.D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int C = t.C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        t.l0(autoCompleteTextView, layerDrawable);
        t.u0(autoCompleteTextView, D, paddingTop, C, paddingBottom);
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, d.a.a.a.a0.g gVar) {
        LayerDrawable layerDrawable;
        int c2 = d.a.a.a.q.a.c(autoCompleteTextView, d.a.a.a.b.l_res_0x7f0400c4);
        d.a.a.a.a0.g gVar2 = new d.a.a.a.a0.g(gVar.C());
        int f2 = d.a.a.a.q.a.f(i2, c2, 0.1f);
        gVar2.V(new ColorStateList(iArr, new int[]{f2, 0}));
        if (q) {
            gVar2.setTint(c2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
            d.a.a.a.a0.g gVar3 = new d.a.a.a.a0.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        t.l0(autoCompleteTextView, layerDrawable);
    }

    public AutoCompleteTextView x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator y(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(d.a.a.a.l.a.f3640a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private d.a.a.a.a0.g z(float f2, float f3, float f4, int i2) {
        k.b a2 = k.a();
        a2.z(f2);
        a2.D(f2);
        a2.r(f3);
        a2.v(f3);
        k m = a2.m();
        d.a.a.a.a0.g m2 = d.a.a.a.a0.g.m(this.f3315b, f4);
        m2.setShapeAppearanceModel(m);
        m2.X(0, i2, 0, i2);
        return m2;
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f3315b.getResources().getDimensionPixelOffset(d.a.a.a.d.A);
        float dimensionPixelOffset2 = this.f3315b.getResources().getDimensionPixelOffset(d.a.a.a.d.w);
        int dimensionPixelOffset3 = this.f3315b.getResources().getDimensionPixelOffset(d.a.a.a.d.x);
        d.a.a.a.a0.g z = z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        d.a.a.a.a0.g z2 = z(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, z);
        this.l.addState(new int[0], z2);
        this.f3314a.setEndIconDrawable(b.a.k.a.a.d(this.f3315b, q ? d.a.a.a.e.d_res_0x7f0800ab : d.a.a.a.e.e_res_0x7f0800ac));
        TextInputLayout textInputLayout = this.f3314a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(d.a.a.a.i.f_res_0x7f100040));
        this.f3314a.setEndIconOnClickListener(new g());
        this.f3314a.e(this.f3299g);
        this.f3314a.f(this.f3300h);
        A();
        t.r0(this.f3316c, 2);
        this.n = (AccessibilityManager) this.f3315b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}
