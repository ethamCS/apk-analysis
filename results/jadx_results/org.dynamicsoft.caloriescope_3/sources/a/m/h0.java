package a.m;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class h0 extends g0 {
    @Override // a.m.d0, a.m.i0
    public void a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // a.m.g0, a.m.i0
    public void a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // a.m.f0, a.m.i0
    public void a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // a.m.e0, a.m.i0
    public void a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.m.d0, a.m.i0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a.m.e0, a.m.i0
    public void b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
