package b3;
/* loaded from: classes.dex */
public class a extends a3.a<c4.a> {
    @Override // a3.d
    public float b(float f10, float f11) {
        return (f10 < 0.0f || f11 < 0.0f || f10 > ((float) (this.f182d + (-2))) || f11 > ((float) (this.f183e + (-2)))) ? e(f10, f11) : f(f10, f11);
    }

    public float e(float f10, float f11) {
        float floor = (float) Math.floor(f10);
        float floor2 = (float) Math.floor(f11);
        int i10 = (int) floor;
        int i11 = (int) floor2;
        float f12 = f10 - floor;
        float f13 = f11 - floor2;
        y3.i iVar = (y3.i) this.f179a;
        float f14 = 1.0f - f12;
        float f15 = 1.0f - f13;
        float b10 = f14 * f15 * iVar.b(i10, i11);
        int i12 = i10 + 1;
        int i13 = i11 + 1;
        return b10 + (f15 * f12 * iVar.b(i12, i11)) + (f12 * f13 * iVar.b(i12, i13)) + (f14 * f13 * iVar.b(i10, i13));
    }

    public float f(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        float f12 = f10 - i10;
        float f13 = f11 - i11;
        T t10 = this.f180b;
        int i12 = ((c4.a) t10).f6218c;
        int i13 = this.f181c;
        int i14 = i12 + (i11 * i13) + i10;
        float[] fArr = ((c4.a) t10).V3;
        float f14 = 1.0f - f12;
        float f15 = 1.0f - f13;
        int i15 = i14 + 1;
        return (f14 * f15 * fArr[i14]) + (f15 * f12 * fArr[i15]) + (f12 * f13 * fArr[i15 + i13]) + (f14 * f13 * fArr[i14 + i13]);
    }
}
