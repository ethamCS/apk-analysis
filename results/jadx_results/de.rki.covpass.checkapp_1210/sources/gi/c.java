package gi;

import gg.a0;
import gg.d0;
import gg.h;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class c extends t {

    /* renamed from: c */
    private byte[] f11004c;

    /* renamed from: d */
    private int f11005d;

    private c(d0 d0Var) {
        this.f11004c = w.E(d0Var.G(0)).F();
        this.f11005d = d0Var.size() == 2 ? q.E(d0Var.G(1)).M() : 12;
    }

    public c(byte[] bArr, int i10) {
        this.f11004c = ak.a.h(bArr);
        this.f11005d = i10;
    }

    public static c m(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        hVar.a(new t1(this.f11004c));
        if (this.f11005d != 12) {
            hVar.a(new q(this.f11005d));
        }
        return new x1(hVar);
    }

    public int l() {
        return this.f11005d;
    }

    public byte[] n() {
        return ak.a.h(this.f11004c);
    }
}
