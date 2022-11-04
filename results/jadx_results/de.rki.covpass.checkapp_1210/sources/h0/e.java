package h0;

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
class e extends Drawable {

    /* renamed from: a */
    private float f11127a;

    /* renamed from: e */
    private float f11131e;

    /* renamed from: h */
    private ColorStateList f11134h;

    /* renamed from: i */
    private PorterDuffColorFilter f11135i;

    /* renamed from: j */
    private ColorStateList f11136j;

    /* renamed from: f */
    private boolean f11132f = false;

    /* renamed from: g */
    private boolean f11133g = true;

    /* renamed from: k */
    private PorterDuff.Mode f11137k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f11128b = new Paint(5);

    /* renamed from: c */
    private final RectF f11129c = new RectF();

    /* renamed from: d */
    private final Rect f11130d = new Rect();

    public e(ColorStateList colorStateList, float f10) {
        this.f11127a = f10;
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
        this.f11134h = colorStateList;
        this.f11128b.setColor(colorStateList.getColorForState(getState(), this.f11134h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f11129c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f11130d.set(rect);
        if (this.f11132f) {
            float b10 = f.b(this.f11131e, this.f11127a, this.f11133g);
            this.f11130d.inset((int) Math.ceil(f.a(this.f11131e, this.f11127a, this.f11133g)), (int) Math.ceil(b10));
            this.f11129c.set(this.f11130d);
        }
    }

    public ColorStateList b() {
        return this.f11134h;
    }

    public float c() {
        return this.f11131e;
    }

    public float d() {
        return this.f11127a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f11128b;
        if (this.f11135i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f11135i);
            z10 = true;
        }
        RectF rectF = this.f11129c;
        float f10 = this.f11127a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f11131e && this.f11132f == z10 && this.f11133g == z11) {
            return;
        }
        this.f11131e = f10;
        this.f11132f = z10;
        this.f11133g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f11130d, this.f11127a);
    }

    public void h(float f10) {
        if (f10 == this.f11127a) {
            return;
        }
        this.f11127a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f11136j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f11134h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f11134h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f11128b.getColor();
        if (z10) {
            this.f11128b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f11136j;
        if (colorStateList2 == null || (mode = this.f11137k) == null) {
            return z10;
        }
        this.f11135i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f11128b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11128b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f11136j = colorStateList;
        this.f11135i = a(colorStateList, this.f11137k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f11137k = mode;
        this.f11135i = a(this.f11136j, mode);
        invalidateSelf();
    }
}
