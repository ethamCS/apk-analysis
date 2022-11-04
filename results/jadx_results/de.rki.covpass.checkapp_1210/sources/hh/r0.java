package hh;

import gg.a2;
/* loaded from: classes3.dex */
public class r0 extends gg.t implements gg.f {

    /* renamed from: c */
    private w f12036c;

    /* renamed from: d */
    private w f12037d;

    private r0(gg.j0 j0Var) {
        int Q = j0Var.Q();
        if (Q == 0) {
            this.f12036c = w.m(j0Var, true);
        } else if (Q == 1) {
            this.f12037d = w.m(j0Var, true);
        } else {
            throw new IllegalArgumentException("unknown tag: " + j0Var.Q());
        }
    }

    public static r0 l(Object obj) {
        if (obj == null || (obj instanceof r0)) {
            return (r0) obj;
        }
        if (obj instanceof gg.j0) {
            return new r0((gg.j0) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        w wVar = this.f12036c;
        return wVar != null ? new a2(true, 0, wVar) : new a2(true, 1, this.f12037d);
    }

    public w m() {
        return this.f12037d;
    }

    public w n() {
        return this.f12036c;
    }
}
