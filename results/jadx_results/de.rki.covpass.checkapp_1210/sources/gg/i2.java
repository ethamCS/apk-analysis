package gg;
/* loaded from: classes3.dex */
public class i2 extends k {
    public i2(h hVar) {
        this(j2.a(hVar));
    }

    public i2(l2 l2Var) {
        super(l2Var);
    }

    public i2(v vVar, q qVar, a0 a0Var, int i10, a0 a0Var2) {
        super(vVar, qVar, a0Var, i10, a0Var2);
    }

    @Override // gg.k
    d0 C() {
        h hVar = new h(4);
        v vVar = this.f10843c;
        if (vVar != null) {
            hVar.a(vVar);
        }
        q qVar = this.f10844d;
        if (qVar != null) {
            hVar.a(qVar);
        }
        a0 a0Var = this.f10845q;
        if (a0Var != null) {
            hVar.a(a0Var.z());
        }
        int i10 = this.f10846x;
        hVar.a(new p2(i10 == 0, i10, this.f10847y));
        return new l2(hVar);
    }

    @Override // gg.k, gg.a0
    public a0 z() {
        return this;
    }
}
