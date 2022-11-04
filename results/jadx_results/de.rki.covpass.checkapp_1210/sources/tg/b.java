package tg;

import gg.a0;
import gg.d0;
import gg.h;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    w f22320c;

    private b(d0 d0Var) {
        this.f22320c = d0Var.size() == 1 ? (w) d0Var.G(0) : null;
    }

    public b(byte[] bArr) {
        this.f22320c = new t1(bArr);
    }

    public static b m(Object obj) {
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
        h hVar = new h(1);
        w wVar = this.f22320c;
        if (wVar != null) {
            hVar.a(wVar);
        }
        return new x1(hVar);
    }

    public byte[] l() {
        w wVar = this.f22320c;
        if (wVar != null) {
            return ak.a.h(wVar.F());
        }
        return null;
    }
}
