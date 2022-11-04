package b.a.l.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b.a.i;
import b.a.j;
/* loaded from: classes.dex */
public class d extends Drawable {
    private static final float m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    private final Paint f2028a;

    /* renamed from: b */
    private float f2029b;

    /* renamed from: c */
    private float f2030c;

    /* renamed from: d */
    private float f2031d;

    /* renamed from: e */
    private float f2032e;

    /* renamed from: f */
    private boolean f2033f;

    /* renamed from: h */
    private final int f2035h;
    private float j;
    private float k;

    /* renamed from: g */
    private final Path f2034g = new Path();
    private boolean i = false;
    private int l = 2;

    public d(Context context) {
        Paint paint = new Paint();
        this.f2028a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.Q0, b.a.a.A_res_0x7f040126, i.b_res_0x7f1100b6);
        d(obtainStyledAttributes.getColor(j.U0, 0));
        c(obtainStyledAttributes.getDimension(j.Y0, 0.0f));
        f(obtainStyledAttributes.getBoolean(j.X0, true));
        e(Math.round(obtainStyledAttributes.getDimension(j.W0, 0.0f)));
        this.f2035h = obtainStyledAttributes.getDimensionPixelSize(j.V0, 0);
        this.f2030c = Math.round(obtainStyledAttributes.getDimension(j.T0, 0.0f));
        this.f2029b = Math.round(obtainStyledAttributes.getDimension(j.R0, 0.0f));
        this.f2031d = obtainStyledAttributes.getDimension(j.S0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float b(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public float a() {
        return this.j;
    }

    public void c(float f2) {
        if (this.f2028a.getStrokeWidth() != f2) {
            this.f2028a.setStrokeWidth(f2);
            this.k = (float) ((f2 / 2.0f) * Math.cos(m));
            invalidateSelf();
        }
    }

    public void d(int i) {
        if (i != this.f2028a.getColor()) {
            this.f2028a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? androidx.core.graphics.drawable.a.f(this) == 0 : androidx.core.graphics.drawable.a.f(this) == 1))) {
            z = true;
        }
        float f3 = this.f2029b;
        float b2 = b(this.f2030c, (float) Math.sqrt(f3 * f3 * 2.0f), this.j);
        float b3 = b(this.f2030c, this.f2031d, this.j);
        float round = Math.round(b(0.0f, this.k, this.j));
        float b4 = b(0.0f, m, this.j);
        float b5 = b(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d2 = b2;
        double d3 = b4;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(d2 * Math.sin(d3));
        this.f2034g.rewind();
        float b6 = b(this.f2032e + this.f2028a.getStrokeWidth(), -this.k, this.j);
        float f4 = (-b3) / 2.0f;
        this.f2034g.moveTo(f4 + round, 0.0f);
        this.f2034g.rLineTo(b3 - (round * 2.0f), 0.0f);
        this.f2034g.moveTo(f4, b6);
        this.f2034g.rLineTo(round2, round3);
        this.f2034g.moveTo(f4, -b6);
        this.f2034g.rLineTo(round2, -round3);
        this.f2034g.close();
        canvas.save();
        float strokeWidth = this.f2028a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f2))) / 4) * 2) + (strokeWidth * 1.5f) + this.f2032e);
        if (this.f2033f) {
            canvas.rotate(b5 * (this.i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f2034g, this.f2028a);
        canvas.restore();
    }

    public void e(float f2) {
        if (f2 != this.f2032e) {
            this.f2032e = f2;
            invalidateSelf();
        }
    }

    public void f(boolean z) {
        if (this.f2033f != z) {
            this.f2033f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2035h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2035h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f2028a.getAlpha()) {
            this.f2028a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2028a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f2) {
        if (this.j != f2) {
            this.j = f2;
            invalidateSelf();
        }
    }
}
