package zg;

import gg.a0;
import gg.d0;
import gg.e0;
import gg.x1;
/* loaded from: classes3.dex */
public class a extends gg.t {

    /* renamed from: c */
    private gg.v f26749c;

    /* renamed from: d */
    private e0 f26750d;

    public a(d0 d0Var) {
        this.f26749c = (gg.v) d0Var.G(0);
        this.f26750d = (e0) d0Var.G(1);
    }

    public static a n(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof d0) {
            return new a((d0) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26749c);
        hVar.a(this.f26750d);
        return new x1(hVar);
    }

    public gg.v l() {
        return this.f26749c;
    }

    public e0 m() {
        return this.f26750d;
    }
}
