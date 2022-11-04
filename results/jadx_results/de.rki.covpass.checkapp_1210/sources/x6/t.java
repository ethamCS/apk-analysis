package x6;

import java.util.Map;
/* loaded from: classes.dex */
public final class t extends y {

    /* renamed from: i */
    private final y f25436i = new i();

    private static h6.q s(h6.q qVar) {
        String f10 = qVar.f();
        if (f10.charAt(0) == '0') {
            h6.q qVar2 = new h6.q(f10.substring(1), null, qVar.e(), h6.a.UPC_A);
            if (qVar.d() != null) {
                qVar2.g(qVar.d());
            }
            return qVar2;
        }
        throw h6.h.b();
    }

    @Override // x6.r, h6.o
    public h6.q a(h6.c cVar) {
        return s(this.f25436i.a(cVar));
    }

    @Override // x6.r, h6.o
    public h6.q b(h6.c cVar, Map<h6.e, ?> map) {
        return s(this.f25436i.b(cVar, map));
    }

    @Override // x6.y, x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        return s(this.f25436i.c(i10, aVar, map));
    }

    @Override // x6.y
    public int l(o6.a aVar, int[] iArr, StringBuilder sb2) {
        return this.f25436i.l(aVar, iArr, sb2);
    }

    @Override // x6.y
    public h6.q m(int i10, o6.a aVar, int[] iArr, Map<h6.e, ?> map) {
        return s(this.f25436i.m(i10, aVar, iArr, map));
    }

    @Override // x6.y
    h6.a q() {
        return h6.a.UPC_A;
    }
}
