package com.google.android.material.button;

import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.i;
import b.a.a.a.b0.h;
import b.a.a.a.b0.n;
import b.a.a.a.k;
import b.a.a.a.l;
import b.a.a.a.y.c;
import com.google.android.material.internal.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {
    private static final int[] p = {16842911};
    private static final int[] q = {16842912};
    private static final int r = k.Widget_MaterialComponents_Button;
    private final com.google.android.material.button.a d;
    private final LinkedHashSet<a> e;
    private b f;
    private PorterDuff.Mode g;
    private ColorStateList h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes.dex */
    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.a.b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(m.b(context, attributeSet, i, r), attributeSet, i);
        this.e = new LinkedHashSet<>();
        boolean z = false;
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray c2 = m.c(context2, attributeSet, l.MaterialButton, i, r, new int[0]);
        this.l = c2.getDimensionPixelSize(l.MaterialButton_iconPadding, 0);
        this.g = com.google.android.material.internal.n.a(c2.getInt(l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.h = c.a(getContext(), c2, l.MaterialButton_iconTint);
        this.i = c.b(getContext(), c2, l.MaterialButton_icon);
        this.o = c2.getInteger(l.MaterialButton_iconGravity, 1);
        this.j = c2.getDimensionPixelSize(l.MaterialButton_iconSize, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, b.a.a.a.b0.k.a(context2, attributeSet, i, r).a());
        this.d = aVar;
        aVar.a(c2);
        c2.recycle();
        setCompoundDrawablePadding(this.l);
        b(this.i != null ? true : z);
    }

    private void a(boolean z) {
        if (z) {
            i.a(this, this.i, null, null, null);
        } else {
            i.a(this, null, null, this.i, null);
        }
    }

    private void b(boolean z) {
        Drawable drawable = this.i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.i(drawable).mutate();
            this.i = mutate;
            androidx.core.graphics.drawable.a.a(mutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.a(this.i, mode);
            }
            int i = this.j;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.k;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.o;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            a(z3);
            return;
        }
        Drawable[] a2 = i.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[2];
        if ((z3 && drawable3 != this.i) || (!z3 && drawable4 != this.i)) {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        a(z3);
    }

    private boolean b() {
        return u.o(this) == 1;
    }

    private boolean c() {
        com.google.android.material.button.a aVar = this.d;
        return aVar != null && !aVar.j();
    }

    private void d() {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i = this.o;
        boolean z = true;
        if (i == 1 || i == 3) {
            this.k = 0;
            b(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i2 = this.j;
        if (i2 == 0) {
            i2 = this.i.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - min) - u.s(this)) - i2) - this.l) - u.t(this)) / 2;
        boolean b2 = b();
        if (this.o != 4) {
            z = false;
        }
        if (b2 != z) {
            measuredWidth = -measuredWidth;
        }
        if (this.k == measuredWidth) {
            return;
        }
        this.k = measuredWidth;
        b(false);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.d;
        return aVar != null && aVar.k();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.d.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.o;
    }

    public int getIconPadding() {
        return this.l;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.d.d();
        }
        return null;
    }

    public b.a.a.a.b0.k getShapeAppearanceModel() {
        if (c()) {
            return this.d.e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.d.f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.d.g();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f, a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.d.h() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f, a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.d.i() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this, this.d.c());
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.google.android.material.button.a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.d) == null) {
            return;
        }
        aVar.a(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (c()) {
            this.d.a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (c()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.d.l();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.a.k.a.a.c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.d.a(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!a() || !isEnabled() || this.m == z) {
            return;
        }
        this.m = z;
        refreshDrawableState();
        if (this.n) {
            return;
        }
        this.n = true;
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.m);
        }
        this.n = false;
    }

    public void setCornerRadius(int i) {
        if (c()) {
            this.d.b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (c()) {
            this.d.c().b(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            b(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.o != i) {
            this.o = i;
            d();
        }
    }

    public void setIconPadding(int i) {
        if (this.l != i) {
            this.l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? a.a.k.a.a.c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.j == i) {
                return;
            }
            this.j = i;
            b(true);
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            b(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            b(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(a.a.k.a.a.b(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.d.a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (c()) {
            setRippleColor(a.a.k.a.a.b(getContext(), i));
        }
    }

    @Override // b.a.a.a.b0.n
    public void setShapeAppearanceModel(b.a.a.a.b0.k kVar) {
        if (c()) {
            this.d.a(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            this.d.b(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.d.b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (c()) {
            setStrokeColor(a.a.k.a.a.b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (c()) {
            this.d.c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.f, a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.d.c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f, a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.d.a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.m);
    }
}
