package n0;
/* loaded from: classes.dex */
public class j extends p {
    public j(m0.e eVar) {
        super(eVar);
        eVar.f16177e.f();
        eVar.f16179f.f();
        this.f16830f = ((m0.g) eVar).p1();
    }

    private void q(f fVar) {
        this.f16832h.f16786k.add(fVar);
        fVar.f16787l.add(this.f16832h);
    }

    @Override // n0.p, n0.d
    public void a(d dVar) {
        f fVar = this.f16832h;
        if (fVar.f16778c && !fVar.f16785j) {
            this.f16832h.d((int) ((fVar.f16787l.get(0).f16782g * ((m0.g) this.f16826b).s1()) + 0.5f));
        }
    }

    @Override // n0.p
    public void d() {
        p pVar;
        f fVar;
        f fVar2;
        m0.g gVar = (m0.g) this.f16826b;
        int q12 = gVar.q1();
        int r12 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            f fVar3 = this.f16832h;
            if (q12 != -1) {
                fVar3.f16787l.add(this.f16826b.f16170a0.f16177e.f16832h);
                this.f16826b.f16170a0.f16177e.f16832h.f16786k.add(this.f16832h);
                fVar2 = this.f16832h;
            } else if (r12 != -1) {
                fVar3.f16787l.add(this.f16826b.f16170a0.f16177e.f16833i);
                this.f16826b.f16170a0.f16177e.f16833i.f16786k.add(this.f16832h);
                fVar2 = this.f16832h;
                q12 = -r12;
            } else {
                fVar3.f16777b = true;
                fVar3.f16787l.add(this.f16826b.f16170a0.f16177e.f16833i);
                this.f16826b.f16170a0.f16177e.f16833i.f16786k.add(this.f16832h);
                q(this.f16826b.f16177e.f16832h);
                pVar = this.f16826b.f16177e;
            }
            fVar2.f16781f = q12;
            q(this.f16826b.f16177e.f16832h);
            pVar = this.f16826b.f16177e;
        } else {
            f fVar4 = this.f16832h;
            if (q12 != -1) {
                fVar4.f16787l.add(this.f16826b.f16170a0.f16179f.f16832h);
                this.f16826b.f16170a0.f16179f.f16832h.f16786k.add(this.f16832h);
                fVar = this.f16832h;
            } else if (r12 != -1) {
                fVar4.f16787l.add(this.f16826b.f16170a0.f16179f.f16833i);
                this.f16826b.f16170a0.f16179f.f16833i.f16786k.add(this.f16832h);
                fVar = this.f16832h;
                q12 = -r12;
            } else {
                fVar4.f16777b = true;
                fVar4.f16787l.add(this.f16826b.f16170a0.f16179f.f16833i);
                this.f16826b.f16170a0.f16179f.f16833i.f16786k.add(this.f16832h);
                q(this.f16826b.f16179f.f16832h);
                pVar = this.f16826b.f16179f;
            }
            fVar.f16781f = q12;
            q(this.f16826b.f16179f.f16832h);
            pVar = this.f16826b.f16179f;
        }
        q(pVar.f16833i);
    }

    @Override // n0.p
    public void e() {
        if (((m0.g) this.f16826b).p1() == 1) {
            this.f16826b.j1(this.f16832h.f16782g);
        } else {
            this.f16826b.k1(this.f16832h.f16782g);
        }
    }

    @Override // n0.p
    public void f() {
        this.f16832h.c();
    }

    @Override // n0.p
    public boolean m() {
        return false;
    }
}
