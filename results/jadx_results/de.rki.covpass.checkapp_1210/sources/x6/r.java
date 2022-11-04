package x6;

import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class r implements h6.o {
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c A[Catch: p -> 0x00cc, TRY_LEAVE, TryCatch #5 {p -> 0x00cc, blocks: (B:38:0x0076, B:40:0x007c), top: B:74:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private h6.q d(h6.c r22, java.util.Map<h6.e, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.r.d(h6.c, java.util.Map):h6.q");
    }

    public static float e(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void f(o6.a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int l10 = aVar.l();
        if (i10 < l10) {
            boolean z10 = !aVar.h(i10);
            while (i10 < l10) {
                if (aVar.h(i10) == z10) {
                    i11++;
                    if (i11 == length) {
                        break;
                    }
                    iArr[i11] = 1;
                    z10 = !z10;
                } else {
                    iArr[i11] = iArr[i11] + 1;
                }
                i10++;
            }
            if (i11 == length) {
                return;
            }
            if (i11 != length - 1 || i10 != l10) {
                throw h6.m.b();
            }
            return;
        }
        throw h6.m.b();
    }

    public static void g(o6.a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        boolean h10 = aVar.h(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.h(i10) != h10) {
                length--;
                h10 = !h10;
            }
        }
        if (length < 0) {
            f(aVar, i10 + 1, iArr);
            return;
        }
        throw h6.m.b();
    }

    @Override // h6.o
    public h6.q a(h6.c cVar) {
        return b(cVar, null);
    }

    @Override // h6.o
    public h6.q b(h6.c cVar, Map<h6.e, ?> map) {
        try {
            return d(cVar, map);
        } catch (h6.m e10) {
            if (!(map != null && map.containsKey(h6.e.TRY_HARDER)) || !cVar.e()) {
                throw e10;
            }
            h6.c f10 = cVar.f();
            h6.q d10 = d(f10, map);
            Map<h6.r, Object> d11 = d10.d();
            int i10 = 270;
            if (d11 != null) {
                h6.r rVar = h6.r.ORIENTATION;
                if (d11.containsKey(rVar)) {
                    i10 = (((Integer) d11.get(rVar)).intValue() + 270) % 360;
                }
            }
            d10.h(h6.r.ORIENTATION, Integer.valueOf(i10));
            h6.s[] e11 = d10.e();
            if (e11 != null) {
                int c10 = f10.c();
                for (int i11 = 0; i11 < e11.length; i11++) {
                    e11[i11] = new h6.s((c10 - e11[i11].d()) - 1.0f, e11[i11].c());
                }
            }
            return d10;
        }
    }

    public abstract h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map);

    @Override // h6.o
    public void reset() {
    }
}
