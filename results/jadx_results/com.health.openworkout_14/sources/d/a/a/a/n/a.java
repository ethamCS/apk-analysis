package d.a.a.a.n;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import d.a.a.a.a0.k;
import d.a.a.a.a0.n;
/* loaded from: classes.dex */
public class a extends CardView implements Checkable, n {
    private static final int[] p = {16842911};
    private static final int[] q = {16842912};
    private static final int[] r = {d.a.a.a.b.y_res_0x7f0402e6};
    private final b k;
    private boolean l;
    private boolean m;
    private boolean n;
    private AbstractC0100a o;

    /* renamed from: d.a.a.a.n.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0100a {
        void a(a aVar, boolean z);
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.k.a();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.k.b().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.k.c();
    }

    public ColorStateList getCardForegroundColor() {
        return this.k.d();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.k.e();
    }

    public ColorStateList getCheckedIconTint() {
        return this.k.f();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.k.n().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.k.n().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.k.n().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.k.n().top;
    }

    public float getProgress() {
        return this.k.h();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.k.g();
    }

    public ColorStateList getRippleColor() {
        return this.k.i();
    }

    public k getShapeAppearanceModel() {
        return this.k.j();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.k.k();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.k.l();
    }

    public int getStrokeWidth() {
        return this.k.m();
    }

    public boolean h() {
        b bVar = this.k;
        return bVar != null && bVar.p();
    }

    public boolean i() {
        return this.n;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.b();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, r);
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
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.k.q(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.l) {
            if (!this.k.o()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.k.r(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.k.s(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.k.s(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.k.F();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.k.t(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.k.u(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.k.v(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.k.v(b.a.k.a.a.d(getContext(), i));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.k.w(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        b bVar = this.k;
        if (bVar != null) {
            bVar.D();
        }
    }

    public void setDragged(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.k.G();
    }

    public void setOnCheckedChangeListener(AbstractC0100a abstractC0100a) {
        this.o = abstractC0100a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.k.G();
        this.k.E();
    }

    public void setProgress(float f2) {
        this.k.y(f2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.k.x(f2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.k.z(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.k.z(b.a.k.a.a.c(getContext(), i));
        throw null;
    }

    @Override // d.a.a.a.a0.n
    public void setShapeAppearanceModel(k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.u(getBoundsAsRectF()));
        }
        this.k.A(kVar);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.k.B(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.k.B(colorStateList);
    }

    public void setStrokeWidth(int i) {
        this.k.C(i);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.k.G();
        this.k.E();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (!h() || !isEnabled()) {
            return;
        }
        this.m = !this.m;
        refreshDrawableState();
        g();
        AbstractC0100a abstractC0100a = this.o;
        if (abstractC0100a == null) {
            return;
        }
        abstractC0100a.a(this, this.m);
    }
}
