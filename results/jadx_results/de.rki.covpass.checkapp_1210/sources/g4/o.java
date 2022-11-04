package g4;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h4.a;
import java.util.List;
import l4.s;
/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c */
    private final String f10489c;

    /* renamed from: d */
    private final boolean f10490d;

    /* renamed from: e */
    private final com.airbnb.lottie.n f10491e;

    /* renamed from: f */
    private final h4.a<?, PointF> f10492f;

    /* renamed from: g */
    private final h4.a<?, PointF> f10493g;

    /* renamed from: h */
    private final h4.a<?, Float> f10494h;

    /* renamed from: k */
    private boolean f10497k;

    /* renamed from: a */
    private final Path f10487a = new Path();

    /* renamed from: b */
    private final RectF f10488b = new RectF();

    /* renamed from: i */
    private final b f10495i = new b();

    /* renamed from: j */
    private h4.a<Float, Float> f10496j = null;

    public o(com.airbnb.lottie.n nVar, m4.b bVar, l4.k kVar) {
        this.f10489c = kVar.c();
        this.f10490d = kVar.f();
        this.f10491e = nVar;
        h4.a<PointF, PointF> n10 = kVar.d().n();
        this.f10492f = n10;
        h4.a<PointF, PointF> n11 = kVar.e().n();
        this.f10493g = n11;
        h4.a<Float, Float> n12 = kVar.b().n();
        this.f10494h = n12;
        bVar.i(n10);
        bVar.i(n11);
        bVar.i(n12);
        n10.a(this);
        n11.a(this);
        n12.a(this);
    }

    private void d() {
        this.f10497k = false;
        this.f10491e.invalidateSelf();
    }

    @Override // h4.a.b
    public void b() {
        d();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f10495i.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof q) {
                this.f10496j = ((q) cVar).h();
            }
        }
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.a aVar;
        if (t10 == e4.u.f9445l) {
            aVar = this.f10493g;
        } else if (t10 == e4.u.f9447n) {
            aVar = this.f10492f;
        } else if (t10 != e4.u.f9446m) {
            return;
        } else {
            aVar = this.f10494h;
        }
        aVar.n(cVar);
    }

    @Override // g4.c
    public String getName() {
        return this.f10489c;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // g4.m
    public Path l() {
        h4.a<Float, Float> aVar;
        if (this.f10497k) {
            return this.f10487a;
        }
        this.f10487a.reset();
        if (!this.f10490d) {
            PointF h10 = this.f10493g.h();
            float f10 = h10.x / 2.0f;
            float f11 = h10.y / 2.0f;
            h4.a<?, Float> aVar2 = this.f10494h;
            float p10 = aVar2 == null ? 0.0f : ((h4.d) aVar2).p();
            if (p10 == 0.0f && (aVar = this.f10496j) != null) {
                p10 = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
            }
            float min = Math.min(f10, f11);
            if (p10 > min) {
                p10 = min;
            }
            PointF h11 = this.f10492f.h();
            this.f10487a.moveTo(h11.x + f10, (h11.y - f11) + p10);
            this.f10487a.lineTo(h11.x + f10, (h11.y + f11) - p10);
            int i10 = (p10 > 0.0f ? 1 : (p10 == 0.0f ? 0 : -1));
            if (i10 > 0) {
                RectF rectF = this.f10488b;
                float f12 = h11.x;
                float f13 = p10 * 2.0f;
                float f14 = h11.y;
                rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
                this.f10487a.arcTo(this.f10488b, 0.0f, 90.0f, false);
            }
            this.f10487a.lineTo((h11.x - f10) + p10, h11.y + f11);
            if (i10 > 0) {
                RectF rectF2 = this.f10488b;
                float f15 = h11.x;
                float f16 = h11.y;
                float f17 = p10 * 2.0f;
                rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
                this.f10487a.arcTo(this.f10488b, 90.0f, 90.0f, false);
            }
            this.f10487a.lineTo(h11.x - f10, (h11.y - f11) + p10);
            if (i10 > 0) {
                RectF rectF3 = this.f10488b;
                float f18 = h11.x;
                float f19 = h11.y;
                float f20 = p10 * 2.0f;
                rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
                this.f10487a.arcTo(this.f10488b, 180.0f, 90.0f, false);
            }
            this.f10487a.lineTo((h11.x + f10) - p10, h11.y - f11);
            if (i10 > 0) {
                RectF rectF4 = this.f10488b;
                float f21 = h11.x;
                float f22 = p10 * 2.0f;
                float f23 = h11.y;
                rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
                this.f10487a.arcTo(this.f10488b, 270.0f, 90.0f, false);
            }
            this.f10487a.close();
            this.f10495i.b(this.f10487a);
        }
        this.f10497k = true;
        return this.f10487a;
    }
}
