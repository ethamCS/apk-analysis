package g7;

import h6.g;
import h6.u;
import j7.c;
import j7.f;
import java.util.Map;
/* loaded from: classes.dex */
public final class b implements u {
    private static o6.b b(f fVar, int i10, int i11, int i12) {
        j7.b a10 = fVar.a();
        if (a10 != null) {
            int e10 = a10.e();
            int d10 = a10.d();
            int i13 = i12 << 1;
            int i14 = e10 + i13;
            int i15 = i13 + d10;
            int max = Math.max(i10, i14);
            int max2 = Math.max(i11, i15);
            int min = Math.min(max / i14, max2 / i15);
            int i16 = (max - (e10 * min)) / 2;
            int i17 = (max2 - (d10 * min)) / 2;
            o6.b bVar = new o6.b(max, max2);
            int i18 = 0;
            while (i18 < d10) {
                int i19 = 0;
                int i20 = i16;
                while (i19 < e10) {
                    if (a10.b(i19, i18) == 1) {
                        bVar.p(i20, i17, min, min);
                    }
                    i19++;
                    i20 += min;
                }
                i18++;
                i17 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<g, ?> map) {
        if (!str.isEmpty()) {
            if (aVar != h6.a.QR_CODE) {
                throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
            }
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
            }
            h7.f fVar = h7.f.L;
            int i12 = 4;
            if (map != null) {
                g gVar = g.ERROR_CORRECTION;
                if (map.containsKey(gVar)) {
                    fVar = h7.f.valueOf(map.get(gVar).toString());
                }
                g gVar2 = g.MARGIN;
                if (map.containsKey(gVar2)) {
                    i12 = Integer.parseInt(map.get(gVar2).toString());
                }
            }
            return b(c.n(str, fVar, map), i10, i11, i12);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
