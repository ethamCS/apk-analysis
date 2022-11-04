package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.AbstractC0516o;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_TIME;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
    public static final DateTimeFormatter ISO_OFFSET_TIME;
    public static final DateTimeFormatter ISO_ZONED_DATE_TIME;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;

    /* renamed from: a */
    private final C0490f f13037a;

    /* renamed from: b */
    private final Locale f13038b;

    /* renamed from: c */
    private final C f13039c;

    /* renamed from: d */
    private final ResolverStyle f13040d;

    /* renamed from: e */
    private final Set f13041e;

    /* renamed from: f */
    private final j$.time.chrono.e f13042f;

    /* renamed from: g */
    private final ZoneId f13043g;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder appendValue = appendLiteral2.appendValue(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
        DateTimeFormatter r10 = appendValue.r(resolverStyle, fVar);
        ISO_LOCAL_DATE = r10;
        DateTimeFormatterBuilder parseCaseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive.a(r10);
        parseCaseInsensitive.h();
        parseCaseInsensitive.r(resolverStyle, fVar);
        DateTimeFormatterBuilder parseCaseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive2.a(r10);
        parseCaseInsensitive2.o();
        parseCaseInsensitive2.h();
        parseCaseInsensitive2.r(resolverStyle, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder appendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder appendValue2 = appendLiteral3.appendValue(chronoField5, 2);
        appendValue2.o();
        DateTimeFormatterBuilder appendLiteral4 = appendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder appendValue3 = appendLiteral4.appendValue(chronoField6, 2);
        appendValue3.o();
        appendValue3.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter r11 = appendValue3.r(resolverStyle, null);
        ISO_LOCAL_TIME = r11;
        DateTimeFormatterBuilder parseCaseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive3.a(r11);
        parseCaseInsensitive3.h();
        ISO_OFFSET_TIME = parseCaseInsensitive3.r(resolverStyle, null);
        DateTimeFormatterBuilder parseCaseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive4.a(r11);
        parseCaseInsensitive4.o();
        parseCaseInsensitive4.h();
        parseCaseInsensitive4.r(resolverStyle, null);
        DateTimeFormatterBuilder parseCaseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive5.a(r10);
        DateTimeFormatterBuilder appendLiteral5 = parseCaseInsensitive5.appendLiteral('T');
        appendLiteral5.a(r11);
        DateTimeFormatter r12 = appendLiteral5.r(resolverStyle, fVar);
        ISO_LOCAL_DATE_TIME = r12;
        DateTimeFormatterBuilder parseCaseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive6.a(r12);
        parseCaseInsensitive6.h();
        DateTimeFormatter r13 = parseCaseInsensitive6.r(resolverStyle, fVar);
        ISO_OFFSET_DATE_TIME = r13;
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(r13);
        dateTimeFormatterBuilder3.o();
        DateTimeFormatterBuilder appendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        appendLiteral6.p();
        appendLiteral6.m();
        ISO_ZONED_DATE_TIME = appendLiteral6.appendLiteral(']').r(resolverStyle, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(r12);
        dateTimeFormatterBuilder4.o();
        dateTimeFormatterBuilder4.h();
        dateTimeFormatterBuilder4.o();
        DateTimeFormatterBuilder appendLiteral7 = dateTimeFormatterBuilder4.appendLiteral('[');
        appendLiteral7.p();
        appendLiteral7.m();
        appendLiteral7.appendLiteral(']').r(resolverStyle, fVar);
        DateTimeFormatterBuilder appendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        appendValue4.o();
        appendValue4.h();
        appendValue4.r(resolverStyle, fVar);
        DateTimeFormatterBuilder appendLiteral8 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.h.f13168c, 4, 10, signStyle).appendLiteral("-W").appendValue(j$.time.temporal.h.f13167b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder appendValue5 = appendLiteral8.appendValue(chronoField7, 1);
        appendValue5.o();
        appendValue5.h();
        appendValue5.r(resolverStyle, fVar);
        DateTimeFormatterBuilder parseCaseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive7.c();
        ISO_INSTANT = parseCaseInsensitive7.r(resolverStyle, null);
        DateTimeFormatterBuilder appendValue6 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        appendValue6.o();
        appendValue6.g("+HHMMss", "Z");
        appendValue6.r(resolverStyle, fVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder parseCaseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive8.q();
        parseCaseInsensitive8.o();
        parseCaseInsensitive8.j(chronoField7, hashMap);
        DateTimeFormatterBuilder appendLiteral9 = parseCaseInsensitive8.appendLiteral(", ");
        appendLiteral9.n();
        DateTimeFormatterBuilder appendLiteral10 = appendLiteral9.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        appendLiteral10.j(chronoField2, hashMap2);
        DateTimeFormatterBuilder appendValue7 = appendLiteral10.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        appendValue7.o();
        DateTimeFormatterBuilder appendValue8 = appendValue7.appendLiteral(':').appendValue(chronoField6, 2);
        appendValue8.n();
        DateTimeFormatterBuilder appendLiteral11 = appendValue8.appendLiteral(' ');
        appendLiteral11.g("+HHMM", "GMT");
        RFC_1123_DATE_TIME = appendLiteral11.r(ResolverStyle.SMART, fVar);
    }

    public DateTimeFormatter(C0490f c0490f, Locale locale, C c10, ResolverStyle resolverStyle, Set set, j$.time.chrono.e eVar, ZoneId zoneId) {
        Objects.requireNonNull(c0490f, "printerParser");
        this.f13037a = c0490f;
        this.f13041e = set;
        Objects.requireNonNull(locale, "locale");
        this.f13038b = locale;
        Objects.requireNonNull(c10, "decimalStyle");
        this.f13039c = c10;
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        this.f13040d = resolverStyle;
        this.f13042f = eVar;
        this.f13043g = zoneId;
    }

    private DateTimeParseException a(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + str + "' could not be parsed: " + runtimeException.getMessage(), charSequence, runtimeException);
    }

    private TemporalAccessor e(CharSequence charSequence) {
        String str;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        x xVar = new x(this);
        int d10 = this.f13037a.d(xVar, charSequence, parsePosition.getIndex());
        if (d10 < 0) {
            parsePosition.setErrorIndex(~d10);
            xVar = null;
        } else {
            parsePosition.setIndex(d10);
        }
        if (xVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                throw new DateTimeParseException("Text '" + str + "' could not be parsed at index " + parsePosition.getErrorIndex(), charSequence, parsePosition.getErrorIndex());
            }
            throw new DateTimeParseException("Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex(), charSequence, parsePosition.getIndex());
        }
        return xVar.t(this.f13040d, this.f13041e);
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e(formatStyle, null);
        return dateTimeFormatterBuilder.r(ResolverStyle.SMART, j$.time.chrono.f.f13017a);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle, FormatStyle formatStyle2) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        Objects.requireNonNull(formatStyle2, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e(formatStyle, formatStyle2);
        return dateTimeFormatterBuilder.r(ResolverStyle.SMART, j$.time.chrono.f.f13017a);
    }

    public static DateTimeFormatter ofPattern(String str) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter(locale);
    }

    public final j$.time.chrono.e b() {
        return this.f13042f;
    }

    public final C c() {
        return this.f13039c;
    }

    public final Locale d() {
        return this.f13038b;
    }

    public final C0490f f() {
        return this.f13037a.a();
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f13037a.b(new z(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new DateTimeException(e10.getMessage(), e10);
        }
    }

    public ZoneId getZone() {
        return this.f13043g;
    }

    public TemporalAccessor parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        try {
            return e(charSequence);
        } catch (DateTimeParseException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw a(charSequence, e11);
        }
    }

    public final String toString() {
        String c0490f = this.f13037a.toString();
        return c0490f.startsWith("[") ? c0490f : c0490f.substring(1, c0490f.length() - 1);
    }

    public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        return AbstractC0516o.p(this.f13040d, resolverStyle) ? this : new DateTimeFormatter(this.f13037a, this.f13038b, this.f13039c, resolverStyle, this.f13041e, this.f13042f, this.f13043g);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        return AbstractC0516o.p(this.f13043g, zoneId) ? this : new DateTimeFormatter(this.f13037a, this.f13038b, this.f13039c, this.f13040d, this.f13041e, this.f13042f, zoneId);
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) ((D) e(charSequence)).k(temporalQuery);
        } catch (DateTimeParseException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw a(charSequence, e11);
        }
    }
}
