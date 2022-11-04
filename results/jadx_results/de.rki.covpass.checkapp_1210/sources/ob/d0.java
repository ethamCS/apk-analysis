package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"Lob/z;", BuildConfig.FLAVOR, "a", "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d0 {
    public static final short a(z zVar) {
        hc.t.e(zVar, "<this>");
        if (zVar instanceof a) {
            a aVar = (a) zVar;
            if (aVar.s0() - aVar.w0() > 2) {
                int w02 = aVar.w0();
                aVar.q1(w02 + 2);
                return aVar.u0().getShort(w02);
            }
        }
        return b(zVar);
    }

    private static final short b(z zVar) {
        pb.a f10 = pb.h.f(zVar, 2);
        if (f10 == null) {
            l0.a(2);
            throw new tb.i();
        }
        short c10 = m.c(f10);
        pb.h.c(zVar, f10);
        return c10;
    }
}
