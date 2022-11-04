package e.a.a.e.h.j;

import e.a.a.e.e.h;
import e.a.a.e.h.f;
import e.a.a.g.k;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends f {
    public String D;
    public String E;
    public h F;
    public h G;
    public String H;
    public String I;
    public String J;

    public a() {
    }

    public a(f fVar) {
        this.f819a = fVar.f819a;
        this.f820b = fVar.f820b;
        this.f821c = fVar.f821c;
        this.f822d = fVar.f822d;
        this.f823e = fVar.f823e;
        this.f = fVar.f;
        this.g = fVar.g;
        this.h = fVar.h;
        this.k = fVar.k;
        this.m = fVar.m;
        this.n = fVar.n;
        this.o = fVar.o;
        this.r = fVar.r;
        this.t = fVar.t;
        this.u = fVar.u;
        this.l = fVar.l;
        this.x = fVar.x;
        this.q = fVar.q;
        this.p = fVar.p;
        this.A = fVar.A;
        this.C = fVar.C;
        this.y = fVar.y;
        this.z = fVar.z;
        this.B = fVar.B;
    }

    @Override // e.a.a.e.h.f, e.a.a.e.h.b
    public /* bridge */ /* synthetic */ e.a.a.e.h.b b(Map map) {
        p(map);
        return this;
    }

    @Override // e.a.a.e.h.f, e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.f, e.a.a.e.h.b
    public Map<String, Object> h() {
        Map<String, Object> h = super.h();
        h hVar = this.F;
        String str = null;
        h.put("actionLifeCycle", hVar != null ? hVar.toString() : null);
        h hVar2 = this.G;
        if (hVar2 != null) {
            str = hVar2.toString();
        }
        h.put("dismissedLifeCycle", str);
        h.put("actionKey", this.D);
        h.put("actionInput", this.E);
        h.put("actionDate", this.H);
        h.put("dismissedDate", this.I);
        h.put("mediaAction", this.J);
        return h;
    }

    @Override // e.a.a.e.h.f
    public /* bridge */ /* synthetic */ f k(Map map) {
        p(map);
        return this;
    }

    /* renamed from: o */
    public a j(String str) {
        return (a) super.e(str);
    }

    public a p(Map<String, Object> map) {
        super.b(map);
        this.D = (String) k.b(map, "actionKey", String.class).d();
        this.E = (String) k.b(map, "actionInput", String.class).d();
        this.H = (String) k.b(map, "actionDate", String.class).d();
        this.I = (String) k.b(map, "dismissedDate", String.class).d();
        this.J = (String) k.b(map, "mediaAction", String.class).d();
        this.F = (h) e.a.a.e.h.b.c(map, "actionLifeCycle", h.class, h.values());
        this.G = (h) e.a.a.e.h.b.c(map, "dismissedLifeCycle", h.class, h.values());
        return this;
    }
}
