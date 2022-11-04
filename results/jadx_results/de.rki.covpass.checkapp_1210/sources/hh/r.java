package hh;

import gg.t1;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class r extends gg.t {

    /* renamed from: c */
    private byte[] f12034c;

    /* renamed from: d */
    private b f12035d;

    public r(gg.d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f12035d = b.n(H.nextElement());
        this.f12034c = gg.w.E(H.nextElement()).F();
    }

    public r(b bVar, byte[] bArr) {
        this.f12034c = ak.a.h(bArr);
        this.f12035d = bVar;
    }

    public static r n(Object obj) {
        if (obj instanceof r) {
            return (r) obj;
        }
        if (obj == null) {
            return null;
        }
        return new r(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12035d);
        hVar.a(new t1(this.f12034c));
        return new x1(hVar);
    }

    public b l() {
        return this.f12035d;
    }

    public byte[] m() {
        return ak.a.h(this.f12034c);
    }
}
