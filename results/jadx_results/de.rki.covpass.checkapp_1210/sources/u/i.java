package u;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import q.a;
/* loaded from: classes.dex */
public class i {
    @SuppressLint({"NewApi"})
    public void a(int i10, a.C0313a c0313a) {
        CaptureRequest.Key key;
        Boolean bool;
        if (((t.s) t.l.a(t.s.class)) == null) {
            return;
        }
        if (i10 == 0) {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            bool = Boolean.TRUE;
        } else if (i10 != 1) {
            return;
        } else {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            bool = Boolean.FALSE;
        }
        c0313a.e(key, bool);
    }
}
