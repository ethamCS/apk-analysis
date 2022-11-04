package b.a.a.a.b0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private final m[] f1188a = new m[4];

    /* renamed from: b */
    private final Matrix[] f1189b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f1190c = new Matrix[4];
    private final PointF d = new PointF();
    private final m e = new m();
    private final float[] f = new float[2];
    private final float[] g = new float[2];

    /* loaded from: classes.dex */
    public interface a {
        void a(m mVar, Matrix matrix, int i);

        void b(m mVar, Matrix matrix, int i);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final k f1191a;

        /* renamed from: b */
        public final Path f1192b;

        /* renamed from: c */
        public final RectF f1193c;
        public final a d;
        public final float e;

        b(k kVar, float f, RectF rectF, a aVar, Path path) {
            this.d = aVar;
            this.f1191a = kVar;
            this.e = f;
            this.f1193c = rectF;
            this.f1192b = path;
        }
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.f1188a[i] = new m();
            this.f1189b[i] = new Matrix();
            this.f1190c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private float a(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f;
        m[] mVarArr = this.f1188a;
        fArr[0] = mVarArr[i].f1196c;
        fArr[1] = mVarArr[i].d;
        this.f1189b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f[0];
        } else {
            centerX = rectF.centerY();
            f = this.f[1];
        }
        return Math.abs(centerX - f);
    }

    private c a(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.l() : kVar.j() : kVar.c() : kVar.e();
    }

    private void a(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        if (i == 1) {
            f = rectF.right;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
            pointF.set(f, f2);
        } else {
            f = rectF.left;
        }
        f2 = rectF.bottom;
        pointF.set(f, f2);
    }

    private void a(b bVar, int i) {
        this.f[0] = this.f1188a[i].c();
        this.f[1] = this.f1188a[i].d();
        this.f1189b[i].mapPoints(this.f);
        Path path = bVar.f1192b;
        float[] fArr = this.f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f1188a[i].a(this.f1189b[i], bVar.f1192b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.a(this.f1188a[i], this.f1189b[i], i);
        }
    }

    private d b(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.k() : kVar.i() : kVar.b() : kVar.d();
    }

    private void b(int i) {
        this.f[0] = this.f1188a[i].a();
        this.f[1] = this.f1188a[i].b();
        this.f1189b[i].mapPoints(this.f);
        float a2 = a(i);
        this.f1190c[i].reset();
        Matrix matrix = this.f1190c[i];
        float[] fArr = this.f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f1190c[i].preRotate(a2);
    }

    private void b(b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f[0] = this.f1188a[i].a();
        this.f[1] = this.f1188a[i].b();
        this.f1189b[i].mapPoints(this.f);
        this.g[0] = this.f1188a[i2].c();
        this.g[1] = this.f1188a[i2].d();
        this.f1189b[i2].mapPoints(this.g);
        float[] fArr = this.f;
        float f = fArr[0];
        float[] fArr2 = this.g;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float a2 = a(bVar.f1193c, i);
        this.e.b(0.0f, 0.0f);
        c(i, bVar.f1191a).a(max, a2, bVar.e, this.e);
        this.e.a(this.f1190c[i], bVar.f1192b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.b(this.e, this.f1190c[i], i);
        }
    }

    private f c(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.g() : kVar.h() : kVar.f() : kVar.a();
    }

    private void c(b bVar, int i) {
        b(i, bVar.f1191a).a(this.f1188a[i], 90.0f, bVar.e, bVar.f1193c, a(i, bVar.f1191a));
        float a2 = a(i);
        this.f1189b[i].reset();
        a(i, bVar.f1193c, this.d);
        Matrix matrix = this.f1189b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f1189b[i].preRotate(a2);
    }

    public void a(k kVar, float f, RectF rectF, Path path) {
        a(kVar, f, rectF, null, path);
    }

    public void a(k kVar, float f, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            c(bVar, i);
            b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            a(bVar, i2);
            b(bVar, i2);
        }
        path.close();
    }
}
