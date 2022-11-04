package nj;

import fj.h;
import fj.j;
import fj.l;
import fj.n;
import gg.t1;
import gj.i;
import hh.n0;
import java.io.IOException;
import oj.t;
import oj.z;
import zg.q;
/* loaded from: classes3.dex */
public class d {
    public static n0 a(zh.b bVar) {
        if (bVar instanceof jj.b) {
            jj.b bVar2 = (jj.b) bVar;
            return new n0(e.d(bVar2.c()), bVar2.b());
        } else if (bVar instanceof mj.c) {
            mj.c cVar = (mj.c) bVar;
            return new n0(new hh.b(fj.e.f10270r, new h(e.f(cVar.b()))), cVar.c());
        } else if (bVar instanceof ij.b) {
            return new n0(new hh.b(fj.e.f10274v), ((ij.b) bVar).b());
        } else {
            if (bVar instanceof i) {
                return new n0(new hh.b(q.G2), new t1(gj.a.f().i(1).c((i) bVar).b()));
            } else if (bVar instanceof gj.d) {
                gj.d dVar = (gj.d) bVar;
                return new n0(new hh.b(q.G2), new t1(gj.a.f().i(dVar.c()).c(dVar.d()).b()));
            } else if (bVar instanceof z) {
                z zVar = (z) bVar;
                byte[] d10 = zVar.d();
                byte[] e10 = zVar.e();
                byte[] encoded = zVar.getEncoded();
                return encoded.length > d10.length + e10.length ? new n0(new hh.b(qg.a.f19903a), new t1(encoded)) : new n0(new hh.b(fj.e.f10275w, new fj.i(zVar.c().b(), e.h(zVar.b()))), new n(d10, e10));
            } else if (!(bVar instanceof t)) {
                if (!(bVar instanceof hj.c)) {
                    throw new IOException("key parameters not recognized");
                }
                hj.c cVar2 = (hj.c) bVar;
                return new n0(new hh.b(fj.e.f10266n), new fj.b(cVar2.d(), cVar2.e(), cVar2.c(), e.a(cVar2.b())));
            } else {
                t tVar = (t) bVar;
                byte[] d11 = tVar.d();
                byte[] e11 = tVar.e();
                byte[] encoded2 = tVar.getEncoded();
                return encoded2.length > d11.length + e11.length ? new n0(new hh.b(qg.a.f19904b), new t1(encoded2)) : new n0(new hh.b(fj.e.F, new j(tVar.c().a(), tVar.c().b(), e.h(tVar.b()))), new l(tVar.d(), tVar.e()));
            }
        }
    }
}
