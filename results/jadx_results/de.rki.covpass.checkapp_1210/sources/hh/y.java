package hh;

import gg.a2;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class y extends gg.t {

    /* renamed from: x */
    private static final BigInteger f12136x = BigInteger.valueOf(0);

    /* renamed from: c */
    private w f12137c;

    /* renamed from: d */
    private gg.q f12138d;

    /* renamed from: q */
    private gg.q f12139q;

    private y(gg.d0 d0Var) {
        gg.j0 j0Var;
        this.f12137c = w.n(d0Var.G(0));
        int size = d0Var.size();
        if (size != 1) {
            if (size == 2) {
                j0Var = gg.j0.N(d0Var.G(1));
                int Q = j0Var.Q();
                if (Q == 0) {
                    this.f12138d = gg.q.D(j0Var, false);
                    return;
                } else if (Q != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + j0Var.Q());
                }
            } else if (size != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
            } else {
                gg.j0 N = gg.j0.N(d0Var.G(1));
                if (N.Q() != 0) {
                    throw new IllegalArgumentException("Bad tag number for 'minimum': " + N.Q());
                }
                this.f12138d = gg.q.D(N, false);
                j0Var = gg.j0.N(d0Var.G(2));
                if (j0Var.Q() != 1) {
                    throw new IllegalArgumentException("Bad tag number for 'maximum': " + j0Var.Q());
                }
            }
            this.f12139q = gg.q.D(j0Var, false);
        }
    }

    public static y m(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof y ? (y) obj : new y(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f12137c);
        gg.q qVar = this.f12138d;
        if (qVar != null && !qVar.H(0)) {
            hVar.a(new a2(false, 0, this.f12138d));
        }
        gg.q qVar2 = this.f12139q;
        if (qVar2 != null) {
            hVar.a(new a2(false, 1, qVar2));
        }
        return new x1(hVar);
    }

    public w l() {
        return this.f12137c;
    }
}
