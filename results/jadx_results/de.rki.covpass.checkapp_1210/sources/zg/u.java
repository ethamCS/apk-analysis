package zg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.r1;
import gg.t1;
import gg.x1;
/* loaded from: classes3.dex */
public class u extends gg.t {
    public static final hh.b U3 = new hh.b(q.f26809h1, new t1(new byte[0]));

    /* renamed from: x */
    public static final hh.b f26875x;

    /* renamed from: y */
    public static final hh.b f26876y;

    /* renamed from: c */
    private hh.b f26877c;

    /* renamed from: d */
    private hh.b f26878d;

    /* renamed from: q */
    private hh.b f26879q;

    static {
        hh.b bVar = new hh.b(yg.b.f26294i, r1.f10880d);
        f26875x = bVar;
        f26876y = new hh.b(q.f26806g1, bVar);
    }

    public u() {
        this.f26877c = f26875x;
        this.f26878d = f26876y;
        this.f26879q = U3;
    }

    private u(d0 d0Var) {
        this.f26877c = f26875x;
        this.f26878d = f26876y;
        this.f26879q = U3;
        for (int i10 = 0; i10 != d0Var.size(); i10++) {
            j0 j0Var = (j0) d0Var.G(i10);
            int Q = j0Var.Q();
            if (Q == 0) {
                this.f26877c = hh.b.m(j0Var, true);
            } else if (Q == 1) {
                this.f26878d = hh.b.m(j0Var, true);
            } else if (Q != 2) {
                throw new IllegalArgumentException("unknown tag");
            } else {
                this.f26879q = hh.b.m(j0Var, true);
            }
        }
    }

    public u(hh.b bVar, hh.b bVar2, hh.b bVar3) {
        this.f26877c = bVar;
        this.f26878d = bVar2;
        this.f26879q = bVar3;
    }

    public static u m(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj == null) {
            return null;
        }
        return new u(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        if (!this.f26877c.equals(f26875x)) {
            hVar.a(new a2(true, 0, this.f26877c));
        }
        if (!this.f26878d.equals(f26876y)) {
            hVar.a(new a2(true, 1, this.f26878d));
        }
        if (!this.f26879q.equals(U3)) {
            hVar.a(new a2(true, 2, this.f26879q));
        }
        return new x1(hVar);
    }

    public hh.b l() {
        return this.f26877c;
    }

    public hh.b n() {
        return this.f26878d;
    }

    public hh.b o() {
        return this.f26879q;
    }
}
