package b.e.b.k.m;
/* loaded from: classes.dex */
public class j extends p {
    public j(b.e.b.k.e eVar) {
        super(eVar);
        eVar.f2262d.f();
        eVar.f2263e.f();
        this.f2328f = ((b.e.b.k.g) eVar).b1();
    }

    private void q(f fVar) {
        this.f2330h.k.add(fVar);
        fVar.l.add(this.f2330h);
    }

    @Override // b.e.b.k.m.p, b.e.b.k.m.d
    public void a(d dVar) {
        f fVar = this.f2330h;
        if (fVar.f2297c && !fVar.j) {
            this.f2330h.d((int) ((fVar.l.get(0).f2301g * ((b.e.b.k.g) this.f2324b).e1()) + 0.5f));
        }
    }

    @Override // b.e.b.k.m.p
    public void d() {
        p pVar;
        f fVar;
        f fVar2;
        b.e.b.k.g gVar = (b.e.b.k.g) this.f2324b;
        int c1 = gVar.c1();
        int d1 = gVar.d1();
        gVar.e1();
        if (gVar.b1() == 1) {
            f fVar3 = this.f2330h;
            if (c1 != -1) {
                fVar3.l.add(this.f2324b.R.f2262d.f2330h);
                this.f2324b.R.f2262d.f2330h.k.add(this.f2330h);
                fVar2 = this.f2330h;
            } else if (d1 != -1) {
                fVar3.l.add(this.f2324b.R.f2262d.i);
                this.f2324b.R.f2262d.i.k.add(this.f2330h);
                fVar2 = this.f2330h;
                c1 = -d1;
            } else {
                fVar3.f2296b = true;
                fVar3.l.add(this.f2324b.R.f2262d.i);
                this.f2324b.R.f2262d.i.k.add(this.f2330h);
                q(this.f2324b.f2262d.f2330h);
                pVar = this.f2324b.f2262d;
            }
            fVar2.f2300f = c1;
            q(this.f2324b.f2262d.f2330h);
            pVar = this.f2324b.f2262d;
        } else {
            f fVar4 = this.f2330h;
            if (c1 != -1) {
                fVar4.l.add(this.f2324b.R.f2263e.f2330h);
                this.f2324b.R.f2263e.f2330h.k.add(this.f2330h);
                fVar = this.f2330h;
            } else if (d1 != -1) {
                fVar4.l.add(this.f2324b.R.f2263e.i);
                this.f2324b.R.f2263e.i.k.add(this.f2330h);
                fVar = this.f2330h;
                c1 = -d1;
            } else {
                fVar4.f2296b = true;
                fVar4.l.add(this.f2324b.R.f2263e.i);
                this.f2324b.R.f2263e.i.k.add(this.f2330h);
                q(this.f2324b.f2263e.f2330h);
                pVar = this.f2324b.f2263e;
            }
            fVar.f2300f = c1;
            q(this.f2324b.f2263e.f2330h);
            pVar = this.f2324b.f2263e;
        }
        q(pVar.i);
    }

    @Override // b.e.b.k.m.p
    public void e() {
        if (((b.e.b.k.g) this.f2324b).b1() == 1) {
            this.f2324b.V0(this.f2330h.f2301g);
        } else {
            this.f2324b.W0(this.f2330h.f2301g);
        }
    }

    @Override // b.e.b.k.m.p
    public void f() {
        this.f2330h.c();
    }

    @Override // b.e.b.k.m.p
    public boolean m() {
        return false;
    }
}
