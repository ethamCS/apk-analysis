package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class a extends gg.t {

    /* renamed from: q */
    public static final gg.v f11911q = new gg.v("1.3.6.1.5.5.7.48.2");

    /* renamed from: x */
    public static final gg.v f11912x = new gg.v("1.3.6.1.5.5.7.48.1");

    /* renamed from: c */
    gg.v f11913c;

    /* renamed from: d */
    w f11914d;

    private a(gg.d0 d0Var) {
        this.f11913c = null;
        this.f11914d = null;
        if (d0Var.size() == 2) {
            this.f11913c = gg.v.K(d0Var.G(0));
            this.f11914d = w.n(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("wrong number of elements in sequence");
    }

    public static a n(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj == null) {
            return null;
        }
        return new a(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11913c);
        hVar.a(this.f11914d);
        return new x1(hVar);
    }

    public w l() {
        return this.f11914d;
    }

    public gg.v m() {
        return this.f11913c;
    }

    public String toString() {
        return "AccessDescription: Oid(" + this.f11913c.H() + ")";
    }
}
