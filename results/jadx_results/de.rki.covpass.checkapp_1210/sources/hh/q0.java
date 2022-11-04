package hh;
/* loaded from: classes3.dex */
public class q0 extends gg.t implements z0, zg.q {
    u0 U3;
    u0 V3;
    fh.c W3;
    n0 X3;
    gg.c Y3;
    gg.c Z3;

    /* renamed from: a4 */
    x0 f12028a4;

    /* renamed from: c */
    gg.d0 f12029c;

    /* renamed from: d */
    gg.q f12030d;

    /* renamed from: q */
    gg.q f12031q;

    /* renamed from: x */
    b f12032x;

    /* renamed from: y */
    fh.c f12033y;

    public q0(gg.d0 d0Var) {
        int i10;
        this.f12029c = d0Var;
        if (d0Var.G(0) instanceof gg.j0) {
            this.f12030d = gg.q.D((gg.j0) d0Var.G(0), true);
            i10 = 0;
        } else {
            this.f12030d = new gg.q(0L);
            i10 = -1;
        }
        this.f12031q = gg.q.E(d0Var.G(i10 + 1));
        this.f12032x = b.n(d0Var.G(i10 + 2));
        this.f12033y = fh.c.n(d0Var.G(i10 + 3));
        gg.d0 d0Var2 = (gg.d0) d0Var.G(i10 + 4);
        this.U3 = u0.m(d0Var2.G(0));
        this.V3 = u0.m(d0Var2.G(1));
        this.W3 = fh.c.n(d0Var.G(i10 + 5));
        int i11 = i10 + 6;
        this.X3 = n0.n(d0Var.G(i11));
        for (int size = (d0Var.size() - i11) - 1; size > 0; size--) {
            gg.j0 N = gg.j0.N(d0Var.G(i11 + size));
            int Q = N.Q();
            if (Q == 1) {
                this.Y3 = gg.c.E(N, false);
            } else if (Q == 2) {
                this.Z3 = gg.c.E(N, false);
            } else if (Q == 3) {
                this.f12028a4 = x0.l(N);
            }
        }
    }

    public static q0 l(Object obj) {
        if (obj instanceof q0) {
            return (q0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new q0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f12029c;
    }

    public fh.c m() {
        return this.f12033y;
    }

    public fh.c n() {
        return this.W3;
    }
}
