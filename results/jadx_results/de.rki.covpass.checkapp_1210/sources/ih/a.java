package ih;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    private q f12620c;

    /* renamed from: d */
    private q f12621d;

    /* renamed from: q */
    private q f12622q;

    /* renamed from: x */
    private q f12623x;

    /* renamed from: y */
    private b f12624y;

    private a(d0 d0Var) {
        if (d0Var.size() < 3 || d0Var.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        Enumeration H = d0Var.H();
        this.f12620c = q.E(H.nextElement());
        this.f12621d = q.E(H.nextElement());
        this.f12622q = q.E(H.nextElement());
        gg.g n10 = n(H);
        if (n10 != null && (n10 instanceof q)) {
            this.f12623x = q.E(n10);
            n10 = n(H);
        }
        if (n10 == null) {
            return;
        }
        this.f12624y = b.l(n10.b());
    }

    public static a m(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof d0) {
            return new a((d0) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    private static gg.g n(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (gg.g) enumeration.nextElement();
        }
        return null;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(5);
        hVar.a(this.f12620c);
        hVar.a(this.f12621d);
        hVar.a(this.f12622q);
        q qVar = this.f12623x;
        if (qVar != null) {
            hVar.a(qVar);
        }
        b bVar = this.f12624y;
        if (bVar != null) {
            hVar.a(bVar);
        }
        return new x1(hVar);
    }

    public q l() {
        return this.f12621d;
    }

    public q o() {
        return this.f12620c;
    }
}
