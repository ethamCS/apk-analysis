package sa;

import cb.a;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lcb/a;", BuildConfig.FLAVOR, "c", "ktor-client-okhttp"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private static final cb.a f21603a = new cb.a(a.EnumC0086a.INTERNAL_ERROR, "Client failure");

    public static final boolean c(cb.a aVar) {
        a.EnumC0086a a10 = a.EnumC0086a.Companion.a(aVar.a());
        return a10 == null || a10 == a.EnumC0086a.CLOSED_ABNORMALLY;
    }
}
