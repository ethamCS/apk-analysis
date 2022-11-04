package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f13012a;

    /* renamed from: b */
    private final ZoneOffset f13013b;

    /* renamed from: c */
    private final ZoneId f13014c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.f13012a = localDateTime;
        this.f13013b = zoneOffset;
        this.f13014c = zoneId;
    }

    public static ZonedDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId o10 = ZoneId.o(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            return temporalAccessor.c(chronoField) ? p(temporalAccessor.h(chronoField), temporalAccessor.get(ChronoField.NANO_OF_SECOND), o10) : q(LocalDateTime.t(LocalDate.s(temporalAccessor), LocalTime.q(temporalAccessor)), o10, null);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static ZonedDateTime now() {
        b bVar = new b(ZoneId.systemDefault());
        return ofInstant(bVar.j(), bVar.i());
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return p(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    private static ZonedDateTime p(long j10, int i10, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.getRules().d(Instant.ofEpochSecond(j10, i10));
        return new ZonedDateTime(LocalDateTime.u(j10, i10, d10), d10, zoneId);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, z.f13208a);
    }

    public static ZonedDateTime q(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List g10 = rules.g(localDateTime);
        if (g10.size() == 1) {
            zoneOffset = (ZoneOffset) g10.get(0);
        } else if (g10.size() == 0) {
            j$.time.zone.a f10 = rules.f(localDateTime);
            localDateTime = localDateTime.A(f10.f().getSeconds());
            zoneOffset = f10.i();
        } else if (zoneOffset == null || !g10.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g10.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    private ZonedDateTime r(LocalDateTime localDateTime) {
        return q(localDateTime, this.f13014c, this.f13013b);
    }

    private ZonedDateTime s(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f13013b) || !this.f13014c.getRules().g(this.f13012a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f13012a, zoneOffset, this.f13014c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final void a() {
        Objects.requireNonNull(t());
        j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        LocalDateTime localDateTime;
        if (iVar instanceof LocalDate) {
            localDateTime = LocalDateTime.t((LocalDate) iVar, this.f13012a.e());
        } else if (!(iVar instanceof LocalTime)) {
            if (iVar instanceof LocalDateTime) {
                return r((LocalDateTime) iVar);
            }
            if (iVar instanceof OffsetDateTime) {
                OffsetDateTime offsetDateTime = (OffsetDateTime) iVar;
                return q(offsetDateTime.toLocalDateTime(), this.f13014c, offsetDateTime.getOffset());
            } else if (!(iVar instanceof Instant)) {
                return iVar instanceof ZoneOffset ? s((ZoneOffset) iVar) : (ZonedDateTime) ((LocalDate) iVar).o(this);
            } else {
                Instant instant = (Instant) iVar;
                return p(instant.getEpochSecond(), instant.getNano(), this.f13014c);
            }
        } else {
            localDateTime = LocalDateTime.t(this.f13012a.E(), (LocalTime) iVar);
        }
        return q(localDateTime, this.f13014c, this.f13013b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.k(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = A.f12961a[chronoField.ordinal()];
            return i10 != 1 ? i10 != 2 ? r(this.f13012a.d(temporalField, j10)) : s(ZoneOffset.u(chronoField.p(j10))) : p(j10, getNano(), this.f13014c);
        }
        return (ZonedDateTime) temporalField.l(this, j10);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime e() {
        return this.f13012a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f13012a.equals(zonedDateTime.f13012a) && this.f13013b.equals(zonedDateTime.f13013b) && this.f13014c.equals(zonedDateTime.f13014c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? temporalField.f() : this.f13012a.f(temporalField) : temporalField.o(this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId g() {
        return this.f13014c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = A.f12961a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i10 != 2 ? this.f13012a.get(temporalField) : this.f13013b.s();
        }
        return j$.time.chrono.c.a(this, temporalField);
    }

    public int getNano() {
        return this.f13012a.getNano();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.f13013b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = A.f12961a[((ChronoField) temporalField).ordinal()];
            return i10 != 1 ? i10 != 2 ? this.f13012a.h(temporalField) : this.f13013b.s() : toEpochSecond();
        }
        return temporalField.i(this);
    }

    public int hashCode() {
        return (this.f13012a.hashCode() ^ this.f13013b.hashCode()) ^ Integer.rotateLeft(this.f13014c.hashCode(), 3);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            if (temporalUnit.d()) {
                return r(this.f13012a.i(j10, temporalUnit));
            }
            LocalDateTime i10 = this.f13012a.i(j10, temporalUnit);
            ZoneOffset zoneOffset = this.f13013b;
            ZoneId zoneId = this.f13014c;
            Objects.requireNonNull(i10, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            return zoneId.getRules().g(i10).contains(zoneOffset) ? new ZonedDateTime(i10, zoneOffset, zoneId) : p(i10.D(zoneOffset), i10.getNano(), zoneId);
        }
        return (ZonedDateTime) temporalUnit.h(this, j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f13177a) {
            return t();
        }
        if (temporalQuery == j$.time.temporal.q.f13176a || temporalQuery == j$.time.temporal.m.f13172a) {
            return this.f13014c;
        }
        if (temporalQuery == j$.time.temporal.p.f13175a) {
            return this.f13013b;
        }
        if (temporalQuery == j$.time.temporal.s.f13178a) {
            return e();
        }
        if (temporalQuery != j$.time.temporal.n.f13173a) {
            return temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
        }
        a();
        return j$.time.chrono.f.f13017a;
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime withZoneSameInstant = from.withZoneSameInstant(this.f13014c);
            return temporalUnit.d() ? this.f13012a.l(withZoneSameInstant.f13012a, temporalUnit) : toOffsetDateTime().l(withZoneSameInstant.toOffsetDateTime(), temporalUnit);
        }
        return temporalUnit.f(this, from);
    }

    /* renamed from: o */
    public final int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(toEpochSecond(), chronoZonedDateTime.toEpochSecond());
        if (compare == 0) {
            int nano = e().getNano() - chronoZonedDateTime.e().getNano();
            if (nano != 0) {
                return nano;
            }
            int compareTo = m().compareTo(chronoZonedDateTime.m());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = this.f13014c.p().compareTo(chronoZonedDateTime.g().p());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            a();
            j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
            chronoZonedDateTime.a();
            return 0;
        }
        return compare;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public long toEpochSecond() {
        return ((t().toEpochDay() * 86400) + e().z()) - getOffset().s();
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), e().getNano());
    }

    /* renamed from: toLocalDate */
    public LocalDate t() {
        return this.f13012a.E();
    }

    /* renamed from: toLocalDateTime */
    public LocalDateTime m() {
        return this.f13012a;
    }

    public OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.o(this.f13012a, this.f13013b);
    }

    public String toString() {
        String str = this.f13012a.toString() + this.f13013b.toString();
        if (this.f13013b != this.f13014c) {
            return str + '[' + this.f13014c.toString() + ']';
        }
        return str;
    }

    public ZonedDateTime withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f13014c.equals(zoneId) ? this : p(this.f13012a.D(this.f13013b), this.f13012a.getNano(), zoneId);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        b bVar = new b(zoneId);
        return ofInstant(bVar.j(), bVar.i());
    }
}
