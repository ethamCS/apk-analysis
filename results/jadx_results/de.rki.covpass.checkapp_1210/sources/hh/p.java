package hh;

import gg.a2;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class p extends gg.t {

    /* renamed from: c */
    private n f12017c;

    /* renamed from: d */
    private n f12018d;

    private p(gg.d0 d0Var) {
        if (d0Var.size() != 1 && d0Var.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            gg.j0 N = gg.j0.N(H.nextElement());
            if (N.Q() == 0) {
                this.f12017c = n.m(N, true);
            } else if (N.Q() != 1) {
                throw new IllegalArgumentException("Bad tag number: " + N.Q());
            } else {
                this.f12018d = n.m(N, true);
            }
        }
    }

    public p(n nVar, n nVar2) {
        this.f12017c = nVar;
        this.f12018d = nVar2;
    }

    public static p m(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof gg.d0) {
            return new p((gg.d0) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        n nVar = this.f12017c;
        if (nVar != null) {
            hVar.a(new a2(0, nVar));
        }
        n nVar2 = this.f12018d;
        if (nVar2 != null) {
            hVar.a(new a2(1, nVar2));
        }
        return new x1(hVar);
    }

    public n l() {
        return this.f12017c;
    }

    public n n() {
        return this.f12018d;
    }
}
