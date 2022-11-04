package hh;

import gg.a2;
/* loaded from: classes3.dex */
public class c extends gg.t implements gg.f {

    /* renamed from: c */
    gg.g f11925c;

    /* renamed from: d */
    gg.a0 f11926d;

    public c(v0 v0Var) {
        this.f11925c = v0Var;
        this.f11926d = new a2(false, 0, v0Var);
    }

    public c(x xVar) {
        this.f11925c = xVar;
        this.f11926d = xVar.b();
    }

    public static c l(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof v0) {
            return new c(v0.n(obj));
        }
        if (obj instanceof x) {
            return new c((x) obj);
        }
        if (obj instanceof gg.j0) {
            return new c(v0.m((gg.j0) obj, false));
        }
        if (obj instanceof gg.d0) {
            return new c(x.n(obj));
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f11926d;
    }

    public gg.g m() {
        return this.f11925c;
    }
}
