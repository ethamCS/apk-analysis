package a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o extends p {

    /* renamed from: o */
    protected List<t> f114o = new ArrayList();

    public o() {
        this.f116m = "MAC";
        this.f120h = r.MAC;
    }

    @Override // a.q
    public void k(t7.o oVar) {
        if (oVar.D1() == 5) {
            t7.q s12 = oVar.j1(0).s1();
            t7.q qVar = t7.q.ByteString;
            if (s12 != qVar) {
                throw new f("Invalid MAC structure");
            }
            this.f48a = oVar.j1(0).j0().length == 0 ? t7.o.G0() : t7.o.F(oVar.j1(0).j0());
            if (oVar.j1(1).s1() != t7.q.Map) {
                throw new f("Invalid MAC structure");
            }
            this.f49b = oVar.j1(1);
            t7.q s13 = oVar.j1(2).s1();
            t7.o j12 = oVar.j1(2);
            if (s13 == qVar) {
                this.f121i = j12.j0();
            } else if (!j12.v1()) {
                throw new f("Invalid MAC structure");
            }
            if (oVar.j1(3).s1() != qVar) {
                throw new f("Invalid MAC structure");
            }
            this.f115l = oVar.j1(3).j0();
            if (oVar.j1(4).s1() != t7.q.Array) {
                throw new f("Invalid MAC structure");
            }
            for (int i10 = 0; i10 < oVar.j1(4).D1(); i10++) {
                t tVar = new t();
                tVar.k(oVar.j1(4).j1(i10));
                this.f114o.add(tVar);
            }
            return;
        }
        throw new f("Invalid MAC structure");
    }

    @Override // a.q
    protected t7.o l() {
        if (this.f115l != null) {
            t7.o D0 = t7.o.D0();
            if (this.f48a.D1() > 0) {
                D0.a(this.f48a.I());
            } else {
                D0.d(t7.o.b0(new byte[0]));
            }
            D0.d(this.f49b);
            D0.a(this.f121i);
            D0.a(this.f115l);
            t7.o D02 = t7.o.D0();
            for (t tVar : this.f114o) {
                D02.d(tVar.l());
            }
            D0.d(D02);
            return D0;
        }
        throw new f("Compute function not called");
    }
}
