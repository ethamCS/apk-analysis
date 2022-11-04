package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a2\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¨\u0006\b"}, d2 = {"Lob/z;", "Lob/e;", "destination", BuildConfig.FLAVOR, "offset", "min", "max", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c0 {
    public static final int a(z zVar, e eVar, int i10, int i11, int i12) {
        int d10;
        hc.t.e(zVar, "<this>");
        hc.t.e(eVar, "destination");
        qb.a.a(eVar, i10, i11, i12);
        d10 = nc.m.d(i12, eVar.j() - eVar.s());
        int Z = (int) zVar.Z(eVar.n(), eVar.s(), i10, i11, d10);
        eVar.b(Z);
        return Z;
    }

    public static /* synthetic */ int b(z zVar, e eVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return a(zVar, eVar, i10, i11, i12);
    }
}
