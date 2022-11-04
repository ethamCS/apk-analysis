package hh;

import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class j extends gg.t {

    /* renamed from: c */
    gg.e f11984c;

    /* renamed from: d */
    gg.q f11985d;

    private j(gg.d0 d0Var) {
        this.f11984c = gg.e.F(false);
        this.f11985d = null;
        if (d0Var.size() == 0) {
            this.f11984c = null;
            this.f11985d = null;
            return;
        }
        if (d0Var.G(0) instanceof gg.e) {
            this.f11984c = gg.e.E(d0Var.G(0));
        } else {
            this.f11984c = null;
            this.f11985d = gg.q.E(d0Var.G(0));
        }
        if (d0Var.size() <= 1) {
            return;
        }
        if (this.f11984c == null) {
            throw new IllegalArgumentException("wrong sequence in constructor");
        }
        this.f11985d = gg.q.E(d0Var.G(1));
    }

    public static j l(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof w0) {
            return l(w0.a((w0) obj));
        }
        if (obj == null) {
            return null;
        }
        return new j(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        gg.e eVar = this.f11984c;
        if (eVar != null) {
            hVar.a(eVar);
        }
        gg.q qVar = this.f11985d;
        if (qVar != null) {
            hVar.a(qVar);
        }
        return new x1(hVar);
    }

    public BigInteger m() {
        gg.q qVar = this.f11985d;
        if (qVar != null) {
            return qVar.G();
        }
        return null;
    }

    public boolean n() {
        gg.e eVar = this.f11984c;
        return eVar != null && eVar.G();
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f11985d == null) {
            sb2 = new StringBuilder();
            sb2.append("BasicConstraints: isCa(");
            sb2.append(n());
            sb2.append(")");
        } else {
            sb2 = new StringBuilder();
            sb2.append("BasicConstraints: isCa(");
            sb2.append(n());
            sb2.append("), pathLenConstraint = ");
            sb2.append(this.f11985d.G());
        }
        return sb2.toString();
    }
}
