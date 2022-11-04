package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalTimeDeserializer extends JSR310DateTimeDeserializerBase<LocalTime> {
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ISO_LOCAL_TIME;
    public static final LocalTimeDeserializer INSTANCE = new LocalTimeDeserializer();

    protected LocalTimeDeserializer() {
        this(DEFAULT_FORMATTER);
    }

    protected LocalTimeDeserializer(LocalTimeDeserializer localTimeDeserializer, Boolean bool) {
        super(localTimeDeserializer, bool);
    }

    public LocalTimeDeserializer(DateTimeFormatter dateTimeFormatter) {
        super(LocalTime.class, dateTimeFormatter);
    }

    protected LocalTime _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        Object _handleDateTimeException;
        String trim = str.trim();
        if (trim.length() == 0) {
            _handleDateTimeException = _fromEmptyString(jsonParser, deserializationContext, trim);
        } else {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            try {
                return (dateTimeFormatter != DEFAULT_FORMATTER || !trim.contains("T")) ? LocalTime.parse(trim, dateTimeFormatter) : LocalTime.parse(trim, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            } catch (DateTimeException e10) {
                _handleDateTimeException = _handleDateTimeException(deserializationContext, e10, trim);
            }
        }
        return (LocalTime) _handleDateTimeException;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LocalTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.hasToken(jsonToken)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
        }
        if (jsonParser.isExpectedStartArrayToken()) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            if (nextToken == jsonToken2) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS) && (nextToken == jsonToken || nextToken == JsonToken.VALUE_EMBEDDED_OBJECT)) {
                LocalTime deserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken2) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return deserialize;
            } else if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                int intValue = jsonParser.getIntValue();
                jsonParser.nextToken();
                int intValue2 = jsonParser.getIntValue();
                if (jsonParser.nextToken() == jsonToken2) {
                    return LocalTime.of(intValue, intValue2);
                }
                int intValue3 = jsonParser.getIntValue();
                if (jsonParser.nextToken() == jsonToken2) {
                    return LocalTime.of(intValue, intValue2, intValue3);
                }
                int intValue4 = jsonParser.getIntValue();
                if (intValue4 < 1000 && !deserializationContext.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)) {
                    intValue4 *= 1000000;
                }
                if (jsonParser.nextToken() != jsonToken2) {
                    throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken2, "Expected array to end");
                }
                return LocalTime.of(intValue, intValue2, intValue3, intValue4);
            } else {
                deserializationContext.reportInputMismatch(handledType(), "Unexpected token (%s) within Array, expected VALUE_NUMBER_INT", nextToken);
            }
        }
        if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
            return (LocalTime) jsonParser.getEmbeddedObject();
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            _throwNoNumericTimestampNeedTimeZone(jsonParser, deserializationContext);
        }
        return (LocalTime) _handleUnexpectedToken(deserializationContext, jsonParser, "Expected array or string.", new Object[0]);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalTime> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return new LocalTimeDeserializer(dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalTime> withLeniency(Boolean bool) {
        return new LocalTimeDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalTime> withShape(JsonFormat.Shape shape) {
        return this;
    }
}
