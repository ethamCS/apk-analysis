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
public final class LocalDateTime implements Temporal, j$.time.temporal.i, j$.time.chrono.b, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f12974c = t(LocalDate.f12969d, LocalTime.f12978e);

    /* renamed from: d */
    public static final LocalDateTime f12975d = t(LocalDate.f12970e, LocalTime.f12979f);

    /* renamed from: a */
    private final LocalDate f12976a;

    /* renamed from: b */
    private final LocalTime f12977b;

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f12976a = localDate;
        this.f12977b = localTime;
    }

    private LocalDateTime B(LocalDate localDate, long j10, long j11, long j12, long j13) {
        LocalDate localDate2;
        LocalTime localTime;
        if ((j10 | j11 | j12 | j13) == 0) {
            localTime = this.f12977b;
            localDate2 = localDate;
        } else {
            long j14 = 1;
            long y10 = this.f12977b.y();
            long j15 = ((((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L)) * j14) + y10;
            long d10 = c.d(j15, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
            long c10 = c.c(j15, 86400000000000L);
            localTime = c10 == y10 ? this.f12977b : LocalTime.s(c10);
            localDate2 = localDate.plusDays(d10);
        }
        return G(localDate2, localTime);
    }

    private LocalDateTime G(LocalDate localDate, LocalTime localTime) {
        return (this.f12976a == localDate && this.f12977b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.of(i13, i14));
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.of(i13, i14, i15));
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.of(i13, i14, i15, i16));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return u(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    private int p(LocalDateTime localDateTime) {
        int q10 = this.f12976a.q(localDateTime.f12976a);
        return q10 == 0 ? this.f12977b.compareTo(localDateTime.f12977b) : q10;
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, i.f13138a);
    }

    public static LocalDateTime q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).m();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.s(temporalAccessor), LocalTime.q(temporalAccessor));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static LocalDateTime t(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime u(long j10, int i10, ZoneOffset zoneOffset) {
        long s10;
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        ChronoField.NANO_OF_SECOND.q(j11);
        return new LocalDateTime(LocalDate.ofEpochDay(c.d(j10 + zoneOffset.s(), 86400L)), LocalTime.s((((int) c.c(s10, 86400L)) * 1000000000) + j11));
    }

    public final LocalDateTime A(long j10) {
        return B(this.f12976a, 0L, 0L, j10, 0L);
    }

    public final LocalDateTime C(long j10) {
        return G(this.f12976a.E(j10), this.f12977b);
    }

    public final long D(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((F().toEpochDay() * 86400) + e().z()) - zoneOffset.s();
    }

    public final LocalDate E() {
        return this.f12976a;
    }

    public final ChronoLocalDate F() {
        return this.f12976a;
    }

    /* renamed from: H */
    public final LocalDateTime b(j$.time.temporal.i iVar) {
        return iVar instanceof LocalDate ? G((LocalDate) iVar, this.f12977b) : iVar instanceof LocalTime ? G(this.f12976a, (LocalTime) iVar) : iVar instanceof LocalDateTime ? (LocalDateTime) iVar : (LocalDateTime) ((LocalDate) iVar).o(this);
    }

    /* renamed from: I */
    public final LocalDateTime d(TemporalField temporalField, long j10) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).b() ? G(this.f12976a, this.f12977b.d(temporalField, j10)) : G(this.f12976a.d(temporalField, j10), this.f12977b) : (LocalDateTime) temporalField.l(this, j10);
    }

    public final void a() {
        Objects.requireNonNull(this.f12976a);
        j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.k(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.d() || chronoField.b();
    }

    public final LocalTime e() {
        return this.f12977b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f12976a.equals(localDateTime.f12976a) && this.f12977b.equals(localDateTime.f12977b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).b()) {
                LocalTime localTime = this.f12977b;
                Objects.requireNonNull(localTime);
                return j$.time.temporal.k.d(localTime, temporalField);
            }
            return this.f12976a.f(temporalField);
        }
        return temporalField.o(this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).b() ? this.f12977b.get(temporalField) : this.f12976a.get(temporalField) : j$.time.temporal.k.b(this, temporalField);
    }

    public int getDayOfMonth() {
        return this.f12976a.getDayOfMonth();
    }

    public int getHour() {
        return this.f12977b.getHour();
    }

    public int getMinute() {
        return this.f12977b.getMinute();
    }

    public int getMonthValue() {
        return this.f12976a.getMonthValue();
    }

    public int getNano() {
        return this.f12977b.getNano();
    }

    public int getSecond() {
        return this.f12977b.getSecond();
    }

    public int getYear() {
        return this.f12976a.getYear();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).b() ? this.f12977b.h(temporalField) : this.f12976a.h(temporalField) : temporalField.i(this);
    }

    public final int hashCode() {
        return this.f12976a.hashCode() ^ this.f12977b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f13177a) {
            return this.f12976a;
        }
        if (temporalQuery == j$.time.temporal.m.f13172a || temporalQuery == j$.time.temporal.q.f13176a || temporalQuery == j$.time.temporal.p.f13175a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.f13178a) {
            return this.f12977b;
        }
        if (temporalQuery != j$.time.temporal.n.f13173a) {
            return temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
        }
        a();
        return j$.time.chrono.f.f13017a;
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        long j10;
        long j11;
        long j12;
        long j13;
        LocalDateTime q10 = q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            if (!temporalUnit.b()) {
                LocalDate localDate = q10.f12976a;
                LocalDate localDate2 = this.f12976a;
                Objects.requireNonNull(localDate);
                boolean z10 = false;
                if (!(localDate2 instanceof LocalDate) ? localDate.toEpochDay() > localDate2.toEpochDay() : localDate.q(localDate2) > 0) {
                    if (q10.f12977b.compareTo(this.f12977b) < 0) {
                        localDate = localDate.plusDays(-1L);
                        return this.f12976a.l(localDate, temporalUnit);
                    }
                }
                if (localDate.isBefore(this.f12976a)) {
                    if (q10.f12977b.compareTo(this.f12977b) > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        localDate = localDate.plusDays(1L);
                    }
                }
                return this.f12976a.l(localDate, temporalUnit);
            }
            long r10 = this.f12976a.r(q10.f12976a);
            int i10 = (r10 > 0L ? 1 : (r10 == 0L ? 0 : -1));
            if (i10 == 0) {
                return this.f12977b.l(q10.f12977b, temporalUnit);
            }
            long y10 = q10.f12977b.y() - this.f12977b.y();
            if (i10 > 0) {
                j11 = r10 - 1;
                j10 = y10 + 86400000000000L;
            } else {
                j11 = r10 + 1;
                j10 = y10 - 86400000000000L;
            }
            switch (j.f13139a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    j11 = c.e(j11, 86400000000000L);
                    break;
                case 2:
                    j12 = c.e(j11, 86400000000L);
                    j13 = 1000;
                    j11 = j12;
                    j10 /= j13;
                    break;
                case 3:
                    j12 = c.e(j11, 86400000L);
                    j13 = 1000000;
                    j11 = j12;
                    j10 /= j13;
                    break;
                case 4:
                    j12 = c.e(j11, 86400L);
                    j13 = 1000000000;
                    j11 = j12;
                    j10 /= j13;
                    break;
                case 5:
                    j12 = c.e(j11, 1440L);
                    j13 = 60000000000L;
                    j11 = j12;
                    j10 /= j13;
                    break;
                case 6:
                    j12 = c.e(j11, 24L);
                    j13 = 3600000000000L;
                    j11 = j12;
                    j10 /= j13;
                    break;
                case 7:
                    j12 = c.e(j11, 2L);
                    j13 = 43200000000000L;
                    j11 = j12;
                    j10 /= j13;
                    break;
            }
            return c.b(j11, j10);
        }
        return temporalUnit.f(this, q10);
    }

    /* renamed from: o */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDateTime) {
            return p((LocalDateTime) bVar);
        }
        LocalDateTime localDateTime = (LocalDateTime) bVar;
        int compareTo = this.f12976a.compareTo(localDateTime.f12976a);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.f12977b.compareTo(localDateTime.f12977b);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        a();
        j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
        localDateTime.a();
        return 0;
    }

    public final boolean r(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDateTime) {
            return p((LocalDateTime) bVar) > 0;
        }
        LocalDateTime localDateTime = (LocalDateTime) bVar;
        int i10 = (this.f12976a.toEpochDay() > localDateTime.f12976a.toEpochDay() ? 1 : (this.f12976a.toEpochDay() == localDateTime.f12976a.toEpochDay() ? 0 : -1));
        return i10 > 0 || (i10 == 0 && this.f12977b.y() > localDateTime.f12977b.y());
    }

    public final boolean s(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDateTime) {
            return p((LocalDateTime) bVar) < 0;
        }
        LocalDateTime localDateTime = (LocalDateTime) bVar;
        int i10 = (this.f12976a.toEpochDay() > localDateTime.f12976a.toEpochDay() ? 1 : (this.f12976a.toEpochDay() == localDateTime.f12976a.toEpochDay() ? 0 : -1));
        return i10 < 0 || (i10 == 0 && this.f12977b.y() < localDateTime.f12977b.y());
    }

    public final String toString() {
        return this.f12976a.toString() + 'T' + this.f12977b.toString();
    }

    /* renamed from: v */
    public final LocalDateTime i(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (j.f13139a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return z(j10);
                case 2:
                    return w(j10 / 86400000000L).z((j10 % 86400000000L) * 1000);
                case 3:
                    return w(j10 / 86400000).z((j10 % 86400000) * 1000000);
                case 4:
                    return A(j10);
                case 5:
                    return B(this.f12976a, 0L, j10, 0L, 0L);
                case 6:
                    return x(j10);
                case 7:
                    return w(j10 / 256).x((j10 % 256) * 12);
                default:
                    return G(this.f12976a.i(j10, temporalUnit), this.f12977b);
            }
        }
        return (LocalDateTime) temporalUnit.h(this, j10);
    }

    public final LocalDateTime w(long j10) {
        return G(this.f12976a.plusDays(j10), this.f12977b);
    }

    public final LocalDateTime x(long j10) {
        return B(this.f12976a, j10, 0L, 0L, 0L);
    }

    public final LocalDateTime y(long j10) {
        return G(this.f12976a.C(j10), this.f12977b);
    }

    public final LocalDateTime z(long j10) {
        return B(this.f12976a, 0L, 0L, 0L, j10);
    }
}
