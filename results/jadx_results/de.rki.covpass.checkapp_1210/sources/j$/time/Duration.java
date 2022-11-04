package j$.time;

import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.l, Comparable<Duration>, Serializable {

    /* renamed from: c */
    public static final Duration f12962c = new Duration(0, 0);

    /* renamed from: d */
    private static final BigInteger f12963d = BigInteger.valueOf(1000000000);

    /* renamed from: e */
    private static final Pattern f12964e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    /* renamed from: a */
    private final long f12965a;

    /* renamed from: b */
    private final int f12966b;

    private Duration(long j10, int i10) {
        this.f12965a = j10;
        this.f12966b = i10;
    }

    private static Duration b(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? f12962c : new Duration(j10, i10);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return f(temporal.l(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long l10 = temporal.l(temporal2, ChronoUnit.SECONDS);
            long j10 = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long h10 = temporal2.h(chronoField) - temporal.h(chronoField);
                int i10 = (l10 > 0L ? 1 : (l10 == 0L ? 0 : -1));
                if (i10 > 0 && h10 < 0) {
                    l10++;
                } else if (i10 < 0 && h10 > 0) {
                    l10--;
                }
                j10 = h10;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(l10, j10);
        }
    }

    public static Duration f(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j11--;
        }
        return b(j11, i10);
    }

    private static long h(CharSequence charSequence, String str, int i10, String str2) {
        if (str == null) {
            return 0L;
        }
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        try {
            return c.e(Long.parseLong(str), i10);
        } catch (ArithmeticException | NumberFormatException e10) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e10));
        }
    }

    private Duration i(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofSeconds(c.b(c.b(this.f12965a, j10), j11 / 1000000000), this.f12966b + (j11 % 1000000000));
    }

    public static Duration of(long j10, TemporalUnit temporalUnit) {
        Duration duration = f12962c;
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.i(c.e(j10, 86400L), 0L);
        }
        if (temporalUnit.i()) {
            throw new j$.time.temporal.t("Unit must not have an estimated duration");
        }
        if (j10 == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration d10 = temporalUnit.k().d(j10);
            return duration.l(d10.getSeconds()).k(d10.getNano());
        }
        int i10 = e.f13020a[((ChronoUnit) temporalUnit).ordinal()];
        if (i10 == 1) {
            return duration.k(j10);
        }
        if (i10 == 2) {
            return duration.l((j10 / 1000000000) * 1000).k((j10 % 1000000000) * 1000);
        }
        if (i10 == 3) {
            return duration.i(j10 / 1000, (j10 % 1000) * 1000000);
        }
        if (i10 != 4) {
            j10 = c.e(temporalUnit.k().f12965a, j10);
        }
        return duration.l(j10);
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return b(j11, i10 * 1000000);
    }

    public static Duration ofSeconds(long j10) {
        return b(j10, 0);
    }

    public static Duration ofSeconds(long j10, long j11) {
        return b(c.b(j10, c.d(j11, 1000000000L)), (int) c.c(j11, 1000000000L));
    }

    public static Duration parse(CharSequence charSequence) {
        int i10;
        Objects.requireNonNull(charSequence, "text");
        Matcher matcher = f12964e.matcher(charSequence);
        if (matcher.matches() && !"T".equals(matcher.group(3))) {
            int i11 = 1;
            boolean equals = "-".equals(matcher.group(1));
            String group = matcher.group(2);
            String group2 = matcher.group(4);
            String group3 = matcher.group(5);
            String group4 = matcher.group(6);
            String group5 = matcher.group(7);
            if (group != null || group2 != null || group3 != null || group4 != null) {
                long h10 = h(charSequence, group, 86400, "days");
                long h11 = h(charSequence, group2, 3600, "hours");
                long h12 = h(charSequence, group3, 60, "minutes");
                long h13 = h(charSequence, group4, 1, "seconds");
                if (h13 < 0) {
                    i11 = -1;
                }
                if (group5 == null || group5.length() == 0) {
                    i10 = 0;
                } else {
                    try {
                        i10 = Integer.parseInt((group5 + "000000000").substring(0, 9)) * i11;
                    } catch (ArithmeticException | NumberFormatException e10) {
                        throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e10));
                    }
                }
                try {
                    long b10 = c.b(h10, c.b(h11, c.b(h12, h13)));
                    long j10 = i10;
                    if (equals) {
                        return ofSeconds(b10, j10).d(-1L);
                    }
                    return ofSeconds(b10, j10);
                } catch (ArithmeticException e11) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e11));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    public Duration abs() {
        return isNegative() ? d(-1L) : this;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f12965a, duration2.f12965a);
        return compare != 0 ? compare : this.f12966b - duration2.f12966b;
    }

    public final Duration d(long j10) {
        if (j10 == 0) {
            return f12962c;
        }
        if (j10 == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.f12965a).add(BigDecimal.valueOf(this.f12966b, 9)).multiply(BigDecimal.valueOf(j10)).movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(f12963d);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f12965a == duration.f12965a && this.f12966b == duration.f12966b;
    }

    public int getNano() {
        return this.f12966b;
    }

    public long getSeconds() {
        return this.f12965a;
    }

    public final int hashCode() {
        long j10 = this.f12965a;
        return (this.f12966b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public boolean isNegative() {
        return this.f12965a < 0;
    }

    public final Duration k(long j10) {
        return i(0L, j10);
    }

    public final Duration l(long j10) {
        return i(j10, 0L);
    }

    public long toDays() {
        return this.f12965a / 86400;
    }

    public long toHours() {
        return this.f12965a / 3600;
    }

    public long toMillis() {
        return c.b(c.e(this.f12965a, 1000L), this.f12966b / 1000000);
    }

    public long toMinutes() {
        return this.f12965a / 60;
    }

    public long toNanos() {
        return c.b(c.e(this.f12965a, 1000000000L), this.f12966b);
    }

    public String toString() {
        if (this == f12962c) {
            return "PT0S";
        }
        long j10 = this.f12965a;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f12966b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i11 >= 0 || this.f12966b <= 0) {
            sb2.append(i11);
        } else if (i11 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i11 + 1);
        }
        if (this.f12966b > 0) {
            int length = sb2.length();
            sb2.append(i11 < 0 ? 2000000000 - this.f12966b : this.f12966b + 1000000000);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
