package a;
/* loaded from: classes.dex */
public class u extends v {

    /* renamed from: m */
    byte[] f135m;

    public u() {
        this(true, true);
    }

    public u(boolean z10, boolean z11) {
        this.f118f = z10;
        this.f136l = "Signature1";
        this.f119g = z11;
        this.f120h = r.Sign1;
    }

    @Override // a.q
    protected void k(t7.o oVar) {
        if (oVar.D1() == 4) {
            t7.q s12 = oVar.j1(0).s1();
            t7.q qVar = t7.q.ByteString;
            if (s12 != qVar) {
                throw new f("Invalid Sign1 structure");
            }
            this.f51d = oVar.j1(0).j0();
            if (oVar.j1(0).j0().length == 0) {
                this.f48a = t7.o.G0();
            } else {
                t7.o F = t7.o.F(this.f51d);
                this.f48a = F;
                if (F.D1() == 0) {
                    this.f51d = new byte[0];
                }
            }
            if (oVar.j1(1).s1() != t7.q.Map) {
                throw new f("Invalid Sign1 structure");
            }
            this.f49b = oVar.j1(1);
            t7.q s13 = oVar.j1(2).s1();
            t7.o j12 = oVar.j1(2);
            if (s13 == qVar) {
                this.f121i = j12.j0();
            } else if (!j12.v1()) {
                throw new f("Invalid Sign1 structure");
            }
            if (oVar.j1(3).s1() != qVar) {
                throw new f("Invalid Sign1 structure");
            }
            this.f135m = oVar.j1(3).j0();
            return;
        }
        throw new f("Invalid Sign1 structure");
    }

    @Override // a.q
    protected t7.o l() {
        if (this.f135m != null) {
            if (this.f51d == null) {
                throw new f("Internal Error");
            }
            t7.o D0 = t7.o.D0();
            D0.a(this.f51d);
            D0.d(this.f49b);
            if (this.f119g) {
                D0.a(this.f121i);
            } else {
                D0.d(null);
            }
            D0.a(this.f135m);
            return D0;
        }
        throw new f("sign function not called");
    }

    public boolean v(s sVar) {
        t7.o D0 = t7.o.D0();
        D0.a(this.f136l);
        if (this.f48a.D1() > 0) {
            D0.a(this.f51d);
        } else {
            D0.d(t7.o.b0(new byte[0]));
        }
        D0.a(this.f52e);
        D0.a(this.f121i);
        return u(D0.I(), this.f135m, sVar);
    }
}
