package androidx.camera.camera2.internal;
/* loaded from: classes.dex */
class h3 implements androidx.camera.core.j3 {

    /* renamed from: a */
    private float f1766a;

    /* renamed from: b */
    private final float f1767b;

    /* renamed from: c */
    private final float f1768c;

    /* renamed from: d */
    private float f1769d;

    public h3(float f10, float f11) {
        this.f1767b = f10;
        this.f1768c = f11;
    }

    private float e(float f10) {
        float f11 = this.f1767b;
        float f12 = this.f1768c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    @Override // androidx.camera.core.j3
    public float a() {
        return this.f1767b;
    }

    @Override // androidx.camera.core.j3
    public float b() {
        return this.f1766a;
    }

    @Override // androidx.camera.core.j3
    public float c() {
        return this.f1769d;
    }

    @Override // androidx.camera.core.j3
    public float d() {
        return this.f1768c;
    }

    public void f(float f10) {
        if (f10 <= this.f1767b && f10 >= this.f1768c) {
            this.f1766a = f10;
            this.f1769d = e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f1768c + " , " + this.f1767b + "]");
    }
}
