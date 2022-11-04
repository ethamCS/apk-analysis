package r6;

import h6.c;
import h6.e;
import h6.m;
import h6.o;
import h6.q;
import h6.r;
import h6.s;
import java.util.List;
import java.util.Map;
import o6.g;
import s6.d;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: b */
    private static final s[] f20485b = new s[0];

    /* renamed from: a */
    private final d f20486a = new d();

    private static o6.b c(o6.b bVar) {
        int[] k10 = bVar.k();
        int[] g10 = bVar.g();
        if (k10 == null || g10 == null) {
            throw m.b();
        }
        int d10 = d(k10, bVar);
        int i10 = k10[1];
        int i11 = g10[1];
        int i12 = k10[0];
        int i13 = ((g10[0] - i12) + 1) / d10;
        int i14 = ((i11 - i10) + 1) / d10;
        if (i13 <= 0 || i14 <= 0) {
            throw m.b();
        }
        int i15 = d10 / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        o6.b bVar2 = new o6.b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * d10) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (bVar.f((i20 * d10) + i17, i19)) {
                    bVar2.o(i20, i18);
                }
            }
        }
        return bVar2;
    }

    private static int d(int[] iArr, o6.b bVar) {
        int l10 = bVar.l();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < l10 && bVar.f(i10, i11)) {
            i10++;
        }
        if (i10 != l10) {
            int i12 = i10 - iArr[0];
            if (i12 == 0) {
                throw m.b();
            }
            return i12;
        }
        throw m.b();
    }

    @Override // h6.o
    public q a(c cVar) {
        return b(cVar, null);
    }

    @Override // h6.o
    public q b(c cVar, Map<e, ?> map) {
        s[] sVarArr;
        o6.e eVar;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g b10 = new t6.a(cVar.a()).b();
            o6.e b11 = this.f20486a.b(b10.a());
            sVarArr = b10.b();
            eVar = b11;
        } else {
            eVar = this.f20486a.b(c(cVar.a()));
            sVarArr = f20485b;
        }
        q qVar = new q(eVar.h(), eVar.e(), sVarArr, h6.a.DATA_MATRIX);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            qVar.h(r.BYTE_SEGMENTS, a10);
        }
        String b12 = eVar.b();
        if (b12 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b12);
        }
        return qVar;
    }

    @Override // h6.o
    public void reset() {
    }
}
