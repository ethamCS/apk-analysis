package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends b {
    public c(FloatingActionButton floatingActionButton, b.a.a.a.a0.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, a(f, f3));
            stateListAnimator.addState(b.H, a(f, f2));
            stateListAnimator.addState(b.I, a(f, f2));
            stateListAnimator.addState(b.J, a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, a(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (s()) {
            w();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void a(Rect rect) {
        if (this.z.a()) {
            super.a(rect);
            return;
        }
        int sizeDimension = !t() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void a(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.y.isEnabled()) {
                this.y.setElevation(this.h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f = this.i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.y.setElevation(0.0f);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float b() {
        return this.y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f1500c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(b.a.a.a.z.b.b(colorStateList));
        } else {
            super.b(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void k() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void m() {
        w();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean r() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean s() {
        return this.z.a() || !t();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void u() {
    }
}
