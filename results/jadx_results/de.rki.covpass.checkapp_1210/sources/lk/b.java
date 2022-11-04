package lk;

import ik.b;
import jk.e;
import jk.i;
import jk.j;
import jk.k;
/* loaded from: classes3.dex */
public abstract class b<P> implements b.a<P> {

    /* renamed from: a */
    j<P> f16087a;

    /* renamed from: b */
    k<P> f16088b;

    /* renamed from: c */
    ok.b<i> f16089c = new ok.b<>(a.f16086a);

    public b(j<P> jVar, k<P> kVar) {
        this.f16087a = jVar;
        this.f16088b = kVar;
    }

    @Override // ik.b.a
    public void a(P p10, double d10, int i10, ok.b<ik.c<P>> bVar) {
        b();
        bVar.r();
        if (d10 <= 0.0d) {
            this.f16088b.c(Double.MAX_VALUE);
        } else {
            this.f16088b.c(d10);
        }
        this.f16089c.r();
        this.f16088b.d(p10, i10, this.f16089c);
        int i11 = 0;
        while (true) {
            ok.b<i> bVar2 = this.f16089c;
            if (i11 < bVar2.f18623d) {
                i c10 = bVar2.c(i11);
                ik.c<P> i12 = bVar.i();
                e.a aVar = c10.f14472a;
                i12.f12725a = (P) aVar.f14462a;
                i12.f12726b = aVar.f14463b;
                i12.f12727c = c10.f14473b;
                i11++;
            } else {
                return;
            }
        }
    }

    abstract void b();
}
