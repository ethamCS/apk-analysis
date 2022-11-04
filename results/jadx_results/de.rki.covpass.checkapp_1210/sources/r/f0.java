package r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import r.g;
import r.i0;
/* loaded from: classes.dex */
public class f0 extends i0 {
    public f0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static f0 f(CameraDevice cameraDevice, Handler handler) {
        return new f0(cameraDevice, new i0.a(handler));
    }

    @Override // r.a0.a
    public void a(s.g gVar) {
        i0.c(this.f20291a, gVar);
        g.c cVar = new g.c(gVar.a(), gVar.e());
        List<Surface> e10 = i0.e(gVar.c());
        Handler handler = ((i0.a) androidx.core.util.h.g((i0.a) this.f20292b)).f20293a;
        s.a b10 = gVar.b();
        try {
            if (b10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                androidx.core.util.h.g(inputConfiguration);
                this.f20291a.createReprocessableCaptureSession(inputConfiguration, e10, cVar, handler);
            } else if (gVar.d() == 1) {
                this.f20291a.createConstrainedHighSpeedCaptureSession(e10, cVar, handler);
            } else {
                d(this.f20291a, e10, cVar, handler);
            }
        } catch (CameraAccessException e11) {
            throw f.g(e11);
        }
    }
}
