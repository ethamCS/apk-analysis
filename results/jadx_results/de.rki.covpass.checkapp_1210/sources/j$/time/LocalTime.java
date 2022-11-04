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
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class LocalTime implements Temporal, j$.time.temporal.i, Comparable<LocalTime>, Serializable {

    /* renamed from: e */
    public static final LocalTime f12978e;

    /* renamed from: f */
    public static final LocalTime f12979f;

    /* renamed from: g */
    public static final LocalTime f12980g;

    /* renamed from: h */
    private static final LocalTime[] f12981h = new LocalTime[24];

    /* renamed from: a */
    private final byte f12982a;

    /* renamed from: b */
    private final byte f12983b;

    /* renamed from: c */
    private final byte f12984c;

    /* renamed from: d */
    private final int f12985d;

    static {
        int i10 = 0;
        while (true) {
            LocalTime[] localTimeArr = f12981h;
            if (i10 >= localTimeArr.length) {
                f12980g = localTimeArr[0];
                LocalTime localTime = localTimeArr[12];
                f12978e = localTimeArr[0];
                f12979f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i10] = new LocalTime(i10, 0, 0, 0);
            i10++;
        }
    }

    private LocalTime(int i10, int i11, int i12, int i13) {
        this.f12982a = (byte) i10;
        this.f12983b = (byte) i11;
        this.f12984c = (byte) i12;
        this.f12985d = i13;
    }

    public static LocalTime of(int i10, int i11) {
        ChronoField.HOUR_OF_DAY.q(i10);
        if (i11 == 0) {
            return f12981h[i10];
        }
        ChronoField.MINUTE_OF_HOUR.q(i11);
        return new LocalTime(i10, i11, 0, 0);
    }

    public static LocalTime of(int i10, int i11, int i12) {
        ChronoField.HOUR_OF_DAY.q(i10);
        if ((i11 | i12) == 0) {
            return f12981h[i10];
        }
        ChronoField.MINUTE_OF_HOUR.q(i11);
        ChronoField.SECOND_OF_MINUTE.q(i12);
        return new LocalTime(i10, i11, i12, 0);
    }

    public static LocalTime of(int i10, int i11, int i12, int i13) {
        ChronoField.HOUR_OF_DAY.q(i10);
        ChronoField.MINUTE_OF_HOUR.q(i11);
        ChronoField.SECOND_OF_MINUTE.q(i12);
        ChronoField.NANO_OF_SECOND.q(i13);
        return p(i10, i11, i12, i13);
    }

    private static LocalTime p(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f12981h[i10] : new LocalTime(i10, i11, i12, i13);
    }

    public static LocalTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, k.f13140a);
    }

    public static LocalTime q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        int i10 = j$.time.temporal.k.f13171a;
        LocalTime localTime = (LocalTime) temporalAccessor.k(j$.time.temporal.s.f13178a);
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int r(TemporalField temporalField) {
        switch (l.f13141a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f12985d;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f12985d / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f12985d / 1000000;
            case 6:
                return (int) (y() / 1000000);
            case 7:
                return this.f12984c;
            case 8:
                return z();
            case 9:
                return this.f12983b;
            case 10:
                return (this.f12982a * 60) + this.f12983b;
            case 11:
                return this.f12982a % 12;
            case 12:
                int i10 = this.f12982a % 12;
                if (i10 % 12 != 0) {
                    return i10;
                }
                return 12;
            case 13:
                return this.f12982a;
            case 14:
                byte b10 = this.f12982a;
                if (b10 != 0) {
                    return b10;
                }
                return 24;
            case 15:
                return this.f12982a / 12;
            default:
                throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
    }

    public static LocalTime s(long j10) {
        ChronoField.NANO_OF_DAY.q(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i10 * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i11 * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return p(i10, i11, i12, (int) (j12 - (i12 * 1000000000)));
    }

    /* renamed from: A */
    public final LocalTime d(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.q(j10);
            switch (l.f13141a[chronoField.ordinal()]) {
                case 1:
                    return C((int) j10);
                case 2:
                    return s(j10);
                case 3:
                    return C(((int) j10) * 1000);
                case 4:
                    return s(j10 * 1000);
                case 5:
                    return C(((int) j10) * 1000000);
                case 6:
                    return s(j10 * 1000000);
                case 7:
                    int i10 = (int) j10;
                    if (this.f12984c == i10) {
                        return this;
                    }
                    ChronoField.SECOND_OF_MINUTE.q(i10);
                    return p(this.f12982a, this.f12983b, i10, this.f12985d);
                case 8:
                    return x(j10 - z());
                case 9:
                    int i11 = (int) j10;
                    if (this.f12983b == i11) {
                        return this;
                    }
                    ChronoField.MINUTE_OF_HOUR.q(i11);
                    return p(this.f12982a, i11, this.f12984c, this.f12985d);
                case 10:
                    return v(j10 - ((this.f12982a * 60) + this.f12983b));
                case 11:
                    return u(j10 - (this.f12982a % 12));
                case 12:
                    if (j10 == 12) {
                        j10 = 0;
                    }
                    return u(j10 - (this.f12982a % 12));
                case 13:
                    return B((int) j10);
                case 14:
                    if (j10 == 24) {
                        j10 = 0;
                    }
                    return B((int) j10);
                case 15:
                    return u((j10 - (this.f12982a / 12)) * 12);
                default:
                    throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
            }
        }
        return (LocalTime) temporalField.l(this, j10);
    }

    public final LocalTime B(int i10) {
        if (this.f12982a == i10) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.q(i10);
        return p(i10, this.f12983b, this.f12984c, this.f12985d);
    }

    public final LocalTime C(int i10) {
        if (this.f12985d == i10) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.q(i10);
        return p(this.f12982a, this.f12983b, this.f12984c, i10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        boolean z10 = iVar instanceof LocalTime;
        Temporal temporal = iVar;
        if (!z10) {
            temporal = ((LocalDate) iVar).o(this);
        }
        return (LocalTime) temporal;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.b() : temporalField != null && temporalField.k(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        return this.f12982a == localTime.f12982a && this.f12983b == localTime.f12983b && this.f12984c == localTime.f12984c && this.f12985d == localTime.f12985d;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? r(temporalField) : j$.time.temporal.k.b(this, temporalField);
    }

    public int getHour() {
        return this.f12982a;
    }

    public int getMinute() {
        return this.f12983b;
    }

    public int getNano() {
        return this.f12985d;
    }

    public int getSecond() {
        return this.f12984c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.NANO_OF_DAY ? y() : temporalField == ChronoField.MICRO_OF_DAY ? y() / 1000 : r(temporalField) : temporalField.i(this);
    }

    public final int hashCode() {
        long y10 = y();
        return (int) (y10 ^ (y10 >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        int i10 = j$.time.temporal.k.f13171a;
        if (temporalQuery == j$.time.temporal.n.f13173a || temporalQuery == j$.time.temporal.m.f13172a || temporalQuery == j$.time.temporal.q.f13176a || temporalQuery == j$.time.temporal.p.f13175a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.f13178a) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.r.f13177a) {
            return null;
        }
        return temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        long j10;
        LocalTime q10 = q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long y10 = q10.y() - y();
            switch (l.f13142b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return y10;
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
            return y10 / j10;
        }
        return temporalUnit.f(this, q10);
    }

    /* renamed from: o */
    public final int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.f12982a, localTime.f12982a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f12983b, localTime.f12983b);
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Integer.compare(this.f12984c, localTime.f12984c);
            return compare3 == 0 ? Integer.compare(this.f12985d, localTime.f12985d) : compare3;
        }
        return compare;
    }

    /* renamed from: t */
    public final LocalTime i(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (l.f13142b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return w(j10);
                case 2:
                    return w((j10 % 86400000000L) * 1000);
                case 3:
                    return w((j10 % 86400000) * 1000000);
                case 4:
                    return x(j10);
                case 5:
                    return v(j10);
                case 6:
                    return u(j10);
                case 7:
                    return u((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.h(this, j10);
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f12982a;
        byte b11 = this.f12983b;
        byte b12 = this.f12984c;
        int i11 = this.f12985d;
        sb2.append(b10 < 10 ? "0" : BuildConfig.FLAVOR);
        sb2.append((int) b10);
        String str = ":0";
        sb2.append(b11 < 10 ? str : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i11 > 0) {
            if (b12 >= 10) {
                str = ":";
            }
            sb2.append(str);
            sb2.append((int) b12);
            if (i11 > 0) {
                sb2.append('.');
                int i12 = 1000000;
                if (i11 % 1000000 == 0) {
                    i10 = (i11 / 1000000) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = 1000000000;
                    }
                    i10 = i11 + i12;
                }
                sb2.append(Integer.toString(i10).substring(1));
            }
        }
        return sb2.toString();
    }

    public final LocalTime u(long j10) {
        return j10 == 0 ? this : p(((((int) (j10 % 24)) + this.f12982a) + 24) % 24, this.f12983b, this.f12984c, this.f12985d);
    }

    public final LocalTime v(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f12982a * 60) + this.f12983b;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : p(i11 / 60, i11 % 60, this.f12984c, this.f12985d);
    }

    public final LocalTime w(long j10) {
        if (j10 == 0) {
            return this;
        }
        long y10 = y();
        long j11 = (((j10 % 86400000000000L) + y10) + 86400000000000L) % 86400000000000L;
        return y10 == j11 ? this : p((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public final LocalTime x(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f12983b * 60) + (this.f12982a * 3600) + this.f12984c;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : p(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f12985d);
    }

    public final long y() {
        return (this.f12984c * 1000000000) + (this.f12983b * 60000000000L) + (this.f12982a * 3600000000000L) + this.f12985d;
    }

    public final int z() {
        return (this.f12983b * 60) + (this.f12982a * 3600) + this.f12984c;
    }
}
