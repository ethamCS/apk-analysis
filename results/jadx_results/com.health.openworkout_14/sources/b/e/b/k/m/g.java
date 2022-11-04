package b.e.b.k.m;

import b.e.b.k.m.f;
/* loaded from: classes.dex */
public class g extends f {
    public int m;

    public g(p pVar) {
        super(pVar);
        this.f2299e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // b.e.b.k.m.f
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f2301g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
