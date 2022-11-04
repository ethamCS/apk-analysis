package o4;

import android.graphics.PointF;
import p4.c;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private static final c.a f17485a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final c.a f17486b = c.a.a("k");

    private static boolean a(k4.e eVar) {
        return eVar == null || (eVar.m() && eVar.o().get(0).f20443b.equals(0.0f, 0.0f));
    }

    private static boolean b(k4.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof k4.i) && mVar.m() && mVar.o().get(0).f20443b.equals(0.0f, 0.0f));
    }

    private static boolean c(k4.b bVar) {
        return bVar == null || (bVar.m() && ((Float) ((r4.a) bVar.o().get(0)).f20443b).floatValue() == 0.0f);
    }

    private static boolean d(k4.g gVar) {
        return gVar == null || (gVar.m() && ((r4.d) ((r4.a) gVar.o().get(0)).f20443b).a(1.0f, 1.0f));
    }

    private static boolean e(k4.b bVar) {
        return bVar == null || (bVar.m() && ((Float) ((r4.a) bVar.o().get(0)).f20443b).floatValue() == 0.0f);
    }

    private static boolean f(k4.b bVar) {
        return bVar == null || (bVar.m() && ((Float) ((r4.a) bVar.o().get(0)).f20443b).floatValue() == 0.0f);
    }

    public static k4.l g(p4.c cVar, e4.h hVar) {
        boolean z10;
        boolean z11 = false;
        boolean z12 = cVar.B() == c.b.BEGIN_OBJECT;
        if (z12) {
            cVar.f();
        }
        k4.b bVar = null;
        k4.e eVar = null;
        k4.m<PointF, PointF> mVar = null;
        k4.g gVar = null;
        k4.b bVar2 = null;
        k4.b bVar3 = null;
        k4.d dVar = null;
        k4.b bVar4 = null;
        k4.b bVar5 = null;
        while (cVar.j()) {
            switch (cVar.M(f17485a)) {
                case 0:
                    boolean z13 = z11;
                    cVar.f();
                    while (cVar.j()) {
                        if (cVar.M(f17486b) != 0) {
                            cVar.V();
                            cVar.W();
                        } else {
                            eVar = a.a(cVar, hVar);
                        }
                    }
                    cVar.i();
                    z11 = z13;
                    continue;
                case 1:
                    mVar = a.b(cVar, hVar);
                    continue;
                case 2:
                    gVar = d.j(cVar, hVar);
                    continue;
                case 3:
                    hVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = d.h(cVar, hVar);
                    continue;
                case 6:
                    bVar4 = d.f(cVar, hVar, z11);
                    continue;
                case 7:
                    bVar5 = d.f(cVar, hVar, z11);
                    continue;
                case 8:
                    bVar2 = d.f(cVar, hVar, z11);
                    continue;
                case 9:
                    bVar3 = d.f(cVar, hVar, z11);
                    continue;
                default:
                    cVar.V();
                    cVar.W();
                    continue;
            }
            k4.b f10 = d.f(cVar, hVar, z11);
            if (f10.o().isEmpty()) {
                f10.o().add(new r4.a(hVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(hVar.f())));
            } else if (((r4.a) f10.o().get(0)).f20443b == 0) {
                z10 = false;
                f10.o().set(0, new r4.a(hVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(hVar.f())));
                z11 = z10;
                bVar = f10;
            }
            z10 = false;
            z11 = z10;
            bVar = f10;
        }
        if (z12) {
            cVar.i();
        }
        k4.e eVar2 = a(eVar) ? null : eVar;
        k4.m<PointF, PointF> mVar2 = b(mVar) ? null : mVar;
        k4.b bVar6 = c(bVar) ? null : bVar;
        if (d(gVar)) {
            gVar = null;
        }
        return new k4.l(eVar2, mVar2, gVar, bVar6, dVar, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}
