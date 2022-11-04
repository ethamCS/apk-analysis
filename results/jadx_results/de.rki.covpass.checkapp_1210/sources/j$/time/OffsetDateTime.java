package j$.time;

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
public final class OffsetDateTime implements Temporal, j$.time.temporal.i, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f12990a;

    /* renamed from: b */
    private final ZoneOffset f12991b;
    public static final OffsetDateTime MIN = o(LocalDateTime.f12974c, ZoneOffset.f13009g);
    public static final OffsetDateTime MAX = o(LocalDateTime.f12975d, ZoneOffset.f13008f);

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f12990a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f12991b = zoneOffset;
    }

    public static OffsetDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset r10 = ZoneOffset.r(temporalAccessor);
            int i10 = j$.time.temporal.k.f13171a;
            LocalDate localDate = (LocalDate) temporalAccessor.k(j$.time.temporal.r.f13177a);
            LocalTime localTime = (LocalTime) temporalAccessor.k(j$.time.temporal.s.f13178a);
            if (localDate != null && localTime != null) {
                return new OffsetDateTime(LocalDateTime.t(localDate, localTime), r10);
            }
            return ofInstant(Instant.from(temporalAccessor), r10);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static OffsetDateTime o(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d10 = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.u(instant.getEpochSecond(), instant.getNano(), d10), d10);
    }

    private OffsetDateTime p(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f12990a != localDateTime || !this.f12991b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static OffsetDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.parse(charSequence, q.f13148a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        if ((iVar instanceof LocalDate) || (iVar instanceof LocalTime) || (iVar instanceof LocalDateTime)) {
            return p(this.f12990a.b(iVar), this.f12991b);
        }
        if (iVar instanceof Instant) {
            return ofInstant((Instant) iVar, this.f12991b);
        }
        if (iVar instanceof ZoneOffset) {
            return p(this.f12990a, (ZoneOffset) iVar);
        }
        boolean z10 = iVar instanceof OffsetDateTime;
        Temporal temporal = iVar;
        if (!z10) {
            temporal = ((LocalDate) iVar).o(this);
        }
        return (OffsetDateTime) temporal;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.k(this));
    }

    public int compareTo(OffsetDateTime offsetDateTime) {
        int i10;
        if (this.f12991b.equals(offsetDateTime.f12991b)) {
            i10 = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            i10 = Long.compare(toEpochSecond(), offsetDateTime.toEpochSecond());
            if (i10 == 0) {
                i10 = e().getNano() - offsetDateTime.e().getNano();
            }
        }
        return i10 == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : i10;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(TemporalField temporalField, long j10) {
        ZoneOffset zoneOffset;
        LocalDateTime localDateTime;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = r.f13149a[chronoField.ordinal()];
            if (i10 == 1) {
                return ofInstant(Instant.ofEpochSecond(j10, getNano()), this.f12991b);
            }
            if (i10 != 2) {
                localDateTime = this.f12990a.d(temporalField, j10);
                zoneOffset = this.f12991b;
            } else {
                localDateTime = this.f12990a;
                zoneOffset = ZoneOffset.u(chronoField.p(j10));
            }
            return p(localDateTime, zoneOffset);
        }
        return (OffsetDateTime) temporalField.l(this, j10);
    }

    public final LocalTime e() {
        return this.f12990a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f12990a.equals(offsetDateTime.f12990a) && this.f12991b.equals(offsetDateTime.f12991b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? temporalField.f() : this.f12990a.f(temporalField) : temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = r.f13149a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i10 != 2 ? this.f12990a.get(temporalField) : this.f12991b.s();
        }
        return j$.time.temporal.k.b(this, temporalField);
    }

    public int getDayOfMonth() {
        return this.f12990a.getDayOfMonth();
    }

    public int getMonthValue() {
        return this.f12990a.getMonthValue();
    }

    public int getNano() {
        return this.f12990a.getNano();
    }

    public final ZoneOffset getOffset() {
        return this.f12991b;
    }

    public int getYear() {
        return this.f12990a.getYear();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = r.f13149a[((ChronoField) temporalField).ordinal()];
            return i10 != 1 ? i10 != 2 ? this.f12990a.h(temporalField) : this.f12991b.s() : toEpochSecond();
        }
        return temporalField.i(this);
    }

    public int hashCode() {
        return this.f12990a.hashCode() ^ this.f12991b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j10, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? p(this.f12990a.i(j10, temporalUnit), this.f12991b) : (OffsetDateTime) temporalUnit.h(this, j10);
    }

    public boolean isEqual(OffsetDateTime offsetDateTime) {
        return toEpochSecond() == offsetDateTime.toEpochSecond() && e().getNano() == offsetDateTime.e().getNano();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        int i10 = j$.time.temporal.k.f13171a;
        if (temporalQuery == j$.time.temporal.p.f13175a || temporalQuery == j$.time.temporal.q.f13176a) {
            return this.f12991b;
        }
        if (temporalQuery == j$.time.temporal.m.f13172a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.r.f13177a) {
            return this.f12990a.E();
        }
        return temporalQuery == j$.time.temporal.s.f13178a ? e() : temporalQuery == j$.time.temporal.n.f13173a ? j$.time.chrono.f.f13017a : temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f12990a.l(from.withOffsetSameInstant(this.f12991b).f12990a, temporalUnit);
        }
        return temporalUnit.f(this, from);
    }

    public OffsetDateTime plusDays(long j10) {
        return p(this.f12990a.w(j10), this.f12991b);
    }

    public OffsetDateTime plusHours(long j10) {
        return p(this.f12990a.x(j10), this.f12991b);
    }

    public OffsetDateTime plusMonths(long j10) {
        return p(this.f12990a.y(j10), this.f12991b);
    }

    public OffsetDateTime plusYears(long j10) {
        return p(this.f12990a.C(j10), this.f12991b);
    }

    public long toEpochSecond() {
        return this.f12990a.D(this.f12991b);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.f12990a;
        return Instant.ofEpochSecond(localDateTime.D(this.f12991b), localDateTime.e().getNano());
    }

    public LocalDateTime toLocalDateTime() {
        return this.f12990a;
    }

    public final String toString() {
        return this.f12990a.toString() + this.f12991b.toString();
    }

    public ZonedDateTime toZonedDateTime() {
        return ZonedDateTime.q(this.f12990a, this.f12991b, null);
    }

    public OffsetDateTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.f12991b)) {
            return this;
        }
        return new OffsetDateTime(this.f12990a.A(zoneOffset.s() - this.f12991b.s()), zoneOffset);
    }
}
