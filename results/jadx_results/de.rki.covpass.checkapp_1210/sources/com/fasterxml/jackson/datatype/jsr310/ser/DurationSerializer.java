package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.jsr310.DecimalUtils;
import com.fasterxml.jackson.datatype.jsr310.util.DurationUnitConverter;
import j$.time.Duration;
import j$.time.format.DateTimeFormatter;
import java.math.BigDecimal;
/* loaded from: classes.dex */
public class DurationSerializer extends JSR310FormattedSerializerBase<Duration> {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    private DurationUnitConverter _durationUnitConverter;

    protected DurationSerializer() {
        super(Duration.class);
    }

    protected DurationSerializer(DurationSerializer durationSerializer, DurationUnitConverter durationUnitConverter) {
        super(durationSerializer, durationSerializer._useTimestamp, durationSerializer._useNanoseconds, durationSerializer._formatter, durationSerializer._shape);
        this._durationUnitConverter = durationUnitConverter;
    }

    protected DurationSerializer(DurationSerializer durationSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        super(durationSerializer, bool, dateTimeFormatter, null);
    }

    protected DurationSerializer(DurationSerializer durationSerializer, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter) {
        super(durationSerializer, bool, bool2, dateTimeFormatter, null);
    }

    private BigDecimal _toNanos(Duration duration) {
        if (duration.isNegative()) {
            Duration abs = duration.abs();
            return DecimalUtils.toBigDecimal(abs.getSeconds(), abs.getNano()).negate();
        }
        return DecimalUtils.toBigDecimal(duration.getSeconds(), duration.getNano());
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected DateTimeFormatter _useDateTimeFormatter(SerializerProvider serializerProvider, JsonFormat.Value value) {
        return null;
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        DurationSerializer durationSerializer = (DurationSerializer) super.createContextual(serializerProvider, beanProperty);
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides == null || !findFormatOverrides.hasPattern()) {
            return durationSerializer;
        }
        String pattern = findFormatOverrides.getPattern();
        DurationUnitConverter from = DurationUnitConverter.from(pattern);
        if (from == null) {
            serializerProvider.reportBadDefinition(handledType(), String.format("Bad 'pattern' definition (\"%s\") for `Duration`: expected one of [%s]", pattern, DurationUnitConverter.descForAllowed()));
        }
        return durationSerializer.withConverter(from);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected SerializationFeature getTimestampsFeature() {
        return SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS;
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? useNanoseconds(serializerProvider) ? JsonToken.VALUE_NUMBER_FLOAT : JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_STRING;
    }

    public void serialize(Duration duration, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!useTimestamp(serializerProvider)) {
            jsonGenerator.writeString(duration.toString());
        } else if (useNanoseconds(serializerProvider)) {
            jsonGenerator.writeNumber(_toNanos(duration));
        } else {
            DurationUnitConverter durationUnitConverter = this._durationUnitConverter;
            jsonGenerator.writeNumber(durationUnitConverter != null ? durationUnitConverter.convert(duration) : duration.toMillis());
        }
    }

    protected DurationSerializer withConverter(DurationUnitConverter durationUnitConverter) {
        return new DurationSerializer(this, durationUnitConverter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return new DurationSerializer(this, this._useTimestamp, bool2, this._formatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    public DurationSerializer withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new DurationSerializer(this, bool, dateTimeFormatter);
    }
}
