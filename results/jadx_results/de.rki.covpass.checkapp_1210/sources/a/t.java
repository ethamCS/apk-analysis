package a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class t extends q {

    /* renamed from: l */
    byte[] f133l;

    /* renamed from: m */
    List<t> f134m;

    @Override // a.q
    public void k(t7.o oVar) {
        if (oVar.D1() == 3 || oVar.D1() == 4) {
            t7.q s12 = oVar.j1(0).s1();
            t7.q qVar = t7.q.ByteString;
            if (s12 != qVar) {
                throw new f("Invalid Recipient structure");
            }
            this.f48a = oVar.j1(0).j0().length == 0 ? t7.o.G0() : t7.o.F(oVar.j1(0).j0());
            if (oVar.j1(1).s1() != t7.q.Map) {
                throw new f("Invalid Recipient structure");
            }
            this.f49b = oVar.j1(1);
            if (oVar.j1(2).s1() != qVar) {
                throw new f("Invalid Recipient structure");
            }
            this.f133l = oVar.j1(2).j0();
            if (oVar.D1() != 4) {
                return;
            }
            if (oVar.j1(3).s1() != t7.q.Array) {
                throw new f("Invalid Recipient structure");
            }
            this.f134m = new ArrayList();
            for (int i10 = 0; i10 < oVar.j1(3).D1(); i10++) {
                t tVar = new t();
                tVar.k(oVar.j1(3).j1(i10));
                this.f134m.add(tVar);
            }
            return;
        }
        throw new f("Invalid Recipient structure");
    }

    @Override // a.q
    public t7.o l() {
        t7.o D0 = t7.o.D0();
        if (this.f48a.D1() > 0) {
            D0.a(this.f48a.I());
        } else {
            D0.d(t7.o.b0(new byte[0]));
        }
        D0.d(this.f49b);
        D0.a(this.f133l);
        if (this.f134m != null) {
            t7.o D02 = t7.o.D0();
            for (t tVar : this.f134m) {
                D02.d(tVar.l());
            }
            D0.d(D02);
        }
        return D0;
    }
}
