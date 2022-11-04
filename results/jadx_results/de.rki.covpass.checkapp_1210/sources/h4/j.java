package h4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class j extends g<PointF> {

    /* renamed from: i */
    private final PointF f11277i = new PointF();

    /* renamed from: j */
    private final float[] f11278j = new float[2];

    /* renamed from: k */
    private final PathMeasure f11279k = new PathMeasure();

    /* renamed from: l */
    private i f11280l;

    public j(List<? extends r4.a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF i(r4.a<PointF> aVar, float f10) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j10 = iVar.j();
        if (j10 == null) {
            return aVar.f20443b;
        }
        r4.c<A> cVar = this.f11252e;
        if (cVar != 0 && (pointF = (PointF) cVar.b(iVar.f20448g, iVar.f20449h.floatValue(), (PointF) iVar.f20443b, (PointF) iVar.f20444c, e(), f10, f())) != null) {
            return pointF;
        }
        if (this.f11280l != iVar) {
            this.f11279k.setPath(j10, false);
            this.f11280l = iVar;
        }
        PathMeasure pathMeasure = this.f11279k;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f11278j, null);
        PointF pointF2 = this.f11277i;
        float[] fArr = this.f11278j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f11277i;
    }
}
