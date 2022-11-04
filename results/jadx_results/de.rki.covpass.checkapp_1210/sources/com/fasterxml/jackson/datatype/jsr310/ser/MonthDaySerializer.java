package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import j$.time.MonthDay;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class MonthDaySerializer extends JSR310FormattedSerializerBase<MonthDay> {
    public static final MonthDaySerializer INSTANCE = new MonthDaySerializer();

    protected MonthDaySerializer() {
        this(null);
    }

    private MonthDaySerializer(MonthDaySerializer monthDaySerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        super(monthDaySerializer, bool, dateTimeFormatter, null);
    }

    public MonthDaySerializer(DateTimeFormatter dateTimeFormatter) {
        super(MonthDay.class, dateTimeFormatter);
    }

    protected void _serializeAsArrayContents(MonthDay monthDay, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(monthDay.getMonthValue());
        jsonGenerator.writeNumber(monthDay.getDayOfMonth());
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return _useTimestampExplicitOnly(serializerProvider) ? JsonToken.START_ARRAY : JsonToken.VALUE_STRING;
    }

    public void serialize(MonthDay monthDay, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!_useTimestampExplicitOnly(serializerProvider)) {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? monthDay.toString() : monthDay.format(dateTimeFormatter));
            return;
        }
        jsonGenerator.writeStartArray();
        _serializeAsArrayContents(monthDay, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public void serializeWithType(MonthDay monthDay, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(monthDay, serializationShape(serializerProvider)));
        if (writeTypePrefix.valueShape == JsonToken.START_ARRAY) {
            _serializeAsArrayContents(monthDay, jsonGenerator, serializerProvider);
        } else {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? monthDay.toString() : monthDay.format(dateTimeFormatter));
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    public MonthDaySerializer withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new MonthDaySerializer(this, bool, dateTimeFormatter);
    }
}
