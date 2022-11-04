package j$.time.temporal;

import j$.time.Duration;
/* loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.f(1)),
    MICROS("Micros", Duration.f(1000)),
    MILLIS("Millis", Duration.f(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a */
    private final String f13158a;

    /* renamed from: b */
    private final Duration f13159b;

    ChronoUnit(String str, Duration duration) {
        this.f13158a = str;
        this.f13159b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean b() {
        return compareTo(DAYS) < 0;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean d() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long f(Temporal temporal, Temporal temporal2) {
        return temporal.l(temporal2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal h(Temporal temporal, long j10) {
        return temporal.i(j10, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean i() {
        return compareTo(DAYS) >= 0;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration k() {
        return this.f13159b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13158a;
    }
}
