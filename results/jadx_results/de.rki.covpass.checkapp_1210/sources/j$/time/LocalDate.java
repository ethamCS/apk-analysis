package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeFormatter;
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
public final class LocalDate implements Temporal, j$.time.temporal.i, ChronoLocalDate, Serializable {

    /* renamed from: d */
    public static final LocalDate f12969d = of(-999999999, 1, 1);

    /* renamed from: e */
    public static final LocalDate f12970e = of(999999999, 12, 31);

    /* renamed from: a */
    private final int f12971a;

    /* renamed from: b */
    private final short f12972b;

    /* renamed from: c */
    private final short f12973c;

    private LocalDate(int i10, int i11, int i12) {
        this.f12971a = i10;
        this.f12972b = (short) i11;
        this.f12973c = (short) i12;
    }

    public static LocalDate A(int i10, int i11) {
        long j10 = i10;
        ChronoField.YEAR.q(j10);
        ChronoField.DAY_OF_YEAR.q(i11);
        boolean f10 = j$.time.chrono.f.f13017a.f(j10);
        if (i11 == 366 && !f10) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        n s10 = n.s(((i11 - 1) / 31) + 1);
        if (i11 > (s10.q(f10) + s10.o(f10)) - 1) {
            s10 = s10.t();
        }
        return new LocalDate(i10, s10.p(), (i11 - s10.o(f10)) + 1);
    }

    private static LocalDate F(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            return new LocalDate(i10, i11, i12);
        }
        i13 = j$.time.chrono.f.f13017a.f((long) i10) ? 29 : 28;
        i12 = Math.min(i12, i13);
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate now() {
        b bVar = new b(ZoneId.systemDefault());
        Instant j10 = bVar.j();
        return ofEpochDay(c.d(j10.getEpochSecond() + bVar.i().getRules().d(j10).s(), 86400L));
    }

    public static LocalDate of(int i10, int i11, int i12) {
        long j10 = i10;
        ChronoField.YEAR.q(j10);
        ChronoField.MONTH_OF_YEAR.q(i11);
        ChronoField.DAY_OF_MONTH.q(i12);
        int i13 = 28;
        if (i12 > 28) {
            int i14 = 31;
            if (i11 == 2) {
                if (j$.time.chrono.f.f13017a.f(j10)) {
                    i13 = 29;
                }
                i14 = i13;
            } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i14 = 30;
            }
            if (i12 > i14) {
                if (i12 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                StringBuilder b10 = AbstractC0484a.b("Invalid date '");
                b10.append(n.s(i11).name());
                b10.append(" ");
                b10.append(i12);
                b10.append("'");
                throw new DateTimeException(b10.toString());
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate ofEpochDay(long j10) {
        long j11;
        long j12 = (j10 + 719528) - 60;
        if (j12 < 0) {
            long j13 = ((j12 + 1) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.p(j14 + j11 + (i11 / 10)), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, g.f13135a);
    }

    public static LocalDate s(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        int i10 = j$.time.temporal.k.f13171a;
        LocalDate localDate = (LocalDate) temporalAccessor.k(j$.time.temporal.r.f13177a);
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int t(TemporalField temporalField) {
        switch (h.f13136a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f12973c;
            case 2:
                return v();
            case 3:
                return ((this.f12973c - 1) / 7) + 1;
            case 4:
                int i10 = this.f12971a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return u().o();
            case 6:
                return ((this.f12973c - 1) % 7) + 1;
            case 7:
                return ((v() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((v() - 1) / 7) + 1;
            case 10:
                return this.f12972b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f12971a;
            case 13:
                return this.f12971a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
    }

    private long w() {
        return ((this.f12971a * 12) + this.f12972b) - 1;
    }

    private long z(LocalDate localDate) {
        return (((localDate.w() * 32) + localDate.getDayOfMonth()) - ((w() * 32) + getDayOfMonth())) / 32;
    }

    /* renamed from: B */
    public final LocalDate i(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (h.f13137b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j10);
                case 2:
                    return D(j10);
                case 3:
                    return C(j10);
                case 4:
                    return E(j10);
                case 5:
                    return E(c.e(j10, 10L));
                case 6:
                    return E(c.e(j10, 100L));
                case 7:
                    return E(c.e(j10, 1000L));
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return d(chronoField, c.b(h(chronoField), j10));
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalDate) temporalUnit.h(this, j10);
    }

    public final LocalDate C(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f12971a * 12) + (this.f12972b - 1) + j10;
        return F(ChronoField.YEAR.p(c.d(j11, 12L)), ((int) c.c(j11, 12L)) + 1, this.f12973c);
    }

    public final LocalDate D(long j10) {
        return plusDays(c.e(j10, 7L));
    }

    public final LocalDate E(long j10) {
        return j10 == 0 ? this : F(ChronoField.YEAR.p(this.f12971a + j10), this.f12972b, this.f12973c);
    }

    /* renamed from: G */
    public final LocalDate d(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.q(j10);
            switch (h.f13136a[chronoField.ordinal()]) {
                case 1:
                    int i10 = (int) j10;
                    return this.f12973c == i10 ? this : of(this.f12971a, this.f12972b, i10);
                case 2:
                    int i11 = (int) j10;
                    return v() == i11 ? this : A(this.f12971a, i11);
                case 3:
                    return D(j10 - h(ChronoField.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.f12971a < 1) {
                        j10 = 1 - j10;
                    }
                    return J((int) j10);
                case 5:
                    return plusDays(j10 - u().o());
                case 6:
                    return plusDays(j10 - h(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return plusDays(j10 - h(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return ofEpochDay(j10);
                case 9:
                    return D(j10 - h(ChronoField.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i12 = (int) j10;
                    if (this.f12972b == i12) {
                        return this;
                    }
                    ChronoField.MONTH_OF_YEAR.q(i12);
                    return F(this.f12971a, i12, this.f12973c);
                case 11:
                    return C(j10 - w());
                case 12:
                    return J((int) j10);
                case 13:
                    return h(ChronoField.ERA) == j10 ? this : J(1 - this.f12971a);
                default:
                    throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
            }
        }
        return (LocalDate) temporalField.l(this, j10);
    }

    public final ChronoLocalDate H(j$.time.temporal.i iVar) {
        boolean z10 = iVar instanceof LocalDate;
        Temporal temporal = iVar;
        if (!z10) {
            temporal = ((j$.time.temporal.j) iVar).b(this);
        }
        return (LocalDate) temporal;
    }

    public final LocalDate I() {
        return v() == 180 ? this : A(this.f12971a, 180);
    }

    public final LocalDate J(int i10) {
        if (this.f12971a == i10) {
            return this;
        }
        ChronoField.YEAR.q(i10);
        return F(i10, this.f12972b, this.f12973c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final void a() {
        j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.a f10;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime t10 = LocalDateTime.t(this, LocalTime.f12980g);
        if (!(zoneId instanceof ZoneOffset) && (f10 = zoneId.getRules().f(t10)) != null && f10.o()) {
            t10 = f10.b();
        }
        return ZonedDateTime.q(t10, zoneId, null);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        boolean z10 = iVar instanceof LocalDate;
        Temporal temporal = iVar;
        if (!z10) {
            temporal = ((LocalDate) iVar).o(this);
        }
        return (LocalDate) temporal;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.d() : temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && q((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        int i10;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (chronoField.d()) {
                int i11 = h.f13136a[chronoField.ordinal()];
                if (i11 == 1) {
                    short s10 = this.f12972b;
                    i10 = s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : x() ? 29 : 28;
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        return j$.time.temporal.u.i(1L, (n.s(this.f12972b) != n.FEBRUARY || x()) ? 5L : 4L);
                    } else if (i11 != 4) {
                        return temporalField.f();
                    } else {
                        return j$.time.temporal.u.i(1L, getYear() <= 0 ? 1000000000L : 999999999L);
                    }
                } else {
                    i10 = x() ? 366 : 365;
                }
                return j$.time.temporal.u.i(1L, i10);
            }
            throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
        return temporalField.o(this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? t(temporalField) : j$.time.temporal.k.b(this, temporalField);
    }

    public int getDayOfMonth() {
        return this.f12973c;
    }

    public int getMonthValue() {
        return this.f12972b;
    }

    public int getYear() {
        return this.f12971a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? w() : t(temporalField) : temporalField.i(this);
    }

    public int hashCode() {
        int i10 = this.f12971a;
        return (((i10 << 11) + (this.f12972b << 6)) + this.f12973c) ^ (i10 & (-2048));
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? q((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.b j(LocalTime localTime) {
        return LocalDateTime.t(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f13177a) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.m.f13172a || temporalQuery == j$.time.temporal.q.f13176a || temporalQuery == j$.time.temporal.p.f13175a || temporalQuery == j$.time.temporal.s.f13178a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f13173a) {
            return j$.time.chrono.f.f13017a;
        }
        return temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.DAYS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        long epochDay;
        long j10;
        LocalDate s10 = s(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (h.f13137b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return s10.toEpochDay() - toEpochDay();
                case 2:
                    epochDay = s10.toEpochDay() - toEpochDay();
                    j10 = 7;
                    break;
                case 3:
                    return z(s10);
                case 4:
                    epochDay = z(s10);
                    j10 = 12;
                    break;
                case 5:
                    epochDay = z(s10);
                    j10 = 120;
                    break;
                case 6:
                    epochDay = z(s10);
                    j10 = 1200;
                    break;
                case 7:
                    epochDay = z(s10);
                    j10 = 12000;
                    break;
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return s10.h(chronoField) - h(chronoField);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
            return epochDay / j10;
        }
        return temporalUnit.f(this, s10);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate n(j$.time.temporal.l lVar) {
        if (lVar instanceof Period) {
            Period period = (Period) lVar;
            return C(period.f()).plusDays(period.b());
        }
        Objects.requireNonNull(lVar, "amountToAdd");
        return (LocalDate) ((Period) lVar).a(this);
    }

    public final Temporal o(Temporal temporal) {
        return temporal.d(ChronoField.EPOCH_DAY, toEpochDay());
    }

    /* renamed from: p */
    public final int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return q((LocalDate) chronoLocalDate);
        }
        int compare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (compare != 0) {
            return compare;
        }
        j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
        chronoLocalDate.a();
        return 0;
    }

    public LocalDate plusDays(long j10) {
        return j10 == 0 ? this : ofEpochDay(c.b(toEpochDay(), j10));
    }

    public final int q(LocalDate localDate) {
        int i10 = this.f12971a - localDate.f12971a;
        if (i10 == 0) {
            int i11 = this.f12972b - localDate.f12972b;
            return i11 == 0 ? this.f12973c - localDate.f12973c : i11;
        }
        return i10;
    }

    public final long r(LocalDate localDate) {
        return localDate.toEpochDay() - toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j10;
        long j11 = this.f12971a;
        long j12 = this.f12972b;
        long j13 = (365 * j11) + 0;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + (this.f12973c - 1);
        if (j12 > 2) {
            j14--;
            if (!x()) {
                j14--;
            }
        }
        return j14 - 719528;
    }

    public String toString() {
        int i10;
        int i11 = this.f12971a;
        short s10 = this.f12972b;
        short s11 = this.f12973c;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        }
        String str = "-0";
        sb2.append(s10 < 10 ? str : "-");
        sb2.append((int) s10);
        if (s11 >= 10) {
            str = "-";
        }
        sb2.append(str);
        sb2.append((int) s11);
        return sb2.toString();
    }

    public final d u() {
        return d.p(((int) c.c(toEpochDay() + 3, 7L)) + 1);
    }

    public final int v() {
        return (n.s(this.f12972b).o(x()) + this.f12973c) - 1;
    }

    public final boolean x() {
        return j$.time.chrono.f.f13017a.f(this.f12971a);
    }

    public final ChronoLocalDate y(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? i(Long.MAX_VALUE, temporalUnit).i(1L, temporalUnit) : i(-j10, temporalUnit);
    }
}
