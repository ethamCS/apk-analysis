package b3;
/* loaded from: classes.dex */
public class h extends a3.e<c4.g> {

    /* renamed from: f */
    private short[] f5446f;

    @Override // a3.d
    public float b(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f || f10 > this.f189d - 1 || f11 > this.f190e - 1) {
            return e(f10, f11);
        }
        return this.f5446f[((c4.g) this.f187b).f6218c + (((int) f11) * this.f188c) + ((int) f10)];
    }

    public float e(float f10, float f11) {
        return ((y3.k) this.f186a).b((int) Math.floor(f10), (int) Math.floor(f11));
    }

    /* renamed from: f */
    public void c(c4.g gVar) {
        super.d(gVar);
        this.f5446f = ((c4.g) this.f187b).V3;
    }
}
