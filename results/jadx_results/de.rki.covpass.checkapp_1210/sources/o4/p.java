package o4;

import android.graphics.Path;
import java.util.Collections;
import p4.c;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private static final c.a f17524a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final c.a f17525b = c.a.a("p", "k");

    public static l4.e a(p4.c cVar, e4.h hVar) {
        k4.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        l4.g gVar = null;
        k4.c cVar2 = null;
        k4.f fVar = null;
        k4.f fVar2 = null;
        boolean z10 = false;
        while (cVar.j()) {
            switch (cVar.M(f17524a)) {
                case 0:
                    str = cVar.u();
                    break;
                case 1:
                    int i10 = -1;
                    cVar.f();
                    while (cVar.j()) {
                        int M = cVar.M(f17525b);
                        if (M == 0) {
                            i10 = cVar.r();
                        } else if (M != 1) {
                            cVar.V();
                            cVar.W();
                        } else {
                            cVar2 = d.g(cVar, hVar, i10);
                        }
                    }
                    cVar.i();
                    break;
                case 2:
                    dVar = d.h(cVar, hVar);
                    break;
                case 3:
                    gVar = cVar.r() == 1 ? l4.g.LINEAR : l4.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, hVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, hVar);
                    break;
                case 6:
                    fillType = cVar.r() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = cVar.n();
                    break;
                default:
                    cVar.V();
                    cVar.W();
                    break;
            }
        }
        return new l4.e(str, gVar, fillType, cVar2, dVar == null ? new k4.d(Collections.singletonList(new r4.a(100))) : dVar, fVar, fVar2, null, null, z10);
    }
}
