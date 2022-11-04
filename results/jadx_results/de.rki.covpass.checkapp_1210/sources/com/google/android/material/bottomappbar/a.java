package com.google.android.material.bottomappbar;

import t5.f;
import t5.m;
/* loaded from: classes.dex */
public class a extends f implements Cloneable {
    private float U3;

    /* renamed from: c */
    private float f6910c;

    /* renamed from: d */
    private float f6911d;

    /* renamed from: q */
    private float f6912q;

    /* renamed from: x */
    private float f6913x;

    /* renamed from: y */
    private float f6914y;

    @Override // t5.f
    public void c(float f10, float f11, float f12, m mVar) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21 = this.f6912q;
        if (f21 == 0.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f22 = ((this.f6911d * 2.0f) + f21) / 2.0f;
        float f23 = f12 * this.f6910c;
        float f24 = f11 + this.f6914y;
        float f25 = (this.f6913x * f12) + ((1.0f - f12) * f22);
        if (f25 / f22 >= 1.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f26 = this.U3;
        float f27 = f26 * f12;
        boolean z10 = f26 == -1.0f || Math.abs((f26 * 2.0f) - f21) < 0.1f;
        if (!z10) {
            f14 = 1.75f;
            f13 = 0.0f;
        } else {
            f13 = f25;
            f14 = 0.0f;
        }
        float f28 = f22 + f23;
        float f29 = f13 + f23;
        float sqrt = (float) Math.sqrt((f28 * f28) - (f29 * f29));
        float f30 = f24 - sqrt;
        float f31 = f24 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f29));
        float f32 = (90.0f - degrees) + f14;
        mVar.m(f30, 0.0f);
        float f33 = f23 * 2.0f;
        mVar.a(f30 - f23, 0.0f, f30 + f23, f33, 270.0f, degrees);
        if (z10) {
            f20 = f24 - f22;
            f19 = (-f22) - f13;
            f18 = f24 + f22;
            f17 = f22 - f13;
            f16 = 180.0f - f32;
            f15 = (f32 * 2.0f) - 180.0f;
        } else {
            float f34 = this.f6911d;
            float f35 = f27 * 2.0f;
            float f36 = f24 - f22;
            mVar.a(f36, -(f27 + f34), f36 + f34 + f35, f34 + f27, 180.0f - f32, ((f32 * 2.0f) - 180.0f) / 2.0f);
            f18 = f24 + f22;
            float f37 = this.f6911d;
            mVar.m(f18 - ((f37 / 2.0f) + f27), f37 + f27);
            float f38 = this.f6911d;
            f20 = f18 - (f35 + f38);
            f19 = -(f27 + f38);
            f17 = f38 + f27;
            f16 = 90.0f;
            f15 = f32 - 90.0f;
        }
        mVar.a(f20, f19, f18, f17, f16, f15);
        mVar.a(f31 - f23, 0.0f, f31 + f23, f33, 270.0f - degrees, degrees);
        mVar.m(f10, 0.0f);
    }

    public float d() {
        return this.f6913x;
    }

    public float e() {
        return this.U3;
    }

    public float f() {
        return this.f6911d;
    }

    public float g() {
        return this.f6910c;
    }

    public float h() {
        return this.f6912q;
    }

    public void i(float f10) {
        if (f10 >= 0.0f) {
            this.f6913x = f10;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void j(float f10) {
        this.U3 = f10;
    }

    public void k(float f10) {
        this.f6911d = f10;
    }

    public void l(float f10) {
        this.f6910c = f10;
    }

    public void m(float f10) {
        this.f6912q = f10;
    }

    public void o(float f10) {
        this.f6914y = f10;
    }
}
