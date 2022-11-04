package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
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
import b.g.l.t;
import d.a.a.a.a0.h;
import d.a.a.a.a0.k;
import d.a.a.a.a0.n;
import d.a.a.a.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {
    private static final int[] p = {16842911};
    private static final int[] q = {16842912};
    private static final int r = j.j;

    /* renamed from: d */
    private final com.google.android.material.button.a f3001d;

    /* renamed from: e */
    private final LinkedHashSet<a> f3002e;

    /* renamed from: f */
    private b f3003f;

    /* renamed from: g */
    private PorterDuff.Mode f3004g;

    /* renamed from: h */
    private ColorStateList f3005h;
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

    /* loaded from: classes.dex */
    public static class c extends b.i.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d */
        boolean f3006d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            /* renamed from: c */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            c(parcel);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f3006d = z;
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3006d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.a.a.b.r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.r
            android.content.Context r9 = com.google.android.material.theme.a.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f3002e = r9
            r9 = 0
            r8.m = r9
            r8.n = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = d.a.a.a.k.a1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.o.h(r0, r1, r2, r3, r4, r5)
            int r1 = d.a.a.a.k.n1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.l = r1
            int r1 = d.a.a.a.k.q1
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.p.e(r1, r2)
            r8.f3004g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = d.a.a.a.k.p1
            android.content.res.ColorStateList r1 = d.a.a.a.x.c.a(r1, r0, r2)
            r8.f3005h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = d.a.a.a.k.l1
            android.graphics.drawable.Drawable r1 = d.a.a.a.x.c.d(r1, r0, r2)
            r8.i = r1
            int r1 = d.a.a.a.k.m1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.o = r1
            int r1 = d.a.a.a.k.o1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.j = r1
            d.a.a.a.a0.k$b r10 = d.a.a.a.a0.k.e(r7, r10, r11, r6)
            d.a.a.a.a0.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f3001d = r11
            r11.o(r0)
            r0.recycle()
            int r10 = r8.l
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.i
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private boolean b() {
        return t.y(this) == 1;
    }

    private boolean c() {
        com.google.android.material.button.a aVar = this.f3001d;
        return aVar != null && !aVar.m();
    }

    private void d(boolean z) {
        if (z) {
            i.i(this, this.i, null, null, null);
        } else {
            i.i(this, null, null, this.i, null);
        }
    }

    private void e(boolean z) {
        Drawable drawable = this.i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.i = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f3005h);
            PorterDuff.Mode mode = this.f3004g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.i, mode);
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
            d(z3);
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
        d(z3);
    }

    private void f() {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i = this.o;
        boolean z = true;
        if (i == 1 || i == 3) {
            this.k = 0;
            e(false);
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
        int measuredWidth = (((((getMeasuredWidth() - min) - t.C(this)) - i2) - this.l) - t.D(this)) / 2;
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
        e(false);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f3001d;
        return aVar != null && aVar.n();
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
            return this.f3001d.b();
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
        return this.f3005h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3004g;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.f3001d.f();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (c()) {
            return this.f3001d.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.f3001d.h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.f3001d.i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f, b.g.l.s
    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.f3001d.j() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f, b.g.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.f3001d.k() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c()) {
            h.f(this, this.f3001d.d());
        }
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
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f3001d) == null) {
            return;
        }
        aVar.B(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        f();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f3006d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3006d = this.m;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f();
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
            this.f3001d.p(i);
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
                this.f3001d.q();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
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
            this.f3001d.r(z);
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
        Iterator<a> it = this.f3002e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.m);
        }
        this.n = false;
    }

    public void setCornerRadius(int i) {
        if (c()) {
            this.f3001d.s(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (c()) {
            this.f3001d.d().U(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            e(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.o != i) {
            this.o = i;
            f();
        }
    }

    public void setIconPadding(int i) {
        if (this.l != i) {
            this.l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? b.a.k.a.a.d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.j == i) {
                return;
            }
            this.j = i;
            e(true);
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3005h != colorStateList) {
            this.f3005h = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3004g != mode) {
            this.f3004g = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(b.a.k.a.a.c(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f3003f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f3003f;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.f3001d.t(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (c()) {
            setRippleColor(b.a.k.a.a.c(getContext(), i));
        }
    }

    @Override // d.a.a.a.a0.n
    public void setShapeAppearanceModel(k kVar) {
        if (c()) {
            this.f3001d.u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            this.f3001d.v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.f3001d.w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (c()) {
            setStrokeColor(b.a.k.a.a.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (c()) {
            this.f3001d.x(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.f, b.g.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f3001d.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f, b.g.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f3001d.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.m);
    }
}
