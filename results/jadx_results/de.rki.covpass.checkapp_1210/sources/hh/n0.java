package hh;

import gg.k1;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class n0 extends gg.t {

    /* renamed from: c */
    private b f12000c;

    /* renamed from: d */
    private gg.c f12001d;

    public n0(gg.d0 d0Var) {
        if (d0Var.size() == 2) {
            Enumeration H = d0Var.H();
            this.f12000c = b.n(H.nextElement());
            this.f12001d = k1.M(H.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public n0(b bVar, gg.g gVar) {
        this.f12001d = new k1(gVar);
        this.f12000c = bVar;
    }

    public n0(b bVar, byte[] bArr) {
        this.f12001d = new k1(bArr);
        this.f12000c = bVar;
    }

    public static n0 n(Object obj) {
        if (obj instanceof n0) {
            return (n0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new n0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12000c);
        hVar.a(this.f12001d);
        return new x1(hVar);
    }

    public b l() {
        return this.f12000c;
    }

    public b m() {
        return this.f12000c;
    }

    public gg.c o() {
        return this.f12001d;
    }

    public gg.a0 q() {
        return gg.a0.u(this.f12001d.G());
    }
}
