package h4;

import android.graphics.PointF;
import java.util.Collections;
/* loaded from: classes.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f11286i = new PointF();

    /* renamed from: j */
    private final PointF f11287j = new PointF();

    /* renamed from: k */
    private final a<Float, Float> f11288k;

    /* renamed from: l */
    private final a<Float, Float> f11289l;

    /* renamed from: m */
    protected r4.c<Float> f11290m;

    /* renamed from: n */
    protected r4.c<Float> f11291n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f11288k = aVar;
        this.f11289l = aVar2;
        m(f());
    }

    @Override // h4.a
    public void m(float f10) {
        this.f11288k.m(f10);
        this.f11289l.m(f10);
        this.f11286i.set(this.f11288k.h().floatValue(), this.f11289l.h().floatValue());
        for (int i10 = 0; i10 < this.f11248a.size(); i10++) {
            this.f11248a.get(i10).b();
        }
    }

    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* renamed from: q */
    public PointF i(r4.a<PointF> aVar, float f10) {
        Float f11;
        r4.a<Float> b10;
        r4.a<Float> b11;
        Float f12 = null;
        if (this.f11290m == null || (b11 = this.f11288k.b()) == null) {
            f11 = null;
        } else {
            float d10 = this.f11288k.d();
            Float f13 = b11.f20449h;
            r4.c<Float> cVar = this.f11290m;
            float f14 = b11.f20448g;
            f11 = cVar.b(f14, f13 == null ? f14 : f13.floatValue(), b11.f20443b, b11.f20444c, f10, f10, d10);
        }
        if (this.f11291n != null && (b10 = this.f11289l.b()) != null) {
            float d11 = this.f11289l.d();
            Float f15 = b10.f20449h;
            r4.c<Float> cVar2 = this.f11291n;
            float f16 = b10.f20448g;
            f12 = cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), b10.f20443b, b10.f20444c, f10, f10, d11);
        }
        if (f11 == null) {
            this.f11287j.set(this.f11286i.x, 0.0f);
        } else {
            this.f11287j.set(f11.floatValue(), 0.0f);
        }
        PointF pointF = this.f11287j;
        pointF.set(pointF.x, f12 == null ? this.f11286i.y : f12.floatValue());
        return this.f11287j;
    }

    public void r(r4.c<Float> cVar) {
        r4.c<Float> cVar2 = this.f11290m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f11290m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void s(r4.c<Float> cVar) {
        r4.c<Float> cVar2 = this.f11291n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f11291n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
