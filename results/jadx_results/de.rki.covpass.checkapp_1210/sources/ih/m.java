package ih;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.v;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class m extends t implements o {

    /* renamed from: c */
    private v f12675c;

    /* renamed from: d */
    private a0 f12676d;

    public m(int i10, int i11) {
        this(i10, i11, 0, 0);
    }

    public m(int i10, int i11, int i12, int i13) {
        this.f12675c = o.J;
        gg.h hVar = new gg.h(3);
        hVar.a(new q(i10));
        if (i12 == 0) {
            if (i13 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            hVar.a(o.L);
            hVar.a(new q(i11));
        } else if (i12 <= i11 || i13 <= i12) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            hVar.a(o.M);
            gg.h hVar2 = new gg.h(3);
            hVar2.a(new q(i11));
            hVar2.a(new q(i12));
            hVar2.a(new q(i13));
            hVar.a(new x1(hVar2));
        }
        this.f12676d = new x1(hVar);
    }

    private m(d0 d0Var) {
        this.f12675c = v.K(d0Var.G(0));
        this.f12676d = d0Var.G(1).b();
    }

    public m(BigInteger bigInteger) {
        this.f12675c = o.I;
        this.f12676d = new q(bigInteger);
    }

    public static m m(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj == null) {
            return null;
        }
        return new m(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12675c);
        hVar.a(this.f12676d);
        return new x1(hVar);
    }

    public v l() {
        return this.f12675c;
    }

    public a0 n() {
        return this.f12676d;
    }
}
