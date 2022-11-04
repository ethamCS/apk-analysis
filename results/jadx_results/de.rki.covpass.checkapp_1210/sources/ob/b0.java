package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lob/z;", BuildConfig.FLAVOR, "n", "Ltb/e0;", "b", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b0 {
    public static final void a(z zVar, int i10) {
        hc.t.e(zVar, "<this>");
        b(zVar, i10);
    }

    public static final void b(z zVar, long j10) {
        hc.t.e(zVar, "<this>");
        long y10 = zVar.y(j10);
        if (y10 == j10) {
            return;
        }
        throw new IllegalStateException("Only " + y10 + " bytes were discarded of " + j10 + " requested");
    }
}
