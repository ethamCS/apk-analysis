package s4;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a0 {
    public static final boolean a(Throwable th2) {
        hc.t.e(th2, "<this>");
        return (th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException);
    }
}
