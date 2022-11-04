package n0;

import n0.f;
/* loaded from: classes.dex */
public class k extends p {
    public k(m0.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f16832h.f16786k.add(fVar);
        fVar.f16787l.add(this.f16832h);
    }

    @Override // n0.p, n0.d
    public void a(d dVar) {
        m0.a aVar = (m0.a) this.f16826b;
        int s12 = aVar.s1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f16832h.f16787l) {
            int i12 = fVar.f16782g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (s12 == 0 || s12 == 2) {
            this.f16832h.d(i11 + aVar.t1());
        } else {
            this.f16832h.d(i10 + aVar.t1());
        }
    }

    @Override // n0.p
    public void d() {
        p pVar;
        m0.e eVar = this.f16826b;
        if (eVar instanceof m0.a) {
            this.f16832h.f16777b = true;
            m0.a aVar = (m0.a) eVar;
            int s12 = aVar.s1();
            boolean r12 = aVar.r1();
            int i10 = 0;
            if (s12 == 0) {
                this.f16832h.f16780e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    m0.e eVar2 = aVar.L0[i10];
                    if (r12 || eVar2.T() != 8) {
                        f fVar = eVar2.f16177e.f16832h;
                        fVar.f16786k.add(this.f16832h);
                        this.f16832h.f16787l.add(fVar);
                    }
                    i10++;
                }
            } else if (s12 != 1) {
                if (s12 == 2) {
                    this.f16832h.f16780e = f.a.TOP;
                    while (i10 < aVar.M0) {
                        m0.e eVar3 = aVar.L0[i10];
                        if (r12 || eVar3.T() != 8) {
                            f fVar2 = eVar3.f16179f.f16832h;
                            fVar2.f16786k.add(this.f16832h);
                            this.f16832h.f16787l.add(fVar2);
                        }
                        i10++;
                    }
                } else if (s12 != 3) {
                    return;
                } else {
                    this.f16832h.f16780e = f.a.BOTTOM;
                    while (i10 < aVar.M0) {
                        m0.e eVar4 = aVar.L0[i10];
                        if (r12 || eVar4.T() != 8) {
                            f fVar3 = eVar4.f16179f.f16833i;
                            fVar3.f16786k.add(this.f16832h);
                            this.f16832h.f16787l.add(fVar3);
                        }
                        i10++;
                    }
                }
                q(this.f16826b.f16179f.f16832h);
                pVar = this.f16826b.f16179f;
                q(pVar.f16833i);
            } else {
                this.f16832h.f16780e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    m0.e eVar5 = aVar.L0[i10];
                    if (r12 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f16177e.f16833i;
                        fVar4.f16786k.add(this.f16832h);
                        this.f16832h.f16787l.add(fVar4);
                    }
                    i10++;
                }
            }
            q(this.f16826b.f16177e.f16832h);
            pVar = this.f16826b.f16177e;
            q(pVar.f16833i);
        }
    }

    @Override // n0.p
    public void e() {
        m0.e eVar = this.f16826b;
        if (eVar instanceof m0.a) {
            int s12 = ((m0.a) eVar).s1();
            if (s12 == 0 || s12 == 1) {
                this.f16826b.j1(this.f16832h.f16782g);
            } else {
                this.f16826b.k1(this.f16832h.f16782g);
            }
        }
    }

    @Override // n0.p
    public void f() {
        this.f16827c = null;
        this.f16832h.c();
    }

    @Override // n0.p
    public boolean m() {
        return false;
    }
}
