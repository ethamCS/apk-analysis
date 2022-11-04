package ae;

import hc.t;
/* loaded from: classes3.dex */
public abstract class h extends i {
    @Override // ae.i
    public void b(xc.b bVar, xc.b bVar2) {
        t.e(bVar, "first");
        t.e(bVar2, "second");
        e(bVar, bVar2);
    }

    @Override // ae.i
    public void c(xc.b bVar, xc.b bVar2) {
        t.e(bVar, "fromSuper");
        t.e(bVar2, "fromCurrent");
        e(bVar, bVar2);
    }

    protected abstract void e(xc.b bVar, xc.b bVar2);
}
