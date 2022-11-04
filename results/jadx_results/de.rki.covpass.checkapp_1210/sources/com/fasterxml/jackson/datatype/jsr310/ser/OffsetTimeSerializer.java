package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import j$.time.OffsetTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
/* loaded from: classes.dex */
public class OffsetTimeSerializer extends JSR310FormattedSerializerBase<OffsetTime> {
    public static final OffsetTimeSerializer INSTANCE = new OffsetTimeSerializer();

    protected OffsetTimeSerializer() {
        super(OffsetTime.class);
    }

    protected OffsetTimeSerializer(OffsetTimeSerializer offsetTimeSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        this(offsetTimeSerializer, bool, null, dateTimeFormatter);
    }

    protected OffsetTimeSerializer(OffsetTimeSerializer offsetTimeSerializer, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter) {
        super(offsetTimeSerializer, bool, bool2, dateTimeFormatter, null);
    }

    private final void _serializeAsArrayContents(OffsetTime offsetTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(offsetTime.getHour());
        jsonGenerator.writeNumber(offsetTime.getMinute());
        int second = offsetTime.getSecond();
        int nano = offsetTime.getNano();
        if (second > 0 || nano > 0) {
            jsonGenerator.writeNumber(second);
            if (nano > 0) {
                if (useNanoseconds(serializerProvider)) {
                    jsonGenerator.writeNumber(nano);
                } else {
                    jsonGenerator.writeNumber(offsetTime.get(ChronoField.MILLI_OF_SECOND));
                }
            }
        }
        jsonGenerator.writeString(offsetTime.getOffset().toString());
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? JsonToken.START_ARRAY : JsonToken.VALUE_STRING;
    }

    public void serialize(OffsetTime offsetTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!useTimestamp(serializerProvider)) {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? offsetTime.toString() : offsetTime.format(dateTimeFormatter));
            return;
        }
        jsonGenerator.writeStartArray();
        _serializeAsArrayContents(offsetTime, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public void serializeWithType(OffsetTime offsetTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(offsetTime, serializationShape(serializerProvider)));
        if (writeTypePrefix.valueShape == JsonToken.START_ARRAY) {
            _serializeAsArrayContents(offsetTime, jsonGenerator, serializerProvider);
        } else {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? offsetTime.toString() : offsetTime.format(dateTimeFormatter));
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return new OffsetTimeSerializer(this, this._useTimestamp, bool2, this._formatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    public OffsetTimeSerializer withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new OffsetTimeSerializer(this, bool, dateTimeFormatter);
    }
}
