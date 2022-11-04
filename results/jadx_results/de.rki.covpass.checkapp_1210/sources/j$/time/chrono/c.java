package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.t;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static int a(ChronoZonedDateTime chronoZonedDateTime, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = d.f13016a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i10 != 2 ? chronoZonedDateTime.m().get(temporalField) : chronoZonedDateTime.getOffset().s();
        }
        return k.b(chronoZonedDateTime, temporalField);
    }

    public static e b(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        int i10 = k.f13171a;
        e eVar = (e) temporalAccessor.k(n.f13173a);
        return eVar != null ? eVar : f.f13017a;
    }
}
