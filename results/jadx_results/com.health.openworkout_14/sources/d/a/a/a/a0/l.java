package d.a.a.a.a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private final m[] f3584a = new m[4];

    /* renamed from: b */
    private final Matrix[] f3585b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f3586c = new Matrix[4];

    /* renamed from: d */
    private final PointF f3587d = new PointF();

    /* renamed from: e */
    private final Path f3588e = new Path();

    /* renamed from: f */
    private final Path f3589f = new Path();

    /* renamed from: g */
    private final m f3590g = new m();

    /* renamed from: h */
    private final float[] f3591h = new float[2];
    private final float[] i = new float[2];
    private boolean j = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(m mVar, Matrix matrix, int i);

        void b(m mVar, Matrix matrix, int i);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final k f3592a;

        /* renamed from: b */
        public final Path f3593b;

        /* renamed from: c */
        public final RectF f3594c;

        /* renamed from: d */
        public final a f3595d;

        /* renamed from: e */
        public final float f3596e;

        b(k kVar, float f2, RectF rectF, a aVar, Path path) {
            this.f3595d = aVar;
            this.f3592a = kVar;
            this.f3596e = f2;
            this.f3594c = rectF;
            this.f3593b = path;
        }
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.f3584a[i] = new m();
            this.f3585b[i] = new Matrix();
            this.f3586c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private void b(b bVar, int i) {
        this.f3591h[0] = this.f3584a[i].k();
        this.f3591h[1] = this.f3584a[i].l();
        this.f3585b[i].mapPoints(this.f3591h);
        Path path = bVar.f3593b;
        float[] fArr = this.f3591h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f3584a[i].d(this.f3585b[i], bVar.f3593b);
        a aVar = bVar.f3595d;
        if (aVar != null) {
            aVar.b(this.f3584a[i], this.f3585b[i], i);
        }
    }

    private void c(b bVar, int i) {
        Path path;
        Matrix matrix;
        m mVar;
        int i2 = (i + 1) % 4;
        this.f3591h[0] = this.f3584a[i].i();
        this.f3591h[1] = this.f3584a[i].j();
        this.f3585b[i].mapPoints(this.f3591h);
        this.i[0] = this.f3584a[i2].k();
        this.i[1] = this.f3584a[i2].l();
        this.f3585b[i2].mapPoints(this.i);
        float[] fArr = this.f3591h;
        float f2 = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f2 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = i(bVar.f3594c, i);
        this.f3590g.n(0.0f, 0.0f);
        f j = j(i, bVar.f3592a);
        j.d(max, i3, bVar.f3596e, this.f3590g);
        Path path2 = new Path();
        this.f3590g.d(this.f3586c[i], path2);
        if (!this.j || Build.VERSION.SDK_INT < 19 || (!j.b() && !k(path2, i) && !k(path2, i2))) {
            mVar = this.f3590g;
            matrix = this.f3586c[i];
            path = bVar.f3593b;
        } else {
            path2.op(path2, this.f3589f, Path.Op.DIFFERENCE);
            this.f3591h[0] = this.f3590g.k();
            this.f3591h[1] = this.f3590g.l();
            this.f3586c[i].mapPoints(this.f3591h);
            Path path3 = this.f3588e;
            float[] fArr3 = this.f3591h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f3590g;
            matrix = this.f3586c[i];
            path = this.f3588e;
        }
        mVar.d(matrix, path);
        a aVar = bVar.f3595d;
        if (aVar != null) {
            aVar.a(this.f3590g, this.f3586c[i], i);
        }
    }

    private void f(int i, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        if (i == 1) {
            f2 = rectF.right;
        } else if (i != 2) {
            f2 = i != 3 ? rectF.right : rectF.left;
            f3 = rectF.top;
            pointF.set(f2, f3);
        } else {
            f2 = rectF.left;
        }
        f3 = rectF.bottom;
        pointF.set(f2, f3);
    }

    private c g(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i) {
        float centerX;
        float f2;
        float[] fArr = this.f3591h;
        m[] mVarArr = this.f3584a;
        fArr[0] = mVarArr[i].f3599c;
        fArr[1] = mVarArr[i].f3600d;
        this.f3585b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f2 = this.f3591h[0];
        } else {
            centerX = rectF.centerY();
            f2 = this.f3591h[1];
        }
        return Math.abs(centerX - f2);
    }

    private f j(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    private boolean k(Path path, int i) {
        Path path2 = new Path();
        this.f3584a[i].d(this.f3585b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void l(b bVar, int i) {
        h(i, bVar.f3592a).b(this.f3584a[i], 90.0f, bVar.f3596e, bVar.f3594c, g(i, bVar.f3592a));
        float a2 = a(i);
        this.f3585b[i].reset();
        f(i, bVar.f3594c, this.f3587d);
        Matrix matrix = this.f3585b[i];
        PointF pointF = this.f3587d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f3585b[i].preRotate(a2);
    }

    private void m(int i) {
        this.f3591h[0] = this.f3584a[i].i();
        this.f3591h[1] = this.f3584a[i].j();
        this.f3585b[i].mapPoints(this.f3591h);
        float a2 = a(i);
        this.f3586c[i].reset();
        Matrix matrix = this.f3586c[i];
        float[] fArr = this.f3591h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f3586c[i].preRotate(a2);
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, null, path);
    }

    public void e(k kVar, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        this.f3588e.rewind();
        this.f3589f.rewind();
        this.f3589f.addRect(rectF, Path.Direction.CW);
        b bVar = new b(kVar, f2, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            l(bVar, i);
            m(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(bVar, i2);
            c(bVar, i2);
        }
        path.close();
        this.f3588e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f3588e.isEmpty()) {
            return;
        }
        path.op(this.f3588e, Path.Op.UNION);
    }
}
