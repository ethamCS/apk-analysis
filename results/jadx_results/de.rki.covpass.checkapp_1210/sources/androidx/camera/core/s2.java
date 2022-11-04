package androidx.camera.core;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class s2 extends x1 {

    /* renamed from: b */
    private final float f2488b;

    /* renamed from: c */
    private final float f2489c;

    public s2(float f10, float f11) {
        this.f2488b = f10;
        this.f2489c = f11;
    }

    @Override // androidx.camera.core.x1
    protected PointF a(float f10, float f11) {
        return new PointF(f10 / this.f2488b, f11 / this.f2489c);
    }
}
