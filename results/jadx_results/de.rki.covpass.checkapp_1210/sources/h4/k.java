package h4;

import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class k extends g<PointF> {

    /* renamed from: i */
    private final PointF f11281i = new PointF();

    public k(List<r4.a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF i(r4.a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* renamed from: q */
    public PointF j(r4.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f20443b;
        if (pointF3 == null || (pointF = aVar.f20444c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        r4.c<A> cVar = this.f11252e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.b(aVar.f20448g, aVar.f20449h.floatValue(), pointF4, pointF5, f10, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f11281i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f11281i;
    }
}
