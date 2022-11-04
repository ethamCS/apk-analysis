package a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class x extends e {

    /* renamed from: f */
    protected byte[] f139f;

    /* renamed from: h */
    s f141h;

    /* renamed from: j */
    g f143j;

    /* renamed from: i */
    List<h> f142i = new ArrayList();

    /* renamed from: g */
    protected String f140g = "Signature";

    public void i(t7.o oVar) {
        t7.q s12 = oVar.s1();
        t7.q qVar = t7.q.Array;
        if (s12 == qVar) {
            if (oVar.D1() != 3) {
                throw new f("Invalid Signer structure");
            }
            t7.q s13 = oVar.j1(0).s1();
            t7.q qVar2 = t7.q.ByteString;
            if (s13 != qVar2) {
                throw new f("Invalid Signer structure");
            }
            byte[] j02 = oVar.j1(0).j0();
            this.f51d = j02;
            if (j02.length == 0) {
                this.f48a = t7.o.G0();
            } else {
                t7.o F = t7.o.F(j02);
                this.f48a = F;
                if (F.D1() == 0) {
                    this.f51d = new byte[0];
                }
            }
            if (oVar.j1(1).s1() != t7.q.Map) {
                throw new f("Invalid Signer structure");
            }
            this.f49b = oVar.j1(1);
            t7.q s14 = oVar.j1(2).s1();
            t7.o j12 = oVar.j1(2);
            if (s14 == qVar2) {
                this.f139f = j12.j0();
            } else if (!j12.v1()) {
                throw new f("Invalid Signer structure");
            }
            t7.o d10 = d(l.CounterSignature, 2);
            if (d10 != null) {
                if (d10.s1() != qVar || d10.t1().isEmpty()) {
                    throw new f("Invalid countersignature attribute");
                }
                if (d10.j1(0).s1() == qVar) {
                    for (t7.o oVar2 : d10.t1()) {
                        if (oVar2.s1() != t7.q.Array) {
                            throw new f("Invalid countersignature attribute");
                        }
                        h hVar = new h(oVar2);
                        hVar.o(this);
                        l(hVar);
                    }
                } else {
                    h hVar2 = new h(d10);
                    hVar2.o(this);
                    l(hVar2);
                }
            }
            t7.o d11 = d(l.CounterSignature0, 2);
            if (d11 == null) {
                return;
            }
            if (d11.s1() != t7.q.ByteString) {
                throw new f("Invalid Countersignature0 attribute");
            }
            g gVar = new g(d11.j0());
            gVar.o(this);
            this.f143j = gVar;
            return;
        }
        throw new f("Invalid Signer structure");
    }

    public t7.o j() {
        if (this.f139f != null) {
            if (this.f51d == null) {
                throw new f("Internal Error");
            }
            t7.o D0 = t7.o.D0();
            D0.a(this.f51d);
            D0.d(this.f49b);
            D0.a(this.f139f);
            return D0;
        }
        throw new f("Message not yet signed");
    }

    protected void k() {
        if (!this.f142i.isEmpty()) {
            if (this.f142i.size() == 1) {
                this.f142i.get(0).m(this.f51d, this.f139f);
                a(l.CounterSignature, this.f142i.get(0).j(), 2);
            } else {
                t7.o D0 = t7.o.D0();
                for (h hVar : this.f142i) {
                    hVar.m(this.f51d, this.f139f);
                    D0.d(hVar.j());
                }
                a(l.CounterSignature, D0, 2);
            }
        }
        g gVar = this.f143j;
        if (gVar != null) {
            gVar.m(this.f51d, this.f139f);
            a(l.CounterSignature0, this.f143j.j(), 2);
        }
    }

    public void l(h hVar) {
        this.f142i.add(hVar);
    }

    public void m(byte[] bArr, byte[] bArr2) {
        if (this.f51d == null) {
            if (this.f48a.D1() == 0) {
                this.f51d = new byte[0];
            } else {
                this.f51d = this.f48a.I();
            }
        }
        t7.o D0 = t7.o.D0();
        D0.a(this.f140g);
        D0.a(bArr);
        D0.a(this.f51d);
        D0.a(this.f52e);
        D0.a(bArr2);
        this.f139f = v.q(d.b(c(l.Algorithm)), D0.I(), this.f141h);
        k();
    }
}
