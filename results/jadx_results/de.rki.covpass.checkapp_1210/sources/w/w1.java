package w;

import android.util.Size;
import androidx.camera.core.c3;
import java.util.List;
import java.util.Set;
import w.c2;
import w.k0;
import w.o0;
/* loaded from: classes.dex */
public final class w1 implements o2<androidx.camera.core.c2>, f1, z.k {
    public static final o0.a<b1> A = o0.a.a("camerax.core.preview.imageInfoProcessor", b1.class);
    public static final o0.a<l0> B = o0.a.a("camerax.core.preview.captureProcessor", l0.class);
    public static final o0.a<Boolean> C = o0.a.a("camerax.core.preview.isRgba8888SurfaceRequired", Boolean.class);

    /* renamed from: z */
    private final u1 f24609z;

    public w1(u1 u1Var) {
        this.f24609z = u1Var;
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

    public l0 H(l0 l0Var) {
        return (l0) a(B, l0Var);
    }

    public b1 I(b1 b1Var) {
        return (b1) a(A, b1Var);
    }

    public boolean J(boolean z10) {
        return ((Boolean) a(C, Boolean.valueOf(z10))).booleanValue();
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
        return this.f24609z;
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
        return ((Integer) b(d1.f24439f)).intValue();
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
