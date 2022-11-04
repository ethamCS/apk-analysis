package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.datatype.jsr310.DecimalUtils;
import com.fasterxml.jackson.datatype.jsr310.util.DurationUnitConverter;
import j$.time.DateTimeException;
import j$.time.Duration;
import w4.a;
/* loaded from: classes.dex */
public class DurationDeserializer extends JSR310DeserializerBase<Duration> implements ContextualDeserializer {
    public static final DurationDeserializer INSTANCE = new DurationDeserializer();
    protected final DurationUnitConverter _durationUnitConverter;

    public DurationDeserializer() {
        super(Duration.class);
        this._durationUnitConverter = null;
    }

    protected DurationDeserializer(DurationDeserializer durationDeserializer, DurationUnitConverter durationUnitConverter) {
        super(durationDeserializer, Boolean.valueOf(durationDeserializer._isLenient));
        this._durationUnitConverter = durationUnitConverter;
    }

    protected DurationDeserializer(DurationDeserializer durationDeserializer, Boolean bool) {
        super(durationDeserializer, bool);
        this._durationUnitConverter = durationDeserializer._durationUnitConverter;
    }

    protected Duration _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return _fromEmptyString(jsonParser, deserializationContext, trim);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.UNTYPED_SCALARS) && _isValidTimestampString(trim)) {
            return _fromTimestamp(deserializationContext, NumberInput.parseLong(trim));
        }
        try {
            return Duration.parse(trim);
        } catch (DateTimeException e10) {
            return (Duration) _handleDateTimeException(deserializationContext, e10, trim);
        }
    }

    protected Duration _fromTimestamp(DeserializationContext deserializationContext, long j10) {
        DurationUnitConverter durationUnitConverter = this._durationUnitConverter;
        return durationUnitConverter != null ? durationUnitConverter.convert(j10) : deserializationContext.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS) ? Duration.ofSeconds(j10) : Duration.ofMillis(j10);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Boolean lenient;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (findFormatOverrides != null) {
            DurationDeserializer withLeniency = (!findFormatOverrides.hasLenient() || (lenient = findFormatOverrides.getLenient()) == null) ? this : withLeniency(lenient);
            if (!findFormatOverrides.hasPattern()) {
                return withLeniency;
            }
            String pattern = findFormatOverrides.getPattern();
            DurationUnitConverter from = DurationUnitConverter.from(pattern);
            if (from == null) {
                deserializationContext.reportBadDefinition(getValueType(deserializationContext), String.format("Bad 'pattern' definition (\"%s\") for `Duration`: expected one of [%s]", pattern, DurationUnitConverter.descForAllowed()));
            }
            return withLeniency.withConverter(from);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Duration deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int currentTokenId = jsonParser.currentTokenId();
        return currentTokenId != 1 ? currentTokenId != 3 ? currentTokenId != 12 ? currentTokenId != 6 ? currentTokenId != 7 ? currentTokenId != 8 ? (Duration) _handleUnexpectedToken(deserializationContext, jsonParser, JsonToken.VALUE_STRING, JsonToken.VALUE_NUMBER_INT, JsonToken.VALUE_NUMBER_FLOAT) : (Duration) DecimalUtils.extractSecondsAndNanos(jsonParser.getDecimalValue(), a.f24673a) : _fromTimestamp(deserializationContext, jsonParser.getLongValue()) : _fromString(jsonParser, deserializationContext, jsonParser.getText()) : (Duration) jsonParser.getEmbeddedObject() : _deserializeFromArray(jsonParser, deserializationContext) : _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    protected DurationDeserializer withConverter(DurationUnitConverter durationUnitConverter) {
        return new DurationDeserializer(this, durationUnitConverter);
    }

    protected DurationDeserializer withLeniency(Boolean bool) {
        return new DurationDeserializer(this, bool);
    }
}
