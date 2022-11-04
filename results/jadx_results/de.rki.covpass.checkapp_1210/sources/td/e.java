package td;

import hc.t;
import java.util.List;
import yd.i;
/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends i.d<M>, T> T a(i.d<M> dVar, i.f<M, T> fVar) {
        t.e(dVar, "<this>");
        t.e(fVar, "extension");
        if (dVar.V(fVar)) {
            return (T) dVar.I(fVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends i.d<M>, T> T b(i.d<M> dVar, i.f<M, List<T>> fVar, int i10) {
        t.e(dVar, "<this>");
        t.e(fVar, "extension");
        if (i10 < dVar.N(fVar)) {
            return (T) dVar.M(fVar, i10);
        }
        return null;
    }
}
