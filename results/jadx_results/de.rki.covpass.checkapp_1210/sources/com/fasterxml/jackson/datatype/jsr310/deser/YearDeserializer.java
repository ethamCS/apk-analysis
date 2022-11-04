package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.Year;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class YearDeserializer extends JSR310DateTimeDeserializerBase<Year> {
    public static final YearDeserializer INSTANCE = new YearDeserializer();

    public YearDeserializer() {
        this(null);
    }

    protected YearDeserializer(YearDeserializer yearDeserializer, Boolean bool) {
        super(yearDeserializer, bool);
    }

    public YearDeserializer(DateTimeFormatter dateTimeFormatter) {
        super(Year.class, dateTimeFormatter);
    }

    protected Year _fromNumber(DeserializationContext deserializationContext, int i10) {
        return Year.of(i10);
    }

    protected Year _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return _fromEmptyString(jsonParser, deserializationContext, trim);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.UNTYPED_SCALARS) && _isValidTimestampString(trim)) {
            return _fromNumber(deserializationContext, NumberInput.parseInt(trim));
        }
        try {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            return dateTimeFormatter == null ? Year.parse(trim) : Year.parse(trim, dateTimeFormatter);
        } catch (DateTimeException e10) {
            return (Year) _handleDateTimeException(deserializationContext, e10, trim);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Year deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.currentToken();
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (currentToken == jsonToken) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (currentToken == JsonToken.START_OBJECT) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
        }
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        return currentToken == jsonToken2 ? _fromNumber(deserializationContext, jsonParser.getIntValue()) : currentToken == JsonToken.VALUE_EMBEDDED_OBJECT ? (Year) jsonParser.getEmbeddedObject() : jsonParser.hasToken(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : (Year) _handleUnexpectedToken(deserializationContext, jsonParser, jsonToken, jsonToken2);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<Year> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return new YearDeserializer(dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<Year> withLeniency(Boolean bool) {
        return new YearDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<Year> withShape(JsonFormat.Shape shape) {
        return this;
    }
}
