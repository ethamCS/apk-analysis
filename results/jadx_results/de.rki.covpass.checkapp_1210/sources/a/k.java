package a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class k extends j {

    /* renamed from: u */
    protected List<t> f66u;

    public k() {
        this(true);
    }

    public k(boolean z10) {
        this.f66u = new ArrayList();
        this.f118f = z10;
        this.f120h = r.Encrypt;
        this.f63r = "Encrypt";
    }

    @Override // a.q
    public void k(t7.o oVar) {
        if (oVar.D1() == 4) {
            t7.q s12 = oVar.j1(0).s1();
            t7.q qVar = t7.q.ByteString;
            if (s12 != qVar) {
                throw new f("Invalid Encrypt structure");
            }
            this.f48a = oVar.j1(0).j0().length == 0 ? t7.o.G0() : t7.o.F(oVar.j1(0).j0());
            if (oVar.j1(1).s1() != t7.q.Map) {
                throw new f("Invalid Encrypt structure");
            }
            this.f49b = oVar.j1(1);
            t7.q s13 = oVar.j1(2).s1();
            t7.o j12 = oVar.j1(2);
            if (s13 == qVar) {
                this.f64s = j12.j0();
            } else if (!j12.v1()) {
                throw new f("Invalid Encrypt structure");
            }
            if (oVar.j1(3).s1() != t7.q.Array) {
                throw new f("Invalid Encrypt structure");
            }
            for (int i10 = 0; i10 < oVar.j1(3).D1(); i10++) {
                t tVar = new t();
                tVar.k(oVar.j1(3).j1(i10));
                this.f66u.add(tVar);
            }
            return;
        }
        throw new f("Invalid Encrypt structure");
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
            D0.a(this.f64s);
            t7.o D02 = t7.o.D0();
            for (t tVar : this.f66u) {
                D02.d(tVar.l());
            }
            D0.d(D02);
            return D0;
        }
        throw new f("Compute function not called");
    }
}
