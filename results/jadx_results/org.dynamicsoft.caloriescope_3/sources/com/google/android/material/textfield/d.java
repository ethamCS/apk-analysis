package com.google.android.material.textfield;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
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
import b.a.a.a.b0.k;
import b.a.a.a.j;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class d extends com.google.android.material.textfield.e {
    private static final boolean o;
    private final TextWatcher d = new a();
    private final TextInputLayout.e e = new b(this.f1590a);
    private final TextInputLayout.f f = new c();
    private boolean g = false;
    private boolean h = false;
    private long i = Long.MAX_VALUE;
    private StateListDrawable j;
    private b.a.a.a.b0.g k;
    private AccessibilityManager l;
    private ValueAnimator m;
    private ValueAnimator n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* loaded from: classes.dex */
        class RunnableC0070a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ AutoCompleteTextView f1580b;

            RunnableC0070a(AutoCompleteTextView autoCompleteTextView) {
                a.this = r1;
                this.f1580b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f1580b.isPopupShowing();
                d.this.a(isPopupShowing);
                d.this.g = isPopupShowing;
            }
        }

        a() {
            d.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView a2 = dVar.a(dVar.f1590a.getEditText());
            a2.post(new RunnableC0070a(a2));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends TextInputLayout.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            cVar.a((CharSequence) Spinner.class.getName());
            if (cVar.t()) {
                cVar.d((CharSequence) null);
            }
        }

        @Override // a.g.l.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView a2 = dVar.a(dVar.f1590a.getEditText());
            if (accessibilityEvent.getEventType() != 1 || !d.this.l.isTouchExplorationEnabled()) {
                return;
            }
            d.this.d(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        c() {
            d.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a2 = d.this.a(textInputLayout.getEditText());
            d.this.b(a2);
            d.this.a(a2);
            d.this.c(a2);
            a2.setThreshold(0);
            a2.removeTextChangedListener(d.this.d);
            a2.addTextChangedListener(d.this.d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0071d implements View.OnClickListener {
        View$OnClickListenerC0071d() {
            d.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.d((AutoCompleteTextView) d.this.f1590a.getEditText());
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ AutoCompleteTextView f1584b;

        e(AutoCompleteTextView autoCompleteTextView) {
            d.this = r1;
            this.f1584b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.d()) {
                    d.this.g = false;
                }
                d.this.d(this.f1584b);
                view.performClick();
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnFocusChangeListener {
        f() {
            d.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.f1590a.setEndIconActivated(z);
            if (!z) {
                d.this.a(false);
                d.this.g = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements AutoCompleteTextView.OnDismissListener {
        g() {
            d.this = r1;
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.g = true;
            d.this.i = System.currentTimeMillis();
            d.this.a(false);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        h() {
            d.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f1592c.setChecked(dVar.h);
            d.this.n.start();
        }
    }

    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
            d.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f1592c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static {
        o = Build.VERSION.SDK_INT >= 21;
    }

    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private ValueAnimator a(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(b.a.a.a.m.a.f1208a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public AutoCompleteTextView a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private b.a.a.a.b0.g a(float f2, float f3, float f4, int i2) {
        k.b n = k.n();
        n.d(f2);
        n.e(f2);
        n.b(f3);
        n.c(f3);
        k a2 = n.a();
        b.a.a.a.b0.g a3 = b.a.a.a.b0.g.a(this.f1591b, f4);
        a3.setShapeAppearanceModel(a2);
        a3.a(0, i2, 0, i2);
        return a3;
    }

    public void a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f1590a.getBoxBackgroundMode();
        b.a.a.a.b0.g boxBackground = this.f1590a.getBoxBackground();
        int a2 = b.a.a.a.s.a.a(autoCompleteTextView, b.a.a.a.b.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            b(autoCompleteTextView, a2, iArr, boxBackground);
        } else if (boxBackgroundMode != 1) {
        } else {
            a(autoCompleteTextView, a2, iArr, boxBackground);
        }
    }

    private void a(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, b.a.a.a.b0.g gVar) {
        int boxBackgroundColor = this.f1590a.getBoxBackgroundColor();
        int[] iArr2 = {b.a.a.a.s.a.a(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (o) {
            u.a(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        b.a.a.a.b0.g gVar2 = new b.a.a.a.b0.g(gVar.k());
        gVar2.a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int t = u.t(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int s = u.s(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        u.a(autoCompleteTextView, layerDrawable);
        u.a(autoCompleteTextView, t, paddingTop, s, paddingBottom);
    }

    public void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.n.cancel();
            this.m.start();
        }
    }

    public void b(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (o) {
            int boxBackgroundMode = this.f1590a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.k;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.j;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    private void b(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, b.a.a.a.b0.g gVar) {
        LayerDrawable layerDrawable;
        int a2 = b.a.a.a.s.a.a(autoCompleteTextView, b.a.a.a.b.colorSurface);
        b.a.a.a.b0.g gVar2 = new b.a.a.a.b0.g(gVar.k());
        int a3 = b.a.a.a.s.a.a(i2, a2, 0.1f);
        gVar2.a(new ColorStateList(iArr, new int[]{a3, 0}));
        if (o) {
            gVar2.setTint(a2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a3, a2});
            b.a.a.a.b0.g gVar3 = new b.a.a.a.b0.g(gVar.k());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        u.a(autoCompleteTextView, layerDrawable);
    }

    private void c() {
        this.n = a(67, 0.0f, 1.0f);
        ValueAnimator a2 = a(50, 1.0f, 0.0f);
        this.m = a2;
        a2.addListener(new h());
    }

    public void c(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    public void d(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (d()) {
            this.g = false;
        }
        if (this.g) {
            this.g = false;
            return;
        }
        if (o) {
            a(!this.h);
        } else {
            this.h = !this.h;
            this.f1592c.toggle();
        }
        if (!this.h) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    public boolean d() {
        long currentTimeMillis = System.currentTimeMillis() - this.i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f1591b.getResources().getDimensionPixelOffset(b.a.a.a.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f1591b.getResources().getDimensionPixelOffset(b.a.a.a.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f1591b.getResources().getDimensionPixelOffset(b.a.a.a.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        b.a.a.a.b0.g a2 = a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        b.a.a.a.b0.g a3 = a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.k = a2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a2);
        this.j.addState(new int[0], a3);
        this.f1590a.setEndIconDrawable(a.a.k.a.a.c(this.f1591b, o ? b.a.a.a.e.mtrl_dropdown_arrow : b.a.a.a.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f1590a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.exposed_dropdown_menu_content_description));
        this.f1590a.setEndIconOnClickListener(new View$OnClickListenerC0071d());
        this.f1590a.a(this.f);
        c();
        u.h(this.f1592c, 2);
        this.l = (AccessibilityManager) this.f1591b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    public boolean a(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.e
    public boolean b() {
        return true;
    }
}
