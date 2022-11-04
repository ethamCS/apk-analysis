package w;

import android.util.Size;
import androidx.camera.core.c3;
import androidx.camera.core.p0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import w.c2;
import w.k0;
import w.o0;
/* loaded from: classes.dex */
public final class z0 implements o2<androidx.camera.core.p0>, f1, z.k {
    public static final o0.a<Integer> A = o0.a.a("camerax.core.imageAnalysis.backpressureStrategy", p0.b.class);
    public static final o0.a<Integer> B = o0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final o0.a<androidx.camera.core.o1> C = o0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", androidx.camera.core.o1.class);
    public static final o0.a<Integer> D = o0.a.a("camerax.core.imageAnalysis.outputImageFormat", p0.e.class);
    public static final o0.a<Boolean> E = o0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final o0.a<Boolean> F = o0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* renamed from: z */
    private final u1 f24617z;

    public z0(u1 u1Var) {
        this.f24617z = u1Var;
    }

    @Override // w.f1
    public /* synthetic */ int A(int i10) {
        return e1.a(this, i10);
    }

    @Override // z.i
    public /* synthetic */ String B(String str) {
        return z.h.a(this, str);
    }

    @Override // z.m
    public /* synthetic */ c3.b D(c3.b bVar) {
        return z.l.a(this, bVar);
    }

    @Override // w.f1
    public /* synthetic */ int E(int i10) {
        return e1.g(this, i10);
    }

    public /* synthetic */ Executor H(Executor executor) {
        return z.j.a(this, executor);
    }

    public int I(int i10) {
        return ((Integer) a(A, Integer.valueOf(i10))).intValue();
    }

    public int J(int i10) {
        return ((Integer) a(B, Integer.valueOf(i10))).intValue();
    }

    public androidx.camera.core.o1 K() {
        return (androidx.camera.core.o1) a(C, null);
    }

    public Boolean L(Boolean bool) {
        return (Boolean) a(E, bool);
    }

    public int M(int i10) {
        return ((Integer) a(D, Integer.valueOf(i10))).intValue();
    }

    public Boolean N(Boolean bool) {
        return (Boolean) a(F, bool);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Object a(o0.a aVar, Object obj) {
        return z1.g(this, aVar, obj);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Object b(o0.a aVar) {
        return z1.f(this, aVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Set c() {
        return z1.e(this);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ o0.c d(o0.a aVar) {
        return z1.c(this, aVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ boolean e(o0.a aVar) {
        return z1.a(this, aVar);
    }

    @Override // w.f1
    public /* synthetic */ Size f(Size size) {
        return e1.c(this, size);
    }

    @Override // w.o2
    public /* synthetic */ k0 i(k0 k0Var) {
        return n2.c(this, k0Var);
    }

    @Override // w.o2
    public /* synthetic */ k0.b j(k0.b bVar) {
        return n2.b(this, bVar);
    }

    @Override // w.a2
    public o0 k() {
        return this.f24617z;
    }

    @Override // w.f1
    public /* synthetic */ List l(List list) {
        return e1.d(this, list);
    }

    @Override // w.f1
    public /* synthetic */ boolean m() {
        return e1.h(this);
    }

    @Override // w.o2
    public /* synthetic */ int n(int i10) {
        return n2.f(this, i10);
    }

    @Override // w.f1
    public /* synthetic */ int o() {
        return e1.e(this);
    }

    @Override // w.d1
    public int q() {
        return 35;
    }

    @Override // w.o2
    public /* synthetic */ c2.d r(c2.d dVar) {
        return n2.e(this, dVar);
    }

    @Override // w.o0
    public /* synthetic */ Object t(o0.a aVar, o0.c cVar) {
        return z1.h(this, aVar, cVar);
    }

    @Override // w.f1
    public /* synthetic */ Size u(Size size) {
        return e1.b(this, size);
    }

    @Override // w.o0
    public /* synthetic */ void v(String str, o0.b bVar) {
        z1.b(this, str, bVar);
    }

    @Override // w.o2
    public /* synthetic */ c2 w(c2 c2Var) {
        return n2.d(this, c2Var);
    }

    @Override // w.o0
    public /* synthetic */ Set x(o0.a aVar) {
        return z1.d(this, aVar);
    }

    @Override // w.o2
    public /* synthetic */ androidx.camera.core.s y(androidx.camera.core.s sVar) {
        return n2.a(this, sVar);
    }

    @Override // w.f1
    public /* synthetic */ Size z(Size size) {
        return e1.f(this, size);
    }
}
