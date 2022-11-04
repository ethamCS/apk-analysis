package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class n extends t {

    /* renamed from: c */
    private final byte[] f10310c;

    /* renamed from: d */
    private final byte[] f10311d;

    private n(d0 d0Var) {
        if (q.E(d0Var.G(0)).H(0)) {
            this.f10310c = ak.a.h(w.E(d0Var.G(1)).F());
            this.f10311d = ak.a.h(w.E(d0Var.G(2)).F());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f10310c = ak.a.h(bArr);
        this.f10311d = ak.a.h(bArr2);
    }

    public static n l(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj == null) {
            return null;
        }
        return new n(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(new q(0L));
        hVar.a(new t1(this.f10310c));
        hVar.a(new t1(this.f10311d));
        return new x1(hVar);
    }

    public byte[] m() {
        return ak.a.h(this.f10310c);
    }

    public byte[] n() {
        return ak.a.h(this.f10311d);
    }
}
