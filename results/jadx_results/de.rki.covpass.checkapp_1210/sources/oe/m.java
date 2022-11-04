package oe;
/* loaded from: classes3.dex */
public abstract class m implements e1 {

    /* renamed from: a */
    private int f18019a;

    private final boolean e(xc.h hVar) {
        return !qe.k.m(hVar) && !ae.d.E(hVar);
    }

    public final boolean d(xc.h hVar, xc.h hVar2) {
        hc.t.e(hVar, "first");
        hc.t.e(hVar2, "second");
        if (!hc.t.a(hVar.getName(), hVar2.getName())) {
            return false;
        }
        xc.m b10 = hVar.b();
        for (xc.m b11 = hVar2.b(); b10 != null && b11 != null; b11 = b11.b()) {
            if (b10 instanceof xc.h0) {
                return b11 instanceof xc.h0;
            }
            if (b11 instanceof xc.h0) {
                return false;
            }
            if (b10 instanceof xc.l0) {
                return (b11 instanceof xc.l0) && hc.t.a(((xc.l0) b10).d(), ((xc.l0) b11).d());
            } else if ((b11 instanceof xc.l0) || !hc.t.a(b10.getName(), b11.getName())) {
                return false;
            } else {
                b10 = b10.b();
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1) || obj.hashCode() != hashCode()) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (e1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        xc.h z10 = z();
        xc.h z11 = e1Var.z();
        if (z11 == null || !e(z10) || !e(z11)) {
            return false;
        }
        return f(z11);
    }

    protected abstract boolean f(xc.h hVar);

    public int hashCode() {
        int i10 = this.f18019a;
        if (i10 != 0) {
            return i10;
        }
        xc.h z10 = z();
        int hashCode = e(z10) ? ae.d.m(z10).hashCode() : System.identityHashCode(this);
        this.f18019a = hashCode;
        return hashCode;
    }

    @Override // oe.e1
    public abstract xc.h z();
}
