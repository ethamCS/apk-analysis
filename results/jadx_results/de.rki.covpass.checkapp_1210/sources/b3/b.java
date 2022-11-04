package b3;
/* loaded from: classes.dex */
public class b extends a3.a<c4.b> {
    @Override // a3.d
    public float b(float f10, float f11) {
        return (f10 < 0.0f || f11 < 0.0f || f10 > ((float) (this.f182d + (-2))) || f11 > ((float) (this.f183e + (-2)))) ? e(f10, f11) : f(f10, f11);
    }

    public float e(float f10, float f11) {
        double d10 = f10;
        double floor = Math.floor(d10);
        double d11 = f11;
        double floor2 = Math.floor(d11);
        int i10 = (int) floor;
        int i11 = (int) floor2;
        double d12 = d10 - floor;
        double d13 = d11 - floor2;
        y3.j jVar = (y3.j) this.f179a;
        double d14 = 1.0d - d12;
        double d15 = 1.0d - d13;
        double b10 = d14 * d15 * jVar.b(i10, i11);
        int i12 = i10 + 1;
        int i13 = i11 + 1;
        return (float) (b10 + (d15 * d12 * jVar.b(i12, i11)) + (d12 * d13 * jVar.b(i12, i13)) + (d14 * d13 * jVar.b(i10, i13)));
    }

    public float f(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        double d10 = f10 - i10;
        double d11 = f11 - i11;
        T t10 = this.f180b;
        int i12 = ((c4.b) t10).f6218c;
        int i13 = this.f181c;
        int i14 = i12 + (i11 * i13) + i10;
        double[] dArr = ((c4.b) t10).V3;
        double d12 = 1.0d - d10;
        double d13 = 1.0d - d11;
        int i15 = i14 + 1;
        return (float) ((d12 * d13 * dArr[i14]) + (d13 * d10 * dArr[i15]) + (d10 * d11 * dArr[i15 + i13]) + (d12 * d11 * dArr[i14 + i13]));
    }
}
