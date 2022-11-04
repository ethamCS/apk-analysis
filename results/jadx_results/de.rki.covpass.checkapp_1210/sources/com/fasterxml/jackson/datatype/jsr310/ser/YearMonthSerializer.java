package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class YearMonthSerializer extends JSR310FormattedSerializerBase<YearMonth> {
    public static final YearMonthSerializer INSTANCE = new YearMonthSerializer();

    protected YearMonthSerializer() {
        this(null);
    }

    private YearMonthSerializer(YearMonthSerializer yearMonthSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        super(yearMonthSerializer, bool, dateTimeFormatter, null);
    }

    public YearMonthSerializer(DateTimeFormatter dateTimeFormatter) {
        super(YearMonth.class, dateTimeFormatter);
    }

    protected void _serializeAsArrayContents(YearMonth yearMonth, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(yearMonth.getYear());
        jsonGenerator.writeNumber(yearMonth.getMonthValue());
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? JsonToken.START_ARRAY : JsonToken.VALUE_STRING;
    }

    public void serialize(YearMonth yearMonth, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!useTimestamp(serializerProvider)) {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? yearMonth.toString() : yearMonth.format(dateTimeFormatter));
            return;
        }
        jsonGenerator.writeStartArray();
        _serializeAsArrayContents(yearMonth, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public void serializeWithType(YearMonth yearMonth, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(yearMonth, serializationShape(serializerProvider)));
        if (writeTypePrefix.valueShape == JsonToken.START_ARRAY) {
            _serializeAsArrayContents(yearMonth, jsonGenerator, serializerProvider);
        } else {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? yearMonth.toString() : yearMonth.format(dateTimeFormatter));
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    public YearMonthSerializer withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new YearMonthSerializer(this, bool, dateTimeFormatter);
    }
}
