package o6;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    private final float f17598a;

    /* renamed from: b */
    private final float f17599b;

    /* renamed from: c */
    private final float f17600c;

    /* renamed from: d */
    private final float f17601d;

    /* renamed from: e */
    private final float f17602e;

    /* renamed from: f */
    private final float f17603f;

    /* renamed from: g */
    private final float f17604g;

    /* renamed from: h */
    private final float f17605h;

    /* renamed from: i */
    private final float f17606i;

    private k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f17598a = f10;
        this.f17599b = f13;
        this.f17600c = f16;
        this.f17601d = f11;
        this.f17602e = f14;
        this.f17603f = f17;
        this.f17604g = f12;
        this.f17605h = f15;
        this.f17606i = f18;
    }

    public static k b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static k c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static k d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new k(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new k((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    k a() {
        float f10 = this.f17602e;
        float f11 = this.f17606i;
        float f12 = this.f17603f;
        float f13 = this.f17605h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f17604g;
        float f16 = this.f17601d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f17600c;
        float f20 = this.f17599b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f17598a;
        return new k(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    k e(k kVar) {
        float f10 = this.f17598a;
        float f11 = kVar.f17598a;
        float f12 = this.f17601d;
        float f13 = kVar.f17599b;
        float f14 = this.f17604g;
        float f15 = kVar.f17600c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = kVar.f17601d;
        float f18 = kVar.f17602e;
        float f19 = kVar.f17603f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = kVar.f17604g;
        float f22 = kVar.f17605h;
        float f23 = kVar.f17606i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f17599b;
        float f26 = this.f17602e;
        float f27 = this.f17605h;
        float f28 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f29 = this.f17600c;
        float f30 = this.f17603f;
        float f31 = (f11 * f29) + (f13 * f30);
        float f32 = this.f17606i;
        return new k(f16, f20, f24, (f25 * f11) + (f26 * f13) + (f27 * f15), (f25 * f17) + (f26 * f18) + (f27 * f19), f28, (f15 * f32) + f31, (f17 * f29) + (f18 * f30) + (f19 * f32), (f29 * f21) + (f30 * f22) + (f32 * f23));
    }

    public void f(float[] fArr) {
        float f10 = this.f17598a;
        float f11 = this.f17599b;
        float f12 = this.f17600c;
        float f13 = this.f17601d;
        float f14 = this.f17602e;
        float f15 = this.f17603f;
        float f16 = this.f17604g;
        float f17 = this.f17605h;
        float f18 = this.f17606i;
        int length = fArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
