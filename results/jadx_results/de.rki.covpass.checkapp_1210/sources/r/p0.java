package r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class p0 extends o0 {
    public p0(Context context) {
        super(context);
    }

    @Override // r.o0, r.q0, r.m0.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f20333a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }

    @Override // r.o0, r.q0, r.m0.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f20333a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }
}
