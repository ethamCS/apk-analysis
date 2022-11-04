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
public final class OffsetTime implements Temporal, j$.time.temporal.i, Comparable<OffsetTime>, Serializable {

    /* renamed from: a */
    private final LocalTime f12992a;

    /* renamed from: b */
    private final ZoneOffset f12993b;

    static {
        p(LocalTime.f12978e, ZoneOffset.f13009g);
        p(LocalTime.f12979f, ZoneOffset.f13008f);
    }

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f12992a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f12993b = zoneOffset;
    }

    public static OffsetTime o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetTime) {
            return (OffsetTime) temporalAccessor;
        }
        try {
            return new OffsetTime(LocalTime.q(temporalAccessor), ZoneOffset.r(temporalAccessor));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static OffsetTime of(int i10, int i11, int i12, int i13, ZoneOffset zoneOffset) {
        return new OffsetTime(LocalTime.of(i10, i11, i12, i13), zoneOffset);
    }

    public static OffsetTime p(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    public static OffsetTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetTime) dateTimeFormatter.parse(charSequence, s.f13150a);
    }

    private long q() {
        return this.f12992a.y() - (this.f12993b.s() * 1000000000);
    }

    private OffsetTime r(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f12992a != localTime || !this.f12993b.equals(zoneOffset)) ? new OffsetTime(localTime, zoneOffset) : this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        if (iVar instanceof LocalTime) {
            return r((LocalTime) iVar, this.f12993b);
        }
        if (iVar instanceof ZoneOffset) {
            return r(this.f12992a, (ZoneOffset) iVar);
        }
        boolean z10 = iVar instanceof OffsetTime;
        Temporal temporal = iVar;
        if (!z10) {
            temporal = ((LocalDate) iVar).o(this);
        }
        return (OffsetTime) temporal;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.b() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.k(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetTime offsetTime) {
        int compare;
        OffsetTime offsetTime2 = offsetTime;
        return (!this.f12993b.equals(offsetTime2.f12993b) && (compare = Long.compare(q(), offsetTime2.q())) != 0) ? compare : this.f12992a.compareTo(offsetTime2.f12992a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(TemporalField temporalField, long j10) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? r(this.f12992a, ZoneOffset.u(((ChronoField) temporalField).p(j10))) : r(this.f12992a.d(temporalField, j10), this.f12993b) : (OffsetTime) temporalField.l(this, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        return this.f12992a.equals(offsetTime.f12992a) && this.f12993b.equals(offsetTime.f12993b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return temporalField.f();
            }
            LocalTime localTime = this.f12992a;
            Objects.requireNonNull(localTime);
            return j$.time.temporal.k.d(localTime, temporalField);
        }
        return temporalField.o(this);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return j$.time.temporal.k.b(this, temporalField);
    }

    public int getHour() {
        return this.f12992a.getHour();
    }

    public int getMinute() {
        return this.f12992a.getMinute();
    }

    public int getNano() {
        return this.f12992a.getNano();
    }

    public ZoneOffset getOffset() {
        return this.f12993b;
    }

    public int getSecond() {
        return this.f12992a.getSecond();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? this.f12993b.s() : this.f12992a.h(temporalField) : temporalField.i(this);
    }

    public final int hashCode() {
        return this.f12992a.hashCode() ^ this.f12993b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j10, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? r(this.f12992a.i(j10, temporalUnit), this.f12993b) : (OffsetTime) temporalUnit.h(this, j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        int i10 = j$.time.temporal.k.f13171a;
        if (temporalQuery == j$.time.temporal.p.f13175a || temporalQuery == j$.time.temporal.q.f13176a) {
            return this.f12993b;
        }
        boolean z10 = true;
        boolean z11 = temporalQuery == j$.time.temporal.m.f13172a;
        if (temporalQuery != j$.time.temporal.n.f13173a) {
            z10 = false;
        }
        if ((z11 || z10) || temporalQuery == j$.time.temporal.r.f13177a) {
            return null;
        }
        return temporalQuery == j$.time.temporal.s.f13178a ? this.f12992a : temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        long j10;
        OffsetTime o10 = o(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long q10 = o10.q() - q();
            switch (t.f13151a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return q10;
                case 2:
                    j10 = 1000;
                    break;
                case 3:
                    j10 = 1000000;
                    break;
                case 4:
                    j10 = 1000000000;
                    break;
                case 5:
                    j10 = 60000000000L;
                    break;
                case 6:
                    j10 = 3600000000000L;
                    break;
                case 7:
                    j10 = 43200000000000L;
                    break;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
            return q10 / j10;
        }
        return temporalUnit.f(this, o10);
    }

    public String toString() {
        return this.f12992a.toString() + this.f12993b.toString();
    }
}
