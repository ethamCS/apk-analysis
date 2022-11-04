package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class YearMonth implements Temporal, j$.time.temporal.i, Comparable<YearMonth>, Serializable {

    /* renamed from: c */
    private static final DateTimeFormatter f13002c = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();

    /* renamed from: a */
    private final int f13003a;

    /* renamed from: b */
    private final int f13004b;

    private YearMonth(int i10, int i11) {
        this.f13003a = i10;
        this.f13004b = i11;
    }

    public static YearMonth o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!j$.time.chrono.f.f13017a.equals(j$.time.chrono.c.b(temporalAccessor))) {
                temporalAccessor = LocalDate.s(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static YearMonth of(int i10, int i11) {
        ChronoField.YEAR.q(i10);
        ChronoField.MONTH_OF_YEAR.q(i11);
        return new YearMonth(i10, i11);
    }

    private long p() {
        return ((this.f13003a * 12) + this.f13004b) - 1;
    }

    public static YearMonth parse(CharSequence charSequence) {
        return parse(charSequence, f13002c);
    }

    public static YearMonth parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (YearMonth) dateTimeFormatter.parse(charSequence, w.f13203a);
    }

    private YearMonth s(int i10, int i11) {
        return (this.f13003a == i10 && this.f13004b == i11) ? this : new YearMonth(i10, i11);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        return (YearMonth) ((LocalDate) iVar).o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.k(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i10 = this.f13003a - yearMonth2.f13003a;
        return i10 == 0 ? this.f13004b - yearMonth2.f13004b : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.f13003a == yearMonth.f13003a && this.f13004b == yearMonth.f13004b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.u.i(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.k.d(this, temporalField);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return f(temporalField).a(h(temporalField), temporalField);
    }

    public int getMonthValue() {
        return this.f13004b;
    }

    public int getYear() {
        return this.f13003a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        int i10;
        if (temporalField instanceof ChronoField) {
            int i11 = x.f13204a[((ChronoField) temporalField).ordinal()];
            int i12 = 1;
            if (i11 == 1) {
                i10 = this.f13004b;
            } else if (i11 == 2) {
                return p();
            } else {
                if (i11 == 3) {
                    int i13 = this.f13003a;
                    if (i13 < 1) {
                        i13 = 1 - i13;
                    }
                    return i13;
                } else if (i11 != 4) {
                    if (i11 != 5) {
                        throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
                    }
                    if (this.f13003a < 1) {
                        i12 = 0;
                    }
                    return i12;
                } else {
                    i10 = this.f13003a;
                }
            }
            return i10;
        }
        return temporalField.i(this);
    }

    public final int hashCode() {
        return this.f13003a ^ (this.f13004b << 27);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j10, TemporalUnit temporalUnit) {
        long j11;
        if (temporalUnit instanceof ChronoUnit) {
            switch (x.f13205b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return q(j10);
                case 2:
                    return r(j10);
                case 3:
                    j11 = 10;
                    j10 = c.e(j10, j11);
                    return r(j10);
                case 4:
                    j11 = 100;
                    j10 = c.e(j10, j11);
                    return r(j10);
                case 5:
                    j11 = 1000;
                    j10 = c.e(j10, j11);
                    return r(j10);
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return d(chronoField, c.b(h(chronoField), j10));
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
        }
        return (YearMonth) temporalUnit.h(this, j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f13173a ? j$.time.chrono.f.f13017a : temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.MONTHS : j$.time.temporal.k.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth o10 = o(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long p10 = o10.p() - p();
            switch (x.f13205b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return p10;
                case 2:
                    return p10 / 12;
                case 3:
                    return p10 / 120;
                case 4:
                    return p10 / 1200;
                case 5:
                    return p10 / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return o10.h(chronoField) - h(chronoField);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.f(this, o10);
    }

    public final YearMonth q(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f13003a * 12) + (this.f13004b - 1) + j10;
        return s(ChronoField.YEAR.p(c.d(j11, 12L)), ((int) c.c(j11, 12L)) + 1);
    }

    public final YearMonth r(long j10) {
        return j10 == 0 ? this : s(ChronoField.YEAR.p(this.f13003a + j10), this.f13004b);
    }

    /* renamed from: t */
    public final YearMonth d(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.q(j10);
            int i10 = x.f13204a[chronoField.ordinal()];
            if (i10 == 1) {
                int i11 = (int) j10;
                ChronoField.MONTH_OF_YEAR.q(i11);
                return s(this.f13003a, i11);
            } else if (i10 == 2) {
                return q(j10 - p());
            } else {
                if (i10 == 3) {
                    if (this.f13003a < 1) {
                        j10 = 1 - j10;
                    }
                    return u((int) j10);
                } else if (i10 == 4) {
                    return u((int) j10);
                } else {
                    if (i10 != 5) {
                        throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
                    }
                    return h(ChronoField.ERA) == j10 ? this : u(1 - this.f13003a);
                }
            }
        }
        return (YearMonth) temporalField.l(this, j10);
    }

    public String toString() {
        int i10;
        int abs = Math.abs(this.f13003a);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            int i11 = this.f13003a;
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            sb2.append(this.f13003a);
        }
        sb2.append(this.f13004b < 10 ? "-0" : "-");
        sb2.append(this.f13004b);
        return sb2.toString();
    }

    public final YearMonth u(int i10) {
        ChronoField.YEAR.q(i10);
        return s(i10, this.f13004b);
    }
}
