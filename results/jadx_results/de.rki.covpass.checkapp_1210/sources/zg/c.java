package zg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.x1;
/* loaded from: classes3.dex */
public class c extends gg.t {

    /* renamed from: c */
    private gg.v f26753c;

    /* renamed from: d */
    private gg.g f26754d;

    private c(d0 d0Var) {
        this.f26753c = gg.v.K(d0Var.G(0));
        this.f26754d = j0.N(d0Var.G(1)).O();
    }

    public c(gg.v vVar, gg.g gVar) {
        this.f26753c = vVar;
        this.f26754d = gVar;
    }

    public static c n(Object obj) {
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
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26753c);
        hVar.a(new a2(0, this.f26754d));
        return new x1(hVar);
    }

    public gg.v l() {
        return this.f26753c;
    }

    public gg.g m() {
        return this.f26754d;
    }
}
