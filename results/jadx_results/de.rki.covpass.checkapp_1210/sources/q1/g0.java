package q1;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class g0 extends f0 {
    @Override // q1.c0, q1.h0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // q1.e0, q1.h0
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // q1.c0, q1.h0
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // q1.f0, q1.h0
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // q1.d0, q1.h0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // q1.d0, q1.h0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
