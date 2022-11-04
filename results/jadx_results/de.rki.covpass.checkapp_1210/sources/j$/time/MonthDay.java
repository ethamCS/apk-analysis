package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.Serializable;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class MonthDay implements TemporalAccessor, j$.time.temporal.i, Comparable<MonthDay>, Serializable {

    /* renamed from: c */
    private static final DateTimeFormatter f12986c = new DateTimeFormatterBuilder().appendLiteral("--").appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();

    /* renamed from: d */
    public static final /* synthetic */ int f12987d = 0;

    /* renamed from: a */
    private final int f12988a;

    /* renamed from: b */
    private final int f12989b;

    private MonthDay(int i10, int i11) {
        this.f12988a = i10;
        this.f12989b = i11;
    }

    public static MonthDay of(int i10, int i11) {
        n s10 = n.s(i10);
        Objects.requireNonNull(s10, "month");
        ChronoField.DAY_OF_MONTH.q(i11);
        if (i11 <= s10.r()) {
            return new MonthDay(s10.p(), i11);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i11 + " is not valid for month " + s10.name());
    }

    public static MonthDay parse(CharSequence charSequence) {
        return parse(charSequence, f12986c);
    }

    public static MonthDay parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (MonthDay) dateTimeFormatter.parse(charSequence, o.f13146a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.k(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i10 = this.f12988a - monthDay2.f12988a;
        return i10 == 0 ? this.f12989b - monthDay2.f12989b : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthDay)) {
            return false;
        }
        MonthDay monthDay = (MonthDay) obj;
        return this.f12988a == monthDay.f12988a && this.f12989b == monthDay.f12989b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.f();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return j$.time.temporal.k.d(this, temporalField);
        }
        n s10 = n.s(this.f12988a);
        Objects.requireNonNull(s10);
        int i10 = m.f13143a[s10.ordinal()];
        return j$.time.temporal.u.k(i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, n.s(this.f12988a).r());
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return f(temporalField).a(h(temporalField), temporalField);
    }

    public int getDayOfMonth() {
        return this.f12989b;
    }

    public int getMonthValue() {
        return this.f12988a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        int i10;
        if (temporalField instanceof ChronoField) {
            int i11 = p.f13147a[((ChronoField) temporalField).ordinal()];
            if (i11 == 1) {
                i10 = this.f12989b;
            } else if (i11 != 2) {
                throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
            } else {
                i10 = this.f12988a;
            }
            return i10;
        }
        return temporalField.i(this);
    }

    public final int hashCode() {
        return (this.f12988a << 6) + this.f12989b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f13173a ? j$.time.chrono.f.f13017a : j$.time.temporal.k.c(this, temporalQuery);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f12988a < 10 ? "0" : BuildConfig.FLAVOR);
        sb2.append(this.f12988a);
        sb2.append(this.f12989b < 10 ? "-0" : "-");
        sb2.append(this.f12989b);
        return sb2.toString();
    }
}
