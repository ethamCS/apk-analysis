package b3;
/* loaded from: classes.dex */
public class g extends a3.e<c4.a> {

    /* renamed from: f */
    private float[] f5445f;

    @Override // a3.d
    public float b(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f || f10 > this.f189d - 1 || f11 > this.f190e - 1) {
            return e(f10, f11);
        }
        return this.f5445f[((c4.a) this.f187b).f6218c + (((int) f11) * this.f188c) + ((int) f10)];
    }

    public float e(float f10, float f11) {
        return ((y3.i) this.f186a).b((int) Math.floor(f10), (int) Math.floor(f11));
    }

    /* renamed from: f */
    public void c(c4.a aVar) {
        super.d(aVar);
        this.f5445f = ((c4.a) this.f187b).V3;
    }
}
