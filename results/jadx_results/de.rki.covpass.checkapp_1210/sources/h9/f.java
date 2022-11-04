package h9;

import hc.t;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"j$/time/Instant", BuildConfig.FLAVOR, "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {
    public static final boolean a(Instant instant) {
        t.e(instant, "<this>");
        return instant.isBefore(Instant.now().minus(24L, ChronoUnit.HOURS));
    }
}
