package w;

import android.util.Size;
import android.view.Surface;
/* loaded from: classes.dex */
public final class i1 extends r0 {

    /* renamed from: m */
    private final Surface f24479m;

    public i1(Surface surface) {
        this.f24479m = surface;
    }

    public i1(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f24479m = surface;
    }

    @Override // w.r0
    public x5.a<Surface> n() {
        return y.f.h(this.f24479m);
    }
}
