package zg;

import gg.a0;
import gg.d0;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class n extends gg.t implements q {

    /* renamed from: c */
    private k f26779c;

    /* renamed from: d */
    private j f26780d;

    private n(d0 d0Var) {
        Enumeration H = d0Var.H();
        d0 F = d0.F(((gg.g) H.nextElement()).b());
        gg.g G = F.G(0);
        gg.v vVar = q.f26863z1;
        if (G.equals(vVar)) {
            this.f26779c = new k(vVar, o.l(F.G(1)));
        } else {
            this.f26779c = k.m(F);
        }
        this.f26780d = j.m(H.nextElement());
    }

    public n(k kVar, j jVar) {
        this.f26779c = kVar;
        this.f26780d = jVar;
    }

    public static n m(Object obj) {
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
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26779c);
        hVar.a(this.f26780d);
        return new x1(hVar);
    }

    public j l() {
        return this.f26780d;
    }

    public k n() {
        return this.f26779c;
    }
}
