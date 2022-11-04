package tg;

import gg.a0;
import gg.d0;
import gg.h;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    q f22318c;

    /* renamed from: d */
    w f22319d;

    private a(d0 d0Var) {
        this.f22319d = (w) d0Var.G(0);
        this.f22318c = (q) d0Var.G(1);
    }

    public a(byte[] bArr, int i10) {
        this.f22319d = new t1(ak.a.h(bArr));
        this.f22318c = new q(i10);
    }

    public static a m(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj == null) {
            return null;
        }
        return new a(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        hVar.a(this.f22319d);
        hVar.a(this.f22318c);
        return new x1(hVar);
    }

    public byte[] l() {
        return ak.a.h(this.f22319d.F());
    }

    public int n() {
        return this.f22318c.M();
    }
}
