package s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.h;
/* loaded from: classes.dex */
public class e extends d {
    public e(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    e(Object obj) {
        super(obj);
    }

    public static e g(OutputConfiguration outputConfiguration) {
        return new e(outputConfiguration);
    }

    @Override // s.d, s.c, s.f, s.b.a
    public String c() {
        return null;
    }

    @Override // s.d, s.c, s.f, s.b.a
    public Object d() {
        h.a(this.f21334a instanceof OutputConfiguration);
        return this.f21334a;
    }

    @Override // s.d, s.c, s.f, s.b.a
    public void e(String str) {
        ((OutputConfiguration) d()).setPhysicalCameraId(str);
    }
}
