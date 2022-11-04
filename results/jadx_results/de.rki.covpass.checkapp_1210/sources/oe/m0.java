package oe;

import java.util.Iterator;
/* loaded from: classes3.dex */
public abstract class m0 extends q1 implements se.k, se.l {
    public m0() {
        super(null);
    }

    public abstract m0 d1(boolean z10);

    public abstract m0 e1(a1 a1Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<yc.c> it = j().iterator();
        while (it.hasNext()) {
            bf.u.i(sb2, "[", zd.c.s(zd.c.f26623i, it.next(), null, 2, null), "] ");
        }
        sb2.append(W0());
        if (!U0().isEmpty()) {
            ub.c0.c0(U0(), sb2, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (X0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
