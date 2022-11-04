package r;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import r.a0;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    private final a f20263a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(s.g gVar);
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f20264a;

        /* renamed from: b */
        private final Executor f20265b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f20265b = executor;
            this.f20264a = stateCallback;
        }

        public /* synthetic */ void e(CameraDevice cameraDevice) {
            this.f20264a.onClosed(cameraDevice);
        }

        public /* synthetic */ void f(CameraDevice cameraDevice) {
            this.f20264a.onDisconnected(cameraDevice);
        }

        public /* synthetic */ void g(CameraDevice cameraDevice, int i10) {
            this.f20264a.onError(cameraDevice, i10);
        }

        public /* synthetic */ void h(CameraDevice cameraDevice) {
            this.f20264a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f20265b.execute(new Runnable() { // from class: r.d0
                @Override // java.lang.Runnable
                public final void run() {
                    a0.b.this.e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f20265b.execute(new Runnable() { // from class: r.b0
                @Override // java.lang.Runnable
                public final void run() {
                    a0.b.this.f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f20265b.execute(new Runnable() { // from class: r.e0
                @Override // java.lang.Runnable
                public final void run() {
                    a0.b.this.g(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f20265b.execute(new Runnable() { // from class: r.c0
                @Override // java.lang.Runnable
                public final void run() {
                    a0.b.this.h(cameraDevice);
                }
            });
        }
    }

    private a0(CameraDevice cameraDevice, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f20263a = new h0(cameraDevice);
        } else {
            this.f20263a = i10 >= 24 ? g0.g(cameraDevice, handler) : f0.f(cameraDevice, handler);
        }
    }

    public static a0 b(CameraDevice cameraDevice, Handler handler) {
        return new a0(cameraDevice, handler);
    }

    public void a(s.g gVar) {
        this.f20263a.a(gVar);
    }
}
