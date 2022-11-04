package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.datatype.jsr310.DecimalUtils;
import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.DesugarTimeZone;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w4.c;
import w4.d;
import w4.e;
import w4.f;
import w4.g;
import w4.h;
import w4.i;
import w4.j;
import w4.k;
import w4.l;
import w4.m;
import w4.n;
/* loaded from: classes.dex */
public class InstantDeserializer<T extends Temporal> extends JSR310DateTimeDeserializerBase<T> {
    protected final Boolean _adjustToContextTZOverride;
    protected final BiFunction<T, ZoneId, T> adjust;
    protected final Function<FromIntegerArguments, T> fromMilliseconds;
    protected final Function<FromDecimalArguments, T> fromNanoseconds;
    protected final Function<TemporalAccessor, T> parsedToValue;
    protected final boolean replaceZeroOffsetAsZ;
    private static final Pattern ISO8601_UTC_ZERO_OFFSET_SUFFIX_REGEX = Pattern.compile("\\+00:?(00)?$");
    protected static final Pattern ISO8601_COLONLESS_OFFSET_REGEX = Pattern.compile("[+-][0-9]{4}(?=\\[|$)");
    public static final InstantDeserializer<Instant> INSTANT = new InstantDeserializer<>(Instant.class, DateTimeFormatter.ISO_INSTANT, c.f24676a, m.f24686a, i.f24682a, null, true);
    public static final InstantDeserializer<OffsetDateTime> OFFSET_DATE_TIME = new InstantDeserializer<>(OffsetDateTime.class, DateTimeFormatter.ISO_OFFSET_DATE_TIME, d.f24677a, l.f24685a, k.f24684a, f.f24679a, true);
    public static final InstantDeserializer<ZonedDateTime> ZONED_DATE_TIME = new InstantDeserializer<>(ZonedDateTime.class, DateTimeFormatter.ISO_ZONED_DATE_TIME, e.f24678a, n.f24687a, j.f24683a, g.f24680a, false);

    /* loaded from: classes.dex */
    public static class FromDecimalArguments {
        public final int fraction;
        public final long integer;
        public final ZoneId zoneId;

        FromDecimalArguments(long j10, int i10, ZoneId zoneId) {
            this.integer = j10;
            this.fraction = i10;
            this.zoneId = zoneId;
        }
    }

    /* loaded from: classes.dex */
    public static class FromIntegerArguments {
        public final long value;
        public final ZoneId zoneId;

        FromIntegerArguments(long j10, ZoneId zoneId) {
            this.value = j10;
            this.zoneId = zoneId;
        }
    }

    protected InstantDeserializer(InstantDeserializer<T> instantDeserializer, DateTimeFormatter dateTimeFormatter) {
        super(instantDeserializer.handledType(), dateTimeFormatter);
        this.parsedToValue = instantDeserializer.parsedToValue;
        this.fromMilliseconds = instantDeserializer.fromMilliseconds;
        this.fromNanoseconds = instantDeserializer.fromNanoseconds;
        this.adjust = instantDeserializer.adjust;
        this.replaceZeroOffsetAsZ = this._formatter == DateTimeFormatter.ISO_INSTANT;
        this._adjustToContextTZOverride = instantDeserializer._adjustToContextTZOverride;
    }

    protected InstantDeserializer(InstantDeserializer<T> instantDeserializer, DateTimeFormatter dateTimeFormatter, Boolean bool) {
        super(instantDeserializer.handledType(), dateTimeFormatter, bool);
        this.parsedToValue = instantDeserializer.parsedToValue;
        this.fromMilliseconds = instantDeserializer.fromMilliseconds;
        this.fromNanoseconds = instantDeserializer.fromNanoseconds;
        this.adjust = instantDeserializer.adjust;
        this.replaceZeroOffsetAsZ = this._formatter == DateTimeFormatter.ISO_INSTANT;
        this._adjustToContextTZOverride = instantDeserializer._adjustToContextTZOverride;
    }

    protected InstantDeserializer(InstantDeserializer<T> instantDeserializer, Boolean bool) {
        super(instantDeserializer.handledType(), instantDeserializer._formatter);
        this.parsedToValue = instantDeserializer.parsedToValue;
        this.fromMilliseconds = instantDeserializer.fromMilliseconds;
        this.fromNanoseconds = instantDeserializer.fromNanoseconds;
        this.adjust = instantDeserializer.adjust;
        this.replaceZeroOffsetAsZ = instantDeserializer.replaceZeroOffsetAsZ;
        this._adjustToContextTZOverride = bool;
    }

    protected InstantDeserializer(Class<T> cls, DateTimeFormatter dateTimeFormatter, Function<TemporalAccessor, T> function, Function<FromIntegerArguments, T> function2, Function<FromDecimalArguments, T> function3, BiFunction<T, ZoneId, T> biFunction, boolean z10) {
        super(cls, dateTimeFormatter);
        this.parsedToValue = function;
        this.fromMilliseconds = function2;
        this.fromNanoseconds = function3;
        this.adjust = biFunction == null ? h.f24681a : biFunction;
        this.replaceZeroOffsetAsZ = z10;
        this._adjustToContextTZOverride = null;
    }

    private String addInColonToOffsetIfMissing(String str) {
        Matcher matcher = ISO8601_COLONLESS_OFFSET_REGEX.matcher(str);
        if (matcher.find()) {
            StringBuilder sb2 = new StringBuilder(matcher.group(0));
            sb2.insert(3, ":");
            return matcher.replaceFirst(sb2.toString());
        }
        return str;
    }

    private ZoneId getZone(DeserializationContext deserializationContext) {
        ZoneId a10;
        if (this._valueClass == Instant.class) {
            return null;
        }
        a10 = DesugarTimeZone.a(deserializationContext.getTimeZone());
        return a10;
    }

    public /* synthetic */ FromDecimalArguments lambda$_fromDecimal$8(DeserializationContext deserializationContext, Long l10, Integer num) {
        return new FromDecimalArguments(l10.longValue(), num.intValue(), getZone(deserializationContext));
    }

    public static /* synthetic */ Temporal lambda$new$7(Temporal temporal, ZoneId zoneId) {
        return temporal;
    }

    public static /* synthetic */ Instant lambda$static$0(FromIntegerArguments fromIntegerArguments) {
        return Instant.ofEpochMilli(fromIntegerArguments.value);
    }

    public static /* synthetic */ Instant lambda$static$1(FromDecimalArguments fromDecimalArguments) {
        return Instant.ofEpochSecond(fromDecimalArguments.integer, fromDecimalArguments.fraction);
    }

    public static /* synthetic */ OffsetDateTime lambda$static$2(FromIntegerArguments fromIntegerArguments) {
        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(fromIntegerArguments.value), fromIntegerArguments.zoneId);
    }

    public static /* synthetic */ OffsetDateTime lambda$static$3(FromDecimalArguments fromDecimalArguments) {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(fromDecimalArguments.integer, fromDecimalArguments.fraction), fromDecimalArguments.zoneId);
    }

    public static /* synthetic */ OffsetDateTime lambda$static$4(OffsetDateTime offsetDateTime, ZoneId zoneId) {
        return (offsetDateTime.isEqual(OffsetDateTime.MIN) || offsetDateTime.isEqual(OffsetDateTime.MAX)) ? offsetDateTime : offsetDateTime.withOffsetSameInstant(zoneId.getRules().getOffset(offsetDateTime.toLocalDateTime()));
    }

    public static /* synthetic */ ZonedDateTime lambda$static$5(FromIntegerArguments fromIntegerArguments) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(fromIntegerArguments.value), fromIntegerArguments.zoneId);
    }

    public static /* synthetic */ ZonedDateTime lambda$static$6(FromDecimalArguments fromDecimalArguments) {
        return ZonedDateTime.ofInstant(Instant.ofEpochSecond(fromDecimalArguments.integer, fromDecimalArguments.fraction), fromDecimalArguments.zoneId);
    }

    private String replaceZeroOffsetAsZIfNecessary(String str) {
        return this.replaceZeroOffsetAsZ ? ISO8601_UTC_ZERO_OFFSET_SUFFIX_REGEX.matcher(str).replaceFirst("Z") : str;
    }

    protected int _countPeriods(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < '0' || charAt > '9') {
                if (charAt != '.') {
                    return -1;
                }
                i10++;
            }
        }
        return i10;
    }

    protected T _fromDecimal(final DeserializationContext deserializationContext, BigDecimal bigDecimal) {
        return this.fromNanoseconds.apply((FromDecimalArguments) DecimalUtils.extractSecondsAndNanos(bigDecimal, new BiFunction() { // from class: w4.b
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return Objects.requireNonNull(function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                InstantDeserializer.FromDecimalArguments lambda$_fromDecimal$8;
                lambda$_fromDecimal$8 = InstantDeserializer.this.lambda$_fromDecimal$8(deserializationContext, (Long) obj, (Integer) obj2);
                return lambda$_fromDecimal$8;
            }
        }));
    }

    protected T _fromLong(DeserializationContext deserializationContext, long j10) {
        Function function;
        Object fromIntegerArguments;
        if (deserializationContext.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)) {
            function = this.fromNanoseconds;
            fromIntegerArguments = new FromDecimalArguments(j10, 0, getZone(deserializationContext));
        } else {
            function = this.fromMilliseconds;
            fromIntegerArguments = new FromIntegerArguments(j10, getZone(deserializationContext));
        }
        return (T) function.apply(fromIntegerArguments);
    }

    protected T _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return (T) _fromEmptyString(jsonParser, deserializationContext, trim);
        }
        DateTimeFormatter dateTimeFormatter = this._formatter;
        if (dateTimeFormatter == DateTimeFormatter.ISO_INSTANT || dateTimeFormatter == DateTimeFormatter.ISO_OFFSET_DATE_TIME || dateTimeFormatter == DateTimeFormatter.ISO_ZONED_DATE_TIME) {
            int _countPeriods = _countPeriods(trim);
            if (_countPeriods >= 0) {
                try {
                    if (_countPeriods == 0) {
                        return _fromLong(deserializationContext, Long.parseLong(trim));
                    }
                    if (_countPeriods == 1) {
                        return _fromDecimal(deserializationContext, new BigDecimal(trim));
                    }
                } catch (NumberFormatException unused) {
                }
            }
            trim = replaceZeroOffsetAsZIfNecessary(trim);
        }
        DateTimeFormatter dateTimeFormatter2 = this._formatter;
        if (dateTimeFormatter2 == DateTimeFormatter.ISO_OFFSET_DATE_TIME || dateTimeFormatter2 == DateTimeFormatter.ISO_ZONED_DATE_TIME) {
            trim = addInColonToOffsetIfMissing(trim);
        }
        try {
            T apply = this.parsedToValue.apply(this._formatter.parse(trim));
            return shouldAdjustToContextTimezone(deserializationContext) ? this.adjust.apply(apply, getZone(deserializationContext)) : apply;
        } catch (DateTimeException e10) {
            return (T) _handleDateTimeException(deserializationContext, e10, trim);
        }
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<?> _withFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonFormat.Value value) {
        InstantDeserializer instantDeserializer = (InstantDeserializer) super._withFormatOverrides(deserializationContext, beanProperty, value);
        Boolean feature = value.getFeature(JsonFormat.Feature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        return !Objects.equals(feature, instantDeserializer._adjustToContextTZOverride) ? new InstantDeserializer(instantDeserializer, feature) : instantDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int currentTokenId = jsonParser.currentTokenId();
        return currentTokenId != 1 ? currentTokenId != 3 ? currentTokenId != 12 ? currentTokenId != 6 ? currentTokenId != 7 ? currentTokenId != 8 ? (T) _handleUnexpectedToken(deserializationContext, jsonParser, JsonToken.VALUE_STRING, JsonToken.VALUE_NUMBER_INT, JsonToken.VALUE_NUMBER_FLOAT) : _fromDecimal(deserializationContext, jsonParser.getDecimalValue()) : _fromLong(deserializationContext, jsonParser.getLongValue()) : _fromString(jsonParser, deserializationContext, jsonParser.getText()) : (T) jsonParser.getEmbeddedObject() : (T) _deserializeFromArray(jsonParser, deserializationContext) : _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
    }

    protected boolean shouldAdjustToContextTimezone(DeserializationContext deserializationContext) {
        Boolean bool = this._adjustToContextTZOverride;
        return bool != null ? bool.booleanValue() : deserializationContext.isEnabled(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public InstantDeserializer<T> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter == this._formatter ? this : new InstantDeserializer<>(this, dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public InstantDeserializer<T> withLeniency(Boolean bool) {
        return new InstantDeserializer<>(this, this._formatter, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public InstantDeserializer<T> withShape(JsonFormat.Shape shape) {
        return this;
    }
}
