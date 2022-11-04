package o4;

import p4.c;
/* loaded from: classes.dex */
class e {

    /* renamed from: a */
    private static final c.a f17489a = c.a.a("ef");

    /* renamed from: b */
    private static final c.a f17490b = c.a.a("ty", "v");

    private static l4.a a(p4.c cVar, e4.h hVar) {
        cVar.f();
        l4.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.j()) {
                int M = cVar.M(f17490b);
                if (M != 0) {
                    if (M != 1) {
                        cVar.V();
                    } else if (z10) {
                        aVar = new l4.a(d.e(cVar, hVar));
                    }
                    cVar.W();
                } else if (cVar.r() == 0) {
                    z10 = true;
                }
            }
            cVar.i();
            return aVar;
        }
    }

    public static l4.a b(p4.c cVar, e4.h hVar) {
        l4.a aVar = null;
        while (cVar.j()) {
            if (cVar.M(f17489a) != 0) {
                cVar.V();
                cVar.W();
            } else {
                cVar.e();
                while (cVar.j()) {
                    l4.a a10 = a(cVar, hVar);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.h();
            }
        }
        return aVar;
    }
}
