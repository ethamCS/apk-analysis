package hh;

import gg.a2;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class f0 extends gg.t {

    /* renamed from: c */
    private y[] f11955c;

    /* renamed from: d */
    private y[] f11956d;

    private f0(gg.d0 d0Var) {
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            gg.j0 N = gg.j0.N(H.nextElement());
            int Q = N.Q();
            if (Q == 0) {
                this.f11955c = m(gg.d0.E(N, false));
            } else if (Q != 1) {
                throw new IllegalArgumentException("Unknown tag encountered: " + N.Q());
            } else {
                this.f11956d = m(gg.d0.E(N, false));
            }
        }
    }

    private static y[] l(y[] yVarArr) {
        if (yVarArr != null) {
            int length = yVarArr.length;
            y[] yVarArr2 = new y[length];
            System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
            return yVarArr2;
        }
        return null;
    }

    private y[] m(gg.d0 d0Var) {
        int size = d0Var.size();
        y[] yVarArr = new y[size];
        for (int i10 = 0; i10 != size; i10++) {
            yVarArr[i10] = y.m(d0Var.G(i10));
        }
        return yVarArr;
    }

    public static f0 o(Object obj) {
        if (obj instanceof f0) {
            return (f0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        if (this.f11955c != null) {
            hVar.a(new a2(false, 0, new x1(this.f11955c)));
        }
        if (this.f11956d != null) {
            hVar.a(new a2(false, 1, new x1(this.f11956d)));
        }
        return new x1(hVar);
    }

    public y[] n() {
        return l(this.f11956d);
    }

    public y[] q() {
        return l(this.f11955c);
    }
}
