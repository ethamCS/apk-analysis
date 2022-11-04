package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.c3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import w.c2;
import w.k0;
import w.o0;
/* loaded from: classes.dex */
public class h2 {

    /* renamed from: a */
    private w.r0 f1759a;

    /* renamed from: b */
    private final w.c2 f1760b;

    /* renamed from: c */
    private final u.p f1761c = new u.p();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ Surface f1762a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f1763b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            h2.this = r1;
            this.f1762a = surface;
            this.f1763b = surfaceTexture;
        }

        @Override // y.c
        public void a(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        /* renamed from: c */
        public void b(Void r12) {
            this.f1762a.release();
            this.f1763b.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements w.o2<androidx.camera.core.c3> {

        /* renamed from: z */
        private final w.o0 f1765z;

        b() {
            w.q1 L = w.q1.L();
            L.g(w.o2.f24556p, new c1());
            this.f1765z = L;
        }

        @Override // z.i
        public /* synthetic */ String B(String str) {
            return z.h.a(this, str);
        }

        @Override // z.m
        public /* synthetic */ c3.b D(c3.b bVar) {
            return z.l.a(this, bVar);
        }

        @Override // w.a2, w.o0
        public /* synthetic */ Object a(o0.a aVar, Object obj) {
            return w.z1.g(this, aVar, obj);
        }

        @Override // w.a2, w.o0
        public /* synthetic */ Object b(o0.a aVar) {
            return w.z1.f(this, aVar);
        }

        @Override // w.a2, w.o0
        public /* synthetic */ Set c() {
            return w.z1.e(this);
        }

        @Override // w.a2, w.o0
        public /* synthetic */ o0.c d(o0.a aVar) {
            return w.z1.c(this, aVar);
        }

        @Override // w.a2, w.o0
        public /* synthetic */ boolean e(o0.a aVar) {
            return w.z1.a(this, aVar);
        }

        @Override // w.o2
        public /* synthetic */ w.k0 i(w.k0 k0Var) {
            return w.n2.c(this, k0Var);
        }

        @Override // w.o2
        public /* synthetic */ k0.b j(k0.b bVar) {
            return w.n2.b(this, bVar);
        }

        @Override // w.a2
        public w.o0 k() {
            return this.f1765z;
        }

        @Override // w.o2
        public /* synthetic */ int n(int i10) {
            return w.n2.f(this, i10);
        }

        @Override // w.d1
        public /* synthetic */ int q() {
            return w.c1.a(this);
        }

        @Override // w.o2
        public /* synthetic */ c2.d r(c2.d dVar) {
            return w.n2.e(this, dVar);
        }

        @Override // w.o0
        public /* synthetic */ Object t(o0.a aVar, o0.c cVar) {
            return w.z1.h(this, aVar, cVar);
        }

        @Override // w.o0
        public /* synthetic */ void v(String str, o0.b bVar) {
            w.z1.b(this, str, bVar);
        }

        @Override // w.o2
        public /* synthetic */ w.c2 w(w.c2 c2Var) {
            return w.n2.d(this, c2Var);
        }

        @Override // w.o0
        public /* synthetic */ Set x(o0.a aVar) {
            return w.z1.d(this, aVar);
        }

        @Override // w.o2
        public /* synthetic */ androidx.camera.core.s y(androidx.camera.core.s sVar) {
            return w.n2.a(this, sVar);
        }
    }

    public h2(r.z zVar, v1 v1Var) {
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size d10 = d(zVar, v1Var);
        androidx.camera.core.s1.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + d10);
        surfaceTexture.setDefaultBufferSize(d10.getWidth(), d10.getHeight());
        Surface surface = new Surface(surfaceTexture);
        c2.b o10 = c2.b.o(bVar);
        o10.s(1);
        w.i1 i1Var = new w.i1(surface);
        this.f1759a = i1Var;
        y.f.b(i1Var.i(), new a(surface, surfaceTexture), x.a.a());
        o10.k(this.f1759a);
        this.f1760b = o10.m();
    }

    private Size d(r.z zVar, v1 v1Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            androidx.camera.core.s1.c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
        if (outputSizes == null) {
            androidx.camera.core.s1.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a10 = this.f1761c.a(outputSizes);
        List asList = Arrays.asList(a10);
        Collections.sort(asList, g2.f1748c);
        Size d10 = v1Var.d();
        long min = Math.min(d10.getWidth() * d10.getHeight(), 307200L);
        Size size = null;
        int length = a10.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = a10[i10];
            int i11 = ((size2.getWidth() * size2.getHeight()) > min ? 1 : ((size2.getWidth() * size2.getHeight()) == min ? 0 : -1));
            if (i11 == 0) {
                return size2;
            }
            if (i11 <= 0) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    public static /* synthetic */ int f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    public void b() {
        androidx.camera.core.s1.a("MeteringRepeating", "MeteringRepeating clear!");
        w.r0 r0Var = this.f1759a;
        if (r0Var != null) {
            r0Var.c();
        }
        this.f1759a = null;
    }

    public String c() {
        return "MeteringRepeating";
    }

    public w.c2 e() {
        return this.f1760b;
    }
}
