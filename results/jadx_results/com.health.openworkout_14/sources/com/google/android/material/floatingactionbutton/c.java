package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b.g.k.h;
import d.a.a.a.a0.g;
import d.a.a.a.a0.k;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends b {

    /* loaded from: classes.dex */
    public static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // d.a.a.a.a0.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public c(FloatingActionButton floatingActionButton, d.a.a.a.z.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator j0(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void C() {
        f0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void E(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f2 = 0.0f;
            if (this.y.isEnabled()) {
                this.y.setElevation(this.f3145h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f2 = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f2 = this.i;
                }
                floatingActionButton.setTranslationZ(f2);
            }
            this.y.setElevation(0.0f);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f2);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void F(float f2, float f3, float f4) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, j0(f2, f4));
            stateListAnimator.addState(b.H, j0(f2, f3));
            stateListAnimator.addState(b.I, j0(f2, f3));
            stateListAnimator.addState(b.J, j0(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f2).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, j0(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f3140c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(d.a.a.a.y.b.a(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean Z() {
        return this.z.b() || !b0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void d0() {
    }

    com.google.android.material.floatingactionbutton.a i0(int i, ColorStateList colorStateList) {
        Context context = this.y.getContext();
        k kVar = this.f3138a;
        h.c(kVar);
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a(kVar);
        aVar.e(b.g.d.a.b(context, d.a.a.a.c.e_res_0x7f060058), b.g.d.a.b(context, d.a.a.a.c.d_res_0x7f060057), b.g.d.a.b(context, d.a.a.a.c.b_res_0x7f060055), b.g.d.a.b(context, d.a.a.a.c.c_res_0x7f060056));
        aVar.d(i);
        aVar.c(colorStateList);
        return aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    g j() {
        k kVar = this.f3138a;
        h.c(kVar);
        return new a(kVar);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float n() {
        return this.y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void s(Rect rect) {
        if (this.z.b()) {
            super.s(rect);
            return;
        }
        int sizeDimension = !b0() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        g j = j();
        this.f3139b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.f3139b.setTintMode(mode);
        }
        this.f3139b.M(this.y.getContext());
        if (i > 0) {
            this.f3141d = i0(i, colorStateList);
            com.google.android.material.floatingactionbutton.a aVar = this.f3141d;
            h.c(aVar);
            g gVar = this.f3139b;
            h.c(gVar);
            drawable = new LayerDrawable(new Drawable[]{aVar, gVar});
        } else {
            this.f3141d = null;
            drawable = this.f3139b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(d.a.a.a.y.b.a(colorStateList2), drawable, null);
        this.f3140c = rippleDrawable;
        this.f3142e = rippleDrawable;
    }
}
