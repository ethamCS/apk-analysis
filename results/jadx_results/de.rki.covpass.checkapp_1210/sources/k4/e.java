package k4;

import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a */
    private final List<r4.a<PointF>> f14609a;

    public e(List<r4.a<PointF>> list) {
        this.f14609a = list;
    }

    @Override // k4.m
    public boolean m() {
        return this.f14609a.size() == 1 && this.f14609a.get(0).h();
    }

    @Override // k4.m
    public h4.a<PointF, PointF> n() {
        return this.f14609a.get(0).h() ? new h4.k(this.f14609a) : new h4.j(this.f14609a);
    }

    @Override // k4.m
    public List<r4.a<PointF>> o() {
        return this.f14609a;
    }
}
