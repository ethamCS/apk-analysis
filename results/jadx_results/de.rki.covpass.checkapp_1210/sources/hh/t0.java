package hh;

import java.util.Enumeration;
/* loaded from: classes3.dex */
public class t0 extends gg.t {

    /* renamed from: c */
    private gg.d0 f12044c;

    private t0(gg.d0 d0Var) {
        this.f12044c = d0Var;
    }

    public static t0 l(Object obj) {
        if (obj instanceof t0) {
            return (t0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new t0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f12044c;
    }

    public r0[] m() {
        r0[] r0VarArr = new r0[this.f12044c.size()];
        Enumeration H = this.f12044c.H();
        int i10 = 0;
        while (H.hasMoreElements()) {
            r0VarArr[i10] = r0.l(H.nextElement());
            i10++;
        }
        return r0VarArr;
    }
}
