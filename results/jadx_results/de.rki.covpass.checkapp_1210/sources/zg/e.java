package zg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.e0;
import gg.j0;
import gg.x1;
import hh.n0;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class e extends gg.t {

    /* renamed from: c */
    gg.q f26758c;

    /* renamed from: d */
    fh.c f26759d;

    /* renamed from: q */
    n0 f26760q;

    /* renamed from: x */
    e0 f26761x;

    private e(d0 d0Var) {
        this.f26758c = new gg.q(0L);
        this.f26761x = null;
        this.f26758c = (gg.q) d0Var.G(0);
        this.f26759d = fh.c.n(d0Var.G(1));
        this.f26760q = n0.n(d0Var.G(2));
        if (d0Var.size() > 3) {
            this.f26761x = e0.D((j0) d0Var.G(3), false);
        }
        m(this.f26761x);
        if (this.f26759d == null || this.f26758c == null || this.f26760q == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
    }

    public static e l(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj == null) {
            return null;
        }
        return new e(d0.F(obj));
    }

    private static void m(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        Enumeration G = e0Var.G();
        while (G.hasMoreElements()) {
            a n10 = a.n(G.nextElement());
            if (n10.l().s(q.f26798d2) && n10.m().size() != 1) {
                throw new IllegalArgumentException("challengePassword attribute must have one value");
            }
        }
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(4);
        hVar.a(this.f26758c);
        hVar.a(this.f26759d);
        hVar.a(this.f26760q);
        e0 e0Var = this.f26761x;
        if (e0Var != null) {
            hVar.a(new a2(false, 0, e0Var));
        }
        return new x1(hVar);
    }
}
