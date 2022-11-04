package jb;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¨\u0006\u0005"}, d2 = {BuildConfig.FLAVOR, "exception", "Lxb/d;", "continuation", "a", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k {
    public static final Throwable a(Throwable th2, xb.d<?> dVar) {
        t.e(th2, "exception");
        t.e(dVar, "continuation");
        try {
            return j.a(th2, th2.getCause());
        } catch (Throwable unused) {
            return th2;
        }
    }
}
