package p2;

import ik.b;
import java.util.List;
import o2.e;
/* loaded from: classes.dex */
public class z {

    /* renamed from: c */
    private final ik.b<o2.e> f18873c;

    /* renamed from: d */
    private final b.a<o2.e> f18874d;

    /* renamed from: a */
    int f18871a = 40;

    /* renamed from: b */
    o2.d f18872b = new o2.d();

    /* renamed from: e */
    private final ok.b<ik.c<o2.e>> f18875e = new ok.b<>(y.f18870a);

    /* renamed from: f */
    protected ja.e f18876f = new ja.e();

    /* renamed from: g */
    protected ja.e f18877g = new ja.e();

    /* renamed from: h */
    protected ja.e f18878h = new ja.e();

    /* renamed from: i */
    protected ka.b f18879i = new ka.b();

    public z() {
        ik.b<o2.e> a10 = ik.a.a(new e.a());
        this.f18873c = a10;
        this.f18874d = a10.b();
    }

    void a(o2.e eVar, o2.e eVar2) {
        ja.e eVar3 = this.f18876f;
        eVar3.f14240c = eVar.f17354c;
        eVar3.f14241d = eVar2.f17354c;
        int h10 = this.f18872b.h(eVar, eVar3, this.f18879i, this.f18877g);
        this.f18878h.f14240c.k(this.f18879i);
        int h11 = this.f18872b.h(eVar2, this.f18876f, this.f18879i, this.f18877g);
        this.f18878h.f14241d.k(this.f18879i);
        if (h11 < 0 || h10 < 0) {
            return;
        }
        double d10 = eVar.f17355d[h10];
        double d11 = eVar2.f17355d[h11];
        double c10 = this.f18878h.f14241d.c(eVar2.f17352a.b(h11)) / d11;
        if (Math.abs((this.f18878h.f14240c.c(eVar.f17352a.b(h10)) / d10) - 0.5d) > 0.35d || Math.abs(c10 - 0.5d) > 0.35d || Math.abs(d10 - d11) / Math.max(d10, d11) > 0.25d || !this.f18872b.c(eVar, h10, eVar2, h11) || Math.max(eVar.f17357f / eVar2.f17356e, eVar2.f17357f / eVar.f17356e) > 1.3d) {
            return;
        }
        o2.d dVar = this.f18872b;
        dVar.d(eVar, h10, eVar2, h11, ((this.f18872b.a(eVar, h10, eVar2, h11) / 0.1d) + 1.0d) * this.f18876f.b());
    }

    public void b(List<e> list) {
        this.f18872b.j();
        this.f18873c.a(list, false);
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            double d10 = ((eVar.f17356e * (((this.f18871a * 4) + 17) - 7.0d)) / 7.0d) * 1.2d;
            this.f18874d.a(eVar, d10 * d10, Integer.MAX_VALUE, this.f18875e);
            if (this.f18875e.f18623d > 1) {
                int i11 = 0;
                while (true) {
                    ok.b<ik.c<o2.e>> bVar = this.f18875e;
                    if (i11 < bVar.f18623d) {
                        o2.e eVar2 = bVar.c(i11).f12725a;
                        if (eVar2 != eVar) {
                            a(eVar, eVar2);
                        }
                        i11++;
                    }
                }
            }
        }
    }

    public void c(int i10) {
        this.f18871a = i10;
    }
}
