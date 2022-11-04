package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import b.a.a.a.j;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class a extends com.google.android.material.textfield.e {
    private final TextWatcher d = new C0069a();
    private final TextInputLayout.f e = new b();
    private AnimatorSet f;
    private ValueAnimator g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    public class C0069a implements TextWatcher {
        C0069a() {
            a.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!a.b(editable)) {
                a.this.f.cancel();
                a.this.g.start();
            } else if (a.this.f1590a.a()) {
            } else {
                a.this.g.cancel();
                a.this.f.start();
            }
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
    public class b implements TextInputLayout.f {
        b() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
            a.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f1590a.getEditText().setText((CharSequence) null);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
            a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f1590a.setEndIconVisible(true);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
            a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f1590a.setEndIconVisible(false);
        }
    }

    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f1592c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f1592c.setScaleX(floatValue);
            a.this.f1592c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(b.a.a.a.m.a.f1208a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    public static boolean b(Editable editable) {
        return editable.length() > 0;
    }

    private ValueAnimator c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(b.a.a.a.m.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    private void d() {
        ValueAnimator c2 = c();
        ValueAnimator a2 = a(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.playTogether(c2, a2);
        this.f.addListener(new d());
        ValueAnimator a3 = a(1.0f, 0.0f);
        this.g = a3;
        a3.addListener(new e());
    }

    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f1590a.setEndIconDrawable(a.a.k.a.a.c(this.f1591b, b.a.a.a.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f1590a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.clear_text_end_icon_content_description));
        this.f1590a.setEndIconOnClickListener(new c());
        this.f1590a.a(this.e);
        d();
    }
}
