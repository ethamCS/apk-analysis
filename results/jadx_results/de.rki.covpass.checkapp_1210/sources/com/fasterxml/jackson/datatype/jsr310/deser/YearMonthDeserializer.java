package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import j$.time.DateTimeException;
import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class YearMonthDeserializer extends JSR310DateTimeDeserializerBase<YearMonth> {
    public static final YearMonthDeserializer INSTANCE = new YearMonthDeserializer();

    public YearMonthDeserializer() {
        this(DateTimeFormatter.ofPattern("uuuu-MM"));
    }

    protected YearMonthDeserializer(YearMonthDeserializer yearMonthDeserializer, Boolean bool) {
        super(yearMonthDeserializer, bool);
    }

    public YearMonthDeserializer(DateTimeFormatter dateTimeFormatter) {
        super(YearMonth.class, dateTimeFormatter);
    }

    protected YearMonth _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        Object _handleDateTimeException;
        String trim = str.trim();
        if (trim.length() == 0) {
            _handleDateTimeException = _fromEmptyString(jsonParser, deserializationContext, trim);
        } else {
            try {
                return YearMonth.parse(trim, this._formatter);
            } catch (DateTimeException e10) {
                _handleDateTimeException = _handleDateTimeException(deserializationContext, e10, trim);
            }
        }
        return (YearMonth) _handleDateTimeException;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public YearMonth deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.hasToken(jsonToken)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
        }
        if (!jsonParser.isExpectedStartArrayToken()) {
            return jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT) ? (YearMonth) jsonParser.getEmbeddedObject() : (YearMonth) _handleUnexpectedToken(deserializationContext, jsonParser, jsonToken, JsonToken.START_ARRAY);
        }
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        if (nextToken == jsonToken2) {
            return null;
        }
        if ((nextToken == jsonToken || nextToken == JsonToken.VALUE_EMBEDDED_OBJECT) && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            YearMonth deserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != jsonToken2) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return deserialize;
        }
        JsonToken jsonToken3 = JsonToken.VALUE_NUMBER_INT;
        if (nextToken != jsonToken3) {
            _reportWrongToken(deserializationContext, jsonToken3, "years");
        }
        int intValue = jsonParser.getIntValue();
        int nextIntValue = jsonParser.nextIntValue(-1);
        if (nextIntValue == -1) {
            if (!jsonParser.hasToken(jsonToken3)) {
                _reportWrongToken(deserializationContext, jsonToken3, "months");
            }
            nextIntValue = jsonParser.getIntValue();
        }
        if (jsonParser.nextToken() != jsonToken2) {
            throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken2, "Expected array to end");
        }
        return YearMonth.of(intValue, nextIntValue);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<YearMonth> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return new YearMonthDeserializer(dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<YearMonth> withLeniency(Boolean bool) {
        return new YearMonthDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<YearMonth> withShape(JsonFormat.Shape shape) {
        return this;
    }
}
