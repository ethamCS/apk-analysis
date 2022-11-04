package hh;

import gg.a2;
import gg.k1;
import gg.x1;
/* loaded from: classes3.dex */
public class p0 extends gg.t {
    u0 U3;
    u0 V3;
    fh.c W3;
    n0 X3;
    gg.c Y3;
    gg.c Z3;

    /* renamed from: a4 */
    v f12019a4;

    /* renamed from: c */
    gg.d0 f12020c;

    /* renamed from: d */
    gg.q f12021d;

    /* renamed from: q */
    gg.q f12022q;

    /* renamed from: x */
    b f12023x;

    /* renamed from: y */
    fh.c f12024y;

    private p0(gg.d0 d0Var) {
        int i10;
        boolean z10;
        boolean z11;
        this.f12020c = d0Var;
        if (d0Var.G(0) instanceof gg.j0) {
            this.f12021d = gg.q.D((gg.j0) d0Var.G(0), true);
            i10 = 0;
        } else {
            this.f12021d = new gg.q(0L);
            i10 = -1;
        }
        if (this.f12021d.H(0)) {
            z10 = false;
            z11 = true;
        } else if (this.f12021d.H(1)) {
            z11 = false;
            z10 = true;
        } else if (!this.f12021d.H(2)) {
            throw new IllegalArgumentException("version number not recognised");
        } else {
            z11 = false;
            z10 = false;
        }
        this.f12022q = gg.q.E(d0Var.G(i10 + 1));
        this.f12023x = b.n(d0Var.G(i10 + 2));
        this.f12024y = fh.c.n(d0Var.G(i10 + 3));
        gg.d0 d0Var2 = (gg.d0) d0Var.G(i10 + 4);
        this.U3 = u0.m(d0Var2.G(0));
        this.V3 = u0.m(d0Var2.G(1));
        this.W3 = fh.c.n(d0Var.G(i10 + 5));
        int i11 = i10 + 6;
        this.X3 = n0.n(d0Var.G(i11));
        int size = (d0Var.size() - i11) - 1;
        if (size == 0 || !z11) {
            while (size > 0) {
                gg.j0 j0Var = (gg.j0) d0Var.G(i11 + size);
                int Q = j0Var.Q();
                if (Q == 1) {
                    this.Y3 = k1.L(j0Var, false);
                } else if (Q == 2) {
                    this.Z3 = k1.L(j0Var, false);
                } else if (Q != 3) {
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + j0Var.Q());
                } else if (z10) {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                } else {
                    this.f12019a4 = v.n(gg.d0.E(j0Var, true));
                }
                size--;
            }
            return;
        }
        throw new IllegalArgumentException("version 1 certificate contains extra data");
    }

    public static p0 n(Object obj) {
        if (obj instanceof p0) {
            return (p0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new p0(gg.d0.F(obj));
    }

    public gg.c C() {
        return this.Z3;
    }

    public int D() {
        return this.f12021d.M() + 1;
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        if (ak.m.b("org.bouncycastle.x509.allow_non-der_tbscert") != null && !ak.m.c("org.bouncycastle.x509.allow_non-der_tbscert")) {
            gg.h hVar = new gg.h();
            if (!this.f12021d.H(0)) {
                hVar.a(new a2(true, 0, this.f12021d));
            }
            hVar.a(this.f12022q);
            hVar.a(this.f12023x);
            hVar.a(this.f12024y);
            gg.h hVar2 = new gg.h(2);
            hVar2.a(this.U3);
            hVar2.a(this.V3);
            hVar.a(new x1(hVar2));
            gg.g gVar = this.W3;
            if (gVar == null) {
                gVar = new x1();
            }
            hVar.a(gVar);
            hVar.a(this.X3);
            gg.c cVar = this.Y3;
            if (cVar != null) {
                hVar.a(new a2(false, 1, cVar));
            }
            gg.c cVar2 = this.Z3;
            if (cVar2 != null) {
                hVar.a(new a2(false, 2, cVar2));
            }
            v vVar = this.f12019a4;
            if (vVar != null) {
                hVar.a(new a2(true, 3, vVar));
            }
            return new x1(hVar);
        }
        return this.f12020c;
    }

    public u0 l() {
        return this.V3;
    }

    public v m() {
        return this.f12019a4;
    }

    public fh.c o() {
        return this.f12024y;
    }

    public gg.c q() {
        return this.Y3;
    }

    public gg.q r() {
        return this.f12022q;
    }

    public b s() {
        return this.f12023x;
    }

    public u0 u() {
        return this.U3;
    }

    public fh.c w() {
        return this.W3;
    }

    public n0 z() {
        return this.X3;
    }
}
