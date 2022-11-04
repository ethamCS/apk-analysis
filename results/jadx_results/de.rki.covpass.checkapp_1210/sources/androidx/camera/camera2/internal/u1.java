package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.g3;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import q.a;
/* loaded from: classes.dex */
public final class u1 implements g3.b {

    /* renamed from: a */
    private final r.z f2006a;

    /* renamed from: c */
    private c.a<Void> f2008c;

    /* renamed from: b */
    private Rect f2007b = null;

    /* renamed from: d */
    private Rect f2009d = null;

    public u1(r.z zVar) {
        this.f2006a = zVar;
    }

    private Rect g() {
        return (Rect) androidx.core.util.h.g((Rect) this.f2006a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f2008c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f2009d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f2008c.c(null);
            this.f2008c = null;
            this.f2009d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public Rect b() {
        Rect rect = this.f2007b;
        return rect != null ? rect : g();
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public float c() {
        Float f10 = (Float) this.f2006a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < e() ? e() : f10.floatValue();
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public void d(a.C0313a c0313a) {
        Rect rect = this.f2007b;
        if (rect != null) {
            c0313a.e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public float e() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public void f() {
        this.f2009d = null;
        this.f2007b = null;
        c.a<Void> aVar = this.f2008c;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f2008c = null;
        }
    }
}
