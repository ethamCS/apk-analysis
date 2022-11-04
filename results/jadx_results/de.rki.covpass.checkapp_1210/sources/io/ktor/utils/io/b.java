package io.ktor.utils.io;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {
    public static final Void b(Throwable th2) {
        Throwable e10 = q.e(th2, th2);
        if (e10 == null) {
            throw th2;
        }
        throw e10;
    }
}
