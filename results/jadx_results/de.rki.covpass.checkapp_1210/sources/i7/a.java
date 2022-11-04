package i7;

import h6.s;
/* loaded from: classes.dex */
public final class a extends s {

    /* renamed from: c */
    private final float f12319c;

    public a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f12319c = f12;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f12319c);
        return abs <= 1.0f || abs <= this.f12319c;
    }

    public a g(float f10, float f11, float f12) {
        return new a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f12319c + f12) / 2.0f);
    }
}
