package nj;

import ak.l;
import fj.h;
import fj.i;
import fj.j;
import fj.k;
import fj.m;
import gg.e0;
import gg.t1;
import java.io.IOException;
import oj.a0;
import oj.y;
import zg.q;
import zg.s;
/* loaded from: classes3.dex */
public class b {
    public static s a(zh.b bVar, e0 e0Var) {
        if (bVar instanceof jj.a) {
            jj.a aVar = (jj.a) bVar;
            return new s(e.d(aVar.c()), new t1(aVar.b()), e0Var);
        } else if (bVar instanceof mj.b) {
            mj.b bVar2 = (mj.b) bVar;
            return new s(new hh.b(fj.e.f10270r, new h(e.f(bVar2.b()))), new t1(bVar2.c()));
        } else if (bVar instanceof ij.a) {
            hh.b bVar3 = new hh.b(fj.e.f10274v);
            short[] b10 = ((ij.a) bVar).b();
            byte[] bArr = new byte[b10.length * 2];
            for (int i10 = 0; i10 != b10.length; i10++) {
                l.B(b10[i10], bArr, i10 * 2);
            }
            return new s(bVar3, new t1(bArr));
        } else if (bVar instanceof gj.h) {
            gj.h hVar = (gj.h) bVar;
            byte[] b11 = gj.a.f().i(1).c(hVar).b();
            return new s(new hh.b(q.G2), new t1(b11), e0Var, gj.a.f().i(1).c(hVar.j()).b());
        } else if (bVar instanceof gj.c) {
            gj.c cVar = (gj.c) bVar;
            byte[] b12 = gj.a.f().i(cVar.d()).c(cVar).b();
            return new s(new hh.b(q.G2), new t1(b12), e0Var, gj.a.f().i(cVar.d()).c(cVar.e().d()).b());
        } else if (bVar instanceof y) {
            y yVar = (y) bVar;
            return new s(new hh.b(fj.e.f10275w, new i(yVar.c().b(), e.h(yVar.b()))), b(yVar), e0Var);
        } else if (bVar instanceof oj.s) {
            oj.s sVar = (oj.s) bVar;
            return new s(new hh.b(fj.e.F, new j(sVar.c().a(), sVar.c().b(), e.h(sVar.b()))), c(sVar), e0Var);
        } else if (!(bVar instanceof hj.b)) {
            throw new IOException("key parameters not recognized");
        } else {
            hj.b bVar4 = (hj.b) bVar;
            return new s(new hh.b(fj.e.f10266n), new fj.a(bVar4.g(), bVar4.f(), bVar4.c(), bVar4.d(), bVar4.h(), e.a(bVar4.b())));
        }
    }

    private static m b(y yVar) {
        byte[] encoded = yVar.getEncoded();
        int h10 = yVar.c().h();
        int b10 = yVar.c().b();
        int a10 = (int) a0.a(encoded, 0, 4);
        if (a0.l(b10, a10)) {
            byte[] g10 = a0.g(encoded, 4, h10);
            int i10 = 4 + h10;
            byte[] g11 = a0.g(encoded, i10, h10);
            int i11 = i10 + h10;
            byte[] g12 = a0.g(encoded, i11, h10);
            int i12 = i11 + h10;
            byte[] g13 = a0.g(encoded, i12, h10);
            int i13 = i12 + h10;
            byte[] g14 = a0.g(encoded, i13, encoded.length - i13);
            try {
                oj.a aVar = (oj.a) a0.f(g14, oj.a.class);
                return aVar.e() != (1 << b10) - 1 ? new m(a10, g10, g11, g12, g13, g14, aVar.e()) : new m(a10, g10, g11, g12, g13, g14);
            } catch (ClassNotFoundException e10) {
                throw new IOException("cannot parse BDS: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    private static k c(oj.s sVar) {
        byte[] encoded = sVar.getEncoded();
        int f10 = sVar.c().f();
        int a10 = sVar.c().a();
        int i10 = (a10 + 7) / 8;
        long a11 = (int) a0.a(encoded, 0, i10);
        if (a0.l(a10, a11)) {
            int i11 = i10 + 0;
            byte[] g10 = a0.g(encoded, i11, f10);
            int i12 = i11 + f10;
            byte[] g11 = a0.g(encoded, i12, f10);
            int i13 = i12 + f10;
            byte[] g12 = a0.g(encoded, i13, f10);
            int i14 = i13 + f10;
            byte[] g13 = a0.g(encoded, i14, f10);
            int i15 = i14 + f10;
            byte[] g14 = a0.g(encoded, i15, encoded.length - i15);
            try {
                oj.b bVar = (oj.b) a0.f(g14, oj.b.class);
                return bVar.c() != (1 << a10) - 1 ? new k(a11, g10, g11, g12, g13, g14, bVar.c()) : new k(a11, g10, g11, g12, g13, g14);
            } catch (ClassNotFoundException e10) {
                throw new IOException("cannot parse BDSStateMap: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }
}
