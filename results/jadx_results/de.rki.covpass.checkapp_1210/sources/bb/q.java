package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {BuildConfig.FLAVOR, "ch", BuildConfig.FLAVOR, "b", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class q {
    public static final /* synthetic */ boolean a(char c10) {
        return b(c10);
    }

    public static final boolean b(char c10) {
        boolean M;
        M = bf.y.M("\"(),/:;<=>?@[\\]{}", c10, false, 2, null);
        return M;
    }
}
