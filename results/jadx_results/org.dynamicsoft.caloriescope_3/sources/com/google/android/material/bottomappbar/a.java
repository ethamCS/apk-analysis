package com.google.android.material.bottomappbar;

import b.a.a.a.b0.f;
import b.a.a.a.b0.m;
/* loaded from: classes.dex */
public class a extends f implements Cloneable {

    /* renamed from: b */
    private float f1412b;

    /* renamed from: c */
    private float f1413c;
    private float d;
    private float e;
    private float f;

    public float a() {
        return this.e;
    }

    public void a(float f) {
        this.e = f;
    }

    @Override // b.a.a.a.b0.f
    public void a(float f, float f2, float f3, m mVar) {
        float f4 = this.d;
        if (f4 == 0.0f) {
            mVar.a(f, 0.0f);
            return;
        }
        float f5 = ((this.f1413c * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f1412b;
        float f7 = f2 + this.f;
        float f8 = (this.e * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            mVar.a(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f10));
        float f13 = 90.0f - degrees;
        mVar.a(f11, 0.0f);
        float f14 = f6 * 2.0f;
        mVar.a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        mVar.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        mVar.a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        mVar.a(f, 0.0f);
    }

    public float b() {
        return this.f1413c;
    }

    public void b(float f) {
        this.f1413c = f;
    }

    public float c() {
        return this.f1412b;
    }

    public void c(float f) {
        this.f1412b = f;
    }

    public float d() {
        return this.d;
    }

    public void d(float f) {
        this.d = f;
    }

    public void e(float f) {
        this.f = f;
    }
}
