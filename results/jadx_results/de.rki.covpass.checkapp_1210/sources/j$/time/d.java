package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public enum d implements TemporalAccessor, j$.time.temporal.i {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final d[] f13018a = values();

    public static d p(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new DateTimeException("Invalid value for DayOfWeek: " + i10);
        }
        return f13018a[i10 - 1];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.DAY_OF_WEEK : temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return temporalField == ChronoField.DAY_OF_WEEK ? temporalField.f() : j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField == ChronoField.DAY_OF_WEEK ? o() : j$.time.temporal.k.b(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        if (temporalField == ChronoField.DAY_OF_WEEK) {
            return o();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
        return temporalField.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        int i10 = j$.time.temporal.k.f13171a;
        return temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.DAYS : j$.time.temporal.k.c(this, temporalQuery);
    }

    public final int o() {
        return ordinal() + 1;
    }

    public final d q(long j10) {
        return f13018a[((((int) (j10 % 7)) + 7) + ordinal()) % 7];
    }
}
