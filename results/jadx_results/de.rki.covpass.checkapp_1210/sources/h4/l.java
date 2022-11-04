package h4;

import java.util.List;
/* loaded from: classes.dex */
public class l extends g<r4.d> {

    /* renamed from: i */
    private final r4.d f11282i = new r4.d();

    public l(List<r4.a<r4.d>> list) {
        super(list);
    }

    /* renamed from: p */
    public r4.d i(r4.a<r4.d> aVar, float f10) {
        r4.d dVar;
        r4.d dVar2;
        r4.d dVar3 = aVar.f20443b;
        if (dVar3 == null || (dVar = aVar.f20444c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        r4.d dVar4 = dVar3;
        r4.d dVar5 = dVar;
        r4.c<A> cVar = this.f11252e;
        if (cVar != 0 && (dVar2 = (r4.d) cVar.b(aVar.f20448g, aVar.f20449h.floatValue(), dVar4, dVar5, f10, e(), f())) != null) {
            return dVar2;
        }
        this.f11282i.d(q4.g.i(dVar4.b(), dVar5.b(), f10), q4.g.i(dVar4.c(), dVar5.c(), f10));
        return this.f11282i;
    }
}
