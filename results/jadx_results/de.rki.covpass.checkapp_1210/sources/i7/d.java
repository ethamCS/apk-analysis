package i7;

import h6.s;
/* loaded from: classes.dex */
public final class d extends s {

    /* renamed from: c */
    private final float f12331c;

    /* renamed from: d */
    private final int f12332d;

    public d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    private d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f12331c = f12;
        this.f12332d = i10;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f12331c);
        return abs <= 1.0f || abs <= this.f12331c;
    }

    public d g(float f10, float f11, float f12) {
        int i10 = this.f12332d;
        int i11 = i10 + 1;
        float c10 = (i10 * c()) + f11;
        float f13 = i11;
        return new d(c10 / f13, ((this.f12332d * d()) + f10) / f13, ((this.f12332d * this.f12331c) + f12) / f13, i11);
    }

    public int h() {
        return this.f12332d;
    }

    public float i() {
        return this.f12331c;
    }
}
