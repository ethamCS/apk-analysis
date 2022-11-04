package x2;

import ka.b;
import ka.d;
import rk.j;
import rk.n;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public double f25368a = 0.0d;

    /* renamed from: b */
    public double f25369b = 1.0d;

    /* renamed from: c */
    public double f25370c = 0.0d;

    /* renamed from: d */
    public double f25371d = 1.0d;

    /* renamed from: e */
    private j f25372e = new j();

    public void a(b bVar, b bVar2) {
        bVar2.f10622c = (bVar.f10622c - this.f25368a) / this.f25369b;
        bVar2.f10623d = (bVar.f10623d - this.f25370c) / this.f25371d;
    }

    public void b(d dVar, d dVar2) {
        double d10 = dVar.f10624c;
        double d11 = dVar.f10626q;
        dVar2.f10624c = (d10 - (this.f25368a * d11)) / this.f25369b;
        dVar2.f10625d = (dVar.f10625d - (d11 * this.f25370c)) / this.f25371d;
    }

    public n c(n nVar) {
        if (nVar == null) {
            nVar = new n(3, 3);
        } else {
            nVar.U(3, 3);
        }
        nVar.F(0, 0, 1.0d / this.f25369b);
        nVar.F(1, 1, 1.0d / this.f25371d);
        nVar.F(0, 2, (-this.f25368a) / this.f25369b);
        nVar.F(1, 2, (-this.f25370c) / this.f25371d);
        nVar.F(2, 2, 1.0d);
        return nVar;
    }

    public n d(n nVar) {
        if (nVar == null) {
            nVar = new n(3, 3);
        } else {
            nVar.U(3, 3);
        }
        nVar.F(0, 0, this.f25369b);
        nVar.F(1, 1, this.f25371d);
        nVar.F(0, 2, this.f25368a);
        nVar.F(1, 2, this.f25370c);
        nVar.F(2, 2, 1.0d);
        return nVar;
    }
}
