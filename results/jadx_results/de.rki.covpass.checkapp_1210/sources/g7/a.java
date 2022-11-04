package g7;

import h6.c;
import h6.m;
import h6.o;
import h6.q;
import h6.r;
import h6.s;
import h7.e;
import h7.i;
import java.util.List;
import java.util.Map;
import o6.g;
/* loaded from: classes.dex */
public class a implements o {

    /* renamed from: b */
    private static final s[] f10607b = new s[0];

    /* renamed from: a */
    private final e f10608a = new e();

    private static o6.b c(o6.b bVar) {
        int[] k10 = bVar.k();
        int[] g10 = bVar.g();
        if (k10 == null || g10 == null) {
            throw m.b();
        }
        float d10 = d(k10, bVar);
        int i10 = k10[1];
        int i11 = g10[1];
        int i12 = k10[0];
        int i13 = g10[0];
        if (i12 >= i13 || i10 >= i11) {
            throw m.b();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= bVar.l()) {
            throw m.b();
        }
        int round = Math.round(((i13 - i12) + 1) / d10);
        int round2 = Math.round((i14 + 1) / d10);
        if (round <= 0 || round2 <= 0) {
            throw m.b();
        }
        if (round2 != round) {
            throw m.b();
        }
        int i15 = (int) (d10 / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((round - 1) * d10)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw m.b();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((round2 - 1) * d10)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw m.b();
            }
            i16 -= i19;
        }
        o6.b bVar2 = new o6.b(round, round2);
        for (int i20 = 0; i20 < round2; i20++) {
            int i21 = ((int) (i20 * d10)) + i16;
            for (int i22 = 0; i22 < round; i22++) {
                if (bVar.f(((int) (i22 * d10)) + i17, i21)) {
                    bVar2.o(i22, i20);
                }
            }
        }
        return bVar2;
    }

    private static float d(int[] iArr, o6.b bVar) {
        int i10 = bVar.i();
        int l10 = bVar.l();
        int i11 = iArr[0];
        boolean z10 = true;
        int i12 = iArr[1];
        int i13 = 0;
        while (i11 < l10 && i12 < i10) {
            if (z10 != bVar.f(i11, i12)) {
                i13++;
                if (i13 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i11++;
            i12++;
        }
        if (i11 == l10 || i12 == i10) {
            throw m.b();
        }
        return (i11 - iArr[0]) / 7.0f;
    }

    @Override // h6.o
    public q a(c cVar) {
        return b(cVar, null);
    }

    @Override // h6.o
    public final q b(c cVar, Map<h6.e, ?> map) {
        s[] sVarArr;
        o6.e eVar;
        if (map == null || !map.containsKey(h6.e.PURE_BARCODE)) {
            g e10 = new i7.c(cVar.a()).e(map);
            o6.e c10 = this.f10608a.c(e10.a(), map);
            sVarArr = e10.b();
            eVar = c10;
        } else {
            eVar = this.f10608a.c(c(cVar.a()), map);
            sVarArr = f10607b;
        }
        if (eVar.d() instanceof i) {
            ((i) eVar.d()).a(sVarArr);
        }
        q qVar = new q(eVar.h(), eVar.e(), sVarArr, h6.a.QR_CODE);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            qVar.h(r.BYTE_SEGMENTS, a10);
        }
        String b10 = eVar.b();
        if (b10 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b10);
        }
        if (eVar.i()) {
            qVar.h(r.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.g()));
            qVar.h(r.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.f()));
        }
        return qVar;
    }

    @Override // h6.o
    public void reset() {
    }
}
