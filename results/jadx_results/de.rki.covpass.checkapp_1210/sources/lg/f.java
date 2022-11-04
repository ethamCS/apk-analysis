package lg;

import gg.a0;
import gg.d0;
import gg.h;
import gg.t;
import gg.v;
import gg.x1;
/* loaded from: classes3.dex */
public class f extends t {

    /* renamed from: c */
    private v f16058c;

    /* renamed from: d */
    private v f16059d;

    /* renamed from: q */
    private v f16060q;

    private f(d0 d0Var) {
        this.f16058c = (v) d0Var.G(0);
        this.f16059d = (v) d0Var.G(1);
        if (d0Var.size() > 2) {
            this.f16060q = (v) d0Var.G(2);
        }
    }

    public f(v vVar, v vVar2) {
        this.f16058c = vVar;
        this.f16059d = vVar2;
        this.f16060q = null;
    }

    public f(v vVar, v vVar2, v vVar3) {
        this.f16058c = vVar;
        this.f16059d = vVar2;
        this.f16060q = vVar3;
    }

    public static f n(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(3);
        hVar.a(this.f16058c);
        hVar.a(this.f16059d);
        v vVar = this.f16060q;
        if (vVar != null) {
            hVar.a(vVar);
        }
        return new x1(hVar);
    }

    public v l() {
        return this.f16059d;
    }

    public v m() {
        return this.f16060q;
    }

    public v o() {
        return this.f16058c;
    }
}
