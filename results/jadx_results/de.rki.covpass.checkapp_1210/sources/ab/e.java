package ab;

import hc.t;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¨\u0006\u0002"}, d2 = {BuildConfig.FLAVOR, "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {
    public static final Throwable a(Throwable th2) {
        t.e(th2, "<this>");
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) th3;
            if (t.a(th3, cancellationException.getCause())) {
                return th2;
            }
            th3 = cancellationException.getCause();
        }
        return th3 == null ? th2 : th3;
    }
}
