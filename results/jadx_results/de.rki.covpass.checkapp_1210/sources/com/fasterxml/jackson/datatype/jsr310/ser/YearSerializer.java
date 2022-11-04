package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import j$.time.Year;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class YearSerializer extends JSR310FormattedSerializerBase<Year> {
    public static final YearSerializer INSTANCE = new YearSerializer();

    protected YearSerializer() {
        this(null);
    }

    protected YearSerializer(YearSerializer yearSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        super(yearSerializer, bool, dateTimeFormatter, null);
    }

    public YearSerializer(DateTimeFormatter dateTimeFormatter) {
        super(Year.class, dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_STRING;
    }

    public void serialize(Year year, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (useTimestamp(serializerProvider)) {
            jsonGenerator.writeNumber(year.getValue());
            return;
        }
        DateTimeFormatter dateTimeFormatter = this._formatter;
        jsonGenerator.writeString(dateTimeFormatter == null ? year.toString() : year.format(dateTimeFormatter));
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    public YearSerializer withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new YearSerializer(this, bool, dateTimeFormatter);
    }
}
