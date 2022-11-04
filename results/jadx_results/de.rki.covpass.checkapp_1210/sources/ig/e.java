package ig;

import gg.a0;
import gg.b2;
import gg.d0;
import gg.m;
import gg.m0;
import gg.o1;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
import java.math.BigInteger;
import java.util.Date;
/* loaded from: classes3.dex */
public class e extends t {
    private final String U3;

    /* renamed from: c */
    private final BigInteger f12597c;

    /* renamed from: d */
    private final String f12598d;

    /* renamed from: q */
    private final m f12599q;

    /* renamed from: x */
    private final m f12600x;

    /* renamed from: y */
    private final w f12601y;

    private e(d0 d0Var) {
        this.f12597c = q.E(d0Var.G(0)).G();
        this.f12598d = m0.D(d0Var.G(1)).c();
        this.f12599q = m.J(d0Var.G(2));
        this.f12600x = m.J(d0Var.G(3));
        this.f12601y = w.E(d0Var.G(4));
        this.U3 = d0Var.size() == 6 ? m0.D(d0Var.G(5)).c() : null;
    }

    public e(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr, String str2) {
        this.f12597c = bigInteger;
        this.f12598d = str;
        this.f12599q = new o1(date);
        this.f12600x = new o1(date2);
        this.f12601y = new t1(ak.a.h(bArr));
        this.U3 = str2;
    }

    public static e o(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj == null) {
            return null;
        }
        return new e(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(6);
        hVar.a(new q(this.f12597c));
        hVar.a(new b2(this.f12598d));
        hVar.a(this.f12599q);
        hVar.a(this.f12600x);
        hVar.a(this.f12601y);
        if (this.U3 != null) {
            hVar.a(new b2(this.U3));
        }
        return new x1(hVar);
    }

    public m l() {
        return this.f12599q;
    }

    public byte[] m() {
        return ak.a.h(this.f12601y.F());
    }

    public String n() {
        return this.f12598d;
    }

    public m q() {
        return this.f12600x;
    }

    public BigInteger r() {
        return this.f12597c;
    }
}
