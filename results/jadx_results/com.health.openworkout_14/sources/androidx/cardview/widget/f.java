package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a */
    private float f716a;

    /* renamed from: e */
    private float f720e;

    /* renamed from: h */
    private ColorStateList f723h;
    private PorterDuffColorFilter i;
    private ColorStateList j;

    /* renamed from: f */
    private boolean f721f = false;

    /* renamed from: g */
    private boolean f722g = true;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f717b = new Paint(5);

    /* renamed from: c */
    private final RectF f718c = new RectF();

    /* renamed from: d */
    private final Rect f719d = new Rect();

    public f(ColorStateList colorStateList, float f2) {
        this.f716a = f2;
        e(colorStateList);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f723h = colorStateList;
        this.f717b.setColor(colorStateList.getColorForState(getState(), this.f723h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f718c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f719d.set(rect);
        if (this.f721f) {
            float d2 = g.d(this.f720e, this.f716a, this.f722g);
            this.f719d.inset((int) Math.ceil(g.c(this.f720e, this.f716a, this.f722g)), (int) Math.ceil(d2));
            this.f718c.set(this.f719d);
        }
    }

    public ColorStateList b() {
        return this.f723h;
    }

    public float c() {
        return this.f720e;
    }

    public float d() {
        return this.f716a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f717b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f718c;
        float f2 = this.f716a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f2, boolean z, boolean z2) {
        if (f2 == this.f720e && this.f721f == z && this.f722g == z2) {
            return;
        }
        this.f720e = f2;
        this.f721f = z;
        this.f722g = z2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f719d, this.f716a);
    }

    public void h(float f2) {
        if (f2 == this.f716a) {
            return;
        }
        this.f716a = f2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f723h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f723h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f717b.getColor();
        if (z) {
            this.f717b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f717b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f717b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
