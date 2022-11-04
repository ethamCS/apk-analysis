package g4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import h4.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a */
    private final String f10434a;

    /* renamed from: b */
    private final boolean f10435b;

    /* renamed from: c */
    private final m4.b f10436c;

    /* renamed from: f */
    private final Path f10439f;

    /* renamed from: j */
    private final l4.g f10443j;

    /* renamed from: k */
    private final h4.a<l4.d, l4.d> f10444k;

    /* renamed from: l */
    private final h4.a<Integer, Integer> f10445l;

    /* renamed from: m */
    private final h4.a<PointF, PointF> f10446m;

    /* renamed from: n */
    private final h4.a<PointF, PointF> f10447n;

    /* renamed from: o */
    private h4.a<ColorFilter, ColorFilter> f10448o;

    /* renamed from: p */
    private h4.q f10449p;

    /* renamed from: q */
    private final com.airbnb.lottie.n f10450q;

    /* renamed from: r */
    private final int f10451r;

    /* renamed from: s */
    private h4.a<Float, Float> f10452s;

    /* renamed from: u */
    private h4.c f10454u;

    /* renamed from: d */
    private final i0.d<LinearGradient> f10437d = new i0.d<>();

    /* renamed from: e */
    private final i0.d<RadialGradient> f10438e = new i0.d<>();

    /* renamed from: g */
    private final Paint f10440g = new f4.a(1);

    /* renamed from: h */
    private final RectF f10441h = new RectF();

    /* renamed from: i */
    private final List<m> f10442i = new ArrayList();

    /* renamed from: t */
    float f10453t = 0.0f;

    public h(com.airbnb.lottie.n nVar, m4.b bVar, l4.e eVar) {
        Path path = new Path();
        this.f10439f = path;
        this.f10436c = bVar;
        this.f10434a = eVar.f();
        this.f10435b = eVar.i();
        this.f10450q = nVar;
        this.f10443j = eVar.e();
        path.setFillType(eVar.c());
        this.f10451r = (int) (nVar.E().d() / 32.0f);
        h4.a<l4.d, l4.d> n10 = eVar.d().n();
        this.f10444k = n10;
        n10.a(this);
        bVar.i(n10);
        h4.a<Integer, Integer> n11 = eVar.g().n();
        this.f10445l = n11;
        n11.a(this);
        bVar.i(n11);
        h4.a<PointF, PointF> n12 = eVar.h().n();
        this.f10446m = n12;
        n12.a(this);
        bVar.i(n12);
        h4.a<PointF, PointF> n13 = eVar.b().n();
        this.f10447n = n13;
        n13.a(this);
        bVar.i(n13);
        if (bVar.w() != null) {
            h4.a<Float, Float> n14 = bVar.w().a().n();
            this.f10452s = n14;
            n14.a(this);
            bVar.i(this.f10452s);
        }
        if (bVar.y() != null) {
            this.f10454u = new h4.c(this, bVar, bVar.y());
        }
    }

    private int[] d(int[] iArr) {
        h4.q qVar = this.f10449p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.f10446m.f() * this.f10451r);
        int round2 = Math.round(this.f10447n.f() * this.f10451r);
        int round3 = Math.round(this.f10444k.f() * this.f10451r);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient j() {
        long i10 = i();
        LinearGradient g10 = this.f10437d.g(i10);
        if (g10 != null) {
            return g10;
        }
        PointF h10 = this.f10446m.h();
        PointF h11 = this.f10447n.h();
        l4.d h12 = this.f10444k.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, d(h12.a()), h12.b(), Shader.TileMode.CLAMP);
        this.f10437d.l(i10, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i10 = i();
        RadialGradient g10 = this.f10438e.g(i10);
        if (g10 != null) {
            return g10;
        }
        PointF h10 = this.f10446m.h();
        PointF h11 = this.f10447n.h();
        l4.d h12 = this.f10444k.h();
        int[] d10 = d(h12.a());
        float[] b10 = h12.b();
        float f10 = h10.x;
        float f11 = h10.y;
        float hypot = (float) Math.hypot(h11.x - f10, h11.y - f11);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, hypot, d10, b10, Shader.TileMode.CLAMP);
        this.f10438e.l(i10, radialGradient);
        return radialGradient;
    }

    @Override // g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f10439f.reset();
        for (int i10 = 0; i10 < this.f10442i.size(); i10++) {
            this.f10439f.addPath(this.f10442i.get(i10).l(), matrix);
        }
        this.f10439f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // h4.a.b
    public void b() {
        this.f10450q.invalidateSelf();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f10442i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.c cVar2;
        h4.c cVar3;
        h4.c cVar4;
        h4.c cVar5;
        h4.c cVar6;
        h4.a aVar;
        m4.b bVar;
        h4.a<?, ?> aVar2;
        if (t10 != e4.u.f9437d) {
            if (t10 == e4.u.K) {
                h4.a<ColorFilter, ColorFilter> aVar3 = this.f10448o;
                if (aVar3 != null) {
                    this.f10436c.H(aVar3);
                }
                if (cVar == null) {
                    this.f10448o = null;
                    return;
                }
                h4.q qVar = new h4.q(cVar);
                this.f10448o = qVar;
                qVar.a(this);
                bVar = this.f10436c;
                aVar2 = this.f10448o;
            } else if (t10 == e4.u.L) {
                h4.q qVar2 = this.f10449p;
                if (qVar2 != null) {
                    this.f10436c.H(qVar2);
                }
                if (cVar == null) {
                    this.f10449p = null;
                    return;
                }
                this.f10437d.c();
                this.f10438e.c();
                h4.q qVar3 = new h4.q(cVar);
                this.f10449p = qVar3;
                qVar3.a(this);
                bVar = this.f10436c;
                aVar2 = this.f10449p;
            } else if (t10 != e4.u.f9443j) {
                if (t10 == e4.u.f9438e && (cVar6 = this.f10454u) != null) {
                    cVar6.c(cVar);
                    return;
                } else if (t10 == e4.u.G && (cVar5 = this.f10454u) != null) {
                    cVar5.f(cVar);
                    return;
                } else if (t10 == e4.u.H && (cVar4 = this.f10454u) != null) {
                    cVar4.d(cVar);
                    return;
                } else if (t10 == e4.u.I && (cVar3 = this.f10454u) != null) {
                    cVar3.e(cVar);
                    return;
                } else if (t10 != e4.u.J || (cVar2 = this.f10454u) == null) {
                    return;
                } else {
                    cVar2.g(cVar);
                    return;
                }
            } else {
                aVar = this.f10452s;
                if (aVar == null) {
                    h4.q qVar4 = new h4.q(cVar);
                    this.f10452s = qVar4;
                    qVar4.a(this);
                    bVar = this.f10436c;
                    aVar2 = this.f10452s;
                }
            }
            bVar.i(aVar2);
            return;
        }
        aVar = this.f10445l;
        aVar.n(cVar);
    }

    @Override // g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10435b) {
            return;
        }
        e4.c.a("GradientFillContent#draw");
        this.f10439f.reset();
        for (int i11 = 0; i11 < this.f10442i.size(); i11++) {
            this.f10439f.addPath(this.f10442i.get(i11).l(), matrix);
        }
        this.f10439f.computeBounds(this.f10441h, false);
        Shader j10 = this.f10443j == l4.g.LINEAR ? j() : k();
        j10.setLocalMatrix(matrix);
        this.f10440g.setShader(j10);
        h4.a<ColorFilter, ColorFilter> aVar = this.f10448o;
        if (aVar != null) {
            this.f10440g.setColorFilter(aVar.h());
        }
        h4.a<Float, Float> aVar2 = this.f10452s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f10440g.setMaskFilter(null);
            } else if (floatValue != this.f10453t) {
                this.f10440g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f10453t = floatValue;
        }
        h4.c cVar = this.f10454u;
        if (cVar != null) {
            cVar.a(this.f10440g);
        }
        this.f10440g.setAlpha(q4.g.c((int) ((((i10 / 255.0f) * this.f10445l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f10439f, this.f10440g);
        e4.c.b("GradientFillContent#draw");
    }

    @Override // g4.c
    public String getName() {
        return this.f10434a;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }
}
