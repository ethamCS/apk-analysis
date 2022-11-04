package bb;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lbb/d0;", "Lbb/b0;", "Lfb/y;", BuildConfig.FLAVOR, "toString", "Lbb/q0;", "urlEncodingOption", "Lbb/q0;", "f", "()Lbb/q0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "values", "<init>", "(Ljava/util/Map;Lbb/q0;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d0 extends fb.y implements b0 {

    /* renamed from: c */
    private final q0 f5823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Map<String, ? extends List<String>> map, q0 q0Var) {
        super(true, map);
        hc.t.e(map, "values");
        hc.t.e(q0Var, "urlEncodingOption");
        this.f5823c = q0Var;
    }

    @Override // bb.b0
    public q0 f() {
        return this.f5823c;
    }

    @Override // fb.y
    public String toString() {
        return hc.t.l("Parameters ", a());
    }
}
