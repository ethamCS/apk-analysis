package r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import r.g;
import r.i0;
/* loaded from: classes.dex */
public class g0 extends f0 {
    public g0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static g0 g(CameraDevice cameraDevice, Handler handler) {
        return new g0(cameraDevice, new i0.a(handler));
    }

    @Override // r.f0, r.a0.a
    public void a(s.g gVar) {
        i0.c(this.f20291a, gVar);
        g.c cVar = new g.c(gVar.a(), gVar.e());
        List<s.b> c10 = gVar.c();
        Handler handler = ((i0.a) androidx.core.util.h.g((i0.a) this.f20292b)).f20293a;
        s.a b10 = gVar.b();
        try {
            if (b10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                androidx.core.util.h.g(inputConfiguration);
                this.f20291a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, s.g.g(c10), cVar, handler);
            } else if (gVar.d() == 1) {
                this.f20291a.createConstrainedHighSpeedCaptureSession(i0.e(c10), cVar, handler);
            } else {
                this.f20291a.createCaptureSessionByOutputConfigurations(s.g.g(c10), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }
}
