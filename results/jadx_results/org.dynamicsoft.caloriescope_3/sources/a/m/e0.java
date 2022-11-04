package a.m;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e0 extends d0 {
    private static boolean f = true;
    private static boolean g = true;

    @Override // a.m.i0
    @SuppressLint({"NewApi"})
    public void a(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // a.m.i0
    @SuppressLint({"NewApi"})
    public void b(View view, Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
