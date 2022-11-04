package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.o2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
final class b3 extends o2.a {

    /* renamed from: a */
    private final List<o2.a> f1628a;

    /* loaded from: classes.dex */
    static class a extends o2.a {

        /* renamed from: a */
        private final CameraCaptureSession.StateCallback f1629a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f1629a = stateCallback;
        }

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(f1.a(list));
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void n(o2 o2Var) {
            this.f1629a.onActive(o2Var.i().c());
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void o(o2 o2Var) {
            r.d.b(this.f1629a, o2Var.i().c());
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void p(o2 o2Var) {
            this.f1629a.onClosed(o2Var.i().c());
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void q(o2 o2Var) {
            this.f1629a.onConfigureFailed(o2Var.i().c());
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void r(o2 o2Var) {
            this.f1629a.onConfigured(o2Var.i().c());
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void s(o2 o2Var) {
            this.f1629a.onReady(o2Var.i().c());
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void t(o2 o2Var) {
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void u(o2 o2Var, Surface surface) {
            r.b.a(this.f1629a, o2Var.i().c(), surface);
        }
    }

    b3(List<o2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f1628a = arrayList;
        arrayList.addAll(list);
    }

    public static o2.a v(o2.a... aVarArr) {
        return new b3(Arrays.asList(aVarArr));
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void n(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.n(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void o(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.o(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void p(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.p(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void q(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.q(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void r(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.r(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void s(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.s(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void t(o2 o2Var) {
        for (o2.a aVar : this.f1628a) {
            aVar.t(o2Var);
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void u(o2 o2Var, Surface surface) {
        for (o2.a aVar : this.f1628a) {
            aVar.u(o2Var, surface);
        }
    }
}
