package bh;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.g;
import gg.h;
import gg.j0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    private d0 f6032c;

    public a(int i10, BigInteger bigInteger, gg.c cVar, g gVar) {
        byte[] b10 = ak.b.b((i10 + 7) / 8, bigInteger);
        h hVar = new h(4);
        hVar.a(new q(1L));
        hVar.a(new t1(b10));
        if (gVar != null) {
            hVar.a(new a2(true, 0, gVar));
        }
        if (cVar != null) {
            hVar.a(new a2(true, 1, cVar));
        }
        this.f6032c = new x1(hVar);
    }

    public a(int i10, BigInteger bigInteger, g gVar) {
        this(i10, bigInteger, null, gVar);
    }

    private a(d0 d0Var) {
        this.f6032c = d0Var;
    }

    public static a l(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj == null) {
            return null;
        }
        return new a(d0.F(obj));
    }

    private t n(int i10, int i11) {
        Enumeration H = this.f6032c.H();
        while (H.hasMoreElements()) {
            g gVar = (g) H.nextElement();
            if (gVar instanceof j0) {
                j0 j0Var = (j0) gVar;
                if (j0Var.R(i10)) {
                    return i11 < 0 ? j0Var.K().b() : j0Var.H(true, i11);
                }
            }
        }
        return null;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f6032c;
    }

    public BigInteger m() {
        return new BigInteger(1, ((w) this.f6032c.G(1)).F());
    }

    public t o() {
        return n(0, -1);
    }

    public gg.c q() {
        return (gg.c) n(1, 3);
    }
}
