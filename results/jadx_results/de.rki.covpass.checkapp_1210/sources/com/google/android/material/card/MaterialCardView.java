package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import b5.b;
import b5.k;
import t5.h;
import t5.n;
/* loaded from: classes.dex */
public class MaterialCardView extends h0.a implements Checkable, n {

    /* renamed from: d4 */
    private static final int[] f7009d4 = {16842911};

    /* renamed from: e4 */
    private static final int[] f7010e4 = {16842912};

    /* renamed from: f4 */
    private static final int[] f7011f4 = {b.G};

    /* renamed from: g4 */
    private static final int f7012g4 = k.f5497p;
    private final com.google.android.material.card.a Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private boolean f7013a4;

    /* renamed from: b4 */
    private boolean f7014b4;

    /* renamed from: c4 */
    private a f7015c4;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f5465w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f7012g4
            android.content.Context r8 = v5.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f7013a4 = r8
            r7.f7014b4 = r8
            r0 = 1
            r7.Z3 = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = b5.l.f5602k3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.Y3 = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.Y(r9, r10, r1, r2)
            r0.G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.Y3.i();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.Y3.j().getBounds());
        return rectF;
    }

    public boolean g() {
        com.google.android.material.card.a aVar = this.Y3;
        return aVar != null && aVar.D();
    }

    @Override // h0.a
    public ColorStateList getCardBackgroundColor() {
        return this.Y3.k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.Y3.l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.Y3.m();
    }

    public int getCheckedIconGravity() {
        return this.Y3.n();
    }

    public int getCheckedIconMargin() {
        return this.Y3.o();
    }

    public int getCheckedIconSize() {
        return this.Y3.p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.Y3.q();
    }

    @Override // h0.a
    public int getContentPaddingBottom() {
        return this.Y3.A().bottom;
    }

    @Override // h0.a
    public int getContentPaddingLeft() {
        return this.Y3.A().left;
    }

    @Override // h0.a
    public int getContentPaddingRight() {
        return this.Y3.A().right;
    }

    @Override // h0.a
    public int getContentPaddingTop() {
        return this.Y3.A().top;
    }

    public float getProgress() {
        return this.Y3.u();
    }

    @Override // h0.a
    public float getRadius() {
        return this.Y3.s();
    }

    public ColorStateList getRippleColor() {
        return this.Y3.v();
    }

    public t5.k getShapeAppearanceModel() {
        return this.Y3.w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.Y3.x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.Y3.y();
    }

    public int getStrokeWidth() {
        return this.Y3.z();
    }

    public boolean h() {
        return this.f7014b4;
    }

    public void i(int i10, int i11, int i12, int i13) {
        super.d(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7013a4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.Y3.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7009d4);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7010e4);
        }
        if (h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7011f4);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h0.a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.Y3.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.Z3) {
            if (!this.Y3.C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.Y3.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // h0.a
    public void setCardBackgroundColor(int i10) {
        this.Y3.J(ColorStateList.valueOf(i10));
    }

    @Override // h0.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.Y3.J(colorStateList);
    }

    @Override // h0.a
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.Y3.d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.Y3.K(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.Y3.L(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f7013a4 != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.Y3.N(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.Y3.n() != i10) {
            this.Y3.O(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.Y3.P(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.Y3.P(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.Y3.N(g.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.Y3.Q(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.Y3.Q(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.Y3.R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        com.google.android.material.card.a aVar = this.Y3;
        if (aVar != null) {
            aVar.b0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f7014b4 != z10) {
            this.f7014b4 = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // h0.a
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.Y3.f0();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f7015c4 = aVar;
    }

    @Override // h0.a
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.Y3.f0();
        this.Y3.c0();
    }

    public void setProgress(float f10) {
        this.Y3.T(f10);
    }

    @Override // h0.a
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.Y3.S(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.Y3.U(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.Y3.U(g.a.a(getContext(), i10));
    }

    @Override // t5.n
    public void setShapeAppearanceModel(t5.k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.Y3.V(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.Y3.W(colorStateList);
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        this.Y3.X(i10);
        invalidate();
    }

    @Override // h0.a
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.Y3.f0();
        this.Y3.c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (!g() || !isEnabled()) {
            return;
        }
        this.f7013a4 = !this.f7013a4;
        refreshDrawableState();
        f();
        this.Y3.M(this.f7013a4);
        a aVar = this.f7015c4;
        if (aVar == null) {
            return;
        }
        aVar.a(this, this.f7013a4);
    }
}
