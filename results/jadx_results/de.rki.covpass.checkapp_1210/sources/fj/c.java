package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class c extends t {
    private byte[] U3;
    private byte[] V3;

    /* renamed from: c */
    private int f10245c;

    /* renamed from: d */
    private int f10246d;

    /* renamed from: q */
    private byte[] f10247q;

    /* renamed from: x */
    private byte[] f10248x;

    /* renamed from: y */
    private byte[] f10249y;

    public c(int i10, int i11, zj.b bVar, zj.i iVar, zj.h hVar, zj.h hVar2, zj.a aVar) {
        this.f10245c = i10;
        this.f10246d = i11;
        this.f10247q = bVar.e();
        this.f10248x = iVar.h();
        this.f10249y = aVar.c();
        this.U3 = hVar.a();
        this.V3 = hVar2.a();
    }

    private c(d0 d0Var) {
        this.f10245c = ((q) d0Var.G(0)).M();
        this.f10246d = ((q) d0Var.G(1)).M();
        this.f10247q = ((w) d0Var.G(2)).F();
        this.f10248x = ((w) d0Var.G(3)).F();
        this.U3 = ((w) d0Var.G(4)).F();
        this.V3 = ((w) d0Var.G(5)).F();
        this.f10249y = ((w) d0Var.G(6)).F();
    }

    public static c n(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(new q(this.f10245c));
        hVar.a(new q(this.f10246d));
        hVar.a(new t1(this.f10247q));
        hVar.a(new t1(this.f10248x));
        hVar.a(new t1(this.U3));
        hVar.a(new t1(this.V3));
        hVar.a(new t1(this.f10249y));
        return new x1(hVar);
    }

    public zj.b l() {
        return new zj.b(this.f10247q);
    }

    public zj.i m() {
        return new zj.i(l(), this.f10248x);
    }

    public int o() {
        return this.f10246d;
    }

    public int q() {
        return this.f10245c;
    }

    public zj.h r() {
        return new zj.h(this.U3);
    }

    public zj.h s() {
        return new zj.h(this.V3);
    }

    public zj.a u() {
        return new zj.a(this.f10249y);
    }
}
