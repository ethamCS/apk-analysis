package r;

import android.hardware.camera2.CameraCharacteristics;
import r.z;
/* loaded from: classes.dex */
public class y implements z.a {

    /* renamed from: a */
    protected final CameraCharacteristics f20349a;

    public y(CameraCharacteristics cameraCharacteristics) {
        this.f20349a = cameraCharacteristics;
    }

    @Override // r.z.a
    public <T> T a(CameraCharacteristics.Key<T> key) {
        return (T) this.f20349a.get(key);
    }
}
