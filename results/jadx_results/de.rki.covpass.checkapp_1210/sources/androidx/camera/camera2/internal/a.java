package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.internal.g3;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import q.a;
/* loaded from: classes.dex */
public final class a implements g3.b {

    /* renamed from: a */
    private final r.z f1595a;

    /* renamed from: b */
    private final Range<Float> f1596b;

    /* renamed from: d */
    private c.a<Void> f1598d;

    /* renamed from: c */
    private float f1597c = 1.0f;

    /* renamed from: e */
    private float f1599e = 1.0f;

    public a(r.z zVar) {
        this.f1595a = zVar;
        this.f1596b = (Range) zVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f1598d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f1599e != f10.floatValue()) {
                return;
            }
            this.f1598d.c(null);
            this.f1598d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public Rect b() {
        return (Rect) androidx.core.util.h.g((Rect) this.f1595a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public float c() {
        return this.f1596b.getUpper().floatValue();
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public void d(a.C0313a c0313a) {
        c0313a.e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f1597c));
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public float e() {
        return this.f1596b.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.g3.b
    public void f() {
        this.f1597c = 1.0f;
        c.a<Void> aVar = this.f1598d;
        if (aVar != null) {
            aVar.f(new m.a("Camera is not active."));
            this.f1598d = null;
        }
    }
}
