package ig;

import gg.a0;
import gg.d0;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class j extends t {

    /* renamed from: c */
    private final hh.b f12612c;

    /* renamed from: d */
    private final zg.k f12613d;

    /* renamed from: q */
    private final w f12614q;

    private j(d0 d0Var) {
        this.f12612c = hh.b.n(d0Var.G(0));
        this.f12613d = zg.k.m(d0Var.G(1));
        this.f12614q = w.E(d0Var.G(2));
    }

    public j(hh.b bVar, zg.k kVar, byte[] bArr) {
        this.f12612c = bVar;
        this.f12613d = kVar;
        this.f12614q = new t1(ak.a.h(bArr));
    }

    public static j l(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj == null) {
            return null;
        }
        return new j(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f12612c);
        hVar.a(this.f12613d);
        hVar.a(this.f12614q);
        return new x1(hVar);
    }

    public byte[] m() {
        return ak.a.h(this.f12614q.F());
    }

    public hh.b n() {
        return this.f12612c;
    }

    public zg.k o() {
        return this.f12613d;
    }
}
