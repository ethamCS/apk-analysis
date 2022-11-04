package bb;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lbb/n;", "Lbb/l;", "Lfb/y;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "values", "<init>", "(Ljava/util/Map;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n extends fb.y implements l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Map<String, ? extends List<String>> map) {
        super(true, map);
        hc.t.e(map, "values");
    }

    @Override // fb.y
    public String toString() {
        return hc.t.l("Headers ", a());
    }
}
