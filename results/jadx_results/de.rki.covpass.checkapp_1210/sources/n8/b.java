package n8;

import hc.t;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ta.c;
import ta.r;
import ta.w;
import wf.n;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {BuildConfig.FLAVOR, "error", BuildConfig.FLAVOR, "a", "b", "common-app_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final boolean a(Throwable th2) {
        t.e(th2, "error");
        return b(th2) || (th2 instanceof ProtocolException) || ((th2 instanceof w) && !(th2 instanceof c));
    }

    public static final boolean b(Throwable th2) {
        t.e(th2, "error");
        if (th2 instanceof UnknownHostException ? true : th2 instanceof n ? true : th2 instanceof SocketTimeoutException ? true : th2 instanceof r) {
            return true;
        }
        return th2 instanceof TimeoutException;
    }
}
