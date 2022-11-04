package b9;

import hc.t;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "whitelist", "<init>", "(Ljava/util/Collection;)V", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final Set<String> f5760a;

    public a(Collection<String> collection) {
        Set<String> J0;
        t.e(collection, "whitelist");
        J0 = c0.J0(collection);
        this.f5760a = J0;
    }
}
