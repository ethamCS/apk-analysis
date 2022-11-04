package d9;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0005"}, d2 = {BuildConfig.FLAVOR, "uvci", "Ltb/e0;", "b", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class s {
    private static final String a(String str) {
        bf.i c10 = bf.k.c(new bf.k("[a-zA-Z]{2}/.+?(?=/)"), str, 0, 2, null);
        if (c10 != null) {
            return c10.getValue();
        }
        return null;
    }

    public static final void b(String str) {
        hc.t.e(str, "uvci");
        for (String str2 : v9.d.f23934a.a()) {
            String a10 = a(str);
            if (a10 != null && hc.t.a(str2, z9.k.c(z9.h.c(a10)))) {
                throw new b();
            }
        }
    }
}
