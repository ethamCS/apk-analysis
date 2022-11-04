package a;
/* loaded from: classes.dex */
public class e {

    /* renamed from: d */
    protected byte[] f51d;

    /* renamed from: a */
    protected t7.o f48a = t7.o.G0();

    /* renamed from: b */
    protected t7.o f49b = t7.o.G0();

    /* renamed from: c */
    protected t7.o f50c = t7.o.G0();

    /* renamed from: e */
    protected byte[] f52e = new byte[0];

    public void a(l lVar, t7.o oVar, int i10) {
        b(lVar.b(), oVar, i10);
    }

    public void b(t7.o oVar, t7.o oVar2, int i10) {
        t7.o oVar3;
        h(oVar);
        if (oVar.s1() == t7.q.Integer || oVar.s1() == t7.q.TextString) {
            if (i10 != 1) {
                if (i10 == 2) {
                    oVar3 = this.f49b;
                } else if (i10 != 4) {
                    throw new f("Invalid attribute location given");
                } else {
                    oVar3 = this.f50c;
                }
            } else if (this.f51d != null) {
                throw new f("Cannot modify protected attribute if signature has been computed");
            } else {
                oVar3 = this.f48a;
            }
            oVar3.b(oVar, oVar2);
            return;
        }
        throw new f("Labels must be integers or strings");
    }

    public t7.o c(l lVar) {
        return e(lVar.b(), 7);
    }

    public t7.o d(l lVar, int i10) {
        return e(lVar.b(), i10);
    }

    public t7.o e(t7.o oVar, int i10) {
        t7.o oVar2;
        if ((i10 & 1) == 1 && this.f48a.E(oVar)) {
            oVar2 = this.f48a;
        } else if ((i10 & 2) == 2 && this.f49b.E(oVar)) {
            oVar2 = this.f49b;
        } else if ((i10 & 4) != 4 || !this.f50c.E(oVar)) {
            return null;
        } else {
            oVar2 = this.f50c;
        }
        return oVar2.k1(oVar);
    }

    public t7.o f() {
        return this.f48a;
    }

    public t7.o g() {
        return this.f49b;
    }

    public void h(t7.o oVar) {
        if (this.f48a.E(oVar)) {
            if (this.f51d != null) {
                throw new f("Operation would modify integrity protected attributes");
            }
            this.f48a.K0(oVar);
        }
        if (this.f49b.E(oVar)) {
            this.f49b.K0(oVar);
        }
        if (this.f50c.E(oVar)) {
            this.f50c.K0(oVar);
        }
    }
}
