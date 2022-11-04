package xg;

import gg.a0;
import gg.a2;
import gg.j0;
import gg.q0;
import gg.r;
import gg.r1;
import gg.t;
/* loaded from: classes3.dex */
public class c extends t implements gg.f {

    /* renamed from: c */
    private int f25616c;

    /* renamed from: d */
    private gg.g f25617d;

    public c() {
        this.f25616c = 0;
        this.f25617d = r1.f10880d;
    }

    private c(j0 j0Var) {
        gg.g gVar;
        int Q = j0Var.Q();
        if (Q != 0) {
            if (Q == 1) {
                gVar = l.l(j0Var, false);
                this.f25617d = gVar;
                this.f25616c = Q;
            } else if (Q != 2) {
                throw new IllegalArgumentException("Unknown tag encountered: " + q0.b(j0Var));
            }
        }
        gVar = r.D(j0Var, false);
        this.f25617d = gVar;
        this.f25616c = Q;
    }

    public static c l(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof j0) {
            return new c((j0) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return new a2(false, this.f25616c, this.f25617d);
    }

    public gg.g m() {
        return this.f25617d;
    }

    public int n() {
        return this.f25616c;
    }
}
