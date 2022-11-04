package dgca.verifier.app.engine.data.source.countries;

import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.x;
import ub.p0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\"#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "Ljava/util/Map;", "getCOUNTRIES_MAP", "()Ljava/util/Map;", "COUNTRIES_MAP", "covpass-dgc-certlogic_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CountriesRepositoryKt {

    /* renamed from: a */
    private static final Map<String, String> f9013a;

    static {
        Map<String, String> e10;
        e10 = p0.e(x.a("el", "gr"));
        f9013a = e10;
    }

    public static final Map<String, String> getCOUNTRIES_MAP() {
        return f9013a;
    }
}
