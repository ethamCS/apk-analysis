package u;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import q.a;
import w.y1;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final Range<Integer> f22463a;

    public a(y1 y1Var) {
        t.a aVar = (t.a) y1Var.b(t.a.class);
        this.f22463a = aVar == null ? null : aVar.b();
    }

    public void a(a.C0313a c0313a) {
        Range<Integer> range = this.f22463a;
        if (range != null) {
            c0313a.e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
