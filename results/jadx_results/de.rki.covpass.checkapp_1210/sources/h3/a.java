package h3;

import h3.d;
import java.util.List;
/* loaded from: classes.dex */
public class a implements h {

    /* renamed from: a */
    ja.c f11199a = new ja.c();

    @Override // h3.h
    public int a(double d10, double d11) {
        if (d10 > d11) {
            return 1;
        }
        return d10 < d11 ? -1 : 0;
    }

    @Override // h3.h
    public void b(List<ka.c> list, int i10, int i11, d.C0166d c0166d) {
        d.b(list, i10, i11, this.f11199a);
        c0166d.f11234a = i10;
        c0166d.f11235b = -1.0d;
        if (i11 >= i10) {
            for (int i12 = i10 + 1; i12 < i11; i12++) {
                ka.c cVar = list.get(i12);
                double a10 = ea.c.a(this.f11199a, cVar.f14865c, cVar.f14866d);
                if (a10 > c0166d.f11235b) {
                    c0166d.f11235b = a10;
                    c0166d.f11234a = i12;
                }
            }
            return;
        }
        int size = (list.size() - i10) + i11;
        for (int i13 = 1; i13 < size; i13++) {
            int size2 = (i10 + i13) % list.size();
            ka.c cVar2 = list.get(size2);
            double a11 = ea.c.a(this.f11199a, cVar2.f14865c, cVar2.f14866d);
            if (a11 > c0166d.f11235b) {
                c0166d.f11235b = a11;
                c0166d.f11234a = size2;
            }
        }
    }
}
