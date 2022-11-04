package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import w.c2;
import w.h1;
/* loaded from: classes.dex */
public final class l3 implements i3 {

    /* renamed from: a */
    final Queue<androidx.camera.core.n1> f1807a = new LinkedList();

    /* renamed from: b */
    final Queue<TotalCaptureResult> f1808b = new LinkedList();

    /* renamed from: c */
    private boolean f1809c = false;

    /* renamed from: d */
    private boolean f1810d;

    /* renamed from: e */
    private boolean f1811e;

    /* renamed from: f */
    androidx.camera.core.o2 f1812f;

    /* renamed from: g */
    private w.r0 f1813g;

    /* renamed from: h */
    ImageWriter f1814h;

    /* loaded from: classes.dex */
    class a extends w.h {
        a() {
            l3.this = r1;
        }

        @Override // w.h
        public void b(w.q qVar) {
            super.b(qVar);
            CaptureResult e10 = qVar.e();
            if (e10 == null || !(e10 instanceof TotalCaptureResult)) {
                return;
            }
            l3.this.f1808b.add((TotalCaptureResult) e10);
        }
    }

    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
            l3.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                l3.this.f1814h = a0.a.c(inputSurface, 1);
            }
        }
    }

    public l3(r.z zVar) {
        this.f1810d = false;
        this.f1811e = false;
        this.f1810d = m3.a(zVar, 7);
        this.f1811e = m3.a(zVar, 4);
    }

    private void f() {
        Queue<androidx.camera.core.n1> queue = this.f1807a;
        while (!queue.isEmpty()) {
            queue.remove().close();
        }
        this.f1808b.clear();
        w.r0 r0Var = this.f1813g;
        if (r0Var != null) {
            androidx.camera.core.o2 o2Var = this.f1812f;
            if (o2Var != null) {
                r0Var.i().b(new j3(o2Var), x.a.d());
            }
            r0Var.c();
        }
        ImageWriter imageWriter = this.f1814h;
        if (imageWriter != null) {
            imageWriter.close();
            this.f1814h = null;
        }
    }

    public /* synthetic */ void g(w.h1 h1Var) {
        androidx.camera.core.n1 e10 = h1Var.e();
        if (e10 != null) {
            this.f1807a.add(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.i3
    public void a(Size size, c2.b bVar) {
        if (this.f1809c) {
            return;
        }
        if (!this.f1810d && !this.f1811e) {
            return;
        }
        f();
        int i10 = this.f1810d ? 35 : 34;
        androidx.camera.core.o2 o2Var = new androidx.camera.core.o2(androidx.camera.core.p1.a(size.getWidth(), size.getHeight(), i10, 2));
        this.f1812f = o2Var;
        o2Var.g(new h1.a() { // from class: androidx.camera.camera2.internal.k3
            @Override // w.h1.a
            public final void a(w.h1 h1Var) {
                l3.this.g(h1Var);
            }
        }, x.a.c());
        w.i1 i1Var = new w.i1(this.f1812f.b(), new Size(this.f1812f.d(), this.f1812f.a()), i10);
        this.f1813g = i1Var;
        androidx.camera.core.o2 o2Var2 = this.f1812f;
        x5.a<Void> i11 = i1Var.i();
        Objects.requireNonNull(o2Var2);
        i11.b(new j3(o2Var2), x.a.d());
        bVar.k(this.f1813g);
        bVar.d(new a());
        bVar.j(new b());
        bVar.r(new InputConfiguration(this.f1812f.d(), this.f1812f.a(), this.f1812f.f()));
    }

    @Override // androidx.camera.camera2.internal.i3
    public void b(boolean z10) {
        this.f1809c = z10;
    }

    @Override // androidx.camera.camera2.internal.i3
    public boolean c(androidx.camera.core.n1 n1Var) {
        Image o02 = n1Var.o0();
        ImageWriter imageWriter = this.f1814h;
        if (imageWriter == null || o02 == null) {
            return false;
        }
        a0.a.e(imageWriter, o02);
        return true;
    }

    @Override // androidx.camera.camera2.internal.i3
    public androidx.camera.core.n1 d() {
        try {
            return this.f1807a.remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
