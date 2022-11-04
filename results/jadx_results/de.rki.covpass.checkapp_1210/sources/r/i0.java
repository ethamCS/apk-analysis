package r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.s1;
import java.util.ArrayList;
import java.util.List;
import r.a0;
/* loaded from: classes.dex */
class i0 implements a0.a {

    /* renamed from: a */
    final CameraDevice f20291a;

    /* renamed from: b */
    final Object f20292b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Handler f20293a;

        public a(Handler handler) {
            this.f20293a = handler;
        }
    }

    public i0(CameraDevice cameraDevice, Object obj) {
        this.f20291a = (CameraDevice) androidx.core.util.h.g(cameraDevice);
        this.f20292b = obj;
    }

    private static void b(CameraDevice cameraDevice, List<s.b> list) {
        String id2 = cameraDevice.getId();
        for (s.b bVar : list) {
            String a10 = bVar.a();
            if (a10 != null && !a10.isEmpty()) {
                s1.k("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + a10 + ". Ignoring.");
            }
        }
    }

    public static void c(CameraDevice cameraDevice, s.g gVar) {
        androidx.core.util.h.g(cameraDevice);
        androidx.core.util.h.g(gVar);
        androidx.core.util.h.g(gVar.e());
        List<s.b> c10 = gVar.c();
        if (c10 != null) {
            if (gVar.a() == null) {
                throw new IllegalArgumentException("Invalid executor");
            }
            b(cameraDevice, c10);
            return;
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static List<Surface> e(List<s.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (s.b bVar : list) {
            arrayList.add(bVar.b());
        }
        return arrayList;
    }

    public void d(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }
}
