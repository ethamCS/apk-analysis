package r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import r.a0;
import r.m0;
/* loaded from: classes.dex */
public class q0 implements m0.b {

    /* renamed from: a */
    final CameraManager f20333a;

    /* renamed from: b */
    final Object f20334b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final Map<CameraManager.AvailabilityCallback, m0.a> f20335a = new HashMap();

        /* renamed from: b */
        final Handler f20336b;

        a(Handler handler) {
            this.f20336b = handler;
        }
    }

    public q0(Context context, Object obj) {
        this.f20333a = (CameraManager) context.getSystemService("camera");
        this.f20334b = obj;
    }

    public static q0 f(Context context, Handler handler) {
        return new q0(context, new a(handler));
    }

    @Override // r.m0.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            m0.a aVar = null;
            a aVar2 = (a) this.f20334b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f20335a) {
                    aVar = aVar2.f20335a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new m0.a(executor, availabilityCallback);
                        aVar2.f20335a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f20333a.registerAvailabilityCallback(aVar, aVar2.f20336b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // r.m0.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        m0.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f20334b;
            synchronized (aVar2.f20335a) {
                aVar = aVar2.f20335a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g();
        }
        this.f20333a.unregisterAvailabilityCallback(aVar);
    }

    @Override // r.m0.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f20333a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }

    @Override // r.m0.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        androidx.core.util.h.g(executor);
        androidx.core.util.h.g(stateCallback);
        try {
            this.f20333a.openCamera(str, new a0.b(executor, stateCallback), ((a) this.f20334b).f20336b);
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }

    @Override // r.m0.b
    public String[] e() {
        try {
            return this.f20333a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw f.g(e10);
        }
    }
}
