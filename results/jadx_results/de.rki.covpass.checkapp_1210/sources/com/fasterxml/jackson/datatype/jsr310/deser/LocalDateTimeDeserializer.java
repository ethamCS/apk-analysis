package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalDateTimeDeserializer extends JSR310DateTimeDeserializerBase<LocalDateTime> {
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    public static final LocalDateTimeDeserializer INSTANCE = new LocalDateTimeDeserializer();

    protected LocalDateTimeDeserializer() {
        this(DEFAULT_FORMATTER);
    }

    protected LocalDateTimeDeserializer(LocalDateTimeDeserializer localDateTimeDeserializer, Boolean bool) {
        super(localDateTimeDeserializer, bool);
    }

    public LocalDateTimeDeserializer(DateTimeFormatter dateTimeFormatter) {
        super(LocalDateTime.class, dateTimeFormatter);
    }

    protected LocalDateTime _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        Object _handleDateTimeException;
        String trim = str.trim();
        if (trim.length() == 0) {
            _handleDateTimeException = _fromEmptyString(jsonParser, deserializationContext, trim);
        } else {
            try {
                return (this._formatter != DEFAULT_FORMATTER || trim.length() <= 10 || trim.charAt(10) != 'T' || !trim.endsWith("Z")) ? LocalDateTime.parse(trim, this._formatter) : isLenient() ? LocalDateTime.parse(trim.substring(0, trim.length() - 1), this._formatter) : (LocalDateTime) deserializationContext.handleWeirdStringValue(getValueType(deserializationContext).getRawClass(), trim, "Should not contain offset when 'strict' mode set for property or type (enable 'lenient' handling to allow)", new Object[0]);
            } catch (DateTimeException e10) {
                _handleDateTimeException = _handleDateTimeException(deserializationContext, e10, trim);
            }
        }
        return (LocalDateTime) _handleDateTimeException;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasTokenId(6)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
        }
        if (jsonParser.isExpectedStartArrayToken()) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                return null;
            }
            if ((nextToken == JsonToken.VALUE_STRING || nextToken == JsonToken.VALUE_EMBEDDED_OBJECT) && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                LocalDateTime deserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return deserialize;
            } else if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                int intValue = jsonParser.getIntValue();
                int nextIntValue = jsonParser.nextIntValue(-1);
                int nextIntValue2 = jsonParser.nextIntValue(-1);
                int nextIntValue3 = jsonParser.nextIntValue(-1);
                int nextIntValue4 = jsonParser.nextIntValue(-1);
                if (jsonParser.nextToken() == jsonToken) {
                    return LocalDateTime.of(intValue, nextIntValue, nextIntValue2, nextIntValue3, nextIntValue4);
                }
                int intValue2 = jsonParser.getIntValue();
                if (jsonParser.nextToken() == jsonToken) {
                    return LocalDateTime.of(intValue, nextIntValue, nextIntValue2, nextIntValue3, nextIntValue4, intValue2);
                }
                int intValue3 = jsonParser.getIntValue();
                if (intValue3 < 1000 && !deserializationContext.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)) {
                    intValue3 *= 1000000;
                }
                int i10 = intValue3;
                if (jsonParser.nextToken() != jsonToken) {
                    throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken, "Expected array to end");
                }
                return LocalDateTime.of(intValue, nextIntValue, nextIntValue2, nextIntValue3, nextIntValue4, intValue2, i10);
            } else {
                deserializationContext.reportInputMismatch(handledType(), "Unexpected token (%s) within Array, expected VALUE_NUMBER_INT", nextToken);
            }
        }
        if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
            return (LocalDateTime) jsonParser.getEmbeddedObject();
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            _throwNoNumericTimestampNeedTimeZone(jsonParser, deserializationContext);
        }
        return (LocalDateTime) _handleUnexpectedToken(deserializationContext, jsonParser, "Expected array or string.", new Object[0]);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalDateTime> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return new LocalDateTimeDeserializer(dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalDateTime> withLeniency(Boolean bool) {
        return new LocalDateTimeDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalDateTime> withShape(JsonFormat.Shape shape) {
        return this;
    }
}
