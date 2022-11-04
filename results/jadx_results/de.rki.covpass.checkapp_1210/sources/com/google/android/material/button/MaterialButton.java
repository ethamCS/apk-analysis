package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.view.y;
import androidx.core.widget.j;
import b5.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t5.h;
import t5.n;
/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: f4 */
    private static final int[] f6963f4 = {16842911};

    /* renamed from: g4 */
    private static final int[] f6964g4 = {16842912};

    /* renamed from: h4 */
    private static final int f6965h4 = k.f5496o;
    private b U3;
    private PorterDuff.Mode V3;
    private ColorStateList W3;
    private Drawable X3;
    private int Y3;
    private int Z3;

    /* renamed from: a4 */
    private int f6966a4;

    /* renamed from: b4 */
    private int f6967b4;

    /* renamed from: c4 */
    private boolean f6968c4;

    /* renamed from: d4 */
    private boolean f6969d4;

    /* renamed from: e4 */
    private int f6970e4;

    /* renamed from: x */
    private final com.google.android.material.button.a f6971x;

    /* renamed from: y */
    private final LinkedHashSet<a> f6972y;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* loaded from: classes.dex */
    public static class c extends v0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: q */
        boolean f6973q;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<c> {
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
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            c(parcel);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f6973q = z10;
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6973q ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.t_res_0x7f0302a5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f6965h4
            android.content.Context r9 = v5.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f6972y = r9
            r9 = 0
            r8.f6968c4 = r9
            r8.f6969d4 = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = b5.l.f5673s2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r1 = b5.l.F2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f6967b4 = r1
            int r1 = b5.l.I2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.o.f(r1, r2)
            r8.V3 = r1
            android.content.Context r1 = r8.getContext()
            int r2 = b5.l.H2
            android.content.res.ColorStateList r1 = q5.c.a(r1, r0, r2)
            r8.W3 = r1
            android.content.Context r1 = r8.getContext()
            int r2 = b5.l.D2
            android.graphics.drawable.Drawable r1 = q5.c.d(r1, r0, r2)
            r8.X3 = r1
            int r1 = b5.l.E2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f6970e4 = r1
            int r1 = b5.l.G2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.Y3 = r1
            t5.k$b r10 = t5.k.e(r7, r10, r11, r6)
            t5.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f6971x = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f6967b4
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.X3
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private boolean b() {
        int i10 = this.f6970e4;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f6970e4;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f6970e4;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return y.B(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f6971x;
        return aVar != null && !aVar.o();
    }

    private void g() {
        if (c()) {
            j.j(this, this.X3, null, null, null);
        } else if (b()) {
            j.j(this, null, null, this.X3, null);
        } else if (!d()) {
        } else {
            j.j(this, null, this.X3, null, null);
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z10) {
        Drawable drawable = this.X3;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.X3 = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.W3);
            PorterDuff.Mode mode = this.V3;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.X3, mode);
            }
            int i10 = this.Y3;
            if (i10 == 0) {
                i10 = this.X3.getIntrinsicWidth();
            }
            int i11 = this.Y3;
            if (i11 == 0) {
                i11 = this.X3.getIntrinsicHeight();
            }
            Drawable drawable2 = this.X3;
            int i12 = this.Z3;
            int i13 = this.f6966a4;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.X3.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = j.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.X3) && ((!b() || drawable5 == this.X3) && (!d() || drawable4 == this.X3))) {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.X3 == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (!d()) {
                return;
            }
            this.Z3 = 0;
            if (this.f6970e4 == 16) {
                this.f6966a4 = 0;
                h(false);
                return;
            }
            int i12 = this.Y3;
            if (i12 == 0) {
                i12 = this.X3.getIntrinsicHeight();
            }
            int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.f6967b4) - getPaddingBottom()) / 2;
            if (this.f6966a4 == textHeight) {
                return;
            }
            this.f6966a4 = textHeight;
            h(false);
        }
        this.f6966a4 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f6970e4;
        boolean z10 = true;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.Z3 = 0;
            h(false);
            return;
        }
        int i14 = this.Y3;
        if (i14 == 0) {
            i14 = this.X3.getIntrinsicWidth();
        }
        int textWidth = ((((i10 - getTextWidth()) - y.F(this)) - i14) - this.f6967b4) - y.G(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        boolean e10 = e();
        if (this.f6970e4 != 4) {
            z10 = false;
        }
        if (e10 != z10) {
            textWidth = -textWidth;
        }
        if (this.Z3 == textWidth) {
            return;
        }
        this.Z3 = textWidth;
        h(false);
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f6971x;
        return aVar != null && aVar.p();
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
        if (f()) {
            return this.f6971x.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.X3;
    }

    public int getIconGravity() {
        return this.f6970e4;
    }

    public int getIconPadding() {
        return this.f6967b4;
    }

    public int getIconSize() {
        return this.Y3;
    }

    public ColorStateList getIconTint() {
        return this.W3;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.V3;
    }

    public int getInsetBottom() {
        return this.f6971x.c();
    }

    public int getInsetTop() {
        return this.f6971x.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f6971x.h();
        }
        return null;
    }

    public t5.k getShapeAppearanceModel() {
        if (f()) {
            return this.f6971x.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f6971x.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f6971x.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f6971x.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f6971x.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f6968c4;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f6971x.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6963f4);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6964g4);
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f6973q);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f6973q = this.f6968c4;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.X3 != null) {
            if (!this.X3.setState(getDrawableState())) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f6971x.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f6971x.s();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f6971x.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!a() || !isEnabled() || this.f6968c4 == z10) {
            return;
        }
        this.f6968c4 = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).m(this, this.f6968c4);
        }
        if (this.f6969d4) {
            return;
        }
        this.f6969d4 = true;
        Iterator<a> it = this.f6972y.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f6968c4);
        }
        this.f6969d4 = false;
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f6971x.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f6971x.f().Y(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.X3 != drawable) {
            this.X3 = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f6970e4 != i10) {
            this.f6970e4 = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f6967b4 != i10) {
            this.f6967b4 = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.Y3 == i10) {
                return;
            }
            this.Y3 = i10;
            h(true);
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.W3 != colorStateList) {
            this.W3 = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.V3 != mode) {
            this.V3 = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(g.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f6971x.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f6971x.w(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.U3 = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.U3;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f6971x.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(g.a.a(getContext(), i10));
        }
    }

    @Override // t5.n
    public void setShapeAppearanceModel(t5.k kVar) {
        if (f()) {
            this.f6971x.y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f6971x.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f6971x.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f6971x.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f6971x.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f6971x.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f6968c4);
    }
}
