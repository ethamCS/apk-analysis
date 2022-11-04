package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lbb/l0;", BuildConfig.FLAVOR, "a", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m0 {
    public static final boolean a(l0 l0Var) {
        hc.t.e(l0Var, "<this>");
        return hc.t.a(l0Var.e(), "https") || hc.t.a(l0Var.e(), "wss");
    }
}
