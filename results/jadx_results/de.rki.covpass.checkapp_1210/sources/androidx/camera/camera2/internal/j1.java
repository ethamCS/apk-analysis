package androidx.camera.camera2.internal;
/* loaded from: classes.dex */
public final class j1 {
    public static androidx.camera.core.u a(r.f fVar) {
        int f10 = fVar.f();
        int i10 = 5;
        if (f10 == 1) {
            i10 = 1;
        } else if (f10 == 2) {
            i10 = 2;
        } else if (f10 == 3) {
            i10 = 3;
        } else if (f10 == 4) {
            i10 = 4;
        } else if (f10 != 5) {
            i10 = f10 != 10001 ? 0 : 6;
        }
        return new androidx.camera.core.u(i10, fVar);
    }
}
