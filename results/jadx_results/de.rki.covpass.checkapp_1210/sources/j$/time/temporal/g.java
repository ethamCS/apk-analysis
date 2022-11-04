package j$.time.temporal;

import j$.time.Duration;
/* loaded from: classes2.dex */
enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));
    

    /* renamed from: a */
    private final String f13164a;

    /* renamed from: b */
    private final Duration f13165b;

    g(String str, Duration duration) {
        this.f13164a = str;
        this.f13165b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean b() {
        return false;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean d() {
        return true;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long f(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.l(temporal2, this);
        }
        int i10 = a.f13160a[ordinal()];
        if (i10 == 1) {
            TemporalField temporalField = h.f13168c;
            return j$.time.c.f(temporal2.h(temporalField), temporal.h(temporalField));
        } else if (i10 != 2) {
            throw new IllegalStateException("Unreachable");
        } else {
            return temporal.l(temporal2, ChronoUnit.MONTHS) / 3;
        }
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal h(Temporal temporal, long j10) {
        int i10 = a.f13160a[ordinal()];
        if (i10 == 1) {
            TemporalField temporalField = h.f13168c;
            return temporal.d(temporalField, j$.time.c.b(temporal.get(temporalField), j10));
        } else if (i10 != 2) {
            throw new IllegalStateException("Unreachable");
        } else {
            return temporal.i(j10 / 256, ChronoUnit.YEARS).i((j10 % 256) * 3, ChronoUnit.MONTHS);
        }
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean i() {
        return true;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration k() {
        return this.f13165b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13164a;
    }
}
