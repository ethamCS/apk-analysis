package ig;

import gg.a0;
import gg.d0;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class d extends t {

    /* renamed from: c */
    private final hh.b f12595c;

    /* renamed from: d */
    private final w f12596d;

    private d(d0 d0Var) {
        this.f12595c = hh.b.n(d0Var.G(0));
        this.f12596d = w.E(d0Var.G(1));
    }

    public d(hh.b bVar, byte[] bArr) {
        this.f12595c = bVar;
        this.f12596d = new t1(ak.a.h(bArr));
    }

    public static d m(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj == null) {
            return null;
        }
        return new d(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12595c);
        hVar.a(this.f12596d);
        return new x1(hVar);
    }

    public byte[] l() {
        return ak.a.h(this.f12596d.F());
    }

    public hh.b n() {
        return this.f12595c;
    }
}
