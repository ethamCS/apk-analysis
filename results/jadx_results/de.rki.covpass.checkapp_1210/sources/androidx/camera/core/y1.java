package androidx.camera.core;

import android.graphics.Matrix;
import android.media.ImageReader;
/* loaded from: classes.dex */
class y1 extends d {

    /* renamed from: c */
    private volatile w.j2 f2572c = null;

    /* renamed from: d */
    private volatile Long f2573d = null;

    /* renamed from: e */
    private volatile Integer f2574e = null;

    /* renamed from: f */
    private volatile Matrix f2575f = null;

    public y1(ImageReader imageReader) {
        super(imageReader);
    }

    private n1 o(n1 n1Var) {
        k1 I = n1Var.I();
        return new p2(n1Var, q1.f(this.f2572c != null ? this.f2572c : I.a(), this.f2573d != null ? this.f2573d.longValue() : I.c(), this.f2574e != null ? this.f2574e.intValue() : I.d(), this.f2575f != null ? this.f2575f : I.e()));
    }

    @Override // androidx.camera.core.d, w.h1
    public n1 e() {
        return o(super.j());
    }

    @Override // androidx.camera.core.d, w.h1
    public n1 j() {
        return o(super.j());
    }

    public void p(w.j2 j2Var) {
        this.f2572c = j2Var;
    }
}
