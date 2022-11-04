package b.e.b.k.m;

import b.e.b.k.m.f;
/* loaded from: classes.dex */
public class k extends p {
    public k(b.e.b.k.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f2330h.k.add(fVar);
        fVar.l.add(this.f2330h);
    }

    @Override // b.e.b.k.m.p, b.e.b.k.m.d
    public void a(d dVar) {
        b.e.b.k.a aVar = (b.e.b.k.a) this.f2324b;
        int e1 = aVar.e1();
        int i = 0;
        int i2 = -1;
        for (f fVar : this.f2330h.l) {
            int i3 = fVar.f2301g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (e1 == 0 || e1 == 2) {
            this.f2330h.d(i2 + aVar.f1());
        } else {
            this.f2330h.d(i + aVar.f1());
        }
    }

    @Override // b.e.b.k.m.p
    public void d() {
        p pVar;
        b.e.b.k.e eVar = this.f2324b;
        if (eVar instanceof b.e.b.k.a) {
            this.f2330h.f2296b = true;
            b.e.b.k.a aVar = (b.e.b.k.a) eVar;
            int e1 = aVar.e1();
            boolean d1 = aVar.d1();
            int i = 0;
            if (e1 == 0) {
                this.f2330h.f2299e = f.a.LEFT;
                while (i < aVar.q0) {
                    b.e.b.k.e eVar2 = aVar.p0[i];
                    if (d1 || eVar2.Q() != 8) {
                        f fVar = eVar2.f2262d.f2330h;
                        fVar.k.add(this.f2330h);
                        this.f2330h.l.add(fVar);
                    }
                    i++;
                }
            } else if (e1 != 1) {
                if (e1 == 2) {
                    this.f2330h.f2299e = f.a.TOP;
                    while (i < aVar.q0) {
                        b.e.b.k.e eVar3 = aVar.p0[i];
                        if (d1 || eVar3.Q() != 8) {
                            f fVar2 = eVar3.f2263e.f2330h;
                            fVar2.k.add(this.f2330h);
                            this.f2330h.l.add(fVar2);
                        }
                        i++;
                    }
                } else if (e1 != 3) {
                    return;
                } else {
                    this.f2330h.f2299e = f.a.BOTTOM;
                    while (i < aVar.q0) {
                        b.e.b.k.e eVar4 = aVar.p0[i];
                        if (d1 || eVar4.Q() != 8) {
                            f fVar3 = eVar4.f2263e.i;
                            fVar3.k.add(this.f2330h);
                            this.f2330h.l.add(fVar3);
                        }
                        i++;
                    }
                }
                q(this.f2324b.f2263e.f2330h);
                pVar = this.f2324b.f2263e;
                q(pVar.i);
            } else {
                this.f2330h.f2299e = f.a.RIGHT;
                while (i < aVar.q0) {
                    b.e.b.k.e eVar5 = aVar.p0[i];
                    if (d1 || eVar5.Q() != 8) {
                        f fVar4 = eVar5.f2262d.i;
                        fVar4.k.add(this.f2330h);
                        this.f2330h.l.add(fVar4);
                    }
                    i++;
                }
            }
            q(this.f2324b.f2262d.f2330h);
            pVar = this.f2324b.f2262d;
            q(pVar.i);
        }
    }

    @Override // b.e.b.k.m.p
    public void e() {
        b.e.b.k.e eVar = this.f2324b;
        if (eVar instanceof b.e.b.k.a) {
            int e1 = ((b.e.b.k.a) eVar).e1();
            if (e1 == 0 || e1 == 1) {
                this.f2324b.V0(this.f2330h.f2301g);
            } else {
                this.f2324b.W0(this.f2330h.f2301g);
            }
        }
    }

    @Override // b.e.b.k.m.p
    public void f() {
        this.f2325c = null;
        this.f2330h.c();
    }

    @Override // b.e.b.k.m.p
    public boolean m() {
        return false;
    }
}
