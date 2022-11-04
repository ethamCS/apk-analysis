package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class a extends t {
    private hh.b U3;

    /* renamed from: c */
    private int f10236c;

    /* renamed from: d */
    private int f10237d;

    /* renamed from: q */
    private byte[] f10238q;

    /* renamed from: x */
    private byte[] f10239x;

    /* renamed from: y */
    private byte[] f10240y;

    public a(int i10, int i11, zj.b bVar, zj.i iVar, zj.h hVar, hh.b bVar2) {
        this.f10236c = i10;
        this.f10237d = i11;
        this.f10238q = bVar.e();
        this.f10239x = iVar.h();
        this.f10240y = hVar.a();
        this.U3 = bVar2;
    }

    private a(d0 d0Var) {
        this.f10236c = ((q) d0Var.G(0)).M();
        this.f10237d = ((q) d0Var.G(1)).M();
        this.f10238q = ((w) d0Var.G(2)).F();
        this.f10239x = ((w) d0Var.G(3)).F();
        this.f10240y = ((w) d0Var.G(4)).F();
        this.U3 = hh.b.n(d0Var.G(5));
    }

    public static a o(Object obj) {
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
        gg.h hVar = new gg.h();
        hVar.a(new q(this.f10236c));
        hVar.a(new q(this.f10237d));
        hVar.a(new t1(this.f10238q));
        hVar.a(new t1(this.f10239x));
        hVar.a(new t1(this.f10240y));
        hVar.a(this.U3);
        return new x1(hVar);
    }

    public hh.b l() {
        return this.U3;
    }

    public zj.b m() {
        return new zj.b(this.f10238q);
    }

    public zj.i n() {
        return new zj.i(m(), this.f10239x);
    }

    public int q() {
        return this.f10237d;
    }

    public int r() {
        return this.f10236c;
    }

    public zj.h s() {
        return new zj.h(this.f10240y);
    }
}
