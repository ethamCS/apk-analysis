package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.utils.g;
/* loaded from: classes.dex */
public abstract class q1 implements k1 {
    public static k1 f(w.j2 j2Var, long j10, int i10, Matrix matrix) {
        return new h(j2Var, j10, i10, matrix);
    }

    @Override // androidx.camera.core.k1
    public abstract w.j2 a();

    @Override // androidx.camera.core.k1
    public void b(g.b bVar) {
        bVar.m(d());
    }

    @Override // androidx.camera.core.k1
    public abstract long c();

    @Override // androidx.camera.core.k1
    public abstract int d();

    @Override // androidx.camera.core.k1
    public abstract Matrix e();
}
