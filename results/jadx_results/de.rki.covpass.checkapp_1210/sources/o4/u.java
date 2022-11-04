package o4;

import java.util.ArrayList;
import java.util.List;
import p4.c;
/* loaded from: classes.dex */
class u {

    /* renamed from: a */
    static c.a f17536a = c.a.a("k");

    public static <T> List<r4.a<T>> a(p4.c cVar, e4.h hVar, float f10, n0<T> n0Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (cVar.B() == c.b.STRING) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.f();
        while (cVar.j()) {
            if (cVar.M(f17536a) != 0) {
                cVar.W();
            } else if (cVar.B() == c.b.BEGIN_ARRAY) {
                cVar.e();
                if (cVar.B() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, hVar, f10, n0Var, false, z10));
                } else {
                    while (cVar.j()) {
                        arrayList.add(t.c(cVar, hVar, f10, n0Var, true, z10));
                    }
                }
                cVar.h();
            } else {
                arrayList.add(t.c(cVar, hVar, f10, n0Var, false, z10));
            }
        }
        cVar.i();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends r4.a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            r4.a<T> aVar = list.get(i11);
            i11++;
            r4.a<T> aVar2 = list.get(i11);
            aVar.f20449h = Float.valueOf(aVar2.f20448g);
            if (aVar.f20444c == null && (t10 = aVar2.f20443b) != null) {
                aVar.f20444c = t10;
                if (aVar instanceof h4.i) {
                    ((h4.i) aVar).i();
                }
            }
        }
        r4.a<T> aVar3 = list.get(i10);
        if ((aVar3.f20443b == null || aVar3.f20444c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
