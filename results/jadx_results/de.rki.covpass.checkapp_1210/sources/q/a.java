package q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.h0;
import v.j;
import w.o0;
import w.p1;
import w.q1;
import w.u1;
/* loaded from: classes.dex */
public final class a extends j {
    public static final o0.a<Integer> A = o0.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final o0.a<CameraDevice.StateCallback> B = o0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final o0.a<CameraCaptureSession.StateCallback> C = o0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final o0.a<CameraCaptureSession.CaptureCallback> D = o0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final o0.a<c> E = o0.a.a("camera2.cameraEvent.callback", c.class);
    public static final o0.a<Object> F = o0.a.a("camera2.captureRequest.tag", Object.class);
    public static final o0.a<String> G = o0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: q.a$a */
    /* loaded from: classes.dex */
    public static final class C0313a implements h0<a> {

        /* renamed from: a */
        private final q1 f19280a = q1.L();

        @Override // androidx.camera.core.h0
        public p1 a() {
            return this.f19280a;
        }

        public a c() {
            return new a(u1.J(this.f19280a));
        }

        public C0313a d(o0 o0Var) {
            for (o0.a<?> aVar : o0Var.c()) {
                this.f19280a.g(aVar, o0Var.b(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C0313a e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f19280a.g(a.H(key), valuet);
            return this;
        }
    }

    public a(o0 o0Var) {
        super(o0Var);
    }

    public static o0.a<Object> H(CaptureRequest.Key<?> key) {
        return o0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public c I(c cVar) {
        return (c) k().a(E, cVar);
    }

    public j J() {
        return j.a.e(k()).d();
    }

    public Object K(Object obj) {
        return k().a(F, obj);
    }

    public int L(int i10) {
        return ((Integer) k().a(A, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback M(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) k().a(B, stateCallback);
    }

    public String N(String str) {
        return (String) k().a(G, str);
    }

    public CameraCaptureSession.CaptureCallback O(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) k().a(D, captureCallback);
    }

    public CameraCaptureSession.StateCallback P(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) k().a(C, stateCallback);
    }
}
