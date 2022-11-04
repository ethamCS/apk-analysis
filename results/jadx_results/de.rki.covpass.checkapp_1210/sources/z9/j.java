package z9;

import bf.x;
import bf.y;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {BuildConfig.FLAVOR, "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j {
    public static final String a(String str) {
        String R0;
        boolean u10;
        t.e(str, "<this>");
        R0 = y.R0(str, ".", null, 2, null);
        u10 = x.u(R0, ".tar", false, 2, null);
        if (u10) {
            R0 = y.R0(R0, ".", null, 2, null);
        }
        String substring = str.substring(R0.length());
        t.d(substring, "this as java.lang.String).substring(startIndex)");
        String j10 = new bf.k("[*\\\\/.?]+").j(R0, "-");
        return j10 + substring;
    }
}
