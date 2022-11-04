package hh;

import java.util.Enumeration;
/* loaded from: classes3.dex */
public class s0 extends gg.t {

    /* renamed from: c */
    private gg.d0 f12041c;

    private s0(gg.d0 d0Var) {
        this.f12041c = d0Var;
    }

    public static s0 l(Object obj) {
        if (obj instanceof s0) {
            return (s0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new s0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f12041c;
    }

    public t0[] m() {
        t0[] t0VarArr = new t0[this.f12041c.size()];
        Enumeration H = this.f12041c.H();
        int i10 = 0;
        while (H.hasMoreElements()) {
            t0VarArr[i10] = t0.l(H.nextElement());
            i10++;
        }
        return t0VarArr;
    }
}
