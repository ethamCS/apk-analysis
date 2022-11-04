package ig;

import gg.a0;
import gg.d0;
import gg.t;
import gg.t1;
import gg.v;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class k extends t {

    /* renamed from: c */
    private final v f12615c;

    /* renamed from: d */
    private final w f12616d;

    private k(d0 d0Var) {
        this.f12615c = v.K(d0Var.G(0));
        this.f12616d = w.E(d0Var.G(1));
    }

    public k(v vVar, byte[] bArr) {
        this.f12615c = vVar;
        this.f12616d = new t1(ak.a.h(bArr));
    }

    public static k l(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj == null) {
            return null;
        }
        return new k(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12615c);
        hVar.a(this.f12616d);
        return new x1(hVar);
    }

    public v m() {
        return this.f12615c;
    }

    public byte[] n() {
        return ak.a.h(this.f12616d.F());
    }
}
