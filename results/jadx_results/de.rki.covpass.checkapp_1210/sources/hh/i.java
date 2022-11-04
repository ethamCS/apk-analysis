package hh;

import gg.a2;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class i extends gg.t {

    /* renamed from: c */
    gg.w f11969c;

    /* renamed from: d */
    x f11970d;

    /* renamed from: q */
    gg.q f11971q;

    protected i(gg.d0 d0Var) {
        this.f11969c = null;
        this.f11970d = null;
        this.f11971q = null;
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            gg.j0 N = gg.j0.N(H.nextElement());
            int Q = N.Q();
            if (Q == 0) {
                this.f11969c = gg.w.D(N, false);
            } else if (Q == 1) {
                this.f11970d = x.m(N, false);
            } else if (Q != 2) {
                throw new IllegalArgumentException("illegal tag");
            } else {
                this.f11971q = gg.q.D(N, false);
            }
        }
    }

    public static i l(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj == null) {
            return null;
        }
        return new i(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        gg.w wVar = this.f11969c;
        if (wVar != null) {
            hVar.a(new a2(false, 0, wVar));
        }
        x xVar = this.f11970d;
        if (xVar != null) {
            hVar.a(new a2(false, 1, xVar));
        }
        gg.q qVar = this.f11971q;
        if (qVar != null) {
            hVar.a(new a2(false, 2, qVar));
        }
        return new x1(hVar);
    }

    public byte[] m() {
        gg.w wVar = this.f11969c;
        if (wVar != null) {
            return wVar.F();
        }
        return null;
    }

    public String toString() {
        gg.w wVar = this.f11969c;
        String f10 = wVar != null ? bk.f.f(wVar.F()) : "null";
        return "AuthorityKeyIdentifier: KeyID(" + f10 + ")";
    }
}
