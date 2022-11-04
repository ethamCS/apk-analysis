package g4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import h4.a;
import java.util.ArrayList;
import java.util.List;
import l4.s;
/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e */
    private final com.airbnb.lottie.n f10386e;

    /* renamed from: f */
    protected final m4.b f10387f;

    /* renamed from: h */
    private final float[] f10389h;

    /* renamed from: i */
    final Paint f10390i;

    /* renamed from: j */
    private final h4.a<?, Float> f10391j;

    /* renamed from: k */
    private final h4.a<?, Integer> f10392k;

    /* renamed from: l */
    private final List<h4.a<?, Float>> f10393l;

    /* renamed from: m */
    private final h4.a<?, Float> f10394m;

    /* renamed from: n */
    private h4.a<ColorFilter, ColorFilter> f10395n;

    /* renamed from: o */
    private h4.a<Float, Float> f10396o;

    /* renamed from: q */
    private h4.c f10398q;

    /* renamed from: a */
    private final PathMeasure f10382a = new PathMeasure();

    /* renamed from: b */
    private final Path f10383b = new Path();

    /* renamed from: c */
    private final Path f10384c = new Path();

    /* renamed from: d */
    private final RectF f10385d = new RectF();

    /* renamed from: g */
    private final List<b> f10388g = new ArrayList();

    /* renamed from: p */
    float f10397p = 0.0f;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<m> f10399a;

        /* renamed from: b */
        private final u f10400b;

        private b(u uVar) {
            this.f10399a = new ArrayList();
            this.f10400b = uVar;
        }
    }

    public a(com.airbnb.lottie.n nVar, m4.b bVar, Paint.Cap cap, Paint.Join join, float f10, k4.d dVar, k4.b bVar2, List<k4.b> list, k4.b bVar3) {
        f4.a aVar = new f4.a(1);
        this.f10390i = aVar;
        this.f10386e = nVar;
        this.f10387f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f10392k = dVar.n();
        this.f10391j = bVar2.n();
        this.f10394m = bVar3 == null ? null : bVar3.n();
        this.f10393l = new ArrayList(list.size());
        this.f10389h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f10393l.add(list.get(i10).n());
        }
        bVar.i(this.f10392k);
        bVar.i(this.f10391j);
        for (int i11 = 0; i11 < this.f10393l.size(); i11++) {
            bVar.i(this.f10393l.get(i11));
        }
        h4.a<?, Float> aVar2 = this.f10394m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f10392k.a(this);
        this.f10391j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f10393l.get(i12).a(this);
        }
        h4.a<?, Float> aVar3 = this.f10394m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.w() != null) {
            h4.a<Float, Float> n10 = bVar.w().a().n();
            this.f10396o = n10;
            n10.a(this);
            bVar.i(this.f10396o);
        }
        if (bVar.y() != null) {
            this.f10398q = new h4.c(this, bVar, bVar.y());
        }
    }

    private void d(Matrix matrix) {
        e4.c.a("StrokeContent#applyDashPattern");
        if (this.f10393l.isEmpty()) {
            e4.c.b("StrokeContent#applyDashPattern");
            return;
        }
        float g10 = q4.h.g(matrix);
        for (int i10 = 0; i10 < this.f10393l.size(); i10++) {
            this.f10389h[i10] = this.f10393l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f10389h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f10389h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f10389h;
            fArr3[i10] = fArr3[i10] * g10;
        }
        h4.a<?, Float> aVar = this.f10394m;
        this.f10390i.setPathEffect(new DashPathEffect(this.f10389h, aVar == null ? 0.0f : g10 * aVar.h().floatValue()));
        e4.c.b("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        float f10;
        float f11;
        e4.c.a("StrokeContent#applyTrimPath");
        if (bVar.f10400b == null) {
            e4.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f10383b.reset();
        for (int size = bVar.f10399a.size() - 1; size >= 0; size--) {
            this.f10383b.addPath(((m) bVar.f10399a.get(size)).l(), matrix);
        }
        float floatValue = bVar.f10400b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f10400b.e().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f10400b.h().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f10383b, this.f10390i);
            e4.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f10382a.setPath(this.f10383b, false);
        float length = this.f10382a.getLength();
        while (this.f10382a.nextContour()) {
            length += this.f10382a.getLength();
        }
        float f12 = floatValue3 * length;
        float f13 = (floatValue * length) + f12;
        float min = Math.min((floatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = bVar.f10399a.size() - 1; size2 >= 0; size2--) {
            this.f10384c.set(((m) bVar.f10399a.get(size2)).l());
            this.f10384c.transform(matrix);
            this.f10382a.setPath(this.f10384c, false);
            float length2 = this.f10382a.getLength();
            if (min > length) {
                float f15 = min - length;
                if (f15 < f14 + length2 && f14 < f15) {
                    f10 = f13 > length ? (f13 - length) / length2 : 0.0f;
                    f11 = Math.min(f15 / length2, 1.0f);
                    q4.h.a(this.f10384c, f10, f11, 0.0f);
                    canvas.drawPath(this.f10384c, this.f10390i);
                    f14 += length2;
                }
            }
            float f16 = f14 + length2;
            if (f16 >= f13 && f14 <= min) {
                if (f16 > min || f13 >= f14) {
                    f10 = f13 < f14 ? 0.0f : (f13 - f14) / length2;
                    f11 = min > f16 ? 1.0f : (min - f14) / length2;
                    q4.h.a(this.f10384c, f10, f11, 0.0f);
                }
                canvas.drawPath(this.f10384c, this.f10390i);
            }
            f14 += length2;
        }
        e4.c.b("StrokeContent#applyTrimPath");
    }

    @Override // g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        e4.c.a("StrokeContent#getBounds");
        this.f10383b.reset();
        for (int i10 = 0; i10 < this.f10388g.size(); i10++) {
            b bVar = this.f10388g.get(i10);
            for (int i11 = 0; i11 < bVar.f10399a.size(); i11++) {
                this.f10383b.addPath(((m) bVar.f10399a.get(i11)).l(), matrix);
            }
        }
        this.f10383b.computeBounds(this.f10385d, false);
        float p10 = ((h4.d) this.f10391j).p();
        RectF rectF2 = this.f10385d;
        float f10 = p10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f10385d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        e4.c.b("StrokeContent#getBounds");
    }

    @Override // h4.a.b
    public void b() {
        this.f10386e.invalidateSelf();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == s.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == s.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f10388g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.d(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f10399a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f10388g.add(bVar);
        }
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.a<?, ?> aVar;
        m4.b bVar;
        h4.c cVar2;
        h4.c cVar3;
        h4.c cVar4;
        h4.c cVar5;
        h4.c cVar6;
        h4.a aVar2;
        if (t10 == e4.u.f9437d) {
            aVar2 = this.f10392k;
        } else if (t10 != e4.u.f9452s) {
            if (t10 == e4.u.K) {
                h4.a<ColorFilter, ColorFilter> aVar3 = this.f10395n;
                if (aVar3 != null) {
                    this.f10387f.H(aVar3);
                }
                if (cVar == null) {
                    this.f10395n = null;
                    return;
                }
                h4.q qVar = new h4.q(cVar);
                this.f10395n = qVar;
                qVar.a(this);
                bVar = this.f10387f;
                aVar = this.f10395n;
            } else if (t10 != e4.u.f9443j) {
                if (t10 == e4.u.f9438e && (cVar6 = this.f10398q) != null) {
                    cVar6.c(cVar);
                    return;
                } else if (t10 == e4.u.G && (cVar5 = this.f10398q) != null) {
                    cVar5.f(cVar);
                    return;
                } else if (t10 == e4.u.H && (cVar4 = this.f10398q) != null) {
                    cVar4.d(cVar);
                    return;
                } else if (t10 == e4.u.I && (cVar3 = this.f10398q) != null) {
                    cVar3.e(cVar);
                    return;
                } else if (t10 != e4.u.J || (cVar2 = this.f10398q) == null) {
                    return;
                } else {
                    cVar2.g(cVar);
                    return;
                }
            } else {
                aVar2 = this.f10396o;
                if (aVar2 == null) {
                    h4.q qVar2 = new h4.q(cVar);
                    this.f10396o = qVar2;
                    qVar2.a(this);
                    bVar = this.f10387f;
                    aVar = this.f10396o;
                }
            }
            bVar.i(aVar);
            return;
        } else {
            aVar2 = this.f10391j;
        }
        aVar2.n(cVar);
    }

    @Override // g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        e4.c.a("StrokeContent#draw");
        if (q4.h.h(matrix)) {
            e4.c.b("StrokeContent#draw");
            return;
        }
        this.f10390i.setAlpha(q4.g.c((int) ((((i10 / 255.0f) * ((h4.f) this.f10392k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f10390i.setStrokeWidth(((h4.d) this.f10391j).p() * q4.h.g(matrix));
        if (this.f10390i.getStrokeWidth() <= 0.0f) {
            e4.c.b("StrokeContent#draw");
            return;
        }
        d(matrix);
        h4.a<ColorFilter, ColorFilter> aVar = this.f10395n;
        if (aVar != null) {
            this.f10390i.setColorFilter(aVar.h());
        }
        h4.a<Float, Float> aVar2 = this.f10396o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f10390i.setMaskFilter(null);
            } else if (floatValue != this.f10397p) {
                this.f10390i.setMaskFilter(this.f10387f.x(floatValue));
            }
            this.f10397p = floatValue;
        }
        h4.c cVar = this.f10398q;
        if (cVar != null) {
            cVar.a(this.f10390i);
        }
        for (int i11 = 0; i11 < this.f10388g.size(); i11++) {
            b bVar = this.f10388g.get(i11);
            if (bVar.f10400b != null) {
                i(canvas, bVar, matrix);
            } else {
                e4.c.a("StrokeContent#buildPath");
                this.f10383b.reset();
                for (int size = bVar.f10399a.size() - 1; size >= 0; size--) {
                    this.f10383b.addPath(((m) bVar.f10399a.get(size)).l(), matrix);
                }
                e4.c.b("StrokeContent#buildPath");
                e4.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f10383b, this.f10390i);
                e4.c.b("StrokeContent#drawPath");
            }
        }
        e4.c.b("StrokeContent#draw");
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }
}
