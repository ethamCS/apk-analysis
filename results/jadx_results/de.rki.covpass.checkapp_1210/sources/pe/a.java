package pe;

import oe.d1;
import pe.f;
import pe.g;
/* loaded from: classes3.dex */
public final class a {
    public static final d1 a(boolean z10, boolean z11, b bVar, f fVar, g gVar) {
        hc.t.e(bVar, "typeSystemContext");
        hc.t.e(fVar, "kotlinTypePreparator");
        hc.t.e(gVar, "kotlinTypeRefiner");
        return new d1(z10, z11, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ d1 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = q.f19172a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f19147a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f19148a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
