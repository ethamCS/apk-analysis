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
public class a extends t {

    /* renamed from: c */
    private byte[] f10984c;

    /* renamed from: d */
    private int f10985d;

    private a(d0 d0Var) {
        this.f10984c = w.E(d0Var.G(0)).F();
        this.f10985d = d0Var.size() == 2 ? q.E(d0Var.G(1)).M() : 12;
    }

    public a(byte[] bArr, int i10) {
        this.f10984c = ak.a.h(bArr);
        this.f10985d = i10;
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
        hVar.a(new t1(this.f10984c));
        if (this.f10985d != 12) {
            hVar.a(new q(this.f10985d));
        }
        return new x1(hVar);
    }

    public int l() {
        return this.f10985d;
    }

    public byte[] n() {
        return ak.a.h(this.f10984c);
    }
}
