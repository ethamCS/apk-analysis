package q2;
/* loaded from: classes.dex */
public class w implements h2.h<c4.a> {

    /* renamed from: a */
    float f19594a;

    /* renamed from: b */
    x3.b f19595b;

    /* renamed from: c */
    boolean f19596c;

    /* renamed from: d */
    c4.a f19597d = new c4.a(1, 1);

    /* renamed from: e */
    c4.a f19598e = new c4.a(1, 1);

    /* renamed from: f */
    c4.a f19599f = new c4.a(1, 1);

    /* renamed from: g */
    c4.a f19600g = new c4.a(1, 1);

    /* renamed from: h */
    ll.d<ok.e> f19601h = new ll.d<>(m3.e.f16263a);

    public w(x3.b bVar, float f10, boolean z10) {
        this.f19594a = f10;
        this.f19595b = bVar;
        this.f19596c = z10;
    }

    /* renamed from: b */
    public void a(c4.a aVar, c4.l lVar) {
        lVar.U(aVar.f6220q, aVar.f6221x);
        this.f19597d.U(aVar.f6220q, aVar.f6221x);
        this.f19598e.U(aVar.f6220q, aVar.f6221x);
        this.f19599f.U(aVar.f6220q, aVar.f6221x);
        this.f19600g.U(aVar.f6220q, aVar.f6221x);
        this.f19597d.U(aVar.f6220q, aVar.f6221x);
        int e10 = this.f19595b.e(Math.min(aVar.f6220q, aVar.f6221x)) / 2;
        int i10 = (e10 * 2) + 1;
        float f10 = i10 * i10;
        s2.b.h(aVar, this.f19598e, e10, this.f19600g, this.f19601h);
        c3.f.a(aVar, this.f19597d);
        s2.b.h(this.f19597d, this.f19599f, e10, this.f19600g, this.f19601h);
        if (this.f19596c) {
            for (int i11 = 0; i11 < aVar.f6221x; i11++) {
                int i12 = this.f19599f.f6220q * i11;
                int i13 = aVar.f6218c + (aVar.f6219d * i11);
                int i14 = lVar.f6218c + (lVar.f6219d * i11);
                int i15 = 0;
                while (i15 < aVar.f6220q) {
                    float f11 = this.f19598e.V3[i12];
                    int i16 = i14 + 1;
                    int i17 = i13 + 1;
                    lVar.V3[i14] = (byte) (aVar.V3[i13] <= f11 + (this.f19594a * ((float) Math.sqrt((double) (this.f19599f.V3[i12] - ((f11 * f11) / f10))))) ? 1 : 0);
                    i15++;
                    i12++;
                    i14 = i16;
                    i13 = i17;
                }
            }
            return;
        }
        for (int i18 = 0; i18 < aVar.f6221x; i18++) {
            int i19 = this.f19599f.f6220q * i18;
            int i20 = aVar.f6218c + (aVar.f6219d * i18);
            int i21 = lVar.f6218c + (lVar.f6219d * i18);
            int i22 = 0;
            while (i22 < aVar.f6220q) {
                float f12 = this.f19598e.V3[i19];
                int i23 = i21 + 1;
                int i24 = i20 + 1;
                lVar.V3[i21] = (byte) (aVar.V3[i20] >= f12 + (this.f19594a * ((float) Math.sqrt((double) (this.f19599f.V3[i19] - ((f12 * f12) / f10))))) ? 1 : 0);
                i22++;
                i19++;
                i21 = i23;
                i20 = i24;
            }
        }
    }

    @Override // h2.h
    public c4.t<c4.a> getInputType() {
        return c4.t.Y3;
    }
}
