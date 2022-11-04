package nj;

import ak.l;
import fj.h;
import fj.i;
import fj.j;
import fj.k;
import fj.m;
import gg.v;
import gg.w;
import java.io.IOException;
import oj.a0;
import oj.r;
import oj.s;
import oj.x;
import oj.y;
import zg.q;
import zg.s;
/* loaded from: classes3.dex */
public class a {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 != length; i10++) {
            sArr[i10] = l.r(bArr, i10 * 2);
        }
        return sArr;
    }

    public static zh.b b(s sVar) {
        v l10 = sVar.o().l();
        if (l10.N(ig.a.W)) {
            return new jj.a(e.e(sVar.o()), w.E(sVar.u()).F());
        } else if (l10.s(ig.a.f12583s)) {
            return new mj.b(w.E(sVar.u()).F(), e.g(h.l(sVar.o().o())));
        } else {
            if (l10.s(ig.a.f12568f0)) {
                return new ij.a(a(w.E(sVar.u()).F()));
            }
            if (l10.s(q.G2)) {
                byte[] F = w.E(sVar.u()).F();
                gg.c q10 = sVar.q();
                if (l.a(F, 0) == 1) {
                    if (q10 == null) {
                        return gj.h.f(ak.a.w(F, 4, F.length));
                    }
                    byte[] G = q10.G();
                    return gj.h.g(ak.a.w(F, 4, F.length), ak.a.w(G, 4, G.length));
                } else if (q10 == null) {
                    return gj.c.b(ak.a.w(F, 4, F.length));
                } else {
                    return gj.c.c(ak.a.w(F, 4, F.length), q10.G());
                }
            } else if (l10.s(ig.a.f12587w)) {
                i m10 = i.m(sVar.o().o());
                v l11 = m10.n().l();
                m n10 = m.n(sVar.u());
                try {
                    y.b o10 = new y.b(new x(m10.l(), e.b(l11))).l(n10.m()).q(n10.u()).p(n10.s()).n(n10.q()).o(n10.r());
                    if (n10.w() != 0) {
                        o10.m(n10.o());
                    }
                    if (n10.l() != null) {
                        o10.k(((oj.a) a0.f(n10.l(), oj.a.class)).j(l11));
                    }
                    return o10.j();
                } catch (ClassNotFoundException e10) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e10.getMessage());
                }
            } else if (!l10.s(fj.e.F)) {
                if (!l10.s(fj.e.f10266n)) {
                    throw new RuntimeException("algorithm identifier in private key not recognised");
                }
                fj.a o11 = fj.a.o(sVar.u());
                return new hj.b(o11.r(), o11.q(), o11.m(), o11.n(), o11.s(), e.c(o11.l().l()));
            } else {
                j m11 = j.m(sVar.o().o());
                v l12 = m11.o().l();
                try {
                    k n11 = k.n(sVar.u());
                    s.b p10 = new s.b(new r(m11.l(), m11.n(), e.b(l12))).m(n11.m()).r(n11.u()).q(n11.s()).o(n11.q()).p(n11.r());
                    if (n11.w() != 0) {
                        p10.n(n11.o());
                    }
                    if (n11.l() != null) {
                        p10.l(((oj.b) a0.f(n11.l(), oj.b.class)).h(l12));
                    }
                    return p10.k();
                } catch (ClassNotFoundException e11) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e11.getMessage());
                }
            }
        }
    }
}
