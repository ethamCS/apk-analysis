package a.a.l.a;

import a.a.i;
import a.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class d extends Drawable {
    private static final float m = (float) Math.toRadians(45.0d);

    /* renamed from: b */
    private float f21b;

    /* renamed from: c */
    private float f22c;
    private float d;
    private float e;
    private boolean f;
    private final int h;
    private float j;
    private float k;

    /* renamed from: a */
    private final Paint f20a = new Paint();
    private final Path g = new Path();
    private boolean i = false;
    private int l = 2;

    public d(Context context) {
        this.f20a.setStyle(Paint.Style.STROKE);
        this.f20a.setStrokeJoin(Paint.Join.MITER);
        this.f20a.setStrokeCap(Paint.Cap.BUTT);
        this.f20a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, a.a.a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0));
        a(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        a(obtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true));
        b(Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.h = obtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f22c = Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f21b = Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.d = obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void a(float f) {
        if (this.f20a.getStrokeWidth() != f) {
            this.f20a.setStrokeWidth(f);
            double d = f / 2.0f;
            double cos = Math.cos(m);
            Double.isNaN(d);
            this.k = (float) (d * cos);
            invalidateSelf();
        }
    }

    public void a(int i) {
        if (i != this.f20a.getColor()) {
            this.f20a.setColor(i);
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    public void b(float f) {
        if (f != this.e) {
            this.e = f;
            invalidateSelf();
        }
    }

    public void b(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidateSelf();
        }
    }

    public void c(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? androidx.core.graphics.drawable.a.e(this) == 0 : androidx.core.graphics.drawable.a.e(this) == 1))) {
            z = true;
        }
        float f2 = this.f21b;
        float a2 = a(this.f22c, (float) Math.sqrt(f2 * f2 * 2.0f), this.j);
        float a3 = a(this.f22c, this.d, this.j);
        float round = Math.round(a(0.0f, this.k, this.j));
        float a4 = a(0.0f, m, this.j);
        float a5 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d = a2;
        double d2 = a4;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.g.rewind();
        float a6 = a(this.e + this.f20a.getStrokeWidth(), -this.k, this.j);
        float f3 = (-a3) / 2.0f;
        this.g.moveTo(f3 + round, 0.0f);
        this.g.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.g.moveTo(f3, a6);
        this.g.rLineTo(round2, round3);
        this.g.moveTo(f3, -a6);
        this.g.rLineTo(round2, -round3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.f20a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f))) / 4) * 2) + (strokeWidth * 1.5f) + this.e);
        if (this.f) {
            canvas.rotate(a5 * (this.i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.f20a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f20a.getAlpha()) {
            this.f20a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
