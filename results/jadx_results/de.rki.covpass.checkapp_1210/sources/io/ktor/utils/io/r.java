package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {BuildConfig.FLAVOR, "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class r {
    public static final Throwable a(Throwable th2) {
        hc.t.e(th2, "<this>");
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            if (hc.t.a(th3, th3.getCause())) {
                return th2;
            }
            Throwable cause = th3.getCause();
            if (cause == null) {
                return th3;
            }
            th3 = cause;
        }
        return th3;
    }
}
