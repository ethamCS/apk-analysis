package g4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import h4.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a */
    private final Path f10421a;

    /* renamed from: c */
    private final m4.b f10423c;

    /* renamed from: d */
    private final String f10424d;

    /* renamed from: e */
    private final boolean f10425e;

    /* renamed from: g */
    private final h4.a<Integer, Integer> f10427g;

    /* renamed from: h */
    private final h4.a<Integer, Integer> f10428h;

    /* renamed from: i */
    private h4.a<ColorFilter, ColorFilter> f10429i;

    /* renamed from: j */
    private final com.airbnb.lottie.n f10430j;

    /* renamed from: k */
    private h4.a<Float, Float> f10431k;

    /* renamed from: l */
    float f10432l;

    /* renamed from: m */
    private h4.c f10433m;

    /* renamed from: b */
    private final Paint f10422b = new f4.a(1);

    /* renamed from: f */
    private final List<m> f10426f = new ArrayList();

    public g(com.airbnb.lottie.n nVar, m4.b bVar, l4.o oVar) {
        Path path = new Path();
        this.f10421a = path;
        this.f10423c = bVar;
        this.f10424d = oVar.d();
        this.f10425e = oVar.f();
        this.f10430j = nVar;
        if (bVar.w() != null) {
            h4.a<Float, Float> n10 = bVar.w().a().n();
            this.f10431k = n10;
            n10.a(this);
            bVar.i(this.f10431k);
        }
        if (bVar.y() != null) {
            this.f10433m = new h4.c(this, bVar, bVar.y());
        }
        if (oVar.b() == null || oVar.e() == null) {
            this.f10427g = null;
            this.f10428h = null;
            return;
        }
        path.setFillType(oVar.c());
        h4.a<Integer, Integer> n11 = oVar.b().n();
        this.f10427g = n11;
        n11.a(this);
        bVar.i(n11);
        h4.a<Integer, Integer> n12 = oVar.e().n();
        this.f10428h = n12;
        n12.a(this);
        bVar.i(n12);
    }

    @Override // g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f10421a.reset();
        for (int i10 = 0; i10 < this.f10426f.size(); i10++) {
            this.f10421a.addPath(this.f10426f.get(i10).l(), matrix);
        }
        this.f10421a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // h4.a.b
    public void b() {
        this.f10430j.invalidateSelf();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f10426f.add((m) cVar);
            }
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
        if (t10 == e4.u.f9434a) {
            aVar2 = this.f10427g;
        } else if (t10 != e4.u.f9437d) {
            if (t10 == e4.u.K) {
                h4.a<ColorFilter, ColorFilter> aVar3 = this.f10429i;
                if (aVar3 != null) {
                    this.f10423c.H(aVar3);
                }
                if (cVar == null) {
                    this.f10429i = null;
                    return;
                }
                h4.q qVar = new h4.q(cVar);
                this.f10429i = qVar;
                qVar.a(this);
                bVar = this.f10423c;
                aVar = this.f10429i;
            } else if (t10 != e4.u.f9443j) {
                if (t10 == e4.u.f9438e && (cVar6 = this.f10433m) != null) {
                    cVar6.c(cVar);
                    return;
                } else if (t10 == e4.u.G && (cVar5 = this.f10433m) != null) {
                    cVar5.f(cVar);
                    return;
                } else if (t10 == e4.u.H && (cVar4 = this.f10433m) != null) {
                    cVar4.d(cVar);
                    return;
                } else if (t10 == e4.u.I && (cVar3 = this.f10433m) != null) {
                    cVar3.e(cVar);
                    return;
                } else if (t10 != e4.u.J || (cVar2 = this.f10433m) == null) {
                    return;
                } else {
                    cVar2.g(cVar);
                    return;
                }
            } else {
                aVar2 = this.f10431k;
                if (aVar2 == null) {
                    h4.q qVar2 = new h4.q(cVar);
                    this.f10431k = qVar2;
                    qVar2.a(this);
                    bVar = this.f10423c;
                    aVar = this.f10431k;
                }
            }
            bVar.i(aVar);
            return;
        } else {
            aVar2 = this.f10428h;
        }
        aVar2.n(cVar);
    }

    @Override // g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10425e) {
            return;
        }
        e4.c.a("FillContent#draw");
        this.f10422b.setColor((q4.g.c((int) ((((i10 / 255.0f) * this.f10428h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((h4.b) this.f10427g).p() & 16777215));
        h4.a<ColorFilter, ColorFilter> aVar = this.f10429i;
        if (aVar != null) {
            this.f10422b.setColorFilter(aVar.h());
        }
        h4.a<Float, Float> aVar2 = this.f10431k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f10422b.setMaskFilter(null);
            } else if (floatValue != this.f10432l) {
                this.f10422b.setMaskFilter(this.f10423c.x(floatValue));
            }
            this.f10432l = floatValue;
        }
        h4.c cVar = this.f10433m;
        if (cVar != null) {
            cVar.a(this.f10422b);
        }
        this.f10421a.reset();
        for (int i11 = 0; i11 < this.f10426f.size(); i11++) {
            this.f10421a.addPath(this.f10426f.get(i11).l(), matrix);
        }
        canvas.drawPath(this.f10421a, this.f10422b);
        e4.c.b("FillContent#draw");
    }

    @Override // g4.c
    public String getName() {
        return this.f10424d;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }
}
