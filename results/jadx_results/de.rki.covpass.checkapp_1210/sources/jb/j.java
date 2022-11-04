package jb;

import hc.t;
import io.ktor.utils.io.q;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¨\u0006\u0003"}, d2 = {BuildConfig.FLAVOR, "cause", "a", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j {
    public static final Throwable a(Throwable th2, Throwable th3) {
        Throwable e10;
        t.e(th2, "<this>");
        if (th3 == null || t.a(th2.getCause(), th3) || (e10 = q.e(th2, th3)) == null) {
            return th2;
        }
        e10.setStackTrace(th2.getStackTrace());
        return e10;
    }
}
