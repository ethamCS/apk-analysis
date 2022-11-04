package ca;

import ja.d;
import java.util.List;
import ka.c;
/* loaded from: classes.dex */
public class b {
    public static d a(List<c> list, int i10, int i11, d dVar) {
        List<c> list2 = list;
        int i12 = i11;
        d dVar2 = dVar == null ? new d() : dVar;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            c cVar = list2.get(i10 + i16);
            i14 += cVar.f14865c;
            i15 += cVar.f14866d;
        }
        double d10 = i12;
        double d11 = i14 / d10;
        double d12 = i15 / d10;
        double d13 = 0.0d;
        double d14 = 0.0d;
        while (i13 < i12) {
            c cVar2 = list2.get(i10 + i13);
            double d15 = d11 - cVar2.f14865c;
            double d16 = d12 - cVar2.f14866d;
            d13 += d15 * d16;
            d14 += (d16 * d16) - (d15 * d15);
            i13++;
            list2 = list;
            i12 = i11;
        }
        double atan2 = Math.atan2(d13 * (-2.0d), d14) / 2.0d;
        dVar2.f14239d = atan2;
        dVar2.f14238c = (d11 * Math.cos(atan2)) + (d12 * Math.sin(dVar2.f14239d));
        return dVar2;
    }
}
