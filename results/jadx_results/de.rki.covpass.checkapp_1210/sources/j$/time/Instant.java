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
public final class Instant implements Temporal, j$.time.temporal.i, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);

    /* renamed from: a */
    private final long f12967a;

    /* renamed from: b */
    private final int f12968b;

    static {
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    private Instant(long j10, int i10) {
        this.f12967a = j10;
        this.f12968b = i10;
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.h(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static Instant now() {
        return new b(ZoneOffset.UTC).j();
    }

    public static Instant ofEpochMilli(long j10) {
        return p(c.d(j10, 1000L), ((int) c.c(j10, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j10) {
        return p(j10, 0);
    }

    public static Instant ofEpochSecond(long j10, long j11) {
        return p(c.b(j10, c.d(j11, 1000000000L)), (int) c.c(j11, 1000000000L));
    }

    private static Instant p(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return EPOCH;
        }
        if (j10 >= -31557014167219200L && j10 <= 31556889864403199L) {
            return new Instant(j10, i10);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    private long q(Instant instant) {
        return c.b(c.e(c.f(instant.f12967a, this.f12967a), 1000000000L), instant.f12968b - this.f12968b);
    }

    private Instant r(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofEpochSecond(c.b(c.b(this.f12967a, j10), j11 / 1000000000), this.f12968b + (j11 % 1000000000));
    }

    private long u(Instant instant) {
        long f10 = c.f(instant.f12967a, this.f12967a);
        long j10 = instant.f12968b - this.f12968b;
        int i10 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        return (i10 <= 0 || j10 >= 0) ? (i10 >= 0 || j10 <= 0) ? f10 : f10 + 1 : f10 - 1;
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        return (Instant) ((LocalDate) iVar).o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.k(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r3 != r2.f12968b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3 != r2.f12968b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        r4 = r2.f12967a;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.temporal.Temporal d(j$.time.temporal.TemporalField r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L5c
            r0 = r3
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            r0.q(r4)
            int[] r1 = j$.time.f.f13021a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L33
            r1 = 4
            if (r0 != r1) goto L27
            long r0 = r2.f12967a
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L5a
            int r3 = r2.f12968b
            goto L46
        L27:
            j$.time.temporal.t r4 = new j$.time.temporal.t
            java.lang.String r5 = "Unsupported field: "
            java.lang.String r3 = j$.time.AbstractC0484a.a(r5, r3)
            r4.<init>(r3)
            throw r4
        L33:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f12968b
            if (r3 == r4) goto L5a
            goto L44
        L3d:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.f12968b
            if (r3 == r4) goto L5a
        L44:
            long r4 = r2.f12967a
        L46:
            j$.time.Instant r3 = p(r4, r3)
            goto L62
        L4b:
            int r3 = r2.f12968b
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L5a
            long r0 = r2.f12967a
            int r3 = (int) r4
            j$.time.Instant r3 = p(r0, r3)
            goto L62
        L5a:
            r3 = r2
            goto L62
        L5c:
            j$.time.temporal.Temporal r3 = r3.l(r2, r4)
            j$.time.Instant r3 = (j$.time.Instant) r3
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.d(j$.time.temporal.TemporalField, long):j$.time.temporal.Temporal");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f12967a == instant.f12967a && this.f12968b == instant.f12968b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = f.f13021a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return this.f12968b;
            }
            if (i10 == 2) {
                return this.f12968b / 1000;
            }
            if (i10 == 3) {
                return this.f12968b / 1000000;
            }
            if (i10 == 4) {
                ChronoField.INSTANT_SECONDS.p(this.f12967a);
            }
            throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
        return j$.time.temporal.k.d(this, temporalField).a(temporalField.i(this), temporalField);
    }

    public long getEpochSecond() {
        return this.f12967a;
    }

    public int getNano() {
        return this.f12968b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        int i10;
        if (temporalField instanceof ChronoField) {
            int i11 = f.f13021a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                i10 = this.f12968b;
            } else if (i11 == 2) {
                i10 = this.f12968b / 1000;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
                }
                return this.f12967a;
            } else {
                i10 = this.f12968b / 1000000;
            }
            return i10;
        }
        return temporalField.i(this);
    }

    public int hashCode() {
        long j10 = this.f12967a;
        return (this.f12968b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        int i10 = j$.time.temporal.k.f13171a;
        if (temporalQuery == j$.time.temporal.o.f13174a) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery != j$.time.temporal.n.f13173a && temporalQuery != j$.time.temporal.m.f13172a && temporalQuery != j$.time.temporal.q.f13176a && temporalQuery != j$.time.temporal.p.f13175a && temporalQuery != j$.time.temporal.r.f13177a && temporalQuery != j$.time.temporal.s.f13178a) {
            return temporalQuery.queryFrom(this);
        }
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        Instant from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.f13022b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return q(from);
                case 2:
                    return q(from) / 1000;
                case 3:
                    return c.f(from.toEpochMilli(), toEpochMilli());
                case 4:
                    return u(from);
                case 5:
                    return u(from) / 60;
                case 6:
                    return u(from) / 3600;
                case 7:
                    return u(from) / 43200;
                case 8:
                    return u(from) / 86400;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.f(this, from);
    }

    public Instant minus(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? i(Long.MAX_VALUE, temporalUnit).i(1L, temporalUnit) : i(-j10, temporalUnit);
    }

    public Instant minusSeconds(long j10) {
        return j10 == Long.MIN_VALUE ? t(Long.MAX_VALUE).t(1L) : t(-j10);
    }

    /* renamed from: o */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f12967a, instant.f12967a);
        return compare != 0 ? compare : this.f12968b - instant.f12968b;
    }

    /* renamed from: s */
    public final Instant i(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.f13022b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return r(0L, j10);
                case 2:
                    return r(j10 / 1000000, (j10 % 1000000) * 1000);
                case 3:
                    return r(j10 / 1000, (j10 % 1000) * 1000000);
                case 4:
                    return t(j10);
                case 5:
                    return t(c.e(j10, 60L));
                case 6:
                    return t(c.e(j10, 3600L));
                case 7:
                    return t(c.e(j10, 43200L));
                case 8:
                    return t(c.e(j10, 86400L));
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
        }
        return (Instant) temporalUnit.h(this, j10);
    }

    public final Instant t(long j10) {
        return r(j10, 0L);
    }

    public long toEpochMilli() {
        long e10;
        int i10;
        long j10 = this.f12967a;
        if (j10 >= 0 || this.f12968b <= 0) {
            e10 = c.e(j10, 1000L);
            i10 = this.f12968b / 1000000;
        } else {
            e10 = c.e(j10 + 1, 1000L);
            i10 = (this.f12968b / 1000000) - 1000;
        }
        return c.b(e10, i10);
    }

    public final String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }
}
