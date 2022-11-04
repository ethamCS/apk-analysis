package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class u0 extends CompoundButton {
    private static final Property<u0, Float> G4 = new a(Float.class, "thumbPos");
    private static final int[] H4 = {16842912};
    private TransformationMethod A4;
    ObjectAnimator B4;
    private final b0 C4;
    private m D4;
    private b E4;
    private final Rect F4;
    private Drawable U3;
    private ColorStateList V3;
    private PorterDuff.Mode W3;
    private boolean X3;
    private boolean Y3;
    private int Z3;

    /* renamed from: a4 */
    private int f1516a4;

    /* renamed from: b4 */
    private int f1517b4;

    /* renamed from: c */
    private Drawable f1518c;

    /* renamed from: c4 */
    private boolean f1519c4;

    /* renamed from: d */
    private ColorStateList f1520d;

    /* renamed from: d4 */
    private CharSequence f1521d4;

    /* renamed from: e4 */
    private CharSequence f1522e4;

    /* renamed from: f4 */
    private CharSequence f1523f4;

    /* renamed from: g4 */
    private CharSequence f1524g4;

    /* renamed from: h4 */
    private boolean f1525h4;

    /* renamed from: i4 */
    private int f1526i4;

    /* renamed from: j4 */
    private int f1527j4;

    /* renamed from: k4 */
    private float f1528k4;

    /* renamed from: l4 */
    private float f1529l4;

    /* renamed from: m4 */
    private VelocityTracker f1530m4;

    /* renamed from: n4 */
    private int f1531n4;

    /* renamed from: o4 */
    float f1532o4;

    /* renamed from: p4 */
    private int f1533p4;

    /* renamed from: q */
    private PorterDuff.Mode f1534q;

    /* renamed from: q4 */
    private int f1535q4;

    /* renamed from: r4 */
    private int f1536r4;

    /* renamed from: s4 */
    private int f1537s4;

    /* renamed from: t4 */
    private int f1538t4;

    /* renamed from: u4 */
    private int f1539u4;

    /* renamed from: v4 */
    private int f1540v4;

    /* renamed from: w4 */
    private final TextPaint f1541w4;

    /* renamed from: x */
    private boolean f1542x;

    /* renamed from: x4 */
    private ColorStateList f1543x4;

    /* renamed from: y */
    private boolean f1544y;

    /* renamed from: y4 */
    private Layout f1545y4;

    /* renamed from: z4 */
    private Layout f1546z4;

    /* loaded from: classes.dex */
    class a extends Property<u0, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(u0 u0Var) {
            return Float.valueOf(u0Var.f1532o4);
        }

        /* renamed from: b */
        public void set(u0 u0Var, Float f10) {
            u0Var.setThumbPosition(f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d.e {

        /* renamed from: a */
        private final Reference<u0> f1547a;

        b(u0 u0Var) {
            this.f1547a = new WeakReference(u0Var);
        }

        @Override // androidx.emoji2.text.d.e
        public void a(Throwable th2) {
            u0 u0Var = this.f1547a.get();
            if (u0Var != null) {
                u0Var.j();
            }
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            u0 u0Var = this.f1547a.get();
            if (u0Var != null) {
                u0Var.j();
            }
        }
    }

    public u0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.L);
    }

    public u0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1520d = null;
        this.f1534q = null;
        this.f1542x = false;
        this.f1544y = false;
        this.V3 = null;
        this.W3 = null;
        this.X3 = false;
        this.Y3 = false;
        this.f1530m4 = VelocityTracker.obtain();
        this.F4 = new Rect();
        v0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1541w4 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = e.j.D2;
        a1 v10 = a1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.y.m0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(e.j.G2);
        this.f1518c = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(e.j.P2);
        this.U3 = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(e.j.E2));
        setTextOffInternal(v10.p(e.j.F2));
        this.f1525h4 = v10.a(e.j.H2, true);
        this.Z3 = v10.f(e.j.M2, 0);
        this.f1516a4 = v10.f(e.j.J2, 0);
        this.f1517b4 = v10.f(e.j.K2, 0);
        this.f1519c4 = v10.a(e.j.I2, false);
        ColorStateList c10 = v10.c(e.j.N2);
        if (c10 != null) {
            this.f1520d = c10;
            this.f1542x = true;
        }
        PorterDuff.Mode e10 = h0.e(v10.k(e.j.O2, -1), null);
        if (this.f1534q != e10) {
            this.f1534q = e10;
            this.f1544y = true;
        }
        if (this.f1542x || this.f1544y) {
            b();
        }
        ColorStateList c11 = v10.c(e.j.Q2);
        if (c11 != null) {
            this.V3 = c11;
            this.X3 = true;
        }
        PorterDuff.Mode e11 = h0.e(v10.k(e.j.R2, -1), null);
        if (this.W3 != e11) {
            this.W3 = e11;
            this.Y3 = true;
        }
        if (this.X3 || this.Y3) {
            c();
        }
        int n10 = v10.n(e.j.L2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        b0 b0Var = new b0(this);
        this.C4 = b0Var;
        b0Var.m(attributeSet, i10);
        v10.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1527j4 = viewConfiguration.getScaledTouchSlop();
        this.f1531n4 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, G4, z10 ? 1.0f : 0.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(250L);
        this.B4.setAutoCancel(true);
        this.B4.start();
    }

    private void b() {
        Drawable drawable = this.f1518c;
        if (drawable != null) {
            if (!this.f1542x && !this.f1544y) {
                return;
            }
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f1518c = mutate;
            if (this.f1542x) {
                androidx.core.graphics.drawable.a.o(mutate, this.f1520d);
            }
            if (this.f1544y) {
                androidx.core.graphics.drawable.a.p(this.f1518c, this.f1534q);
            }
            if (!this.f1518c.isStateful()) {
                return;
            }
            this.f1518c.setState(getDrawableState());
        }
    }

    private void c() {
        Drawable drawable = this.U3;
        if (drawable != null) {
            if (!this.X3 && !this.Y3) {
                return;
            }
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.U3 = mutate;
            if (this.X3) {
                androidx.core.graphics.drawable.a.o(mutate, this.V3);
            }
            if (this.Y3) {
                androidx.core.graphics.drawable.a.p(this.U3, this.W3);
            }
            if (!this.U3.isStateful()) {
                return;
            }
            this.U3.setState(getDrawableState());
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.B4;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.A4);
        return f10 != null ? f10.getTransformation(charSequence, this) : charSequence;
    }

    private m getEmojiTextViewHelper() {
        if (this.D4 == null) {
            this.D4 = new m(this);
        }
        return this.D4;
    }

    private boolean getTargetCheckedState() {
        return this.f1532o4 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((h1.b(this) ? 1.0f - this.f1532o4 : this.f1532o4) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.U3;
        if (drawable != null) {
            Rect rect = this.F4;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f1518c;
            Rect d10 = drawable2 != null ? h0.d(drawable2) : h0.f1340c;
            return ((((this.f1533p4 - this.f1536r4) - rect.left) - rect.right) - d10.left) - d10.right;
        }
        return 0;
    }

    private boolean h(float f10, float f11) {
        if (this.f1518c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1518c.getPadding(this.F4);
        int i10 = this.f1538t4;
        int i11 = this.f1527j4;
        int i12 = i10 - i11;
        int i13 = (this.f1537s4 + thumbOffset) - i11;
        Rect rect = this.F4;
        return f10 > ((float) i13) && f10 < ((float) ((((this.f1536r4 + i13) + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f1540v4 + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.f1541w4;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1523f4;
            if (charSequence == null) {
                charSequence = getResources().getString(e.h.b_res_0x7f100061);
            }
            androidx.core.view.y.F0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1521d4;
            if (charSequence == null) {
                charSequence = getResources().getString(e.h.c_res_0x7f100062);
            }
            androidx.core.view.y.F0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.E4 != null || !this.D4.b() || !androidx.emoji2.text.d.h()) {
            return;
        }
        androidx.emoji2.text.d b10 = androidx.emoji2.text.d.b();
        int d10 = b10.d();
        if (d10 != 3 && d10 != 0) {
            return;
        }
        b bVar = new b(this);
        this.E4 = bVar;
        b10.s(bVar);
    }

    private void q(MotionEvent motionEvent) {
        this.f1526i4 = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f1530m4.computeCurrentVelocity(1000);
            float xVelocity = this.f1530m4.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1531n4) {
                z10 = getTargetCheckedState();
            } else if (!h1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1523f4 = charSequence;
        this.f1524g4 = g(charSequence);
        this.f1546z4 = null;
        if (this.f1525h4) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1521d4 = charSequence;
        this.f1522e4 = g(charSequence);
        this.f1545y4 = null;
        if (this.f1525h4) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.F4;
        int i12 = this.f1537s4;
        int i13 = this.f1538t4;
        int i14 = this.f1539u4;
        int i15 = this.f1540v4;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1518c;
        Rect d10 = drawable != null ? h0.d(drawable) : h0.f1340c;
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d10 != null) {
                int i17 = d10.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d10.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d10.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d10.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.U3.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.U3.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1518c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f1536r4 + rect.right;
            this.f1518c.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1518c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1518c;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.U3;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!h1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1533p4;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1517b4 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (h1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1533p4;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1517b4 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1525h4;
    }

    public boolean getSplitTrack() {
        return this.f1519c4;
    }

    public int getSwitchMinWidth() {
        return this.f1516a4;
    }

    public int getSwitchPadding() {
        return this.f1517b4;
    }

    public CharSequence getTextOff() {
        return this.f1523f4;
    }

    public CharSequence getTextOn() {
        return this.f1521d4;
    }

    public Drawable getThumbDrawable() {
        return this.f1518c;
    }

    public int getThumbTextPadding() {
        return this.Z3;
    }

    public ColorStateList getThumbTintList() {
        return this.f1520d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1534q;
    }

    public Drawable getTrackDrawable() {
        return this.U3;
    }

    public ColorStateList getTrackTintList() {
        return this.V3;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.W3;
    }

    void j() {
        setTextOnInternal(this.f1521d4);
        setTextOffInternal(this.f1523f4);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1518c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.B4;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.B4.end();
        this.B4 = null;
    }

    public void m(Context context, int i10) {
        a1 t10 = a1.t(context, i10, e.j.S2);
        ColorStateList c10 = t10.c(e.j.W2);
        if (c10 == null) {
            c10 = getTextColors();
        }
        this.f1543x4 = c10;
        int f10 = t10.f(e.j.T2, 0);
        if (f10 != 0) {
            float f11 = f10;
            if (f11 != this.f1541w4.getTextSize()) {
                this.f1541w4.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(e.j.U2, -1), t10.k(e.j.V2, -1));
        this.A4 = t10.a(e.j.f9218b3, false) ? new j.a(getContext()) : null;
        setTextOnInternal(this.f1521d4);
        setTextOffInternal(this.f1523f4);
        t10.w();
    }

    public void n(Typeface typeface, int i10) {
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 <= 0) {
            this.f1541w4.setFakeBoldText(false);
            this.f1541w4.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
        setSwitchTypeface(defaultFromStyle);
        int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
        TextPaint textPaint = this.f1541w4;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        textPaint.setFakeBoldText(z10);
        TextPaint textPaint2 = this.f1541w4;
        if ((i11 & 2) != 0) {
            f10 = -0.25f;
        }
        textPaint2.setTextSkewX(f10);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, H4);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        Rect rect = this.F4;
        Drawable drawable = this.U3;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f1538t4;
        int i12 = this.f1540v4;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f1518c;
        if (drawable != null) {
            if (!this.f1519c4 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = h0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1545y4 : this.f1546z4;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1543x4;
            if (colorStateList != null) {
                this.f1541w4.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1541w4.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((i10 / 2) - (layout.getWidth() / 2), ((i13 + i14) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1521d4 : this.f1523f4;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        super.onLayout(z10, i10, i11, i12, i13);
        int i20 = 0;
        if (this.f1518c != null) {
            Rect rect = this.F4;
            Drawable drawable = this.U3;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = h0.d(this.f1518c);
            i14 = Math.max(0, d10.left - rect.left);
            i20 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (h1.b(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.f1533p4 + i16) - i14) - i20;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i20;
            i16 = (i15 - this.f1533p4) + i14 + i20;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i19 = this.f1535q4;
            i18 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i19 / 2);
        } else if (gravity == 80) {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.f1535q4;
            this.f1537s4 = i16;
            this.f1538t4 = i18;
            this.f1540v4 = i17;
            this.f1539u4 = i15;
        } else {
            i18 = getPaddingTop();
            i19 = this.f1535q4;
        }
        i17 = i19 + i18;
        this.f1537s4 = i16;
        this.f1538t4 = i18;
        this.f1540v4 = i17;
        this.f1539u4 = i15;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f1525h4) {
            if (this.f1545y4 == null) {
                this.f1545y4 = i(this.f1522e4);
            }
            if (this.f1546z4 == null) {
                this.f1546z4 = i(this.f1524g4);
            }
        }
        Rect rect = this.F4;
        Drawable drawable = this.f1518c;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f1518c.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f1518c.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        this.f1536r4 = Math.max(this.f1525h4 ? Math.max(this.f1545y4.getWidth(), this.f1546z4.getWidth()) + (this.Z3 * 2) : 0, i13);
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.U3.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1518c;
        if (drawable3 != null) {
            Rect d10 = h0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = Math.max(this.f1516a4, (this.f1536r4 * 2) + i15 + i16);
        int max2 = Math.max(i14, i12);
        this.f1533p4 = max;
        this.f1535q4 = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1521d4 : this.f1523f4;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L42;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1530m4
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f1526i4
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1528k4
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.h1.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f1532o4
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f1532o4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1528k4 = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1528k4
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1527j4
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1529l4
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1527j4
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1526i4 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1528k4 = r0
            r6.f1529l4 = r3
            return r1
        L89:
            int r0 = r6.f1526i4
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1526i4 = r0
            android.view.VelocityTracker r0 = r6.f1530m4
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1526i4 = r1
            r6.f1528k4 = r0
            r6.f1529l4 = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.y.S(this)) {
            a(isChecked);
            return;
        }
        d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1521d4);
        setTextOffInternal(this.f1523f4);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1525h4 != z10) {
            this.f1525h4 = z10;
            requestLayout();
            if (!z10) {
                return;
            }
            p();
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1519c4 = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1516a4 = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1517b4 = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1541w4.getTypeface() == null || this.f1541w4.getTypeface().equals(typeface)) && (this.f1541w4.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1541w4.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1518c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1518c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f1532o4 = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(g.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.Z3 = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1520d = colorStateList;
        this.f1542x = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1534q = mode;
        this.f1544y = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.U3;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.U3 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(g.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.V3 = colorStateList;
        this.X3 = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.W3 = mode;
        this.Y3 = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1518c || drawable == this.U3;
    }
}
