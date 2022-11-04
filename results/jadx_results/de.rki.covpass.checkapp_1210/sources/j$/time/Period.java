package j$.time;

import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class Period implements j$.time.temporal.l, Serializable {

    /* renamed from: d */
    public static final Period f12994d = new Period(0, 0, 0);

    /* renamed from: e */
    private static final Pattern f12995e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: a */
    private final int f12996a;

    /* renamed from: b */
    private final int f12997b;

    /* renamed from: c */
    private final int f12998c;

    static {
        Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS));
    }

    private Period(int i10, int i11, int i12) {
        this.f12996a = i10;
        this.f12997b = i11;
        this.f12998c = i12;
    }

    public static Period d(int i10) {
        return (0 | i10) == 0 ? f12994d : new Period(0, 0, i10);
    }

    private static int e(CharSequence charSequence, String str, int i10) {
        if (str == null) {
            return 0;
        }
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseInt = Integer.parseInt(str) * i10;
        int i11 = (int) parseInt;
        if (parseInt == i11) {
            return i11;
        }
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e10) {
            throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, e10);
        }
    }

    public static Period parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        Matcher matcher = f12995e.matcher(charSequence);
        if (matcher.matches()) {
            int i10 = 1;
            if ("-".equals(matcher.group(1))) {
                i10 = -1;
            }
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            if (group != null || group2 != null || group4 != null || group3 != null) {
                try {
                    int e10 = e(charSequence, group, i10);
                    int e11 = e(charSequence, group2, i10);
                    int e12 = e(charSequence, group3, i10);
                    int e13 = e(charSequence, group4, i10);
                    long j10 = e12 * 7;
                    long j11 = (int) j10;
                    if (j10 != j11) {
                        throw new ArithmeticException();
                    }
                    long j12 = e13 + j11;
                    int i11 = (int) j12;
                    if (j12 != i11) {
                        throw new ArithmeticException();
                    }
                    return ((e10 | e11) | i11) == 0 ? f12994d : new Period(e10, e11, i11);
                } catch (NumberFormatException e14) {
                    throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, e14);
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    public final Temporal a(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        j$.time.chrono.e eVar = (j$.time.chrono.e) temporal.k(j$.time.temporal.n.f13173a);
        if (eVar == null || j$.time.chrono.f.f13017a.equals(eVar)) {
            int i10 = this.f12997b;
            if (i10 == 0) {
                int i11 = this.f12996a;
                if (i11 != 0) {
                    temporal = temporal.i(i11, ChronoUnit.YEARS);
                }
            } else {
                long j10 = (this.f12996a * 12) + i10;
                if (j10 != 0) {
                    temporal = temporal.i(j10, ChronoUnit.MONTHS);
                }
            }
            int i12 = this.f12998c;
            return i12 != 0 ? temporal.i(i12, ChronoUnit.DAYS) : temporal;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: ISO");
    }

    public final int b() {
        return this.f12998c;
    }

    public final boolean c() {
        return this == f12994d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.f12996a == period.f12996a && this.f12997b == period.f12997b && this.f12998c == period.f12998c;
    }

    public final long f() {
        return (this.f12996a * 12) + this.f12997b;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f12998c, 16) + Integer.rotateLeft(this.f12997b, 8) + this.f12996a;
    }

    public final String toString() {
        if (this == f12994d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        int i10 = this.f12996a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f12997b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f12998c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
