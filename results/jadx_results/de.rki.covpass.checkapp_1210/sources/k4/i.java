package k4;

import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a */
    private final b f14610a;

    /* renamed from: b */
    private final b f14611b;

    public i(b bVar, b bVar2) {
        this.f14610a = bVar;
        this.f14611b = bVar2;
    }

    @Override // k4.m
    public boolean m() {
        return this.f14610a.m() && this.f14611b.m();
    }

    @Override // k4.m
    public h4.a<PointF, PointF> n() {
        return new h4.n(this.f14610a.n(), this.f14611b.n());
    }

    @Override // k4.m
    public List<r4.a<PointF>> o() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
