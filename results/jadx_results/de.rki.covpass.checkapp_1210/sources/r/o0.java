package r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class o0 extends q0 {
    public o0(Context context) {
        super(context, null);
    }

    public static o0 g(Context context) {
        return new o0(context);
    }

    private boolean h(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && i(th2);
    }

    private static boolean i(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void j(Throwable th2) {
        throw new f(10001, th2);
    }

    @Override // r.q0, r.m0.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f20333a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // r.q0, r.m0.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f20333a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // r.q0, r.m0.b
    public CameraCharacteristics c(String str) {
        try {
            return super.c(str);
        } catch (RuntimeException e10) {
            if (h(e10)) {
                j(e10);
            }
            throw e10;
        }
    }

    @Override // r.q0, r.m0.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f20333a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        } catch (IllegalArgumentException e11) {
            throw e11;
        } catch (SecurityException e12) {
        } catch (RuntimeException e13) {
            if (h(e13)) {
                j(e13);
            }
            throw e13;
        }
    }
}
