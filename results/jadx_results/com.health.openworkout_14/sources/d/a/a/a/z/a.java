package d.a.a.a.z;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class a {
    private static final int[] i = new int[3];
    private static final float[] j = {0.0f, 0.5f, 1.0f};
    private static final int[] k = new int[4];
    private static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f3715a;

    /* renamed from: b */
    private final Paint f3716b;

    /* renamed from: c */
    private final Paint f3717c;

    /* renamed from: d */
    private int f3718d;

    /* renamed from: e */
    private int f3719e;

    /* renamed from: f */
    private int f3720f;

    /* renamed from: g */
    private final Path f3721g;

    /* renamed from: h */
    private Paint f3722h;

    public a() {
        this(-16777216);
    }

    public a(int i2) {
        this.f3721g = new Path();
        this.f3722h = new Paint();
        this.f3715a = new Paint();
        d(i2);
        this.f3722h.setColor(0);
        Paint paint = new Paint(4);
        this.f3716b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3717c = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f3721g;
        if (z) {
            int[] iArr = k;
            iArr[0] = 0;
            iArr[1] = this.f3720f;
            iArr[2] = this.f3719e;
            iArr[3] = this.f3718d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = k;
            iArr2[0] = 0;
            iArr2[1] = this.f3718d;
            iArr2[2] = this.f3719e;
            iArr2[3] = this.f3720f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / width);
        float[] fArr = l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.f3716b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f3722h);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f3716b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = i;
        iArr[0] = this.f3720f;
        iArr[1] = this.f3719e;
        iArr[2] = this.f3718d;
        Paint paint = this.f3717c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f3717c);
        canvas.restore();
    }

    public Paint c() {
        return this.f3715a;
    }

    public void d(int i2) {
        this.f3718d = b.g.e.a.d(i2, 68);
        this.f3719e = b.g.e.a.d(i2, 20);
        this.f3720f = b.g.e.a.d(i2, 0);
        this.f3715a.setColor(this.f3718d);
    }
}
