package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.v;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class g extends t {
    private byte[] U3;

    /* renamed from: c */
    private q f10284c;

    /* renamed from: d */
    private v f10285d;

    /* renamed from: q */
    private q f10286q;

    /* renamed from: x */
    private byte[][] f10287x;

    /* renamed from: y */
    private byte[][] f10288y;

    public g(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f10284c = new q(0L);
        this.f10286q = new q(i10);
        this.f10287x = lj.a.c(sArr);
        this.f10288y = lj.a.c(sArr2);
        this.U3 = lj.a.a(sArr3);
    }

    private g(d0 d0Var) {
        if (d0Var.G(0) instanceof q) {
            this.f10284c = q.E(d0Var.G(0));
        } else {
            this.f10285d = v.K(d0Var.G(0));
        }
        this.f10286q = q.E(d0Var.G(1));
        d0 F = d0.F(d0Var.G(2));
        this.f10287x = new byte[F.size()];
        for (int i10 = 0; i10 < F.size(); i10++) {
            this.f10287x[i10] = w.E(F.G(i10)).F();
        }
        d0 d0Var2 = (d0) d0Var.G(3);
        this.f10288y = new byte[d0Var2.size()];
        for (int i11 = 0; i11 < d0Var2.size(); i11++) {
            this.f10288y[i11] = w.E(d0Var2.G(i11)).F();
        }
        this.U3 = w.E(((d0) d0Var.G(4)).G(0)).F();
    }

    public static g q(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj == null) {
            return null;
        }
        return new g(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        gg.g gVar = this.f10284c;
        if (gVar == null) {
            gVar = this.f10285d;
        }
        hVar.a(gVar);
        hVar.a(this.f10286q);
        gg.h hVar2 = new gg.h();
        for (int i10 = 0; i10 < this.f10287x.length; i10++) {
            hVar2.a(new t1(this.f10287x[i10]));
        }
        hVar.a(new x1(hVar2));
        gg.h hVar3 = new gg.h();
        for (int i11 = 0; i11 < this.f10288y.length; i11++) {
            hVar3.a(new t1(this.f10288y[i11]));
        }
        hVar.a(new x1(hVar3));
        gg.h hVar4 = new gg.h();
        hVar4.a(new t1(this.U3));
        hVar.a(new x1(hVar4));
        return new x1(hVar);
    }

    public short[][] l() {
        return lj.a.d(this.f10287x);
    }

    public short[] m() {
        return lj.a.b(this.U3);
    }

    public short[][] n() {
        return lj.a.d(this.f10288y);
    }

    public int o() {
        return this.f10286q.M();
    }
}
