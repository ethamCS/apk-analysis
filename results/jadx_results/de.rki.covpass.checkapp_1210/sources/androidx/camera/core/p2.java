package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
/* loaded from: classes.dex */
final class p2 extends k0 {
    private final int U3;

    /* renamed from: q */
    private final k1 f2437q;

    /* renamed from: x */
    private Rect f2438x;

    /* renamed from: y */
    private final int f2439y;

    public p2(n1 n1Var, Size size, k1 k1Var) {
        super(n1Var);
        int i10;
        if (size == null) {
            this.f2439y = super.d();
            i10 = super.a();
        } else {
            this.f2439y = size.getWidth();
            i10 = size.getHeight();
        }
        this.U3 = i10;
        this.f2437q = k1Var;
    }

    public p2(n1 n1Var, k1 k1Var) {
        this(n1Var, null, k1Var);
    }

    @Override // androidx.camera.core.k0, androidx.camera.core.n1
    public synchronized void D(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, d(), a())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        this.f2438x = rect;
    }

    @Override // androidx.camera.core.k0, androidx.camera.core.n1
    public k1 I() {
        return this.f2437q;
    }

    @Override // androidx.camera.core.k0, androidx.camera.core.n1
    public synchronized int a() {
        return this.U3;
    }

    @Override // androidx.camera.core.k0, androidx.camera.core.n1
    public synchronized int d() {
        return this.f2439y;
    }
}
