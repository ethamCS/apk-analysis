package o4;

import android.graphics.PointF;
import l4.j;
import p4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    private static final c.a f17487a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    public static l4.j a(p4.c cVar, e4.h hVar, int i10) {
        boolean z10 = false;
        boolean z11 = i10 == 3;
        String str = null;
        j.a aVar = null;
        k4.b bVar = null;
        k4.m<PointF, PointF> mVar = null;
        k4.b bVar2 = null;
        k4.b bVar3 = null;
        k4.b bVar4 = null;
        k4.b bVar5 = null;
        k4.b bVar6 = null;
        while (cVar.j()) {
            switch (cVar.M(f17487a)) {
                case 0:
                    str = cVar.u();
                    break;
                case 1:
                    aVar = j.a.b(cVar.r());
                    break;
                case 2:
                    bVar = d.f(cVar, hVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, hVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, hVar, false);
                    break;
                case 5:
                    bVar4 = d.e(cVar, hVar);
                    break;
                case 6:
                    bVar6 = d.f(cVar, hVar, false);
                    break;
                case 7:
                    bVar3 = d.e(cVar, hVar);
                    break;
                case 8:
                    bVar5 = d.f(cVar, hVar, false);
                    break;
                case 9:
                    z10 = cVar.n();
                    break;
                case 10:
                    if (cVar.r() != 3) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                default:
                    cVar.V();
                    cVar.W();
                    break;
            }
        }
        return new l4.j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z10, z11);
    }
}
