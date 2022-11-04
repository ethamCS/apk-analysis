package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
class g extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;

    /* renamed from: a */
    private final int f724a;

    /* renamed from: c */
    private Paint f726c;

    /* renamed from: d */
    private Paint f727d;

    /* renamed from: f */
    private float f729f;

    /* renamed from: g */
    private Path f730g;

    /* renamed from: h */
    private float f731h;
    private float i;
    private float j;
    private ColorStateList k;
    private final int m;
    private final int n;
    private boolean l = true;
    private boolean o = true;
    private boolean p = false;

    /* renamed from: b */
    private Paint f725b = new Paint(5);

    /* renamed from: e */
    private final RectF f728e = new RectF();

    /* loaded from: classes.dex */
    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.m = resources.getColor(b.c.b.d_res_0x7f06002c);
        this.n = resources.getColor(b.c.b.c_res_0x7f06002b);
        this.f724a = resources.getDimensionPixelSize(b.c.c.a_res_0x7f070052);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f726c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f729f = (int) (f2 + 0.5f);
        Paint paint2 = new Paint(this.f726c);
        this.f727d = paint2;
        paint2.setAntiAlias(false);
        s(f3, f4);
    }

    private void a(Rect rect) {
        float f2 = this.f731h;
        float f3 = 1.5f * f2;
        this.f728e.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        b();
    }

    private void b() {
        float f2 = this.f729f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.i;
        rectF2.inset(-f3, -f3);
        Path path = this.f730g;
        if (path == null) {
            this.f730g = new Path();
        } else {
            path.reset();
        }
        this.f730g.setFillType(Path.FillType.EVEN_ODD);
        this.f730g.moveTo(-this.f729f, 0.0f);
        this.f730g.rLineTo(-this.i, 0.0f);
        this.f730g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f730g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f730g.close();
        float f4 = this.f729f;
        float f5 = f4 / (this.i + f4);
        Paint paint = this.f726c;
        float f6 = this.f729f + this.i;
        int i = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.n}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f727d;
        float f7 = this.f729f;
        float f8 = this.i;
        int i2 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i2, i2, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f727d.setAntiAlias(false);
    }

    public static float c(float f2, float f3, boolean z) {
        return z ? (float) (f2 + ((1.0d - q) * f3)) : f2;
    }

    public static float d(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (f4 + ((1.0d - q) * f3)) : f4;
    }

    private void e(Canvas canvas) {
        float f2 = this.f729f;
        float f3 = (-f2) - this.i;
        float f4 = f2 + this.f724a + (this.j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f728e.width() - f5 > 0.0f;
        boolean z2 = this.f728e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f728e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f730g, this.f726c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f728e.width() - f5, -this.f729f, this.f727d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f728e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f730g, this.f726c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f728e.width() - f5, (-this.f729f) + this.i, this.f727d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f728e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f730g, this.f726c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f728e.height() - f5, -this.f729f, this.f727d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f728e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f730g, this.f726c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f728e.height() - f5, -this.f729f, this.f727d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.f725b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        } else {
            float t = t(f2);
            float t2 = t(f3);
            if (t > t2) {
                if (!this.p) {
                    this.p = true;
                }
                t = t2;
            }
            if (this.j == t && this.f731h == t2) {
                return;
            }
            this.j = t;
            this.f731h = t2;
            this.i = (int) ((t * 1.5f) + this.f724a + 0.5f);
            this.l = true;
            invalidateSelf();
        }
    }

    private int t(float f2) {
        int i = (int) (f2 + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.f728e, this.f729f, this.f725b);
    }

    public ColorStateList f() {
        return this.k;
    }

    public float g() {
        return this.f729f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f731h, this.f729f, this.o));
        int ceil2 = (int) Math.ceil(c(this.f731h, this.f729f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f731h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f2 = this.f731h;
        return (Math.max(f2, this.f729f + this.f724a + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f731h * 1.5f) + this.f724a) * 2.0f);
    }

    public float k() {
        float f2 = this.f731h;
        return (Math.max(f2, this.f729f + this.f724a + (f2 / 2.0f)) * 2.0f) + ((this.f731h + this.f724a) * 2.0f);
    }

    public float l() {
        return this.j;
    }

    public void m(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f725b.getColor() == colorForState) {
            return false;
        }
        this.f725b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f729f == f3) {
            return;
        }
        this.f729f = f3;
        this.l = true;
        invalidateSelf();
    }

    public void q(float f2) {
        s(this.j, f2);
    }

    public void r(float f2) {
        s(f2, this.f731h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f725b.setAlpha(i);
        this.f726c.setAlpha(i);
        this.f727d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f725b.setColorFilter(colorFilter);
    }
}
