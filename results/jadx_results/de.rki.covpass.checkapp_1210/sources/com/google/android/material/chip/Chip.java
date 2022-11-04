package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.d;
import androidx.core.view.y;
import b5.j;
import b5.k;
import b5.l;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import java.util.List;
import org.conscrypt.BuildConfig;
import q5.f;
import t5.n;
/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements a.AbstractC0102a, n, h<Chip> {

    /* renamed from: m4 */
    private static final int f7039m4 = k.f5499r;

    /* renamed from: n4 */
    private static final Rect f7040n4 = new Rect();

    /* renamed from: o4 */
    private static final int[] f7041o4 = {16842913};

    /* renamed from: p4 */
    private static final int[] f7042p4 = {16842911};
    private InsetDrawable U3;
    private RippleDrawable V3;
    private View.OnClickListener W3;
    private CompoundButton.OnCheckedChangeListener X3;
    private h.a<Chip> Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private boolean f7043a4;

    /* renamed from: b4 */
    private boolean f7044b4;

    /* renamed from: c4 */
    private boolean f7045c4;

    /* renamed from: d4 */
    private boolean f7046d4;

    /* renamed from: e4 */
    private int f7047e4;

    /* renamed from: f4 */
    private int f7048f4;

    /* renamed from: g4 */
    private CharSequence f7049g4;

    /* renamed from: h4 */
    private final d f7050h4;

    /* renamed from: i4 */
    private boolean f7051i4;

    /* renamed from: j4 */
    private final Rect f7052j4;

    /* renamed from: k4 */
    private final RectF f7053k4;

    /* renamed from: l4 */
    private final f f7054l4;

    /* renamed from: y */
    private com.google.android.material.chip.a f7055y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f {
        a() {
            Chip.this = r1;
        }

        @Override // q5.f
        public void a(int i10) {
        }

        @Override // q5.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f7055y.N2() ? Chip.this.f7055y.j1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        b() {
            Chip.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (Chip.this.Y3 != null) {
                Chip.this.Y3.a(Chip.this, z10);
            }
            if (Chip.this.X3 != null) {
                Chip.this.X3.onCheckedChanged(compoundButton, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ViewOutlineProvider {
        c() {
            Chip.this = r1;
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f7055y != null) {
                Chip.this.f7055y.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends w0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Chip chip) {
            super(chip);
            Chip.this = r1;
        }

        @Override // w0.a
        protected int B(float f10, float f11) {
            return (!Chip.this.o() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 0 : 1;
        }

        @Override // w0.a
        protected void C(List<Integer> list) {
            list.add(0);
            if (!Chip.this.o() || !Chip.this.t() || Chip.this.W3 == null) {
                return;
            }
            list.add(1);
        }

        @Override // w0.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 != 1) {
                    return false;
                }
                return Chip.this.u();
            }
            return false;
        }

        @Override // w0.a
        protected void M(androidx.core.view.accessibility.d dVar) {
            dVar.V(Chip.this.s());
            dVar.Y(Chip.this.isClickable());
            dVar.X(Chip.this.getAccessibilityClassName());
            dVar.u0(Chip.this.getText());
        }

        @Override // w0.a
        protected void N(int i10, androidx.core.view.accessibility.d dVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i10 != 1) {
                dVar.b0(charSequence);
                dVar.T(Chip.f7040n4);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i11 = j.j_res_0x7f100155;
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                closeIconContentDescription = context.getString(i11, objArr).trim();
            }
            dVar.b0(closeIconContentDescription);
            dVar.T(Chip.this.getCloseIconTouchBoundsInt());
            dVar.b(d.a.f3618i);
            dVar.c0(Chip.this.isEnabled());
        }

        @Override // w0.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f7045c4 = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.g_res_0x7f0300b7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f7039m4
            android.content.Context r7 = v5.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f7052j4 = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f7053k4 = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f7054l4 = r7
            android.content.Context r0 = r6.getContext()
            r6.D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.x0(r0, r8, r9, r4)
            r6.p(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.y.w(r6)
            r7.Y(r1)
            int[] r2 = b5.l.f5599k0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r9 = b5.l.V0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$d r8 = new com.google.android.material.chip.Chip$d
            r8.<init>(r6)
            r6.f7050h4 = r8
            r6.y()
            if (r9 != 0) goto L59
            r6.q()
        L59:
            boolean r8 = r6.Z3
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.j1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.d1()
            r6.setEllipsize(r7)
            r6.C()
            com.google.android.material.chip.a r7 = r6.f7055y
            boolean r7 = r7.N2()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.B()
            boolean r7 = r6.w()
            if (r7 == 0) goto L92
            int r7 = r6.f7048f4
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.y.B(r6)
            r6.f7047e4 = r7
            com.google.android.material.chip.Chip$b r7 = new com.google.android.material.chip.Chip$b
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A() {
        this.V3 = new RippleDrawable(r5.b.d(this.f7055y.h1()), getBackgroundDrawable(), null);
        this.f7055y.M2(false);
        y.s0(this, this.V3);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f7055y) == null) {
            return;
        }
        int L0 = (int) (aVar.L0() + this.f7055y.l1() + this.f7055y.s0());
        int Q0 = (int) (this.f7055y.Q0() + this.f7055y.m1() + this.f7055y.o0());
        if (this.U3 != null) {
            Rect rect = new Rect();
            this.U3.getPadding(rect);
            Q0 += rect.left;
            L0 += rect.right;
        }
        y.B0(this, Q0, getPaddingTop(), L0, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        q5.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f7054l4);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) == 8388627) {
            return;
        }
        Log.w("Chip", "Chip text must be vertically center and start aligned");
    }

    public RectF getCloseIconTouchBounds() {
        this.f7053k4.setEmpty();
        if (o() && this.W3 != null) {
            this.f7055y.a1(this.f7053k4);
        }
        return this.f7053k4;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f7052j4.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f7052j4;
    }

    private q5.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.r2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    private int[] l() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f7045c4) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f7044b4) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f7043a4) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f7045c4) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f7044b4) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f7043a4) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void n() {
        if (getBackgroundDrawable() == this.U3 && this.f7055y.getCallback() == null) {
            this.f7055y.setCallback(this.U3);
        }
    }

    public boolean o() {
        com.google.android.material.chip.a aVar = this.f7055y;
        return (aVar == null || aVar.T0() == null) ? false : true;
    }

    private void p(Context context, AttributeSet attributeSet, int i10) {
        TypedArray h10 = m.h(context, attributeSet, l.f5599k0, i10, f7039m4, new int[0]);
        this.f7046d4 = h10.getBoolean(l.Q0, false);
        this.f7048f4 = (int) Math.ceil(h10.getDimension(l.E0, (float) Math.ceil(o.b(getContext(), 48))));
        h10.recycle();
    }

    private void q() {
        setOutlineProvider(new c());
    }

    private void r(int i10, int i11, int i12, int i13) {
        this.U3 = new InsetDrawable((Drawable) this.f7055y, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f7044b4 != z10) {
            this.f7044b4 = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f7043a4 != z10) {
            this.f7043a4 = z10;
            refreshDrawableState();
        }
    }

    private void v() {
        if (this.U3 != null) {
            this.U3 = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.r2(null);
        }
    }

    private void y() {
        boolean z10;
        if (!o() || !t() || this.W3 == null) {
            y.o0(this, null);
            z10 = false;
        } else {
            y.o0(this, this.f7050h4);
            z10 = true;
        }
        this.f7051i4 = z10;
    }

    private void z() {
        if (r5.b.f20473a) {
            A();
            return;
        }
        this.f7055y.M2(true);
        y.s0(this, getBackgroundDrawable());
        B();
        n();
    }

    @Override // com.google.android.material.chip.a.AbstractC0102a
    public void a() {
        m(this.f7048f4);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f7051i4 ? super.dispatchHoverEvent(motionEvent) : this.f7050h4.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7051i4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f7050h4.w(keyEvent) && this.f7050h4.A() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f7055y;
        if ((aVar == null || !aVar.r1()) ? false : this.f7055y.n2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f7049g4)) {
            return this.f7049g4;
        }
        if (!s()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).h()) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.U3;
        return insetDrawable == null ? this.f7055y : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return Math.max(0.0f, aVar.K0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7055y;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (!this.f7051i4 || !(this.f7050h4.A() == 1 || this.f7050h4.x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public c5.h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    public t5.k getShapeAppearanceModel() {
        return this.f7055y.E();
    }

    public c5.h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.l1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public boolean m(int i10) {
        this.f7048f4 = i10;
        int i11 = 0;
        if (!w()) {
            if (this.U3 != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f7055y.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f7055y.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.U3 != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i12 = max2 > 0 ? max2 / 2 : 0;
        if (max > 0) {
            i11 = max / 2;
        }
        if (this.U3 != null) {
            Rect rect = new Rect();
            this.U3.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i12 && rect.right == i12) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        r(i12, i11, i12, i11);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5.h.f(this, this.f7055y);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f7041o4);
        }
        if (s()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f7042p4);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f7051i4) {
            this.f7050h4.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z10 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z10 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z10);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            androidx.core.view.accessibility.d.y0(accessibilityNodeInfo).a0(d.c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f7047e4 != i10) {
            this.f7047e4 = i10;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L21;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f7043a4
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f7043a4
            if (r0 == 0) goto L34
            r5.u()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f7055y;
        return aVar != null && aVar.q1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f7049g4 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.V3) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.V3) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.z1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar == null) {
            this.Z3 = z10;
        } else if (!aVar.q1()) {
        } else {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.B1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.D1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.G1(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.J1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f7055y;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f7055y = aVar;
            aVar.C2(false);
            k(this.f7055y);
            m(this.f7048f4);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.L1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.N1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.P1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.R1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.U1(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.V1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.Z1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.b2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.e2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.f2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.i2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.l2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.o2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.q2(z10);
        }
        y();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.Y(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f7055y == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar == null) {
            return;
        }
        aVar.s2(truncateAt);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f7046d4 = z10;
        m(this.f7048f4);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(c5.h hVar) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.t2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.v2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.x2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    @Override // com.google.android.material.internal.h
    public void setInternalOnCheckedChangeListener(h.a<Chip> aVar) {
        this.Y3 = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f7055y == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.X3 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.W3 = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.A2(colorStateList);
        }
        if (!this.f7055y.o1()) {
            A();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.B2(i10);
            if (this.f7055y.o1()) {
                return;
            }
            A();
        }
    }

    @Override // t5.n
    public void setShapeAppearanceModel(t5.k kVar) {
        this.f7055y.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(c5.h hVar) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.D2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(aVar.N2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f7055y;
        if (aVar2 == null) {
            return;
        }
        aVar2.F2(charSequence);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.H2(i10);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.H2(i10);
        }
        C();
    }

    public void setTextAppearance(q5.d dVar) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.G2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.I2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.J2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.K2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7055y;
        if (aVar != null) {
            aVar.L2(i10);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f7055y;
        return aVar != null && aVar.s1();
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.W3;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f7051i4) {
            this.f7050h4.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.f7046d4;
    }
}
