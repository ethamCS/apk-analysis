package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
/* loaded from: classes.dex */
public class LocalTimeSerializer extends JSR310FormattedSerializerBase<LocalTime> {
    public static final LocalTimeSerializer INSTANCE = new LocalTimeSerializer();

    protected LocalTimeSerializer() {
        this(null);
    }

    protected LocalTimeSerializer(LocalTimeSerializer localTimeSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        this(localTimeSerializer, bool, null, dateTimeFormatter);
    }

    protected LocalTimeSerializer(LocalTimeSerializer localTimeSerializer, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter) {
        super(localTimeSerializer, bool, bool2, dateTimeFormatter, null);
    }

    public LocalTimeSerializer(DateTimeFormatter dateTimeFormatter) {
        super(LocalTime.class, dateTimeFormatter);
    }

    private final void _serializeAsArrayContents(LocalTime localTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(localTime.getHour());
        jsonGenerator.writeNumber(localTime.getMinute());
        int second = localTime.getSecond();
        int nano = localTime.getNano();
        if (second > 0 || nano > 0) {
            jsonGenerator.writeNumber(second);
            if (nano <= 0) {
                return;
            }
            if (useNanoseconds(serializerProvider)) {
                jsonGenerator.writeNumber(nano);
            } else {
                jsonGenerator.writeNumber(localTime.get(ChronoField.MILLI_OF_SECOND));
            }
        }
    }

    protected DateTimeFormatter _defaultFormatter() {
        return DateTimeFormatter.ISO_LOCAL_TIME;
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? JsonToken.START_ARRAY : JsonToken.VALUE_STRING;
    }

    public void serialize(LocalTime localTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (useTimestamp(serializerProvider)) {
            jsonGenerator.writeStartArray();
            _serializeAsArrayContents(localTime, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        DateTimeFormatter dateTimeFormatter = this._formatter;
        if (dateTimeFormatter == null) {
            dateTimeFormatter = _defaultFormatter();
        }
        jsonGenerator.writeString(localTime.format(dateTimeFormatter));
    }

    public void serializeWithType(LocalTime localTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(localTime, serializationShape(serializerProvider)));
        if (writeTypePrefix.valueShape == JsonToken.START_ARRAY) {
            _serializeAsArrayContents(localTime, jsonGenerator, serializerProvider);
        } else {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter = _defaultFormatter();
            }
            jsonGenerator.writeString(localTime.format(dateTimeFormatter));
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return new LocalTimeSerializer(this, this._useTimestamp, bool2, this._formatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<LocalTime> withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new LocalTimeSerializer(this, bool, dateTimeFormatter);
    }
}
