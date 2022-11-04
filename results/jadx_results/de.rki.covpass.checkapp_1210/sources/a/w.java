package a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class w extends q {

    /* renamed from: l */
    protected List<x> f138l = new ArrayList();

    public w() {
        this.f120h = r.Sign;
    }

    @Override // a.q
    protected void k(t7.o oVar) {
        if (oVar.D1() == 4) {
            t7.q s12 = oVar.j1(0).s1();
            t7.q qVar = t7.q.ByteString;
            if (s12 != qVar) {
                throw new f("Invalid SignMessage structure");
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
                throw new f("Invalid SignMessage structure");
            }
            this.f49b = oVar.j1(1);
            t7.q s13 = oVar.j1(2).s1();
            t7.o j12 = oVar.j1(2);
            if (s13 == qVar) {
                this.f121i = j12.j0();
            } else if (!j12.v1()) {
                throw new f("Invalid SignMessage structure");
            }
            if (oVar.j1(3).s1() != t7.q.Array) {
                throw new f("Invalid SignMessage structure");
            }
            for (int i10 = 0; i10 < oVar.j1(3).D1(); i10++) {
                x xVar = new x();
                xVar.i(oVar.j1(3).j1(i10));
                this.f138l.add(xVar);
            }
            return;
        }
        throw new f("Invalid SignMessage structure");
    }

    @Override // a.q
    protected t7.o l() {
        q();
        t7.o D0 = t7.o.D0();
        D0.a(this.f51d);
        D0.d(this.f49b);
        if (this.f119g) {
            D0.a(this.f121i);
        } else {
            D0.d(null);
        }
        t7.o D02 = t7.o.D0();
        D0.d(D02);
        for (x xVar : this.f138l) {
            D02.d(xVar.j());
        }
        return D0;
    }

    public void q() {
        if (this.f51d == null) {
            if (this.f48a.D1() == 0) {
                this.f51d = new byte[0];
            } else {
                this.f51d = this.f48a.I();
            }
        }
        for (x xVar : this.f138l) {
            xVar.m(this.f51d, this.f121i);
        }
        o();
    }
}
