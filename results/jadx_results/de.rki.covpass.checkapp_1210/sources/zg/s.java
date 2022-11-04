package zg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.e0;
import gg.j0;
import gg.k1;
import gg.t1;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class s extends gg.t {

    /* renamed from: c */
    private gg.q f26868c;

    /* renamed from: d */
    private hh.b f26869d;

    /* renamed from: q */
    private gg.w f26870q;

    /* renamed from: x */
    private e0 f26871x;

    /* renamed from: y */
    private gg.c f26872y;

    private s(d0 d0Var) {
        Enumeration H = d0Var.H();
        gg.q E = gg.q.E(H.nextElement());
        this.f26868c = E;
        int r10 = r(E);
        this.f26869d = hh.b.n(H.nextElement());
        this.f26870q = gg.w.E(H.nextElement());
        int i10 = -1;
        while (H.hasMoreElements()) {
            j0 j0Var = (j0) H.nextElement();
            int Q = j0Var.Q();
            if (Q <= i10) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (Q == 0) {
                this.f26871x = e0.D(j0Var, false);
            } else if (Q != 1) {
                throw new IllegalArgumentException("unknown optional field in private key info");
            } else {
                if (r10 < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f26872y = k1.L(j0Var, false);
            }
            i10 = Q;
        }
    }

    public s(hh.b bVar, gg.g gVar) {
        this(bVar, gVar, null, null);
    }

    public s(hh.b bVar, gg.g gVar, e0 e0Var) {
        this(bVar, gVar, e0Var, null);
    }

    public s(hh.b bVar, gg.g gVar, e0 e0Var, byte[] bArr) {
        this.f26868c = new gg.q(bArr != null ? ak.b.f551b : ak.b.f550a);
        this.f26869d = bVar;
        this.f26870q = new t1(gVar);
        this.f26871x = e0Var;
        this.f26872y = bArr == null ? null : new k1(bArr);
    }

    public static s m(Object obj) {
        if (obj instanceof s) {
            return (s) obj;
        }
        if (obj == null) {
            return null;
        }
        return new s(d0.F(obj));
    }

    private static int r(gg.q qVar) {
        int M = qVar.M();
        if (M < 0 || M > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return M;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(5);
        hVar.a(this.f26868c);
        hVar.a(this.f26869d);
        hVar.a(this.f26870q);
        e0 e0Var = this.f26871x;
        if (e0Var != null) {
            hVar.a(new a2(false, 0, e0Var));
        }
        gg.c cVar = this.f26872y;
        if (cVar != null) {
            hVar.a(new a2(false, 1, cVar));
        }
        return new x1(hVar);
    }

    public e0 l() {
        return this.f26871x;
    }

    public gg.w n() {
        return new t1(this.f26870q.F());
    }

    public hh.b o() {
        return this.f26869d;
    }

    public gg.c q() {
        return this.f26872y;
    }

    public boolean s() {
        return this.f26872y != null;
    }

    public gg.g u() {
        return a0.u(this.f26870q.F());
    }
}
