package n0;

import n0.f;
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m */
    public int f16793m;

    public g(p pVar) {
        super(pVar);
        this.f16780e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // n0.f
    public void d(int i10) {
        if (this.f16785j) {
            return;
        }
        this.f16785j = true;
        this.f16782g = i10;
        for (d dVar : this.f16786k) {
            dVar.a(dVar);
        }
    }
}
