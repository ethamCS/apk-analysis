package dgca.verifier.app.engine;

import hc.t;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0007\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"j$/time/ZoneId", "a", "Lj$/time/ZoneId;", "getUTC_ZONE_ID", "()Lj$/time/ZoneId;", "UTC_ZONE_ID", "covpass-dgc-certlogic_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DateTimeKt {

    /* renamed from: a */
    private static final ZoneId f8945a;

    static {
        ZoneId normalized = ZoneId.ofOffset(org.conscrypt.BuildConfig.FLAVOR, ZoneOffset.UTC).normalized();
        t.d(normalized, "<clinit>");
        f8945a = normalized;
    }

    public static final ZoneId getUTC_ZONE_ID() {
        return f8945a;
    }
}
