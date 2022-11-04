package zg;

import gg.a0;
import gg.a1;
import gg.a2;
import gg.d0;
import gg.e0;
import gg.j0;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class z extends gg.t implements q {
    private e0 U3;

    /* renamed from: c */
    private gg.q f26895c;

    /* renamed from: d */
    private e0 f26896d;

    /* renamed from: q */
    private f f26897q;

    /* renamed from: x */
    private e0 f26898x;

    /* renamed from: y */
    private e0 f26899y;

    public z(d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f26895c = (gg.q) H.nextElement();
        this.f26896d = (e0) H.nextElement();
        this.f26897q = f.n(H.nextElement());
        while (H.hasMoreElements()) {
            a0 a0Var = (a0) H.nextElement();
            if (a0Var instanceof j0) {
                j0 j0Var = (j0) a0Var;
                int Q = j0Var.Q();
                if (Q == 0) {
                    this.f26898x = e0.D(j0Var, false);
                } else if (Q != 1) {
                    throw new IllegalArgumentException("unknown tag value " + j0Var.Q());
                } else {
                    this.f26899y = e0.D(j0Var, false);
                }
            } else {
                this.U3 = (e0) a0Var;
            }
        }
    }

    public z(gg.q qVar, e0 e0Var, f fVar, e0 e0Var2, e0 e0Var3, e0 e0Var4) {
        this.f26895c = qVar;
        this.f26896d = e0Var;
        this.f26897q = fVar;
        this.f26898x = e0Var2;
        this.f26899y = e0Var3;
        this.U3 = e0Var4;
    }

    public static z n(Object obj) {
        if (obj instanceof z) {
            return (z) obj;
        }
        if (obj == null) {
            return null;
        }
        return new z(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(6);
        hVar.a(this.f26895c);
        hVar.a(this.f26896d);
        hVar.a(this.f26897q);
        e0 e0Var = this.f26898x;
        if (e0Var != null) {
            hVar.a(new a2(false, 0, e0Var));
        }
        e0 e0Var2 = this.f26899y;
        if (e0Var2 != null) {
            hVar.a(new a2(false, 1, e0Var2));
        }
        hVar.a(this.U3);
        return new a1(hVar);
    }

    public e0 l() {
        return this.f26899y;
    }

    public e0 m() {
        return this.f26898x;
    }
}
