package v6;

import h6.e;
import h6.m;
import h6.o;
import h6.q;
import h6.r;
import h6.s;
import java.util.Map;
import o6.b;
import w6.c;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: b */
    private static final s[] f23911b = new s[0];

    /* renamed from: a */
    private final c f23912a = new c();

    private static b c(b bVar) {
        int[] h10 = bVar.h();
        if (h10 != null) {
            int i10 = h10[0];
            int i11 = h10[1];
            int i12 = h10[2];
            int i13 = h10[3];
            b bVar2 = new b(30, 33);
            for (int i14 = 0; i14 < 33; i14++) {
                int i15 = (((i14 * i13) + (i13 / 2)) / 33) + i11;
                for (int i16 = 0; i16 < 30; i16++) {
                    if (bVar.f(((((i16 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30) + i10, i15)) {
                        bVar2.o(i16, i14);
                    }
                }
            }
            return bVar2;
        }
        throw m.b();
    }

    @Override // h6.o
    public q a(h6.c cVar) {
        return b(cVar, null);
    }

    @Override // h6.o
    public q b(h6.c cVar, Map<e, ?> map) {
        o6.e b10 = this.f23912a.b(c(cVar.a()), map);
        q qVar = new q(b10.h(), b10.e(), f23911b, h6.a.MAXICODE);
        String b11 = b10.b();
        if (b11 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b11);
        }
        return qVar;
    }

    @Override // h6.o
    public void reset() {
    }
}
