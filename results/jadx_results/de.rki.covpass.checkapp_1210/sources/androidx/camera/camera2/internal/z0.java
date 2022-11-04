package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v.j;
import w.o0;
/* loaded from: classes.dex */
class z0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(CaptureRequest.Builder builder, w.o0 o0Var) {
        v.j d10 = j.a.e(o0Var).d();
        for (o0.a aVar : d10.c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d10.b(aVar));
            } catch (IllegalArgumentException unused) {
                androidx.camera.core.s1.c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest b(w.k0 k0Var, CameraDevice cameraDevice, Map<w.r0, Surface> map) {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d10 = d(k0Var.e(), map);
        if (d10.isEmpty()) {
            return null;
        }
        w.q c10 = k0Var.c();
        CaptureRequest.Builder createCaptureRequest = (k0Var.g() != 5 || c10 == null || !(c10.e() instanceof TotalCaptureResult)) ? cameraDevice.createCaptureRequest(k0Var.g()) : a.a(cameraDevice, (TotalCaptureResult) c10.e());
        a(createCaptureRequest, k0Var.d());
        w.o0 d11 = k0Var.d();
        o0.a<Integer> aVar = w.k0.f24491h;
        if (d11.e(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) k0Var.d().b(aVar));
        }
        w.o0 d12 = k0Var.d();
        o0.a<Integer> aVar2 = w.k0.f24492i;
        if (d12.e(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) k0Var.d().b(aVar2)).byteValue()));
        }
        for (Surface surface : d10) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(k0Var.f());
        return createCaptureRequest.build();
    }

    public static CaptureRequest c(w.k0 k0Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(k0Var.g());
        a(createCaptureRequest, k0Var.d());
        return createCaptureRequest.build();
    }

    private static List<Surface> d(List<w.r0> list, Map<w.r0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (w.r0 r0Var : list) {
            Surface surface = map.get(r0Var);
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
