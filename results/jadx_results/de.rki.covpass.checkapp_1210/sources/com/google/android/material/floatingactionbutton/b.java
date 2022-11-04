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
public class b extends a {
    public b(FloatingActionButton floatingActionButton, s5.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator f0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7279v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f7279v, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(a.C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
        c0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void C(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void D(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(a.D, f0(f10, f12));
        stateListAnimator.addState(a.E, f0(f10, f11));
        stateListAnimator.addState(a.F, f0(f10, f11));
        stateListAnimator.addState(a.G, f0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f7279v, "elevation", f10).setDuration(0L));
        if (i10 <= 24) {
            FloatingActionButton floatingActionButton = this.f7279v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f7279v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(a.C);
        stateListAnimator.addState(a.H, animatorSet);
        stateListAnimator.addState(a.I, f0(0.0f, 0.0f));
        this.f7279v.setStateListAnimator(stateListAnimator);
        if (W()) {
            c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f7260c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(r5.b.d(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean W() {
        return this.f7280w.c() || !Y();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void a0() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f7279v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.f7280w.c()) {
            super.r(rect);
            return;
        }
        int sizeDimension = !Y() ? (this.f7267j - this.f7279v.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
    }
}
