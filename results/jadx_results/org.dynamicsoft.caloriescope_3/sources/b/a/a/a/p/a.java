package b.a.a.a.p;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import b.a.a.a.b0.k;
import b.a.a.a.b0.n;
/* loaded from: classes.dex */
public class a extends a.c.a.a implements Checkable, n {
    private static final int[] l = {16842911};
    private static final int[] m = {16842912};
    private static final int[] n = {b.a.a.a.b.state_dragged};
    private final b g;
    private boolean h;
    private boolean i;
    private boolean j;
    private AbstractC0051a k;

    /* renamed from: b.a.a.a.p.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0051a {
        void a(a aVar, boolean z);
    }

    private void e() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        this.g.a();
        throw null;
    }

    public boolean c() {
        b bVar = this.g;
        if (bVar == null) {
            return false;
        }
        bVar.o();
        throw null;
    }

    public boolean d() {
        return this.j;
    }

    @Override // a.c.a.a
    public ColorStateList getCardBackgroundColor() {
        this.g.c();
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.g.d();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.g.e();
        throw null;
    }

    @Override // a.c.a.a
    public int getContentPaddingBottom() {
        this.g.m();
        throw null;
    }

    @Override // a.c.a.a
    public int getContentPaddingLeft() {
        this.g.m();
        throw null;
    }

    @Override // a.c.a.a
    public int getContentPaddingRight() {
        this.g.m();
        throw null;
    }

    @Override // a.c.a.a
    public int getContentPaddingTop() {
        this.g.m();
        throw null;
    }

    public float getProgress() {
        this.g.g();
        throw null;
    }

    @Override // a.c.a.a
    public float getRadius() {
        this.g.f();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.g.h();
        throw null;
    }

    public k getShapeAppearanceModel() {
        this.g.i();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.g.j();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.g.k();
        throw null;
    }

    public int getStrokeWidth() {
        this.g.l();
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.b();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (c()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, m);
        }
        if (d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a.c.a.a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a.c.a.a.class.getName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.c.a.a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g.a(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!this.h) {
            return;
        }
        this.g.n();
        throw null;
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // a.c.a.a
    public void setCardBackgroundColor(int i) {
        this.g.a(ColorStateList.valueOf(i));
        throw null;
    }

    @Override // a.c.a.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.a(colorStateList);
        throw null;
    }

    @Override // a.c.a.a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.g.q();
        throw null;
    }

    public void setCheckable(boolean z) {
        this.g.a(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.a(drawable);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        this.g.a(a.a.k.a.a.c(getContext(), i));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.g.b(colorStateList);
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.g.p();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // a.c.a.a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.r();
        throw null;
    }

    public void setOnCheckedChangeListener(AbstractC0051a abstractC0051a) {
        this.k = abstractC0051a;
    }

    @Override // a.c.a.a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.g.r();
        throw null;
    }

    public void setProgress(float f) {
        this.g.b(f);
        throw null;
    }

    @Override // a.c.a.a
    public void setRadius(float f) {
        super.setRadius(f);
        this.g.a(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.g.c(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i) {
        this.g.c(a.a.k.a.a.b(getContext(), i));
        throw null;
    }

    @Override // b.a.a.a.b0.n
    public void setShapeAppearanceModel(k kVar) {
        this.g.a(kVar);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.g.d(ColorStateList.valueOf(i));
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.g.d(colorStateList);
        throw null;
    }

    public void setStrokeWidth(int i) {
        this.g.a(i);
        throw null;
    }

    @Override // a.c.a.a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.g.r();
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (!c() || !isEnabled()) {
            return;
        }
        this.i = !this.i;
        refreshDrawableState();
        e();
        AbstractC0051a abstractC0051a = this.k;
        if (abstractC0051a == null) {
            return;
        }
        abstractC0051a.a(this, this.i);
    }
}
