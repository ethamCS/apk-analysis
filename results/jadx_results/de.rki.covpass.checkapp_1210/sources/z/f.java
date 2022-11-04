package z;

import androidx.camera.core.j3;
/* loaded from: classes.dex */
public abstract class f implements j3 {
    public static j3 e(j3 j3Var) {
        return new a(j3Var.b(), j3Var.a(), j3Var.d(), j3Var.c());
    }

    @Override // androidx.camera.core.j3
    public abstract float a();

    @Override // androidx.camera.core.j3
    public abstract float b();

    @Override // androidx.camera.core.j3
    public abstract float c();

    @Override // androidx.camera.core.j3
    public abstract float d();
}
