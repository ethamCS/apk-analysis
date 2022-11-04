package com.google.android.material.bottomappbar;

import d.a.a.a.a0.f;
import d.a.a.a.a0.m;
/* loaded from: classes.dex */
public class a extends f implements Cloneable {

    /* renamed from: b */
    private float f2971b;

    /* renamed from: c */
    private float f2972c;

    /* renamed from: d */
    private float f2973d;

    /* renamed from: e */
    private float f2974e;

    /* renamed from: f */
    private float f2975f;

    @Override // d.a.a.a.a0.f
    public void d(float f2, float f3, float f4, m mVar) {
        float f5 = this.f2973d;
        if (f5 == 0.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f6 = ((this.f2972c * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f2971b;
        float f8 = f3 + this.f2975f;
        float f9 = (this.f2974e * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((f10 * f10) - (f11 * f11));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f11));
        float f14 = 90.0f - degrees;
        mVar.m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        mVar.a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        mVar.m(f2, 0.0f);
    }

    public float e() {
        return this.f2974e;
    }

    public float f() {
        return this.f2972c;
    }

    public float g() {
        return this.f2971b;
    }

    public float h() {
        return this.f2973d;
    }

    public void i(float f2) {
        if (f2 >= 0.0f) {
            this.f2974e = f2;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void j(float f2) {
        this.f2972c = f2;
    }

    public void l(float f2) {
        this.f2971b = f2;
    }

    public void m(float f2) {
        this.f2973d = f2;
    }

    public void n(float f2) {
        this.f2975f = f2;
    }
}
