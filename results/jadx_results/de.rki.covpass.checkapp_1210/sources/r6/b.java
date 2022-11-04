package r6;

import h6.f;
import h6.g;
import h6.u;
import java.util.Map;
import u6.e;
import u6.i;
import u6.j;
import u6.k;
import u6.l;
/* loaded from: classes.dex */
public final class b implements u {
    private static o6.b b(j7.b bVar, int i10, int i11) {
        o6.b bVar2;
        int e10 = bVar.e();
        int d10 = bVar.d();
        int max = Math.max(i10, e10);
        int max2 = Math.max(i11, d10);
        int min = Math.min(max / e10, max2 / d10);
        int i12 = (max - (e10 * min)) / 2;
        int i13 = (max2 - (d10 * min)) / 2;
        if (i11 < d10 || i10 < e10) {
            bVar2 = new o6.b(e10, d10);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new o6.b(i10, i11);
        }
        bVar2.c();
        int i14 = 0;
        while (i14 < d10) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < e10) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.p(i15, i13, min, min);
                }
                i16++;
                i15 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar2;
    }

    private static o6.b c(e eVar, k kVar, int i10, int i11) {
        int h10 = kVar.h();
        int g10 = kVar.g();
        j7.b bVar = new j7.b(kVar.j(), kVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < g10; i13++) {
            if (i13 % kVar.f23155e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < kVar.j(); i15++) {
                    bVar.g(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < h10; i17++) {
                if (i17 % kVar.f23154d == 0) {
                    bVar.g(i16, i12, true);
                    i16++;
                }
                bVar.g(i16, i12, eVar.e(i17, i13));
                i16++;
                int i18 = kVar.f23154d;
                if (i17 % i18 == i18 - 1) {
                    bVar.g(i16, i12, i13 % 2 == 0);
                    i16++;
                }
            }
            i12++;
            int i19 = kVar.f23155e;
            if (i13 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < kVar.j(); i21++) {
                    bVar.g(i20, i12, true);
                    i20++;
                }
                i12++;
            }
        }
        return b(bVar, i10, i11);
    }

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<g, ?> map) {
        f fVar;
        if (!str.isEmpty()) {
            if (aVar != h6.a.DATA_MATRIX) {
                throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
            }
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
            }
            l lVar = l.FORCE_NONE;
            f fVar2 = null;
            if (map != null) {
                l lVar2 = (l) map.get(g.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                f fVar3 = (f) map.get(g.MIN_SIZE);
                if (fVar3 == null) {
                    fVar3 = null;
                }
                fVar = (f) map.get(g.MAX_SIZE);
                if (fVar == null) {
                    fVar = null;
                }
                fVar2 = fVar3;
            } else {
                fVar = null;
            }
            String b10 = j.b(str, lVar, fVar2, fVar);
            k l10 = k.l(b10.length(), lVar, fVar2, fVar, true);
            e eVar = new e(i.b(b10, l10), l10.h(), l10.g());
            eVar.h();
            return c(eVar, l10, i10, i11);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
