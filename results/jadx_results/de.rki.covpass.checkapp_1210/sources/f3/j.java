package f3;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private final List<ka.c> f9786a = new ArrayList();

    /* renamed from: b */
    private final ja.d f9787b = new ja.d();

    /* renamed from: c */
    private final ok.b<ja.b> f9788c = new ok.b<>(i.f9785a);

    public void a(List<ka.c> list, ok.g gVar, la.a aVar) {
        int i10;
        int i11;
        int i12 = gVar.f18610b - 1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i10 = gVar.f18610b;
            if (i13 >= i10) {
                break;
            }
            if (gVar.d(i12) > gVar.d(i13)) {
                i14++;
            }
            i12 = i13;
            i13++;
        }
        boolean z10 = i14 > 1;
        aVar.f15915c.s(i10);
        this.f9788c.s(gVar.f18610b);
        int i15 = gVar.f18610b - 1;
        int i16 = 0;
        while (true) {
            i11 = gVar.f18610b;
            if (i16 >= i11) {
                break;
            }
            int d10 = gVar.d(i15);
            int d11 = gVar.d(i16);
            if (z10) {
                d11 = d10;
                d10 = d11;
            }
            if (d10 > d11) {
                this.f9786a.clear();
                while (d10 < list.size()) {
                    this.f9786a.add(list.get(d10));
                    d10++;
                }
                for (int i17 = 0; i17 < d11; i17++) {
                    this.f9786a.add(list.get(i17));
                }
                List<ka.c> list2 = this.f9786a;
                ca.b.a(list2, 0, list2.size(), this.f9787b);
            } else {
                ca.b.a(list, d10, d11 - d10, this.f9787b);
            }
            da.c.a(this.f9787b, this.f9788c.c(i15));
            i15 = i16;
            i16++;
        }
        int i18 = i11 - 1;
        for (int i19 = 0; i19 < gVar.f18610b; i19++) {
            ea.d.a(this.f9788c.c(i18), this.f9788c.c(i19), aVar.b(i19));
            i18 = i19;
        }
    }
}
