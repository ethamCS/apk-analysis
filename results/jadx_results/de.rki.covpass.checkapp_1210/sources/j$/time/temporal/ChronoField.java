package j$.time.temporal;

import j$.time.format.ResolverStyle;
import java.util.Map;
/* JADX WARN: Init of enum ALIGNED_DAY_OF_WEEK_IN_MONTH can be incorrect */
/* JADX WARN: Init of enum ALIGNED_DAY_OF_WEEK_IN_YEAR can be incorrect */
/* JADX WARN: Init of enum ALIGNED_WEEK_OF_MONTH can be incorrect */
/* JADX WARN: Init of enum ALIGNED_WEEK_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum AMPM_OF_DAY can be incorrect */
/* JADX WARN: Init of enum CLOCK_HOUR_OF_AMPM can be incorrect */
/* JADX WARN: Init of enum CLOCK_HOUR_OF_DAY can be incorrect */
/* JADX WARN: Init of enum DAY_OF_MONTH can be incorrect */
/* JADX WARN: Init of enum DAY_OF_WEEK can be incorrect */
/* JADX WARN: Init of enum DAY_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum EPOCH_DAY can be incorrect */
/* JADX WARN: Init of enum ERA can be incorrect */
/* JADX WARN: Init of enum HOUR_OF_AMPM can be incorrect */
/* JADX WARN: Init of enum HOUR_OF_DAY can be incorrect */
/* JADX WARN: Init of enum INSTANT_SECONDS can be incorrect */
/* JADX WARN: Init of enum MICRO_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MICRO_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum MILLI_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MILLI_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum MINUTE_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MINUTE_OF_HOUR can be incorrect */
/* JADX WARN: Init of enum MONTH_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum NANO_OF_DAY can be incorrect */
/* JADX WARN: Init of enum NANO_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum OFFSET_SECONDS can be incorrect */
/* JADX WARN: Init of enum PROLEPTIC_MONTH can be incorrect */
/* JADX WARN: Init of enum SECOND_OF_DAY can be incorrect */
/* JADX WARN: Init of enum SECOND_OF_MINUTE can be incorrect */
/* JADX WARN: Init of enum YEAR can be incorrect */
/* JADX WARN: Init of enum YEAR_OF_ERA can be incorrect */
/* loaded from: classes2.dex */
public enum ChronoField implements TemporalField {
    NANO_OF_SECOND("NanoOfSecond", r8, r17, u.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r8, r27, u.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r9, r17, u.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r9, r27, u.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r9, r17, u.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r9, r27, u.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r17, r32, u.i(0, 59), "second"),
    SECOND_OF_DAY("SecondOfDay", r17, r27, u.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r32, r13, u.i(0, 59), "minute"),
    MINUTE_OF_DAY("MinuteOfDay", r32, r27, u.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r13, r16, u.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r13, r16, u.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r13, r27, u.i(0, 23), "hour"),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r13, r27, u.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r16, r27, u.i(0, 1), "dayperiod"),
    DAY_OF_WEEK("DayOfWeek", r27, r36, u.i(1, 7), "weekday"),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r27, r36, u.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r27, r36, u.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r27, r15, u.k(28, 31), "day"),
    DAY_OF_YEAR("DayOfYear", r27, r41, u.k(365, 366)),
    EPOCH_DAY("EpochDay", r27, r44, u.i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r36, r15, u.k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r36, r41, u.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r15, r41, u.i(1, 12), "month"),
    PROLEPTIC_MONTH("ProlepticMonth", r15, r44, u.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r41, r44, u.k(999999999, 1000000000)),
    YEAR("Year", r41, r44, u.i(-999999999, 999999999), "year"),
    ERA("Era", ChronoUnit.ERAS, r44, u.i(0, 1), "era"),
    INSTANT_SECONDS("InstantSeconds", r17, r44, u.i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r17, r44, u.i(-64800, 64800));
    

    /* renamed from: a */
    private final String f13153a;

    /* renamed from: b */
    private final TemporalUnit f13154b;

    /* renamed from: c */
    private final TemporalUnit f13155c;

    /* renamed from: d */
    private final u f13156d;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
    }

    ChronoField(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, u uVar) {
        this.f13153a = str;
        this.f13154b = temporalUnit;
        this.f13155c = temporalUnit2;
        this.f13156d = uVar;
    }

    ChronoField(String str, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, u uVar, String str2) {
        this.f13153a = str;
        this.f13154b = temporalUnit;
        this.f13155c = temporalUnit2;
        this.f13156d = uVar;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean b() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean d() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.TemporalField
    public final u f() {
        return this.f13156d;
    }

    @Override // j$.time.temporal.TemporalField
    public final /* synthetic */ TemporalAccessor h(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
        return null;
    }

    @Override // j$.time.temporal.TemporalField
    public final long i(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean k(TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal l(Temporal temporal, long j10) {
        return temporal.d(this, j10);
    }

    @Override // j$.time.temporal.TemporalField
    public final u o(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(this);
    }

    public final int p(long j10) {
        return this.f13156d.a(j10, this);
    }

    public final long q(long j10) {
        this.f13156d.b(j10, this);
        return j10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13153a;
    }
}
