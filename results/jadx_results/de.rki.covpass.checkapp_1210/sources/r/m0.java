package r;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import r.m0;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    private final b f20316a;

    /* renamed from: b */
    private final Map<String, z> f20317b = new ArrayMap(4);

    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f20318a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f20319b;

        /* renamed from: c */
        private final Object f20320c = new Object();

        /* renamed from: d */
        private boolean f20321d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f20318a = executor;
            this.f20319b = availabilityCallback;
        }

        public /* synthetic */ void d() {
            e.a(this.f20319b);
        }

        public /* synthetic */ void e(String str) {
            this.f20319b.onCameraAvailable(str);
        }

        public /* synthetic */ void f(String str) {
            this.f20319b.onCameraUnavailable(str);
        }

        public void g() {
            synchronized (this.f20320c) {
                this.f20321d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f20320c) {
                if (!this.f20321d) {
                    this.f20318a.execute(new Runnable() { // from class: r.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            m0.a.this.d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f20320c) {
                if (!this.f20321d) {
                    this.f20318a.execute(new Runnable() { // from class: r.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            m0.a.this.e(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f20320c) {
                if (!this.f20321d) {
                    this.f20318a.execute(new Runnable() { // from class: r.l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            m0.a.this.f(str);
                        }
                    });
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str);

        void d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] e();
    }

    private m0(b bVar) {
        this.f20316a = bVar;
    }

    public static m0 a(Context context) {
        return b(context, androidx.camera.core.impl.utils.k.a());
    }

    public static m0 b(Context context, Handler handler) {
        return new m0(n0.a(context, handler));
    }

    public z c(String str) {
        z zVar;
        synchronized (this.f20317b) {
            zVar = this.f20317b.get(str);
            if (zVar == null) {
                try {
                    zVar = z.c(this.f20316a.c(str));
                    this.f20317b.put(str, zVar);
                } catch (AssertionError e10) {
                    throw new f(10002, e10.getMessage(), e10);
                }
            }
        }
        return zVar;
    }

    public String[] d() {
        return this.f20316a.e();
    }

    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f20316a.d(str, executor, stateCallback);
    }

    public void f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f20316a.a(executor, availabilityCallback);
    }

    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f20316a.b(availabilityCallback);
    }
}
