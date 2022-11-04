package zg;

import gg.a0;
import gg.d0;
import gg.t1;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class i extends gg.t {

    /* renamed from: c */
    private hh.b f26769c;

    /* renamed from: d */
    private gg.w f26770d;

    private i(d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f26769c = hh.b.n(H.nextElement());
        this.f26770d = gg.w.E(H.nextElement());
    }

    public i(hh.b bVar, byte[] bArr) {
        this.f26769c = bVar;
        this.f26770d = new t1(bArr);
    }

    public static i n(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj == null) {
            return null;
        }
        return new i(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26769c);
        hVar.a(this.f26770d);
        return new x1(hVar);
    }

    public byte[] l() {
        return this.f26770d.F();
    }

    public hh.b m() {
        return this.f26769c;
    }
}
