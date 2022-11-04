package ig;

import gg.a0;
import gg.d0;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    private final hh.b f12591c;

    /* renamed from: d */
    private final w f12592d;

    private b(d0 d0Var) {
        this.f12591c = hh.b.n(d0Var.G(0));
        this.f12592d = w.E(d0Var.G(1));
    }

    public b(hh.b bVar, byte[] bArr) {
        this.f12591c = bVar;
        this.f12592d = new t1(bArr);
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12591c);
        hVar.a(this.f12592d);
        return new x1(hVar);
    }

    public w l() {
        return this.f12592d;
    }

    public hh.b m() {
        return this.f12591c;
    }
}
