package pb;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {
    public static final Void a(long j10, String str) {
        t.e(str, "name");
        throw new IllegalArgumentException("Long value " + j10 + " of " + str + " doesn't fit into 32-bit integer");
    }
}
