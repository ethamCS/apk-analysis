package a;
/* loaded from: classes.dex */
public class i extends j {
    public i() {
        this(true, true);
    }

    public i(boolean z10, boolean z11) {
        this.f63r = "Encrypt0";
        this.f120h = r.Encrypt0;
        this.f118f = z10;
        this.f119g = z11;
    }

    @Override // a.q
    public void k(t7.o oVar) {
        if (oVar.D1() == 3) {
            t7.q s12 = oVar.j1(0).s1();
            t7.q qVar = t7.q.ByteString;
            if (s12 != qVar) {
                throw new f("Invalid Encrypt0 structure");
            }
            if (oVar.j1(0).j0().length == 0) {
                this.f51d = new byte[0];
                this.f48a = t7.o.G0();
            } else {
                byte[] j02 = oVar.j1(0).j0();
                this.f51d = j02;
                t7.o F = t7.o.F(j02);
                this.f48a = F;
                if (F.s1() != t7.q.Map) {
                    throw new f("Invalid Encrypt0 structure");
                }
            }
            if (oVar.j1(1).s1() != t7.q.Map) {
                throw new f("Invalid Encrypt0 structure");
            }
            this.f49b = oVar.j1(1);
            t7.q s13 = oVar.j1(2).s1();
            t7.o j12 = oVar.j1(2);
            if (s13 == qVar) {
                this.f64s = j12.j0();
                return;
            } else if (!j12.v1()) {
                throw new f("Invalid Encrypt0 structure");
            } else {
                return;
            }
        }
        throw new f("Invalid Encrypt0 structure");
    }

    @Override // a.q
    protected t7.o l() {
        if (this.f64s != null) {
            t7.o D0 = t7.o.D0();
            if (this.f48a.D1() > 0) {
                D0.a(this.f48a.I());
            } else {
                D0.d(t7.o.b0(new byte[0]));
            }
            D0.d(this.f49b);
            if (this.f119g) {
                D0.a(this.f64s);
            } else {
                D0.d(t7.o.W3);
            }
            return D0;
        }
        throw new f("Encrypt function not called");
    }
}
