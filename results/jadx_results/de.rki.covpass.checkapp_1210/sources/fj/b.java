package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    private final int f10241c;

    /* renamed from: d */
    private final int f10242d;

    /* renamed from: q */
    private final zj.a f10243q;

    /* renamed from: x */
    private final hh.b f10244x;

    public b(int i10, int i11, zj.a aVar, hh.b bVar) {
        this.f10241c = i10;
        this.f10242d = i11;
        this.f10243q = new zj.a(aVar.c());
        this.f10244x = bVar;
    }

    private b(d0 d0Var) {
        this.f10241c = ((q) d0Var.G(0)).M();
        this.f10242d = ((q) d0Var.G(1)).M();
        this.f10243q = new zj.a(((w) d0Var.G(2)).F());
        this.f10244x = hh.b.n(d0Var.G(3));
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(new q(this.f10241c));
        hVar.a(new q(this.f10242d));
        hVar.a(new t1(this.f10243q.c()));
        hVar.a(this.f10244x);
        return new x1(hVar);
    }

    public hh.b l() {
        return this.f10244x;
    }

    public zj.a m() {
        return this.f10243q;
    }

    public int o() {
        return this.f10241c;
    }

    public int q() {
        return this.f10242d;
    }
}
