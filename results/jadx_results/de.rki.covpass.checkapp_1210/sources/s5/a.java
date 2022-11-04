package s5;

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

    /* renamed from: i */
    private static final int[] f21461i = new int[3];

    /* renamed from: j */
    private static final float[] f21462j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f21463k = new int[4];

    /* renamed from: l */
    private static final float[] f21464l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f21465a;

    /* renamed from: b */
    private final Paint f21466b;

    /* renamed from: c */
    private final Paint f21467c;

    /* renamed from: d */
    private int f21468d;

    /* renamed from: e */
    private int f21469e;

    /* renamed from: f */
    private int f21470f;

    /* renamed from: g */
    private final Path f21471g;

    /* renamed from: h */
    private Paint f21472h;

    public a() {
        this(-16777216);
    }

    public a(int i10) {
        this.f21471g = new Path();
        this.f21472h = new Paint();
        this.f21465a = new Paint();
        d(i10);
        this.f21472h.setColor(0);
        Paint paint = new Paint(4);
        this.f21466b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21467c = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f21471g;
        if (z10) {
            int[] iArr = f21463k;
            iArr[0] = 0;
            iArr[1] = this.f21470f;
            iArr[2] = this.f21469e;
            iArr[3] = this.f21468d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f21463k;
            iArr2[0] = 0;
            iArr2[1] = this.f21468d;
            iArr2[2] = this.f21469e;
            iArr2[3] = this.f21470f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f21464l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f21466b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f21463k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f21472h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f21466b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f21461i;
        iArr[0] = this.f21470f;
        iArr[1] = this.f21469e;
        iArr[2] = this.f21468d;
        Paint paint = this.f21467c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f21462j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f21467c);
        canvas.restore();
    }

    public Paint c() {
        return this.f21465a;
    }

    public void d(int i10) {
        this.f21468d = androidx.core.graphics.a.j(i10, 68);
        this.f21469e = androidx.core.graphics.a.j(i10, 20);
        this.f21470f = androidx.core.graphics.a.j(i10, 0);
        this.f21465a.setColor(this.f21468d);
    }
}
