package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class g extends gg.t {
    private d U3;
    private gg.d0 V3;
    private gg.c W3;
    private v X3;

    /* renamed from: c */
    private gg.q f11957c;

    /* renamed from: d */
    private z f11958d;

    /* renamed from: q */
    private c f11959q;

    /* renamed from: x */
    private b f11960x;

    /* renamed from: y */
    private gg.q f11961y;

    private g(gg.d0 d0Var) {
        if (d0Var.size() < 6 || d0Var.size() > 9) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        int i10 = 0;
        if (d0Var.G(0) instanceof gg.q) {
            this.f11957c = gg.q.E(d0Var.G(0));
            i10 = 1;
        } else {
            this.f11957c = new gg.q(0L);
        }
        this.f11958d = z.n(d0Var.G(i10));
        this.f11959q = c.l(d0Var.G(i10 + 1));
        this.f11960x = b.n(d0Var.G(i10 + 2));
        this.f11961y = gg.q.E(d0Var.G(i10 + 3));
        this.U3 = d.l(d0Var.G(i10 + 4));
        this.V3 = gg.d0.F(d0Var.G(i10 + 5));
        for (int i11 = i10 + 6; i11 < d0Var.size(); i11++) {
            gg.g G = d0Var.G(i11);
            if (G instanceof gg.c) {
                this.W3 = gg.c.F(d0Var.G(i11));
            } else if ((G instanceof gg.d0) || (G instanceof v)) {
                this.X3 = v.n(d0Var.G(i11));
            }
        }
    }

    public static g q(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj == null) {
            return null;
        }
        return new g(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(9);
        if (!this.f11957c.H(0)) {
            hVar.a(this.f11957c);
        }
        hVar.a(this.f11958d);
        hVar.a(this.f11959q);
        hVar.a(this.f11960x);
        hVar.a(this.f11961y);
        hVar.a(this.U3);
        hVar.a(this.V3);
        gg.c cVar = this.W3;
        if (cVar != null) {
            hVar.a(cVar);
        }
        v vVar = this.X3;
        if (vVar != null) {
            hVar.a(vVar);
        }
        return new x1(hVar);
    }

    public d l() {
        return this.U3;
    }

    public gg.d0 m() {
        return this.V3;
    }

    public v n() {
        return this.X3;
    }

    public z o() {
        return this.f11958d;
    }

    public c r() {
        return this.f11959q;
    }

    public gg.q s() {
        return this.f11961y;
    }
}
