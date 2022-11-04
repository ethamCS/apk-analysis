package t5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private final m[] f21883a = new m[4];

    /* renamed from: b */
    private final Matrix[] f21884b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f21885c = new Matrix[4];

    /* renamed from: d */
    private final PointF f21886d = new PointF();

    /* renamed from: e */
    private final Path f21887e = new Path();

    /* renamed from: f */
    private final Path f21888f = new Path();

    /* renamed from: g */
    private final m f21889g = new m();

    /* renamed from: h */
    private final float[] f21890h = new float[2];

    /* renamed from: i */
    private final float[] f21891i = new float[2];

    /* renamed from: j */
    private final Path f21892j = new Path();

    /* renamed from: k */
    private final Path f21893k = new Path();

    /* renamed from: l */
    private boolean f21894l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        static final l f21895a = new l();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final k f21896a;

        /* renamed from: b */
        public final Path f21897b;

        /* renamed from: c */
        public final RectF f21898c;

        /* renamed from: d */
        public final b f21899d;

        /* renamed from: e */
        public final float f21900e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f21899d = bVar;
            this.f21896a = kVar;
            this.f21900e = f10;
            this.f21898c = rectF;
            this.f21897b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21883a[i10] = new m();
            this.f21884b[i10] = new Matrix();
            this.f21885c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (i10 + 1) * 90;
    }

    private void b(c cVar, int i10) {
        this.f21890h[0] = this.f21883a[i10].k();
        this.f21890h[1] = this.f21883a[i10].l();
        this.f21884b[i10].mapPoints(this.f21890h);
        Path path = cVar.f21897b;
        float[] fArr = this.f21890h;
        if (i10 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f21883a[i10].d(this.f21884b[i10], cVar.f21897b);
        b bVar = cVar.f21899d;
        if (bVar != null) {
            bVar.b(this.f21883a[i10], this.f21884b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        Path path;
        Matrix matrix;
        m mVar;
        int i11 = (i10 + 1) % 4;
        this.f21890h[0] = this.f21883a[i10].i();
        this.f21890h[1] = this.f21883a[i10].j();
        this.f21884b[i10].mapPoints(this.f21890h);
        this.f21891i[0] = this.f21883a[i11].k();
        this.f21891i[1] = this.f21883a[i11].l();
        this.f21884b[i11].mapPoints(this.f21891i);
        float[] fArr = this.f21890h;
        float f10 = fArr[0];
        float[] fArr2 = this.f21891i;
        float max = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i12 = i(cVar.f21898c, i10);
        this.f21889g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f21896a);
        j10.c(max, i12, cVar.f21900e, this.f21889g);
        this.f21892j.reset();
        this.f21889g.d(this.f21885c[i10], this.f21892j);
        if (!this.f21894l || (!j10.a() && !l(this.f21892j, i10) && !l(this.f21892j, i11))) {
            mVar = this.f21889g;
            matrix = this.f21885c[i10];
            path = cVar.f21897b;
        } else {
            Path path2 = this.f21892j;
            path2.op(path2, this.f21888f, Path.Op.DIFFERENCE);
            this.f21890h[0] = this.f21889g.k();
            this.f21890h[1] = this.f21889g.l();
            this.f21885c[i10].mapPoints(this.f21890h);
            Path path3 = this.f21887e;
            float[] fArr3 = this.f21890h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f21889g;
            matrix = this.f21885c[i10];
            path = this.f21887e;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f21899d;
        if (bVar != null) {
            bVar.a(this.f21889g, this.f21885c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        float f10;
        float f11;
        if (i10 == 1) {
            f10 = rectF.right;
        } else if (i10 != 2) {
            f10 = i10 != 3 ? rectF.right : rectF.left;
            f11 = rectF.top;
            pointF.set(f10, f11);
        } else {
            f10 = rectF.left;
        }
        f11 = rectF.bottom;
        pointF.set(f10, f11);
    }

    private t5.c g(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float centerX;
        float f10;
        float[] fArr = this.f21890h;
        m[] mVarArr = this.f21883a;
        fArr[0] = mVarArr[i10].f21903c;
        fArr[1] = mVarArr[i10].f21904d;
        this.f21884b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            centerX = rectF.centerX();
            f10 = this.f21890h[0];
        } else {
            centerX = rectF.centerY();
            f10 = this.f21890h[1];
        }
        return Math.abs(centerX - f10);
    }

    private f j(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f21895a;
    }

    private boolean l(Path path, int i10) {
        this.f21893k.reset();
        this.f21883a[i10].d(this.f21884b[i10], this.f21893k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f21893k.computeBounds(rectF, true);
        path.op(this.f21893k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f21896a).b(this.f21883a[i10], 90.0f, cVar.f21900e, cVar.f21898c, g(i10, cVar.f21896a));
        float a10 = a(i10);
        this.f21884b[i10].reset();
        f(i10, cVar.f21898c, this.f21886d);
        Matrix matrix = this.f21884b[i10];
        PointF pointF = this.f21886d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f21884b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f21890h[0] = this.f21883a[i10].i();
        this.f21890h[1] = this.f21883a[i10].j();
        this.f21884b[i10].mapPoints(this.f21890h);
        float a10 = a(i10);
        this.f21885c[i10].reset();
        Matrix matrix = this.f21885c[i10];
        float[] fArr = this.f21890h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f21885c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f21887e.rewind();
        this.f21888f.rewind();
        this.f21888f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f21887e.close();
        if (!this.f21887e.isEmpty()) {
            path.op(this.f21887e, Path.Op.UNION);
        }
    }
}
