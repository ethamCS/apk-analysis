package ca;

import ja.d;
import java.util.List;
/* loaded from: classes.dex */
public class a {
    public static d a(List<ka.b> list, d dVar) {
        d dVar2 = dVar == null ? new d() : dVar;
        int size = list.size();
        int i10 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        for (int i11 = 0; i11 < size; i11++) {
            ka.b bVar = list.get(i11);
            d11 += bVar.f10622c;
            d12 += bVar.f10623d;
        }
        double d13 = size;
        double d14 = d11 / d13;
        double d15 = d12 / d13;
        double d16 = 0.0d;
        while (i10 < size) {
            ka.b bVar2 = list.get(i10);
            double d17 = d14 - bVar2.f10622c;
            double d18 = d15 - bVar2.f10623d;
            d10 += d17 * d18;
            d16 += (d18 * d18) - (d17 * d17);
            i10++;
            d14 = d14;
        }
        double atan2 = Math.atan2(d10 * (-2.0d), d16) / 2.0d;
        dVar2.f14239d = atan2;
        dVar2.f14238c = (d14 * Math.cos(atan2)) + (d15 * Math.sin(dVar2.f14239d));
        return dVar2;
    }

    public static d b(List<ka.b> list, double[] dArr, d dVar) {
        List<ka.b> list2 = list;
        int size = list.size();
        double d10 = 0.0d;
        for (int i10 = 0; i10 < size; i10++) {
            d10 += dArr[i10];
        }
        if (d10 == 0.0d) {
            return null;
        }
        d dVar2 = dVar == null ? new d() : dVar;
        double d11 = 0.0d;
        double d12 = 0.0d;
        for (int i11 = 0; i11 < size; i11++) {
            ka.b bVar = list2.get(i11);
            double d13 = dArr[i11];
            d11 += bVar.f10622c * d13;
            d12 += d13 * bVar.f10623d;
        }
        double d14 = d11 / d10;
        double d15 = d12 / d10;
        int i12 = 0;
        double d16 = 0.0d;
        double d17 = 0.0d;
        while (i12 < size) {
            ka.b bVar2 = list2.get(i12);
            double d18 = dArr[i12];
            double d19 = d14 - bVar2.f10622c;
            double d20 = d15 - bVar2.f10623d;
            d16 += d18 * d19 * d20;
            d17 += d18 * ((d20 * d20) - (d19 * d19));
            i12++;
            list2 = list;
            size = size;
            d14 = d14;
        }
        double atan2 = Math.atan2((d16 / d10) * (-2.0d), d17 / d10) / 2.0d;
        dVar2.f14239d = atan2;
        dVar2.f14238c = (d14 * Math.cos(atan2)) + (d15 * Math.sin(dVar2.f14239d));
        return dVar2;
    }
}
