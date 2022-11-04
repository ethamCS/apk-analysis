package h4;

import android.graphics.Path;
import android.graphics.PointF;
/* loaded from: classes.dex */
public class i extends r4.a<PointF> {

    /* renamed from: q */
    private Path f11275q;

    /* renamed from: r */
    private final r4.a<PointF> f11276r;

    public i(e4.h hVar, r4.a<PointF> aVar) {
        super(hVar, aVar.f20443b, aVar.f20444c, aVar.f20445d, aVar.f20446e, aVar.f20447f, aVar.f20448g, aVar.f20449h);
        this.f11276r = aVar;
        i();
    }

    public void i() {
        T t10;
        T t11;
        T t12 = this.f20444c;
        boolean z10 = (t12 == 0 || (t11 = this.f20443b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f20443b;
        if (t13 == 0 || (t10 = this.f20444c) == 0 || z10) {
            return;
        }
        r4.a<PointF> aVar = this.f11276r;
        this.f11275q = q4.h.d((PointF) t13, (PointF) t10, aVar.f20456o, aVar.f20457p);
    }

    public Path j() {
        return this.f11275q;
    }
}
