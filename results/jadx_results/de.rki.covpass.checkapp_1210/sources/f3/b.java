package f3;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final ok.b<ja.e> f9727a = new ok.b<>(a.f9726a);

    /* renamed from: b */
    private final ja.b f9728b = new ja.b();

    /* renamed from: c */
    private final ja.b f9729c = new ja.b();

    /* renamed from: d */
    private final ka.b f9730d = new ka.b();

    public void a(la.a aVar, boolean z10) {
        int i10;
        int i11;
        int f10 = aVar.f();
        this.f9727a.s(f10);
        int i12 = f10 - 1;
        int i13 = i12;
        int i14 = 0;
        while (i14 < f10) {
            if (z10) {
                i11 = i14;
            } else {
                i11 = i13;
                i13 = i14;
            }
            ka.b b10 = aVar.b(i13);
            ka.b b11 = aVar.b(i11);
            double d10 = b11.f10622c - b10.f10622c;
            double d11 = b11.f10623d - b10.f10623d;
            double sqrt = Math.sqrt((d10 * d10) + (d11 * d11));
            if (sqrt == 0.0d) {
                throw new RuntimeException("Two identical corners!");
            }
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            if (d11 > 0.0d) {
                d11 = 0.0d;
            }
            ja.e c10 = this.f9727a.c(i13);
            ka.b bVar = c10.f14240c;
            int i15 = i14;
            double d12 = d11 / sqrt;
            bVar.f10622c = b10.f10622c - d12;
            double d13 = d10 / sqrt;
            bVar.f10623d = b10.f10623d + d13;
            ka.b bVar2 = c10.f14241d;
            bVar2.f10622c = b11.f10622c - d12;
            bVar2.f10623d = b11.f10623d + d13;
            i14 = i15 + 1;
            i13 = i15;
        }
        int i16 = i12;
        for (int i17 = 0; i17 < f10; i17++) {
            if (z10) {
                i10 = i17;
            } else {
                i10 = i16;
                i16 = i17;
            }
            da.c.b(this.f9727a.c(i16), this.f9728b);
            da.c.b(this.f9727a.c(i10), this.f9729c);
            if (ea.d.a(this.f9728b, this.f9729c, this.f9730d) != null && this.f9730d.f(aVar.b(i10)) < 20.0d) {
                aVar.b(i10).k(this.f9730d);
            }
            i16 = i17;
        }
        da.f.b(aVar, 1.0E-8d);
    }
}
