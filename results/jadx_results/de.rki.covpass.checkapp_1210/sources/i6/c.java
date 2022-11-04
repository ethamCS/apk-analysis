package i6;

import h6.g;
import h6.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
/* loaded from: classes.dex */
public final class c implements u {
    private static o6.b b(String str, h6.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == h6.a.AZTEC) {
            return c(l6.c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static o6.b c(l6.a aVar, int i10, int i11) {
        o6.b a10 = aVar.a();
        if (a10 != null) {
            int l10 = a10.l();
            int i12 = a10.i();
            int max = Math.max(i10, l10);
            int max2 = Math.max(i11, i12);
            int min = Math.min(max / l10, max2 / i12);
            int i13 = (max - (l10 * min)) / 2;
            int i14 = (max2 - (i12 * min)) / 2;
            o6.b bVar = new o6.b(max, max2);
            int i15 = 0;
            while (i15 < i12) {
                int i16 = 0;
                int i17 = i13;
                while (i16 < l10) {
                    if (a10.f(i16, i15)) {
                        bVar.p(i17, i14, min, min);
                    }
                    i16++;
                    i17 += min;
                }
                i15++;
                i14 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<g, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            g gVar = g.CHARACTER_SET;
            if (map.containsKey(gVar)) {
                charset = Charset.forName(map.get(gVar).toString());
            }
            g gVar2 = g.ERROR_CORRECTION;
            if (map.containsKey(gVar2)) {
                i12 = Integer.parseInt(map.get(gVar2).toString());
            }
            g gVar3 = g.AZTEC_LAYERS;
            if (map.containsKey(gVar3)) {
                i13 = Integer.parseInt(map.get(gVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, charset, i12, i13);
    }
}
