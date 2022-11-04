package u9;

import de.rki.covpass.sdk.rules.remote.valuesets.CovPassValueSetRemote;
import hc.t;
import j9.f;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote;", BuildConfig.FLAVOR, "hash", "Lj9/f;", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final f a(CovPassValueSetRemote covPassValueSetRemote, String str) {
        t.e(covPassValueSetRemote, "<this>");
        t.e(str, "hash");
        return new f(covPassValueSetRemote.b(), covPassValueSetRemote.a(), covPassValueSetRemote.c().toString(), str);
    }
}
