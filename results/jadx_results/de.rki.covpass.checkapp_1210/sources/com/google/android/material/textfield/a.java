package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class a extends com.google.android.material.textfield.e {

    /* renamed from: e */
    private final TextWatcher f7632e = new C0109a();

    /* renamed from: f */
    private final View.OnFocusChangeListener f7633f = new b();

    /* renamed from: g */
    private final TextInputLayout.f f7634g = new c();

    /* renamed from: h */
    private final TextInputLayout.g f7635h = new d();

    /* renamed from: i */
    private AnimatorSet f7636i;

    /* renamed from: j */
    private ValueAnimator f7637j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    public class C0109a implements TextWatcher {
        C0109a() {
            a.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f7684a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        b() {
            a.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.i(aVar.m());
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
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f7633f);
            a aVar = a.this;
            aVar.f7686c.setOnFocusChangeListener(aVar.f7633f);
            editText.removeTextChangedListener(a.this.f7632e);
            editText.addTextChangedListener(a.this.f7632e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes.dex */
        class RunnableC0110a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ EditText f7642c;

            RunnableC0110a(EditText editText) {
                d.this = r1;
                this.f7642c = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7642c.removeTextChangedListener(a.this.f7632e);
                a.this.i(true);
            }
        }

        d() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0110a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f7633f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f7686c.getOnFocusChangeListener() != a.this.f7633f) {
                return;
            }
            a.this.f7686c.setOnFocusChangeListener(null);
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
            a.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f7684a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f7684a.U();
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
            a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f7684a.setEndIconVisible(true);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
            a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f7684a.setEndIconVisible(false);
        }
    }

    /* loaded from: classes.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f7686c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
            a.this.f7686c.setScaleX(floatValue);
            a.this.f7686c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public void i(boolean z10) {
        boolean z11 = this.f7684a.K() == z10;
        if (z10 && !this.f7636i.isRunning()) {
            this.f7637j.cancel();
            this.f7636i.start();
            if (!z11) {
                return;
            }
            this.f7636i.end();
        } else if (z10) {
        } else {
            this.f7636i.cancel();
            this.f7637j.start();
            if (!z11) {
                return;
            }
            this.f7637j.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c5.a.f6267a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(c5.a.f6270d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k10 = k();
        ValueAnimator j10 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7636i = animatorSet;
        animatorSet.playTogether(k10, j10);
        this.f7636i.addListener(new f());
        ValueAnimator j11 = j(1.0f, 0.0f);
        this.f7637j = j11;
        j11.addListener(new g());
    }

    public boolean m() {
        EditText editText = this.f7684a.getEditText();
        return editText != null && (editText.hasFocus() || this.f7686c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        TextInputLayout textInputLayout = this.f7684a;
        int i10 = this.f7687d;
        if (i10 == 0) {
            i10 = b5.e.f_res_0x7f0700be;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f7684a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(b5.j.e_res_0x7f1000ec));
        this.f7684a.setEndIconCheckable(false);
        this.f7684a.setEndIconOnClickListener(new e());
        this.f7684a.g(this.f7634g);
        this.f7684a.h(this.f7635h);
        l();
    }

    @Override // com.google.android.material.textfield.e
    public void c(boolean z10) {
        if (this.f7684a.getSuffixText() == null) {
            return;
        }
        i(z10);
    }
}
