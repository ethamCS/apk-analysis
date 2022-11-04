package dh;

import gg.a0;
import gg.d0;
import gg.h;
import gg.q;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    private int f9040c;

    /* renamed from: d */
    private int f9041d;

    /* renamed from: q */
    private int f9042q;

    /* renamed from: x */
    private int f9043x;

    private a(d0 d0Var) {
        this.f9040c = q.E(d0Var.G(0)).K();
        if (d0Var.G(1) instanceof q) {
            this.f9041d = ((q) d0Var.G(1)).K();
        } else if (!(d0Var.G(1) instanceof d0)) {
            throw new IllegalArgumentException("object parse error");
        } else {
            d0 F = d0.F(d0Var.G(1));
            this.f9041d = q.E(F.G(0)).K();
            this.f9042q = q.E(F.G(1)).K();
            this.f9043x = q.E(F.G(2)).K();
        }
    }

    public static a l(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj == null) {
            return null;
        }
        return new a(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        hVar.a(new q(this.f9040c));
        if (this.f9042q == 0) {
            hVar.a(new q(this.f9041d));
        } else {
            h hVar2 = new h(3);
            hVar2.a(new q(this.f9041d));
            hVar2.a(new q(this.f9042q));
            hVar2.a(new q(this.f9043x));
            hVar.a(new x1(hVar2));
        }
        return new x1(hVar);
    }

    public int m() {
        return this.f9041d;
    }

    public int n() {
        return this.f9042q;
    }

    public int o() {
        return this.f9043x;
    }

    public int q() {
        return this.f9040c;
    }
}
