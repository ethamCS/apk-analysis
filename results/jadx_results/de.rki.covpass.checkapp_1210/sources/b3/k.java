package b3;

import c4.l;
/* loaded from: classes.dex */
public class k extends a3.e<l> {

    /* renamed from: f */
    private byte[] f5449f;

    @Override // a3.d
    public float b(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f || f10 > this.f189d - 1 || f11 > this.f190e - 1) {
            return e(f10, f11);
        }
        return this.f5449f[((l) this.f187b).f6218c + (((int) f11) * this.f188c) + ((int) f10)] & 255;
    }

    public float e(float f10, float f11) {
        return ((y3.k) this.f186a).b((int) Math.floor(f10), (int) Math.floor(f11));
    }

    /* renamed from: f */
    public void c(l lVar) {
        super.d(lVar);
        this.f5449f = ((l) this.f187b).V3;
    }
}
