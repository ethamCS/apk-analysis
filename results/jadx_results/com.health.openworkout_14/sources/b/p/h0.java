package b.p;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class h0 extends g0 {
    @Override // b.p.d0, b.p.i0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // b.p.f0, b.p.i0
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // b.p.d0, b.p.i0
    public void f(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // b.p.g0, b.p.i0
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // b.p.e0, b.p.i0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // b.p.e0, b.p.i0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
