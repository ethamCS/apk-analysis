package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class a extends com.google.android.material.textfield.e {

    /* renamed from: d */
    private final TextWatcher f3282d = new C0078a();

    /* renamed from: e */
    private final View.OnFocusChangeListener f3283e = new b();

    /* renamed from: f */
    private final TextInputLayout.f f3284f = new c();

    /* renamed from: g */
    private final TextInputLayout.g f3285g = new d();

    /* renamed from: h */
    private AnimatorSet f3286h;
    private ValueAnimator i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    public class C0078a implements TextWatcher {
        C0078a() {
            a.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f3314a.getSuffixText() != null) {
                return;
            }
            a.this.i(a.l(editable));
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
    public class b implements View.OnFocusChangeListener {
        b() {
            a.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            a aVar = a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.i(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        c() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f3283e);
            editText.removeTextChangedListener(a.this.f3282d);
            editText.addTextChangedListener(a.this.f3282d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {
        d() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.removeTextChangedListener(a.this.f3282d);
            if (editText.getOnFocusChangeListener() != a.this.f3283e) {
                return;
            }
            editText.setOnFocusChangeListener(null);
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
            a.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f3314a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
            a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f3314a.setEndIconVisible(true);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
            a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f3314a.setEndIconVisible(false);
        }
    }

    /* loaded from: classes.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f3316c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f3316c.setScaleX(floatValue);
            a.this.f3316c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public void i(boolean z) {
        boolean z2 = this.f3314a.J() == z;
        if (z) {
            this.i.cancel();
            this.f3286h.start();
            if (!z2) {
                return;
            }
            this.f3286h.end();
            return;
        }
        this.f3286h.cancel();
        this.i.start();
        if (!z2) {
            return;
        }
        this.i.end();
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(d.a.a.a.l.a.f3640a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(d.a.a.a.l.a.f3643d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator k = k();
        ValueAnimator j = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3286h = animatorSet;
        animatorSet.playTogether(k, j);
        this.f3286h.addListener(new f());
        ValueAnimator j2 = j(1.0f, 0.0f);
        this.i = j2;
        j2.addListener(new g());
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f3314a.setEndIconDrawable(b.a.k.a.a.d(this.f3315b, d.a.a.a.e.f_res_0x7f0800ae));
        TextInputLayout textInputLayout = this.f3314a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(d.a.a.a.i.d_res_0x7f10002a));
        this.f3314a.setEndIconOnClickListener(new e());
        this.f3314a.e(this.f3284f);
        this.f3314a.f(this.f3285g);
        m();
    }

    @Override // com.google.android.material.textfield.e
    public void c(boolean z) {
        if (this.f3314a.getSuffixText() == null) {
            return;
        }
        i(z);
    }
}
