package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {

    /* renamed from: h */
    private static final HashMap f13044h;

    /* renamed from: i */
    public static final /* synthetic */ int f13045i = 0;

    /* renamed from: a */
    private DateTimeFormatterBuilder f13046a;

    /* renamed from: b */
    private final DateTimeFormatterBuilder f13047b;

    /* renamed from: c */
    private final ArrayList f13048c;

    /* renamed from: d */
    private final boolean f13049d;

    /* renamed from: e */
    private int f13050e;

    /* renamed from: f */
    private char f13051f;

    /* renamed from: g */
    private int f13052g;

    static {
        HashMap hashMap = new HashMap();
        f13044h = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        TemporalField temporalField = j$.time.temporal.h.f13166a;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
    }

    public DateTimeFormatterBuilder() {
        this.f13046a = this;
        this.f13048c = new ArrayList();
        this.f13052g = -1;
        this.f13047b = null;
        this.f13049d = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f13046a = this;
        this.f13048c = new ArrayList();
        this.f13052g = -1;
        this.f13047b = dateTimeFormatterBuilder;
        this.f13049d = true;
    }

    private int d(g gVar) {
        Objects.requireNonNull(gVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f13046a;
        int i10 = dateTimeFormatterBuilder.f13050e;
        if (i10 > 0) {
            n nVar = new n(gVar, i10, dateTimeFormatterBuilder.f13051f);
            dateTimeFormatterBuilder.f13050e = 0;
            dateTimeFormatterBuilder.f13051f = (char) 0;
            gVar = nVar;
        }
        dateTimeFormatterBuilder.f13048c.add(gVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f13046a;
        dateTimeFormatterBuilder2.f13052g = -1;
        return dateTimeFormatterBuilder2.f13048c.size() - 1;
    }

    private DateTimeFormatterBuilder k(l lVar) {
        l lVar2;
        SignStyle signStyle;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f13046a;
        int i10 = dateTimeFormatterBuilder.f13052g;
        if (i10 >= 0) {
            l lVar3 = (l) dateTimeFormatterBuilder.f13048c.get(i10);
            if (lVar.f13082b == lVar.f13083c) {
                signStyle = lVar.f13084d;
                if (signStyle == SignStyle.NOT_NEGATIVE) {
                    lVar2 = lVar3.h(lVar.f13083c);
                    d(lVar.g());
                    this.f13046a.f13052g = i10;
                    this.f13046a.f13048c.set(i10, lVar2);
                }
            }
            lVar2 = lVar3.g();
            this.f13046a.f13052g = d(lVar);
            this.f13046a.f13048c.set(i10, lVar2);
        } else {
            dateTimeFormatterBuilder.f13052g = d(lVar);
        }
        return this;
    }

    private DateTimeFormatter s(Locale locale, ResolverStyle resolverStyle, j$.time.chrono.e eVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f13046a.f13047b != null) {
            n();
        }
        return new DateTimeFormatter(new C0490f(this.f13048c, false), locale, C.f13028a, resolverStyle, null, eVar, null);
    }

    public final DateTimeFormatterBuilder a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char c10) {
        d(new C0489e(c10));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.length() > 0) {
            d(str.length() == 1 ? new C0489e(str.charAt(0)) : new j(str, 1));
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e5, code lost:
        if (r1 == 1) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.time.format.DateTimeFormatterBuilder appendPattern(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.appendPattern(java.lang.String):j$.time.format.DateTimeFormatterBuilder");
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10) {
        Objects.requireNonNull(temporalField, "field");
        if (i10 >= 1 && i10 <= 19) {
            k(new l(temporalField, i10, i10, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
    }

    public final DateTimeFormatterBuilder b(TemporalField temporalField, int i10, int i11, boolean z10) {
        d(new h(temporalField, i10, i11, z10));
        return this;
    }

    public final DateTimeFormatterBuilder c() {
        d(new i());
        return this;
    }

    public final DateTimeFormatterBuilder e(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        d(new k(formatStyle, formatStyle2));
        return this;
    }

    public final DateTimeFormatterBuilder f(E e10) {
        Objects.requireNonNull(e10, "style");
        if (e10 == E.FULL || e10 == E.SHORT) {
            d(new j(e10, 0));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public final DateTimeFormatterBuilder g(String str, String str2) {
        d(new m(str, str2));
        return this;
    }

    public final DateTimeFormatterBuilder h() {
        d(m.f13087d);
        return this;
    }

    public final DateTimeFormatterBuilder i(TemporalField temporalField, E e10) {
        Objects.requireNonNull(e10, "textStyle");
        d(new t(temporalField, e10, new B()));
        return this;
    }

    public final DateTimeFormatterBuilder j(TemporalField temporalField, Map map) {
        Objects.requireNonNull(temporalField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        E e10 = E.FULL;
        d(new t(temporalField, e10, new C0486b(new A(Collections.singletonMap(e10, linkedHashMap)))));
        return this;
    }

    public final DateTimeFormatterBuilder l(TemporalField temporalField) {
        k(new l(temporalField, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public final DateTimeFormatterBuilder m() {
        d(new v(C0485a.f13065a, "ZoneRegionId()"));
        return this;
    }

    public final DateTimeFormatterBuilder n() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f13046a;
        if (dateTimeFormatterBuilder.f13047b != null) {
            if (dateTimeFormatterBuilder.f13048c.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f13046a;
                C0490f c0490f = new C0490f(dateTimeFormatterBuilder2.f13048c, dateTimeFormatterBuilder2.f13049d);
                this.f13046a = this.f13046a.f13047b;
                d(c0490f);
            } else {
                this.f13046a = this.f13046a.f13047b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final DateTimeFormatterBuilder o() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f13046a;
        dateTimeFormatterBuilder.f13052g = -1;
        this.f13046a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
        return this;
    }

    public final DateTimeFormatterBuilder p() {
        d(s.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        d(s.INSENSITIVE);
        return this;
    }

    public final DateTimeFormatterBuilder q() {
        d(s.LENIENT);
        return this;
    }

    public final DateTimeFormatter r(ResolverStyle resolverStyle, j$.time.chrono.e eVar) {
        return s(Locale.getDefault(), resolverStyle, eVar);
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return s(locale, ResolverStyle.SMART, null);
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        if (i10 == i11 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i11);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        } else if (i11 >= i10) {
            k(new l(temporalField, i10, i11, signStyle));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }
}
